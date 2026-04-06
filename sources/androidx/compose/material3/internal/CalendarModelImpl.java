package androidx.compose.material3.internal;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CalendarModelImpl extends CalendarModel {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f12191e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f12192f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneId f12193g = ZoneId.of("UTC");

    /* renamed from: c  reason: collision with root package name */
    public final int f12194c;

    /* renamed from: d  reason: collision with root package name */
    public final List f12195d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(long j2, String str, Locale locale, Map map) {
            return Instant.ofEpochMilli(j2).atZone(d()).toLocalDate().format(c(str, locale, map));
        }

        public final DateTimeFormatter c(String str, Locale locale, Map map) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object obj = map.get(str2);
            if (obj == null) {
                obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                map.put(str2, obj);
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return (DateTimeFormatter) obj;
        }

        public final ZoneId d() {
            return CalendarModelImpl.f12193g;
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class EntriesMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f12196a = EnumEntriesKt.a(DayOfWeek.values());
    }

    public String a(long j2, String str, Locale locale) {
        return f12191e.b(j2, str, locale, e());
    }

    public CalendarDate b(long j2) {
        LocalDate localDate = Instant.ofEpochMilli(j2).atZone(f12193g).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * ((long) 1000));
    }

    public DateInputFormat c(Locale locale) {
        return CalendarModelKt.a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, (FormatStyle) null, Chronology.ofLocale(locale), locale));
    }

    public int d() {
        return this.f12194c;
    }

    public CalendarMonth g(int i2, int i3) {
        return o(LocalDate.of(i2, i3, 1));
    }

    public CalendarMonth h(long j2) {
        return o(Instant.ofEpochMilli(j2).atZone(f12193g).withDayOfMonth(1).toLocalDate());
    }

    public CalendarMonth i(CalendarDate calendarDate) {
        return o(LocalDate.of(calendarDate.k(), calendarDate.h(), 1));
    }

    public CalendarDate j() {
        LocalDate now = LocalDate.now();
        return new CalendarDate(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.atTime(LocalTime.MIDNIGHT).atZone(f12193g).toInstant().toEpochMilli());
    }

    public List k() {
        return this.f12195d;
    }

    public CalendarDate l(String str, String str2, Locale locale) {
        try {
            LocalDate parse = LocalDate.parse(str, f12191e.c(str2, locale, e()));
            return new CalendarDate(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.atTime(LocalTime.MIDNIGHT).atZone(f12193g).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public CalendarMonth m(CalendarMonth calendarMonth, int i2) {
        return i2 <= 0 ? calendarMonth : o(p(calendarMonth).plusMonths((long) i2));
    }

    public final CalendarMonth o(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - d();
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f12193g).toInstant().toEpochMilli());
    }

    public final LocalDate p(CalendarMonth calendarMonth) {
        return Instant.ofEpochMilli(calendarMonth.e()).atZone(f12193g).toLocalDate();
    }

    public String toString() {
        return "CalendarModel";
    }
}
