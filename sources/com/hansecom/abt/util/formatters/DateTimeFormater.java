package com.hansecom.abt.util.formatters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DateTimeFormater {

    /* renamed from: a  reason: collision with root package name */
    public static final DateTimeFormater f39048a = new DateTimeFormater();

    public static /* synthetic */ String b(DateTimeFormater dateTimeFormater, LocalDate localDate, FormatStyle formatStyle, Locale locale, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            formatStyle = FormatStyle.SHORT;
        }
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
        }
        return dateTimeFormater.a(localDate, formatStyle, locale);
    }

    public static /* synthetic */ String d(DateTimeFormater dateTimeFormater, LocalDateTime localDateTime, FormatStyle formatStyle, Locale locale, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            formatStyle = FormatStyle.SHORT;
        }
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
        }
        return dateTimeFormater.c(localDateTime, formatStyle, locale);
    }

    public static /* synthetic */ String f(DateTimeFormater dateTimeFormater, LocalTime localTime, FormatStyle formatStyle, Locale locale, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            formatStyle = FormatStyle.SHORT;
        }
        if ((i2 & 4) != 0) {
            locale = Locale.getDefault();
        }
        return dateTimeFormater.e(localTime, formatStyle, locale);
    }

    public final String a(LocalDate localDate, FormatStyle formatStyle, Locale locale) {
        Intrinsics.i(formatStyle, "formatStyle");
        Intrinsics.i(locale, "locale");
        String format = localDate != null ? localDate.format(DateTimeFormatter.ofLocalizedDate(formatStyle).withLocale(locale)) : null;
        return format == null ? "" : format;
    }

    public final String c(LocalDateTime localDateTime, FormatStyle formatStyle, Locale locale) {
        String str;
        Intrinsics.i(formatStyle, "formatStyle");
        Intrinsics.i(locale, "locale");
        if (localDateTime != null) {
            StringBuilder sb = new StringBuilder();
            DateTimeFormater dateTimeFormater = f39048a;
            sb.append(dateTimeFormater.e(localDateTime.toLocalTime(), formatStyle, locale));
            sb.append(' ');
            sb.append(dateTimeFormater.a(localDateTime.toLocalDate(), formatStyle, locale));
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final String e(LocalTime localTime, FormatStyle formatStyle, Locale locale) {
        Intrinsics.i(formatStyle, "formatStyle");
        Intrinsics.i(locale, "locale");
        String format = localTime != null ? localTime.format(DateTimeFormatter.ofLocalizedTime(formatStyle).withLocale(locale)) : null;
        return format == null ? "" : format;
    }
}
