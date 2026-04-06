package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

final class AutoValue_BackendRequest extends BackendRequest {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable f24079a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f24080b;

    public static final class Builder extends BackendRequest.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Iterable f24081a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f24082b;

        public BackendRequest a() {
            String str = "";
            if (this.f24081a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f24081a, this.f24082b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public BackendRequest.Builder b(Iterable iterable) {
            if (iterable != null) {
                this.f24081a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public BackendRequest.Builder c(byte[] bArr) {
            this.f24082b = bArr;
            return this;
        }
    }

    public Iterable b() {
        return this.f24079a;
    }

    public byte[] c() {
        return this.f24080b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f24079a.equals(backendRequest.b())) {
            if (Arrays.equals(this.f24080b, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).f24080b : backendRequest.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24079a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24080b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f24079a + ", extras=" + Arrays.toString(this.f24080b) + "}";
    }

    public AutoValue_BackendRequest(Iterable iterable, byte[] bArr) {
        this.f24079a = iterable;
        this.f24080b = bArr;
    }
}
