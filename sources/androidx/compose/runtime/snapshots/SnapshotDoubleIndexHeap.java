package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnapshotDoubleIndexHeap {

    /* renamed from: a  reason: collision with root package name */
    public int f15266a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f15267b = SnapshotId_jvmKt.b(16);

    /* renamed from: c  reason: collision with root package name */
    public int[] f15268c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f15269d;

    /* renamed from: e  reason: collision with root package name */
    public int f15270e;

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        this.f15269d = iArr;
    }

    public final int a(long j2) {
        c(this.f15266a + 1);
        int i2 = this.f15266a;
        this.f15266a = i2 + 1;
        int b2 = b();
        this.f15267b[i2] = j2;
        this.f15268c[i2] = b2;
        this.f15269d[b2] = i2;
        h(i2);
        return b2;
    }

    public final int b() {
        int length = this.f15269d.length;
        if (this.f15270e >= length) {
            int i2 = length * 2;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                iArr[i3] = i4;
                i3 = i4;
            }
            ArraysKt.o(this.f15269d, iArr, 0, 0, 0, 14, (Object) null);
            this.f15269d = iArr;
        }
        int i5 = this.f15270e;
        this.f15270e = this.f15269d[i5];
        return i5;
    }

    public final void c(int i2) {
        int length = this.f15267b.length;
        if (i2 > length) {
            int i3 = length * 2;
            long[] b2 = SnapshotId_jvmKt.b(i3);
            int[] iArr = new int[i3];
            ArraysKt.p(this.f15267b, b2, 0, 0, 0, 12, (Object) null);
            ArraysKt.o(this.f15268c, iArr, 0, 0, 0, 14, (Object) null);
            this.f15267b = b2;
            this.f15268c = iArr;
        }
    }

    public final void d(int i2) {
        this.f15269d[i2] = this.f15270e;
        this.f15270e = i2;
    }

    public final long e(long j2) {
        return this.f15266a > 0 ? this.f15267b[0] : j2;
    }

    public final void f(int i2) {
        int i3 = this.f15269d[i2];
        i(i3, this.f15266a - 1);
        this.f15266a--;
        h(i3);
        g(i3);
        d(i2);
    }

    public final void g(int i2) {
        long[] jArr = this.f15267b;
        int i3 = this.f15266a >> 1;
        while (i2 < i3) {
            int i4 = (i2 + 1) << 1;
            int i5 = i4 - 1;
            if (i4 >= this.f15266a || Intrinsics.l(jArr[i4], jArr[i5]) >= 0) {
                if (Intrinsics.l(jArr[i5], jArr[i2]) < 0) {
                    i(i5, i2);
                    i2 = i5;
                } else {
                    return;
                }
            } else if (Intrinsics.l(jArr[i4], jArr[i2]) < 0) {
                i(i4, i2);
                i2 = i4;
            } else {
                return;
            }
        }
    }

    public final void h(int i2) {
        long[] jArr = this.f15267b;
        long j2 = jArr[i2];
        while (i2 > 0) {
            int i3 = ((i2 + 1) >> 1) - 1;
            if (Intrinsics.l(jArr[i3], j2) > 0) {
                i(i3, i2);
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public final void i(int i2, int i3) {
        long[] jArr = this.f15267b;
        int[] iArr = this.f15268c;
        int[] iArr2 = this.f15269d;
        long j2 = jArr[i2];
        jArr[i2] = jArr[i3];
        jArr[i3] = j2;
        int i4 = iArr[i2];
        int i5 = iArr[i3];
        iArr[i2] = i5;
        iArr[i3] = i4;
        iArr2[i5] = i2;
        iArr2[i4] = i3;
    }
}
