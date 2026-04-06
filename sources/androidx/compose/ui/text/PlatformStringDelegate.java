package androidx.compose.ui.text;

import java.util.Locale;
import kotlin.Metadata;

@Metadata
public interface PlatformStringDelegate {
    String a(String str, Locale locale);

    String b(String str, Locale locale);

    String c(String str, Locale locale);

    String d(String str, Locale locale);
}
