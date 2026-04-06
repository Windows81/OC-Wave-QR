package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$applySemantics$5 extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6313z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(3);
        this.f6313z = textFieldDecoratorModifierNode;
    }

    public final Boolean b(int i2, int i3, boolean z2) {
        TextFieldCharSequence n2 = z2 ? this.f6313z.B3().n() : this.f6313z.B3().o();
        long g2 = n2.g();
        if (!this.f6313z.u3() || Math.min(i2, i3) < 0 || Math.max(i2, i3) > n2.length()) {
            return Boolean.FALSE;
        }
        if (i2 == TextRange.n(g2) && i3 == TextRange.i(g2)) {
            return Boolean.TRUE;
        }
        long b2 = TextRangeKt.b(i2, i3);
        if (z2 || i2 == i3) {
            this.f6313z.A3().L0(TextToolbarState.None);
        } else {
            this.f6313z.A3().L0(TextToolbarState.Selection);
        }
        if (z2) {
            this.f6313z.B3().C(b2);
        } else {
            this.f6313z.B3().B(b2);
        }
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
    }
}
