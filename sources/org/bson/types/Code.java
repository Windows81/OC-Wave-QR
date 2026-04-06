package org.bson.types;

import java.io.Serializable;

public class Code implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final String f44034z;

    public Code(String str) {
        this.f44034z = str;
    }

    public String a() {
        return this.f44034z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f44034z.equals(((Code) obj).f44034z);
    }

    public int hashCode() {
        return this.f44034z.hashCode();
    }

    public String toString() {
        return "Code{code='" + this.f44034z + '\'' + '}';
    }
}
