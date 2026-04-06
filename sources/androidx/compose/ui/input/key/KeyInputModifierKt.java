package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class KeyInputModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.o0(new KeyInputElement(function1, (Function1) null));
    }

    public static final Modifier b(Modifier modifier, Function1 function1) {
        return modifier.o0(new KeyInputElement((Function1) null, function1));
    }
}
