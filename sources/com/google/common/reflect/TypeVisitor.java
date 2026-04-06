package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class TypeVisitor {

    /* renamed from: a  reason: collision with root package name */
    public final Set f29255a = Sets.h();

    public final void a(Type... typeArr) {
        for (TypeVariable typeVariable : typeArr) {
            if (typeVariable != null && this.f29255a.add(typeVariable)) {
                try {
                    if (typeVariable instanceof TypeVariable) {
                        e(typeVariable);
                    } else if (typeVariable instanceof WildcardType) {
                        f((WildcardType) typeVariable);
                    } else if (typeVariable instanceof ParameterizedType) {
                        d(typeVariable);
                    } else if (typeVariable instanceof Class) {
                        b(typeVariable);
                    } else if (typeVariable instanceof GenericArrayType) {
                        c(typeVariable);
                    } else {
                        String valueOf = String.valueOf(typeVariable);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
                        sb.append("Unknown type: ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    this.f29255a.remove(typeVariable);
                    throw th;
                }
            }
        }
    }

    public void b(Class cls) {
    }

    public void c(GenericArrayType genericArrayType) {
    }

    public void d(ParameterizedType parameterizedType) {
    }

    public void e(TypeVariable typeVariable) {
    }

    public void f(WildcardType wildcardType) {
    }
}
