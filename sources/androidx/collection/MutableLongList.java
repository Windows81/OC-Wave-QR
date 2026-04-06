package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableLongList extends LongList {
    public MutableLongList(int i2) {
        super(i2, (DefaultConstructorMarker) null);
    }

    public final boolean d(long j2) {
        g(this.f1819b + 1);
        long[] jArr = this.f1818a;
        int i2 = this.f1819b;
        jArr[i2] = j2;
        this.f1819b = i2 + 1;
        return true;
    }

    public final boolean e(int i2, long[] jArr) {
        Intrinsics.i(jArr, "elements");
        if (i2 < 0 || i2 > this.f1819b) {
            RuntimeHelpersKt.c("");
        }
        if (jArr.length == 0) {
            return false;
        }
        g(this.f1819b + jArr.length);
        long[] jArr2 = this.f1818a;
        int i3 = this.f1819b;
        if (i2 != i3) {
            ArraysKt.k(jArr2, jArr2, jArr.length + i2, i2, i3);
        }
        ArraysKt.p(jArr, jArr2, i2, 0, 0, 12, (Object) null);
        this.f1819b += jArr.length;
        return true;
    }

    public final void f() {
        this.f1819b = 0;
    }

    public final void g(int i2) {
        long[] jArr = this.f1818a;
        if (jArr.length < i2) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i2, (jArr.length * 3) / 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f1818a = copyOf;
        }
    }

    public final long h(int i2) {
        if (i2 < 0 || i2 >= this.f1819b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        long[] jArr = this.f1818a;
        long j2 = jArr[i2];
        int i3 = this.f1819b;
        if (i2 != i3 - 1) {
            ArraysKt.k(jArr, jArr, i2, i2 + 1, i3);
        }
        this.f1819b--;
        return j2;
    }

    public final void i(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > (i4 = this.f1819b) || i3 < 0 || i3 > i4) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
        }
        if (i3 < i2) {
            RuntimeHelpersKt.a("The end index must be < start index");
        }
        if (i3 != i2) {
            int i5 = this.f1819b;
            if (i3 < i5) {
                long[] jArr = this.f1818a;
                ArraysKt.k(jArr, jArr, i2, i3, i5);
            }
            this.f1819b -= i3 - i2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableLongList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }
}
