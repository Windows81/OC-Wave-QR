package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyStaggeredGridLaneInfo {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f5070d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f5071e = 8;

    /* renamed from: a  reason: collision with root package name */
    public int f5072a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5073b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f5074c = new ArrayDeque();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class SpannedItem {

        /* renamed from: a  reason: collision with root package name */
        public final int f5077a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f5078b;

        public SpannedItem(int i2, int[] iArr) {
            this.f5077a = i2;
            this.f5078b = iArr;
        }

        public final int[] a() {
            return this.f5078b;
        }

        public final int b() {
            return this.f5077a;
        }

        public final void c(int[] iArr) {
            this.f5078b = iArr;
        }
    }

    public static /* synthetic */ void c(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        lazyStaggeredGridLaneInfo.b(i2, i3);
    }

    public final boolean a(int i2, int i3) {
        int h2 = h(i2);
        return h2 == i3 || h2 == -1 || h2 == -2;
    }

    public final void b(int i2, int i3) {
        if (!(i2 <= 131072)) {
            InlineClassHelperKt.a("Requested item capacity " + i2 + " is larger than max supported: 131072!");
        }
        int[] iArr = this.f5073b;
        if (iArr.length < i2) {
            int length = iArr.length;
            while (length < i2) {
                length *= 2;
            }
            this.f5073b = ArraysKt.o(this.f5073b, new int[length], i3, 0, 0, 12, (Object) null);
        }
    }

    public final void d(int i2) {
        int i3 = this.f5072a;
        int i4 = i2 - i3;
        if (i4 < 0 || i4 >= 131072) {
            int max = Math.max(i2 - (this.f5073b.length / 2), 0);
            this.f5072a = max;
            int i5 = max - i3;
            if (i5 >= 0) {
                int[] iArr = this.f5073b;
                if (i5 < iArr.length) {
                    ArraysKt.j(iArr, iArr, 0, i5, iArr.length);
                }
                int[] iArr2 = this.f5073b;
                ArraysKt.u(iArr2, 0, Math.max(0, iArr2.length - i5), this.f5073b.length);
            } else {
                int i6 = -i5;
                int[] iArr3 = this.f5073b;
                if (iArr3.length + i6 < 131072) {
                    b(iArr3.length + i6 + 1, i6);
                } else {
                    if (i6 < iArr3.length) {
                        ArraysKt.j(iArr3, iArr3, i6, 0, iArr3.length - i6);
                    }
                    int[] iArr4 = this.f5073b;
                    ArraysKt.u(iArr4, 0, 0, Math.min(iArr4.length, i6));
                }
            }
        } else {
            c(this, i4 + 1, 0, 2, (Object) null);
        }
        while (!this.f5074c.isEmpty() && ((SpannedItem) this.f5074c.first()).b() < i()) {
            this.f5074c.removeFirst();
        }
        while (!this.f5074c.isEmpty() && ((SpannedItem) this.f5074c.last()).b() > m()) {
            this.f5074c.removeLast();
        }
    }

    public final int e(int i2, int i3) {
        int m2 = m();
        for (int i4 = i2 + 1; i4 < m2; i4++) {
            if (a(i4, i3)) {
                return i4;
            }
        }
        return m();
    }

    public final int f(int i2, int i3) {
        while (true) {
            i2--;
            if (-1 >= i2) {
                return -1;
            }
            if (a(i2, i3)) {
                return i2;
            }
        }
    }

    public final int[] g(int i2) {
        ArrayDeque arrayDeque = this.f5074c;
        SpannedItem spannedItem = (SpannedItem) CollectionsKt.h0(this.f5074c, CollectionsKt.i(arrayDeque, 0, arrayDeque.size(), new LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i2))));
        if (spannedItem != null) {
            return spannedItem.a();
        }
        return null;
    }

    public final int h(int i2) {
        if (i2 < i() || i2 >= m()) {
            return -1;
        }
        return this.f5073b[i2 - this.f5072a] - 1;
    }

    public final int i() {
        return this.f5072a;
    }

    public final void j() {
        ArraysKt.x(this.f5073b, 0, 0, 0, 6, (Object) null);
        this.f5074c.clear();
    }

    public final void k(int i2, int[] iArr) {
        ArrayDeque arrayDeque = this.f5074c;
        int i3 = CollectionsKt.i(arrayDeque, 0, arrayDeque.size(), new LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i2)));
        if (i3 < 0) {
            if (iArr != null) {
                this.f5074c.add(-(i3 + 1), new SpannedItem(i2, iArr));
            }
        } else if (iArr == null) {
            this.f5074c.remove(i3);
        } else {
            ((SpannedItem) this.f5074c.get(i3)).c(iArr);
        }
    }

    public final void l(int i2, int i3) {
        if (!(i2 >= 0)) {
            InlineClassHelperKt.a("Negative lanes are not supported");
        }
        d(i2);
        this.f5073b[i2 - this.f5072a] = i3 + 1;
    }

    public final int m() {
        return this.f5072a + this.f5073b.length;
    }
}
