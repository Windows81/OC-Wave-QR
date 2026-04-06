package org.bson.codecs.pojo;

public interface InstanceCreator<T> {
    Object a();

    void b(Object obj, PropertyModel propertyModel);
}
