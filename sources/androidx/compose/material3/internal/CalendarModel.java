package androidx.compose.material3.internal;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public abstract class CalendarModel {

    /* renamed from: a  reason: collision with root package name */
    public final Locale f12189a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f12190b;

    public abstract String a(long j2, String str, Locale locale);

    public abstract CalendarDate b(long j2);

    public abstract DateInputFormat c(Locale locale);

    public abstract int d();

    public final Map e() {
        return this.f12190b;
    }

    public final Locale f() {
        return this.f12189a;
    }

    public abstract CalendarMonth g(int i2, int i3);

    public abstract CalendarMonth h(long j2);

    public abstract CalendarMonth i(CalendarDate calendarDate);

    public abstract CalendarDate j();

    public abstract List k();

    public abstract CalendarDate l(String str, String str2, Locale locale);

    public abstract CalendarMonth m(CalendarMonth calendarMonth, int i2);
}
