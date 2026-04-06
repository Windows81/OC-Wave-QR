package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionState$observeTextChanges$2 extends Lambda implements Function0<TextFieldCharSequence> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6539z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$observeTextChanges$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6539z = textFieldSelectionState;
    }

    /* renamed from: b */
    public final TextFieldCharSequence invoke() {
        return this.f6539z.f6463a.o();
    }
}
