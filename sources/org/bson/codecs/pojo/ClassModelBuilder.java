package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecConfigurationException;

public class ClassModelBuilder<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List f43768a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public IdGenerator f43769b;

    /* renamed from: c  reason: collision with root package name */
    public InstanceCreatorFactory f43770c;

    /* renamed from: d  reason: collision with root package name */
    public Class f43771d;

    /* renamed from: e  reason: collision with root package name */
    public Map f43772e = Collections.emptyMap();

    /* renamed from: f  reason: collision with root package name */
    public List f43773f = Conventions.f43788f;

    /* renamed from: g  reason: collision with root package name */
    public List f43774g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f43775h;

    /* renamed from: i  reason: collision with root package name */
    public String f43776i;

    /* renamed from: j  reason: collision with root package name */
    public String f43777j;

    /* renamed from: k  reason: collision with root package name */
    public String f43778k;

    public ClassModelBuilder(Class cls) {
        PojoBuilderHelper.b(this, (Class) Assertions.d("type", cls));
    }

    public ClassModelBuilder a(PropertyModelBuilder propertyModelBuilder) {
        this.f43768a.add(Assertions.d("propertyModelBuilder", propertyModelBuilder));
        return this;
    }

    public ClassModelBuilder b(List list) {
        this.f43774g = (List) Assertions.d("annotations", list);
        return this;
    }

    public ClassModel c() {
        ArrayList arrayList = new ArrayList();
        PojoBuilderHelper.k("type", this.f43771d);
        for (Convention a2 : this.f43773f) {
            a2.a(this);
        }
        PojoBuilderHelper.k("instanceCreatorFactory", this.f43770c);
        if (this.f43775h) {
            PojoBuilderHelper.k("discriminatorKey", this.f43777j);
            PojoBuilderHelper.k("discriminator", this.f43776i);
        }
        PropertyModel propertyModel = null;
        for (PropertyModelBuilder propertyModelBuilder : this.f43768a) {
            boolean equals = propertyModelBuilder.c().equals(this.f43778k);
            if (equals) {
                propertyModelBuilder.p("_id").t("_id");
            }
            PropertyModel a3 = propertyModelBuilder.a();
            arrayList.add(a3);
            if (equals) {
                propertyModel = a3;
            }
        }
        w(this.f43771d.getSimpleName(), arrayList);
        return new ClassModel(this.f43771d, this.f43772e, this.f43770c, Boolean.valueOf(this.f43775h), this.f43777j, this.f43776i, IdPropertyModelHolder.a(this.f43771d, propertyModel, this.f43769b), Collections.unmodifiableList(arrayList));
    }

    public final void d(String str, String str2, Map map, String str3) {
        if (!map.containsKey(str2)) {
            map.put(str2, 1);
            return;
        }
        throw new CodecConfigurationException(String.format("Duplicate %s named '%s' found in %s.", new Object[]{str, str2, str3}));
    }

    public ClassModelBuilder e(List list) {
        this.f43773f = (List) Assertions.d("conventions", list);
        return this;
    }

    public ClassModelBuilder f(String str) {
        this.f43776i = str;
        return this;
    }

    public ClassModelBuilder g(String str) {
        this.f43777j = str;
        return this;
    }

    public ClassModelBuilder h(boolean z2) {
        this.f43775h = z2;
        return this;
    }

    public List i() {
        return this.f43774g;
    }

    public String j() {
        return this.f43776i;
    }

    public String k() {
        return this.f43777j;
    }

    public IdGenerator l() {
        return this.f43769b;
    }

    public String m() {
        return this.f43778k;
    }

    public PropertyModelBuilder n(String str) {
        Assertions.d("propertyName", str);
        for (PropertyModelBuilder propertyModelBuilder : this.f43768a) {
            if (propertyModelBuilder.c().equals(str)) {
                return propertyModelBuilder;
            }
        }
        return null;
    }

    public List o() {
        return Collections.unmodifiableList(this.f43768a);
    }

    public Class p() {
        return this.f43771d;
    }

    public ClassModelBuilder q(IdGenerator idGenerator) {
        this.f43769b = idGenerator;
        return this;
    }

    public ClassModelBuilder r(String str) {
        this.f43778k = str;
        return this;
    }

    public ClassModelBuilder s(InstanceCreatorFactory instanceCreatorFactory) {
        this.f43770c = (InstanceCreatorFactory) Assertions.d("instanceCreatorFactory", instanceCreatorFactory);
        return this;
    }

    public ClassModelBuilder t(Map map) {
        this.f43772e = Collections.unmodifiableMap(new HashMap(map));
        return this;
    }

    public String toString() {
        return String.format("ClassModelBuilder{type=%s}", new Object[]{this.f43771d});
    }

    public boolean u(String str) {
        return this.f43768a.remove(n((String) Assertions.d("propertyName", str)));
    }

    public ClassModelBuilder v(Class cls) {
        this.f43771d = (Class) Assertions.d("type", cls);
        return this;
    }

    public final void w(String str, List list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PropertyModel propertyModel = (PropertyModel) it.next();
            if (!propertyModel.l()) {
                d("property", propertyModel.f(), hashMap, str);
                if (propertyModel.m()) {
                    d("read property", propertyModel.i(), hashMap2, str);
                }
                if (propertyModel.n()) {
                    d("write property", propertyModel.k(), hashMap3, str);
                }
            } else {
                throw new CodecConfigurationException(propertyModel.e());
            }
        }
        String str2 = this.f43778k;
        if (str2 != null && !hashMap.containsKey(str2)) {
            throw new CodecConfigurationException(String.format("Invalid id property, property named '%s' can not be found.", new Object[]{this.f43778k}));
        }
    }
}
