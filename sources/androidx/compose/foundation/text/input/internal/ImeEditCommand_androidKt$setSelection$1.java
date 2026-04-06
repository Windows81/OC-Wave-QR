package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImeEditCommand_androidKt$setSelection$1 extends Lambda implements Function1<TextFieldBuffer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6208A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f6209B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImeEditCommandScope f6210z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImeEditCommand_androidKt$setSelection$1(ImeEditCommandScope imeEditCommandScope, int i2, int i3) {
        super(1);
        this.f6210z = imeEditCommandScope;
        this.f6208A = i2;
        this.f6209B = i3;
    }

    public final void b(TextFieldBuffer textFieldBuffer) {
        long g2 = this.f6210z.g(TextRangeKt.b(0, textFieldBuffer.j()));
        int i2 = this.f6208A;
        int l2 = TextRange.l(g2);
        int k2 = TextRange.k(g2);
        if (i2 < l2) {
            i2 = l2;
        }
        if (i2 <= k2) {
            k2 = i2;
        }
        int i3 = this.f6209B;
        int l3 = TextRange.l(g2);
        int k3 = TextRange.k(g2);
        if (i3 < l3) {
            i3 = l3;
        }
        if (i3 <= k3) {
            k3 = i3;
        }
        textFieldBuffer.x(this.f6210z.c(TextRangeKt.b(k2, k3)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldBuffer) obj);
        return Unit.f40552a;
    }
}
