package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Pipe$sink$1 implements Sink {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Pipe f43419A;

    /* renamed from: z  reason: collision with root package name */
    public final Timeout f43420z;

    public void N0(Buffer buffer, long j2) {
        Sink sink;
        Intrinsics.i(buffer, "source");
        ReentrantLock e2 = this.f43419A.e();
        Pipe pipe = this.f43419A;
        e2.lock();
        try {
            if (pipe.g()) {
                throw new IllegalStateException("closed");
            } else if (!pipe.b()) {
                while (true) {
                    if (j2 <= 0) {
                        sink = null;
                        break;
                    }
                    sink = pipe.d();
                    if (sink != null) {
                        break;
                    } else if (!pipe.h()) {
                        long f2 = pipe.f() - pipe.a().n0();
                        if (f2 == 0) {
                            this.f43420z.a(pipe.c());
                            if (pipe.b()) {
                                throw new IOException("canceled");
                            }
                        } else {
                            long min = Math.min(f2, j2);
                            pipe.a().N0(buffer, min);
                            j2 -= min;
                            pipe.c().signalAll();
                        }
                    } else {
                        throw new IOException("source is closed");
                    }
                }
                Unit unit = Unit.f40552a;
                e2.unlock();
                if (sink != null) {
                    Pipe pipe2 = this.f43419A;
                    Timeout u2 = sink.u();
                    Timeout u3 = pipe2.k().u();
                    long i2 = u2.i();
                    long a2 = Timeout.f43453e.a(u3.i(), u2.i());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    u2.h(a2, timeUnit);
                    if (u2.f()) {
                        long d2 = u2.d();
                        if (u3.f()) {
                            u2.e(Math.min(u2.d(), u3.d()));
                        }
                        try {
                            sink.N0(buffer, j2);
                            u2.h(i2, timeUnit);
                            if (u3.f()) {
                                u2.e(d2);
                            }
                        } catch (Throwable th) {
                            u2.h(i2, TimeUnit.NANOSECONDS);
                            if (u3.f()) {
                                u2.e(d2);
                            }
                            throw th;
                        }
                    } else {
                        if (u3.f()) {
                            u2.e(u3.d());
                        }
                        try {
                            sink.N0(buffer, j2);
                            u2.h(i2, timeUnit);
                            if (u3.f()) {
                                u2.b();
                            }
                        } catch (Throwable th2) {
                            u2.h(i2, TimeUnit.NANOSECONDS);
                            if (u3.f()) {
                                u2.b();
                            }
                            throw th2;
                        }
                    }
                }
            } else {
                throw new IOException("canceled");
            }
        } catch (Throwable th3) {
            e2.unlock();
            throw th3;
        }
    }

    public void close() {
        ReentrantLock e2 = this.f43419A.e();
        Pipe pipe = this.f43419A;
        e2.lock();
        try {
            if (pipe.g()) {
                e2.unlock();
                return;
            }
            Sink d2 = pipe.d();
            if (d2 == null) {
                if (pipe.h()) {
                    if (pipe.a().n0() > 0) {
                        throw new IOException("source is closed");
                    }
                }
                pipe.i(true);
                pipe.c().signalAll();
                d2 = null;
            }
            Unit unit = Unit.f40552a;
            e2.unlock();
            if (d2 != null) {
                Pipe pipe2 = this.f43419A;
                Timeout u2 = d2.u();
                Timeout u3 = pipe2.k().u();
                long i2 = u2.i();
                long a2 = Timeout.f43453e.a(u3.i(), u2.i());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                u2.h(a2, timeUnit);
                if (u2.f()) {
                    long d3 = u2.d();
                    if (u3.f()) {
                        u2.e(Math.min(u2.d(), u3.d()));
                    }
                    try {
                        d2.close();
                        u2.h(i2, timeUnit);
                        if (u3.f()) {
                            u2.e(d3);
                        }
                    } catch (Throwable th) {
                        u2.h(i2, TimeUnit.NANOSECONDS);
                        if (u3.f()) {
                            u2.e(d3);
                        }
                        throw th;
                    }
                } else {
                    if (u3.f()) {
                        u2.e(u3.d());
                    }
                    try {
                        d2.close();
                        u2.h(i2, timeUnit);
                        if (u3.f()) {
                            u2.b();
                        }
                    } catch (Throwable th2) {
                        u2.h(i2, TimeUnit.NANOSECONDS);
                        if (u3.f()) {
                            u2.b();
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            e2.unlock();
            throw th3;
        }
    }

    public void flush() {
        ReentrantLock e2 = this.f43419A.e();
        Pipe pipe = this.f43419A;
        e2.lock();
        try {
            if (pipe.g()) {
                throw new IllegalStateException("closed");
            } else if (!pipe.b()) {
                Sink d2 = pipe.d();
                if (d2 == null) {
                    if (pipe.h()) {
                        if (pipe.a().n0() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                    d2 = null;
                }
                Unit unit = Unit.f40552a;
                e2.unlock();
                if (d2 != null) {
                    Pipe pipe2 = this.f43419A;
                    Timeout u2 = d2.u();
                    Timeout u3 = pipe2.k().u();
                    long i2 = u2.i();
                    long a2 = Timeout.f43453e.a(u3.i(), u2.i());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    u2.h(a2, timeUnit);
                    if (u2.f()) {
                        long d3 = u2.d();
                        if (u3.f()) {
                            u2.e(Math.min(u2.d(), u3.d()));
                        }
                        try {
                            d2.flush();
                            u2.h(i2, timeUnit);
                            if (u3.f()) {
                                u2.e(d3);
                            }
                        } catch (Throwable th) {
                            u2.h(i2, TimeUnit.NANOSECONDS);
                            if (u3.f()) {
                                u2.e(d3);
                            }
                            throw th;
                        }
                    } else {
                        if (u3.f()) {
                            u2.e(u3.d());
                        }
                        try {
                            d2.flush();
                            u2.h(i2, timeUnit);
                            if (u3.f()) {
                                u2.b();
                            }
                        } catch (Throwable th2) {
                            u2.h(i2, TimeUnit.NANOSECONDS);
                            if (u3.f()) {
                                u2.b();
                            }
                            throw th2;
                        }
                    }
                }
            } else {
                throw new IOException("canceled");
            }
        } catch (Throwable th3) {
            e2.unlock();
            throw th3;
        }
    }

    public Timeout u() {
        return this.f43420z;
    }
}
