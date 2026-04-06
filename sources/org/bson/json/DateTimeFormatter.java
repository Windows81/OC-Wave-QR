package org.bson.json;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Calendar;
import java.util.TimeZone;

final class DateTimeFormatter {

    /* renamed from: a  reason: collision with root package name */
    public static final FormatterImpl f43910a;

    public interface FormatterImpl {
        String a(long j2);

        long b(String str);
    }

    public static class Java8DateTimeFormatter implements FormatterImpl {
        static {
            try {
                Class.forName("java.time.format.DateTimeFormatter");
            } catch (ClassNotFoundException e2) {
                throw new ExceptionInInitializerError(e2);
            }
        }

        public String a(long j2) {
            return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.of("Z")).format(java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public long b(String str) {
            try {
                return ((Instant) java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(str, new TemporalQuery<Instant>() {
                    /* renamed from: a */
                    public Instant queryFrom(TemporalAccessor temporalAccessor) {
                        return Instant.from(temporalAccessor);
                    }
                })).toEpochMilli();
            } catch (DateTimeParseException e2) {
                throw new IllegalArgumentException(e2.getMessage());
            }
        }
    }

    public static class JaxbDateTimeFormatter implements FormatterImpl {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f43912a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f43913b;

        static {
            try {
                f43912a = Class.forName("javax.xml.bind.DatatypeConverter").getDeclaredMethod("parseDateTime", new Class[]{String.class});
                f43913b = Class.forName("javax.xml.bind.DatatypeConverter").getDeclaredMethod("printDateTime", new Class[]{Calendar.class});
            } catch (NoSuchMethodException e2) {
                throw new ExceptionInInitializerError(e2);
            } catch (ClassNotFoundException e3) {
                throw new ExceptionInInitializerError(e3);
            }
        }

        public String a(long j2) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            instance.setTimeZone(TimeZone.getTimeZone("Z"));
            try {
                return (String) f43913b.invoke((Object) null, new Object[]{instance});
            } catch (IllegalAccessException unused) {
                throw new IllegalStateException();
            } catch (InvocationTargetException e2) {
                throw ((RuntimeException) e2.getCause());
            }
        }

        public long b(String str) {
            try {
                return ((Calendar) f43912a.invoke((Object) null, new Object[]{str})).getTimeInMillis();
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException(e2);
            } catch (InvocationTargetException e3) {
                throw ((RuntimeException) e3.getCause());
            }
        }
    }

    static {
        FormatterImpl formatterImpl;
        try {
            formatterImpl = b("org.bson.json.DateTimeFormatter$Java8DateTimeFormatter");
        } catch (LinkageError unused) {
            formatterImpl = b("org.bson.json.DateTimeFormatter$JaxbDateTimeFormatter");
        }
        f43910a = formatterImpl;
    }

    public static String a(long j2) {
        return f43910a.a(j2);
    }

    public static FormatterImpl b(String str) {
        try {
            return (FormatterImpl) Class.forName(str).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (ClassNotFoundException e2) {
            throw new ExceptionInInitializerError(e2);
        } catch (InstantiationException e3) {
            throw new ExceptionInInitializerError(e3);
        } catch (IllegalAccessException e4) {
            throw new ExceptionInInitializerError(e4);
        } catch (NoSuchMethodException e5) {
            throw new ExceptionInInitializerError(e5);
        } catch (InvocationTargetException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static long c(String str) {
        return f43910a.b(str);
    }
}
