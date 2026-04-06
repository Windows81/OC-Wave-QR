package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class LazyStaggeredGridScrollPosition {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f5167a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f5168b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableIntState f5169c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f5170d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableIntState f5171e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5172f;

    /* renamed from: g  reason: collision with root package name */
    public Object f5173g;

    /* renamed from: h  reason: collision with root package name */
    public final LazyLayoutNearestRangeState f5174h;

    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, Function2 function2) {
        this.f5167a = function2;
        this.f5168b = iArr;
        this.f5169c = SnapshotIntStateKt.a(a(iArr));
        this.f5170d = iArr2;
        this.f5171e = SnapshotIntStateKt.a(b(iArr, iArr2));
        Integer Q0 = ArraysKt.Q0(iArr);
        this.f5174h = new LazyLayoutNearestRangeState(Q0 != null ? Q0.intValue() : 0, 90, 200);
    }

    public final int a(int[] iArr) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : iArr) {
            if (i3 <= 0) {
                return 0;
            }
            if (i2 > i3) {
                i2 = i3;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return i2;
    }

    public final int b(int[] iArr, int[] iArr2) {
        int a2 = a(iArr);
        int length = iArr2.length;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            if (iArr[i3] == a2) {
                i2 = Math.min(i2, iArr2[i3]);
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return i2;
    }

    public final int c() {
        return this.f5169c.e();
    }

    public final int[] d() {
        return this.f5168b;
    }

    public final LazyLayoutNearestRangeState e() {
        return this.f5174h;
    }

    public final int f() {
        return this.f5171e.e();
    }

    public final int[] g() {
        return this.f5170d;
    }

    public final void h(int i2, int i3) {
        int[] iArr = (int[]) this.f5167a.m(Integer.valueOf(i2), Integer.valueOf(this.f5168b.length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = i3;
        }
        k(iArr, iArr2);
        this.f5174h.i(i2);
        this.f5173g = null;
    }

    public final void i(int i2) {
        this.f5169c.k(i2);
    }

    public final void j(int i2) {
        this.f5171e.k(i2);
    }

    public final void k(int[] iArr, int[] iArr2) {
        this.f5168b = iArr;
        i(a(iArr));
        this.f5170d = iArr2;
        j(b(iArr, iArr2));
    }

    public final void l(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        Function1 function1;
        Object obj;
        int a2 = a(lazyStaggeredGridMeasureResult.p());
        List k2 = lazyStaggeredGridMeasureResult.k();
        int size = k2.size();
        int i2 = 0;
        while (true) {
            function1 = null;
            if (i2 >= size) {
                obj = function1;
                break;
            }
            obj = k2.get(i2);
            if (((LazyStaggeredGridMeasuredItem) obj).getIndex() == a2) {
                break;
            }
            i2++;
        }
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) obj;
        this.f5173g = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getKey() : function1;
        this.f5174h.i(a2);
        if (this.f5172f || lazyStaggeredGridMeasureResult.h() > 0) {
            this.f5172f = true;
            Snapshot.Companion companion = Snapshot.f15255e;
            Snapshot d2 = companion.d();
            if (d2 != null) {
                function1 = d2.g();
            }
            Snapshot f2 = companion.f(d2);
            try {
                k(lazyStaggeredGridMeasureResult.p(), lazyStaggeredGridMeasureResult.t());
                Unit unit = Unit.f40552a;
            } finally {
                companion.m(d2, f2, function1);
            }
        }
    }

    public final void m(int[] iArr) {
        this.f5170d = iArr;
        j(b(this.f5168b, iArr));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] n(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r6, int[] r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5173g
            r1 = 0
            java.lang.Integer r2 = kotlin.collections.ArraysKt.n0(r7, r1)
            if (r2 == 0) goto L_0x000d
            int r1 = r2.intValue()
        L_0x000d:
            int r6 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.a(r6, r0, r1)
            boolean r0 = kotlin.collections.ArraysKt.W(r7, r6)
            if (r0 != 0) goto L_0x0052
            androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState r0 = r5.f5174h
            r0.i(r6)
            androidx.compose.runtime.snapshots.Snapshot$Companion r0 = androidx.compose.runtime.snapshots.Snapshot.f15255e
            androidx.compose.runtime.snapshots.Snapshot r1 = r0.d()
            if (r1 == 0) goto L_0x0029
            kotlin.jvm.functions.Function1 r2 = r1.g()
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            androidx.compose.runtime.snapshots.Snapshot r3 = r0.f(r1)
            kotlin.jvm.functions.Function2 r4 = r5.f5167a     // Catch:{ all -> 0x004d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
            int r7 = r7.length     // Catch:{ all -> 0x004d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004d }
            java.lang.Object r6 = r4.m(r6, r7)     // Catch:{ all -> 0x004d }
            r7 = r6
            int[] r7 = (int[]) r7     // Catch:{ all -> 0x004d }
            r0.m(r1, r3, r2)
            r5.f5168b = r7
            int r6 = r5.a(r7)
            r5.i(r6)
            goto L_0x0052
        L_0x004d:
            r6 = move-exception
            r0.m(r1, r3, r2)
            throw r6
        L_0x0052:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition.n(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider, int[]):int[]");
    }
}
