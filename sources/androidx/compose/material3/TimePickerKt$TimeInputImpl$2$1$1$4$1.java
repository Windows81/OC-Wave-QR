package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TimePickerKt$TimeInputImpl$2$1$1$4$1 implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f11506A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TimePickerState f11507z;

    public TimePickerKt$TimeInputImpl$2$1$1$4$1(TimePickerState timePickerState, MutableState mutableState) {
        this.f11507z = timePickerState;
        this.f11506A = mutableState;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        boolean z2 = KeyEvent_androidKt.c(keyEvent) == 0 && TextRange.n(TimePickerKt.L(this.f11506A).h()) == 0;
        if (z2) {
            this.f11507z.d(TimePickerSelectionMode.f11521b.a());
        }
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
