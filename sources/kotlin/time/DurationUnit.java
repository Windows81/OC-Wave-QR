package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: z  reason: collision with root package name */
    public final TimeUnit f41213z;

    static {
        DurationUnit[] d2;
        I = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    DurationUnit(TimeUnit timeUnit) {
        this.f41213z = timeUnit;
    }

    public final TimeUnit f() {
        return this.f41213z;
    }
}
