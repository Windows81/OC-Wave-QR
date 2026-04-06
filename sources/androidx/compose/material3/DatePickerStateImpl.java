package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f9771g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public MutableState f9772e;

    /* renamed from: f  reason: collision with root package name */
    public MutableState f9773f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public void a(int i2) {
        Long i3 = i();
        if (i3 != null) {
            c(l().h(i3.longValue()).e());
        }
        this.f9773f.setValue(DisplayMode.c(i2));
    }

    public int b() {
        return ((DisplayMode) this.f9773f.getValue()).i();
    }

    public Long i() {
        CalendarDate calendarDate = (CalendarDate) this.f9772e.getValue();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.j());
        }
        return null;
    }

    public void k(Long l2) {
        CalendarDate calendarDate = null;
        if (l2 != null) {
            CalendarDate b2 = l().b(l2.longValue());
            MutableState mutableState = this.f9772e;
            if (f().u(b2.k())) {
                calendarDate = b2;
            }
            mutableState.setValue(calendarDate);
            return;
        }
        this.f9772e.setValue((Object) null);
    }
}
