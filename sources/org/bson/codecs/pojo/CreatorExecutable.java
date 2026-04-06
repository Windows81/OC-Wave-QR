package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

final class CreatorExecutable<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f43790a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f43791b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f43792c;

    /* renamed from: d  reason: collision with root package name */
    public final List f43793d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f43794e;

    /* renamed from: f  reason: collision with root package name */
    public final List f43795f;

    /* renamed from: g  reason: collision with root package name */
    public final List f43796g;

    public CreatorExecutable(Class cls, Constructor constructor) {
        this(cls, constructor, (Method) null);
    }

    public static CodecConfigurationException c(Class cls, boolean z2, String str) {
        return new CodecConfigurationException(String.format("Invalid @BsonCreator %s in %s. %s", new Object[]{z2 ? "constructor" : "method", cls.getSimpleName(), str}));
    }

    public final void a() {
        if (this.f43791b == null && this.f43792c == null) {
            throw new CodecConfigurationException(String.format("Cannot find a public constructor for '%s'.", new Object[]{this.f43790a.getSimpleName()}));
        }
    }

    public CodecConfigurationException b(Class cls, String str) {
        return c(cls, this.f43791b != null, str);
    }

    public Integer d() {
        return this.f43794e;
    }

    public Object e() {
        a();
        try {
            Constructor constructor = this.f43791b;
            return constructor != null ? constructor.newInstance((Object[]) null) : this.f43792c.invoke(this.f43790a, (Object[]) null);
        } catch (Exception e2) {
            throw new CodecConfigurationException(e2.getMessage(), e2);
        }
    }

    public Object f(Object[] objArr) {
        a();
        try {
            Constructor constructor = this.f43791b;
            return constructor != null ? constructor.newInstance(objArr) : this.f43792c.invoke(this.f43790a, objArr);
        } catch (Exception e2) {
            throw new CodecConfigurationException(e2.getMessage(), e2);
        }
    }

    public List g() {
        return this.f43796g;
    }

    public List h() {
        return this.f43795f;
    }

    public List i() {
        return this.f43793d;
    }

    public Class j() {
        return this.f43790a;
    }

    public CreatorExecutable(Class cls, Method method) {
        this(cls, (Constructor) null, method);
    }

    public CreatorExecutable(Class cls, Constructor constructor, Method method) {
        Annotation[][] annotationArr;
        this.f43793d = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43795f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f43796g = arrayList2;
        this.f43790a = cls;
        this.f43791b = constructor;
        this.f43792c = method;
        Integer num = null;
        if (!(constructor == null && method == null)) {
            Class[] parameterTypes = constructor != null ? constructor.getParameterTypes() : method.getParameterTypes();
            Type[] genericParameterTypes = constructor != null ? constructor.getGenericParameterTypes() : method.getGenericParameterTypes();
            arrayList.addAll(Arrays.asList(parameterTypes));
            arrayList2.addAll(Arrays.asList(genericParameterTypes));
            if (constructor != null) {
                annotationArr = constructor.getParameterAnnotations();
            } else {
                annotationArr = method.getParameterAnnotations();
            }
            Integer num2 = null;
            for (int i2 = 0; i2 < annotationArr.length; i2++) {
                Annotation[] annotationArr2 = annotationArr[i2];
                int length = annotationArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    Annotation annotation = annotationArr2[i3];
                    if (annotation.annotationType().equals(BsonProperty.class)) {
                        this.f43793d.add((BsonProperty) annotation);
                        break;
                    } else if (annotation.annotationType().equals(BsonId.class)) {
                        this.f43793d.add((Object) null);
                        num2 = Integer.valueOf(i2);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            num = num2;
        }
        this.f43794e = num;
    }
}
