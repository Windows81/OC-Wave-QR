package com.google.common.collect;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingObject {
    public abstract Object M();

    public String toString() {
        return M().toString();
    }
}
