package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
final class TopAppBarMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final FloatProducer f11641a;

    /* renamed from: b  reason: collision with root package name */
    public final Arrangement.Vertical f11642b;

    /* renamed from: c  reason: collision with root package name */
    public final Alignment.Horizontal f11643c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11644d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11645e;

    public /* synthetic */ TopAppBarMeasurePolicy(FloatProducer floatProducer, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(floatProducer, vertical, horizontal, i2, f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Unit e(androidx.compose.ui.layout.Placeable r12, int r13, androidx.compose.ui.layout.Placeable r14, androidx.compose.ui.layout.Placeable r15, long r16, androidx.compose.ui.layout.MeasureScope r18, androidx.compose.material3.TopAppBarMeasurePolicy r19, int r20, int r21, androidx.compose.ui.layout.Placeable.PlacementScope r22) {
        /*
            r0 = r19
            r1 = r21
            int r2 = r12.C0()
            int r2 = r13 - r2
            int r6 = r2 / 2
            r8 = 4
            r9 = 0
            r5 = 0
            r7 = 0
            r3 = r22
            r4 = r12
            androidx.compose.ui.layout.Placeable.PlacementScope.n(r3, r4, r5, r6, r7, r8, r9)
            float r2 = androidx.compose.material3.AppBarKt.f9192k
            r3 = r18
            int r2 = r3.P1(r2)
            int r3 = r12.L0()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r15.L0()
            androidx.compose.ui.Alignment$Horizontal r4 = r0.f11643c
            int r5 = r14.L0()
            int r6 = androidx.compose.ui.unit.Constraints.l(r16)
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.Ltr
            int r4 = r4.a(r5, r6, r7)
            if (r4 >= r2) goto L_0x0042
            int r2 = r2 - r4
        L_0x003f:
            int r4 = r4 + r2
        L_0x0040:
            r7 = r4
            goto L_0x005a
        L_0x0042:
            int r2 = r14.L0()
            int r2 = r2 + r4
            int r5 = androidx.compose.ui.unit.Constraints.l(r16)
            int r5 = r5 - r3
            if (r2 <= r5) goto L_0x0040
            int r2 = androidx.compose.ui.unit.Constraints.l(r16)
            int r2 = r2 - r3
            int r3 = r14.L0()
            int r3 = r3 + r4
            int r2 = r2 - r3
            goto L_0x003f
        L_0x005a:
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r0.f11642b
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r4 = r3.b()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r2, r4)
            if (r4 == 0) goto L_0x0072
            int r0 = r14.C0()
            int r0 = r13 - r0
            int r0 = r0 / 2
        L_0x0070:
            r8 = r0
            goto L_0x00a6
        L_0x0072:
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            r3 = 0
            if (r2 == 0) goto L_0x00a5
            int r0 = r0.f11644d
            if (r0 != 0) goto L_0x0088
            int r0 = r14.C0()
            int r0 = r13 - r0
            goto L_0x0070
        L_0x0088:
            int r2 = r14.C0()
            int r2 = r2 - r20
            int r0 = r0 - r2
            int r2 = r14.C0()
            int r2 = r2 + r0
            if (r2 <= r1) goto L_0x0098
            int r2 = r2 - r1
            int r0 = r0 - r2
        L_0x0098:
            int r1 = r14.C0()
            int r1 = r13 - r1
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r1 - r0
            r8 = r1
            goto L_0x00a6
        L_0x00a5:
            r8 = r3
        L_0x00a6:
            r10 = 4
            r11 = 0
            r9 = 0
            r5 = r22
            r6 = r14
            androidx.compose.ui.layout.Placeable.PlacementScope.n(r5, r6, r7, r8, r9, r10, r11)
            int r0 = androidx.compose.ui.unit.Constraints.l(r16)
            int r1 = r15.L0()
            int r0 = r0 - r1
            int r1 = r15.C0()
            int r1 = r13 - r1
            int r1 = r1 / 2
            r2 = 4
            r3 = 0
            r4 = 0
            r16 = r22
            r17 = r15
            r18 = r0
            r19 = r1
            r20 = r4
            r21 = r2
            r22 = r3
            androidx.compose.ui.layout.Placeable.PlacementScope.n(r16, r17, r18, r19, r20, r21, r22)
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TopAppBarMeasurePolicy.e(androidx.compose.ui.layout.Placeable, int, androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Placeable, long, androidx.compose.ui.layout.MeasureScope, androidx.compose.material3.TopAppBarMeasurePolicy, int, int, androidx.compose.ui.layout.Placeable$PlacementScope):kotlin.Unit");
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "navigationIcon")) {
                Placeable c0 = measurable.c0(Constraints.d(j2, 0, 0, 0, 0, 14, (Object) null));
                Collection collection = list2;
                int size2 = collection.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Measurable measurable2 = (Measurable) list2.get(i3);
                    if (Intrinsics.d(LayoutIdKt.a(measurable2), "actionIcons")) {
                        Placeable c02 = measurable2.c0(Constraints.d(j2, 0, 0, 0, 0, 14, (Object) null));
                        int l2 = Constraints.l(j2) == Integer.MAX_VALUE ? Constraints.l(j2) : RangesKt.e((Constraints.l(j2) - c0.L0()) - c02.L0(), 0);
                        int size3 = collection.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Measurable measurable3 = (Measurable) list2.get(i4);
                            if (Intrinsics.d(LayoutIdKt.a(measurable3), "title")) {
                                Placeable c03 = measurable3.c0(Constraints.d(j2, 0, l2, 0, 0, 12, (Object) null));
                                int f0 = c03.f0(AlignmentLineKt.b()) != Integer.MIN_VALUE ? c03.f0(AlignmentLineKt.b()) : 0;
                                float invoke = this.f11641a.invoke();
                                int d2 = Float.isNaN(invoke) ? 0 : MathKt.d(invoke);
                                int max = Math.max(measureScope.P1(this.f11645e), c03.C0());
                                return d(measureScope, j2, Constraints.k(j2) == Integer.MAX_VALUE ? max : RangesKt.e(d2 + max, 0), max, c0, c03, c02, f0);
                            }
                            MeasureScope measureScope2 = measureScope;
                        }
                        ListUtilsKt.f("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    MeasureScope measureScope3 = measureScope;
                }
                ListUtilsKt.f("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            MeasureScope measureScope4 = measureScope;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((IntrinsicMeasurable) list.get(i4)).a0(i2);
        }
        return i3;
    }

    public final MeasureResult d(MeasureScope measureScope, long j2, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, int i4) {
        return MeasureScope.R1(measureScope, Constraints.l(j2), i2, (Map) null, new h8(placeable, i2, placeable2, placeable3, j2, measureScope, this, i4, i3), 4, (Object) null);
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        int P1 = intrinsicMeasureScope.P1(this.f11645e);
        int i3 = 0;
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).q0(i2));
            int o2 = CollectionsKt.o(list);
            int i4 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i4)).q0(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == o2) {
                        break;
                    }
                    i4++;
                }
            }
            num = valueOf;
        }
        if (num != null) {
            i3 = num.intValue();
        }
        return Math.max(P1, i3);
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((IntrinsicMeasurable) list.get(i4)).Z(i2);
        }
        return i3;
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        int P1 = intrinsicMeasureScope.P1(this.f11645e);
        int i3 = 0;
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).C(i2));
            int o2 = CollectionsKt.o(list);
            int i4 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i4)).C(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == o2) {
                        break;
                    }
                    i4++;
                }
            }
            num = valueOf;
        }
        if (num != null) {
            i3 = num.intValue();
        }
        return Math.max(P1, i3);
    }

    public TopAppBarMeasurePolicy(FloatProducer floatProducer, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i2, float f2) {
        this.f11641a = floatProducer;
        this.f11642b = vertical;
        this.f11643c = horizontal;
        this.f11644d = i2;
        this.f11645e = f2;
    }
}
