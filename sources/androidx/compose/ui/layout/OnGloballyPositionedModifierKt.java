package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class OnGloballyPositionedModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.o0(new OnGloballyPositionedElement(function1));
    }
}
