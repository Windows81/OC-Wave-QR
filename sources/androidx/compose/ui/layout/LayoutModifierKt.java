package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class LayoutModifierKt {
    public static final Modifier a(Modifier modifier, Function3 function3) {
        return modifier.o0(new LayoutElement(function3));
    }
}
