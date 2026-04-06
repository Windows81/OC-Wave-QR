package org.bson.types;

import java.io.Serializable;
import java.util.Date;

public final class BSONTimestamp implements Comparable<BSONTimestamp>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Date f44030A;

    /* renamed from: z  reason: collision with root package name */
    public final int f44031z;

    public BSONTimestamp(int i2, int i3) {
        this.f44030A = new Date(((long) i2) * 1000);
        this.f44031z = i3;
    }

    /* renamed from: d */
    public int compareTo(BSONTimestamp bSONTimestamp) {
        int f2;
        int f3;
        if (h() != bSONTimestamp.h()) {
            f2 = h();
            f3 = bSONTimestamp.h();
        } else {
            f2 = f();
            f3 = bSONTimestamp.f();
        }
        return f2 - f3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BSONTimestamp)) {
            return false;
        }
        BSONTimestamp bSONTimestamp = (BSONTimestamp) obj;
        return h() == bSONTimestamp.h() && f() == bSONTimestamp.f();
    }

    public int f() {
        return this.f44031z;
    }

    public int h() {
        Date date = this.f44030A;
        if (date == null) {
            return 0;
        }
        return (int) (date.getTime() / 1000);
    }

    public int hashCode() {
        return ((this.f44031z + 31) * 31) + h();
    }

    public String toString() {
        return "TS time:" + this.f44030A + " inc:" + this.f44031z;
    }
}
