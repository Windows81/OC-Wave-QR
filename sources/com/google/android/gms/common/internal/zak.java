package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class zak implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final zaj f24939a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f24940b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f24941c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f24942d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f24943e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f24944f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24945g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f24946h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f24947i;

    public final void a() {
        this.f24943e = false;
        this.f24944f.incrementAndGet();
    }

    public final void b() {
        this.f24943e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f24946h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.e(r0, r1)
            android.os.Handler r0 = r5.f24946h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f24947i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0046 }
            java.util.ArrayList r2 = r5.f24942d     // Catch:{ all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ all -> 0x0046 }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f24944f     // Catch:{ all -> 0x0046 }
            int r2 = r2.get()     // Catch:{ all -> 0x0046 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0046 }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r3 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r3     // Catch:{ all -> 0x0046 }
            boolean r4 = r5.f24943e     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0048
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f24944f     // Catch:{ all -> 0x0046 }
            int r4 = r4.get()     // Catch:{ all -> 0x0046 }
            if (r4 == r2) goto L_0x003a
            goto L_0x0048
        L_0x003a:
            java.util.ArrayList r4 = r5.f24942d     // Catch:{ all -> 0x0046 }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0021
            r3.N(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0021
        L_0x0046:
            r6 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zak.c(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void d(Bundle bundle) {
        Preconditions.e(this.f24946h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f24947i) {
            try {
                Preconditions.q(!this.f24945g);
                this.f24946h.removeMessages(1);
                this.f24945g = true;
                Preconditions.q(this.f24941c.isEmpty());
                ArrayList arrayList = new ArrayList(this.f24940b);
                int i2 = this.f24944f.get();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.f24943e || !this.f24939a.a()) {
                        break;
                    } else if (this.f24944f.get() != i2) {
                        break;
                    } else if (!this.f24941c.contains(connectionCallbacks)) {
                        connectionCallbacks.P(bundle);
                    }
                }
                this.f24941c.clear();
                this.f24945g = false;
            } finally {
            }
        }
    }

    public final void e(int i2) {
        Preconditions.e(this.f24946h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f24946h.removeMessages(1);
        synchronized (this.f24947i) {
            try {
                this.f24945g = true;
                ArrayList arrayList = new ArrayList(this.f24940b);
                int i3 = this.f24944f.get();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) it.next();
                    if (!this.f24943e) {
                        break;
                    } else if (this.f24944f.get() != i3) {
                        break;
                    } else if (this.f24940b.contains(connectionCallbacks)) {
                        connectionCallbacks.J(i2);
                    }
                }
                this.f24941c.clear();
                this.f24945g = false;
            } finally {
            }
        }
    }

    public final void f(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m(onConnectionFailedListener);
        synchronized (this.f24947i) {
            try {
                if (!this.f24942d.remove(onConnectionFailedListener)) {
                    String valueOf = String.valueOf(onConnectionFailedListener);
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + valueOf + " not found");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.f24947i) {
                try {
                    if (this.f24943e && this.f24939a.a() && this.f24940b.contains(connectionCallbacks)) {
                        connectionCallbacks.P((Bundle) null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i2, new Exception());
        return false;
    }
}
