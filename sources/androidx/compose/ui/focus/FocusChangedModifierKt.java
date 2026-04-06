package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FocusChangedModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.o0(new FocusChangedElement(function1));
    }
}
