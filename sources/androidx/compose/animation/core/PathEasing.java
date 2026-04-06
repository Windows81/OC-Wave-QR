package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import androidx.compose.ui.graphics.IntervalTree;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PathEasing implements Easing {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2630a;

    /* renamed from: b  reason: collision with root package name */
    public IntervalTree f2631b;

    public float a(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (this.f2631b == null) {
            b();
        }
        IntervalTree intervalTree = this.f2631b;
        if (intervalTree == null) {
            Intrinsics.y("intervals");
            intervalTree = null;
        }
        Object a2 = IntervalTree.d(intervalTree, f2, 0.0f, 2, (Object) null).a();
        if (a2 != null) {
            PathSegment pathSegment = (PathSegment) a2;
            float n2 = BezierKt.n(pathSegment, f2);
            if (Float.isNaN(n2)) {
                PreconditionsKt.b("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
            }
            return BezierKt.j(pathSegment, n2);
        }
        PreconditionsKt.c("The easing path is invalid. Make sure it is continuous on the x axis.");
        throw new KotlinNothingValueException();
    }

    public final void b() {
        boolean z2;
        float[] fArr = new float[5];
        IntervalTree intervalTree = new IntervalTree();
        PathIterator j2 = this.f2630a.j(PathIterator.ConicEvaluation.AsQuadratics, 2.0E-4f);
        while (true) {
            z2 = true;
            if (!j2.hasNext()) {
                break;
            }
            PathSegment next = j2.next();
            if (next.b() == PathSegment.Type.Close) {
                z2 = false;
            }
            if (!z2) {
                PreconditionsKt.a("The path cannot contain a close() command.");
            }
            if (!(next.b() == PathSegment.Type.Move || next.b() == PathSegment.Type.Done)) {
                long d2 = BezierKt.d(next, fArr, 0, 4, (Object) null);
                intervalTree.a(Float.intBitsToFloat((int) (d2 >> 32)), Float.intBitsToFloat((int) (d2 & 4294967295L)), next);
            }
        }
        if (!intervalTree.b(0.0f) || !intervalTree.b(1.0f)) {
            z2 = false;
        }
        if (!z2) {
            PreconditionsKt.a("The easing path must start at 0.0f and end at 1.0f.");
        }
        this.f2631b = intervalTree;
    }
}
