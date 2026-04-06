package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class ImeEditCommand_androidKt$commitText$1 extends Lambda implements Function1<TextFieldBuffer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6196A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f6197z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImeEditCommand_androidKt$commitText$1(String str, int i2) {
        super(1);
        this.f6197z = str;
        this.f6196A = i2;
    }

    public final void b(TextFieldBuffer textFieldBuffer) {
        TextRange h2 = textFieldBuffer.h();
        if (h2 != null) {
            ImeEditCommand_androidKt.g(textFieldBuffer, TextRange.n(h2.r()), TextRange.i(h2.r()), this.f6197z);
        } else {
            ImeEditCommand_androidKt.g(textFieldBuffer, TextRange.n(textFieldBuffer.l()), TextRange.i(textFieldBuffer.l()), this.f6197z);
        }
        int n2 = TextRange.n(textFieldBuffer.l());
        int i2 = this.f6196A;
        textFieldBuffer.x(TextRangeKt.a(RangesKt.o(i2 > 0 ? (n2 + i2) - 1 : (n2 + i2) - this.f6197z.length(), 0, textFieldBuffer.j())));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldBuffer) obj);
        return Unit.f40552a;
    }
}
