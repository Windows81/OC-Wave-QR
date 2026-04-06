package com.google.android.datatransport.cct.internal;

import java.util.List;

final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* renamed from: a  reason: collision with root package name */
    public final List f23924a;

    public AutoValue_BatchedLogRequest(List list) {
        if (list != null) {
            this.f23924a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List c() {
        return this.f23924a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f23924a.equals(((BatchedLogRequest) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f23924a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f23924a + "}";
    }
}
