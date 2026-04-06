package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class DelimitedRangesSequence$iterator$1 implements Iterator<IntRange>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41130A;

    /* renamed from: B  reason: collision with root package name */
    public int f41131B;
    public IntRange C;
    public int D;
    public final /* synthetic */ DelimitedRangesSequence E;

    /* renamed from: z  reason: collision with root package name */
    public int f41132z = -1;

    public DelimitedRangesSequence$iterator$1(DelimitedRangesSequence delimitedRangesSequence) {
        this.E = delimitedRangesSequence;
        int o2 = RangesKt.o(delimitedRangesSequence.f41127b, 0, delimitedRangesSequence.f41126a.length());
        this.f41130A = o2;
        this.f41131B = o2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r0 < r6.E.f41128c) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b() {
        /*
            r6 = this;
            int r0 = r6.f41131B
            r1 = 0
            if (r0 >= 0) goto L_0x000c
            r6.f41132z = r1
            r0 = 0
            r6.C = r0
            goto L_0x009e
        L_0x000c:
            kotlin.text.DelimitedRangesSequence r0 = r6.E
            int r0 = r0.f41128c
            r2 = -1
            r3 = 1
            if (r0 <= 0) goto L_0x0023
            int r0 = r6.D
            int r0 = r0 + r3
            r6.D = r0
            kotlin.text.DelimitedRangesSequence r4 = r6.E
            int r4 = r4.f41128c
            if (r0 >= r4) goto L_0x0031
        L_0x0023:
            int r0 = r6.f41131B
            kotlin.text.DelimitedRangesSequence r4 = r6.E
            java.lang.CharSequence r4 = r4.f41126a
            int r4 = r4.length()
            if (r0 <= r4) goto L_0x0047
        L_0x0031:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r6.f41130A
            kotlin.text.DelimitedRangesSequence r4 = r6.E
            java.lang.CharSequence r4 = r4.f41126a
            int r4 = kotlin.text.StringsKt.d0(r4)
            r0.<init>(r1, r4)
            r6.C = r0
            r6.f41131B = r2
            goto L_0x009c
        L_0x0047:
            kotlin.text.DelimitedRangesSequence r0 = r6.E
            kotlin.jvm.functions.Function2 r0 = r0.f41129d
            kotlin.text.DelimitedRangesSequence r4 = r6.E
            java.lang.CharSequence r4 = r4.f41126a
            int r5 = r6.f41131B
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.m(r4, r5)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L_0x0077
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r6.f41130A
            kotlin.text.DelimitedRangesSequence r4 = r6.E
            java.lang.CharSequence r4 = r4.f41126a
            int r4 = kotlin.text.StringsKt.d0(r4)
            r0.<init>(r1, r4)
            r6.C = r0
            r6.f41131B = r2
            goto L_0x009c
        L_0x0077:
            java.lang.Object r2 = r0.a()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r4 = r6.f41130A
            kotlin.ranges.IntRange r4 = kotlin.ranges.RangesKt.v(r4, r2)
            r6.C = r4
            int r2 = r2 + r0
            r6.f41130A = r2
            if (r0 != 0) goto L_0x0099
            r1 = r3
        L_0x0099:
            int r2 = r2 + r1
            r6.f41131B = r2
        L_0x009c:
            r6.f41132z = r3
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence$iterator$1.b():void");
    }

    /* renamed from: c */
    public IntRange next() {
        if (this.f41132z == -1) {
            b();
        }
        if (this.f41132z != 0) {
            IntRange intRange = this.C;
            Intrinsics.g(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.C = null;
            this.f41132z = -1;
            return intRange;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        if (this.f41132z == -1) {
            b();
        }
        return this.f41132z == 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
