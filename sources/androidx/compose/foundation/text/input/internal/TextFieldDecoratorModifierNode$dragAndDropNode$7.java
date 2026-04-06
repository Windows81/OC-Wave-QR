package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$dragAndDropNode$7 extends Lambda implements Function1<DragAndDropEvent, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6327z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$7(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6327z = textFieldDecoratorModifierNode;
    }

    public final void b(DragAndDropEvent dragAndDropEvent) {
        this.f6327z.s3();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DragAndDropEvent) obj);
        return Unit.f40552a;
    }
}
