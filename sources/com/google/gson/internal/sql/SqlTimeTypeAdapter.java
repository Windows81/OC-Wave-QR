package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f31881b = new TypeAdapterFactory() {
        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f31882a;

    /* renamed from: e */
    public Time b(JsonReader jsonReader) {
        Time time;
        if (jsonReader.S() == JsonToken.NULL) {
            jsonReader.I();
            return null;
        }
        String O = jsonReader.O();
        try {
            synchronized (this) {
                time = new Time(this.f31882a.parse(O).getTime());
            }
            return time;
        } catch (ParseException e2) {
            throw new JsonSyntaxException("Failed parsing '" + O + "' as SQL Time; at path " + jsonReader.r(), e2);
        }
    }

    /* renamed from: f */
    public void d(JsonWriter jsonWriter, Time time) {
        String format;
        if (time == null) {
            jsonWriter.y();
            return;
        }
        synchronized (this) {
            format = this.f31882a.format(time);
        }
        jsonWriter.X(format);
    }

    public SqlTimeTypeAdapter() {
        this.f31882a = new SimpleDateFormat("hh:mm:ss a");
    }
}
