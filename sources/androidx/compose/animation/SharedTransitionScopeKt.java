package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LookaheadScopeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SharedTransitionScopeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SpringSpec f2363a = AnimationSpecKt.l(0.0f, 400.0f, VisibilityThresholdsKt.g(Rect.f15860e), 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final SharedTransitionScope.OverlayClip f2364b = new SharedTransitionScopeKt$ParentClip$1();

    /* renamed from: c  reason: collision with root package name */
    public static final Function2 f2365c = SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1.f2369z;

    /* renamed from: d  reason: collision with root package name */
    public static final BoundsTransform f2366d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final MutableScatterMap f2367e = new MutableScatterMap(0, 1, (DefaultConstructorMarker) null);

    public static final FiniteAnimationSpec b(Rect rect, Rect rect2) {
        return f2363a;
    }

    public static final void c(Modifier modifier, Function3 function3, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(2043053727);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function3) ? 32 : 16;
        }
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(2043053727, i4, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:98)");
            }
            d(ComposableLambdaKt.e(-130587847, true, new SharedTransitionScopeKt$SharedTransitionLayout$1(modifier, function3), q2, 54), q2, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SharedTransitionScopeKt$SharedTransitionLayout$2(modifier, function3, i2, i3));
        }
    }

    public static final void d(Function4 function4, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-2093217917);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function4) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2093217917, i3, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:121)");
            }
            LookaheadScopeKt.a(ComposableLambdaKt.e(-863967934, true, new SharedTransitionScopeKt$SharedTransitionScope$1(function4), q2, 54), q2, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SharedTransitionScopeKt$SharedTransitionScope$2(function4, i2));
        }
    }
}
