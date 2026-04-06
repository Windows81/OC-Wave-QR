package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

public final class FieldAttributes {

    /* renamed from: a  reason: collision with root package name */
    public final Field f31620a;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.f31620a = field;
    }

    public String toString() {
        return this.f31620a.toString();
    }
}
