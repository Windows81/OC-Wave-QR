package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

final class AutoValue_TransportContext extends TransportContext {

    /* renamed from: a  reason: collision with root package name */
    public final String f24045a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f24046b;

    /* renamed from: c  reason: collision with root package name */
    public final Priority f24047c;

    public static final class Builder extends TransportContext.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f24048a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f24049b;

        /* renamed from: c  reason: collision with root package name */
        public Priority f24050c;

        public TransportContext a() {
            String str = "";
            if (this.f24048a == null) {
                str = str + " backendName";
            }
            if (this.f24050c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new AutoValue_TransportContext(this.f24048a, this.f24049b, this.f24050c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public TransportContext.Builder b(String str) {
            if (str != null) {
                this.f24048a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public TransportContext.Builder c(byte[] bArr) {
            this.f24049b = bArr;
            return this;
        }

        public TransportContext.Builder d(Priority priority) {
            if (priority != null) {
                this.f24050c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public String b() {
        return this.f24045a;
    }

    public byte[] c() {
        return this.f24046b;
    }

    public Priority d() {
        return this.f24047c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f24045a.equals(transportContext.b())) {
            if (Arrays.equals(this.f24046b, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).f24046b : transportContext.c()) && this.f24047c.equals(transportContext.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f24045a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24046b)) * 1000003) ^ this.f24047c.hashCode();
    }

    public AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.f24045a = str;
        this.f24046b = bArr;
        this.f24047c = priority;
    }
}
