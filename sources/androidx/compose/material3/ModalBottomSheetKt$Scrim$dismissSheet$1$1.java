package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ModalBottomSheetKt$Scrim$dismissSheet$1$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f10333z;

    public ModalBottomSheetKt$Scrim$dismissSheet$1$1(Function0 function0) {
        this.f10333z = function0;
    }

    public static final Unit b(Function0 function0, Offset offset) {
        function0.invoke();
        return Unit.f40552a;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object m2 = TapGestureDetectorKt.m(pointerInputScope, (Function1) null, (Function1) null, (Function3) null, new U3(this.f10333z), continuation, 7, (Object) null);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
