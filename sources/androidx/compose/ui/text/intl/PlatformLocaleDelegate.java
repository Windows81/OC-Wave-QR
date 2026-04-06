package androidx.compose.ui.text.intl;

import java.util.Locale;
import kotlin.Metadata;

@Metadata
public interface PlatformLocaleDelegate {
    Locale a(String str);

    LocaleList b();
}
