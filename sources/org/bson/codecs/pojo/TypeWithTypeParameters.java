package org.bson.codecs.pojo;

import java.util.List;

public interface TypeWithTypeParameters<T> {
    List a();

    Class getType();
}
