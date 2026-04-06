package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata
public final class ArrayAsSequence implements CharSequence {

    /* renamed from: A  reason: collision with root package name */
    public int f42353A;

    /* renamed from: z  reason: collision with root package name */
    public final char[] f42354z;

    public char a(int i2) {
        return this.f42354z[i2];
    }

    public final char[] b() {
        return this.f42354z;
    }

    public int c() {
        return this.f42353A;
    }

    public final /* bridge */ char charAt(int i2) {
        return a(i2);
    }

    public void d(int i2) {
        this.f42353A = i2;
    }

    public final String e(int i2, int i3) {
        return StringsKt.v(this.f42354z, i2, Math.min(i3, length()));
    }

    public final void f(int i2) {
        d(Math.min(this.f42354z.length, i2));
    }

    public final /* bridge */ int length() {
        return c();
    }

    public CharSequence subSequence(int i2, int i3) {
        return StringsKt.v(this.f42354z, i2, Math.min(i3, length()));
    }

    public String toString() {
        return e(0, length());
    }
}
