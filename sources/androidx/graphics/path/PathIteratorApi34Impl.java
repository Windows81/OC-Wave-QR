package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PathIterator;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PathIteratorApi34Impl extends PathIteratorImpl {

    /* renamed from: f  reason: collision with root package name */
    public final PathIterator f21824f;

    /* renamed from: g  reason: collision with root package name */
    public final ConicConverter f21825g = new ConicConverter();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        super(path, conicEvaluation, f2);
        Intrinsics.i(path, "path");
        Intrinsics.i(conicEvaluation, "conicEvaluation");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        Intrinsics.h(pathIterator, "path.pathIterator");
        this.f21824f = pathIterator;
    }

    public boolean d() {
        return this.f21824f.hasNext();
    }

    public PathSegment.Type e(float[] fArr, int i2) {
        Intrinsics.i(fArr, "points");
        if (this.f21825g.b() < this.f21825g.c()) {
            this.f21825g.d(fArr, i2);
            return PathSegment.Type.Quadratic;
        }
        PathSegment.Type b2 = PathIteratorImplKt.c(this.f21824f.next(fArr, i2));
        if (b2 != PathSegment.Type.Conic || b() != PathIterator.ConicEvaluation.AsQuadratics) {
            return b2;
        }
        ConicConverter conicConverter = this.f21825g;
        conicConverter.a(fArr, fArr[i2 + 6], c(), i2);
        if (conicConverter.c() > 0) {
            conicConverter.d(fArr, i2);
        }
        return PathSegment.Type.Quadratic;
    }
}
