package androidx.compose.ui.text.intl;

import android.util.Log;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public Locale a(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (Intrinsics.d(forLanguageTag.toLanguageTag(), "und")) {
            String a2 = AndroidLocaleDelegate_androidKt.f18938a;
            Log.e(a2, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public LocaleList b() {
        return new LocaleList(CollectionsKt.e(new Locale(Locale.getDefault())));
    }
}
