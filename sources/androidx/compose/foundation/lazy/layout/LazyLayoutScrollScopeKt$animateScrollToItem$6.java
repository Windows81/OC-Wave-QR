package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyLayoutScrollScopeKt$animateScrollToItem$6 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f4923A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutScrollScope f4924B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f4925z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutScrollScopeKt$animateScrollToItem$6(float f2, Ref.FloatRef floatRef, LazyLayoutScrollScope lazyLayoutScrollScope) {
        super(1);
        this.f4925z = f2;
        this.f4923A = floatRef;
        this.f4924B = lazyLayoutScrollScope;
    }

    public final void b(AnimationScope animationScope) {
        float f2 = this.f4925z;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = RangesKt.i(((Number) animationScope.e()).floatValue(), this.f4925z);
        } else if (f2 < 0.0f) {
            f3 = RangesKt.d(((Number) animationScope.e()).floatValue(), this.f4925z);
        }
        float f4 = f3 - this.f4923A.f40905z;
        if (!(f4 == this.f4924B.g(f4) && f3 == ((Number) animationScope.e()).floatValue())) {
            animationScope.a();
        }
        this.f4923A.f40905z += f4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AnimationScope) obj);
        return Unit.f40552a;
    }
}
