package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class GapBuffer {

    /* renamed from: a  reason: collision with root package name */
    public int f18817a;

    /* renamed from: b  reason: collision with root package name */
    public char[] f18818b;

    /* renamed from: c  reason: collision with root package name */
    public int f18819c;

    /* renamed from: d  reason: collision with root package name */
    public int f18820d;

    public GapBuffer(char[] cArr, int i2, int i3) {
        this.f18817a = cArr.length;
        this.f18818b = cArr;
        this.f18819c = i2;
        this.f18820d = i3;
    }

    public final void a(StringBuilder sb) {
        sb.append(this.f18818b, 0, this.f18819c);
        Intrinsics.h(sb, "append(...)");
        char[] cArr = this.f18818b;
        int i2 = this.f18820d;
        sb.append(cArr, i2, this.f18817a - i2);
        Intrinsics.h(sb, "append(...)");
    }

    public final void b(int i2, int i3) {
        int i4 = this.f18819c;
        if (i2 < i4 && i3 <= i4) {
            int i5 = i4 - i3;
            char[] cArr = this.f18818b;
            ArraysKt.h(cArr, cArr, this.f18820d - i5, i3, i4);
            this.f18819c = i2;
            this.f18820d -= i5;
        } else if (i2 >= i4 || i3 < i4) {
            int c2 = i2 + c();
            int c3 = i3 + c();
            int i6 = this.f18820d;
            char[] cArr2 = this.f18818b;
            ArraysKt.h(cArr2, cArr2, this.f18819c, i6, c2);
            this.f18819c += c2 - i6;
            this.f18820d = c3;
        } else {
            this.f18820d = i3 + c();
            this.f18819c = i2;
        }
    }

    public final int c() {
        return this.f18820d - this.f18819c;
    }

    public final char d(int i2) {
        int i3 = this.f18819c;
        return i2 < i3 ? this.f18818b[i2] : this.f18818b[(i2 - i3) + this.f18820d];
    }

    public final int e() {
        return this.f18817a - c();
    }

    public final void f(int i2) {
        if (i2 > c()) {
            int c2 = i2 - c();
            int i3 = this.f18817a;
            do {
                i3 *= 2;
            } while (i3 - this.f18817a < c2);
            char[] cArr = new char[i3];
            ArraysKt.h(this.f18818b, cArr, 0, 0, this.f18819c);
            int i4 = this.f18817a;
            int i5 = this.f18820d;
            int i6 = i4 - i5;
            int i7 = i3 - i6;
            ArraysKt.h(this.f18818b, cArr, i7, i5, i6 + i5);
            this.f18818b = cArr;
            this.f18817a = i3;
            this.f18820d = i7;
        }
    }

    public final void g(int i2, int i3, String str) {
        f(str.length() - (i3 - i2));
        b(i2, i3);
        GapBufferKt.b(str, this.f18818b, this.f18819c);
        this.f18819c += str.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb);
        return sb.toString();
    }
}
