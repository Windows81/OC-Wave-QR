package androidx.compose.ui.text;

import java.text.BreakIterator;
import kotlin.Metadata;

@Metadata
public final class JvmCharHelpers_androidKt {
    public static final int a(String str, int i2) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i2);
    }

    public static final int b(String str, int i2) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }
}
