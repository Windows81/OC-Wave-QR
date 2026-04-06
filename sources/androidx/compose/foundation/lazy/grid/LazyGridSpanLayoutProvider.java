package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyGridSpanLayoutProvider {

    /* renamed from: a  reason: collision with root package name */
    public final LazyGridIntervalContent f4704a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4705b;

    /* renamed from: c  reason: collision with root package name */
    public int f4706c;

    /* renamed from: d  reason: collision with root package name */
    public int f4707d;

    /* renamed from: e  reason: collision with root package name */
    public int f4708e;

    /* renamed from: f  reason: collision with root package name */
    public int f4709f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final List f4710g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public List f4711h = CollectionsKt.m();

    /* renamed from: i  reason: collision with root package name */
    public int f4712i;

    @Metadata
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        /* renamed from: a  reason: collision with root package name */
        public static final LazyGridItemSpanScopeImpl f4715a = new LazyGridItemSpanScopeImpl();

        /* renamed from: b  reason: collision with root package name */
        public static int f4716b;

        /* renamed from: c  reason: collision with root package name */
        public static int f4717c;

        public int a() {
            return f4717c;
        }

        public void b(int i2) {
            f4716b = i2;
        }

        public void c(int i2) {
            f4717c = i2;
        }
    }

    @Metadata
    public static final class LineConfiguration {

        /* renamed from: a  reason: collision with root package name */
        public final int f4718a;

        /* renamed from: b  reason: collision with root package name */
        public final List f4719b;

        public LineConfiguration(int i2, List list) {
            this.f4718a = i2;
            this.f4719b = list;
        }

        public final int a() {
            return this.f4718a;
        }

        public final List b() {
            return this.f4719b;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.f4704a = lazyGridIntervalContent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Bucket(0, 0, 2, (DefaultConstructorMarker) null));
        this.f4705b = arrayList;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) f()) * 1.0d) / ((double) this.f4712i))) + 1;
    }

    public final List b(int i2) {
        if (i2 == this.f4711h.size()) {
            return this.f4711h;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(GridItemSpan.a(LazyGridSpanKt.a(1)));
        }
        this.f4711h = arrayList;
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration c(int r11) {
        /*
            r10 = this;
            androidx.compose.foundation.lazy.grid.LazyGridIntervalContent r0 = r10.f4704a
            boolean r0 = r0.k()
            r1 = 0
            if (r0 != 0) goto L_0x0025
            int r0 = r10.f4712i
            int r11 = r11 * r0
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration r0 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration
            int r2 = r10.f4712i
            int r3 = r10.f()
            int r3 = r3 - r11
            int r2 = kotlin.ranges.RangesKt.j(r2, r3)
            int r1 = kotlin.ranges.RangesKt.e(r2, r1)
            java.util.List r1 = r10.b(r1)
            r0.<init>(r11, r1)
            return r0
        L_0x0025:
            int r0 = r10.a()
            int r0 = r11 / r0
            java.util.ArrayList r2 = r10.f4705b
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r10.a()
            int r2 = r2 * r0
            java.util.ArrayList r4 = r10.f4705b
            java.lang.Object r4 = r4.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket r4 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.Bucket) r4
            int r4 = r4.a()
            java.util.ArrayList r5 = r10.f4705b
            java.lang.Object r5 = r5.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket r5 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.Bucket) r5
            int r5 = r5.b()
            int r6 = r10.f4706c
            if (r2 > r6) goto L_0x0060
            if (r6 > r11) goto L_0x0060
            int r4 = r10.f4707d
            int r5 = r10.f4708e
            r2 = r6
            goto L_0x007c
        L_0x0060:
            int r6 = r10.f4709f
            if (r0 != r6) goto L_0x007c
            int r6 = r11 - r2
            java.util.List r7 = r10.f4710g
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x007c
            java.util.List r2 = r10.f4710g
            java.lang.Object r2 = r2.get(r6)
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            r2 = r11
            r5 = r1
        L_0x007c:
            int r6 = r10.a()
            int r6 = r2 % r6
            if (r6 != 0) goto L_0x0091
            int r6 = r10.a()
            int r7 = r11 - r2
            r8 = 2
            if (r8 > r7) goto L_0x0091
            if (r7 >= r6) goto L_0x0091
            r6 = r3
            goto L_0x0092
        L_0x0091:
            r6 = r1
        L_0x0092:
            if (r6 == 0) goto L_0x009b
            r10.f4709f = r0
            java.util.List r0 = r10.f4710g
            r0.clear()
        L_0x009b:
            if (r2 > r11) goto L_0x009f
            r0 = r3
            goto L_0x00a0
        L_0x009f:
            r0 = r1
        L_0x00a0:
            if (r0 != 0) goto L_0x00c3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "currentLine ("
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = ") > lineIndex ("
            r0.append(r7)
            r0.append(r11)
            r7 = 41
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.c(r0)
        L_0x00c3:
            if (r2 >= r11) goto L_0x012c
            int r0 = r10.f()
            if (r4 >= r0) goto L_0x012c
            if (r6 == 0) goto L_0x00d6
            java.util.List r0 = r10.f4710g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r0.add(r7)
        L_0x00d6:
            r0 = r1
        L_0x00d7:
            int r7 = r10.f4712i
            if (r0 >= r7) goto L_0x00f9
            int r7 = r10.f()
            if (r4 >= r7) goto L_0x00f9
            if (r5 != 0) goto L_0x00ee
            int r7 = r10.f4712i
            int r7 = r7 - r0
            int r7 = r10.i(r4, r7)
            r9 = r7
            r7 = r5
            r5 = r9
            goto L_0x00ef
        L_0x00ee:
            r7 = r1
        L_0x00ef:
            int r0 = r0 + r5
            int r8 = r10.f4712i
            if (r0 <= r8) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r4 = r4 + 1
            r5 = r7
            goto L_0x00d7
        L_0x00f9:
            int r2 = r2 + 1
            int r0 = r10.a()
            int r0 = r2 % r0
            if (r0 != 0) goto L_0x00c3
            int r0 = r10.f()
            if (r4 >= r0) goto L_0x00c3
            int r0 = r10.a()
            int r0 = r2 / r0
            java.util.ArrayList r7 = r10.f4705b
            int r7 = r7.size()
            if (r7 != r0) goto L_0x0119
            r0 = r3
            goto L_0x011a
        L_0x0119:
            r0 = r1
        L_0x011a:
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = "invalid starting point"
            androidx.compose.foundation.internal.InlineClassHelperKt.c(r0)
        L_0x0121:
            java.util.ArrayList r0 = r10.f4705b
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket r7 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket
            r7.<init>(r4, r5)
            r0.add(r7)
            goto L_0x00c3
        L_0x012c:
            r10.f4706c = r11
            r10.f4707d = r4
            r10.f4708e = r5
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0 = r1
            r2 = r4
        L_0x0139:
            int r3 = r10.f4712i
            if (r0 >= r3) goto L_0x0165
            int r3 = r10.f()
            if (r2 >= r3) goto L_0x0165
            if (r5 != 0) goto L_0x0150
            int r3 = r10.f4712i
            int r3 = r3 - r0
            int r3 = r10.i(r2, r3)
            r9 = r5
            r5 = r3
            r3 = r9
            goto L_0x0151
        L_0x0150:
            r3 = r1
        L_0x0151:
            int r0 = r0 + r5
            int r6 = r10.f4712i
            if (r0 > r6) goto L_0x0165
            int r2 = r2 + 1
            long r5 = androidx.compose.foundation.lazy.grid.LazyGridSpanKt.a(r5)
            androidx.compose.foundation.lazy.grid.GridItemSpan r5 = androidx.compose.foundation.lazy.grid.GridItemSpan.a(r5)
            r11.add(r5)
            r5 = r3
            goto L_0x0139
        L_0x0165:
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration r0 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration
            r0.<init>(r4, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.c(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int d(int i2) {
        if (f() <= 0) {
            return 0;
        }
        if (!(i2 < f())) {
            InlineClassHelperKt.a("ItemIndex > total count");
        }
        if (!this.f4704a.k()) {
            return i2 / this.f4712i;
        }
        int k2 = CollectionsKt.k(this.f4705b, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i2), 3, (Object) null);
        if (k2 < 0) {
            k2 = (-k2) - 2;
        }
        int a2 = a() * k2;
        int a3 = ((Bucket) this.f4705b.get(k2)).a();
        if (!(a3 <= i2)) {
            InlineClassHelperKt.a("currentItemIndex > itemIndex");
        }
        int i3 = 0;
        while (a3 < i2) {
            int i4 = a3 + 1;
            int i5 = i(a3, this.f4712i - i3);
            i3 += i5;
            int i6 = this.f4712i;
            if (i3 >= i6) {
                if (i3 == i6) {
                    a2++;
                    i3 = 0;
                } else {
                    a2++;
                    i3 = i5;
                }
            }
            if (a2 % a() == 0 && a2 / a() >= this.f4705b.size()) {
                this.f4705b.add(new Bucket(i4 - (i3 > 0 ? 1 : 0), 0, 2, (DefaultConstructorMarker) null));
            }
            a3 = i4;
        }
        return i3 + i(i2, this.f4712i - i3) > this.f4712i ? a2 + 1 : a2;
    }

    public final int e() {
        return this.f4712i;
    }

    public final int f() {
        return this.f4704a.h().e();
    }

    public final void g() {
        this.f4705b.clear();
        this.f4705b.add(new Bucket(0, 0, 2, (DefaultConstructorMarker) null));
        this.f4706c = 0;
        this.f4707d = 0;
        this.f4708e = 0;
        this.f4709f = -1;
        this.f4710g.clear();
    }

    public final void h(int i2) {
        if (i2 != this.f4712i) {
            this.f4712i = i2;
            g();
        }
    }

    public final int i(int i2, int i3) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.f4715a;
        lazyGridItemSpanScopeImpl.b(i3);
        lazyGridItemSpanScopeImpl.c(this.f4712i);
        IntervalList.Interval interval = this.f4704a.h().get(i2);
        return GridItemSpan.d(((GridItemSpan) ((LazyGridInterval) interval.c()).b().m(lazyGridItemSpanScopeImpl, Integer.valueOf(i2 - interval.b()))).g());
    }

    @Metadata
    public static final class Bucket {

        /* renamed from: a  reason: collision with root package name */
        public final int f4713a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4714b;

        public Bucket(int i2, int i3) {
            this.f4713a = i2;
            this.f4714b = i3;
        }

        public final int a() {
            return this.f4713a;
        }

        public final int b() {
            return this.f4714b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Bucket(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, (i4 & 2) != 0 ? 0 : i3);
        }
    }
}
