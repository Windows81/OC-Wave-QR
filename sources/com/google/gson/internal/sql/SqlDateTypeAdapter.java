package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f31879b = new TypeAdapterFactory() {
        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f31880a;

    /* renamed from: e */
    public Date b(JsonReader jsonReader) {
        java.util.Date parse;
        if (jsonReader.S() == JsonToken.NULL) {
            jsonReader.I();
            return null;
        }
        String O = jsonReader.O();
        try {
            synchronized (this) {
                parse = this.f31880a.parse(O);
            }
            return new Date(parse.getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException("Failed parsing '" + O + "' as SQL Date; at path " + jsonReader.r(), e2);
        }
    }

    /* renamed from: f */
    public void d(JsonWriter jsonWriter, Date date) {
        String format;
        if (date == null) {
            jsonWriter.y();
            return;
        }
        synchronized (this) {
            format = this.f31880a.format(date);
        }
        jsonWriter.X(format);
    }

    public SqlDateTypeAdapter() {
        this.f31880a = new SimpleDateFormat("MMM d, yyyy");
    }
}
