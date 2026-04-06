package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f31883b = new TypeAdapterFactory() {
        public TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.m(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final TypeAdapter f31884a;

    /* renamed from: e */
    public Timestamp b(JsonReader jsonReader) {
        Date date = (Date) this.f31884a.b(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* renamed from: f */
    public void d(JsonWriter jsonWriter, Timestamp timestamp) {
        this.f31884a.d(jsonWriter, timestamp);
    }

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f31884a = typeAdapter;
    }
}
