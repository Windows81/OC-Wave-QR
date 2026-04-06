package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

@Metadata
public final class CodepointHelpers_jvmKt {
    public static final int a(int i2) {
        return Character.charCount(i2);
    }

    public static final int b(CharSequence charSequence, int i2) {
        return Character.codePointAt(charSequence, i2);
    }

    public static final int c(CharSequence charSequence, int i2) {
        return Character.codePointBefore(charSequence, i2);
    }
}
