package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata
public final class CalendarModelKt {
    public static final DateInputFormat a(String str) {
        String E0 = StringsKt.E0(StringsKt.K(new Regex("y{1,4}").e(new Regex("M{1,2}").e(new Regex("d{1,2}").e(new Regex("[^dMy/\\-.]").e(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, (Object) null), ".");
        MatchResult c2 = Regex.c(new Regex("[/\\-.]"), E0, 0, 2, (Object) null);
        Intrinsics.f(c2);
        MatchGroup matchGroup = c2.a().get(0);
        Intrinsics.f(matchGroup);
        return new DateInputFormat(E0, matchGroup.a().charAt(0));
    }
}
