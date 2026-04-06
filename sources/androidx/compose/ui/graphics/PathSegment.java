package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PathSegment {

    /* renamed from: a  reason: collision with root package name */
    public final Type f16088a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f16089b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16090c;

    @Metadata
    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done;

        static {
            Type[] d2;
            H = EnumEntriesKt.a(d2);
        }
    }

    public PathSegment(Type type, float[] fArr, float f2) {
        this.f16088a = type;
        this.f16089b = fArr;
        this.f16090c = f2;
    }

    public final float[] a() {
        return this.f16089b;
    }

    public final Type b() {
        return this.f16088a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.f16088a == pathSegment.f16088a && Arrays.equals(this.f16089b, pathSegment.f16089b) && this.f16090c == pathSegment.f16090c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f16088a.hashCode() * 31) + Arrays.hashCode(this.f16089b)) * 31) + Float.hashCode(this.f16090c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathSegment(type=");
        sb.append(this.f16088a);
        sb.append(", points=");
        String arrays = Arrays.toString(this.f16089b);
        Intrinsics.h(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", weight=");
        sb.append(this.f16090c);
        sb.append(')');
        return sb.toString();
    }
}
