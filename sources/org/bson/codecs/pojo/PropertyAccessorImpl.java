package org.bson.codecs.pojo;

import org.bson.codecs.configuration.CodecConfigurationException;

final class PropertyAccessorImpl<T> implements PropertyAccessor<T> {

    /* renamed from: a  reason: collision with root package name */
    public final PropertyMetadata f43837a;

    public PropertyAccessorImpl(PropertyMetadata propertyMetadata) {
        this.f43837a = propertyMetadata;
    }

    public void a(Object obj, Object obj2) {
        try {
            if (!this.f43837a.o()) {
                return;
            }
            if (this.f43837a.j() != null) {
                this.f43837a.j().invoke(obj, new Object[]{obj2});
            } else {
                this.f43837a.f().set(obj, obj2);
            }
        } catch (Exception e2) {
            throw d(e2);
        }
    }

    public final CodecConfigurationException b(Exception exc) {
        return new CodecConfigurationException(String.format("Unable to get value for property '%s' in %s", new Object[]{this.f43837a.h(), this.f43837a.d()}), exc);
    }

    public PropertyMetadata c() {
        return this.f43837a;
    }

    public final CodecConfigurationException d(Exception exc) {
        return new CodecConfigurationException(String.format("Unable to set value for property '%s' in %s", new Object[]{this.f43837a.h(), this.f43837a.d()}), exc);
    }

    public Object get(Object obj) {
        try {
            if (this.f43837a.q()) {
                return this.f43837a.g() != null ? this.f43837a.g().invoke(obj, (Object[]) null) : this.f43837a.f().get(obj);
            }
            throw b((Exception) null);
        } catch (Exception e2) {
            throw b(e2);
        }
    }
}
