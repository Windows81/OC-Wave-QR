package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public final class EventLoop_commonKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Symbol f41409a = new Symbol("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    public static final Symbol f41410b = new Symbol("CLOSED_EMPTY");

    public static final long c(long j2) {
        return j2 / 1000000;
    }

    public static final long d(long j2) {
        if (j2 <= 0) {
            return 0;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j2;
    }
}
