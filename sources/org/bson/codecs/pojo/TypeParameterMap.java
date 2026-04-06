package org.bson.codecs.pojo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class TypeParameterMap {

    /* renamed from: a  reason: collision with root package name */
    public final Map f43878a;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Map f43879a;

        public Builder a(int i2) {
            this.f43879a.put(-1, Integer.valueOf(i2));
            return this;
        }

        public Builder b(int i2, int i3) {
            this.f43879a.put(Integer.valueOf(i2), Integer.valueOf(i3));
            return this;
        }

        public TypeParameterMap c() {
            if (this.f43879a.size() <= 1 || !this.f43879a.containsKey(-1)) {
                return new TypeParameterMap(this.f43879a);
            }
            throw new IllegalStateException("You cannot have a generic field that also has type parameters.");
        }

        public Builder() {
            this.f43879a = new HashMap();
        }
    }

    public static Builder a() {
        return new Builder();
    }

    public Map b() {
        return this.f43878a;
    }

    public boolean c() {
        return !this.f43878a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && TypeParameterMap.class == obj.getClass() && b().equals(((TypeParameterMap) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "TypeParameterMap{fieldToClassParamIndexMap=" + this.f43878a + "}";
    }

    public TypeParameterMap(Map map) {
        this.f43878a = Collections.unmodifiableMap(map);
    }
}
