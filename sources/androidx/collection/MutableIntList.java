package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableIntList extends IntList {
    public MutableIntList(int i2) {
        super(i2, (DefaultConstructorMarker) null);
    }

    public final void j(int i2, int i3) {
        if (i2 < 0 || i2 > this.f1784b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        m(this.f1784b + 1);
        int[] iArr = this.f1783a;
        int i4 = this.f1784b;
        if (i2 != i4) {
            ArraysKt.j(iArr, iArr, i2 + 1, i2, i4);
        }
        iArr[i2] = i3;
        this.f1784b++;
    }

    public final boolean k(int i2) {
        m(this.f1784b + 1);
        int[] iArr = this.f1783a;
        int i3 = this.f1784b;
        iArr[i3] = i2;
        this.f1784b = i3 + 1;
        return true;
    }

    public final boolean l(int i2, int[] iArr) {
        Intrinsics.i(iArr, "elements");
        if (i2 < 0 || i2 > this.f1784b) {
            RuntimeHelpersKt.c("");
        }
        if (iArr.length == 0) {
            return false;
        }
        m(this.f1784b + iArr.length);
        int[] iArr2 = this.f1783a;
        int i3 = this.f1784b;
        if (i2 != i3) {
            ArraysKt.j(iArr2, iArr2, iArr.length + i2, i2, i3);
        }
        ArraysKt.o(iArr, iArr2, i2, 0, 0, 12, (Object) null);
        this.f1784b += iArr.length;
        return true;
    }

    public final void m(int i2) {
        int[] iArr = this.f1783a;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f1783a = copyOf;
        }
    }

    public final boolean n(int i2) {
        int f2 = f(i2);
        if (f2 < 0) {
            return false;
        }
        o(f2);
        return true;
    }

    public final int o(int i2) {
        if (i2 < 0 || i2 >= this.f1784b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        int[] iArr = this.f1783a;
        int i3 = iArr[i2];
        int i4 = this.f1784b;
        if (i2 != i4 - 1) {
            ArraysKt.j(iArr, iArr, i2, i2 + 1, i4);
        }
        this.f1784b--;
        return i3;
    }

    public final void p(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > (i4 = this.f1784b) || i3 < 0 || i3 > i4) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        if (i3 < i2) {
            RuntimeHelpersKt.a("The end index must be < start index");
        }
        if (i3 != i2) {
            int i5 = this.f1784b;
            if (i3 < i5) {
                int[] iArr = this.f1783a;
                ArraysKt.j(iArr, iArr, i2, i3, i5);
            }
            this.f1784b -= i3 - i2;
        }
    }

    public final int q(int i2, int i3) {
        if (i2 < 0 || i2 >= this.f1784b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        int[] iArr = this.f1783a;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    public final void r() {
        int i2 = this.f1784b;
        if (i2 != 0) {
            ArraysKt.J(this.f1783a, 0, i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableIntList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }
}
