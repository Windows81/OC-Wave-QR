package org.bson.codecs.pojo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.assertions.Assertions;

final class TypeData<T> implements TypeWithTypeParameters<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Map f43873c;

    /* renamed from: a  reason: collision with root package name */
    public final Class f43874a;

    /* renamed from: b  reason: collision with root package name */
    public final List f43875b;

    public static final class Builder<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class f43876a;

        /* renamed from: b  reason: collision with root package name */
        public final List f43877b;

        public Builder a(TypeData typeData) {
            this.f43877b.add(Assertions.d("typeParameter", typeData));
            return this;
        }

        public Builder b(List list) {
            Assertions.d("typeParameters", list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((TypeData) it.next());
            }
            return this;
        }

        public TypeData c() {
            return new TypeData(this.f43876a, Collections.unmodifiableList(this.f43877b));
        }

        public Builder(Class cls) {
            this.f43877b = new ArrayList();
            this.f43876a = cls;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Short.TYPE, Short.class);
        f43873c = hashMap;
    }

    public static Builder c(Class cls) {
        return new Builder((Class) Assertions.d("type", cls));
    }

    public static void d(Builder builder, Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Builder c2 = c((Class) parameterizedType.getRawType());
            for (Type d2 : parameterizedType.getActualTypeArguments()) {
                d(c2, d2);
            }
            builder.a(c2.c());
        } else if (type instanceof WildcardType) {
            builder.a(c((Class) ((WildcardType) type).getUpperBounds()[0]).c());
        } else if (type instanceof TypeVariable) {
            builder.a(c(Object.class).c());
        } else if (type instanceof Class) {
            builder.a(c((Class) type).c());
        }
    }

    public static String f(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            TypeData typeData = (TypeData) it.next();
            i2++;
            sb.append(typeData.getType().getSimpleName());
            if (!typeData.a().isEmpty()) {
                sb.append(String.format("<%s>", new Object[]{f(typeData.a())}));
            }
            if (i2 < size) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static TypeData g(Field field) {
        return i(field.getGenericType(), field.getType());
    }

    public static TypeData h(Method method) {
        return PropertyReflectionUtils.b(method) ? i(method.getGenericReturnType(), method.getReturnType()) : i(method.getGenericParameterTypes()[0], method.getParameterTypes()[0]);
    }

    public static TypeData i(Type type, Class cls) {
        Builder c2 = c(cls);
        if (type instanceof ParameterizedType) {
            for (Type d2 : ((ParameterizedType) type).getActualTypeArguments()) {
                d(c2, d2);
            }
        }
        return c2.c();
    }

    public List a() {
        return this.f43875b;
    }

    public final Class b(Class cls) {
        return cls.isPrimitive() ? (Class) f43873c.get(cls) : cls;
    }

    public boolean e(Class cls) {
        return this.f43874a.isAssignableFrom(b(cls));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeData)) {
            return false;
        }
        TypeData typeData = (TypeData) obj;
        return getType().equals(typeData.getType()) && a().equals(typeData.a());
    }

    public Class getType() {
        return this.f43874a;
    }

    public int hashCode() {
        return (getType().hashCode() * 31) + a().hashCode();
    }

    public String toString() {
        String str;
        if (this.f43875b.isEmpty()) {
            str = "";
        } else {
            str = ", typeParameters=[" + f(this.f43875b) + "]";
        }
        return "TypeData{type=" + this.f43874a.getSimpleName() + str + "}";
    }

    public TypeData(Class cls, List list) {
        this.f43874a = b(cls);
        this.f43875b = list;
    }
}
