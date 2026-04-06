package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class zaaw implements zabf {

    /* renamed from: a  reason: collision with root package name */
    public final zabi f24577a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f24578b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f24579c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleApiAvailabilityLight f24580d;

    /* renamed from: e  reason: collision with root package name */
    public ConnectionResult f24581e;

    /* renamed from: f  reason: collision with root package name */
    public int f24582f;

    /* renamed from: g  reason: collision with root package name */
    public int f24583g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f24584h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f24585i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    public final Set f24586j = new HashSet();

    /* renamed from: k  reason: collision with root package name */
    public zae f24587k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24588l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f24589m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f24590n;

    /* renamed from: o  reason: collision with root package name */
    public IAccountAccessor f24591o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f24592p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f24593q;

    /* renamed from: r  reason: collision with root package name */
    public final ClientSettings f24594r;

    /* renamed from: s  reason: collision with root package name */
    public final Map f24595s;

    /* renamed from: t  reason: collision with root package name */
    public final Api.AbstractClientBuilder f24596t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f24597u = new ArrayList();

    public zaaw(zabi zabi, ClientSettings clientSettings, Map map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder abstractClientBuilder, Lock lock, Context context) {
        this.f24577a = zabi;
        this.f24594r = clientSettings;
        this.f24595s = map;
        this.f24580d = googleApiAvailabilityLight;
        this.f24596t = abstractClientBuilder;
        this.f24578b = lock;
        this.f24579c = context;
    }

    public static /* bridge */ /* synthetic */ void A(zaaw zaaw, zak zak) {
        if (zaaw.n(0)) {
            ConnectionResult H = zak.H();
            if (H.f0()) {
                zav zav = (zav) Preconditions.m(zak.Q());
                ConnectionResult H2 = zav.H();
                if (!H2.f0()) {
                    String valueOf = String.valueOf(H2);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    zaaw.k(H2);
                    return;
                }
                zaaw.f24590n = true;
                zaaw.f24591o = (IAccountAccessor) Preconditions.m(zav.Q());
                zaaw.f24592p = zav.S();
                zaaw.f24593q = zav.X();
                zaaw.m();
            } else if (zaaw.p(H)) {
                zaaw.h();
                zaaw.m();
            } else {
                zaaw.k(H);
            }
        }
    }

    public static final String q(int i2) {
        return i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set x(zaaw zaaw) {
        ClientSettings clientSettings = zaaw.f24594r;
        if (clientSettings == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(clientSettings.f());
        Map j2 = zaaw.f24594r.j();
        for (Api api : j2.keySet()) {
            zabi zabi = zaaw.f24577a;
            if (!zabi.f24641r.containsKey(api.b())) {
                hashSet.addAll(((zab) j2.get(api)).f24926a);
            }
        }
        return hashSet;
    }

    public final void I() {
        ArrayList arrayList = this.f24597u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        this.f24597u.clear();
    }

    public final void a(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f24585i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    public final void b() {
    }

    public final void c(ConnectionResult connectionResult, Api api, boolean z2) {
        if (n(1)) {
            l(connectionResult, api, z2);
            if (o()) {
                j();
            }
        }
    }

    public final void d(int i2) {
        k(new ConnectionResult(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    public final void e() {
        this.f24577a.f24641r.clear();
        this.f24589m = false;
        this.f24581e = null;
        this.f24583g = 0;
        this.f24588l = true;
        this.f24590n = false;
        this.f24592p = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (Api api : this.f24595s.keySet()) {
            Api.Client client = (Api.Client) Preconditions.m((Api.Client) this.f24577a.f24640q.get(api.b()));
            z2 |= api.c().a() == 1;
            boolean booleanValue = ((Boolean) this.f24595s.get(api)).booleanValue();
            if (client.t()) {
                this.f24589m = true;
                if (booleanValue) {
                    this.f24586j.add(api.b());
                } else {
                    this.f24588l = false;
                }
            }
            hashMap.put(client, new zaal(this, api, booleanValue));
        }
        if (z2) {
            this.f24589m = false;
        }
        if (this.f24589m) {
            Preconditions.m(this.f24594r);
            Preconditions.m(this.f24596t);
            this.f24594r.k(Integer.valueOf(System.identityHashCode(this.f24577a.f24648y)));
            zaat zaat = new zaat(this, (zaas) null);
            Api.AbstractClientBuilder abstractClientBuilder = this.f24596t;
            Context context = this.f24579c;
            zabi zabi = this.f24577a;
            ClientSettings clientSettings = this.f24594r;
            this.f24587k = abstractClientBuilder.b(context, zabi.f24648y.h(), clientSettings, clientSettings.g(), zaat, zaat);
        }
        this.f24584h = this.f24577a.f24640q.size();
        this.f24597u.add(zabj.a().submit(new zaao(this, hashMap)));
    }

    public final boolean f() {
        I();
        i(true);
        this.f24577a.k((ConnectionResult) null);
        return true;
    }

    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void h() {
        this.f24589m = false;
        this.f24577a.f24648y.f24624p = Collections.emptySet();
        for (Api.AnyClientKey anyClientKey : this.f24586j) {
            if (!this.f24577a.f24641r.containsKey(anyClientKey)) {
                zabi zabi = this.f24577a;
                zabi.f24641r.put(anyClientKey, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    public final void i(boolean z2) {
        zae zae = this.f24587k;
        if (zae != null) {
            if (zae.a() && z2) {
                zae.b();
            }
            zae.j();
            ClientSettings clientSettings = (ClientSettings) Preconditions.m(this.f24594r);
            this.f24591o = null;
        }
    }

    public final void j() {
        this.f24577a.i();
        zabj.a().execute(new zaak(this));
        zae zae = this.f24587k;
        if (zae != null) {
            if (this.f24592p) {
                zae.q((IAccountAccessor) Preconditions.m(this.f24591o), this.f24593q);
            }
            i(false);
        }
        for (Api.AnyClientKey anyClientKey : this.f24577a.f24641r.keySet()) {
            ((Api.Client) Preconditions.m((Api.Client) this.f24577a.f24640q.get(anyClientKey))).j();
        }
        this.f24577a.f24649z.a(this.f24585i.isEmpty() ? null : this.f24585i);
    }

    public final void k(ConnectionResult connectionResult) {
        I();
        i(!connectionResult.X());
        this.f24577a.k(connectionResult);
        this.f24577a.f24649z.c(connectionResult);
    }

    public final void l(ConnectionResult connectionResult, Api api, boolean z2) {
        int a2 = api.c().a();
        if ((!z2 || connectionResult.X() || this.f24580d.c(connectionResult.H()) != null) && (this.f24581e == null || a2 < this.f24582f)) {
            this.f24581e = connectionResult;
            this.f24582f = a2;
        }
        zabi zabi = this.f24577a;
        zabi.f24641r.put(api.b(), connectionResult);
    }

    public final void m() {
        if (this.f24584h == 0) {
            if (!this.f24589m || this.f24590n) {
                ArrayList arrayList = new ArrayList();
                this.f24583g = 1;
                this.f24584h = this.f24577a.f24640q.size();
                for (Api.AnyClientKey anyClientKey : this.f24577a.f24640q.keySet()) {
                    if (!this.f24577a.f24641r.containsKey(anyClientKey)) {
                        arrayList.add((Api.Client) this.f24577a.f24640q.get(anyClientKey));
                    } else if (o()) {
                        j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f24597u.add(zabj.a().submit(new zaap(this, arrayList)));
                }
            }
        }
    }

    public final boolean n(int i2) {
        if (this.f24583g == i2) {
            return true;
        }
        Log.w("GACConnecting", this.f24577a.f24648y.o());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i3 = this.f24584h;
        Log.w("GACConnecting", "mRemainingConnections=" + i3);
        String q2 = q(this.f24583g);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + q2 + " but received callback for step " + q(i2), new Exception());
        k(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    public final boolean o() {
        int i2 = this.f24584h - 1;
        this.f24584h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GACConnecting", this.f24577a.f24648y.o());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            k(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f24581e;
        if (connectionResult == null) {
            return true;
        }
        this.f24577a.f24647x = this.f24582f;
        k(connectionResult);
        return false;
    }

    public final boolean p(ConnectionResult connectionResult) {
        return this.f24588l && !connectionResult.X();
    }
}
