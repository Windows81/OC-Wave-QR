package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class JsonTreeWriter extends JsonWriter {
    public static final Writer O = new Writer() {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    };
    public static final JsonPrimitive P = new JsonPrimitive("closed");
    public final List L = new ArrayList();
    public String M;
    public JsonElement N = JsonNull.f31678z;

    public JsonTreeWriter() {
        super(O);
    }

    public JsonWriter O(double d2) {
        if (m() || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            m0(new JsonPrimitive((Number) Double.valueOf(d2)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
    }

    public JsonWriter Q(long j2) {
        m0(new JsonPrimitive((Number) Long.valueOf(j2)));
        return this;
    }

    public JsonWriter S(Boolean bool) {
        if (bool == null) {
            return y();
        }
        m0(new JsonPrimitive(bool));
        return this;
    }

    public JsonWriter T(Number number) {
        if (number == null) {
            return y();
        }
        if (!m()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m0(new JsonPrimitive(number));
        return this;
    }

    public JsonWriter X(String str) {
        if (str == null) {
            return y();
        }
        m0(new JsonPrimitive(str));
        return this;
    }

    public JsonWriter c() {
        JsonArray jsonArray = new JsonArray();
        m0(jsonArray);
        this.L.add(jsonArray);
        return this;
    }

    public JsonWriter c0(boolean z2) {
        m0(new JsonPrimitive(Boolean.valueOf(z2)));
        return this;
    }

    public void close() {
        if (this.L.isEmpty()) {
            this.L.add(P);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter d() {
        JsonObject jsonObject = new JsonObject();
        m0(jsonObject);
        this.L.add(jsonObject);
        return this;
    }

    public JsonElement f0() {
        if (this.L.isEmpty()) {
            return this.N;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.L);
    }

    public void flush() {
    }

    public JsonWriter g() {
        if (this.L.isEmpty() || this.M != null) {
            throw new IllegalStateException();
        } else if (g0() instanceof JsonArray) {
            List list = this.L;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final JsonElement g0() {
        List list = this.L;
        return (JsonElement) list.get(list.size() - 1);
    }

    public JsonWriter j() {
        if (this.L.isEmpty() || this.M != null) {
            throw new IllegalStateException();
        } else if (g0() instanceof JsonObject) {
            List list = this.L;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void m0(JsonElement jsonElement) {
        if (this.M != null) {
            if (!jsonElement.m() || k()) {
                ((JsonObject) g0()).p(this.M, jsonElement);
            }
            this.M = null;
        } else if (this.L.isEmpty()) {
            this.N = jsonElement;
        } else {
            JsonElement g0 = g0();
            if (g0 instanceof JsonArray) {
                ((JsonArray) g0).p(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public JsonWriter t(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.L.isEmpty() || this.M != null) {
            throw new IllegalStateException();
        } else if (g0() instanceof JsonObject) {
            this.M = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public JsonWriter y() {
        m0(JsonNull.f31678z);
        return this;
    }
}
