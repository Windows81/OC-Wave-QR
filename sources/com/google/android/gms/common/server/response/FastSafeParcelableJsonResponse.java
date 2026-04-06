package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    public Object c(String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean e(String str) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field field : a().values()) {
            if (d(field)) {
                if (!fastJsonResponse.d(field) || !Objects.a(b(field), fastJsonResponse.b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.d(field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        for (FastJsonResponse.Field field : a().values()) {
            if (d(field)) {
                i2 = (i2 * 31) + Preconditions.m(b(field)).hashCode();
            }
        }
        return i2;
    }
}
