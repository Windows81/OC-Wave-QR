package androidx.core.graphics;

import android.graphics.Rect;

public final class Insets {

    /* renamed from: e  reason: collision with root package name */
    public static final Insets f19773e = new Insets(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f19774a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19775b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19776c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19777d;

    public static class Api29Impl {
        public static android.graphics.Insets a(int i2, int i3, int i4, int i5) {
            return android.graphics.Insets.of(i2, i3, i4, i5);
        }
    }

    public Insets(int i2, int i3, int i4, int i5) {
        this.f19774a = i2;
        this.f19775b = i3;
        this.f19776c = i4;
        this.f19777d = i5;
    }

    public static Insets a(Insets insets, Insets insets2) {
        return b(Math.max(insets.f19774a, insets2.f19774a), Math.max(insets.f19775b, insets2.f19775b), Math.max(insets.f19776c, insets2.f19776c), Math.max(insets.f19777d, insets2.f19777d));
    }

    public static Insets b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f19773e : new Insets(i2, i3, i4, i5);
    }

    public static Insets c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Insets d(android.graphics.Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets e() {
        return Api29Impl.a(this.f19774a, this.f19775b, this.f19776c, this.f19777d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.f19777d == insets.f19777d && this.f19774a == insets.f19774a && this.f19776c == insets.f19776c && this.f19775b == insets.f19775b;
    }

    public int hashCode() {
        return (((((this.f19774a * 31) + this.f19775b) * 31) + this.f19776c) * 31) + this.f19777d;
    }

    public String toString() {
        return "Insets{left=" + this.f19774a + ", top=" + this.f19775b + ", right=" + this.f19776c + ", bottom=" + this.f19777d + '}';
    }
}
