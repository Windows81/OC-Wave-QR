package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5727A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5728z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f5728z = legacyTextFieldState;
        this.f5727A = textFieldSelectionManager;
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        boolean z2;
        if (this.f5728z.e() != HandleState.Selection || !KeyEventHelpers_androidKt.a(keyEvent)) {
            z2 = false;
        } else {
            z2 = true;
            TextFieldSelectionManager.w(this.f5727A, (Offset) null, 1, (Object) null);
        }
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
