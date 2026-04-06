package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

final class AutoValue_BackendResponse extends BackendResponse {

    /* renamed from: a  reason: collision with root package name */
    public final BackendResponse.Status f24083a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24084b;

    public AutoValue_BackendResponse(BackendResponse.Status status, long j2) {
        if (status != null) {
            this.f24083a = status;
            this.f24084b = j2;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f24084b;
    }

    public BackendResponse.Status c() {
        return this.f24083a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f24083a.equals(backendResponse.c()) && this.f24084b == backendResponse.b();
    }

    public int hashCode() {
        long j2 = this.f24084b;
        return ((this.f24083a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f24083a + ", nextRequestWaitMillis=" + this.f24084b + "}";
    }
}
