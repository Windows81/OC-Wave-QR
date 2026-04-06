package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

final class zaaa implements zaca {

    /* renamed from: l  reason: collision with root package name */
    public final Context f24534l;

    /* renamed from: m  reason: collision with root package name */
    public final zabe f24535m;

    /* renamed from: n  reason: collision with root package name */
    public final Looper f24536n;

    /* renamed from: o  reason: collision with root package name */
    public final zabi f24537o;

    /* renamed from: p  reason: collision with root package name */
    public final zabi f24538p;

    /* renamed from: q  reason: collision with root package name */
    public final Map f24539q;

    /* renamed from: r  reason: collision with root package name */
    public final Set f24540r = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: s  reason: collision with root package name */
    public final Api.Client f24541s;

    /* renamed from: t  reason: collision with root package name */
    public Bundle f24542t;

    /* renamed from: u  reason: collision with root package name */
    public ConnectionResult f24543u = null;

    /* renamed from: v  reason: collision with root package name */
    public ConnectionResult f24544v = null;

    /* renamed from: w  reason: collision with root package name */
    public boolean f24545w = false;

    /* renamed from: x  reason: collision with root package name */
    public final Lock f24546x;

    /* renamed from: y  reason: collision with root package name */
    public int f24547y = 0;

    public zaaa(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f24534l = context;
        this.f24535m = zabe;
        this.f24546x = lock;
        this.f24536n = looper;
        this.f24541s = client;
        Context context2 = context;
        zabe zabe2 = zabe;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zabi zabi = r3;
        zabi zabi2 = new zabi(context2, zabe2, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder) null, arrayList2, new zax(this, (zaw) null));
        this.f24537o = zabi;
        this.f24538p = new zabi(context2, zabe2, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, (zay) null));
        ArrayMap arrayMap = new ArrayMap();
        for (Api.AnyClientKey put : map2.keySet()) {
            arrayMap.put(put, this.f24537o);
        }
        for (Api.AnyClientKey put2 : map.keySet()) {
            arrayMap.put(put2, this.f24538p);
        }
        this.f24539q = Collections.unmodifiableMap(arrayMap);
    }

    public static boolean k(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.f0();
    }

    public static zaaa m(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        Map map3 = map2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.c()) {
                client = client2;
            }
            if (client2.t()) {
                arrayMap.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                arrayMap2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.r(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey b2 = api.b();
            if (arrayMap.containsKey(b2)) {
                arrayMap3.put(api, (Boolean) map3.get(api));
            } else if (arrayMap2.containsKey(b2)) {
                arrayMap4.put(api, (Boolean) map3.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zat zat = (zat) arrayList.get(i2);
            if (arrayMap3.containsKey(zat.f24762l)) {
                arrayList2.add(zat);
            } else if (arrayMap4.containsKey(zat.f24762l)) {
                arrayList3.add(zat);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zaaa(context, zabe, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    public static /* bridge */ /* synthetic */ void t(zaaa zaaa, int i2, boolean z2) {
        zaaa.f24535m.b(i2, z2);
        zaaa.f24544v = null;
        zaaa.f24543u = null;
    }

    public static /* bridge */ /* synthetic */ void u(zaaa zaaa, Bundle bundle) {
        Bundle bundle2 = zaaa.f24542t;
        if (bundle2 == null) {
            zaaa.f24542t = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void v(zaaa zaaa) {
        ConnectionResult connectionResult;
        if (k(zaaa.f24543u)) {
            if (k(zaaa.f24544v) || zaaa.i()) {
                int i2 = zaaa.f24547y;
                if (i2 != 1) {
                    if (i2 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        zaaa.f24547y = 0;
                        return;
                    }
                    ((zabe) Preconditions.m(zaaa.f24535m)).a(zaaa.f24542t);
                }
                zaaa.h();
                zaaa.f24547y = 0;
                return;
            }
            ConnectionResult connectionResult2 = zaaa.f24544v;
            if (connectionResult2 == null) {
                return;
            }
            if (zaaa.f24547y == 1) {
                zaaa.h();
                return;
            }
            zaaa.g(connectionResult2);
            zaaa.f24537o.e();
        } else if (zaaa.f24543u == null || !k(zaaa.f24544v)) {
            ConnectionResult connectionResult3 = zaaa.f24543u;
            if (connectionResult3 != null && (connectionResult = zaaa.f24544v) != null) {
                if (zaaa.f24538p.f24647x < zaaa.f24537o.f24647x) {
                    connectionResult3 = connectionResult;
                }
                zaaa.g(connectionResult3);
            }
        } else {
            zaaa.f24538p.e();
            zaaa.g((ConnectionResult) Preconditions.m(zaaa.f24543u));
        }
    }

    public final void a() {
        this.f24547y = 2;
        this.f24545w = false;
        this.f24544v = null;
        this.f24543u = null;
        this.f24537o.a();
        this.f24538p.a();
    }

    public final boolean b() {
        this.f24546x.lock();
        try {
            boolean z2 = false;
            if (this.f24537o.b() && (this.f24538p.b() || i() || this.f24547y == 1)) {
                z2 = true;
            }
            return z2;
        } finally {
            this.f24546x.unlock();
        }
    }

    public final BaseImplementation.ApiMethodImpl c(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!j(apiMethodImpl)) {
            return this.f24537o.c(apiMethodImpl);
        }
        if (!i()) {
            return this.f24538p.c(apiMethodImpl);
        }
        apiMethodImpl.x(new Status(4, (String) null, x()));
        return apiMethodImpl;
    }

    public final void d() {
        this.f24537o.d();
        this.f24538p.d();
    }

    public final void e() {
        this.f24544v = null;
        this.f24543u = null;
        this.f24547y = 0;
        this.f24537o.e();
        this.f24538p.e();
        h();
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f24538p.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f24537o.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void g(ConnectionResult connectionResult) {
        int i2 = this.f24547y;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f24547y = 0;
            }
            this.f24535m.c(connectionResult);
        }
        h();
        this.f24547y = 0;
    }

    public final void h() {
        for (SignInConnectionListener a2 : this.f24540r) {
            a2.a();
        }
        this.f24540r.clear();
    }

    public final boolean i() {
        ConnectionResult connectionResult = this.f24544v;
        return connectionResult != null && connectionResult.H() == 4;
    }

    public final boolean j(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabi = (zabi) this.f24539q.get(apiMethodImpl.t());
        Preconditions.n(zabi, "GoogleApiClient is not configured to use the API required for this call.");
        return zabi.equals(this.f24538p);
    }

    public final PendingIntent x() {
        Api.Client client = this.f24541s;
        if (client == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f24534l, System.identityHashCode(this.f24535m), client.s(), zap.f25271a | 134217728);
    }
}
