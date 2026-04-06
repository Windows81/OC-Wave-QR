package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;

public final class EncodedPayload {

    /* renamed from: a  reason: collision with root package name */
    public final Encoding f24055a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f24056b;

    public EncodedPayload(Encoding encoding, byte[] bArr) {
        if (encoding == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f24055a = encoding;
            this.f24056b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.f24056b;
    }

    public Encoding b() {
        return this.f24055a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (!this.f24055a.equals(encodedPayload.f24055a)) {
            return false;
        }
        return Arrays.equals(this.f24056b, encodedPayload.f24056b);
    }

    public int hashCode() {
        return ((this.f24055a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24056b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f24055a + ", bytes=[...]}";
    }
}
