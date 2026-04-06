package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class RegexKt {
    public static final MatchResult d(Matcher matcher, int i2, CharSequence charSequence) {
        if (!matcher.find(i2)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    public static final IntRange e(MatchResult matchResult) {
        return RangesKt.v(matchResult.start(), matchResult.end());
    }

    public static final IntRange f(MatchResult matchResult, int i2) {
        return RangesKt.v(matchResult.start(i2), matchResult.end(i2));
    }
}
