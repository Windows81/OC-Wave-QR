package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

public class WebMessagePayloadAdapter implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    public final int f23166a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23167b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f23168c;

    public WebMessagePayloadAdapter(String str) {
        this.f23166a = 0;
        this.f23167b = str;
        this.f23168c = null;
    }

    public final void a(int i2) {
        if (this.f23166a != i2) {
            throw new IllegalStateException("Expected " + i2 + ", but type is " + this.f23166a);
        }
    }

    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f23168c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    public String getAsString() {
        a(0);
        return this.f23167b;
    }

    public String[] getSupportedFeatures() {
        return new String[0];
    }

    public int getType() {
        return this.f23166a;
    }

    public WebMessagePayloadAdapter(byte[] bArr) {
        this.f23166a = 1;
        this.f23167b = null;
        this.f23168c = bArr;
    }
}
