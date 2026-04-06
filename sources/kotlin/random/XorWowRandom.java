package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class XorWowRandom extends Random implements Serializable {
    public static final Companion H = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public int f40942B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public int b(int i2) {
        return RandomKt.d(h(), i2);
    }

    public int h() {
        int i2 = this.f40942B;
        int i3 = i2 ^ (i2 >>> 2);
        this.f40942B = this.C;
        this.C = this.D;
        this.D = this.E;
        int i4 = this.F;
        this.E = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.F = i5;
        int i6 = this.G + 362437;
        this.G = i6;
        return i5 + i6;
    }
}
