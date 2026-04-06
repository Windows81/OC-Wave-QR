package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6330z;

    public TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.f6330z = textFieldDecoratorModifierNode;
    }

    /* renamed from: a */
    public final Object c(String str, Continuation continuation) {
        this.f6330z.I3(false);
        return Unit.f40552a;
    }
}
