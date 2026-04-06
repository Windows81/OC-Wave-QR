package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* renamed from: d  reason: collision with root package name */
    public static final int f24388d = GoogleApiAvailabilityLight.f24392a;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f24389e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final GoogleApiAvailability f24390f = new GoogleApiAvailability();

    /* renamed from: c  reason: collision with root package name */
    public String f24391c;

    public static GoogleApiAvailability q() {
        return f24390f;
    }

    public final boolean A(Context context, ConnectionResult connectionResult, int i2) {
        PendingIntent p2;
        if (InstantApps.a(context) || (p2 = p(context, connectionResult)) == null) {
            return false;
        }
        x(context, connectionResult.H(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, p2, i2, true), zap.f25271a | 134217728));
        return true;
    }

    public Intent d(Context context, int i2, String str) {
        return super.d(context, i2, str);
    }

    public PendingIntent e(Context context, int i2, int i3) {
        return super.e(context, i2, i3);
    }

    public final String g(int i2) {
        return super.g(i2);
    }

    public int i(Context context) {
        return super.i(context);
    }

    public int j(Context context, int i2) {
        return super.j(context, i2);
    }

    public final boolean m(int i2) {
        return super.m(i2);
    }

    public Dialog o(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return t(activity, i2, zag.b(activity, d(activity, i2, "d"), i3), onCancelListener, (DialogInterface.OnClickListener) null);
    }

    public PendingIntent p(Context context, ConnectionResult connectionResult) {
        return connectionResult.X() ? connectionResult.S() : e(context, connectionResult.H(), 0);
    }

    public boolean r(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o2 = o(activity, i2, i3, onCancelListener);
        if (o2 == null) {
            return false;
        }
        w(activity, o2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void s(Context context, int i2) {
        x(context, i2, (String) null, f(context, i2, 0, "n"));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.DialogInterface$OnClickListener] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog t(android.content.Context r6, int r7, com.google.android.gms.common.internal.zag r8, android.content.DialogInterface.OnCancelListener r9, android.content.DialogInterface.OnClickListener r10) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r3 = 16843529(0x1010309, float:2.3695736E-38)
            r4 = 1
            r2.resolveAttribute(r3, r1, r4)
            android.content.res.Resources r2 = r6.getResources()
            int r1 = r1.resourceId
            java.lang.String r1 = r2.getResourceEntryName(r1)
            java.lang.String r2 = "Theme.Dialog.Alert"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002c
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r1 = 5
            r0.<init>(r6, r1)
        L_0x002c:
            if (r0 != 0) goto L_0x0033
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
        L_0x0033:
            java.lang.String r1 = com.google.android.gms.common.internal.zac.c(r6, r7)
            r0.setMessage(r1)
            if (r9 == 0) goto L_0x003f
            r0.setOnCancelListener(r9)
        L_0x003f:
            java.lang.String r9 = com.google.android.gms.common.internal.zac.b(r6, r7)
            if (r9 == 0) goto L_0x004b
            if (r8 != 0) goto L_0x0048
            r8 = r10
        L_0x0048:
            r0.setPositiveButton(r9, r8)
        L_0x004b:
            java.lang.String r6 = com.google.android.gms.common.internal.zac.f(r6, r7)
            if (r6 == 0) goto L_0x0054
            r0.setTitle(r6)
        L_0x0054:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "Creating dialog for Google Play services availability issue. ConnectionResult=%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            java.lang.String r8 = "GoogleApiAvailability"
            android.util.Log.w(r8, r6, r7)
            android.app.AlertDialog r6 = r0.create()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.t(android.content.Context, int, com.google.android.gms.common.internal.zag, android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnClickListener):android.app.Dialog");
    }

    public final Dialog u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zac.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final zabx v(Context context, zabw zabw) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabx = new zabx(zabw);
        zao.n(context, zabx, intentFilter);
        zabx.a(context);
        if (l(context, "com.google.android.gms")) {
            return zabx;
        }
        zabw.a();
        zabx.b();
        return null;
    }

    public final void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.k2(dialog, onCancelListener).j2(((FragmentActivity) activity).f0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void x(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i2), null}), new IllegalArgumentException());
        if (i2 == 18) {
            y(context);
        } else if (pendingIntent != null) {
            String e2 = zac.e(context, i2);
            String d2 = zac.d(context, i2);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.m(context.getSystemService("notification"));
            NotificationCompat.Builder n2 = new NotificationCompat.Builder(context).k(true).e(true).i(e2).n(new NotificationCompat.BigTextStyle().h(d2));
            if (DeviceProperties.c(context)) {
                Preconditions.q(PlatformVersion.e());
                n2.m(context.getApplicationInfo().icon).l(2);
                if (DeviceProperties.d(context)) {
                    n2.a(R.drawable.f24350a, resources.getString(R.string.f24369o), pendingIntent);
                } else {
                    n2.g(pendingIntent);
                }
            } else {
                n2.m(17301642).o(resources.getString(R.string.f24362h)).p(System.currentTimeMillis()).g(pendingIntent).h(d2);
            }
            if (PlatformVersion.h()) {
                Preconditions.q(PlatformVersion.h());
                synchronized (f24389e) {
                    str2 = this.f24391c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String string = context.getResources().getString(R.string.f24361g);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, string, 4));
                    } else if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                n2.f(str2);
            }
            Notification b2 = n2.b();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                GooglePlayServicesUtilLight.f24399b.set(false);
                i3 = 10436;
            } else {
                i3 = 39789;
            }
            notificationManager.notify(i3, b2);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final void y(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean z(Activity activity, LifecycleFragment lifecycleFragment, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog t2 = t(activity, i2, zag.c(lifecycleFragment, d(activity, i2, "d"), 2), onCancelListener, (DialogInterface.OnClickListener) null);
        if (t2 == null) {
            return false;
        }
        w(activity, t2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
