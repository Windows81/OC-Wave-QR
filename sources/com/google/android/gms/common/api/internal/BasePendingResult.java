package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: p  reason: collision with root package name */
    public static final ThreadLocal f24461p = new zaq();

    /* renamed from: a  reason: collision with root package name */
    public final Object f24462a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final CallbackHandler f24463b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f24464c;

    /* renamed from: d  reason: collision with root package name */
    public final CountDownLatch f24465d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f24466e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public ResultCallback f24467f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f24468g = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    public Result f24469h;

    /* renamed from: i  reason: collision with root package name */
    public Status f24470i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f24471j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f24472k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24473l;

    /* renamed from: m  reason: collision with root package name */
    public ICancelToken f24474m;

    /* renamed from: n  reason: collision with root package name */
    public volatile zada f24475n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f24476o = false;
    private zas resultGuardian;

    public static class CallbackHandler<R extends Result> extends zau {
        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public final void a(ResultCallback resultCallback, Result result) {
            ThreadLocal threadLocal = BasePendingResult.f24461p;
            sendMessage(obtainMessage(1, new Pair((ResultCallback) Preconditions.m(resultCallback), result)));
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.a(result);
                } catch (RuntimeException e2) {
                    BasePendingResult.o(result);
                    throw e2;
                }
            } else if (i2 != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i2, new Exception());
            } else {
                ((BasePendingResult) message.obj).g(Status.H);
            }
        }
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.f24463b = new CallbackHandler(googleApiClient != null ? googleApiClient.h() : Looper.getMainLooper());
        this.f24464c = new WeakReference(googleApiClient);
    }

    public static void o(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).g();
            } catch (RuntimeException e2) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e2);
            }
        }
    }

    public final void b(PendingResult.StatusListener statusListener) {
        Preconditions.b(statusListener != null, "Callback cannot be null.");
        synchronized (this.f24462a) {
            try {
                if (i()) {
                    statusListener.a(this.f24470i);
                } else {
                    this.f24466e.add(statusListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Result c(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            Preconditions.l("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z2 = true;
        Preconditions.r(!this.f24471j, "Result has already been consumed.");
        if (this.f24475n != null) {
            z2 = false;
        }
        Preconditions.r(z2, "Cannot await if then() has been called.");
        try {
            if (!this.f24465d.await(j2, timeUnit)) {
                g(Status.H);
            }
        } catch (InterruptedException unused) {
            g(Status.F);
        }
        Preconditions.r(i(), "Result is not ready.");
        return k();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f24462a
            monitor-enter(r0)
            boolean r1 = r2.f24472k     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0029
            boolean r1 = r2.f24471j     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0029
        L_0x000c:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.f24474m     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x0016
            r1.cancel()     // Catch:{ RemoteException -> 0x0016 }
            goto L_0x0016
        L_0x0014:
            r1 = move-exception
            goto L_0x002b
        L_0x0016:
            com.google.android.gms.common.api.Result r1 = r2.f24469h     // Catch:{ all -> 0x0014 }
            o(r1)     // Catch:{ all -> 0x0014 }
            r1 = 1
            r2.f24472k = r1     // Catch:{ all -> 0x0014 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.I     // Catch:{ all -> 0x0014 }
            com.google.android.gms.common.api.Result r1 = r2.f(r1)     // Catch:{ all -> 0x0014 }
            r2.l(r1)     // Catch:{ all -> 0x0014 }
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(com.google.android.gms.common.api.ResultCallback r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f24462a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.f24467f = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.f24471j     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.r(r1, r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.zada r1 = r4.f24475n     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.r(r2, r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.h()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.i()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler r1 = r4.f24463b     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.Result r2 = r4.k()     // Catch:{ all -> 0x000a }
            r1.a(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.f24467f = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.e(com.google.android.gms.common.api.ResultCallback):void");
    }

    public abstract Result f(Status status);

    public final void g(Status status) {
        synchronized (this.f24462a) {
            try {
                if (!i()) {
                    j(f(status));
                    this.f24473l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        boolean z2;
        synchronized (this.f24462a) {
            z2 = this.f24472k;
        }
        return z2;
    }

    public final boolean i() {
        return this.f24465d.getCount() == 0;
    }

    public final void j(Result result) {
        synchronized (this.f24462a) {
            try {
                if (this.f24473l || this.f24472k) {
                    o(result);
                    return;
                }
                i();
                Preconditions.r(!i(), "Results have already been set");
                Preconditions.r(!this.f24471j, "Result has already been consumed");
                l(result);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Result k() {
        Result result;
        synchronized (this.f24462a) {
            Preconditions.r(!this.f24471j, "Result has already been consumed.");
            Preconditions.r(i(), "Result is not ready.");
            result = this.f24469h;
            this.f24469h = null;
            this.f24467f = null;
            this.f24471j = true;
        }
        zadb zadb = (zadb) this.f24468g.getAndSet((Object) null);
        if (zadb != null) {
            zadb.f24733a.f24735a.remove(this);
        }
        return (Result) Preconditions.m(result);
    }

    public final void l(Result result) {
        this.f24469h = result;
        this.f24470i = result.A();
        this.f24474m = null;
        this.f24465d.countDown();
        if (this.f24472k) {
            this.f24467f = null;
        } else {
            ResultCallback resultCallback = this.f24467f;
            if (resultCallback != null) {
                this.f24463b.removeMessages(2);
                this.f24463b.a(resultCallback, k());
            } else if (this.f24469h instanceof Releasable) {
                this.resultGuardian = new zas(this, (zar) null);
            }
        }
        ArrayList arrayList = this.f24466e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((PendingResult.StatusListener) arrayList.get(i2)).a(this.f24470i);
        }
        this.f24466e.clear();
    }

    public final void n() {
        boolean z2 = true;
        if (!this.f24476o && !((Boolean) f24461p.get()).booleanValue()) {
            z2 = false;
        }
        this.f24476o = z2;
    }

    public final boolean p() {
        boolean h2;
        synchronized (this.f24462a) {
            try {
                if (((GoogleApiClient) this.f24464c.get()) != null) {
                    if (!this.f24476o) {
                    }
                    h2 = h();
                }
                d();
                h2 = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2;
    }

    public final void q(zadb zadb) {
        this.f24468g.set(zadb);
    }
}
