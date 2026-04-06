package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata
public interface MatchResult {

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public static final class Destructured {
    }

    MatchGroupCollection a();

    IntRange b();

    MatchResult next();
}
