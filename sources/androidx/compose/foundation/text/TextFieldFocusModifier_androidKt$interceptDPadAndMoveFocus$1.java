package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5905A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusManager f5906z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(FocusManager focusManager, LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f5906z = focusManager;
        this.f5905A = legacyTextFieldState;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        boolean z2 = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a()) && keyEvent.getSource() != 257) {
            if (TextFieldFocusModifier_androidKt.c(keyEvent, 19)) {
                z2 = this.f5906z.p(FocusDirection.f15729b.h());
            } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 20)) {
                z2 = this.f5906z.p(FocusDirection.f15729b.a());
            } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 21)) {
                z2 = this.f5906z.p(FocusDirection.f15729b.d());
            } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 22)) {
                z2 = this.f5906z.p(FocusDirection.f15729b.g());
            } else if (TextFieldFocusModifier_androidKt.c(keyEvent, 23)) {
                SoftwareKeyboardController j2 = this.f5905A.j();
                if (j2 != null) {
                    j2.b();
                }
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
