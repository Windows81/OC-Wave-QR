package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.Metadata;

@Metadata
public final class StringHelpers_androidKt {
    public static final int a(String str, int i2) {
        EmojiCompat c2 = c();
        Integer num = null;
        if (c2 != null) {
            Integer valueOf = Integer.valueOf(c2.d(str, i2));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i2);
    }

    public static final int b(String str, int i2) {
        EmojiCompat c2 = c();
        Integer num = null;
        if (c2 != null) {
            Integer valueOf = Integer.valueOf(c2.f(str, Math.max(0, i2 - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }

    public static final EmojiCompat c() {
        if (!EmojiCompat.k()) {
            return null;
        }
        EmojiCompat c2 = EmojiCompat.c();
        if (c2.g() == 1) {
            return c2;
        }
        return null;
    }
}
