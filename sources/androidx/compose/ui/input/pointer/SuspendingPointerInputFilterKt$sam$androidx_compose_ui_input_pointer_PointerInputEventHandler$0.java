package androidx.compose.ui.input.pointer;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 implements PointerInputEventHandler, FunctionAdapter {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f16949z;

    public SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(Function2 function2) {
        this.f16949z = function2;
    }

    public final Function d() {
        return this.f16949z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.d(d(), ((FunctionAdapter) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        return this.f16949z.m(pointerInputScope, continuation);
    }
}
