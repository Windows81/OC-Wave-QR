package androidx.compose.material3.internal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LegacyCalendarModelImpl extends CalendarModel {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f12280e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f12281f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final TimeZone f12282g = TimeZone.getTimeZone("UTC");

    /* renamed from: c  reason: collision with root package name */
    public final int f12283c;

    /* renamed from: d  reason: collision with root package name */
    public final List f12284d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(long j2, String str, Locale locale, Map map) {
            SimpleDateFormat b2 = b(str, locale, map);
            Calendar instance = Calendar.getInstance(c());
            instance.setTimeInMillis(j2);
            return b2.format(Long.valueOf(instance.getTimeInMillis()));
        }

        public final SimpleDateFormat b(String str, Locale locale, Map map) {
            String str2 = str + locale.toLanguageTag();
            Object obj = map.get(str2);
            SimpleDateFormat simpleDateFormat = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, locale);
                simpleDateFormat2.setTimeZone(LegacyCalendarModelImpl.f12280e.c());
                map.put(str2, simpleDateFormat2);
                simpleDateFormat = simpleDateFormat2;
            }
            return (SimpleDateFormat) simpleDateFormat;
        }

        public final TimeZone c() {
            return LegacyCalendarModelImpl.f12282g;
        }

        public Companion() {
        }
    }

    public String a(long j2, String str, Locale locale) {
        return f12280e.a(j2, str, locale, e());
    }

    public CalendarDate b(long j2) {
        Calendar instance = Calendar.getInstance(f12282g);
        instance.setTimeInMillis(j2);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new CalendarDate(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
    }

    public DateInputFormat c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.g(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.a(((SimpleDateFormat) dateInstance).toPattern());
    }

    public int d() {
        return this.f12283c;
    }

    public CalendarMonth g(int i2, int i3) {
        Calendar instance = Calendar.getInstance(f12282g);
        instance.clear();
        instance.set(1, i2);
        instance.set(2, i3 - 1);
        instance.set(5, 1);
        return p(instance);
    }

    public CalendarMonth h(long j2) {
        Calendar instance = Calendar.getInstance(f12282g);
        instance.setTimeInMillis(j2);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return p(instance);
    }

    public CalendarMonth i(CalendarDate calendarDate) {
        return g(calendarDate.k(), calendarDate.h());
    }

    public CalendarDate j() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return new CalendarDate(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis() + ((long) (instance.get(15) + instance.get(16))));
    }

    public List k() {
        return this.f12284d;
    }

    public CalendarDate l(String str, String str2, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = f12282g;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar instance = Calendar.getInstance(timeZone);
            instance.setTime(parse);
            return new CalendarDate(instance.get(1), instance.get(2) + 1, instance.get(5), instance.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    public CalendarMonth m(CalendarMonth calendarMonth, int i2) {
        if (i2 <= 0) {
            return calendarMonth;
        }
        Calendar q2 = q(calendarMonth);
        q2.add(2, i2);
        return p(q2);
    }

    public final int o(int i2) {
        int i3 = (i2 + 6) % 7;
        if (i3 == 0) {
            return 7;
        }
        return i3;
    }

    public final CalendarMonth p(Calendar calendar) {
        int o2 = o(calendar.get(7)) - d();
        if (o2 < 0) {
            o2 += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), o2, calendar.getTimeInMillis());
    }

    public final Calendar q(CalendarMonth calendarMonth) {
        Calendar instance = Calendar.getInstance(f12282g);
        instance.setTimeInMillis(calendarMonth.e());
        return instance;
    }

    public String toString() {
        return "LegacyCalendarModel";
    }
}
