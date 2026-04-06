package androidx.compose.material3.internal;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CalendarModel_androidKt {
    public static final String a(long j2, String str, Locale locale, Map map) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        DateFormat dateFormat = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            map.put(str2, instanceForSkeleton);
            dateFormat = instanceForSkeleton;
        }
        Intrinsics.g(dateFormat, "null cannot be cast to non-null type android.icu.text.DateFormat");
        return ((DateFormat) dateFormat).format(new Date(j2));
    }
}
