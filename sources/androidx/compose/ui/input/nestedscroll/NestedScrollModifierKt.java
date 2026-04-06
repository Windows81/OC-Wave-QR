package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class NestedScrollModifierKt {
    public static final Modifier a(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.o0(new NestedScrollElement(nestedScrollConnection, nestedScrollDispatcher));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return a(modifier, nestedScrollConnection, nestedScrollDispatcher);
    }
}
