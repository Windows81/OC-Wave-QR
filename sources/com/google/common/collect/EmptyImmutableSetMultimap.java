package com.google.common.collect;

import java.util.Comparator;

@ElementTypesAreNonnullByDefault
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    public static final EmptyImmutableSetMultimap H = new EmptyImmutableSetMultimap();

    public EmptyImmutableSetMultimap() {
        super(ImmutableMap.o(), 0, (Comparator) null);
    }
}
