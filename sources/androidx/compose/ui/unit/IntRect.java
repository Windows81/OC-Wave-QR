package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class IntRect {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f19164e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final IntRect f19165f = new IntRect(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f19166a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19167b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19168c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19169d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRect a() {
            return IntRect.f19165f;
        }

        public Companion() {
        }
    }

    public IntRect(int i2, int i3, int i4, int i5) {
        this.f19166a = i2;
        this.f19167b = i3;
        this.f19168c = i4;
        this.f19169d = i5;
    }

    public static /* synthetic */ IntRect c(IntRect intRect, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = intRect.f19166a;
        }
        if ((i6 & 2) != 0) {
            i3 = intRect.f19167b;
        }
        if ((i6 & 4) != 0) {
            i4 = intRect.f19168c;
        }
        if ((i6 & 8) != 0) {
            i5 = intRect.f19169d;
        }
        return intRect.b(i2, i3, i4, i5);
    }

    public final IntRect b(int i2, int i3, int i4, int i5) {
        return new IntRect(i2, i3, i4, i5);
    }

    public final int d() {
        return this.f19169d;
    }

    public final long e() {
        int l2 = this.f19166a + (l() / 2);
        return IntOffset.f((((long) (this.f19167b + (f() / 2))) & 4294967295L) | (((long) l2) << 32));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.f19166a == intRect.f19166a && this.f19167b == intRect.f19167b && this.f19168c == intRect.f19168c && this.f19169d == intRect.f19169d;
    }

    public final int f() {
        return this.f19169d - this.f19167b;
    }

    public final int g() {
        return this.f19166a;
    }

    public final int h() {
        return this.f19168c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f19166a) * 31) + Integer.hashCode(this.f19167b)) * 31) + Integer.hashCode(this.f19168c)) * 31) + Integer.hashCode(this.f19169d);
    }

    public final long i() {
        int l2 = l();
        return IntSize.c((((long) f()) & 4294967295L) | (((long) l2) << 32));
    }

    public final int j() {
        return this.f19167b;
    }

    public final long k() {
        int i2 = this.f19166a;
        return IntOffset.f((((long) this.f19167b) & 4294967295L) | (((long) i2) << 32));
    }

    public final int l() {
        return this.f19168c - this.f19166a;
    }

    public final boolean m() {
        return this.f19166a >= this.f19168c || this.f19167b >= this.f19169d;
    }

    public final IntRect n(int i2, int i3) {
        return new IntRect(this.f19166a + i2, this.f19167b + i3, this.f19168c + i2, this.f19169d + i3);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f19166a + ", " + this.f19167b + ", " + this.f19168c + ", " + this.f19169d + ')';
    }
}
