package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImeEditCommand_androidKt$deleteSurroundingTextInCodePoints$1 extends Lambda implements Function1<TextFieldBuffer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6200A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f6201z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImeEditCommand_androidKt$deleteSurroundingTextInCodePoints$1(int i2, int i3) {
        super(1);
        this.f6201z = i2;
        this.f6200A = i3;
    }

    public final void b(TextFieldBuffer textFieldBuffer) {
        int i2 = this.f6201z;
        int i3 = 0;
        boolean z2 = i2 >= 0 && this.f6200A >= 0;
        int i4 = this.f6200A;
        if (!z2) {
            InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i4 + " respectively.");
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 < this.f6201z) {
                int i7 = i6 + 1;
                if (TextRange.n(textFieldBuffer.l()) <= i7) {
                    i6 = TextRange.n(textFieldBuffer.l());
                    break;
                } else {
                    i6 = ImeEditCommand_androidKt.h(textFieldBuffer.a().charAt((TextRange.n(textFieldBuffer.l()) - i7) - 1), textFieldBuffer.a().charAt(TextRange.n(textFieldBuffer.l()) - i7)) ? i6 + 2 : i7;
                    i5++;
                }
            } else {
                break;
            }
        }
        int i8 = 0;
        while (true) {
            if (i3 >= this.f6200A) {
                break;
            }
            int i9 = i8 + 1;
            if (TextRange.i(textFieldBuffer.l()) + i9 >= textFieldBuffer.j()) {
                i8 = textFieldBuffer.j() - TextRange.i(textFieldBuffer.l());
                break;
            } else {
                i8 = ImeEditCommand_androidKt.h(textFieldBuffer.a().charAt((TextRange.i(textFieldBuffer.l()) + i9) - 1), textFieldBuffer.a().charAt(TextRange.i(textFieldBuffer.l()) + i9)) ? i8 + 2 : i9;
                i3++;
            }
        }
        ImeEditCommand_androidKt.f(textFieldBuffer, TextRange.i(textFieldBuffer.l()), TextRange.i(textFieldBuffer.l()) + i8);
        ImeEditCommand_androidKt.f(textFieldBuffer, TextRange.n(textFieldBuffer.l()) - i6, TextRange.n(textFieldBuffer.l()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldBuffer) obj);
        return Unit.f40552a;
    }
}
