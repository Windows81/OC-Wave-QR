package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TimePickerKt$TimeInputImpl$2$1$1$1$1 implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f11504A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TimePickerState f11505z;

    public TimePickerKt$TimeInputImpl$2$1$1$1$1(TimePickerState timePickerState, MutableState mutableState) {
        this.f11505z = timePickerState;
        this.f11504A = mutableState;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        int c2 = KeyEvent_androidKt.c(keyEvent);
        if (48 <= c2 && c2 < 58 && TextRange.n(TimePickerKt.J(this.f11504A).h()) == 2 && TimePickerKt.J(this.f11504A).i().length() == 2) {
            this.f11505z.d(TimePickerSelectionMode.f11521b.b());
        }
        return Boolean.FALSE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
