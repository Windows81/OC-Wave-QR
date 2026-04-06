package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.util.Set;

public final class zact extends zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: s  reason: collision with root package name */
    public static final Api.AbstractClientBuilder f24710s = zad.f27158c;

    /* renamed from: l  reason: collision with root package name */
    public final Context f24711l;

    /* renamed from: m  reason: collision with root package name */
    public final Handler f24712m;

    /* renamed from: n  reason: collision with root package name */
    public final Api.AbstractClientBuilder f24713n;

    /* renamed from: o  reason: collision with root package name */
    public final Set f24714o;

    /* renamed from: p  reason: collision with root package name */
    public final ClientSettings f24715p;

    /* renamed from: q  reason: collision with root package name */
    public zae f24716q;

    /* renamed from: r  reason: collision with root package name */
    public zacs f24717r;

    public zact(Context context, Handler handler, ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = f24710s;
        this.f24711l = context;
        this.f24712m = handler;
        this.f24715p = (ClientSettings) Preconditions.n(clientSettings, "ClientSettings must not be null");
        this.f24714o = clientSettings.f();
        this.f24713n = abstractClientBuilder;
    }

    public static /* bridge */ /* synthetic */ void Y2(zact zact, zak zak) {
        ConnectionResult H = zak.H();
        if (H.f0()) {
            zav zav = (zav) Preconditions.m(zak.Q());
            ConnectionResult H2 = zav.H();
            if (!H2.f0()) {
                String valueOf = String.valueOf(H2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                zact.f24717r.b(H2);
                zact.f24716q.j();
                return;
            }
            zact.f24717r.c(zav.Q(), zact.f24714o);
        } else {
            zact.f24717r.b(H);
        }
        zact.f24716q.j();
    }

    public final void E0(zak zak) {
        this.f24712m.post(new zacr(this, zak));
    }

    public final void J(int i2) {
        this.f24717r.d(i2);
    }

    public final void N(ConnectionResult connectionResult) {
        this.f24717r.b(connectionResult);
    }

    public final void P(Bundle bundle) {
        this.f24716q.n(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    public final void Z2(zacs zacs) {
        zae zae = this.f24716q;
        if (zae != null) {
            zae.j();
        }
        this.f24715p.k(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.f24713n;
        Context context = this.f24711l;
        Handler handler = this.f24712m;
        ClientSettings clientSettings = this.f24715p;
        this.f24716q = abstractClientBuilder.b(context, handler.getLooper(), clientSettings, clientSettings.g(), this, this);
        this.f24717r = zacs;
        Set set = this.f24714o;
        if (set == null || set.isEmpty()) {
            this.f24712m.post(new zacq(this));
        } else {
            this.f24716q.u();
        }
    }

    public final void a3() {
        zae zae = this.f24716q;
        if (zae != null) {
            zae.j();
        }
    }
}
