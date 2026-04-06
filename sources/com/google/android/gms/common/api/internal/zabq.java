package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zap;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class zabq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* renamed from: l  reason: collision with root package name */
    public final Queue f24658l = new LinkedList();

    /* renamed from: m  reason: collision with root package name */
    public final Api.Client f24659m;

    /* renamed from: n  reason: collision with root package name */
    public final ApiKey f24660n;

    /* renamed from: o  reason: collision with root package name */
    public final zaad f24661o;

    /* renamed from: p  reason: collision with root package name */
    public final Set f24662p = new HashSet();

    /* renamed from: q  reason: collision with root package name */
    public final Map f24663q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    public final int f24664r;

    /* renamed from: s  reason: collision with root package name */
    public final zact f24665s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f24666t;

    /* renamed from: u  reason: collision with root package name */
    public final List f24667u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public ConnectionResult f24668v = null;

    /* renamed from: w  reason: collision with root package name */
    public int f24669w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f24670x;

    public zabq(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        this.f24670x = googleApiManager;
        Api.Client o2 = googleApi.o(googleApiManager.f24497n.getLooper(), this);
        this.f24659m = o2;
        this.f24660n = googleApi.k();
        this.f24661o = new zaad();
        this.f24664r = googleApi.n();
        if (o2.t()) {
            this.f24665s = googleApi.p(googleApiManager.f24488e, googleApiManager.f24497n);
        } else {
            this.f24665s = null;
        }
    }

    public static /* bridge */ /* synthetic */ void A(zabq zabq, zabs zabs) {
        Feature[] g2;
        if (zabq.f24667u.remove(zabs)) {
            zabq.f24670x.f24497n.removeMessages(15, zabs);
            zabq.f24670x.f24497n.removeMessages(16, zabs);
            Feature a2 = zabs.f24672b;
            ArrayList arrayList = new ArrayList(zabq.f24658l.size());
            for (zai zai : zabq.f24658l) {
                if ((zai instanceof zac) && (g2 = ((zac) zai).g(zabq)) != null && ArrayUtils.b(g2, a2)) {
                    arrayList.add(zai);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zai zai2 = (zai) arrayList.get(i2);
                zabq.f24658l.remove(zai2);
                zai2.b(new UnsupportedApiCallException(a2));
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(zabq zabq, zabs zabs) {
        if (!zabq.f24667u.contains(zabs) || zabq.f24666t) {
            return;
        }
        if (!zabq.f24659m.a()) {
            zabq.C();
        } else {
            zabq.g();
        }
    }

    public final void B() {
        Preconditions.d(this.f24670x.f24497n);
        this.f24668v = null;
    }

    public final void C() {
        Preconditions.d(this.f24670x.f24497n);
        if (!this.f24659m.a() && !this.f24659m.g()) {
            try {
                GoogleApiManager googleApiManager = this.f24670x;
                int b2 = googleApiManager.f24490g.b(googleApiManager.f24488e, this.f24659m);
                if (b2 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b2, (PendingIntent) null);
                    String name = this.f24659m.getClass().getName();
                    String obj = connectionResult.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    F(connectionResult, (Exception) null);
                    return;
                }
                GoogleApiManager googleApiManager2 = this.f24670x;
                Api.Client client = this.f24659m;
                zabu zabu = new zabu(googleApiManager2, client, this.f24660n);
                if (client.t()) {
                    ((zact) Preconditions.m(this.f24665s)).Z2(zabu);
                }
                try {
                    this.f24659m.i(zabu);
                } catch (SecurityException e2) {
                    F(new ConnectionResult(10), e2);
                }
            } catch (IllegalStateException e3) {
                F(new ConnectionResult(10), e3);
            }
        }
    }

    public final void D(zai zai) {
        Preconditions.d(this.f24670x.f24497n);
        if (!this.f24659m.a()) {
            this.f24658l.add(zai);
            ConnectionResult connectionResult = this.f24668v;
            if (connectionResult == null || !connectionResult.X()) {
                C();
            } else {
                F(this.f24668v, (Exception) null);
            }
        } else if (m(zai)) {
            j();
        } else {
            this.f24658l.add(zai);
        }
    }

    public final void E() {
        this.f24669w++;
    }

    public final void F(ConnectionResult connectionResult, Exception exc) {
        Preconditions.d(this.f24670x.f24497n);
        zact zact = this.f24665s;
        if (zact != null) {
            zact.a3();
        }
        B();
        this.f24670x.f24490g.c();
        d(connectionResult);
        if ((this.f24659m instanceof zap) && connectionResult.H() != 24) {
            this.f24670x.f24485b = true;
            GoogleApiManager googleApiManager = this.f24670x;
            googleApiManager.f24497n.sendMessageDelayed(googleApiManager.f24497n.obtainMessage(19), 300000);
        }
        if (connectionResult.H() == 4) {
            e(GoogleApiManager.f24481q);
        } else if (this.f24658l.isEmpty()) {
            this.f24668v = connectionResult;
        } else if (exc != null) {
            Preconditions.d(this.f24670x.f24497n);
            f((Status) null, exc, false);
        } else if (this.f24670x.f24498o) {
            f(GoogleApiManager.f(this.f24660n, connectionResult), (Exception) null, true);
            if (!this.f24658l.isEmpty() && !n(connectionResult) && !this.f24670x.e(connectionResult, this.f24664r)) {
                if (connectionResult.H() == 18) {
                    this.f24666t = true;
                }
                if (this.f24666t) {
                    GoogleApiManager googleApiManager2 = this.f24670x;
                    googleApiManager2.f24497n.sendMessageDelayed(Message.obtain(googleApiManager2.f24497n, 9, this.f24660n), 5000);
                    return;
                }
                e(GoogleApiManager.f(this.f24660n, connectionResult));
            }
        } else {
            e(GoogleApiManager.f(this.f24660n, connectionResult));
        }
    }

    public final void G(ConnectionResult connectionResult) {
        Preconditions.d(this.f24670x.f24497n);
        Api.Client client = this.f24659m;
        String name = client.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        client.f("onSignInFailed for " + name + " with " + valueOf);
        F(connectionResult, (Exception) null);
    }

    public final void H(zal zal) {
        Preconditions.d(this.f24670x.f24497n);
        this.f24662p.add(zal);
    }

    public final void I() {
        Preconditions.d(this.f24670x.f24497n);
        if (this.f24666t) {
            C();
        }
    }

    public final void J(int i2) {
        if (Looper.myLooper() == this.f24670x.f24497n.getLooper()) {
            i(i2);
        } else {
            this.f24670x.f24497n.post(new zabn(this, i2));
        }
    }

    public final void K() {
        Preconditions.d(this.f24670x.f24497n);
        e(GoogleApiManager.f24480p);
        this.f24661o.f();
        for (ListenerHolder.ListenerKey zah : (ListenerHolder.ListenerKey[]) this.f24663q.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            D(new zah(zah, new TaskCompletionSource()));
        }
        d(new ConnectionResult(4));
        if (this.f24659m.a()) {
            this.f24659m.k(new zabp(this));
        }
    }

    public final void L() {
        Preconditions.d(this.f24670x.f24497n);
        if (this.f24666t) {
            l();
            GoogleApiManager googleApiManager = this.f24670x;
            e(googleApiManager.f24489f.i(googleApiManager.f24488e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f24659m.f("Timing out connection while resuming.");
        }
    }

    public final void N(ConnectionResult connectionResult) {
        F(connectionResult, (Exception) null);
    }

    public final void P(Bundle bundle) {
        if (Looper.myLooper() == this.f24670x.f24497n.getLooper()) {
            h();
        } else {
            this.f24670x.f24497n.post(new zabm(this));
        }
    }

    public final boolean Q() {
        return this.f24659m.a();
    }

    public final boolean a() {
        return this.f24659m.t();
    }

    public final boolean b() {
        return o(true);
    }

    public final Feature c(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] p2 = this.f24659m.p();
            if (p2 == null) {
                p2 = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(p2.length);
            for (Feature feature : p2) {
                arrayMap.put(feature.H(), Long.valueOf(feature.Q()));
            }
            for (Feature feature2 : featureArr) {
                Long l2 = (Long) arrayMap.get(feature2.H());
                if (l2 == null || l2.longValue() < feature2.Q()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void d(ConnectionResult connectionResult) {
        for (zal b2 : this.f24662p) {
            b2.b(this.f24660n, connectionResult, Objects.a(connectionResult, ConnectionResult.D) ? this.f24659m.h() : null);
        }
        this.f24662p.clear();
    }

    public final void e(Status status) {
        Preconditions.d(this.f24670x.f24497n);
        f(status, (Exception) null, false);
    }

    public final void f(Status status, Exception exc, boolean z2) {
        Preconditions.d(this.f24670x.f24497n);
        boolean z3 = true;
        boolean z4 = status == null;
        if (exc != null) {
            z3 = false;
        }
        if (z4 != z3) {
            Iterator it = this.f24658l.iterator();
            while (it.hasNext()) {
                zai zai = (zai) it.next();
                if (!z2 || zai.f24743a == 2) {
                    if (status != null) {
                        zai.a(status);
                    } else {
                        zai.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.f24658l);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zai zai = (zai) arrayList.get(i2);
            if (this.f24659m.a()) {
                if (m(zai)) {
                    this.f24658l.remove(zai);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        B();
        d(ConnectionResult.D);
        l();
        Iterator it = this.f24663q.values().iterator();
        while (it.hasNext()) {
            zaci zaci = (zaci) it.next();
            if (c(zaci.f24699a.c()) != null) {
                it.remove();
            } else {
                try {
                    zaci.f24699a.d(this.f24659m, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    J(3);
                    this.f24659m.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    public final void i(int i2) {
        B();
        this.f24666t = true;
        this.f24661o.e(i2, this.f24659m.r());
        ApiKey apiKey = this.f24660n;
        GoogleApiManager googleApiManager = this.f24670x;
        googleApiManager.f24497n.sendMessageDelayed(Message.obtain(googleApiManager.f24497n, 9, apiKey), 5000);
        ApiKey apiKey2 = this.f24660n;
        GoogleApiManager googleApiManager2 = this.f24670x;
        googleApiManager2.f24497n.sendMessageDelayed(Message.obtain(googleApiManager2.f24497n, 11, apiKey2), 120000);
        this.f24670x.f24490g.c();
        for (zaci zaci : this.f24663q.values()) {
            zaci.f24701c.run();
        }
    }

    public final void j() {
        this.f24670x.f24497n.removeMessages(12, this.f24660n);
        ApiKey apiKey = this.f24660n;
        GoogleApiManager googleApiManager = this.f24670x;
        googleApiManager.f24497n.sendMessageDelayed(googleApiManager.f24497n.obtainMessage(12, apiKey), this.f24670x.f24484a);
    }

    public final void k(zai zai) {
        zai.d(this.f24661o, a());
        try {
            zai.c(this);
        } catch (DeadObjectException unused) {
            J(1);
            this.f24659m.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void l() {
        if (this.f24666t) {
            GoogleApiManager googleApiManager = this.f24670x;
            googleApiManager.f24497n.removeMessages(11, this.f24660n);
            GoogleApiManager googleApiManager2 = this.f24670x;
            googleApiManager2.f24497n.removeMessages(9, this.f24660n);
            this.f24666t = false;
        }
    }

    public final boolean m(zai zai) {
        if (!(zai instanceof zac)) {
            k(zai);
            return true;
        }
        zac zac = (zac) zai;
        Feature c2 = c(zac.g(this));
        if (c2 == null) {
            k(zai);
            return true;
        }
        String name = this.f24659m.getClass().getName();
        String H = c2.H();
        long Q = c2.Q();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + H + ", " + Q + ").");
        if (!this.f24670x.f24498o || !zac.f(this)) {
            zac.b(new UnsupportedApiCallException(c2));
            return true;
        }
        zabs zabs = new zabs(this.f24660n, c2, (zabr) null);
        int indexOf = this.f24667u.indexOf(zabs);
        if (indexOf >= 0) {
            zabs zabs2 = (zabs) this.f24667u.get(indexOf);
            this.f24670x.f24497n.removeMessages(15, zabs2);
            GoogleApiManager googleApiManager = this.f24670x;
            googleApiManager.f24497n.sendMessageDelayed(Message.obtain(googleApiManager.f24497n, 15, zabs2), 5000);
            return false;
        }
        this.f24667u.add(zabs);
        GoogleApiManager googleApiManager2 = this.f24670x;
        googleApiManager2.f24497n.sendMessageDelayed(Message.obtain(googleApiManager2.f24497n, 15, zabs), 5000);
        GoogleApiManager googleApiManager3 = this.f24670x;
        googleApiManager3.f24497n.sendMessageDelayed(Message.obtain(googleApiManager3.f24497n, 16, zabs), 120000);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (n(connectionResult)) {
            return false;
        }
        this.f24670x.e(connectionResult, this.f24664r);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.f24482r
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.f24670x     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.zaae r2 = r1.f24494k     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0029
            java.util.Set r1 = r1.f24495l     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.ApiKey r2 = r3.f24660n     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0029
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r3.f24670x     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.zaae r1 = r1.f24494k     // Catch:{ all -> 0x0027 }
            int r2 = r3.f24664r     // Catch:{ all -> 0x0027 }
            r1.s(r4, r2)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 1
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x002c
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 0
            return r4
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabq.n(com.google.android.gms.common.ConnectionResult):boolean");
    }

    public final boolean o(boolean z2) {
        Preconditions.d(this.f24670x.f24497n);
        if (!this.f24659m.a() || !this.f24663q.isEmpty()) {
            return false;
        }
        if (!this.f24661o.g()) {
            this.f24659m.f("Timing out service connection.");
            return true;
        } else if (!z2) {
            return false;
        } else {
            j();
            return false;
        }
    }

    public final int p() {
        return this.f24664r;
    }

    public final int q() {
        return this.f24669w;
    }

    public final ConnectionResult r() {
        Preconditions.d(this.f24670x.f24497n);
        return this.f24668v;
    }

    public final Api.Client t() {
        return this.f24659m;
    }

    public final void u1(ConnectionResult connectionResult, Api api, boolean z2) {
        throw null;
    }

    public final Map v() {
        return this.f24663q;
    }
}
