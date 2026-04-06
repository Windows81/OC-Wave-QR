package androidx.compose.material3.carousel;

import kotlin.Metadata;

@Metadata
public final class Keyline {

    /* renamed from: a  reason: collision with root package name */
    public final float f11930a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11931b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11932c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11933d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11934e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11935f;

    /* renamed from: g  reason: collision with root package name */
    public final float f11936g;

    public Keyline(float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, float f5) {
        this.f11930a = f2;
        this.f11931b = f3;
        this.f11932c = f4;
        this.f11933d = z2;
        this.f11934e = z3;
        this.f11935f = z4;
        this.f11936g = f5;
    }

    public static /* synthetic */ Keyline b(Keyline keyline, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = keyline.f11930a;
        }
        if ((i2 & 2) != 0) {
            f3 = keyline.f11931b;
        }
        float f6 = f3;
        if ((i2 & 4) != 0) {
            f4 = keyline.f11932c;
        }
        float f7 = f4;
        if ((i2 & 8) != 0) {
            z2 = keyline.f11933d;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            z3 = keyline.f11934e;
        }
        boolean z6 = z3;
        if ((i2 & 32) != 0) {
            z4 = keyline.f11935f;
        }
        boolean z7 = z4;
        if ((i2 & 64) != 0) {
            f5 = keyline.f11936g;
        }
        return keyline.a(f2, f6, f7, z5, z6, z7, f5);
    }

    public final Keyline a(float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, float f5) {
        return new Keyline(f2, f3, f4, z2, z3, z4, f5);
    }

    public final float c() {
        return this.f11936g;
    }

    public final float d() {
        return this.f11931b;
    }

    public final float e() {
        return this.f11930a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.f11930a, keyline.f11930a) == 0 && Float.compare(this.f11931b, keyline.f11931b) == 0 && Float.compare(this.f11932c, keyline.f11932c) == 0 && this.f11933d == keyline.f11933d && this.f11934e == keyline.f11934e && this.f11935f == keyline.f11935f && Float.compare(this.f11936g, keyline.f11936g) == 0;
    }

    public final float f() {
        return this.f11932c;
    }

    public final boolean g() {
        return this.f11934e;
    }

    public final boolean h() {
        return this.f11933d;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.f11930a) * 31) + Float.hashCode(this.f11931b)) * 31) + Float.hashCode(this.f11932c)) * 31) + Boolean.hashCode(this.f11933d)) * 31) + Boolean.hashCode(this.f11934e)) * 31) + Boolean.hashCode(this.f11935f)) * 31) + Float.hashCode(this.f11936g);
    }

    public final boolean i() {
        return this.f11935f;
    }

    public String toString() {
        return "Keyline(size=" + this.f11930a + ", offset=" + this.f11931b + ", unadjustedOffset=" + this.f11932c + ", isFocal=" + this.f11933d + ", isAnchor=" + this.f11934e + ", isPivot=" + this.f11935f + ", cutoff=" + this.f11936g + ')';
    }
}
