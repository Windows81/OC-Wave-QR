package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ClickableTextKt$ClickableText$pressIndicator$1$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5626A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f5627z;

    public ClickableTextKt$ClickableText$pressIndicator$1$1(MutableState mutableState, Function1 function1) {
        this.f5627z = mutableState;
        this.f5626A = function1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        final MutableState mutableState = this.f5627z;
        final Function1 function1 = this.f5626A;
        Object m2 = TapGestureDetectorKt.m(pointerInputScope, (Function1) null, (Function1) null, (Function3) null, new Function1<Offset, Unit>() {
            public final void b(long j2) {
                TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
                if (textLayoutResult != null) {
                    function1.invoke(Integer.valueOf(textLayoutResult.x(j2)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Offset) obj).t());
                return Unit.f40552a;
            }
        }, continuation, 7, (Object) null);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
