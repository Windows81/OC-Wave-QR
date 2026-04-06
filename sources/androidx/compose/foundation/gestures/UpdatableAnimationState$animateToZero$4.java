package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class UpdatableAnimationState$animateToZero$4 extends Lambda implements Function1<Long, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f3639A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f3640B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ UpdatableAnimationState f3641z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$4(UpdatableAnimationState updatableAnimationState, float f2, Function1 function1) {
        super(1);
        this.f3641z = updatableAnimationState;
        this.f3639A = f2;
        this.f3640B = function1;
    }

    public final void b(long j2) {
        if (this.f3641z.f3635b == Long.MIN_VALUE) {
            this.f3641z.f3635b = j2;
        }
        AnimationVector1D animationVector1D = new AnimationVector1D(this.f3641z.i());
        long b2 = this.f3639A == 0.0f ? this.f3641z.f3634a.b(new AnimationVector1D(this.f3641z.i()), UpdatableAnimationState.f3631f.a(), this.f3641z.f3636c) : MathKt.f(((float) (j2 - this.f3641z.f3635b)) / this.f3639A);
        AnimationVector1D animationVector1D2 = animationVector1D;
        float f2 = ((AnimationVector1D) this.f3641z.f3634a.f(b2, animationVector1D2, UpdatableAnimationState.f3631f.a(), this.f3641z.f3636c)).f();
        UpdatableAnimationState updatableAnimationState = this.f3641z;
        updatableAnimationState.f3636c = (AnimationVector1D) updatableAnimationState.f3634a.c(b2, animationVector1D2, UpdatableAnimationState.f3631f.a(), this.f3641z.f3636c);
        this.f3641z.f3635b = j2;
        this.f3641z.j(f2);
        this.f3640B.invoke(Float.valueOf(this.f3641z.i() - f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).longValue());
        return Unit.f40552a;
    }
}
