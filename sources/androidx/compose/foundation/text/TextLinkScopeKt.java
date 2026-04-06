package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLinkStyles;
import kotlin.Metadata;

@Metadata
public final class TextLinkScopeKt {
    public static final boolean b(TextLinkStyles textLinkStyles) {
        return textLinkStyles == null || (textLinkStyles.d() == null && textLinkStyles.a() == null && textLinkStyles.b() == null && textLinkStyles.c() == null);
    }
}
