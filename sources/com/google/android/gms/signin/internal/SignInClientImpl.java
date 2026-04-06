package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.zae;

public class SignInClientImpl extends GmsClient<zaf> implements zae {
    public static final /* synthetic */ int M = 0;
    public final boolean I = true;
    public final ClientSettings J;
    public final Bundle K;
    public final Integer L;

    public SignInClientImpl(Context context, Looper looper, boolean z2, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.J = clientSettings;
        this.K = bundle;
        this.L = clientSettings.h();
    }

    public static Bundle q0(ClientSettings clientSettings) {
        clientSettings.g();
        Integer h2 = clientSettings.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.a());
        if (h2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", h2.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    public final Bundle F() {
        if (!D().getPackageName().equals(this.J.e())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.e());
        }
        return this.K;
    }

    public final String J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String K() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void b() {
        try {
            ((zaf) I()).W2(((Integer) Preconditions.m(this.L)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void n(zae zae) {
        Preconditions.n(zae, "Expecting a valid ISignInCallbacks");
        try {
            Account c2 = this.J.c();
            ((zaf) I()).Y2(new zai(1, new zat(c2, ((Integer) Preconditions.m(this.L)).intValue(), "<<default account>>".equals(c2.name) ? Storage.a(D()).b() : null)), zae);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zae.E0(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    public final int o() {
        return GooglePlayServicesUtilLight.f24398a;
    }

    public final void q(IAccountAccessor iAccountAccessor, boolean z2) {
        try {
            ((zaf) I()).X2(iAccountAccessor, ((Integer) Preconditions.m(this.L)).intValue(), z2);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final boolean t() {
        return this.I;
    }

    public final void u() {
        i(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    public final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder);
    }
}
