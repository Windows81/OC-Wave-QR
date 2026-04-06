package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class WideNavigationRailKt$Scrim$dismissModalRail$1$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f11760z;

    public WideNavigationRailKt$Scrim$dismissModalRail$1$1(MutableState mutableState) {
        this.f11760z = mutableState;
    }

    public static final Unit b(MutableState mutableState, Offset offset) {
        WideNavigationRailKt.x(mutableState, true);
        return Unit.f40552a;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object m2 = TapGestureDetectorKt.m(pointerInputScope, (Function1) null, (Function1) null, (Function3) null, new A8(this.f11760z), continuation, 7, (Object) null);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
