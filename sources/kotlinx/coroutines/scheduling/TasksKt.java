package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata
public final class TasksKt {

    /* renamed from: a  reason: collision with root package name */
    public static final String f41907a = SystemPropsKt.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b  reason: collision with root package name */
    public static final long f41908b = SystemPropsKt__SystemProps_commonKt.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41909c = SystemPropsKt__SystemProps_commonKt.e("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.e(SystemPropsKt.a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f41910d = SystemPropsKt__SystemProps_commonKt.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public static final long f41911e = TimeUnit.SECONDS.toNanos(SystemPropsKt__SystemProps_commonKt.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: f  reason: collision with root package name */
    public static SchedulerTimeSource f41912f = NanoTimeSource.f41903a;

    public static final Task b(Runnable runnable, long j2, boolean z2) {
        return new TaskImpl(runnable, j2, z2);
    }

    public static final String c(boolean z2) {
        return z2 ? "Blocking" : "Non-blocking";
    }
}
