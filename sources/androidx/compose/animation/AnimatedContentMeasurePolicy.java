package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final AnimatedContentTransitionScopeImpl f2048a;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.f2048a = animatedContentTransitionScopeImpl;
    }

    public final AnimatedContentTransitionScopeImpl a() {
        return this.f2048a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: androidx.compose.animation.AnimatedContentTransitionScopeImpl$ChildData} */
    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r16v1, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r16v9 */
    /* JADX WARNING: type inference failed for: r16v11 */
    /* JADX WARNING: type inference failed for: r16v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.MeasureResult b(androidx.compose.ui.layout.MeasureScope r27, java.util.List r28, long r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            r2 = r29
            r4 = 1
            int r5 = r28.size()
            androidx.compose.ui.layout.Placeable[] r6 = new androidx.compose.ui.layout.Placeable[r5]
            androidx.compose.ui.unit.IntSize$Companion r7 = androidx.compose.ui.unit.IntSize.f19170b
            long r7 = r7.a()
            r9 = r1
            java.util.Collection r9 = (java.util.Collection) r9
            int r10 = r9.size()
            r12 = 0
        L_0x001b:
            r15 = 32
            r16 = 0
            if (r12 >= r10) goto L_0x0067
            java.lang.Object r17 = r1.get(r12)
            r11 = r17
            androidx.compose.ui.layout.Measurable r11 = (androidx.compose.ui.layout.Measurable) r11
            java.lang.Object r13 = r11.t()
            boolean r14 = r13 instanceof androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData
            if (r14 == 0) goto L_0x0035
            r16 = r13
            androidx.compose.animation.AnimatedContentTransitionScopeImpl$ChildData r16 = (androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData) r16
        L_0x0035:
            if (r16 == 0) goto L_0x0060
            boolean r13 = r16.a()
            if (r13 != r4) goto L_0x0060
            androidx.compose.ui.layout.Placeable r7 = r11.c0(r2)
            int r8 = r7.L0()
            int r11 = r7.C0()
            long r13 = (long) r8
            long r13 = r13 << r15
            r18 = r5
            long r4 = (long) r11
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r15
            long r4 = r4 | r13
            long r4 = androidx.compose.ui.unit.IntSize.c(r4)
            kotlin.Unit r8 = kotlin.Unit.f40552a
            r6[r12] = r7
            r7 = r4
        L_0x005e:
            r4 = 1
            goto L_0x0063
        L_0x0060:
            r18 = r5
            goto L_0x005e
        L_0x0063:
            int r12 = r12 + r4
            r5 = r18
            goto L_0x001b
        L_0x0067:
            r18 = r5
            int r4 = r9.size()
            r5 = 0
        L_0x006e:
            if (r5 >= r4) goto L_0x0083
            java.lang.Object r9 = r1.get(r5)
            androidx.compose.ui.layout.Measurable r9 = (androidx.compose.ui.layout.Measurable) r9
            r10 = r6[r5]
            if (r10 != 0) goto L_0x0080
            androidx.compose.ui.layout.Placeable r9 = r9.c0(r2)
            r6[r5] = r9
        L_0x0080:
            r9 = 1
            int r5 = r5 + r9
            goto L_0x006e
        L_0x0083:
            boolean r1 = r27.w1()
            if (r1 == 0) goto L_0x008d
            long r1 = r7 >> r15
            int r1 = (int) r1
            goto L_0x00cf
        L_0x008d:
            if (r18 != 0) goto L_0x0092
            r2 = r16
            goto L_0x00c7
        L_0x0092:
            r1 = 0
            r2 = r6[r1]
            int r1 = kotlin.collections.ArraysKt.m0(r6)
            if (r1 != 0) goto L_0x009c
            goto L_0x00c7
        L_0x009c:
            if (r2 == 0) goto L_0x00a3
            int r3 = r2.L0()
            goto L_0x00a4
        L_0x00a3:
            r3 = 0
        L_0x00a4:
            kotlin.ranges.IntRange r4 = new kotlin.ranges.IntRange
            r5 = 1
            r4.<init>(r5, r1)
            kotlin.collections.IntIterator r1 = r4.iterator()
        L_0x00ae:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00c7
            int r4 = r1.b()
            r4 = r6[r4]
            if (r4 == 0) goto L_0x00c1
            int r5 = r4.L0()
            goto L_0x00c2
        L_0x00c1:
            r5 = 0
        L_0x00c2:
            if (r3 >= r5) goto L_0x00ae
            r2 = r4
            r3 = r5
            goto L_0x00ae
        L_0x00c7:
            if (r2 == 0) goto L_0x00ce
            int r1 = r2.L0()
            goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            boolean r2 = r27.w1()
            if (r2 == 0) goto L_0x00de
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r7 & r2
            int r11 = (int) r4
            goto L_0x0120
        L_0x00de:
            if (r18 != 0) goto L_0x00e2
            r2 = 0
            goto L_0x0118
        L_0x00e2:
            r2 = 0
            r16 = r6[r2]
            int r3 = kotlin.collections.ArraysKt.m0(r6)
            if (r3 != 0) goto L_0x00ec
            goto L_0x0118
        L_0x00ec:
            if (r16 == 0) goto L_0x00f3
            int r4 = r16.C0()
            goto L_0x00f4
        L_0x00f3:
            r4 = r2
        L_0x00f4:
            kotlin.ranges.IntRange r5 = new kotlin.ranges.IntRange
            r7 = 1
            r5.<init>(r7, r3)
            kotlin.collections.IntIterator r3 = r5.iterator()
        L_0x00fe:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0118
            int r5 = r3.b()
            r5 = r6[r5]
            if (r5 == 0) goto L_0x0111
            int r7 = r5.C0()
            goto L_0x0112
        L_0x0111:
            r7 = r2
        L_0x0112:
            if (r4 >= r7) goto L_0x00fe
            r16 = r5
            r4 = r7
            goto L_0x00fe
        L_0x0118:
            if (r16 == 0) goto L_0x011f
            int r11 = r16.C0()
            goto L_0x0120
        L_0x011f:
            r11 = r2
        L_0x0120:
            boolean r2 = r27.w1()
            if (r2 != 0) goto L_0x0139
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r2 = r0.f2048a
            long r3 = (long) r1
            long r3 = r3 << r15
            long r7 = (long) r11
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            long r3 = r3 | r7
            long r3 = androidx.compose.ui.unit.IntSize.c(r3)
            r2.s(r3)
        L_0x0139:
            androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3 r2 = new androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            r2.<init>(r6, r0, r1, r11)
            r24 = 4
            r25 = 0
            r22 = 0
            r19 = r27
            r20 = r1
            r21 = r11
            r23 = r2
            androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.ui.layout.MeasureScope.R1(r19, r20, r21, r22, r23, r24, r25)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentMeasurePolicy.b(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).a0(i2));
            int o2 = CollectionsKt.o(list);
            int i3 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).a0(i2));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == o2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).q0(i2));
            int o2 = CollectionsKt.o(list);
            int i3 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).q0(i2));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == o2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).Z(i2));
            int o2 = CollectionsKt.o(list);
            int i3 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).Z(i2));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == o2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).C(i2));
            int o2 = CollectionsKt.o(list);
            int i3 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).C(i2));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == o2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
