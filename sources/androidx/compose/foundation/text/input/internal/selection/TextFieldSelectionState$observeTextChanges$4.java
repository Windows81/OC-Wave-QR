package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class TextFieldSelectionState$observeTextChanges$4<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6540z;

    public TextFieldSelectionState$observeTextChanges$4(TextFieldSelectionState textFieldSelectionState) {
        this.f6540z = textFieldSelectionState;
    }

    /* renamed from: a */
    public final Object c(TextFieldCharSequence textFieldCharSequence, Continuation continuation) {
        this.f6540z.C0(false);
        this.f6540z.L0(TextToolbarState.None);
        return Unit.f40552a;
    }
}
