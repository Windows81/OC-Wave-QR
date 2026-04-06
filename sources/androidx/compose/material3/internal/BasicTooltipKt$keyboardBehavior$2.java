package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class BasicTooltipKt$keyboardBehavior$2 implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f12174A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f12175B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TooltipState f12176z;

    public BasicTooltipKt$keyboardBehavior$2(TooltipState tooltipState, MutableState mutableState, boolean z2) {
        this.f12176z = tooltipState;
        this.f12174A = mutableState;
        this.f12175B = z2;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        if (!this.f12176z.isVisible()) {
            this.f12174A.setValue(Boolean.FALSE);
        }
        if (!this.f12175B || !KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a()) || !Key.r(KeyEvent_androidKt.a(keyEvent), Key.f16750b.o()) || !this.f12176z.isVisible()) {
            return Boolean.FALSE;
        }
        MutableState mutableState = this.f12174A;
        Boolean bool = Boolean.TRUE;
        mutableState.setValue(bool);
        return bool;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
