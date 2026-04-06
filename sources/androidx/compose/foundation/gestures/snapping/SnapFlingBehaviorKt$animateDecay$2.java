package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SnapFlingBehaviorKt$animateDecay$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f3669A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ScrollScope f3670B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f3671z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehaviorKt$animateDecay$2(float f2, Ref.FloatRef floatRef, ScrollScope scrollScope, Function1 function1) {
        super(1);
        this.f3671z = f2;
        this.f3669A = floatRef;
        this.f3670B = scrollScope;
        this.C = function1;
    }

    public final void b(AnimationScope animationScope) {
        if (Math.abs(((Number) animationScope.e()).floatValue()) >= Math.abs(this.f3671z)) {
            float e2 = SnapFlingBehaviorKt.l(((Number) animationScope.e()).floatValue(), this.f3671z);
            SnapFlingBehaviorKt.g(animationScope, this.f3670B, this.C, e2 - this.f3669A.f40905z);
            animationScope.a();
            this.f3669A.f40905z = e2;
            return;
        }
        SnapFlingBehaviorKt.g(animationScope, this.f3670B, this.C, ((Number) animationScope.e()).floatValue() - this.f3669A.f40905z);
        this.f3669A.f40905z = ((Number) animationScope.e()).floatValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AnimationScope) obj);
        return Unit.f40552a;
    }
}
