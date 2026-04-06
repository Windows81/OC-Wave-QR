package org.bson.types;

import java.io.Serializable;

public final class MaxKey implements Serializable {
    public boolean equals(Object obj) {
        return obj instanceof MaxKey;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "MaxKey";
    }
}
