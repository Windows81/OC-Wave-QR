package androidx.compose.foundation.content.internal;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;

@Metadata
public final class ReceiveContentConfigurationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableModifierLocal f3218a = ModifierLocalKt.a(ReceiveContentConfigurationKt$ModifierLocalReceiveContent$1.f3219z);

    public static final ProvidableModifierLocal a() {
        return f3218a;
    }

    public static final ReceiveContentConfiguration b(ModifierLocalModifierNode modifierLocalModifierNode) {
        if (modifierLocalModifierNode.M().F2()) {
            return (ReceiveContentConfiguration) modifierLocalModifierNode.b(f3218a);
        }
        return null;
    }
}
