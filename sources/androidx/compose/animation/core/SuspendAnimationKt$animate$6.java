package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SuspendAnimationKt$animate$6 extends Lambda implements Function1<Long, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f2690A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Animation f2691B;
    public final /* synthetic */ AnimationVector C;
    public final /* synthetic */ AnimationState D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function1 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2692z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$6(Ref.ObjectRef objectRef, Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, float f2, Function1 function1) {
        super(1);
        this.f2692z = objectRef;
        this.f2690A = obj;
        this.f2691B = animation;
        this.C = animationVector;
        this.D = animationState;
        this.E = f2;
        this.F = function1;
    }

    public final void b(long j2) {
        Ref.ObjectRef objectRef = this.f2692z;
        Object obj = this.f2690A;
        TwoWayConverter c2 = this.f2691B.c();
        AnimationVector animationVector = this.C;
        Object g2 = this.f2691B.g();
        final AnimationState animationState = this.D;
        AnimationScope animationScope = new AnimationScope(obj, c2, animationVector, j2, g2, j2, true, new Function0<Unit>() {
            public final void invoke() {
                animationState.x(false);
            }
        });
        SuspendAnimationKt.n(animationScope, j2, this.E, this.f2691B, this.D, this.F);
        objectRef.f40908z = animationScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).longValue());
        return Unit.f40552a;
    }
}
