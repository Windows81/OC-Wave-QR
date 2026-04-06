package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Set;

public final class JsonObject extends JsonElement {

    /* renamed from: z  reason: collision with root package name */
    public final LinkedTreeMap f31679z = new LinkedTreeMap(false);

    public Set entrySet() {
        return this.f31679z.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).f31679z.equals(this.f31679z));
    }

    public int hashCode() {
        return this.f31679z.hashCode();
    }

    public void p(String str, JsonElement jsonElement) {
        LinkedTreeMap linkedTreeMap = this.f31679z;
        if (jsonElement == null) {
            jsonElement = JsonNull.f31678z;
        }
        linkedTreeMap.put(str, jsonElement);
    }
}
