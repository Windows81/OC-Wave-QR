package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$dragAndDropNode$4 extends Lambda implements Function1<DragAndDropEvent, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6324z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$4(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6324z = textFieldDecoratorModifierNode;
    }

    public final void b(DragAndDropEvent dragAndDropEvent) {
        ReceiveContentListener a2;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6324z;
        HoverInteraction.Enter enter = new HoverInteraction.Enter();
        this.f6324z.v3().b(enter);
        textFieldDecoratorModifierNode.c0 = enter;
        ReceiveContentConfiguration b2 = ReceiveContentConfigurationKt.b(this.f6324z);
        if (b2 != null && (a2 = b2.a()) != null) {
            a2.c();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DragAndDropEvent) obj);
        return Unit.f40552a;
    }
}
