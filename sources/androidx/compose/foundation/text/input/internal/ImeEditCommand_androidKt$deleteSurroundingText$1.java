package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImeEditCommand_androidKt$deleteSurroundingText$1 extends Lambda implements Function1<TextFieldBuffer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6198A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f6199z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImeEditCommand_androidKt$deleteSurroundingText$1(int i2, int i3) {
        super(1);
        this.f6199z = i2;
        this.f6198A = i3;
    }

    public final void b(TextFieldBuffer textFieldBuffer) {
        int i2 = this.f6199z;
        boolean z2 = i2 >= 0 && this.f6198A >= 0;
        int i3 = this.f6198A;
        if (!z2) {
            InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.");
        }
        int i4 = TextRange.i(textFieldBuffer.l());
        int i5 = this.f6198A;
        int i6 = i4 + i5;
        if (((i4 ^ i6) & (i5 ^ i6)) < 0) {
            i6 = textFieldBuffer.j();
        }
        ImeEditCommand_androidKt.f(textFieldBuffer, TextRange.i(textFieldBuffer.l()), Math.min(i6, textFieldBuffer.j()));
        int n2 = TextRange.n(textFieldBuffer.l());
        int i7 = this.f6199z;
        int i8 = n2 - i7;
        if (((n2 ^ i8) & (i7 ^ n2)) < 0) {
            i8 = 0;
        }
        ImeEditCommand_androidKt.f(textFieldBuffer, Math.max(0, i8), TextRange.n(textFieldBuffer.l()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldBuffer) obj);
        return Unit.f40552a;
    }
}
