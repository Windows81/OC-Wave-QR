package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TimedValue<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f41221a;

    /* renamed from: b  reason: collision with root package name */
    public final long f41222b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) obj;
        return Intrinsics.d(this.f41221a, timedValue.f41221a) && Duration.r(this.f41222b, timedValue.f41222b);
    }

    public int hashCode() {
        Object obj = this.f41221a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + Duration.M(this.f41222b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f41221a + ", duration=" + Duration.Y(this.f41222b) + ')';
    }
}
