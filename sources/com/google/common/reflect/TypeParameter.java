package com.google.common.reflect;

import java.lang.reflect.TypeVariable;

@ElementTypesAreNonnullByDefault
public abstract class TypeParameter<T> extends TypeCapture<T> {

    /* renamed from: z  reason: collision with root package name */
    public final TypeVariable f29224z;

    public final boolean equals(Object obj) {
        if (obj instanceof TypeParameter) {
            return this.f29224z.equals(((TypeParameter) obj).f29224z);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29224z.hashCode();
    }

    public String toString() {
        return this.f29224z.toString();
    }
}
