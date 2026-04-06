package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DatePickerFormatterImpl implements DatePickerFormatter {

    /* renamed from: a  reason: collision with root package name */
    public final String f9700a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9701b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9702c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f9703d;

    public String a(Long l2, Locale locale, boolean z2) {
        if (l2 == null) {
            return null;
        }
        return CalendarModel_androidKt.a(l2.longValue(), z2 ? this.f9702c : this.f9701b, locale, this.f9703d);
    }

    public String c(Long l2, Locale locale) {
        if (l2 == null) {
            return null;
        }
        return CalendarModel_androidKt.a(l2.longValue(), this.f9700a, locale, this.f9703d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerFormatterImpl)) {
            return false;
        }
        DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) obj;
        return Intrinsics.d(this.f9700a, datePickerFormatterImpl.f9700a) && Intrinsics.d(this.f9701b, datePickerFormatterImpl.f9701b) && Intrinsics.d(this.f9702c, datePickerFormatterImpl.f9702c);
    }

    public int hashCode() {
        return (((this.f9700a.hashCode() * 31) + this.f9701b.hashCode()) * 31) + this.f9702c.hashCode();
    }
}
