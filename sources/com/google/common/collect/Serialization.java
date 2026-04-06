package com.google.common.collect;

import java.lang.reflect.Field;

@ElementTypesAreNonnullByDefault
final class Serialization {

    public static final class FieldSetter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Field f28520a;

        public FieldSetter(Field field) {
            this.f28520a = field;
            field.setAccessible(true);
        }
    }

    public static FieldSetter a(Class cls, String str) {
        try {
            return new FieldSetter(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }
}
