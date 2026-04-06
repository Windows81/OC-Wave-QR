package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

@Metadata
public final class FixedLengthSource extends ForwardingSource {

    /* renamed from: A  reason: collision with root package name */
    public final long f43479A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f43480B;
    public long C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(Source source, long j2, boolean z2) {
        super(source);
        Intrinsics.i(source, "delegate");
        this.f43479A = j2;
        this.f43480B = z2;
    }

    public final void b(Buffer buffer, long j2) {
        Buffer buffer2 = new Buffer();
        buffer2.P0(buffer);
        buffer.N0(buffer2, j2);
        buffer2.b();
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        long j3 = this.C;
        long j4 = this.f43479A;
        if (j3 > j4) {
            j2 = 0;
        } else if (this.f43480B) {
            long j5 = j4 - j3;
            if (j5 == 0) {
                return -1;
            }
            j2 = Math.min(j2, j5);
        }
        long o1 = super.o1(buffer, j2);
        int i2 = (o1 > -1 ? 1 : (o1 == -1 ? 0 : -1));
        if (i2 != 0) {
            this.C += o1;
        }
        long j6 = this.C;
        long j7 = this.f43479A;
        if ((j6 >= j7 || i2 != 0) && j6 <= j7) {
            return o1;
        }
        if (o1 > 0 && j6 > j7) {
            b(buffer, buffer.n0() - (this.C - this.f43479A));
        }
        throw new IOException("expected " + this.f43479A + " bytes but got " + this.C);
    }
}
