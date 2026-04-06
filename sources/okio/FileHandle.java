package okio;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class FileHandle implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public boolean f43357A;

    /* renamed from: B  reason: collision with root package name */
    public int f43358B;
    public final ReentrantLock C = _JvmPlatformKt.b();

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43359z;

    @Metadata
    public static final class FileHandleSink implements Sink {

        /* renamed from: A  reason: collision with root package name */
        public long f43360A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f43361B;

        /* renamed from: z  reason: collision with root package name */
        public final FileHandle f43362z;

        public FileHandleSink(FileHandle fileHandle, long j2) {
            Intrinsics.i(fileHandle, "fileHandle");
            this.f43362z = fileHandle;
            this.f43360A = j2;
        }

        public void N0(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "source");
            if (!this.f43361B) {
                this.f43362z.D(this.f43360A, buffer, j2);
                this.f43360A += j2;
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() {
            if (!this.f43361B) {
                this.f43361B = true;
                ReentrantLock g2 = this.f43362z.g();
                g2.lock();
                try {
                    FileHandle fileHandle = this.f43362z;
                    fileHandle.f43358B = fileHandle.f43358B - 1;
                    if (this.f43362z.f43358B == 0) {
                        if (this.f43362z.f43357A) {
                            Unit unit = Unit.f40552a;
                            g2.unlock();
                            this.f43362z.j();
                        }
                    }
                } finally {
                    g2.unlock();
                }
            }
        }

        public void flush() {
            if (!this.f43361B) {
                this.f43362z.k();
                return;
            }
            throw new IllegalStateException("closed");
        }

        public Timeout u() {
            return Timeout.f43454f;
        }
    }

    @Metadata
    public static final class FileHandleSource implements Source {

        /* renamed from: A  reason: collision with root package name */
        public long f43363A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f43364B;

        /* renamed from: z  reason: collision with root package name */
        public final FileHandle f43365z;

        public FileHandleSource(FileHandle fileHandle, long j2) {
            Intrinsics.i(fileHandle, "fileHandle");
            this.f43365z = fileHandle;
            this.f43363A = j2;
        }

        public void close() {
            if (!this.f43364B) {
                this.f43364B = true;
                ReentrantLock g2 = this.f43365z.g();
                g2.lock();
                try {
                    FileHandle fileHandle = this.f43365z;
                    fileHandle.f43358B = fileHandle.f43358B - 1;
                    if (this.f43365z.f43358B == 0) {
                        if (this.f43365z.f43357A) {
                            Unit unit = Unit.f40552a;
                            g2.unlock();
                            this.f43365z.j();
                        }
                    }
                } finally {
                    g2.unlock();
                }
            }
        }

        public long o1(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "sink");
            if (!this.f43364B) {
                long c2 = this.f43365z.t(this.f43363A, buffer, j2);
                if (c2 != -1) {
                    this.f43363A += c2;
                }
                return c2;
            }
            throw new IllegalStateException("closed");
        }

        public Timeout u() {
            return Timeout.f43454f;
        }
    }

    public FileHandle(boolean z2) {
        this.f43359z = z2;
    }

    public static /* synthetic */ Sink y(FileHandle fileHandle, long j2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                j2 = 0;
            }
            return fileHandle.x(j2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    /* JADX INFO: finally extract failed */
    public final long A() {
        ReentrantLock reentrantLock = this.C;
        reentrantLock.lock();
        try {
            if (!this.f43357A) {
                Unit unit = Unit.f40552a;
                reentrantLock.unlock();
                return m();
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final Source C(long j2) {
        ReentrantLock reentrantLock = this.C;
        reentrantLock.lock();
        try {
            if (!this.f43357A) {
                this.f43358B++;
                reentrantLock.unlock();
                return new FileHandleSource(this, j2);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void D(long j2, Buffer buffer, long j3) {
        SegmentedByteString.b(buffer.n0(), 0, j3);
        long j4 = j3 + j2;
        while (j2 < j4) {
            Segment segment = buffer.f43339z;
            Intrinsics.f(segment);
            int min = (int) Math.min(j4 - j2, (long) (segment.f43434c - segment.f43433b));
            r(j2, segment.f43432a, segment.f43433b, min);
            segment.f43433b += min;
            long j5 = (long) min;
            j2 += j5;
            buffer.m0(buffer.n0() - j5);
            if (segment.f43433b == segment.f43434c) {
                buffer.f43339z = segment.b();
                SegmentPool.b(segment);
            }
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.C;
        reentrantLock.lock();
        try {
            if (!this.f43357A) {
                this.f43357A = true;
                if (this.f43358B != 0) {
                    reentrantLock.unlock();
                    return;
                }
                Unit unit = Unit.f40552a;
                reentrantLock.unlock();
                j();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void flush() {
        if (this.f43359z) {
            ReentrantLock reentrantLock = this.C;
            reentrantLock.lock();
            try {
                if (!this.f43357A) {
                    Unit unit = Unit.f40552a;
                    reentrantLock.unlock();
                    k();
                    return;
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }

    public final ReentrantLock g() {
        return this.C;
    }

    public abstract void j();

    public abstract void k();

    public abstract int l(long j2, byte[] bArr, int i2, int i3);

    public abstract long m();

    public abstract void r(long j2, byte[] bArr, int i2, int i3);

    public final long t(long j2, Buffer buffer, long j3) {
        Buffer buffer2 = buffer;
        long j4 = j3;
        if (j4 >= 0) {
            long j5 = j4 + j2;
            long j6 = j2;
            while (true) {
                if (j6 >= j5) {
                    break;
                }
                Segment t0 = buffer2.t0(1);
                byte[] bArr = t0.f43432a;
                int i2 = t0.f43434c;
                int l2 = l(j6, bArr, i2, (int) Math.min(j5 - j6, (long) (8192 - i2)));
                if (l2 == -1) {
                    if (t0.f43433b == t0.f43434c) {
                        buffer2.f43339z = t0.b();
                        SegmentPool.b(t0);
                    }
                    if (j2 == j6) {
                        return -1;
                    }
                } else {
                    t0.f43434c += l2;
                    long j7 = (long) l2;
                    j6 += j7;
                    buffer2.m0(buffer.n0() + j7);
                }
            }
            return j6 - j2;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
    }

    /* JADX INFO: finally extract failed */
    public final Sink x(long j2) {
        if (this.f43359z) {
            ReentrantLock reentrantLock = this.C;
            reentrantLock.lock();
            try {
                if (!this.f43357A) {
                    this.f43358B++;
                    reentrantLock.unlock();
                    return new FileHandleSink(this, j2);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }
}
