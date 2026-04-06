package com.google.android.datatransport;

public interface Transformer<T, U> {
    Object apply(Object obj);
}
