package org.bson.codecs.pojo;

import org.bson.codecs.configuration.CodecConfigurationException;

final class IdPropertyModelHolder<I> {

    /* renamed from: a  reason: collision with root package name */
    public final PropertyModel f43805a;

    /* renamed from: b  reason: collision with root package name */
    public final IdGenerator f43806b;

    public IdPropertyModelHolder(PropertyModel propertyModel, IdGenerator idGenerator) {
        this.f43805a = propertyModel;
        this.f43806b = idGenerator;
    }

    public static IdPropertyModelHolder a(Class cls, PropertyModel propertyModel, IdGenerator idGenerator) {
        if (propertyModel == null && idGenerator != null) {
            throw new CodecConfigurationException(String.format("Invalid IdGenerator. There is no IdProperty set for: %s", new Object[]{cls}));
        } else if (idGenerator == null || propertyModel.j().getType().isAssignableFrom(idGenerator.getType())) {
            return new IdPropertyModelHolder(propertyModel, idGenerator);
        } else {
            throw new CodecConfigurationException(String.format("Invalid IdGenerator. Mismatching types, the IdProperty type is: %s but the IdGenerator type is: %s", new Object[]{propertyModel.j().getType(), idGenerator.getType()}));
        }
    }

    public static IdPropertyModelHolder b(ClassModel classModel, PropertyModel propertyModel) {
        return a(classModel.l(), propertyModel, classModel.e().c());
    }

    public IdGenerator c() {
        return this.f43806b;
    }

    public PropertyModel d() {
        return this.f43805a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IdPropertyModelHolder.class != obj.getClass()) {
            return false;
        }
        IdPropertyModelHolder idPropertyModelHolder = (IdPropertyModelHolder) obj;
        PropertyModel propertyModel = this.f43805a;
        if (propertyModel == null ? idPropertyModelHolder.f43805a != null : !propertyModel.equals(idPropertyModelHolder.f43805a)) {
            return false;
        }
        IdGenerator idGenerator = this.f43806b;
        IdGenerator idGenerator2 = idPropertyModelHolder.f43806b;
        return idGenerator != null ? idGenerator.equals(idGenerator2) : idGenerator2 == null;
    }

    public int hashCode() {
        PropertyModel propertyModel = this.f43805a;
        int i2 = 0;
        int hashCode = (propertyModel != null ? propertyModel.hashCode() : 0) * 31;
        IdGenerator idGenerator = this.f43806b;
        if (idGenerator != null) {
            i2 = idGenerator.hashCode();
        }
        return hashCode + i2;
    }
}
