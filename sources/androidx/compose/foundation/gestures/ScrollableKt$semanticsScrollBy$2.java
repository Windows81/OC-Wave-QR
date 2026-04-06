package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1024}, m = "invokeSuspend")
public final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ScrollingLogic F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Ref.FloatRef H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j2, Ref.FloatRef floatRef, Continuation continuation) {
        super(2, continuation);
        this.F = scrollingLogic;
        this.G = j2;
        this.H = floatRef;
    }

    /* renamed from: A */
    public final Object m(NestedScrollScope nestedScrollScope, Continuation continuation) {
        return ((ScrollableKt$semanticsScrollBy$2) s(nestedScrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.F, this.G, this.H, continuation);
        scrollableKt$semanticsScrollBy$2.E = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.E;
            float F2 = this.F.F(this.G);
            final Ref.FloatRef floatRef = this.H;
            final ScrollingLogic scrollingLogic = this.F;
            AnonymousClass1 r9 = new Function2<Float, Float, Unit>() {
                public final void b(float f2, float f3) {
                    float f4 = f2 - floatRef.f40905z;
                    ScrollingLogic scrollingLogic = scrollingLogic;
                    floatRef.f40905z += scrollingLogic.x(scrollingLogic.F(nestedScrollScope.b(scrollingLogic.G(scrollingLogic.x(f4)), NestedScrollSource.f16795b.b())));
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (SuspendAnimationKt.e(0.0f, F2, 0.0f, (AnimationSpec) null, r9, this, 12, (Object) null) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
