package org.bson.util;

interface Function<A, B> {
    Object apply(Object obj);
}
