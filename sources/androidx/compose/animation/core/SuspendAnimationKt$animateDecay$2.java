package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SuspendAnimationKt$animateDecay$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f2698z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(Function2 function2) {
        super(1);
        this.f2698z = function2;
    }

    public final void b(AnimationScope animationScope) {
        this.f2698z.m(animationScope.e(), Float.valueOf(((AnimationVector1D) animationScope.g()).f()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AnimationScope) obj);
        return Unit.f40552a;
    }
}
