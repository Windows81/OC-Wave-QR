package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$onObservedReadsChanged$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6334z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$onObservedReadsChanged$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6334z = textFieldDecoratorModifierNode;
    }

    public final void invoke() {
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6334z;
        textFieldDecoratorModifierNode.f0 = (WindowInfo) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, CompositionLocalsKt.u());
        this.f6334z.F3();
    }
}
