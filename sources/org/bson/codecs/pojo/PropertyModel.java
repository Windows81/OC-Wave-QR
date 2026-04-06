package org.bson.codecs.pojo;

import org.bson.codecs.Codec;

public final class PropertyModel<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f43850a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43851b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43852c;

    /* renamed from: d  reason: collision with root package name */
    public final TypeData f43853d;

    /* renamed from: e  reason: collision with root package name */
    public final Codec f43854e;

    /* renamed from: f  reason: collision with root package name */
    public final PropertySerialization f43855f;

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f43856g;

    /* renamed from: h  reason: collision with root package name */
    public final PropertyAccessor f43857h;

    /* renamed from: i  reason: collision with root package name */
    public final String f43858i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Codec f43859j;

    public PropertyModel(String str, String str2, String str3, TypeData typeData, Codec codec, PropertySerialization propertySerialization, Boolean bool, PropertyAccessor propertyAccessor, String str4) {
        this.f43850a = str;
        this.f43851b = str2;
        this.f43852c = str3;
        this.f43853d = typeData;
        this.f43854e = codec;
        this.f43859j = codec;
        this.f43855f = propertySerialization;
        this.f43856g = bool;
        this.f43857h = propertyAccessor;
        this.f43858i = str4;
    }

    public static PropertyModelBuilder a() {
        return new PropertyModelBuilder();
    }

    public void b(Codec codec) {
        this.f43859j = codec;
    }

    public Codec c() {
        return this.f43859j;
    }

    public Codec d() {
        return this.f43854e;
    }

    public String e() {
        return this.f43858i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PropertyModel.class != obj.getClass()) {
            return false;
        }
        PropertyModel propertyModel = (PropertyModel) obj;
        if (f() == null ? propertyModel.f() != null : !f().equals(propertyModel.f())) {
            return false;
        }
        if (i() == null ? propertyModel.i() != null : !i().equals(propertyModel.i())) {
            return false;
        }
        if (k() == null ? propertyModel.k() != null : !k().equals(propertyModel.k())) {
            return false;
        }
        if (j() == null ? propertyModel.j() != null : !j().equals(propertyModel.j())) {
            return false;
        }
        if (d() == null ? propertyModel.d() != null : !d().equals(propertyModel.d())) {
            return false;
        }
        if (h() == null ? propertyModel.h() != null : !h().equals(propertyModel.h())) {
            return false;
        }
        Boolean bool = this.f43856g;
        if (bool == null ? propertyModel.f43856g != null : !bool.equals(propertyModel.f43856g)) {
            return false;
        }
        if (g() == null ? propertyModel.g() != null : !g().equals(propertyModel.g())) {
            return false;
        }
        if (e() == null ? propertyModel.e() == null : e().equals(propertyModel.e())) {
            return c() == null ? propertyModel.c() == null : c().equals(propertyModel.c());
        }
        return false;
    }

    public String f() {
        return this.f43850a;
    }

    public PropertyAccessor g() {
        return this.f43857h;
    }

    public PropertySerialization h() {
        return this.f43855f;
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = (((((((((((f() != null ? f().hashCode() : 0) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (j() != null ? j().hashCode() : 0)) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + (h() != null ? h().hashCode() : 0)) * 31;
        Boolean bool = this.f43856g;
        int hashCode2 = (((((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + (g() != null ? g().hashCode() : 0)) * 31) + (e() != null ? e().hashCode() : 0)) * 31;
        if (c() != null) {
            i2 = c().hashCode();
        }
        return hashCode2 + i2;
    }

    public String i() {
        return this.f43851b;
    }

    public TypeData j() {
        return this.f43853d;
    }

    public String k() {
        return this.f43852c;
    }

    public boolean l() {
        return this.f43858i != null;
    }

    public boolean m() {
        return this.f43851b != null;
    }

    public boolean n() {
        return this.f43852c != null;
    }

    public boolean o(Object obj) {
        return this.f43855f.a(obj);
    }

    public Boolean p() {
        return this.f43856g;
    }

    public String toString() {
        return "PropertyModel{propertyName='" + this.f43850a + "', readName='" + this.f43851b + "', writeName='" + this.f43852c + "', typeData=" + this.f43853d + "}";
    }
}
