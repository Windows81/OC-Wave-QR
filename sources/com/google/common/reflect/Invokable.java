package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
public abstract class Invokable<T, R> implements AnnotatedElement, Member {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibleObject f29214a;

    /* renamed from: b  reason: collision with root package name */
    public final Member f29215b;

    public static class ConstructorInvokable<T> extends Invokable<T, T> {

        /* renamed from: c  reason: collision with root package name */
        public final Constructor f29216c;

        public Type[] b() {
            Type[] genericParameterTypes = this.f29216c.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !c()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f29216c.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        public final boolean c() {
            Class declaringClass = this.f29216c.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            return enclosingMethod != null ? !Modifier.isStatic(enclosingMethod.getModifiers()) : declaringClass.getEnclosingClass() != null && !Modifier.isStatic(declaringClass.getModifiers());
        }
    }

    public static class MethodInvokable<T> extends Invokable<T, Object> {
    }

    public TypeToken a() {
        return TypeToken.n(getDeclaringClass());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Invokable)) {
            return false;
        }
        Invokable invokable = (Invokable) obj;
        return a().equals(invokable.a()) && this.f29215b.equals(invokable.f29215b);
    }

    public final Annotation getAnnotation(Class cls) {
        return this.f29214a.getAnnotation(cls);
    }

    public final Annotation[] getAnnotations() {
        return this.f29214a.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f29214a.getDeclaredAnnotations();
    }

    public final Class getDeclaringClass() {
        return this.f29215b.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f29215b.getModifiers();
    }

    public final String getName() {
        return this.f29215b.getName();
    }

    public int hashCode() {
        return this.f29215b.hashCode();
    }

    public final boolean isAnnotationPresent(Class cls) {
        return this.f29214a.isAnnotationPresent(cls);
    }

    public final boolean isSynthetic() {
        return this.f29215b.isSynthetic();
    }

    public String toString() {
        return this.f29215b.toString();
    }
}
