package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f5118a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5119b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5120c;

    /* renamed from: d  reason: collision with root package name */
    public final MeasureResult f5121d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5122e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5123f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5124g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5125h;

    /* renamed from: i  reason: collision with root package name */
    public final LazyStaggeredGridSlots f5126i;

    /* renamed from: j  reason: collision with root package name */
    public final LazyStaggeredGridSpanProvider f5127j;

    /* renamed from: k  reason: collision with root package name */
    public final Density f5128k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5129l;

    /* renamed from: m  reason: collision with root package name */
    public final List f5130m;

    /* renamed from: n  reason: collision with root package name */
    public final long f5131n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5132o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5133p;

    /* renamed from: q  reason: collision with root package name */
    public final int f5134q;

    /* renamed from: r  reason: collision with root package name */
    public final int f5135r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5136s;

    /* renamed from: t  reason: collision with root package name */
    public final CoroutineScope f5137t;

    /* renamed from: u  reason: collision with root package name */
    public final Orientation f5138u;

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f2, MeasureResult measureResult, float f3, boolean z2, boolean z3, boolean z4, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i2, List list, long j2, int i3, int i4, int i5, int i6, int i7, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f2, measureResult, f3, z2, z3, z4, lazyStaggeredGridSlots, lazyStaggeredGridSpanProvider, density, i2, list, j2, i3, i4, i5, i6, i7, coroutineScope);
    }

    public int a() {
        return this.f5121d.a();
    }

    public int b() {
        return this.f5121d.b();
    }

    public long c() {
        return this.f5131n;
    }

    public int d() {
        return this.f5135r;
    }

    public Orientation e() {
        return this.f5138u;
    }

    public int f() {
        return this.f5134q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult g(int r33, boolean r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            boolean r2 = r0.f5125h
            r3 = 0
            if (r2 != 0) goto L_0x0136
            java.util.List r2 = r32.k()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0136
            int[] r2 = r0.f5118a
            int r2 = r2.length
            if (r2 != 0) goto L_0x001a
            goto L_0x0136
        L_0x001a:
            int[] r2 = r0.f5119b
            int r2 = r2.length
            if (r2 != 0) goto L_0x0021
            goto L_0x0136
        L_0x0021:
            int r2 = r32.x()
            int r4 = r32.d()
            int r2 = r2 - r4
            java.util.List r4 = r32.k()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
            r7 = r6
        L_0x0037:
            r8 = 1
            if (r7 >= r5) goto L_0x00b6
            java.lang.Object r9 = r4.get(r7)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r9 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r9
            boolean r10 = r9.i()
            if (r10 != 0) goto L_0x00b5
            int r10 = r9.p()
            if (r10 > 0) goto L_0x004e
            r10 = r8
            goto L_0x004f
        L_0x004e:
            r10 = r6
        L_0x004f:
            int r11 = r9.p()
            int r11 = r11 + r1
            if (r11 > 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = r6
        L_0x0058:
            if (r10 == r8) goto L_0x005b
            goto L_0x00b5
        L_0x005b:
            int r8 = r9.p()
            int r10 = r32.y()
            if (r8 > r10) goto L_0x0086
            if (r1 >= 0) goto L_0x0079
            int r8 = r9.p()
            int r10 = r9.h()
            int r8 = r8 + r10
            int r10 = r32.y()
            int r8 = r8 - r10
            int r10 = -r1
            if (r8 <= r10) goto L_0x0085
            goto L_0x0086
        L_0x0079:
            int r8 = r32.y()
            int r10 = r9.p()
            int r8 = r8 - r10
            if (r8 <= r1) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            return r3
        L_0x0086:
            int r8 = r9.p()
            int r10 = r9.h()
            int r8 = r8 + r10
            if (r8 < r2) goto L_0x00b2
            if (r1 >= 0) goto L_0x00a5
            int r8 = r9.p()
            int r9 = r9.h()
            int r8 = r8 + r9
            int r9 = r32.x()
            int r8 = r8 - r9
            int r9 = -r1
            if (r8 <= r9) goto L_0x00b1
            goto L_0x00b2
        L_0x00a5:
            int r8 = r32.x()
            int r9 = r9.p()
            int r8 = r8 - r9
            if (r8 <= r1) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            return r3
        L_0x00b2:
            int r7 = r7 + 1
            goto L_0x0037
        L_0x00b5:
            return r3
        L_0x00b6:
            java.util.List r2 = r32.k()
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r6
        L_0x00c2:
            if (r4 >= r3) goto L_0x00d2
            java.lang.Object r5 = r2.get(r4)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r5
            r7 = r34
            r5.f(r1, r7)
            int r4 = r4 + 1
            goto L_0x00c2
        L_0x00d2:
            int[] r10 = r0.f5118a
            int[] r2 = r0.f5119b
            int r2 = r2.length
            int[] r11 = new int[r2]
            r3 = r6
        L_0x00da:
            if (r3 >= r2) goto L_0x00e6
            int[] r4 = r0.f5119b
            r4 = r4[r3]
            int r4 = r4 - r1
            r11[r3] = r4
            int r3 = r3 + 1
            goto L_0x00da
        L_0x00e6:
            float r12 = (float) r1
            float r14 = r0.f5122e
            androidx.compose.ui.layout.MeasureResult r13 = r0.f5121d
            boolean r2 = r0.f5123f
            if (r2 != 0) goto L_0x00f4
            if (r1 <= 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r15 = r6
            goto L_0x00f5
        L_0x00f4:
            r15 = r8
        L_0x00f5:
            boolean r1 = r0.f5124g
            r16 = r1
            boolean r1 = r0.f5125h
            r17 = r1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r1 = r0.f5126i
            r18 = r1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider r1 = r0.f5127j
            r19 = r1
            androidx.compose.ui.unit.Density r1 = r0.f5128k
            r20 = r1
            int r21 = r32.h()
            java.util.List r22 = r32.k()
            long r23 = r32.c()
            int r25 = r32.y()
            int r26 = r32.x()
            int r27 = r32.f()
            int r28 = r32.d()
            int r29 = r32.i()
            kotlinx.coroutines.CoroutineScope r1 = r0.f5137t
            r30 = r1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r1 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult
            r9 = r1
            r31 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31)
            return r1
        L_0x0136:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult.g(int, boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    public int h() {
        return this.f5129l;
    }

    public int i() {
        return this.f5136s;
    }

    public final boolean j() {
        return this.f5118a[0] != 0 || this.f5119b[0] > 0;
    }

    public List k() {
        return this.f5130m;
    }

    public final boolean l() {
        return this.f5123f;
    }

    public final float m() {
        return this.f5120c;
    }

    public final CoroutineScope n() {
        return this.f5137t;
    }

    public final Density o() {
        return this.f5128k;
    }

    public final int[] p() {
        return this.f5118a;
    }

    public Map q() {
        return this.f5121d.q();
    }

    public void r() {
        this.f5121d.r();
    }

    public Function1 s() {
        return this.f5121d.s();
    }

    public final int[] t() {
        return this.f5119b;
    }

    public final float u() {
        return this.f5122e;
    }

    public final LazyStaggeredGridSlots v() {
        return this.f5126i;
    }

    public final LazyStaggeredGridSpanProvider w() {
        return this.f5127j;
    }

    public int x() {
        return this.f5133p;
    }

    public int y() {
        return this.f5132o;
    }

    public LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f2, MeasureResult measureResult, float f3, boolean z2, boolean z3, boolean z4, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i2, List list, long j2, int i3, int i4, int i5, int i6, int i7, CoroutineScope coroutineScope) {
        boolean z5 = z3;
        this.f5118a = iArr;
        this.f5119b = iArr2;
        this.f5120c = f2;
        this.f5121d = measureResult;
        this.f5122e = f3;
        this.f5123f = z2;
        this.f5124g = z5;
        this.f5125h = z4;
        this.f5126i = lazyStaggeredGridSlots;
        this.f5127j = lazyStaggeredGridSpanProvider;
        this.f5128k = density;
        this.f5129l = i2;
        this.f5130m = list;
        this.f5131n = j2;
        this.f5132o = i3;
        this.f5133p = i4;
        this.f5134q = i5;
        this.f5135r = i6;
        this.f5136s = i7;
        this.f5137t = coroutineScope;
        this.f5138u = z5 ? Orientation.Vertical : Orientation.Horizontal;
    }
}
