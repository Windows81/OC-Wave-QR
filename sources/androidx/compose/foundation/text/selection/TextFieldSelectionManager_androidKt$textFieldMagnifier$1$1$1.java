package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1 extends Lambda implements Function0<Offset> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f7026A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7027z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1(TextFieldSelectionManager textFieldSelectionManager, MutableState mutableState) {
        super(0);
        this.f7027z = textFieldSelectionManager;
        this.f7026A = mutableState;
    }

    public final long b() {
        return TextFieldSelectionManagerKt.b(this.f7027z, TextFieldSelectionManager_androidKt$textFieldMagnifier$1.f(this.f7026A));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.d(b());
    }
}
