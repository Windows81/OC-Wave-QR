package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class MouseWheelScrollingLogic$animateMouseWheelScroll$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MouseWheelScrollingLogic f3539A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NestedScrollScope f3540B;
    public final /* synthetic */ Function1 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f3541z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$animateMouseWheelScroll$2(Ref.FloatRef floatRef, MouseWheelScrollingLogic mouseWheelScrollingLogic, NestedScrollScope nestedScrollScope, Function1 function1) {
        super(1);
        this.f3541z = floatRef;
        this.f3539A = mouseWheelScrollingLogic;
        this.f3540B = nestedScrollScope;
        this.C = function1;
    }

    public final void b(AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.e()).floatValue() - this.f3541z.f40905z;
        if (!MouseWheelScrollableKt.d(floatValue)) {
            if (!MouseWheelScrollableKt.d(floatValue - this.f3539A.q(this.f3540B, floatValue))) {
                animationScope.a();
                return;
            } else {
                this.f3541z.f40905z += floatValue;
            }
        }
        if (((Boolean) this.C.invoke(Float.valueOf(this.f3541z.f40905z))).booleanValue()) {
            animationScope.a();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AnimationScope) obj);
        return Unit.f40552a;
    }
}
