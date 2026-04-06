package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$dragAndDropNode$6 extends Lambda implements Function1<DragAndDropEvent, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6326z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6326z = textFieldDecoratorModifierNode;
    }

    public final void b(DragAndDropEvent dragAndDropEvent) {
        ReceiveContentListener a2;
        this.f6326z.s3();
        this.f6326z.A3().G();
        ReceiveContentConfiguration b2 = ReceiveContentConfigurationKt.b(this.f6326z);
        if (b2 != null && (a2 = b2.a()) != null) {
            a2.b();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DragAndDropEvent) obj);
        return Unit.f40552a;
    }
}
