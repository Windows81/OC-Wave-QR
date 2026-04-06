package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class AnimatedShapeState {

    /* renamed from: a  reason: collision with root package name */
    public final RoundedCornerShape f12140a;

    /* renamed from: b  reason: collision with root package name */
    public final FiniteAnimationSpec f12141b;

    /* renamed from: c  reason: collision with root package name */
    public long f12142c;

    /* renamed from: d  reason: collision with root package name */
    public Density f12143d;

    /* renamed from: e  reason: collision with root package name */
    public Animatable f12144e;

    /* renamed from: f  reason: collision with root package name */
    public Animatable f12145f;

    /* renamed from: g  reason: collision with root package name */
    public Animatable f12146g;

    /* renamed from: h  reason: collision with root package name */
    public Animatable f12147h;

    public static /* synthetic */ float g(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.f12142c;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.f12143d;
        }
        return animatedShapeState.f(j2, density);
    }

    public static /* synthetic */ float i(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.f12142c;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.f12143d;
        }
        return animatedShapeState.h(j2, density);
    }

    public static /* synthetic */ float o(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.f12142c;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.f12143d;
        }
        return animatedShapeState.n(j2, density);
    }

    public static /* synthetic */ float q(AnimatedShapeState animatedShapeState, long j2, Density density, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = animatedShapeState.f12142c;
        }
        if ((i2 & 2) != 0) {
            density = animatedShapeState.f12143d;
        }
        return animatedShapeState.p(j2, density);
    }

    public final Object e(CornerBasedShape cornerBasedShape, Continuation continuation) {
        return CoroutineScopeKt.f(new AnimatedShapeState$animateToShape$2(this, cornerBasedShape, (Continuation) null), continuation);
    }

    public final float f(long j2, Density density) {
        Animatable animatable = this.f12147h;
        if (animatable == null) {
            animatable = AnimatableKt.b(this.f12140a.f().a(j2, density), 0.0f, 2, (Object) null);
            this.f12147h = animatable;
        }
        return ((Number) animatable.m()).floatValue();
    }

    public final float h(long j2, Density density) {
        Animatable animatable = this.f12146g;
        if (animatable == null) {
            animatable = AnimatableKt.b(this.f12140a.g().a(j2, density), 0.0f, 2, (Object) null);
            this.f12146g = animatable;
        }
        return ((Number) animatable.m()).floatValue();
    }

    public final Density j() {
        return this.f12143d;
    }

    public final long k() {
        return this.f12142c;
    }

    public final FiniteAnimationSpec l() {
        return this.f12141b;
    }

    public final void m(long j2) {
        this.f12142c = j2;
    }

    public final float n(long j2, Density density) {
        Animatable animatable = this.f12145f;
        if (animatable == null) {
            animatable = AnimatableKt.b(this.f12140a.h().a(j2, density), 0.0f, 2, (Object) null);
            this.f12145f = animatable;
        }
        return ((Number) animatable.m()).floatValue();
    }

    public final float p(long j2, Density density) {
        Animatable animatable = this.f12144e;
        if (animatable == null) {
            animatable = AnimatableKt.b(this.f12140a.i().a(j2, density), 0.0f, 2, (Object) null);
            this.f12144e = animatable;
        }
        return ((Number) animatable.m()).floatValue();
    }
}
