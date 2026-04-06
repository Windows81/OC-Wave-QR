package androidx.compose.material;

import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 implements MultiContentMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function0 f7391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7392b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f7393c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f7394d;

    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(Function0 function0, int i2, float f2, BottomSheetState bottomSheetState) {
        this.f7391a = function0;
        this.f7392b = i2;
        this.f7393c = f2;
        this.f7394d = bottomSheetState;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.ui.layout.Placeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.layout.MeasureResult b(androidx.compose.ui.layout.MeasureScope r29, java.util.List r30, long r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = 1
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            r6 = 2
            java.lang.Object r6 = r1.get(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 3
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            r8 = 4
            java.lang.Object r1 = r1.get(r8)
            java.util.List r1 = (java.util.List) r1
            int r26 = androidx.compose.ui.unit.Constraints.l(r31)
            int r27 = androidx.compose.ui.unit.Constraints.k(r31)
            r14 = 10
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r31
            long r8 = androidx.compose.ui.unit.Constraints.d(r8, r10, r11, r12, r13, r14, r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r10 = r6.size()
            r15.<init>(r10)
            int r10 = r6.size()
            r11 = r2
        L_0x004a:
            if (r11 >= r10) goto L_0x005c
            java.lang.Object r12 = r6.get(r11)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            androidx.compose.ui.layout.Placeable r12 = r12.c0(r8)
            r15.add(r12)
            int r11 = r11 + 1
            goto L_0x004a
        L_0x005c:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r10 = r3.size()
            r6.<init>(r10)
            int r10 = r3.size()
            r11 = r2
        L_0x006a:
            if (r11 >= r10) goto L_0x007c
            java.lang.Object r12 = r3.get(r11)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            androidx.compose.ui.layout.Placeable r12 = r12.c0(r8)
            r6.add(r12)
            int r11 = r11 + 1
            goto L_0x006a
        L_0x007c:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0084
            r3 = 0
            goto L_0x00ab
        L_0x0084:
            java.lang.Object r3 = r6.get(r2)
            r11 = r3
            androidx.compose.ui.layout.Placeable r11 = (androidx.compose.ui.layout.Placeable) r11
            int r11 = r11.C0()
            int r12 = kotlin.collections.CollectionsKt.o(r6)
            if (r4 > r12) goto L_0x00ab
            r13 = r4
        L_0x0096:
            java.lang.Object r14 = r6.get(r13)
            r16 = r14
            androidx.compose.ui.layout.Placeable r16 = (androidx.compose.ui.layout.Placeable) r16
            int r10 = r16.C0()
            if (r11 >= r10) goto L_0x00a6
            r11 = r10
            r3 = r14
        L_0x00a6:
            if (r13 == r12) goto L_0x00ab
            int r13 = r13 + 1
            goto L_0x0096
        L_0x00ab:
            androidx.compose.ui.layout.Placeable r3 = (androidx.compose.ui.layout.Placeable) r3
            if (r3 == 0) goto L_0x00b6
            int r3 = r3.C0()
            r25 = r3
            goto L_0x00b8
        L_0x00b6:
            r25 = r2
        L_0x00b8:
            int r21 = r27 - r25
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r8
            long r10 = androidx.compose.ui.unit.Constraints.d(r16, r18, r19, r20, r21, r22, r23)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r12 = r5.size()
            r3.<init>(r12)
            int r12 = r5.size()
            r13 = r2
        L_0x00d8:
            if (r13 >= r12) goto L_0x00ea
            java.lang.Object r14 = r5.get(r13)
            androidx.compose.ui.layout.Measurable r14 = (androidx.compose.ui.layout.Measurable) r14
            androidx.compose.ui.layout.Placeable r14 = r14.c0(r10)
            r3.add(r14)
            int r13 = r13 + 1
            goto L_0x00d8
        L_0x00ea:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = r7.size()
            r5.<init>(r10)
            int r10 = r7.size()
            r11 = r2
        L_0x00f8:
            if (r11 >= r10) goto L_0x010a
            java.lang.Object r12 = r7.get(r11)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            androidx.compose.ui.layout.Placeable r12 = r12.c0(r8)
            r5.add(r12)
            int r11 = r11 + 1
            goto L_0x00f8
        L_0x010a:
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x0112
            r7 = 0
            goto L_0x0138
        L_0x0112:
            java.lang.Object r7 = r5.get(r2)
            r10 = r7
            androidx.compose.ui.layout.Placeable r10 = (androidx.compose.ui.layout.Placeable) r10
            int r10 = r10.L0()
            int r11 = kotlin.collections.CollectionsKt.o(r5)
            if (r4 > r11) goto L_0x0138
            r12 = r4
        L_0x0124:
            java.lang.Object r13 = r5.get(r12)
            r14 = r13
            androidx.compose.ui.layout.Placeable r14 = (androidx.compose.ui.layout.Placeable) r14
            int r14 = r14.L0()
            if (r10 >= r14) goto L_0x0133
            r7 = r13
            r10 = r14
        L_0x0133:
            if (r12 == r11) goto L_0x0138
            int r12 = r12 + 1
            goto L_0x0124
        L_0x0138:
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            if (r7 == 0) goto L_0x0142
            int r7 = r7.L0()
            r13 = r7
            goto L_0x0143
        L_0x0142:
            r13 = r2
        L_0x0143:
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x014b
            r7 = 0
            goto L_0x0173
        L_0x014b:
            java.lang.Object r7 = r5.get(r2)
            r10 = r7
            androidx.compose.ui.layout.Placeable r10 = (androidx.compose.ui.layout.Placeable) r10
            int r10 = r10.C0()
            int r11 = kotlin.collections.CollectionsKt.o(r5)
            if (r4 > r11) goto L_0x0173
            r12 = r4
        L_0x015d:
            java.lang.Object r14 = r5.get(r12)
            r16 = r14
            androidx.compose.ui.layout.Placeable r16 = (androidx.compose.ui.layout.Placeable) r16
            int r4 = r16.C0()
            if (r10 >= r4) goto L_0x016d
            r10 = r4
            r7 = r14
        L_0x016d:
            if (r12 == r11) goto L_0x0173
            int r12 = r12 + 1
            r4 = 1
            goto L_0x015d
        L_0x0173:
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            if (r7 == 0) goto L_0x017c
            int r4 = r7.C0()
            goto L_0x017d
        L_0x017c:
            r4 = r2
        L_0x017d:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r10 = r1.size()
            r7.<init>(r10)
            int r10 = r1.size()
            r11 = r2
        L_0x018b:
            if (r11 >= r10) goto L_0x019d
            java.lang.Object r12 = r1.get(r11)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            androidx.compose.ui.layout.Placeable r12 = r12.c0(r8)
            r7.add(r12)
            int r11 = r11 + 1
            goto L_0x018b
        L_0x019d:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x01a5
            r1 = 0
            goto L_0x01cc
        L_0x01a5:
            java.lang.Object r1 = r7.get(r2)
            r8 = r1
            androidx.compose.ui.layout.Placeable r8 = (androidx.compose.ui.layout.Placeable) r8
            int r8 = r8.L0()
            int r9 = kotlin.collections.CollectionsKt.o(r7)
            r10 = 1
            if (r10 > r9) goto L_0x01cc
            r10 = 1
        L_0x01b8:
            java.lang.Object r11 = r7.get(r10)
            r12 = r11
            androidx.compose.ui.layout.Placeable r12 = (androidx.compose.ui.layout.Placeable) r12
            int r12 = r12.L0()
            if (r8 >= r12) goto L_0x01c7
            r1 = r11
            r8 = r12
        L_0x01c7:
            if (r10 == r9) goto L_0x01cc
            int r10 = r10 + 1
            goto L_0x01b8
        L_0x01cc:
            androidx.compose.ui.layout.Placeable r1 = (androidx.compose.ui.layout.Placeable) r1
            if (r1 == 0) goto L_0x01d7
            int r1 = r1.L0()
            r16 = r1
            goto L_0x01d9
        L_0x01d7:
            r16 = r2
        L_0x01d9:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x01e1
            r10 = 0
            goto L_0x0208
        L_0x01e1:
            java.lang.Object r1 = r7.get(r2)
            r8 = r1
            androidx.compose.ui.layout.Placeable r8 = (androidx.compose.ui.layout.Placeable) r8
            int r8 = r8.C0()
            int r9 = kotlin.collections.CollectionsKt.o(r7)
            r10 = 1
            if (r10 > r9) goto L_0x0207
        L_0x01f3:
            java.lang.Object r11 = r7.get(r10)
            r12 = r11
            androidx.compose.ui.layout.Placeable r12 = (androidx.compose.ui.layout.Placeable) r12
            int r12 = r12.C0()
            if (r8 >= r12) goto L_0x0202
            r1 = r11
            r8 = r12
        L_0x0202:
            if (r10 == r9) goto L_0x0207
            int r10 = r10 + 1
            goto L_0x01f3
        L_0x0207:
            r10 = r1
        L_0x0208:
            androidx.compose.ui.layout.Placeable r10 = (androidx.compose.ui.layout.Placeable) r10
            if (r10 == 0) goto L_0x0210
            int r2 = r10.C0()
        L_0x0210:
            r18 = r2
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1 r1 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1
            r8 = r1
            kotlin.jvm.functions.Function0 r9 = r0.f7391a
            int r10 = r0.f7392b
            float r14 = r0.f7393c
            androidx.compose.material.BottomSheetState r2 = r0.f7394d
            r17 = r2
            r11 = r29
            r12 = r26
            r2 = r15
            r15 = r4
            r19 = r27
            r20 = r3
            r21 = r6
            r22 = r2
            r23 = r5
            r24 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r13 = 4
            r14 = 0
            r11 = 0
            r8 = r29
            r9 = r26
            r10 = r27
            r12 = r1
            androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.ui.layout.MeasureScope.R1(r8, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.b(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }
}
