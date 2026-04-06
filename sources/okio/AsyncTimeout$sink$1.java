package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AsyncTimeout$sink$1 implements Sink {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Sink f43334A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AsyncTimeout f43335z;

    public AsyncTimeout$sink$1(AsyncTimeout asyncTimeout, Sink sink) {
        this.f43335z = asyncTimeout;
        this.f43334A = sink;
    }

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        SegmentedByteString.b(buffer.n0(), 0, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                Segment segment = buffer.f43339z;
                Intrinsics.f(segment);
                while (true) {
                    if (j3 >= 65536) {
                        break;
                    }
                    j3 += (long) (segment.f43434c - segment.f43433b);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        segment = segment.f43437f;
                        Intrinsics.f(segment);
                    }
                }
                AsyncTimeout asyncTimeout = this.f43335z;
                Sink sink = this.f43334A;
                asyncTimeout.x();
                try {
                    sink.N0(buffer, j3);
                    Unit unit = Unit.f40552a;
                    if (!asyncTimeout.y()) {
                        j2 -= j3;
                    } else {
                        throw asyncTimeout.r((IOException) null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (asyncTimeout.y()) {
                        e = asyncTimeout.r(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.y();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public AsyncTimeout u() {
        return this.f43335z;
    }

    public void close() {
        AsyncTimeout asyncTimeout = this.f43335z;
        Sink sink = this.f43334A;
        asyncTimeout.x();
        try {
            sink.close();
            Unit unit = Unit.f40552a;
            if (asyncTimeout.y()) {
                throw asyncTimeout.r((IOException) null);
            }
        } catch (IOException e2) {
            e = e2;
            if (asyncTimeout.y()) {
                e = asyncTimeout.r(e);
            }
            throw e;
        } finally {
            asyncTimeout.y();
        }
    }

    public void flush() {
        AsyncTimeout asyncTimeout = this.f43335z;
        Sink sink = this.f43334A;
        asyncTimeout.x();
        try {
            sink.flush();
            Unit unit = Unit.f40552a;
            if (asyncTimeout.y()) {
                throw asyncTimeout.r((IOException) null);
            }
        } catch (IOException e2) {
            e = e2;
            if (asyncTimeout.y()) {
                e = asyncTimeout.r(e);
            }
            throw e;
        } finally {
            asyncTimeout.y();
        }
    }

    public String toString() {
        return "AsyncTimeout.sink(" + this.f43334A + ')';
    }
}
