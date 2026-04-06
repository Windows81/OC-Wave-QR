package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f31677z = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).f31677z.equals(this.f31677z));
    }

    public int hashCode() {
        return this.f31677z.hashCode();
    }

    public Iterator iterator() {
        return this.f31677z.iterator();
    }

    public void p(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.f31678z;
        }
        this.f31677z.add(jsonElement);
    }
}
