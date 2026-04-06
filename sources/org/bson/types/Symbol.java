package org.bson.types;

import java.io.Serializable;

public class Symbol implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final String f44047z;

    public Symbol(String str) {
        this.f44047z = str;
    }

    public String a() {
        return this.f44047z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f44047z.equals(((Symbol) obj).f44047z);
    }

    public int hashCode() {
        return this.f44047z.hashCode();
    }

    public String toString() {
        return this.f44047z;
    }
}
