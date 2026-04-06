package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class TestTagKt {
    public static final Modifier a(Modifier modifier, String str) {
        return modifier.o0(new TestTagElement(str));
    }
}
