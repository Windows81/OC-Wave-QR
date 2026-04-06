package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@ElementTypesAreNonnullByDefault
public final class Parameter implements AnnotatedElement {

    /* renamed from: a  reason: collision with root package name */
    public final Invokable f29220a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29221b;

    /* renamed from: c  reason: collision with root package name */
    public final TypeToken f29222c;

    /* renamed from: d  reason: collision with root package name */
    public final ImmutableList f29223d;

    public boolean equals(Object obj) {
        if (!(obj instanceof Parameter)) {
            return false;
        }
        Parameter parameter = (Parameter) obj;
        return this.f29221b == parameter.f29221b && this.f29220a.equals(parameter.f29220a);
    }

    public Annotation getAnnotation(Class cls) {
        Preconditions.q(cls);
        UnmodifiableIterator o2 = this.f29223d.iterator();
        while (o2.hasNext()) {
            Annotation annotation = (Annotation) o2.next();
            if (cls.isInstance(annotation)) {
                return (Annotation) cls.cast(annotation);
            }
        }
        return null;
    }

    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    public Annotation[] getAnnotationsByType(Class cls) {
        return getDeclaredAnnotationsByType(cls);
    }

    public Annotation getDeclaredAnnotation(Class cls) {
        Preconditions.q(cls);
        return (Annotation) FluentIterable.n(this.f29223d).i(cls).m().f();
    }

    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f29223d.toArray(new Annotation[0]);
    }

    public Annotation[] getDeclaredAnnotationsByType(Class cls) {
        return (Annotation[]) FluentIterable.n(this.f29223d).i(cls).p(cls);
    }

    public int hashCode() {
        return this.f29221b;
    }

    public boolean isAnnotationPresent(Class cls) {
        return getAnnotation(cls) != null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f29222c);
        int i2 = this.f29221b;
        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
        sb.append(valueOf);
        sb.append(" arg");
        sb.append(i2);
        return sb.toString();
    }
}
