package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;

@Metadata
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {

    /* renamed from: a  reason: collision with root package name */
    public DecayAnimationSpec f3431a;

    /* renamed from: b  reason: collision with root package name */
    public final MotionDurationScale f3432b;

    /* renamed from: c  reason: collision with root package name */
    public int f3433c;

    public DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale) {
        this.f3431a = decayAnimationSpec;
        this.f3432b = motionDurationScale;
    }

    public Object a(ScrollScope scrollScope, float f2, Continuation continuation) {
        this.f3433c = 0;
        return BuildersKt.g(this.f3432b, new DefaultFlingBehavior$performFling$2(f2, this, scrollScope, (Continuation) null), continuation);
    }

    public final int e() {
        return this.f3433c;
    }

    public final void f(int i2) {
        this.f3433c = i2;
    }

    public void g(Density density) {
        this.f3431a = SplineBasedDecayKt.c(density);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i2 & 2) != 0 ? ScrollableKt.f() : motionDurationScale);
    }
}
