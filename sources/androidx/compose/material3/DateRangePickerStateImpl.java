package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f9813h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public MutableState f9814e;

    /* renamed from: f  reason: collision with root package name */
    public MutableState f9815f;

    /* renamed from: g  reason: collision with root package name */
    public MutableState f9816g;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public void a(int i2) {
        Long j2 = j();
        if (j2 != null) {
            c(l().h(j2.longValue()).e());
        }
        this.f9816g.setValue(DisplayMode.c(i2));
    }

    public int b() {
        return ((DisplayMode) this.f9816g.getValue()).i();
    }

    public Long g() {
        CalendarDate calendarDate = (CalendarDate) this.f9815f.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.j());
        }
        return null;
    }

    public void h(Long l2, Long l3) {
        CalendarDate m2 = m(l2);
        CalendarDate m3 = m(l3);
        if (m2 == null || (m3 != null && m2.j() > m3.j())) {
            this.f9814e.setValue((Object) null);
            this.f9815f.setValue((Object) null);
            return;
        }
        this.f9814e.setValue(m2);
        this.f9815f.setValue(m3);
    }

    public Long j() {
        CalendarDate calendarDate = (CalendarDate) this.f9814e.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.j());
        }
        return null;
    }

    public final CalendarDate m(Long l2) {
        if (l2 == null) {
            return null;
        }
        CalendarDate b2 = l().b(l2.longValue());
        if (f().u(b2.k())) {
            return b2;
        }
        return null;
    }
}
