package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PointerIdArray {

    /* renamed from: a  reason: collision with root package name */
    public int f16959a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f16960b = new long[2];

    public final boolean a(long j2) {
        if (c(j2)) {
            return false;
        }
        j(this.f16959a, j2);
        return true;
    }

    public final void b() {
        this.f16959a = 0;
    }

    public final boolean c(long j2) {
        int i2 = this.f16959a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f16960b[i3] == j2) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i2) {
        return PointerId.a(this.f16960b[i2]);
    }

    public final int e() {
        return this.f16959a;
    }

    public final boolean f() {
        return this.f16959a == 0;
    }

    public final boolean g(long j2) {
        int i2 = this.f16959a;
        int i3 = 0;
        while (i3 < i2) {
            if (j2 == this.f16960b[i3]) {
                int i4 = this.f16959a - 1;
                while (i3 < i4) {
                    long[] jArr = this.f16960b;
                    int i5 = i3 + 1;
                    jArr[i3] = jArr[i5];
                    i3 = i5;
                }
                this.f16959a--;
                return true;
            }
            i3++;
        }
        return false;
    }

    public final boolean h(int i2) {
        int i3 = this.f16959a;
        if (i2 >= i3) {
            return false;
        }
        int i4 = i3 - 1;
        while (i2 < i4) {
            long[] jArr = this.f16960b;
            int i5 = i2 + 1;
            jArr[i2] = jArr[i5];
            i2 = i5;
        }
        this.f16959a--;
        return true;
    }

    public final long[] i(int i2) {
        long[] jArr = this.f16960b;
        long[] copyOf = Arrays.copyOf(jArr, Math.max(i2, jArr.length * 2));
        Intrinsics.h(copyOf, "copyOf(...)");
        this.f16960b = copyOf;
        return copyOf;
    }

    public final void j(int i2, long j2) {
        long[] jArr = this.f16960b;
        if (i2 >= jArr.length) {
            jArr = i(i2 + 1);
        }
        jArr[i2] = j2;
        if (i2 >= this.f16959a) {
            this.f16959a = i2 + 1;
        }
    }
}
