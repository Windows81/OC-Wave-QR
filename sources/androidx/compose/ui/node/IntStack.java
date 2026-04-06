package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class IntStack {

    /* renamed from: a  reason: collision with root package name */
    public int[] f17263a;

    /* renamed from: b  reason: collision with root package name */
    public int f17264b;

    public IntStack(int i2) {
        this.f17263a = new int[i2];
    }

    public final boolean a(int i2, int i3) {
        int[] iArr = this.f17263a;
        int i4 = iArr[i2];
        int i5 = iArr[i3];
        if (i4 >= i5) {
            return i4 == i5 && iArr[i2 + 1] <= iArr[i3 + 1];
        }
        return true;
    }

    public final int b(int i2) {
        return this.f17263a[i2];
    }

    public final int c() {
        return this.f17264b;
    }

    public final boolean d() {
        return this.f17264b != 0;
    }

    public final int e(int i2, int i3, int i4) {
        int i5 = i2 - i4;
        while (i2 < i3) {
            if (a(i2, i3)) {
                i5 += i4;
                l(i5, i2);
            }
            i2 += i4;
        }
        int i6 = i5 + i4;
        l(i6, i3);
        return i6;
    }

    public final int f() {
        int[] iArr = this.f17263a;
        int i2 = this.f17264b - 1;
        this.f17264b = i2;
        return iArr[i2];
    }

    public final void g(int i2, int i3, int i4) {
        int i5 = this.f17264b;
        int[] iArr = this.f17263a;
        int i6 = i5 + 3;
        if (i6 >= iArr.length) {
            iArr = j(iArr);
        }
        iArr[i5] = i2 + i4;
        iArr[i5 + 1] = i3 + i4;
        iArr[i5 + 2] = i4;
        this.f17264b = i6;
    }

    public final void h(int i2, int i3, int i4, int i5) {
        int i6 = this.f17264b;
        int[] iArr = this.f17263a;
        int i7 = i6 + 4;
        if (i7 >= iArr.length) {
            iArr = j(iArr);
        }
        iArr[i6] = i2;
        iArr[i6 + 1] = i3;
        iArr[i6 + 2] = i4;
        iArr[i6 + 3] = i5;
        this.f17264b = i7;
    }

    public final void i(int i2, int i3, int i4) {
        if (i2 < i3) {
            int e2 = e(i2, i3, i4);
            i(i2, e2 - i4, i4);
            i(e2 + i4, i3, i4);
        }
    }

    public final int[] j(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.h(copyOf, "copyOf(...)");
        this.f17263a = copyOf;
        return copyOf;
    }

    public final void k() {
        int i2 = this.f17264b;
        if (!(i2 % 3 == 0)) {
            InlineClassHelperKt.c("Array size not a multiple of 3");
        }
        if (i2 > 3) {
            i(0, i2 - 3, 3);
        }
    }

    public final void l(int i2, int i3) {
        int[] iArr = this.f17263a;
        MyersDiffKt.i(iArr, i2, i3);
        MyersDiffKt.i(iArr, i2 + 1, i3 + 1);
        MyersDiffKt.i(iArr, i2 + 2, i3 + 2);
    }
}
