package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2 extends Lambda implements Function1<KeyEvent, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2 f5497z = new BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2();

    public BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2() {
        super(1);
    }

    public final Boolean b(android.view.KeyEvent keyEvent) {
        KeyCommand a2 = KeyMapping_androidKt.a().a(keyEvent);
        return Boolean.valueOf(a2 == KeyCommand.COPY || a2 == KeyCommand.CUT);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((KeyEvent) obj).f());
    }
}
