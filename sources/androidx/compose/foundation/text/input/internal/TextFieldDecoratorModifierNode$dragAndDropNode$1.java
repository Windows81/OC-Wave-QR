package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$dragAndDropNode$1 extends Lambda implements Function0<Set<? extends MediaType>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6321z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6321z = textFieldDecoratorModifierNode;
    }

    /* renamed from: b */
    public final Set invoke() {
        return ReceiveContentConfigurationKt.b(this.f6321z) != null ? TextFieldDecoratorModifierKt.f6302b : TextFieldDecoratorModifierKt.f6301a;
    }
}
