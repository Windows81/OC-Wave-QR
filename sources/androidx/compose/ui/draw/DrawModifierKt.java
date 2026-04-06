package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DrawModifierKt {
    public static final CacheDrawModifierNode a(Function1 function1) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), function1);
    }

    public static final Modifier b(Modifier modifier, Function1 function1) {
        return modifier.o0(new DrawBehindElement(function1));
    }

    public static final Modifier c(Modifier modifier, Function1 function1) {
        return modifier.o0(new DrawWithCacheElement(function1));
    }

    public static final Modifier d(Modifier modifier, Function1 function1) {
        return modifier.o0(new DrawWithContentElement(function1));
    }
}
