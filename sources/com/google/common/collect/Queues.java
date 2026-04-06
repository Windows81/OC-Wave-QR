package com.google.common.collect;

import java.util.ArrayDeque;

@ElementTypesAreNonnullByDefault
public final class Queues {
    public static ArrayDeque a() {
        return new ArrayDeque();
    }
}
