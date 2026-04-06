package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1 extends Lambda implements Function0<ReceiveContentConfiguration> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6339z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6339z = textFieldDecoratorModifierNode;
    }

    /* renamed from: b */
    public final ReceiveContentConfiguration invoke() {
        return ReceiveContentConfigurationKt.b(this.f6339z);
    }
}
