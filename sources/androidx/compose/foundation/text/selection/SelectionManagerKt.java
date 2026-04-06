package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class SelectionManagerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f6917a = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6918a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.Handle[] r0 = androidx.compose.foundation.text.Handle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.Cursor     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6918a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManagerKt.WhenMappings.<clinit>():void");
        }
    }

    public static final long c(SelectionManager selectionManager, long j2) {
        Selection D = selectionManager.D();
        if (D == null) {
            return Offset.f15855b.b();
        }
        Handle v2 = selectionManager.v();
        int i2 = v2 == null ? -1 : WhenMappings.f6918a[v2.ordinal()];
        if (i2 == -1) {
            return Offset.f15855b.b();
        }
        if (i2 == 1) {
            return f(selectionManager, j2, D.e());
        }
        if (i2 == 2) {
            return f(selectionManager, j2, D.c());
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    public static final boolean d(Rect rect, long j2) {
        float o2 = rect.o();
        float p2 = rect.p();
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (o2 <= intBitsToFloat && intBitsToFloat <= p2) {
            float r2 = rect.r();
            float i2 = rect.i();
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            return r2 <= intBitsToFloat2 && intBitsToFloat2 <= i2;
        }
    }

    public static final List e(List list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : CollectionsKt.p(CollectionsKt.e0(list), CollectionsKt.p0(list));
    }

    public static final long f(SelectionManager selectionManager, long j2, Selection.AnchorInfo anchorInfo) {
        float f2;
        Selectable p2 = selectionManager.p(anchorInfo);
        if (p2 == null) {
            return Offset.f15855b.b();
        }
        LayoutCoordinates q2 = selectionManager.q();
        if (q2 == null) {
            return Offset.f15855b.b();
        }
        LayoutCoordinates N = p2.N();
        if (N == null) {
            return Offset.f15855b.b();
        }
        int d2 = anchorInfo.d();
        if (d2 > p2.i()) {
            return Offset.f15855b.b();
        }
        Offset s2 = selectionManager.s();
        Intrinsics.f(s2);
        float intBitsToFloat = Float.intBitsToFloat((int) (N.N(q2, s2.t()) >> 32));
        long n2 = p2.n(d2);
        if (TextRange.h(n2)) {
            f2 = p2.h(d2);
        } else {
            float h2 = p2.h(TextRange.n(n2));
            float e2 = p2.e(TextRange.i(n2) - 1);
            f2 = RangesKt.n(intBitsToFloat, Math.min(h2, e2), Math.max(h2, e2));
        }
        if (f2 == -1.0f) {
            return Offset.f15855b.b();
        }
        if (!IntSize.e(j2, IntSize.f19170b.a()) && Math.abs(intBitsToFloat - f2) > ((float) (((int) (j2 >> 32)) / 2))) {
            return Offset.f15855b.b();
        }
        float j3 = p2.j(d2);
        return j3 == -1.0f ? Offset.f15855b.b() : q2.N(N, Offset.e((((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(j3)))));
    }

    public static final Rect g(List list, LayoutCoordinates layoutCoordinates) {
        int i2;
        LayoutCoordinates N;
        int[] iArr;
        List list2 = list;
        LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
        if (list.isEmpty()) {
            return f6917a;
        }
        Rect rect = f6917a;
        float b2 = rect.b();
        float c2 = rect.c();
        float d2 = rect.d();
        float e2 = rect.e();
        int size = list2.size();
        char c3 = 0;
        int i3 = 0;
        while (i3 < size) {
            Pair pair = (Pair) list2.get(i3);
            Selectable selectable = (Selectable) pair.a();
            Selection selection = (Selection) pair.b();
            int d3 = selection.e().d();
            int d4 = selection.c().d();
            if (d3 == d4 || (N = selectable.N()) == null) {
                i2 = size;
                c2 = c2;
                d2 = d2;
            } else {
                int min = Math.min(d3, d4);
                int max = Math.max(d3, d4) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c3] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c3] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                Rect rect2 = f6917a;
                float b3 = rect2.b();
                float c4 = rect2.c();
                float d5 = rect2.d();
                float e3 = rect2.e();
                int i4 = 0;
                for (int length = iArr.length; i4 < length; length = length) {
                    int i5 = size;
                    Rect d6 = selectable.d(iArr[i4]);
                    b3 = Math.min(b3, d6.o());
                    c4 = Math.min(c4, d6.r());
                    d5 = Math.max(d5, d6.p());
                    e3 = Math.max(e3, d6.i());
                    i4++;
                    size = i5;
                }
                i2 = size;
                long e4 = Offset.e((((long) Float.floatToRawIntBits(b3)) << 32) | (((long) Float.floatToRawIntBits(c4)) & 4294967295L));
                float f2 = c2;
                long e5 = Offset.e((((long) Float.floatToRawIntBits(e3)) & 4294967295L) | (((long) Float.floatToRawIntBits(d5)) << 32));
                long N2 = layoutCoordinates2.N(N, e4);
                long N3 = layoutCoordinates2.N(N, e5);
                b2 = Math.min(b2, Float.intBitsToFloat((int) (N2 >> 32)));
                float min2 = Math.min(f2, Float.intBitsToFloat((int) (N2 & 4294967295L)));
                float max2 = Math.max(d2, Float.intBitsToFloat((int) (N3 >> 32)));
                e2 = Math.max(e2, Float.intBitsToFloat((int) (N3 & 4294967295L)));
                d2 = max2;
                c2 = min2;
            }
            i3++;
            list2 = list;
            size = i2;
            c3 = 0;
        }
        return new Rect(b2, c2, d2, e2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.Selection h(androidx.compose.foundation.text.selection.Selection r0, androidx.compose.foundation.text.selection.Selection r1) {
        /*
            if (r0 == 0) goto L_0x000a
            androidx.compose.foundation.text.selection.Selection r0 = r0.f(r1)
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManagerKt.h(androidx.compose.foundation.text.selection.Selection, androidx.compose.foundation.text.selection.Selection):androidx.compose.foundation.text.selection.Selection");
    }

    public static final Rect i(LayoutCoordinates layoutCoordinates) {
        Rect c2 = LayoutCoordinatesKt.c(layoutCoordinates);
        return RectKt.a(layoutCoordinates.d0(c2.t()), layoutCoordinates.d0(c2.l()));
    }
}
