package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class R7 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref f10691A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f10692B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TimePickerState f10693z;

    public /* synthetic */ R7(TimePickerState timePickerState, Ref ref, MutableState mutableState) {
        this.f10693z = timePickerState;
        this.f10691A = ref;
        this.f10692B = mutableState;
    }

    public final Object invoke(Object obj) {
        return TimePickerKt$TimeInputImpl$2$1.t(this.f10693z, this.f10691A, this.f10692B, (TextFieldValue) obj);
    }
}
