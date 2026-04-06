package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class P7 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref f10611A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f10612B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TimePickerState f10613z;

    public /* synthetic */ P7(TimePickerState timePickerState, Ref ref, MutableState mutableState) {
        this.f10613z = timePickerState;
        this.f10611A = ref;
        this.f10612B = mutableState;
    }

    public final Object invoke(Object obj) {
        return TimePickerKt$TimeInputImpl$2$1.p(this.f10613z, this.f10611A, this.f10612B, (TextFieldValue) obj);
    }
}
