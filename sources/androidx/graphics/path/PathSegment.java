package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PathSegment {

    /* renamed from: a  reason: collision with root package name */
    public final Type f21834a;

    /* renamed from: b  reason: collision with root package name */
    public final PointF[] f21835b;

    /* renamed from: c  reason: collision with root package name */
    public final float f21836c;

    @Metadata
    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(Type type, PointF[] pointFArr, float f2) {
        Intrinsics.i(type, "type");
        Intrinsics.i(pointFArr, "points");
        this.f21834a = type;
        this.f21835b = pointFArr;
        this.f21836c = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(PathSegment.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.f21834a == pathSegment.f21834a && Arrays.equals(this.f21835b, pathSegment.f21835b) && this.f21836c == pathSegment.f21836c;
    }

    public int hashCode() {
        return (((this.f21834a.hashCode() * 31) + Arrays.hashCode(this.f21835b)) * 31) + Float.hashCode(this.f21836c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathSegment(type=");
        sb.append(this.f21834a);
        sb.append(", points=");
        String arrays = Arrays.toString(this.f21835b);
        Intrinsics.h(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", weight=");
        sb.append(this.f21836c);
        sb.append(')');
        return sb.toString();
    }
}
