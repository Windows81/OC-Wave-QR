package androidx.graphics.path;

import androidx.graphics.path.PathSegment;
import kotlin.Metadata;

@Metadata
public final class PathIteratorImplKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PathSegment.Type[] f21832a = PathSegment.Type.values();

    public static final PathSegment.Type c(int i2) {
        switch (i2) {
            case 0:
                return PathSegment.Type.Move;
            case 1:
                return PathSegment.Type.Line;
            case 2:
                return PathSegment.Type.Quadratic;
            case 3:
                return PathSegment.Type.Conic;
            case 4:
                return PathSegment.Type.Cubic;
            case 5:
                return PathSegment.Type.Close;
            case 6:
                return PathSegment.Type.Done;
            default:
                throw new IllegalArgumentException("Unknown path segment type " + i2);
        }
    }
}
