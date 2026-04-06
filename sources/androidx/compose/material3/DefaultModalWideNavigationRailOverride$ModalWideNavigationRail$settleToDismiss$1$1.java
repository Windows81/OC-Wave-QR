package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1", f = "WideNavigationRail.kt", l = {538, 539}, m = "invokeSuspend")
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ float E;
    public final /* synthetic */ ModalWideNavigationRailOverrideScope F;
    public final /* synthetic */ ModalWideNavigationRailState G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, ModalWideNavigationRailState modalWideNavigationRailState, Continuation continuation) {
        super(2, continuation);
        this.F = modalWideNavigationRailOverrideScope;
        this.G = modalWideNavigationRailState;
    }

    public final Object A(float f2, Continuation continuation) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1) s(Float.valueOf(f2), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((Number) obj).floatValue(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(this.F, this.G, continuation);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1.E = ((Number) obj).floatValue();
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f3 = this.E;
            if (this.F.g()) {
                ModalWideNavigationRailState modalWideNavigationRailState = this.G;
                this.D = 1;
                if (modalWideNavigationRailState.h(f3, this) == f2) {
                    return f2;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!WideNavigationRailStateKt.a(this.G.g())) {
            WideNavigationRailState h2 = this.F.h();
            this.D = 2;
            if (h2.a(this) == f2) {
                return f2;
            }
        }
        return Unit.f40552a;
    }
}
