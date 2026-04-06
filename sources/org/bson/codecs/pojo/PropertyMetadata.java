package org.bson.codecs.pojo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.codecs.configuration.CodecConfigurationException;

final class PropertyMetadata<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f43839a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43840b;

    /* renamed from: c  reason: collision with root package name */
    public final TypeData f43841c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f43842d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Map f43843e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public TypeParameterMap f43844f;

    /* renamed from: g  reason: collision with root package name */
    public List f43845g;

    /* renamed from: h  reason: collision with root package name */
    public String f43846h;

    /* renamed from: i  reason: collision with root package name */
    public Field f43847i;

    /* renamed from: j  reason: collision with root package name */
    public Method f43848j;

    /* renamed from: k  reason: collision with root package name */
    public Method f43849k;

    public PropertyMetadata(String str, String str2, TypeData typeData) {
        this.f43839a = str;
        this.f43840b = str2;
        this.f43841c = typeData;
    }

    public PropertyMetadata a(Annotation annotation) {
        if (!this.f43842d.containsKey(annotation.annotationType())) {
            this.f43842d.put(annotation.annotationType(), annotation);
            return this;
        } else if (annotation.equals(this.f43842d.get(annotation.annotationType()))) {
            return this;
        } else {
            throw new CodecConfigurationException(String.format("Read annotation %s for '%s' already exists in %s", new Object[]{annotation.annotationType(), this.f43839a, this.f43840b}));
        }
    }

    public PropertyMetadata b(Annotation annotation) {
        if (!this.f43843e.containsKey(annotation.annotationType())) {
            this.f43843e.put(annotation.annotationType(), annotation);
            return this;
        } else if (annotation.equals(this.f43843e.get(annotation.annotationType()))) {
            return this;
        } else {
            throw new CodecConfigurationException(String.format("Write annotation %s for '%s' already exists in %s", new Object[]{annotation.annotationType(), this.f43839a, this.f43840b}));
        }
    }

    public PropertyMetadata c(Field field) {
        this.f43847i = field;
        return this;
    }

    public String d() {
        return this.f43840b;
    }

    public String e() {
        return this.f43846h;
    }

    public Field f() {
        return this.f43847i;
    }

    public Method g() {
        return this.f43848j;
    }

    public String h() {
        return this.f43839a;
    }

    public List i() {
        return new ArrayList(this.f43842d.values());
    }

    public Method j() {
        return this.f43849k;
    }

    public TypeData k() {
        return this.f43841c;
    }

    public TypeParameterMap l() {
        return this.f43844f;
    }

    public List m() {
        return this.f43845g;
    }

    public List n() {
        return new ArrayList(this.f43843e.values());
    }

    public boolean o() {
        if (this.f43849k != null) {
            Field field = this.f43847i;
            if (field != null) {
                return !Modifier.isFinal(field.getModifiers()) && r(this.f43847i.getModifiers());
            }
            return true;
        }
        Field field2 = this.f43847i;
        return field2 != null && !Modifier.isFinal(field2.getModifiers()) && p(this.f43847i.getModifiers());
    }

    public final boolean p(int i2) {
        return Modifier.isPublic(i2) && r(i2);
    }

    public boolean q() {
        if (this.f43848j != null) {
            Field field = this.f43847i;
            return field == null || r(field.getModifiers());
        }
        Field field2 = this.f43847i;
        return field2 != null && p(field2.getModifiers());
    }

    public final boolean r(int i2) {
        return !Modifier.isTransient(i2) && !Modifier.isStatic(i2);
    }

    public void s(String str) {
        this.f43846h = str;
    }

    public void t(Method method) {
        this.f43848j = method;
    }

    public void u(Method method) {
        this.f43849k = method;
    }

    public PropertyMetadata v(TypeParameterMap typeParameterMap, TypeData typeData) {
        if (!(typeParameterMap == null || typeData == null)) {
            this.f43844f = typeParameterMap;
            this.f43845g = typeData.a();
        }
        return this;
    }
}
