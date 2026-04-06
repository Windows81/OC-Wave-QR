package androidx.compose.foundation.layout;

import kotlin.Metadata;

@Metadata
public final class InsetsValues {

    /* renamed from: a  reason: collision with root package name */
    public final int f4055a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4056b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4057c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4058d;

    public InsetsValues(int i2, int i3, int i4, int i5) {
        this.f4055a = i2;
        this.f4056b = i3;
        this.f4057c = i4;
        this.f4058d = i5;
    }

    public final int a() {
        return this.f4058d;
    }

    public final int b() {
        return this.f4055a;
    }

    public final int c() {
        return this.f4057c;
    }

    public final int d() {
        return this.f4056b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        return this.f4055a == insetsValues.f4055a && this.f4056b == insetsValues.f4056b && this.f4057c == insetsValues.f4057c && this.f4058d == insetsValues.f4058d;
    }

    public int hashCode() {
        return (((((this.f4055a * 31) + this.f4056b) * 31) + this.f4057c) * 31) + this.f4058d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f4055a + ", top=" + this.f4056b + ", right=" + this.f4057c + ", bottom=" + this.f4058d + ')';
    }
}
