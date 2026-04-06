package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class BasicTextFieldKt$DefaultTextFieldDecorator$1 implements TextFieldDecorator {

    /* renamed from: a  reason: collision with root package name */
    public static final BasicTextFieldKt$DefaultTextFieldDecorator$1 f5565a = new BasicTextFieldKt$DefaultTextFieldDecorator$1();

    public final void a(Function2 function2, Composer composer, int i2) {
        composer.X(-1669748801);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1669748801, i2, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:582)");
        }
        function2.m(composer, Integer.valueOf(i2 & 14));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
