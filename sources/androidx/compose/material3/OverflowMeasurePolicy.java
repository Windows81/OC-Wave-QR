package androidx.compose.material3;

import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class OverflowMeasurePolicy implements MultiContentMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final AppBarOverflowState f10593a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10594b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10595c;

    public static final Unit e(List list, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.n(placementScope, placeable, 0, i2, 0.0f, 4, (Object) null);
            i2 += placeable.C0();
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                Placeable.PlacementScope.n(placementScope, (Placeable) list2.get(i4), 0, i2, 0.0f, 4, (Object) null);
            }
        }
        return Unit.f40552a;
    }

    public static final Unit g(List list, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.n(placementScope, placeable, i2, 0, 0.0f, 4, (Object) null);
            i2 += placeable.L0();
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                Placeable.PlacementScope.n(placementScope, (Placeable) list2.get(i4), i2, 0, 0.0f, 4, (Object) null);
            }
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.MeasureResult b(androidx.compose.ui.layout.MeasureScope r22, java.util.List r23, long r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r10 = r24
            r8 = 10
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r24
            long r12 = androidx.compose.ui.unit.Constraints.d(r2, r4, r5, r6, r7, r8, r9)
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = 1
            java.lang.Object r1 = r1.get(r4)
            java.util.List r1 = (java.util.List) r1
            androidx.compose.material3.AppBarOverflowState r5 = r0.f10593a
            int r6 = r3.size()
            r5.b(r6)
            boolean r5 = r0.f10595c
            if (r5 == 0) goto L_0x0076
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x0036
            r5 = 0
            goto L_0x006d
        L_0x0036:
            java.lang.Object r5 = r1.get(r2)
            androidx.compose.ui.layout.Measurable r5 = (androidx.compose.ui.layout.Measurable) r5
            int r7 = androidx.compose.ui.unit.Constraints.l(r24)
            int r5 = r5.C(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r7 = kotlin.collections.CollectionsKt.o(r1)
            if (r4 > r7) goto L_0x006d
            r8 = r4
        L_0x004f:
            java.lang.Object r9 = r1.get(r8)
            androidx.compose.ui.layout.Measurable r9 = (androidx.compose.ui.layout.Measurable) r9
            int r14 = androidx.compose.ui.unit.Constraints.l(r24)
            int r9 = r9.C(r14)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r14 = r9.compareTo(r5)
            if (r14 <= 0) goto L_0x0068
            r5 = r9
        L_0x0068:
            if (r8 == r7) goto L_0x006d
            int r8 = r8 + 1
            goto L_0x004f
        L_0x006d:
            if (r5 == 0) goto L_0x0074
            int r5 = r5.intValue()
            goto L_0x00bb
        L_0x0074:
            r5 = r2
            goto L_0x00bb
        L_0x0076:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x007e
            r5 = 0
            goto L_0x00b5
        L_0x007e:
            java.lang.Object r5 = r1.get(r2)
            androidx.compose.ui.layout.Measurable r5 = (androidx.compose.ui.layout.Measurable) r5
            int r7 = androidx.compose.ui.unit.Constraints.k(r24)
            int r5 = r5.a0(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r7 = kotlin.collections.CollectionsKt.o(r1)
            if (r4 > r7) goto L_0x00b5
            r8 = r4
        L_0x0097:
            java.lang.Object r9 = r1.get(r8)
            androidx.compose.ui.layout.Measurable r9 = (androidx.compose.ui.layout.Measurable) r9
            int r14 = androidx.compose.ui.unit.Constraints.k(r24)
            int r9 = r9.a0(r14)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r14 = r9.compareTo(r5)
            if (r14 <= 0) goto L_0x00b0
            r5 = r9
        L_0x00b0:
            if (r8 == r7) goto L_0x00b5
            int r8 = r8 + 1
            goto L_0x0097
        L_0x00b5:
            if (r5 == 0) goto L_0x0074
            int r5 = r5.intValue()
        L_0x00bb:
            boolean r7 = r0.f10595c
            if (r7 == 0) goto L_0x00c4
            int r7 = androidx.compose.ui.unit.Constraints.k(r24)
            goto L_0x00c8
        L_0x00c4:
            int r7 = androidx.compose.ui.unit.Constraints.l(r24)
        L_0x00c8:
            int r7 = androidx.compose.material3.internal.LayoutUtilKt.d(r7, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r3
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r14 = r2
            r20 = r14
        L_0x00db:
            if (r14 >= r9) goto L_0x011a
            java.lang.Object r15 = r3.get(r14)
            androidx.compose.ui.layout.Measurable r15 = (androidx.compose.ui.layout.Measurable) r15
            androidx.compose.ui.layout.Placeable r15 = r15.c0(r12)
            int r6 = kotlin.collections.CollectionsKt.o(r3)
            if (r14 != r6) goto L_0x00ef
            r6 = r4
            goto L_0x00f0
        L_0x00ef:
            r6 = r2
        L_0x00f0:
            if (r6 != 0) goto L_0x00f8
            int r2 = r0.f10594b
            int r2 = r2 - r4
            if (r14 != r2) goto L_0x00f8
            goto L_0x011a
        L_0x00f8:
            boolean r2 = r0.f10595c
            if (r2 == 0) goto L_0x0101
            int r2 = r15.C0()
            goto L_0x0105
        L_0x0101:
            int r2 = r15.L0()
        L_0x0105:
            if (r2 <= r7) goto L_0x010d
            if (r6 == 0) goto L_0x011a
            int r6 = r7 + r5
            if (r2 > r6) goto L_0x011a
        L_0x010d:
            r8.add(r15)
            int r20 = r20 + r2
            int r7 = androidx.compose.material3.internal.LayoutUtilKt.d(r7, r2)
            int r14 = r14 + 1
            r2 = 0
            goto L_0x00db
        L_0x011a:
            androidx.compose.material3.AppBarOverflowState r2 = r0.f10593a
            int r6 = r8.size()
            r2.d(r6)
            int r2 = r8.size()
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0172
            boolean r2 = r0.f10595c
            if (r2 == 0) goto L_0x0140
            int r17 = r7 + r5
            r18 = 7
            r19 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            long r2 = androidx.compose.ui.unit.Constraints.d(r12, r14, r15, r16, r17, r18, r19)
            goto L_0x014f
        L_0x0140:
            int r15 = r7 + r5
            r18 = 13
            r19 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            long r2 = androidx.compose.ui.unit.Constraints.d(r12, r14, r15, r16, r17, r18, r19)
        L_0x014f:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r1.size()
            r5.<init>(r6)
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = 0
        L_0x0160:
            if (r7 >= r6) goto L_0x0173
            java.lang.Object r9 = r1.get(r7)
            androidx.compose.ui.layout.Measurable r9 = (androidx.compose.ui.layout.Measurable) r9
            androidx.compose.ui.layout.Placeable r9 = r9.c0(r2)
            r5.add(r9)
            int r7 = r7 + 1
            goto L_0x0160
        L_0x0172:
            r5 = 0
        L_0x0173:
            boolean r1 = r0.f10595c
            if (r1 == 0) goto L_0x01ba
            if (r5 == 0) goto L_0x01b8
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0181
            r1 = 0
            goto L_0x01b1
        L_0x0181:
            r1 = 0
            java.lang.Object r2 = r5.get(r1)
            androidx.compose.ui.layout.Placeable r2 = (androidx.compose.ui.layout.Placeable) r2
            int r1 = r2.C0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = kotlin.collections.CollectionsKt.o(r5)
            if (r4 > r2) goto L_0x01b1
            r3 = r4
        L_0x0197:
            java.lang.Object r6 = r5.get(r3)
            androidx.compose.ui.layout.Placeable r6 = (androidx.compose.ui.layout.Placeable) r6
            int r6 = r6.C0()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r6.compareTo(r1)
            if (r7 <= 0) goto L_0x01ac
            r1 = r6
        L_0x01ac:
            if (r3 == r2) goto L_0x01b1
            int r3 = r3 + 1
            goto L_0x0197
        L_0x01b1:
            if (r1 == 0) goto L_0x01b8
            int r1 = r1.intValue()
            goto L_0x01fa
        L_0x01b8:
            r1 = 0
            goto L_0x01fa
        L_0x01ba:
            if (r5 == 0) goto L_0x01b8
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x01c4
            r1 = 0
            goto L_0x01f4
        L_0x01c4:
            r1 = 0
            java.lang.Object r2 = r5.get(r1)
            androidx.compose.ui.layout.Placeable r2 = (androidx.compose.ui.layout.Placeable) r2
            int r1 = r2.L0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = kotlin.collections.CollectionsKt.o(r5)
            if (r4 > r2) goto L_0x01f4
            r3 = r4
        L_0x01da:
            java.lang.Object r6 = r5.get(r3)
            androidx.compose.ui.layout.Placeable r6 = (androidx.compose.ui.layout.Placeable) r6
            int r6 = r6.L0()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r6.compareTo(r1)
            if (r7 <= 0) goto L_0x01ef
            r1 = r6
        L_0x01ef:
            if (r3 == r2) goto L_0x01f4
            int r3 = r3 + 1
            goto L_0x01da
        L_0x01f4:
            if (r1 == 0) goto L_0x01b8
            int r1 = r1.intValue()
        L_0x01fa:
            int r1 = r20 + r1
            boolean r2 = r0.f10595c
            if (r2 == 0) goto L_0x0288
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0208
            r2 = 0
            goto L_0x0238
        L_0x0208:
            r2 = 0
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.ui.layout.Placeable r3 = (androidx.compose.ui.layout.Placeable) r3
            int r2 = r3.L0()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = kotlin.collections.CollectionsKt.o(r8)
            if (r4 > r3) goto L_0x0238
            r6 = r4
        L_0x021e:
            java.lang.Object r7 = r8.get(r6)
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            int r7 = r7.L0()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r9 = r7.compareTo(r2)
            if (r9 <= 0) goto L_0x0233
            r2 = r7
        L_0x0233:
            if (r6 == r3) goto L_0x0238
            int r6 = r6 + 1
            goto L_0x021e
        L_0x0238:
            if (r2 == 0) goto L_0x023f
            int r2 = r2.intValue()
            goto L_0x0240
        L_0x023f:
            r2 = 0
        L_0x0240:
            if (r5 == 0) goto L_0x0281
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x024a
            r6 = 0
            goto L_0x027a
        L_0x024a:
            r3 = 0
            java.lang.Object r6 = r5.get(r3)
            androidx.compose.ui.layout.Placeable r6 = (androidx.compose.ui.layout.Placeable) r6
            int r3 = r6.L0()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r6 = kotlin.collections.CollectionsKt.o(r5)
            if (r4 > r6) goto L_0x0279
        L_0x025f:
            java.lang.Object r7 = r5.get(r4)
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            int r7 = r7.L0()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r9 = r7.compareTo(r3)
            if (r9 <= 0) goto L_0x0274
            r3 = r7
        L_0x0274:
            if (r4 == r6) goto L_0x0279
            int r4 = r4 + 1
            goto L_0x025f
        L_0x0279:
            r6 = r3
        L_0x027a:
            if (r6 == 0) goto L_0x0281
            int r3 = r6.intValue()
            goto L_0x0282
        L_0x0281:
            r3 = 0
        L_0x0282:
            int r2 = java.lang.Math.max(r2, r3)
            goto L_0x030e
        L_0x0288:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0290
            r2 = 0
            goto L_0x02c0
        L_0x0290:
            r2 = 0
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.ui.layout.Placeable r3 = (androidx.compose.ui.layout.Placeable) r3
            int r2 = r3.C0()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = kotlin.collections.CollectionsKt.o(r8)
            if (r4 > r3) goto L_0x02c0
            r6 = r4
        L_0x02a6:
            java.lang.Object r7 = r8.get(r6)
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            int r7 = r7.C0()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r9 = r7.compareTo(r2)
            if (r9 <= 0) goto L_0x02bb
            r2 = r7
        L_0x02bb:
            if (r6 == r3) goto L_0x02c0
            int r6 = r6 + 1
            goto L_0x02a6
        L_0x02c0:
            if (r2 == 0) goto L_0x02c7
            int r2 = r2.intValue()
            goto L_0x02c8
        L_0x02c7:
            r2 = 0
        L_0x02c8:
            if (r5 == 0) goto L_0x0309
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x02d3
            r3 = 0
            r6 = 0
            goto L_0x0302
        L_0x02d3:
            r3 = 0
            java.lang.Object r6 = r5.get(r3)
            androidx.compose.ui.layout.Placeable r6 = (androidx.compose.ui.layout.Placeable) r6
            int r6 = r6.C0()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = kotlin.collections.CollectionsKt.o(r5)
            if (r4 > r7) goto L_0x0302
        L_0x02e8:
            java.lang.Object r9 = r5.get(r4)
            androidx.compose.ui.layout.Placeable r9 = (androidx.compose.ui.layout.Placeable) r9
            int r9 = r9.C0()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r12 = r9.compareTo(r6)
            if (r12 <= 0) goto L_0x02fd
            r6 = r9
        L_0x02fd:
            if (r4 == r7) goto L_0x0302
            int r4 = r4 + 1
            goto L_0x02e8
        L_0x0302:
            if (r6 == 0) goto L_0x030a
            int r3 = r6.intValue()
            goto L_0x030a
        L_0x0309:
            r3 = 0
        L_0x030a:
            int r2 = java.lang.Math.max(r2, r3)
        L_0x030e:
            boolean r3 = r0.f10595c
            if (r3 == 0) goto L_0x032a
            int r2 = androidx.compose.ui.unit.ConstraintsKt.g(r10, r2)
            int r11 = androidx.compose.ui.unit.ConstraintsKt.f(r10, r1)
            androidx.compose.material3.X4 r13 = new androidx.compose.material3.X4
            r13.<init>(r8, r5)
            r14 = 4
            r15 = 0
            r12 = 0
            r9 = r22
            r10 = r2
            androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.ui.layout.MeasureScope.R1(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0340
        L_0x032a:
            int r3 = androidx.compose.ui.unit.ConstraintsKt.g(r10, r1)
            int r4 = androidx.compose.ui.unit.ConstraintsKt.f(r10, r2)
            androidx.compose.material3.Y4 r6 = new androidx.compose.material3.Y4
            r6.<init>(r8, r5)
            r7 = 4
            r8 = 0
            r5 = 0
            r2 = r22
            androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.ui.layout.MeasureScope.R1(r2, r3, r4, r5, r6, r7, r8)
        L_0x0340:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OverflowMeasurePolicy.b(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }
}
