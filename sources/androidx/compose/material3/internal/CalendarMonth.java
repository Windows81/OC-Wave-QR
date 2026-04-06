package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata
public final class CalendarMonth {

    /* renamed from: a  reason: collision with root package name */
    public final int f12197a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12198b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12199c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12200d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12201e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12202f;

    public CalendarMonth(int i2, int i3, int i4, int i5, long j2) {
        this.f12197a = i2;
        this.f12198b = i3;
        this.f12199c = i4;
        this.f12200d = i5;
        this.f12201e = j2;
        this.f12202f = (j2 + (((long) i4) * 86400000)) - 1;
    }

    public final int a() {
        return this.f12200d;
    }

    public final long b() {
        return this.f12202f;
    }

    public final int c() {
        return this.f12198b;
    }

    public final int d() {
        return this.f12199c;
    }

    public final long e() {
        return this.f12201e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.f12197a == calendarMonth.f12197a && this.f12198b == calendarMonth.f12198b && this.f12199c == calendarMonth.f12199c && this.f12200d == calendarMonth.f12200d && this.f12201e == calendarMonth.f12201e;
    }

    public final int f() {
        return this.f12197a;
    }

    public final int g(IntRange intRange) {
        return (((this.f12197a - intRange.n()) * 12) + this.f12198b) - 1;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f12197a) * 31) + Integer.hashCode(this.f12198b)) * 31) + Integer.hashCode(this.f12199c)) * 31) + Integer.hashCode(this.f12200d)) * 31) + Long.hashCode(this.f12201e);
    }

    public String toString() {
        return "CalendarMonth(year=" + this.f12197a + ", month=" + this.f12198b + ", numberOfDays=" + this.f12199c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f12200d + ", startUtcTimeMillis=" + this.f12201e + ')';
    }
}
