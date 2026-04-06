package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

@ElementTypesAreNonnullByDefault
@Immutable
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    public static final HashFunction D = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);

    /* renamed from: A  reason: collision with root package name */
    public final int f28919A;

    /* renamed from: B  reason: collision with root package name */
    public final long f28920B;
    public final long C;

    /* renamed from: z  reason: collision with root package name */
    public final int f28921z;

    public static final class SipHasher extends AbstractStreamingHasher {

        /* renamed from: d  reason: collision with root package name */
        public final int f28922d;

        /* renamed from: e  reason: collision with root package name */
        public final int f28923e;

        /* renamed from: f  reason: collision with root package name */
        public long f28924f;

        /* renamed from: g  reason: collision with root package name */
        public long f28925g;

        /* renamed from: h  reason: collision with root package name */
        public long f28926h;

        /* renamed from: i  reason: collision with root package name */
        public long f28927i;

        /* renamed from: j  reason: collision with root package name */
        public long f28928j = 0;

        /* renamed from: k  reason: collision with root package name */
        public long f28929k = 0;

        public SipHasher(int i2, int i3, long j2, long j3) {
            super(8);
            this.f28922d = i2;
            this.f28923e = i3;
            this.f28924f = 8317987319222330741L ^ j2;
            this.f28925g = 7237128888997146477L ^ j3;
            this.f28926h = 7816392313619706465L ^ j2;
            this.f28927i = 8387220255154660723L ^ j3;
        }

        public HashCode k() {
            long j2 = this.f28929k ^ (this.f28928j << 56);
            this.f28929k = j2;
            q(j2);
            this.f28926h ^= 255;
            r(this.f28923e);
            return HashCode.h(((this.f28924f ^ this.f28925g) ^ this.f28926h) ^ this.f28927i);
        }

        public void n(ByteBuffer byteBuffer) {
            this.f28928j += 8;
            q(byteBuffer.getLong());
        }

        public void o(ByteBuffer byteBuffer) {
            this.f28928j += (long) byteBuffer.remaining();
            int i2 = 0;
            while (byteBuffer.hasRemaining()) {
                this.f28929k ^= (((long) byteBuffer.get()) & 255) << i2;
                i2 += 8;
            }
        }

        public final void q(long j2) {
            this.f28927i ^= j2;
            r(this.f28922d);
            this.f28924f = j2 ^ this.f28924f;
        }

        public final void r(int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = this.f28924f;
                long j3 = this.f28925g;
                this.f28924f = j2 + j3;
                this.f28926h += this.f28927i;
                this.f28925g = Long.rotateLeft(j3, 13);
                long rotateLeft = Long.rotateLeft(this.f28927i, 16);
                long j4 = this.f28925g;
                long j5 = this.f28924f;
                this.f28925g = j4 ^ j5;
                this.f28927i = rotateLeft ^ this.f28926h;
                long rotateLeft2 = Long.rotateLeft(j5, 32);
                long j6 = this.f28926h;
                long j7 = this.f28925g;
                this.f28926h = j6 + j7;
                this.f28924f = rotateLeft2 + this.f28927i;
                this.f28925g = Long.rotateLeft(j7, 17);
                long rotateLeft3 = Long.rotateLeft(this.f28927i, 21);
                long j8 = this.f28925g;
                long j9 = this.f28926h;
                this.f28925g = j8 ^ j9;
                this.f28927i = rotateLeft3 ^ this.f28924f;
                this.f28926h = Long.rotateLeft(j9, 32);
            }
        }
    }

    public SipHashFunction(int i2, int i3, long j2, long j3) {
        boolean z2 = false;
        Preconditions.g(i2 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i2);
        Preconditions.g(i3 > 0 ? true : z2, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i3);
        this.f28921z = i2;
        this.f28919A = i3;
        this.f28920B = j2;
        this.C = j3;
    }

    public Hasher a() {
        return new SipHasher(this.f28921z, this.f28919A, this.f28920B, this.C);
    }

    public int c() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        return this.f28921z == sipHashFunction.f28921z && this.f28919A == sipHashFunction.f28919A && this.f28920B == sipHashFunction.f28920B && this.C == sipHashFunction.C;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f28921z) ^ this.f28919A)) ^ this.f28920B) ^ this.C);
    }

    public String toString() {
        int i2 = this.f28921z;
        int i3 = this.f28919A;
        long j2 = this.f28920B;
        long j3 = this.C;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i2);
        sb.append(i3);
        sb.append("(");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
