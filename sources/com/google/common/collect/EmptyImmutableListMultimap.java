package com.google.common.collect;

@ElementTypesAreNonnullByDefault
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    public static final EmptyImmutableListMultimap F = new EmptyImmutableListMultimap();

    public EmptyImmutableListMultimap() {
        super(ImmutableMap.o(), 0);
    }
}
