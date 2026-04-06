package okio;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Pipe$source$1 implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Pipe f43421A;

    /* renamed from: z  reason: collision with root package name */
    public final Timeout f43422z;

    public void close() {
        ReentrantLock e2 = this.f43421A.e();
        Pipe pipe = this.f43421A;
        e2.lock();
        try {
            pipe.j(true);
            pipe.c().signalAll();
            Unit unit = Unit.f40552a;
        } finally {
            e2.unlock();
        }
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        ReentrantLock e2 = this.f43421A.e();
        Pipe pipe = this.f43421A;
        e2.lock();
        try {
            if (pipe.h()) {
                throw new IllegalStateException("closed");
            } else if (!pipe.b()) {
                while (pipe.a().n0() == 0) {
                    if (pipe.g()) {
                        e2.unlock();
                        return -1;
                    }
                    this.f43422z.a(pipe.c());
                    if (pipe.b()) {
                        throw new IOException("canceled");
                    }
                }
                long o1 = pipe.a().o1(buffer, j2);
                pipe.c().signalAll();
                e2.unlock();
                return o1;
            } else {
                throw new IOException("canceled");
            }
        } catch (Throwable th) {
            e2.unlock();
            throw th;
        }
    }

    public Timeout u() {
        return this.f43422z;
    }
}
