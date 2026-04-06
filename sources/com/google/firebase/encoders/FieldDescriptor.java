package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class FieldDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final String f30698a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f30699b;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final String f30700a;

        /* renamed from: b  reason: collision with root package name */
        public Map f30701b = null;

        public Builder(String str) {
            this.f30700a = str;
        }

        public FieldDescriptor a() {
            return new FieldDescriptor(this.f30700a, this.f30701b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f30701b)));
        }

        public Builder b(Annotation annotation) {
            if (this.f30701b == null) {
                this.f30701b = new HashMap();
            }
            this.f30701b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static Builder a(String str) {
        return new Builder(str);
    }

    public static FieldDescriptor d(String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public String b() {
        return this.f30698a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f30699b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f30698a.equals(fieldDescriptor.f30698a) && this.f30699b.equals(fieldDescriptor.f30699b);
    }

    public int hashCode() {
        return (this.f30698a.hashCode() * 31) + this.f30699b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f30698a + ", properties=" + this.f30699b.values() + "}";
    }

    public FieldDescriptor(String str, Map map) {
        this.f30698a = str;
        this.f30699b = map;
    }
}
