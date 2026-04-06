package androidx.compose.ui.text.input;

import kotlin.Metadata;

@Metadata
public final class EditCommandKt {
    public static final boolean b(char c2, char c3) {
        return Character.isHighSurrogate(c2) && Character.isLowSurrogate(c3);
    }
}
