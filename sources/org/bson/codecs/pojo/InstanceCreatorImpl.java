package org.bson.codecs.pojo;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.annotations.BsonProperty;

final class InstanceCreatorImpl<T> implements InstanceCreator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CreatorExecutable f43808a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f43809b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f43810c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f43811d;

    /* renamed from: e  reason: collision with root package name */
    public Object f43812e;

    public InstanceCreatorImpl(CreatorExecutable creatorExecutable) {
        this.f43808a = creatorExecutable;
        if (creatorExecutable.i().isEmpty()) {
            this.f43809b = null;
            this.f43810c = null;
            this.f43811d = null;
            this.f43812e = creatorExecutable.e();
            return;
        }
        this.f43809b = new HashMap();
        this.f43810c = new HashMap();
        for (int i2 = 0; i2 < creatorExecutable.i().size(); i2++) {
            if (creatorExecutable.d() == null || creatorExecutable.d().intValue() != i2) {
                this.f43810c.put(((BsonProperty) creatorExecutable.i().get(i2)).value(), Integer.valueOf(i2));
            } else {
                this.f43810c.put("_id", creatorExecutable.d());
            }
        }
        this.f43811d = new Object[this.f43810c.size()];
    }

    public Object a() {
        if (this.f43812e == null) {
            try {
                for (Map.Entry value : this.f43810c.entrySet()) {
                    this.f43811d[((Integer) value.getValue()).intValue()] = null;
                }
                c();
            } catch (CodecConfigurationException e2) {
                throw new CodecConfigurationException(String.format("Could not construct new instance of: %s. Missing the following properties: %s", new Object[]{this.f43808a.j().getSimpleName(), this.f43810c.keySet()}), e2);
            }
        }
        return this.f43812e;
    }

    public void b(Object obj, PropertyModel propertyModel) {
        if (this.f43812e != null) {
            propertyModel.g().a(this.f43812e, obj);
            return;
        }
        if (!this.f43810c.isEmpty()) {
            String k2 = propertyModel.k();
            if (!this.f43810c.containsKey(k2)) {
                k2 = propertyModel.f();
            }
            Integer num = (Integer) this.f43810c.get(k2);
            if (num != null) {
                this.f43811d[num.intValue()] = obj;
            }
            this.f43810c.remove(k2);
        }
        if (this.f43810c.isEmpty()) {
            c();
        } else {
            this.f43809b.put(propertyModel, obj);
        }
    }

    public final void c() {
        try {
            this.f43812e = this.f43808a.f(this.f43811d);
            for (Map.Entry entry : this.f43809b.entrySet()) {
                d((PropertyModel) entry.getKey(), entry.getValue());
            }
        } catch (Exception e2) {
            throw new CodecConfigurationException(e2.getMessage(), e2);
        }
    }

    public final void d(PropertyModel propertyModel, Object obj) {
        b(obj, propertyModel);
    }
}
