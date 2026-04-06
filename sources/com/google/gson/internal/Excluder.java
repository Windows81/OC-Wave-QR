package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder F = new Excluder();

    /* renamed from: A  reason: collision with root package name */
    public int f31722A = 136;

    /* renamed from: B  reason: collision with root package name */
    public boolean f31723B = true;
    public boolean C;
    public List D = Collections.emptyList();
    public List E = Collections.emptyList();

    /* renamed from: z  reason: collision with root package name */
    public double f31724z = -1.0d;

    public TypeAdapter b(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean f2 = f(rawType);
        final boolean z2 = f2 || g(rawType, true);
        final boolean z3 = f2 || g(rawType, false);
        if (!z2 && !z3) {
            return null;
        }
        final Gson gson2 = gson;
        final TypeToken typeToken2 = typeToken;
        return new TypeAdapter<Object>() {

            /* renamed from: a  reason: collision with root package name */
            public TypeAdapter f31725a;

            public Object b(JsonReader jsonReader) {
                if (!z3) {
                    return e().b(jsonReader);
                }
                jsonReader.Y();
                return null;
            }

            public void d(JsonWriter jsonWriter, Object obj) {
                if (z2) {
                    jsonWriter.y();
                } else {
                    e().d(jsonWriter, obj);
                }
            }

            public final TypeAdapter e() {
                TypeAdapter typeAdapter = this.f31725a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter n2 = gson2.n(Excluder.this, typeToken2);
                this.f31725a = n2;
                return n2;
            }
        };
    }

    /* renamed from: c */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean e(Class cls, boolean z2) {
        return f(cls) || g(cls, z2);
    }

    public final boolean f(Class cls) {
        if (this.f31724z != -1.0d && !p((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if (this.f31723B || !k(cls)) {
            return j(cls);
        }
        return true;
    }

    public final boolean g(Class cls, boolean z2) {
        for (ExclusionStrategy b2 : z2 ? this.D : this.E) {
            if (b2.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(Field field, boolean z2) {
        Expose expose;
        if ((this.f31722A & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f31724z != -1.0d && !p((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.C && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z2 ? !expose.deserialize() : !expose.serialize()))) {
            return true;
        }
        if ((!this.f31723B && k(field.getType())) || j(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = z2 ? this.D : this.E;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        for (ExclusionStrategy a2 : list) {
            if (a2.a(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    public Excluder i() {
        Excluder c2 = clone();
        c2.C = true;
        return c2;
    }

    public final boolean j(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && !l(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean k(Class cls) {
        return cls.isMemberClass() && !l(cls);
    }

    public final boolean l(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean n(Since since) {
        if (since == null) {
            return true;
        }
        return this.f31724z >= since.value();
    }

    public final boolean o(Until until) {
        if (until == null) {
            return true;
        }
        return this.f31724z < until.value();
    }

    public final boolean p(Since since, Until until) {
        return n(since) && o(until);
    }
}
