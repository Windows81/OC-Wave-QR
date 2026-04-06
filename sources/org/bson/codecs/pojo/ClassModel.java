package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ClassModel<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f43758a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f43759b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f43760c;

    /* renamed from: d  reason: collision with root package name */
    public final InstanceCreatorFactory f43761d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f43762e;

    /* renamed from: f  reason: collision with root package name */
    public final String f43763f;

    /* renamed from: g  reason: collision with root package name */
    public final String f43764g;

    /* renamed from: h  reason: collision with root package name */
    public final IdPropertyModelHolder f43765h;

    /* renamed from: i  reason: collision with root package name */
    public final List f43766i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f43767j;

    public ClassModel(Class cls, Map map, InstanceCreatorFactory instanceCreatorFactory, Boolean bool, String str, String str2, IdPropertyModelHolder idPropertyModelHolder, List list) {
        this.f43758a = cls.getSimpleName();
        this.f43759b = cls;
        this.f43760c = cls.getTypeParameters().length > 0;
        this.f43767j = Collections.unmodifiableMap(new HashMap(map));
        this.f43761d = instanceCreatorFactory;
        this.f43762e = bool.booleanValue();
        this.f43763f = str;
        this.f43764g = str2;
        this.f43765h = idPropertyModelHolder;
        this.f43766i = Collections.unmodifiableList(new ArrayList(list));
    }

    public static ClassModelBuilder a(Class cls) {
        return new ClassModelBuilder(cls);
    }

    public String b() {
        return this.f43764g;
    }

    public String c() {
        return this.f43763f;
    }

    public PropertyModel d() {
        IdPropertyModelHolder idPropertyModelHolder = this.f43765h;
        if (idPropertyModelHolder != null) {
            return idPropertyModelHolder.d();
        }
        return null;
    }

    public IdPropertyModelHolder e() {
        return this.f43765h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClassModel.class != obj.getClass()) {
            return false;
        }
        ClassModel classModel = (ClassModel) obj;
        if (this.f43762e != classModel.f43762e || !l().equals(classModel.l()) || !g().equals(classModel.g())) {
            return false;
        }
        if (c() == null ? classModel.c() != null : !c().equals(classModel.c())) {
            return false;
        }
        if (b() == null ? classModel.b() != null : !b().equals(classModel.b())) {
            return false;
        }
        IdPropertyModelHolder idPropertyModelHolder = this.f43765h;
        if (idPropertyModelHolder == null ? classModel.f43765h == null : idPropertyModelHolder.equals(classModel.f43765h)) {
            return j().equals(classModel.j()) && k().equals(classModel.k());
        }
        return false;
    }

    public InstanceCreator f() {
        return this.f43761d.a();
    }

    public InstanceCreatorFactory g() {
        return this.f43761d;
    }

    public String h() {
        return this.f43758a;
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((l().hashCode() * 31) + g().hashCode()) * 31) + (this.f43762e ? 1 : 0)) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (b() != null ? b().hashCode() : 0)) * 31;
        if (e() != null) {
            i2 = e().hashCode();
        }
        return ((((hashCode + i2) * 31) + j().hashCode()) * 31) + k().hashCode();
    }

    public PropertyModel i(String str) {
        for (PropertyModel propertyModel : this.f43766i) {
            if (propertyModel.f().equals(str)) {
                return propertyModel;
            }
        }
        return null;
    }

    public List j() {
        return this.f43766i;
    }

    public Map k() {
        return this.f43767j;
    }

    public Class l() {
        return this.f43759b;
    }

    public boolean m() {
        return this.f43760c;
    }

    public boolean n() {
        return this.f43762e;
    }

    public String toString() {
        return "ClassModel{type=" + this.f43759b + "}";
    }
}
