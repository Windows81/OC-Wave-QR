package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f31764b = new TypeAdapterFactory() {
        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List f31765a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f31765a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.d()) {
            arrayList.add(PreJava9DateFormatProvider.c(2, 2));
        }
    }

    public final Date e(JsonReader jsonReader) {
        String O = jsonReader.O();
        synchronized (this.f31765a) {
            try {
                for (DateFormat parse : this.f31765a) {
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
        if (jsonReader.S() != JsonToken.NULL) {
            return e(jsonReader);
        }
        jsonReader.I();
        return null;
    }

    /* renamed from: g */
    public void d(JsonWriter jsonWriter, Date date) {
        String format;
        if (date == null) {
            jsonWriter.y();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f31765a.get(0);
        synchronized (this.f31765a) {
            format = dateFormat.format(date);
        }
        jsonWriter.X(format);
    }
}
