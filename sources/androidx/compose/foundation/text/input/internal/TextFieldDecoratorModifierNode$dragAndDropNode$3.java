package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$dragAndDropNode$3 extends Lambda implements Function1<DragAndDropEvent, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6323z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6323z = textFieldDecoratorModifierNode;
    }

    public final void b(DragAndDropEvent dragAndDropEvent) {
        if (ReceiveContentConfigurationKt.b(this.f6323z) != null) {
            DragAndDropRequestPermission_androidKt.b(this.f6323z, dragAndDropEvent);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DragAndDropEvent) obj);
        return Unit.f40552a;
    }
}
