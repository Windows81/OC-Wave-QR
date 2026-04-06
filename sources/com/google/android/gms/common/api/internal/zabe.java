package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zak;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class zabe extends GoogleApiClient implements zabz {

    /* renamed from: b  reason: collision with root package name */
    public final Lock f24610b;

    /* renamed from: c  reason: collision with root package name */
    public final zak f24611c;

    /* renamed from: d  reason: collision with root package name */
    public zaca f24612d;

    /* renamed from: e  reason: collision with root package name */
    public final int f24613e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f24614f;

    /* renamed from: g  reason: collision with root package name */
    public final Looper f24615g;

    /* renamed from: h  reason: collision with root package name */
    public final Queue f24616h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f24617i;

    /* renamed from: j  reason: collision with root package name */
    public long f24618j;

    /* renamed from: k  reason: collision with root package name */
    public long f24619k;

    /* renamed from: l  reason: collision with root package name */
    public final zabc f24620l;

    /* renamed from: m  reason: collision with root package name */
    public final GoogleApiAvailability f24621m;

    /* renamed from: n  reason: collision with root package name */
    public zabx f24622n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f24623o;

    /* renamed from: p  reason: collision with root package name */
    public Set f24624p;

    /* renamed from: q  reason: collision with root package name */
    public final ClientSettings f24625q;

    /* renamed from: r  reason: collision with root package name */
    public final Map f24626r;

    /* renamed from: s  reason: collision with root package name */
    public final Api.AbstractClientBuilder f24627s;

    /* renamed from: t  reason: collision with root package name */
    public final ListenerHolders f24628t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f24629u;

    /* renamed from: v  reason: collision with root package name */
    public Integer f24630v;

    /* renamed from: w  reason: collision with root package name */
    public Set f24631w;

    /* renamed from: x  reason: collision with root package name */
    public final zadc f24632x;

    public static int m(Iterable iterable, boolean z2) {
        Iterator it = iterable.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            z3 |= client.t();
            z4 |= client.c();
        }
        if (z3) {
            return (!z4 || !z2) ? 1 : 2;
        }
        return 3;
    }

    public static String p(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void r(zabe zabe) {
        zabe.f24610b.lock();
        try {
            if (zabe.f24617i) {
                zabe.w();
            }
        } finally {
            zabe.f24610b.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void s(zabe zabe) {
        zabe.f24610b.lock();
        try {
            if (zabe.t()) {
                zabe.w();
            }
        } finally {
            zabe.f24610b.unlock();
        }
    }

    public final void a(Bundle bundle) {
        while (!this.f24616h.isEmpty()) {
            g((BaseImplementation.ApiMethodImpl) this.f24616h.remove());
        }
        this.f24611c.d(bundle);
    }

    public final void b(int i2, boolean z2) {
        if (i2 == 1) {
            if (!z2 && !this.f24617i) {
                this.f24617i = true;
                if (this.f24622n == null && !ClientLibraryUtils.a()) {
                    try {
                        this.f24622n = this.f24621m.v(this.f24614f.getApplicationContext(), new zabd(this));
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabc = this.f24620l;
                zabc.sendMessageDelayed(zabc.obtainMessage(1), this.f24618j);
                zabc zabc2 = this.f24620l;
                zabc2.sendMessageDelayed(zabc2.obtainMessage(2), this.f24619k);
            }
            i2 = 1;
        }
        for (BasePendingResult g2 : (BasePendingResult[]) this.f24632x.f24735a.toArray(new BasePendingResult[0])) {
            g2.g(zadc.f24734c);
        }
        this.f24611c.e(i2);
        this.f24611c.a();
        if (i2 == 2) {
            w();
        }
    }

    public final void c(ConnectionResult connectionResult) {
        if (!this.f24621m.k(this.f24614f, connectionResult.H())) {
            t();
        }
        if (!this.f24617i) {
            this.f24611c.c(connectionResult);
            this.f24611c.a();
        }
    }

    public final void d() {
        this.f24610b.lock();
        try {
            int i2 = 2;
            boolean z2 = false;
            if (this.f24613e >= 0) {
                Preconditions.r(this.f24630v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f24630v;
                if (num == null) {
                    this.f24630v = Integer.valueOf(m(this.f24623o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) Preconditions.m(this.f24630v)).intValue();
            this.f24610b.lock();
            if (intValue == 3 || intValue == 1) {
                i2 = intValue;
            } else if (intValue != 2) {
                i2 = intValue;
                Preconditions.b(z2, "Illegal sign-in mode: " + i2);
                u(i2);
                w();
                this.f24610b.unlock();
                this.f24610b.unlock();
            }
            z2 = true;
            Preconditions.b(z2, "Illegal sign-in mode: " + i2);
            u(i2);
            w();
            this.f24610b.unlock();
            this.f24610b.unlock();
        } catch (Throwable th) {
            this.f24610b.unlock();
            throw th;
        }
    }

    public final void e() {
        this.f24610b.lock();
        try {
            this.f24632x.b();
            zaca zaca = this.f24612d;
            if (zaca != null) {
                zaca.e();
            }
            this.f24628t.b();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.f24616h) {
                apiMethodImpl.q((zadb) null);
                apiMethodImpl.d();
            }
            this.f24616h.clear();
            if (this.f24612d != null) {
                t();
                this.f24611c.a();
            }
            this.f24610b.unlock();
        } catch (Throwable th) {
            this.f24610b.unlock();
            throw th;
        }
    }

    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f24614f);
        printWriter.append(str).append("mResuming=").print(this.f24617i);
        printWriter.append(" mWorkQueue.size()=").print(this.f24616h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f24632x.f24735a.size());
        zaca zaca = this.f24612d;
        if (zaca != null) {
            zaca.f(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final BaseImplementation.ApiMethodImpl g(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        Map map = this.f24623o;
        Api s2 = apiMethodImpl.s();
        boolean containsKey = map.containsKey(apiMethodImpl.t());
        String d2 = s2 != null ? s2.d() : "the API";
        Preconditions.b(containsKey, "GoogleApiClient is not configured to use " + d2 + " required for this call.");
        this.f24610b.lock();
        try {
            zaca zaca = this.f24612d;
            if (zaca != null) {
                if (this.f24617i) {
                    this.f24616h.add(apiMethodImpl);
                    while (!this.f24616h.isEmpty()) {
                        BaseImplementation.ApiMethodImpl apiMethodImpl2 = (BaseImplementation.ApiMethodImpl) this.f24616h.remove();
                        this.f24632x.a(apiMethodImpl2);
                        apiMethodImpl2.x(Status.G);
                    }
                } else {
                    apiMethodImpl = zaca.c(apiMethodImpl);
                }
                this.f24610b.unlock();
                return apiMethodImpl;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f24610b.unlock();
            throw th;
        }
    }

    public final Looper h() {
        return this.f24615g;
    }

    public final void i(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f24611c.f(onConnectionFailedListener);
    }

    public final void j(zada zada) {
        this.f24610b.lock();
        try {
            if (this.f24631w == null) {
                this.f24631w = new HashSet();
            }
            this.f24631w.add(zada);
            this.f24610b.unlock();
        } catch (Throwable th) {
            this.f24610b.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r3 != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(com.google.android.gms.common.api.internal.zada r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f24610b
            r0.lock()
            java.util.Set r0 = r2.f24631w     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0018
            java.lang.String r3 = "Attempted to remove pending transform when no transforms are registered."
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x0016 }
            r0.<init>()     // Catch:{ all -> 0x0016 }
            android.util.Log.wtf(r1, r3, r0)     // Catch:{ all -> 0x0016 }
            goto L_0x004a
        L_0x0016:
            r3 = move-exception
            goto L_0x0057
        L_0x0018:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0016 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "Failed to remove pending transform - this may lead to memory leaks!"
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x0016 }
            r0.<init>()     // Catch:{ all -> 0x0016 }
            android.util.Log.wtf(r1, r3, r0)     // Catch:{ all -> 0x0016 }
            goto L_0x004a
        L_0x0029:
            java.util.concurrent.locks.Lock r3 = r2.f24610b     // Catch:{ all -> 0x0016 }
            r3.lock()     // Catch:{ all -> 0x0016 }
            java.util.Set r3 = r2.f24631w     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0038
            java.util.concurrent.locks.Lock r3 = r2.f24610b     // Catch:{ all -> 0x0016 }
            r3.unlock()     // Catch:{ all -> 0x0016 }
            goto L_0x0043
        L_0x0038:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            java.util.concurrent.locks.Lock r0 = r2.f24610b     // Catch:{ all -> 0x0016 }
            r0.unlock()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x004a
        L_0x0043:
            com.google.android.gms.common.api.internal.zaca r3 = r2.f24612d     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x004a
            r3.d()     // Catch:{ all -> 0x0016 }
        L_0x004a:
            java.util.concurrent.locks.Lock r3 = r2.f24610b
            r3.unlock()
            return
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f24610b     // Catch:{ all -> 0x0016 }
            r0.unlock()     // Catch:{ all -> 0x0016 }
            throw r3     // Catch:{ all -> 0x0016 }
        L_0x0057:
            java.util.concurrent.locks.Lock r0 = r2.f24610b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabe.k(com.google.android.gms.common.api.internal.zada):void");
    }

    public final boolean l() {
        zaca zaca = this.f24612d;
        return zaca != null && zaca.b();
    }

    public final String o() {
        StringWriter stringWriter = new StringWriter();
        f("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    public final boolean t() {
        if (!this.f24617i) {
            return false;
        }
        this.f24617i = false;
        this.f24620l.removeMessages(2);
        this.f24620l.removeMessages(1);
        zabx zabx = this.f24622n;
        if (zabx != null) {
            zabx.b();
            this.f24622n = null;
        }
        return true;
    }

    public final void u(int i2) {
        Integer num = this.f24630v;
        if (num == null) {
            this.f24630v = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            throw new IllegalStateException("Cannot use sign-in mode: " + p(i2) + ". Mode was already set to " + p(this.f24630v.intValue()));
        }
        if (this.f24612d == null) {
            boolean z2 = false;
            boolean z3 = false;
            for (Api.Client client : this.f24623o.values()) {
                z2 |= client.t();
                z3 |= client.c();
            }
            int intValue = this.f24630v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z2) {
                    this.f24612d = zaaa.m(this.f24614f, this, this.f24610b, this.f24615g, this.f24621m, this.f24623o, this.f24625q, this.f24626r, this.f24627s, this.f24629u);
                    return;
                }
            } else if (!z2) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z3) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f24612d = new zabi(this.f24614f, this, this.f24610b, this.f24615g, this.f24621m, this.f24623o, this.f24625q, this.f24626r, this.f24627s, this.f24629u, this);
        }
    }

    public final void v(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z2) {
        Common.f24920d.a(googleApiClient).e(new zabb(this, statusPendingResult, z2, googleApiClient));
    }

    public final void w() {
        this.f24611c.b();
        ((zaca) Preconditions.m(this.f24612d)).a();
    }
}
