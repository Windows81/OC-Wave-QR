package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;

@ElementTypesAreNonnullByDefault
@Immutable
public interface HashFunction {
    Hasher a();

    HashCode b(Object obj, Funnel funnel);

    int c();
}
