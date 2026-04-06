package org.bson.codecs.pojo;

import java.util.Collections;
import java.util.List;
import org.bson.assertions.Assertions;
import org.bson.codecs.Codec;

public final class PropertyModelBuilder<T> {

    /* renamed from: a  reason: collision with root package name */
    public String f43860a;

    /* renamed from: b  reason: collision with root package name */
    public String f43861b;

    /* renamed from: c  reason: collision with root package name */
    public String f43862c;

    /* renamed from: d  reason: collision with root package name */
    public TypeData f43863d;

    /* renamed from: e  reason: collision with root package name */
    public PropertySerialization f43864e;

    /* renamed from: f  reason: collision with root package name */
    public Codec f43865f;

    /* renamed from: g  reason: collision with root package name */
    public PropertyAccessor f43866g;

    /* renamed from: h  reason: collision with root package name */
    public List f43867h = Collections.emptyList();

    /* renamed from: i  reason: collision with root package name */
    public List f43868i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    public Boolean f43869j;

    /* renamed from: k  reason: collision with root package name */
    public String f43870k;

    public PropertyModel a() {
        if (j() || k()) {
            return new PropertyModel((String) PojoBuilderHelper.k("propertyName", this.f43860a), this.f43861b, this.f43862c, (TypeData) PojoBuilderHelper.k("typeData", this.f43863d), this.f43865f, (PropertySerialization) PojoBuilderHelper.k("propertySerialization", this.f43864e), this.f43869j, (PropertyAccessor) PojoBuilderHelper.k("propertyAccessor", this.f43866g), this.f43870k);
        }
        throw new IllegalStateException(String.format("Invalid PropertyModel '%s', neither readable or writable,", new Object[]{this.f43860a}));
    }

    public PropertyModelBuilder b(boolean z2) {
        this.f43869j = Boolean.valueOf(z2);
        return this;
    }

    public String c() {
        return this.f43860a;
    }

    public PropertyAccessor d() {
        return this.f43866g;
    }

    public List e() {
        return this.f43867h;
    }

    public String f() {
        return this.f43861b;
    }

    public TypeData g() {
        return this.f43863d;
    }

    public List h() {
        return this.f43868i;
    }

    public String i() {
        return this.f43862c;
    }

    public boolean j() {
        return this.f43861b != null;
    }

    public boolean k() {
        return this.f43862c != null;
    }

    public PropertyModelBuilder l(PropertyAccessor propertyAccessor) {
        this.f43866g = propertyAccessor;
        return this;
    }

    public PropertyModelBuilder m(String str) {
        this.f43860a = (String) Assertions.d("propertyName", str);
        return this;
    }

    public PropertyModelBuilder n(PropertySerialization propertySerialization) {
        this.f43864e = (PropertySerialization) Assertions.d("propertySerialization", propertySerialization);
        return this;
    }

    public PropertyModelBuilder o(List list) {
        this.f43867h = Collections.unmodifiableList((List) Assertions.d("annotations", list));
        return this;
    }

    public PropertyModelBuilder p(String str) {
        this.f43861b = str;
        return this;
    }

    public PropertyModelBuilder q(String str) {
        this.f43870k = str;
        return this;
    }

    public PropertyModelBuilder r(TypeData typeData) {
        this.f43863d = (TypeData) Assertions.d("typeData", typeData);
        return this;
    }

    public PropertyModelBuilder s(List list) {
        this.f43868i = list;
        return this;
    }

    public PropertyModelBuilder t(String str) {
        this.f43862c = str;
        return this;
    }

    public String toString() {
        return String.format("PropertyModelBuilder{propertyName=%s, typeData=%s}", new Object[]{this.f43860a, this.f43863d});
    }
}
