package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;

@ElementTypesAreNonnullByDefault
@Immutable
abstract class AbstractHashFunction implements HashFunction {
    public HashCode b(Object obj, Funnel funnel) {
        return a().h(obj, funnel).i();
    }
}
