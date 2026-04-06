package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final long f7795a;

    /* renamed from: b  reason: collision with root package name */
    public final Density f7796b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f7797c;

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(androidx.compose.ui.unit.IntRect r9, long r10, androidx.compose.ui.unit.LayoutDirection r12, long r13) {
        /*
            r8 = this;
            androidx.compose.ui.unit.Density r0 = r8.f7796b
            float r1 = androidx.compose.material.MenuKt.j()
            int r0 = r0.P1(r1)
            androidx.compose.ui.unit.Density r1 = r8.f7796b
            long r2 = r8.f7795a
            float r2 = androidx.compose.ui.unit.DpOffset.f(r2)
            int r1 = r1.P1(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r12 != r2) goto L_0x001c
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = -1
        L_0x001d:
            int r1 = r1 * r3
            androidx.compose.ui.unit.Density r3 = r8.f7796b
            long r4 = r8.f7795a
            float r4 = androidx.compose.ui.unit.DpOffset.g(r4)
            int r3 = r3.P1(r4)
            int r4 = r9.g()
            int r4 = r4 + r1
            int r5 = r9.h()
            int r6 = androidx.compose.ui.unit.IntSize.g(r13)
            int r5 = r5 - r6
            int r5 = r5 + r1
            int r1 = androidx.compose.ui.unit.IntSize.g(r10)
            int r6 = androidx.compose.ui.unit.IntSize.g(r13)
            int r1 = r1 - r6
            r6 = 0
            if (r12 != r2) goto L_0x0062
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            int r4 = r9.g()
            if (r4 < 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r1 = r6
        L_0x0055:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer[] r12 = new java.lang.Integer[]{r12, r2, r1}
            kotlin.sequences.Sequence r12 = kotlin.sequences.SequencesKt.l(r12)
            goto L_0x0081
        L_0x0062:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            int r4 = r9.h()
            int r7 = androidx.compose.ui.unit.IntSize.g(r10)
            if (r4 > r7) goto L_0x0075
            r1 = r6
        L_0x0075:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer[] r12 = new java.lang.Integer[]{r12, r2, r1}
            kotlin.sequences.Sequence r12 = kotlin.sequences.SequencesKt.l(r12)
        L_0x0081:
            java.util.Iterator r12 = r12.iterator()
        L_0x0085:
            boolean r1 = r12.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r12.next()
            r4 = r1
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 < 0) goto L_0x0085
            int r6 = androidx.compose.ui.unit.IntSize.g(r13)
            int r4 = r4 + r6
            int r6 = androidx.compose.ui.unit.IntSize.g(r10)
            if (r4 > r6) goto L_0x0085
            goto L_0x00a6
        L_0x00a5:
            r1 = r2
        L_0x00a6:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x00ae
            int r5 = r1.intValue()
        L_0x00ae:
            int r12 = r9.d()
            int r12 = r12 + r3
            int r12 = java.lang.Math.max(r12, r0)
            int r1 = r9.j()
            int r4 = androidx.compose.ui.unit.IntSize.f(r13)
            int r1 = r1 - r4
            int r1 = r1 + r3
            int r4 = r9.j()
            int r6 = androidx.compose.ui.unit.IntSize.f(r13)
            int r6 = r6 / 2
            int r4 = r4 - r6
            int r4 = r4 + r3
            int r3 = androidx.compose.ui.unit.IntSize.f(r10)
            int r6 = androidx.compose.ui.unit.IntSize.f(r13)
            int r3 = r3 - r6
            int r3 = r3 - r0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r12 = new java.lang.Integer[]{r12, r6, r4, r3}
            kotlin.sequences.Sequence r12 = kotlin.sequences.SequencesKt.l(r12)
            java.util.Iterator r12 = r12.iterator()
        L_0x00f3:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r12.next()
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 < r0) goto L_0x00f3
            int r6 = androidx.compose.ui.unit.IntSize.f(r13)
            int r4 = r4 + r6
            int r6 = androidx.compose.ui.unit.IntSize.f(r10)
            int r6 = r6 - r0
            if (r4 > r6) goto L_0x00f3
            r2 = r3
        L_0x0113:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x011b
            int r1 = r2.intValue()
        L_0x011b:
            kotlin.jvm.functions.Function2 r10 = r8.f7797c
            androidx.compose.ui.unit.IntRect r11 = new androidx.compose.ui.unit.IntRect
            int r12 = androidx.compose.ui.unit.IntSize.g(r13)
            int r12 = r12 + r5
            int r13 = androidx.compose.ui.unit.IntSize.f(r13)
            int r13 = r13 + r1
            r11.<init>(r5, r1, r12, r13)
            r10.m(r9, r11)
            long r9 = androidx.compose.ui.unit.IntOffsetKt.a(r5, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DropdownMenuPositionProvider.a(androidx.compose.ui.unit.IntRect, long, androidx.compose.ui.unit.LayoutDirection, long):long");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.e(this.f7795a, dropdownMenuPositionProvider.f7795a) && Intrinsics.d(this.f7796b, dropdownMenuPositionProvider.f7796b) && Intrinsics.d(this.f7797c, dropdownMenuPositionProvider.f7797c);
    }

    public int hashCode() {
        return (((DpOffset.h(this.f7795a) * 31) + this.f7796b.hashCode()) * 31) + this.f7797c.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.i(this.f7795a) + ", density=" + this.f7796b + ", onPositionCalculated=" + this.f7797c + ')';
    }

    public DropdownMenuPositionProvider(long j2, Density density, Function2 function2) {
        this.f7795a = j2;
        this.f7796b = density;
        this.f7797c = function2;
    }
}
