package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
final class MatcherMatchResult implements MatchResult {

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f41168a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f41169b;

    /* renamed from: c  reason: collision with root package name */
    public final MatchGroupCollection f41170c = new MatcherMatchResult$groups$1(this);

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        Intrinsics.i(matcher, "matcher");
        Intrinsics.i(charSequence, "input");
        this.f41168a = matcher;
        this.f41169b = charSequence;
    }

    public MatchGroupCollection a() {
        return this.f41170c;
    }

    public IntRange b() {
        return RegexKt.e(d());
    }

    public final MatchResult d() {
        return this.f41168a;
    }

    public MatchResult next() {
        int end = d().end() + (d().end() == d().start() ? 1 : 0);
        if (end > this.f41169b.length()) {
            return null;
        }
        Matcher matcher = this.f41168a.pattern().matcher(this.f41169b);
        Intrinsics.h(matcher, "matcher(...)");
        return RegexKt.d(matcher, end, this.f41169b);
    }
}
