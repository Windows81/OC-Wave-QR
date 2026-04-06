package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class GapBuffer {

    /* renamed from: a  reason: collision with root package name */
    public int f6186a;

    /* renamed from: b  reason: collision with root package name */
    public char[] f6187b;

    /* renamed from: c  reason: collision with root package name */
    public int f6188c;

    /* renamed from: d  reason: collision with root package name */
    public int f6189d;

    public GapBuffer(char[] cArr, int i2, int i3) {
        this.f6186a = cArr.length;
        this.f6187b = cArr;
        this.f6188c = i2;
        this.f6189d = i3;
    }

    public final void a(StringBuilder sb) {
        sb.append(this.f6187b, 0, this.f6188c);
        Intrinsics.h(sb, "append(...)");
        char[] cArr = this.f6187b;
        int i2 = this.f6189d;
        sb.append(cArr, i2, this.f6186a - i2);
        Intrinsics.h(sb, "append(...)");
    }

    public final void b(int i2, int i3) {
        int i4 = this.f6188c;
        if (i2 < i4 && i3 <= i4) {
            int i5 = i4 - i3;
            char[] cArr = this.f6187b;
            ArraysKt.h(cArr, cArr, this.f6189d - i5, i3, i4);
            this.f6188c = i2;
            this.f6189d -= i5;
        } else if (i2 >= i4 || i3 < i4) {
            int c2 = i2 + c();
            int c3 = i3 + c();
            int i6 = this.f6189d;
            char[] cArr2 = this.f6187b;
            ArraysKt.h(cArr2, cArr2, this.f6188c, i6, c2);
            this.f6188c += c2 - i6;
            this.f6189d = c3;
        } else {
            this.f6189d = i3 + c();
            this.f6188c = i2;
        }
    }

    public final int c() {
        return this.f6189d - this.f6188c;
    }

    public final char d(int i2) {
        int i3 = this.f6188c;
        return i2 < i3 ? this.f6187b[i2] : this.f6187b[(i2 - i3) + this.f6189d];
    }

    public final int e() {
        return this.f6186a - c();
    }

    public final void f(int i2) {
        if (i2 > c()) {
            int c2 = i2 - c();
            int i3 = this.f6186a;
            do {
                i3 *= 2;
            } while (i3 - this.f6186a < c2);
            char[] cArr = new char[i3];
            ArraysKt.h(this.f6187b, cArr, 0, 0, this.f6188c);
            int i4 = this.f6186a;
            int i5 = this.f6189d;
            int i6 = i4 - i5;
            int i7 = i3 - i6;
            ArraysKt.h(this.f6187b, cArr, i7, i5, i6 + i5);
            this.f6187b = cArr;
            this.f6186a = i3;
            this.f6189d = i7;
        }
    }

    public final void g(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        int i6 = i5 - i4;
        f(i6 - (i3 - i2));
        b(i2, i3);
        ToCharArray_androidKt.a(charSequence, this.f6187b, this.f6188c, i4, i5);
        this.f6188c += i6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb);
        return sb.toString();
    }
}
