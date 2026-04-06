package kotlinx.coroutines.time;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.DelayKt;

@Metadata
public final class TimeKt {
    public static final long a(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    public static final Object b(Duration duration, Continuation continuation) {
        Object b2 = DelayKt.b(a(duration), continuation);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }
}
