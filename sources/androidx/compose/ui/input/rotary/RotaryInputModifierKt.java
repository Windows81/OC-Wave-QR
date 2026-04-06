package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class RotaryInputModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.o0(new RotaryInputElement(function1, (Function1) null));
    }
}
