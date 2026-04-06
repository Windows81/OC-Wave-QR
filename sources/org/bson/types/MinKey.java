package org.bson.types;

import java.io.Serializable;

public final class MinKey implements Serializable {
    public boolean equals(Object obj) {
        return obj instanceof MinKey;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "MinKey";
    }
}
