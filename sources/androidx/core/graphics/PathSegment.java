package androidx.core.graphics;

import android.graphics.PointF;

public final class PathSegment {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f19783a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19784b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f19785c;

    /* renamed from: d  reason: collision with root package name */
    public final float f19786d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.f19784b, pathSegment.f19784b) == 0 && Float.compare(this.f19786d, pathSegment.f19786d) == 0 && this.f19783a.equals(pathSegment.f19783a) && this.f19785c.equals(pathSegment.f19785c);
    }

    public int hashCode() {
        int hashCode = this.f19783a.hashCode() * 31;
        float f2 = this.f19784b;
        int i2 = 0;
        int floatToIntBits = (((hashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f19785c.hashCode()) * 31;
        float f3 = this.f19786d;
        if (f3 != 0.0f) {
            i2 = Float.floatToIntBits(f3);
        }
        return floatToIntBits + i2;
    }

    public String toString() {
        return "PathSegment{start=" + this.f19783a + ", startFraction=" + this.f19784b + ", end=" + this.f19785c + ", endFraction=" + this.f19786d + '}';
    }
}
