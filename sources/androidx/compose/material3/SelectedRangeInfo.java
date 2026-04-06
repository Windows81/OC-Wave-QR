package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectedRangeInfo {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f10962e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f10963a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10964b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10965c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10966d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SelectedRangeInfo a(CalendarMonth calendarMonth, CalendarDate calendarDate, CalendarDate calendarDate2) {
            if (calendarDate.j() > calendarMonth.b() || calendarDate2.j() < calendarMonth.e()) {
                return null;
            }
            boolean z2 = calendarDate.j() >= calendarMonth.e();
            boolean z3 = calendarDate2.j() <= calendarMonth.b();
            int a2 = z2 ? (calendarMonth.a() + calendarDate.f()) - 1 : calendarMonth.a();
            int a3 = z3 ? (calendarMonth.a() + calendarDate2.f()) - 1 : (calendarMonth.a() + calendarMonth.d()) - 1;
            return new SelectedRangeInfo(IntOffset.f((((long) (a2 % 7)) << 32) | (((long) (a2 / 7)) & 4294967295L)), IntOffset.f((((long) (a3 % 7)) << 32) | (((long) (a3 / 7)) & 4294967295L)), z2, z3, (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ SelectedRangeInfo(long j2, long j3, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, z2, z3);
    }

    public final boolean a() {
        return this.f10965c;
    }

    public final long b() {
        return this.f10964b;
    }

    public final long c() {
        return this.f10963a;
    }

    public final boolean d() {
        return this.f10966d;
    }

    public SelectedRangeInfo(long j2, long j3, boolean z2, boolean z3) {
        this.f10963a = j2;
        this.f10964b = j3;
        this.f10965c = z2;
        this.f10966d = z3;
    }
}
