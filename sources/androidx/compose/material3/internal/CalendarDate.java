package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CalendarDate implements Comparable<CalendarDate> {

    /* renamed from: A  reason: collision with root package name */
    public final int f12186A;

    /* renamed from: B  reason: collision with root package name */
    public final int f12187B;
    public final long C;

    /* renamed from: z  reason: collision with root package name */
    public final int f12188z;

    public CalendarDate(int i2, int i3, int i4, long j2) {
        this.f12188z = i2;
        this.f12186A = i3;
        this.f12187B = i4;
        this.C = j2;
    }

    /* renamed from: d */
    public int compareTo(CalendarDate calendarDate) {
        return Intrinsics.l(this.C, calendarDate.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.f12188z == calendarDate.f12188z && this.f12186A == calendarDate.f12186A && this.f12187B == calendarDate.f12187B && this.C == calendarDate.C;
    }

    public final int f() {
        return this.f12187B;
    }

    public final int h() {
        return this.f12186A;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f12188z) * 31) + Integer.hashCode(this.f12186A)) * 31) + Integer.hashCode(this.f12187B)) * 31) + Long.hashCode(this.C);
    }

    public final long j() {
        return this.C;
    }

    public final int k() {
        return this.f12188z;
    }

    public String toString() {
        return "CalendarDate(year=" + this.f12188z + ", month=" + this.f12186A + ", dayOfMonth=" + this.f12187B + ", utcTimeMillis=" + this.C + ')';
    }
}
