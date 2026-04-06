package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

@Metadata
public final class NanoTimeSource extends SchedulerTimeSource {

    /* renamed from: a  reason: collision with root package name */
    public static final NanoTimeSource f41903a = new NanoTimeSource();

    public long a() {
        return System.nanoTime();
    }
}
