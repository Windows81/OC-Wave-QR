package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ScrollableDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ScrollableDefaults f3558a = new ScrollableDefaults();

    @Metadata
    public static final class NoOpOverscrollEffect implements OverscrollEffect {

        /* renamed from: a  reason: collision with root package name */
        public static final NoOpOverscrollEffect f3559a = new NoOpOverscrollEffect();

        public DelegatableNode M() {
            return new ScrollableDefaults$NoOpOverscrollEffect$node$1();
        }

        public long N(long j2, int i2, Function1 function1) {
            return ((Offset) function1.invoke(Offset.d(j2))).t();
        }

        public Object O(long j2, Function2 function2, Continuation continuation) {
            Object m2 = function2.m(Velocity.b(j2), continuation);
            return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
        }

        public boolean P() {
            return false;
        }
    }

    public final FlingBehavior a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1107739818, i2, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:536)");
        }
        DecayAnimationSpec b2 = SplineBasedFloatDecayAnimationSpec_androidKt.b(composer, 0);
        boolean W = composer.W(b2);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new DefaultFlingBehavior(b2, (MotionDurationScale) null, 2, (DefaultConstructorMarker) null);
            composer.N(g2);
        }
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return defaultFlingBehavior;
    }

    public final boolean b(LayoutDirection layoutDirection, Orientation orientation, boolean z2) {
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z2 : z2;
    }
}
