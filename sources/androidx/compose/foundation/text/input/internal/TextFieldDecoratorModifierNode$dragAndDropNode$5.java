package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$dragAndDropNode$5 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6325z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6325z = textFieldDecoratorModifierNode;
    }

    public final void b(long j2) {
        long d2 = TextLayoutStateKt.d(this.f6325z.C3(), j2);
        int i2 = TextLayoutState.i(this.f6325z.C3(), d2, false, 2, (Object) null);
        if (i2 >= 0) {
            this.f6325z.B3().B(TextRangeKt.a(i2));
        }
        this.f6325z.A3().I0(Handle.Cursor, d2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
