package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComposableLambdaKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15130a = new Object();

    public static final int a(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final ComposableLambda b(Composer composer, int i2, boolean z2, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.r(Integer.rotateLeft(i2, 1), f15130a);
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            composableLambdaImpl = new ComposableLambdaImpl(i2, z2, obj);
            composer.N(composableLambdaImpl);
        } else {
            Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) g2;
            composableLambdaImpl.A(obj);
        }
        composer.Q();
        return composableLambdaImpl;
    }

    public static final ComposableLambda c(int i2, boolean z2, Object obj) {
        return new ComposableLambdaImpl(i2, z2, obj);
    }

    public static final int d(int i2) {
        return a(2, i2);
    }

    public static final ComposableLambda e(int i2, boolean z2, Object obj, Composer composer, int i3) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1573003438, i3, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new ComposableLambdaImpl(i2, z2, obj);
            composer.N(g2);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) g2;
        composableLambdaImpl.A(obj);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return composableLambdaImpl;
    }

    public static final boolean f(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.u() || Intrinsics.d(recomposeScope, recomposeScope2) || Intrinsics.d(recomposeScopeImpl.h(), ((RecomposeScopeImpl) recomposeScope2).h())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final int g(int i2) {
        return a(1, i2);
    }
}
