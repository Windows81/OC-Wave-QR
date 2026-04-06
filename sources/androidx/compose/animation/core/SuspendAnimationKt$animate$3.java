package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SuspendAnimationKt$animate$3 extends Lambda implements Function1<AnimationScope<Object, AnimationVector>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TwoWayConverter f2687A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f2688z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(Function2 function2, TwoWayConverter twoWayConverter) {
        super(1);
        this.f2688z = function2;
        this.f2687A = twoWayConverter;
    }

    public final void b(AnimationScope animationScope) {
        this.f2688z.m(animationScope.e(), this.f2687A.b().invoke(animationScope.g()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AnimationScope) obj);
        return Unit.f40552a;
    }
}
