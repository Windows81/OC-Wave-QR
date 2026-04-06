package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public class WebMessageCompat {

    /* renamed from: a  reason: collision with root package name */
    public final WebMessagePortCompat[] f23118a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23119b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f23120c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23121d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.f23119b = str;
        this.f23120c = null;
        this.f23118a = webMessagePortCompatArr;
        this.f23121d = 0;
    }

    public final void a(int i2) {
        if (i2 != this.f23121d) {
            throw new IllegalStateException("Wrong data accessor type detected. " + f(this.f23121d) + " expected, but got " + f(i2));
        }
    }

    public byte[] b() {
        a(1);
        Objects.requireNonNull(this.f23120c);
        return this.f23120c;
    }

    public String c() {
        a(0);
        return this.f23119b;
    }

    public WebMessagePortCompat[] d() {
        return this.f23118a;
    }

    public int e() {
        return this.f23121d;
    }

    public final String f(int i2) {
        return i2 != 0 ? i2 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.f23120c = bArr;
        this.f23119b = null;
        this.f23118a = webMessagePortCompatArr;
        this.f23121d = 1;
    }
}
