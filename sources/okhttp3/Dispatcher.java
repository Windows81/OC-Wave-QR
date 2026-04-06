package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

@Metadata
public final class Dispatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f42627a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f42628b = 5;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f42629c;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f42630d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f42631e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f42632f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f42633g = new ArrayDeque();

    public final void a(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall d2;
        Intrinsics.i(asyncCall, "call");
        synchronized (this) {
            try {
                this.f42631e.add(asyncCall);
                if (!asyncCall.b().p() && (d2 = d(asyncCall.d())) != null) {
                    asyncCall.e(d2);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(RealCall realCall) {
        Intrinsics.i(realCall, "call");
        this.f42633g.add(realCall);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f42630d == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.f42630d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, Util.N(Util.f42806i + " Dispatcher", false));
            }
            executorService = this.f42630d;
            Intrinsics.f(executorService);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return executorService;
    }

    public final RealCall.AsyncCall d(String str) {
        Iterator it = this.f42632f.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (Intrinsics.d(asyncCall.d(), str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.f42631e.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (Intrinsics.d(asyncCall2.d(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    public final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(obj)) {
                runnable = this.f42629c;
                Unit unit = Unit.f40552a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!h() && runnable != null) {
            runnable.run();
        }
    }

    public final void f(RealCall.AsyncCall asyncCall) {
        Intrinsics.i(asyncCall, "call");
        asyncCall.c().decrementAndGet();
        e(this.f42632f, asyncCall);
    }

    public final void g(RealCall realCall) {
        Intrinsics.i(realCall, "call");
        e(this.f42633g, realCall);
    }

    public final boolean h() {
        int i2;
        boolean z2;
        if (!Util.f42805h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator it = this.f42631e.iterator();
                    Intrinsics.h(it, "readyAsyncCalls.iterator()");
                    while (it.hasNext()) {
                        RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                        if (this.f42632f.size() >= this.f42627a) {
                            break;
                        } else if (asyncCall.c().get() < this.f42628b) {
                            it.remove();
                            asyncCall.c().incrementAndGet();
                            Intrinsics.h(asyncCall, "asyncCall");
                            arrayList.add(asyncCall);
                            this.f42632f.add(asyncCall);
                        }
                    }
                    z2 = i() > 0;
                    Unit unit = Unit.f40552a;
                } finally {
                }
            }
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                ((RealCall.AsyncCall) arrayList.get(i2)).a(c());
            }
            return z2;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final synchronized int i() {
        return this.f42632f.size() + this.f42633g.size();
    }
}
