package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class ImeEditCommand_androidKt$setComposingText$1 extends Lambda implements Function1<TextFieldBuffer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f6205A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f6206B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f6207z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImeEditCommand_androidKt$setComposingText$1(String str, List list, int i2) {
        super(1);
        this.f6207z = str;
        this.f6205A = list;
        this.f6206B = i2;
    }

    public final void b(TextFieldBuffer textFieldBuffer) {
        TextRange h2 = textFieldBuffer.h();
        if (h2 != null) {
            ImeEditCommand_androidKt.g(textFieldBuffer, TextRange.n(h2.r()), TextRange.i(h2.r()), this.f6207z);
            if (this.f6207z.length() > 0) {
                textFieldBuffer.t(TextRange.n(h2.r()), TextRange.n(h2.r()) + this.f6207z.length(), this.f6205A);
            }
        } else {
            int n2 = TextRange.n(textFieldBuffer.l());
            ImeEditCommand_androidKt.g(textFieldBuffer, n2, TextRange.i(textFieldBuffer.l()), this.f6207z);
            if (this.f6207z.length() > 0) {
                textFieldBuffer.t(n2, this.f6207z.length() + n2, this.f6205A);
            }
        }
        int n3 = TextRange.n(textFieldBuffer.l());
        int i2 = this.f6206B;
        textFieldBuffer.x(TextRangeKt.a(RangesKt.o(i2 > 0 ? (n3 + i2) - 1 : (n3 + i2) - this.f6207z.length(), 0, textFieldBuffer.j())));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldBuffer) obj);
        return Unit.f40552a;
    }
}
