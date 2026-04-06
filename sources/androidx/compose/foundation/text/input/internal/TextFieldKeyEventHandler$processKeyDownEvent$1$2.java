package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldKeyEventHandler$processKeyDownEvent$1$2 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final TextFieldKeyEventHandler$processKeyDownEvent$1$2 f6352z = new TextFieldKeyEventHandler$processKeyDownEvent$1$2();

    public TextFieldKeyEventHandler$processKeyDownEvent$1$2() {
        super(1);
    }

    public final void b(TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.H();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldPreparedSelection) obj);
        return Unit.f40552a;
    }
}
