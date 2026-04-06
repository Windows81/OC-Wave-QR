package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewRequesterKt {
    public static final BringIntoViewRequester a() {
        return new BringIntoViewRequesterImpl();
    }

    public static final Modifier b(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        return modifier.o0(new BringIntoViewRequesterElement(bringIntoViewRequester));
    }
}
