package com.google.android.gms.common.api;

public class BooleanResult implements Result {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f24424A;

    /* renamed from: z  reason: collision with root package name */
    public final Status f24425z;

    public Status A() {
        return this.f24425z;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f24425z.equals(booleanResult.f24425z) && this.f24424A == booleanResult.f24424A;
    }

    public final int hashCode() {
        return ((this.f24425z.hashCode() + 527) * 31) + (this.f24424A ? 1 : 0);
    }
}
