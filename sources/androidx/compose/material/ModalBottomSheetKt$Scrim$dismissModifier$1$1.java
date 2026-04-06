package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {497}, m = "invokeSuspend")
public final class ModalBottomSheetKt$Scrim$dismissModifier$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$dismissModifier$1$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
    }

    /* renamed from: A */
    public final Object m(PointerInputScope pointerInputScope, Continuation continuation) {
        return ((ModalBottomSheetKt$Scrim$dismissModifier$1$1) s(pointerInputScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ModalBottomSheetKt$Scrim$dismissModifier$1$1 modalBottomSheetKt$Scrim$dismissModifier$1$1 = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(this.F, continuation);
        modalBottomSheetKt$Scrim$dismissModifier$1$1.E = obj;
        return modalBottomSheetKt$Scrim$dismissModifier$1$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final Function0 function0 = this.F;
            AnonymousClass1 r7 = new Function1<Offset, Unit>() {
                public final void b(long j2) {
                    function0.invoke();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((Offset) obj).t());
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (TapGestureDetectorKt.m((PointerInputScope) this.E, (Function1) null, (Function1) null, (Function3) null, r7, this, 7, (Object) null) == f2) {
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
