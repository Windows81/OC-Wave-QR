package androidx.core.util;

import kotlin.Metadata;

@Metadata
public interface Consumer<T> {
    void accept(Object obj);
}
