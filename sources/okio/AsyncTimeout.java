package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class AsyncTimeout extends Timeout {

    /* renamed from: j  reason: collision with root package name */
    public static final Companion f43325j = new Companion((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final ReentrantLock f43326k;

    /* renamed from: l  reason: collision with root package name */
    public static final Condition f43327l;

    /* renamed from: m  reason: collision with root package name */
    public static final long f43328m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f43329n;

    /* renamed from: o  reason: collision with root package name */
    public static AsyncTimeout f43330o;

    /* renamed from: g  reason: collision with root package name */
    public int f43331g;

    /* renamed from: h  reason: collision with root package name */
    public AsyncTimeout f43332h;

    /* renamed from: i  reason: collision with root package name */
    public long f43333i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AsyncTimeout c() {
            AsyncTimeout m2 = AsyncTimeout.f43330o;
            Intrinsics.f(m2);
            AsyncTimeout q2 = m2.f43332h;
            if (q2 == null) {
                long nanoTime = System.nanoTime();
                d().await(AsyncTimeout.f43328m, TimeUnit.MILLISECONDS);
                AsyncTimeout m3 = AsyncTimeout.f43330o;
                Intrinsics.f(m3);
                if (m3.f43332h != null || System.nanoTime() - nanoTime < AsyncTimeout.f43329n) {
                    return null;
                }
                return AsyncTimeout.f43330o;
            }
            long s2 = q2.A(System.nanoTime());
            if (s2 > 0) {
                d().await(s2, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout m4 = AsyncTimeout.f43330o;
            Intrinsics.f(m4);
            m4.f43332h = q2.f43332h;
            q2.f43332h = null;
            q2.f43331g = 2;
            return q2;
        }

        public final Condition d() {
            return AsyncTimeout.f43327l;
        }

        public final ReentrantLock e() {
            return AsyncTimeout.f43326k;
        }

        public final void f(AsyncTimeout asyncTimeout, long j2, boolean z2) {
            if (AsyncTimeout.f43330o == null) {
                AsyncTimeout.f43330o = new AsyncTimeout();
                new Watchdog().start();
            }
            long nanoTime = System.nanoTime();
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 && z2) {
                asyncTimeout.f43333i = Math.min(j2, asyncTimeout.d() - nanoTime) + nanoTime;
            } else if (i2 != 0) {
                asyncTimeout.f43333i = j2 + nanoTime;
            } else if (z2) {
                asyncTimeout.f43333i = asyncTimeout.d();
            } else {
                throw new AssertionError();
            }
            long s2 = asyncTimeout.A(nanoTime);
            AsyncTimeout m2 = AsyncTimeout.f43330o;
            Intrinsics.f(m2);
            while (m2.f43332h != null) {
                AsyncTimeout q2 = m2.f43332h;
                Intrinsics.f(q2);
                if (s2 < q2.A(nanoTime)) {
                    break;
                }
                m2 = m2.f43332h;
                Intrinsics.f(m2);
            }
            asyncTimeout.f43332h = m2.f43332h;
            m2.f43332h = asyncTimeout;
            if (m2 == AsyncTimeout.f43330o) {
                d().signal();
            }
        }

        public final void g(AsyncTimeout asyncTimeout) {
            for (AsyncTimeout m2 = AsyncTimeout.f43330o; m2 != null; m2 = m2.f43332h) {
                if (m2.f43332h == asyncTimeout) {
                    m2.f43332h = asyncTimeout.f43332h;
                    asyncTimeout.f43332h = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|(5:5|6|7|19|8)(5:10|11|12|13|(2:15|23)(1:22))|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            r0.unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:18:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.f43325j     // Catch:{ InterruptedException -> 0x0000 }
                java.util.concurrent.locks.ReentrantLock r0 = r0.e()     // Catch:{ InterruptedException -> 0x0000 }
                r0.lock()     // Catch:{ InterruptedException -> 0x0000 }
                okio.AsyncTimeout$Companion r1 = okio.AsyncTimeout.f43325j     // Catch:{ all -> 0x0024 }
                okio.AsyncTimeout r1 = r1.c()     // Catch:{ all -> 0x0024 }
                okio.AsyncTimeout r2 = okio.AsyncTimeout.f43330o     // Catch:{ all -> 0x0024 }
                if (r1 != r2) goto L_0x0026
                okio.AsyncTimeout.Companion unused = okio.AsyncTimeout.f43325j     // Catch:{ all -> 0x0024 }
                r1 = 0
                okio.AsyncTimeout.f43330o = r1     // Catch:{ all -> 0x0024 }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0024:
                r1 = move-exception
                goto L_0x0031
            L_0x0026:
                kotlin.Unit r2 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0024 }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.D()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0031:
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.Watchdog.run():void");
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f43326k = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.h(newCondition, "newCondition(...)");
        f43327l = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60);
        f43328m = millis;
        f43329n = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long A(long j2) {
        return this.f43333i - j2;
    }

    public final Sink B(Sink sink) {
        Intrinsics.i(sink, "sink");
        return new AsyncTimeout$sink$1(this, sink);
    }

    public final Source C(Source source) {
        Intrinsics.i(source, "source");
        return new AsyncTimeout$source$1(this, source);
    }

    public void D() {
    }

    public final IOException r(IOException iOException) {
        return z(iOException);
    }

    public final void x() {
        long i2 = i();
        boolean f2 = f();
        if (i2 != 0 || f2) {
            ReentrantLock reentrantLock = f43326k;
            reentrantLock.lock();
            try {
                if (this.f43331g == 0) {
                    this.f43331g = 1;
                    f43325j.f(this, i2, f2);
                    Unit unit = Unit.f40552a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit");
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean y() {
        ReentrantLock reentrantLock = f43326k;
        reentrantLock.lock();
        try {
            int i2 = this.f43331g;
            boolean z2 = false;
            this.f43331g = 0;
            if (i2 == 1) {
                f43325j.g(this);
                return false;
            }
            if (i2 == 2) {
                z2 = true;
            }
            reentrantLock.unlock();
            return z2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException z(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
