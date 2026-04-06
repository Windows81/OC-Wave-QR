package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import androidx.graphics.path.PathSegment;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class PathIterator implements Iterator<PathSegment>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final ConicEvaluation f21818A;

    /* renamed from: B  reason: collision with root package name */
    public final float f21819B;
    public final PathIteratorImpl C;

    /* renamed from: z  reason: collision with root package name */
    public final Path f21820z;

    @Metadata
    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    public PathIterator(Path path, ConicEvaluation conicEvaluation, float f2) {
        Intrinsics.i(path, "path");
        Intrinsics.i(conicEvaluation, "conicEvaluation");
        this.f21820z = path;
        this.f21818A = conicEvaluation;
        this.f21819B = f2;
        this.C = Build.VERSION.SDK_INT >= 34 ? new PathIteratorApi34Impl(path, conicEvaluation, f2) : new PathIteratorPreApi34Impl(path, conicEvaluation, f2);
    }

    public final PathSegment.Type b(float[] fArr, int i2) {
        Intrinsics.i(fArr, "points");
        return this.C.e(fArr, i2);
    }

    /* renamed from: c */
    public PathSegment next() {
        return this.C.f();
    }

    public boolean hasNext() {
        return this.C.d();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
