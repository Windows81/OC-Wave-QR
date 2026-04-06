package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class KotlinRandom extends Random {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f40935B = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public boolean f40936A;

    /* renamed from: z  reason: collision with root package name */
    public final Random f40937z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public int next(int i2) {
        return this.f40937z.b(i2);
    }

    public boolean nextBoolean() {
        return this.f40937z.c();
    }

    public void nextBytes(byte[] bArr) {
        Intrinsics.i(bArr, "bytes");
        this.f40937z.d(bArr);
    }

    public double nextDouble() {
        return this.f40937z.f();
    }

    public float nextFloat() {
        return this.f40937z.g();
    }

    public int nextInt() {
        return this.f40937z.h();
    }

    public long nextLong() {
        return this.f40937z.k();
    }

    public void setSeed(long j2) {
        if (!this.f40936A) {
            this.f40936A = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public int nextInt(int i2) {
        return this.f40937z.i(i2);
    }
}
