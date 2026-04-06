package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {

    /* renamed from: f  reason: collision with root package name */
    public final long f21833f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        super(path, conicEvaluation, f2);
        Intrinsics.i(path, "path");
        Intrinsics.i(conicEvaluation, "conicEvaluation");
        this.f21833f = createInternalPathIterator(path, conicEvaluation.ordinal(), f2);
    }

    private final native long createInternalPathIterator(Path path, int i2, float f2);

    private final native void destroyInternalPathIterator(long j2);

    private final native boolean internalPathIteratorHasNext(long j2);

    private final native int internalPathIteratorNext(long j2, float[] fArr, int i2);

    private final native int internalPathIteratorPeek(long j2);

    private final native int internalPathIteratorRawSize(long j2);

    private final native int internalPathIteratorSize(long j2);

    public boolean d() {
        return internalPathIteratorHasNext(this.f21833f);
    }

    public PathSegment.Type e(float[] fArr, int i2) {
        Intrinsics.i(fArr, "points");
        return PathIteratorImplKt.f21832a[internalPathIteratorNext(this.f21833f, fArr, i2)];
    }

    public final void finalize() {
        destroyInternalPathIterator(this.f21833f);
    }
}
