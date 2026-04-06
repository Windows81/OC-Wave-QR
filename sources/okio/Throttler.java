package okio;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata
public final class Throttler {

    /* renamed from: a  reason: collision with root package name */
    public long f43445a;

    /* renamed from: b  reason: collision with root package name */
    public long f43446b;

    /* renamed from: c  reason: collision with root package name */
    public long f43447c;

    /* renamed from: d  reason: collision with root package name */
    public long f43448d;

    /* renamed from: e  reason: collision with root package name */
    public final ReentrantLock f43449e;

    /* renamed from: f  reason: collision with root package name */
    public final Condition f43450f;

    public final long a(long j2, long j3) {
        if (this.f43446b == 0) {
            return j3;
        }
        long max = Math.max(this.f43445a - j2, 0);
        long c2 = this.f43448d - c(max);
        if (c2 >= j3) {
            this.f43445a = j2 + max + b(j3);
            return j3;
        }
        long j4 = this.f43447c;
        if (c2 >= j4) {
            this.f43445a = j2 + b(this.f43448d);
            return c2;
        }
        long min = Math.min(j4, j3);
        long b2 = max + b(min - this.f43448d);
        if (b2 != 0) {
            return -b2;
        }
        this.f43445a = j2 + b(this.f43448d);
        return min;
    }

    public final long b(long j2) {
        return (j2 * 1000000000) / this.f43446b;
    }

    public final long c(long j2) {
        return (j2 * this.f43446b) / 1000000000;
    }

    public final long d(long j2) {
        if (j2 > 0) {
            ReentrantLock reentrantLock = this.f43449e;
            reentrantLock.lock();
            while (true) {
                try {
                    long a2 = a(System.nanoTime(), j2);
                    if (a2 >= 0) {
                        return a2;
                    }
                    this.f43450f.awaitNanos(-a2);
                } finally {
                    reentrantLock.unlock();
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
