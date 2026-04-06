package com.pairip.licensecheck;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.pairip.licensecheck.ILicenseV2ResultListener;
import com.pairip.licensecheck.LicenseActivity;
import java.util.Objects;

public class LicenseClient implements ServiceConnection {
    private static final int ERROR_INVALID_PACKAGE_NAME = 3;
    private static final int FLAG_RPC_CALL = 0;
    private static final int LICENSED = 0;
    private static final int MAX_RETRIES = 3;
    private static final int MILLIS_PER_SEC = 1000;
    private static final int NOT_LICENSED = 2;
    private static final String PAYLOAD_PAYWALL = "PAYWALL_INTENT";
    private static final int RETRY_DELAY_MILLIS = 1000;
    private static final String SERVICE_INTERFACE_CLASS_NAME = "com.android.vending.licensing.ILicensingService";
    private static final String SERVICE_PACKAGE = "com.android.vending";
    private static final String TAG = "LicenseClient";
    private static final int TRANSACTION_CHECK_LICENSE_V2 = 2;
    private static final int TRANSACTION_REPORT_SUCCESSFUL_LICENSE_CHECK = 3;
    protected static ImmediateTaskExecutor backgroundRunner = new LicenseClient$$ExternalSyntheticLambda2();
    protected static Runnable exitAction = new Runnable() {
        public void run() {
            System.exit(0);
        }
    };
    private static final Handler handler;
    /* access modifiers changed from: protected */
    public static LicenseCheckState licenseCheckState = LicenseCheckState.CHECK_REQUIRED;
    protected static String licensePubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqajuLZ3L3cKOA8Enmj1oKbr6k3Gx6/hbmO8f7buq3t8w6iIszZgS9frjnL5weyIlYQSurWKtixUkWVdTO0Vo81SG9f3V6cordGBKv58vKt+qO4U56MIzzSh4skVOsmvmWklW900lneXJossQvAthmJkyunhcyK1ni+AiHy2W3nEwfBIhxwfixhh+C/xqeNQhUkVmPhQxDY9GwYP3ipQ3Z6ymHLyZN3dUYHjD55bPfgUAwaBxEu/Meh7nLuYrW4t0P5L7oYb9A/GzHG6rXNt4Ija1fbpe4bqGfAofaEo/8BDDpXSHUQLkb68gDqZcOMAwfHYws04nsHr8P5o4Co0zbwIDAQAB";
    protected static boolean localCheckEnabled = true;
    protected static ImmediateTaskExecutor mainThreadRunner = null;
    protected static String packageName = "com.octa.init";
    private static Bundle responsePayload;
    private final Context context;
    private final DelayedTaskExecutor delayedTaskExecutor = new DelayedTaskExecutor();
    private int retryNum = 0;

    public interface ImmediateTaskExecutor {
        void run(Runnable runnable);
    }

    public enum LicenseCheckState {
        CHECK_REQUIRED,
        FULL_CHECK_OK,
        LOCAL_CHECK_OK,
        LOCAL_CHECK_REPORTED
    }

    static {
        Handler handler2 = new Handler(Looper.getMainLooper());
        handler = handler2;
        Objects.requireNonNull(handler2);
        mainThreadRunner = new LicenseClient$$ExternalSyntheticLambda3(handler2);
    }

    public LicenseClient(Context context2) {
        this.context = context2;
    }

    public static String getLicensePubKey() {
        return licensePubKey;
    }

    public void initializeLicenseCheck() {
        int ordinal = licenseCheckState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                try {
                    ResponseValidator.validateResponse(responsePayload, packageName);
                } catch (LicenseCheckException e2) {
                    handleError(e2);
                }
            }
        } else if (localCheckEnabled) {
            backgroundRunner.run(new LicenseClient$$ExternalSyntheticLambda4(this));
        } else {
            connectToLicensingService();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$0() {
        mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda1(this, performLocalInstallerCheck()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLicenseCheck$1(boolean z2) {
        if (z2) {
            licenseCheckState = LicenseCheckState.LOCAL_CHECK_OK;
        }
        connectToLicensingService();
    }

    private boolean performLocalInstallerCheck() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                Log.i(TAG, "Local install check bypassed due to old SDK version.");
                return false;
            }
            PackageManager packageManager = this.context.getPackageManager();
            if (packageManager == null) {
                Log.i(TAG, "Local install check bypassed due to package manager not found.");
                return false;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                if (packageInfo.applicationInfo != null) {
                    int i2 = packageInfo.applicationInfo.flags;
                    if ((i2 & 1) == 0) {
                        if ((i2 & 128) == 0) {
                            InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                            if (installSourceInfo == null) {
                                Log.i(TAG, "Local install check bypassed due to install source info not found.");
                                return false;
                            }
                            String installingPackageName = installSourceInfo.getInstallingPackageName();
                            if (installingPackageName != null) {
                                if (installingPackageName.equals(SERVICE_PACKAGE)) {
                                    return true;
                                }
                            }
                            Log.i(TAG, "Local install check failed due to wrong installer.");
                            return false;
                        }
                    }
                    Log.i(TAG, "Local install check passed due to system app.");
                    return true;
                }
            }
            Log.i(TAG, "Local install check bypassed due to app package info not found.");
            return false;
        } catch (Exception e2) {
            Log.w(TAG, "Could not obtain package info for local installer check.", e2);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void connectToLicensingService() {
        Log.d(TAG, "Connecting to the licensing service...");
        try {
            if (!this.context.bindService(new Intent(SERVICE_INTERFACE_CLASS_NAME).setPackage(SERVICE_PACKAGE).setAction(SERVICE_INTERFACE_CLASS_NAME), this, 1)) {
                retryOrThrow(new LicenseCheckException("Could not bind with the licensing service."));
            }
        } catch (SecurityException e2) {
            retryOrThrow(new LicenseCheckException("Not allowed to bind with the licensing service.", e2));
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d(TAG, "Connected to the licensing service.");
        int ordinal = licenseCheckState.ordinal();
        if (ordinal == 0) {
            backgroundRunner.run(new LicenseClient$$ExternalSyntheticLambda5(this, iBinder));
        } else if (ordinal == 2) {
            backgroundRunner.run(new LicenseClient$$ExternalSyntheticLambda6(this, iBinder));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(IBinder iBinder) {
        try {
            checkLicenseInternal(iBinder);
        } catch (LicenseCheckException e2) {
            handleError(e2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$1(IBinder iBinder) {
        try {
            reportSuccessfulLicenseCheck(iBinder);
        } catch (Exception e2) {
            String stackTraceString = Log.getStackTraceString(e2);
            Log.e(TAG, "Error while reporting license check: " + stackTraceString);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.w(TAG, "Unexpectedly disconnected from the licensing service.");
        retryOrThrow(new LicenseCheckException("Licensing service unexpectedly disconnected."));
    }

    private void checkLicenseInternal(IBinder iBinder) throws LicenseCheckException {
        Parcel obtain;
        Parcel obtain2;
        if (iBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."));
            return;
        }
        Log.d(TAG, "Sending request to licensing service...");
        obtain = Parcel.obtain();
        obtain2 = Parcel.obtain();
        try {
            populateInputDataForLicenseCheckV2(obtain, iBinder);
            if (!iBinder.transact(2, obtain, obtain2, 0)) {
                handleError(new LicenseCheckException("Licensing service could not process request."));
            }
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
            return;
        } catch (DeadObjectException e2) {
            retryOrThrow(new LicenseCheckException("Licensing service process died.", e2));
        } catch (RemoteException e3) {
            handleError(new LicenseCheckException("Error when calling licensing service.", e3));
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing service sent.");
            throw th;
        }
        obtain.recycle();
        obtain2.recycle();
        Log.d(TAG, "Request to licensing service sent.");
    }

    public void reportSuccessfulLicenseCheck(IBinder iBinder) throws LicenseCheckException {
        Parcel obtain;
        Parcel obtain2;
        if (iBinder == null) {
            retryOrThrow(new LicenseCheckException("Received a null binder."), true);
            return;
        }
        Log.d(TAG, "Sending request to license reporting service...");
        obtain = Parcel.obtain();
        obtain2 = Parcel.obtain();
        try {
            populateInputDataForReportAutoVerifiedLicense(obtain, iBinder);
            boolean transact = iBinder.transact(3, obtain, obtain2, 0);
            if (!transact) {
                Log.e(TAG, "Error sending request to license reporting service.");
            }
            if (transact) {
                mainThreadRunner.run(new LicenseClient$$ExternalSyntheticLambda7());
            }
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing reporting service sent.");
            return;
        } catch (DeadObjectException e2) {
            retryOrThrow(new LicenseCheckException("Licensing service process died.", e2), true);
        } catch (RemoteException e3) {
            String valueOf = String.valueOf(e3);
            Log.e(TAG, "Error when calling licensing service." + valueOf);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            Log.d(TAG, "Request to licensing reporting service sent.");
            throw th;
        }
        obtain.recycle();
        obtain2.recycle();
        Log.d(TAG, "Request to licensing reporting service sent.");
    }

    private void populateInputDataForLicenseCheckV2(Parcel parcel, IBinder iBinder) throws RemoteException {
        parcel.writeInterfaceToken(iBinder.getInterfaceDescriptor());
        parcel.writeString(packageName);
        parcel.writeStrongBinder(createResultListener(this).asBinder());
        parcel.writeInt(0);
    }

    private void populateInputDataForReportAutoVerifiedLicense(Parcel parcel, IBinder iBinder) throws RemoteException {
        parcel.writeInterfaceToken(iBinder.getInterfaceDescriptor());
        parcel.writeString(packageName);
        parcel.writeInt(0);
    }

    private static ILicenseV2ResultListener createResultListener(LicenseClient licenseClient) {
        return new ILicenseV2ResultListener.Stub() {
            public void verifyLicense(int i2, Bundle bundle) {
                LicenseClient.this.processResponse(i2, bundle);
            }
        };
    }

    private void retryOrThrow(LicenseCheckException licenseCheckException) {
        retryOrThrow(licenseCheckException, false);
    }

    private void retryOrThrow(LicenseCheckException licenseCheckException, boolean z2) {
        int i2 = this.retryNum;
        if (i2 < 3) {
            this.retryNum = i2 + 1;
            this.delayedTaskExecutor.schedule(new LicenseClient$$ExternalSyntheticLambda0(this), 1000);
            Log.d(TAG, String.format("Retry #%d. License check failed with error '%s'. Next try in %ds...", new Object[]{Integer.valueOf(this.retryNum), licenseCheckException == null ? "null" : licenseCheckException.getMessage(), 1L}));
        } else if (z2) {
            String valueOf = String.valueOf(licenseCheckException);
            Log.e(TAG, "Retry limit reached for: " + valueOf);
        } else {
            handleError(licenseCheckException);
        }
    }

    /* access modifiers changed from: private */
    public void processResponse(int i2, Bundle bundle) {
        if (i2 == 3) {
            throw new LicenseCheckException("Request package name invalid.");
        } else if (i2 == 0) {
            try {
                ResponseValidator.validateResponse(bundle, packageName);
                Log.i(TAG, "License check succeeded.");
                licenseCheckState = LicenseCheckState.FULL_CHECK_OK;
                responsePayload = bundle;
            } catch (LicenseCheckException e2) {
                handleError(e2);
            }
        } else if (i2 == 2) {
            startPaywallActivity((PendingIntent) bundle.getParcelable(PAYLOAD_PAYWALL));
        } else {
            throw new LicenseCheckException(String.format("Unexpected response code %d received.", new Object[]{Integer.valueOf(i2)}));
        }
    }

    private void handleError(LicenseCheckException licenseCheckException) {
        String stackTraceString = Log.getStackTraceString(licenseCheckException);
        Log.e(TAG, "Error while checking license: " + stackTraceString);
        if (!licenseCheckState.equals(LicenseCheckState.FULL_CHECK_OK)) {
            startErrorDialogActivity();
        }
    }

    private void startPaywallActivity(PendingIntent pendingIntent) {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.PAYWALL_INTENT_ARG_NAME, pendingIntent);
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.PAYWALL);
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private void startErrorDialogActivity() {
        Intent createCloseAppIntentOrExitIfAppInBackground = createCloseAppIntentOrExitIfAppInBackground();
        createCloseAppIntentOrExitIfAppInBackground.putExtra(LicenseActivity.ACTIVITY_TYPE_ARG_NAME, LicenseActivity.ActivityType.ERROR_DIALOG);
        this.context.startActivity(createCloseAppIntentOrExitIfAppInBackground);
    }

    private Intent createCloseAppIntentOrExitIfAppInBackground() {
        if (!isForeground()) {
            exitAction.run();
        }
        Intent intent = new Intent(this.context, LicenseActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        return intent;
    }

    private boolean isForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance <= 100;
    }

    private static final class DelayedTaskExecutor {
        private final Handler handler;

        private DelayedTaskExecutor() {
            this.handler = new Handler(Looper.getMainLooper());
        }

        public void schedule(Runnable runnable, long j2) {
            this.handler.postDelayed(runnable, j2);
        }
    }
}
