package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class zabi implements zaca, zau {

    /* renamed from: l  reason: collision with root package name */
    public final Lock f24635l;

    /* renamed from: m  reason: collision with root package name */
    public final Condition f24636m;

    /* renamed from: n  reason: collision with root package name */
    public final Context f24637n;

    /* renamed from: o  reason: collision with root package name */
    public final GoogleApiAvailabilityLight f24638o;

    /* renamed from: p  reason: collision with root package name */
    public final zabh f24639p;

    /* renamed from: q  reason: collision with root package name */
    public final Map f24640q;

    /* renamed from: r  reason: collision with root package name */
    public final Map f24641r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    public final ClientSettings f24642s;

    /* renamed from: t  reason: collision with root package name */
    public final Map f24643t;

    /* renamed from: u  reason: collision with root package name */
    public final Api.AbstractClientBuilder f24644u;

    /* renamed from: v  reason: collision with root package name */
    public volatile zabf f24645v;

    /* renamed from: w  reason: collision with root package name */
    public ConnectionResult f24646w = null;

    /* renamed from: x  reason: collision with root package name */
    public int f24647x;

    /* renamed from: y  reason: collision with root package name */
    public final zabe f24648y;

    /* renamed from: z  reason: collision with root package name */
    public final zabz f24649z;

    public zabi(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList, zabz zabz) {
        this.f24637n = context;
        this.f24635l = lock;
        this.f24638o = googleApiAvailabilityLight;
        this.f24640q = map;
        this.f24642s = clientSettings;
        this.f24643t = map2;
        this.f24644u = abstractClientBuilder;
        this.f24648y = zabe;
        this.f24649z = zabz;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zat) arrayList.get(i2)).a(this);
        }
        this.f24639p = new zabh(this, looper);
        this.f24636m = lock.newCondition();
        this.f24645v = new zaax(this);
    }

    public final void J(int i2) {
        this.f24635l.lock();
        try {
            this.f24645v.d(i2);
        } finally {
            this.f24635l.unlock();
        }
    }

    public final void P(Bundle bundle) {
        this.f24635l.lock();
        try {
            this.f24645v.a(bundle);
        } finally {
            this.f24635l.unlock();
        }
    }

    public final void a() {
        this.f24645v.b();
    }

    public final boolean b() {
        return this.f24645v instanceof zaaj;
    }

    public final BaseImplementation.ApiMethodImpl c(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.n();
        return this.f24645v.g(apiMethodImpl);
    }

    public final void d() {
        if (this.f24645v instanceof zaaj) {
            ((zaaj) this.f24645v).i();
        }
    }

    public final void e() {
        if (this.f24645v.f()) {
            this.f24641r.clear();
        }
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mState=").println(this.f24645v);
        for (Api api : this.f24643t.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append(str).append(api.d()).println(":");
            ((Api.Client) Preconditions.m((Api.Client) this.f24640q.get(api.b()))).l(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    public final void i() {
        this.f24635l.lock();
        try {
            this.f24648y.t();
            this.f24645v = new zaaj(this);
            this.f24645v.e();
            this.f24636m.signalAll();
        } finally {
            this.f24635l.unlock();
        }
    }

    public final void j() {
        this.f24635l.lock();
        try {
            this.f24645v = new zaaw(this, this.f24642s, this.f24643t, this.f24638o, this.f24644u, this.f24635l, this.f24637n);
            this.f24645v.e();
            this.f24636m.signalAll();
        } finally {
            this.f24635l.unlock();
        }
    }

    public final void k(ConnectionResult connectionResult) {
        this.f24635l.lock();
        try {
            this.f24646w = connectionResult;
            this.f24645v = new zaax(this);
            this.f24645v.e();
            this.f24636m.signalAll();
        } finally {
            this.f24635l.unlock();
        }
    }

    public final void l(zabg zabg) {
        zabh zabh = this.f24639p;
        zabh.sendMessage(zabh.obtainMessage(1, zabg));
    }

    public final void m(RuntimeException runtimeException) {
        zabh zabh = this.f24639p;
        zabh.sendMessage(zabh.obtainMessage(2, runtimeException));
    }

    public final void u1(ConnectionResult connectionResult, Api api, boolean z2) {
        this.f24635l.lock();
        try {
            this.f24645v.c(connectionResult, api, z2);
        } finally {
            this.f24635l.unlock();
        }
    }
}
