package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class Timeout {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f43453e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final Timeout f43454f = new Timeout$Companion$NONE$1();

    /* renamed from: a  reason: collision with root package name */
    public boolean f43455a;

    /* renamed from: b  reason: collision with root package name */
    public long f43456b;

    /* renamed from: c  reason: collision with root package name */
    public long f43457c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Object f43458d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }

        public Companion() {
        }
    }

    public void a(Condition condition) {
        Intrinsics.i(condition, "condition");
        try {
            boolean f2 = f();
            long i2 = i();
            if (f2 || i2 != 0) {
                if (f2 && i2 != 0) {
                    i2 = Math.min(i2, d() - System.nanoTime());
                } else if (f2) {
                    i2 = d() - System.nanoTime();
                }
                if (i2 > 0) {
                    Object obj = this.f43458d;
                    if (condition.awaitNanos(i2) <= 0 && this.f43458d == obj) {
                        throw new InterruptedIOException("timeout");
                    }
                    return;
                }
                throw new InterruptedIOException("timeout");
            }
            condition.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public Timeout b() {
        this.f43455a = false;
        return this;
    }

    public Timeout c() {
        this.f43457c = 0;
        return this;
    }

    public long d() {
        if (this.f43455a) {
            return this.f43456b;
        }
        throw new IllegalStateException("No deadline");
    }

    public Timeout e(long j2) {
        this.f43455a = true;
        this.f43456b = j2;
        return this;
    }

    public boolean f() {
        return this.f43455a;
    }

    public void g() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f43455a && this.f43456b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout h(long j2, TimeUnit timeUnit) {
        Intrinsics.i(timeUnit, "unit");
        if (j2 >= 0) {
            this.f43457c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    public long i() {
        return this.f43457c;
    }

    public void j(Object obj) {
        Intrinsics.i(obj, "monitor");
        try {
            boolean f2 = f();
            long i2 = i();
            if (f2 || i2 != 0) {
                long nanoTime = System.nanoTime();
                if (f2 && i2 != 0) {
                    i2 = Math.min(i2, d() - nanoTime);
                } else if (f2) {
                    i2 = d() - nanoTime;
                }
                if (i2 > 0) {
                    Object obj2 = this.f43458d;
                    long j2 = i2 / 1000000;
                    obj.wait(j2, (int) (i2 - (1000000 * j2)));
                    if (System.nanoTime() - nanoTime >= i2 && this.f43458d == obj2) {
                        throw new InterruptedIOException("timeout");
                    }
                    return;
                }
                throw new InterruptedIOException("timeout");
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
