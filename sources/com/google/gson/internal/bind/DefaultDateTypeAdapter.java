package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final DateType f31766a;

    /* renamed from: b  reason: collision with root package name */
    public final List f31767b;

    public static abstract class DateType<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final DateType f31768b = new DateType<Date>(Date.class) {
            public Date d(Date date) {
                return date;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final Class f31769a;

        public DateType(Class cls) {
            this.f31769a = cls;
        }

        public final TypeAdapterFactory a(int i2, int i3) {
            return c(new DefaultDateTypeAdapter(this, i2, i3));
        }

        public final TypeAdapterFactory b(String str) {
            return c(new DefaultDateTypeAdapter(this, str));
        }

        public final TypeAdapterFactory c(DefaultDateTypeAdapter defaultDateTypeAdapter) {
            return TypeAdapters.a(this.f31769a, defaultDateTypeAdapter);
        }

        public abstract Date d(Date date);
    }

    private Date e(JsonReader jsonReader) {
        String O = jsonReader.O();
        synchronized (this.f31767b) {
            try {
                for (DateFormat parse : this.f31767b) {
                    try {
                        Date parse2 = parse.parse(O);
                        return parse2;
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return ISO8601Utils.c(O, new ParsePosition(0));
                } catch (ParseException e2) {
                    throw new JsonSyntaxException("Failed parsing '" + O + "' as Date; at path " + jsonReader.r(), e2);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: f */
    public Date b(JsonReader jsonReader) {
        if (jsonReader.S() == JsonToken.NULL) {
            jsonReader.I();
            return null;
        }
        return this.f31766a.d(e(jsonReader));
    }

    /* renamed from: g */
    public void d(JsonWriter jsonWriter, Date date) {
        String format;
        if (date == null) {
            jsonWriter.y();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f31767b.get(0);
        synchronized (this.f31767b) {
            format = dateFormat.format(date);
        }
        jsonWriter.X(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f31767b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public DefaultDateTypeAdapter(DateType dateType, String str) {
        ArrayList arrayList = new ArrayList();
        this.f31767b = arrayList;
        Objects.requireNonNull(dateType);
        this.f31766a = dateType;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public DefaultDateTypeAdapter(DateType dateType, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.f31767b = arrayList;
        Objects.requireNonNull(dateType);
        this.f31766a = dateType;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (JavaVersion.d()) {
            arrayList.add(PreJava9DateFormatProvider.c(i2, i3));
        }
    }
}
