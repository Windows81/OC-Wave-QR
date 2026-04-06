package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SuspendAnimationKt$animate$9 extends Lambda implements Function1<Long, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f2695A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Animation f2696B;
    public final /* synthetic */ AnimationState C;
    public final /* synthetic */ Function1 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2697z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$9(Ref.ObjectRef objectRef, float f2, Animation animation, AnimationState animationState, Function1 function1) {
        super(1);
        this.f2697z = objectRef;
        this.f2695A = f2;
        this.f2696B = animation;
        this.C = animationState;
        this.D = function1;
    }

    public final void b(long j2) {
        Object obj = this.f2697z.f40908z;
        Intrinsics.f(obj);
        SuspendAnimationKt.n((AnimationScope) obj, j2, this.f2695A, this.f2696B, this.C, this.D);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).longValue());
        return Unit.f40552a;
    }
}
