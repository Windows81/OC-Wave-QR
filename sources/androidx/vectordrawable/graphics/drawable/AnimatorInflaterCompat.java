package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.TypeEvaluator;
import android.content.Context;
import androidx.core.graphics.PathParser;

public class AnimatorInflaterCompat {

    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* renamed from: a  reason: collision with root package name */
        public PathParser.PathDataNode[] f22971a;

        /* renamed from: a */
        public PathParser.PathDataNode[] evaluate(float f2, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            if (PathParser.b(pathDataNodeArr, pathDataNodeArr2)) {
                if (!PathParser.b(this.f22971a, pathDataNodeArr)) {
                    this.f22971a = PathParser.e(pathDataNodeArr);
                }
                for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                    this.f22971a[i2].h(pathDataNodeArr[i2], pathDataNodeArr2[i2], f2);
                }
                return this.f22971a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator a(Context context, int i2) {
        return AnimatorInflater.loadAnimator(context, i2);
    }
}
