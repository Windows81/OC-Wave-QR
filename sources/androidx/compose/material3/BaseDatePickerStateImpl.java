package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata
public abstract class BaseDatePickerStateImpl {

    /* renamed from: a  reason: collision with root package name */
    public final IntRange f9246a;

    /* renamed from: b  reason: collision with root package name */
    public final CalendarModel f9247b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f9248c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f9249d;

    public final void c(long j2) {
        CalendarMonth h2 = this.f9247b.h(j2);
        if (this.f9246a.u(h2.f())) {
            this.f9249d.setValue(h2);
        }
    }

    public final SelectableDates d() {
        return (SelectableDates) this.f9248c.getValue();
    }

    public final long e() {
        return ((CalendarMonth) this.f9249d.getValue()).e();
    }

    public final IntRange f() {
        return this.f9246a;
    }

    public final CalendarModel l() {
        return this.f9247b;
    }
}
