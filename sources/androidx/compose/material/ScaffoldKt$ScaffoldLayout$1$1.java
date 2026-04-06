package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8275A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8276B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ WindowInsets E;
    public final /* synthetic */ ScaffoldKt$ScaffoldLayout$contentPadding$1$1 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function3 H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8277z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(Function2 function2, Function2 function22, Function2 function23, int i2, boolean z2, WindowInsets windowInsets, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function24, Function3 function3) {
        super(2);
        this.f8277z = function2;
        this.f8275A = function22;
        this.f8276B = function23;
        this.C = i2;
        this.D = z2;
        this.E = windowInsets;
        this.F = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.G = function24;
        this.H = function3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0344 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0399 A[LOOP:9: B:142:0x0397->B:143:0x0399, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0264 A[LOOP:7: B:94:0x0262->B:95:0x0264, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x027c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.layout.MeasureResult b(androidx.compose.ui.layout.SubcomposeMeasureScope r29, long r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            int r2 = androidx.compose.ui.unit.Constraints.l(r30)
            int r15 = androidx.compose.ui.unit.Constraints.k(r30)
            r9 = 10
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r30
            long r3 = androidx.compose.ui.unit.Constraints.d(r3, r5, r6, r7, r8, r9, r10)
            androidx.compose.material.ScaffoldLayoutContent r5 = androidx.compose.material.ScaffoldLayoutContent.TopBar
            kotlin.jvm.functions.Function2 r6 = r0.f8277z
            java.util.List r5 = r1.j0(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.size()
            r6.<init>(r7)
            int r7 = r5.size()
            r9 = r8
        L_0x002f:
            if (r9 >= r7) goto L_0x0041
            java.lang.Object r10 = r5.get(r9)
            androidx.compose.ui.layout.Measurable r10 = (androidx.compose.ui.layout.Measurable) r10
            androidx.compose.ui.layout.Placeable r10 = r10.c0(r3)
            r6.add(r10)
            int r9 = r9 + 1
            goto L_0x002f
        L_0x0041:
            boolean r5 = r6.isEmpty()
            r9 = 1
            if (r5 == 0) goto L_0x004a
            r5 = 0
            goto L_0x0070
        L_0x004a:
            java.lang.Object r5 = r6.get(r8)
            r10 = r5
            androidx.compose.ui.layout.Placeable r10 = (androidx.compose.ui.layout.Placeable) r10
            int r10 = r10.C0()
            int r11 = kotlin.collections.CollectionsKt.o(r6)
            if (r9 > r11) goto L_0x0070
            r12 = r9
        L_0x005c:
            java.lang.Object r13 = r6.get(r12)
            r14 = r13
            androidx.compose.ui.layout.Placeable r14 = (androidx.compose.ui.layout.Placeable) r14
            int r14 = r14.C0()
            if (r10 >= r14) goto L_0x006b
            r5 = r13
            r10 = r14
        L_0x006b:
            if (r12 == r11) goto L_0x0070
            int r12 = r12 + 1
            goto L_0x005c
        L_0x0070:
            androidx.compose.ui.layout.Placeable r5 = (androidx.compose.ui.layout.Placeable) r5
            if (r5 == 0) goto L_0x007a
            int r5 = r5.C0()
            r10 = r5
            goto L_0x007b
        L_0x007a:
            r10 = r8
        L_0x007b:
            androidx.compose.material.ScaffoldLayoutContent r5 = androidx.compose.material.ScaffoldLayoutContent.Snackbar
            kotlin.jvm.functions.Function2 r11 = r0.f8275A
            java.util.List r5 = r1.j0(r5, r11)
            androidx.compose.foundation.layout.WindowInsets r11 = r0.E
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r5.size()
            r12.<init>(r13)
            int r13 = r5.size()
            r14 = r8
        L_0x0093:
            if (r14 >= r13) goto L_0x00c8
            java.lang.Object r16 = r5.get(r14)
            r7 = r16
            androidx.compose.ui.layout.Measurable r7 = (androidx.compose.ui.layout.Measurable) r7
            androidx.compose.ui.unit.LayoutDirection r9 = r29.getLayoutDirection()
            int r9 = r11.d(r1, r9)
            androidx.compose.ui.unit.LayoutDirection r8 = r29.getLayoutDirection()
            int r8 = r11.b(r1, r8)
            r17 = r5
            int r5 = r11.c(r1)
            int r9 = -r9
            int r9 = r9 - r8
            int r5 = -r5
            long r8 = androidx.compose.ui.unit.ConstraintsKt.i(r3, r9, r5)
            androidx.compose.ui.layout.Placeable r5 = r7.c0(r8)
            r12.add(r5)
            int r14 = r14 + 1
            r5 = r17
            r8 = 0
            r9 = 1
            goto L_0x0093
        L_0x00c8:
            boolean r5 = r12.isEmpty()
            if (r5 == 0) goto L_0x00d0
            r7 = 0
            goto L_0x00fb
        L_0x00d0:
            r5 = 0
            java.lang.Object r7 = r12.get(r5)
            r5 = r7
            androidx.compose.ui.layout.Placeable r5 = (androidx.compose.ui.layout.Placeable) r5
            int r5 = r5.C0()
            int r8 = kotlin.collections.CollectionsKt.o(r12)
            r9 = 1
            if (r9 > r8) goto L_0x00fb
            r9 = r7
            r7 = r5
            r5 = 1
        L_0x00e6:
            java.lang.Object r11 = r12.get(r5)
            r13 = r11
            androidx.compose.ui.layout.Placeable r13 = (androidx.compose.ui.layout.Placeable) r13
            int r13 = r13.C0()
            if (r7 >= r13) goto L_0x00f5
            r9 = r11
            r7 = r13
        L_0x00f5:
            if (r5 == r8) goto L_0x00fa
            int r5 = r5 + 1
            goto L_0x00e6
        L_0x00fa:
            r7 = r9
        L_0x00fb:
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            if (r7 == 0) goto L_0x0104
            int r5 = r7.C0()
            goto L_0x0105
        L_0x0104:
            r5 = 0
        L_0x0105:
            androidx.compose.material.ScaffoldLayoutContent r7 = androidx.compose.material.ScaffoldLayoutContent.Fab
            kotlin.jvm.functions.Function2 r8 = r0.f8276B
            java.util.List r7 = r1.j0(r7, r8)
            androidx.compose.foundation.layout.WindowInsets r8 = r0.E
            java.util.ArrayList r9 = new java.util.ArrayList
            int r11 = r7.size()
            r9.<init>(r11)
            int r11 = r7.size()
            r13 = 0
        L_0x011d:
            if (r13 >= r11) goto L_0x0156
            java.lang.Object r14 = r7.get(r13)
            androidx.compose.ui.layout.Measurable r14 = (androidx.compose.ui.layout.Measurable) r14
            r17 = r7
            androidx.compose.ui.unit.LayoutDirection r7 = r29.getLayoutDirection()
            int r7 = r8.d(r1, r7)
            r18 = r11
            androidx.compose.ui.unit.LayoutDirection r11 = r29.getLayoutDirection()
            int r11 = r8.b(r1, r11)
            r24 = r12
            int r12 = r8.c(r1)
            int r7 = -r7
            int r7 = r7 - r11
            int r11 = -r12
            long r11 = androidx.compose.ui.unit.ConstraintsKt.i(r3, r7, r11)
            androidx.compose.ui.layout.Placeable r7 = r14.c0(r11)
            r9.add(r7)
            int r13 = r13 + 1
            r7 = r17
            r11 = r18
            r12 = r24
            goto L_0x011d
        L_0x0156:
            r24 = r12
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L_0x023e
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L_0x0166
            r8 = 0
            goto L_0x0191
        L_0x0166:
            r7 = 0
            java.lang.Object r8 = r9.get(r7)
            r7 = r8
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            int r7 = r7.L0()
            int r11 = kotlin.collections.CollectionsKt.o(r9)
            r12 = 1
            if (r12 > r11) goto L_0x0191
            r12 = r8
            r8 = r7
            r7 = 1
        L_0x017c:
            java.lang.Object r13 = r9.get(r7)
            r14 = r13
            androidx.compose.ui.layout.Placeable r14 = (androidx.compose.ui.layout.Placeable) r14
            int r14 = r14.L0()
            if (r8 >= r14) goto L_0x018b
            r12 = r13
            r8 = r14
        L_0x018b:
            if (r7 == r11) goto L_0x0190
            int r7 = r7 + 1
            goto L_0x017c
        L_0x0190:
            r8 = r12
        L_0x0191:
            androidx.compose.ui.layout.Placeable r8 = (androidx.compose.ui.layout.Placeable) r8
            if (r8 == 0) goto L_0x019a
            int r7 = r8.L0()
            goto L_0x019b
        L_0x019a:
            r7 = 0
        L_0x019b:
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x01a3
            r11 = 0
            goto L_0x01d4
        L_0x01a3:
            r8 = 0
            java.lang.Object r11 = r9.get(r8)
            r8 = r11
            androidx.compose.ui.layout.Placeable r8 = (androidx.compose.ui.layout.Placeable) r8
            int r8 = r8.C0()
            int r12 = kotlin.collections.CollectionsKt.o(r9)
            r13 = 1
            if (r13 > r12) goto L_0x01d4
            r13 = r11
            r11 = r8
            r8 = 1
        L_0x01b9:
            java.lang.Object r14 = r9.get(r8)
            r17 = r14
            androidx.compose.ui.layout.Placeable r17 = (androidx.compose.ui.layout.Placeable) r17
            r18 = r13
            int r13 = r17.C0()
            if (r11 >= r13) goto L_0x01cc
            r11 = r13
            r13 = r14
            goto L_0x01ce
        L_0x01cc:
            r13 = r18
        L_0x01ce:
            if (r8 == r12) goto L_0x01d3
            int r8 = r8 + 1
            goto L_0x01b9
        L_0x01d3:
            r11 = r13
        L_0x01d4:
            androidx.compose.ui.layout.Placeable r11 = (androidx.compose.ui.layout.Placeable) r11
            if (r11 == 0) goto L_0x01dd
            int r8 = r11.C0()
            goto L_0x01de
        L_0x01dd:
            r8 = 0
        L_0x01de:
            if (r7 == 0) goto L_0x023e
            if (r8 == 0) goto L_0x023e
            int r11 = r0.C
            androidx.compose.material.FabPosition$Companion r12 = androidx.compose.material.FabPosition.f7852b
            int r13 = r12.c()
            boolean r13 = androidx.compose.material.FabPosition.f(r11, r13)
            if (r13 == 0) goto L_0x020d
            androidx.compose.ui.unit.LayoutDirection r11 = r29.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r12 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r11 != r12) goto L_0x0201
            float r11 = androidx.compose.material.ScaffoldKt.f8256b
            int r11 = r1.P1(r11)
            goto L_0x0235
        L_0x0201:
            float r11 = androidx.compose.material.ScaffoldKt.f8256b
            int r11 = r1.P1(r11)
        L_0x0209:
            int r11 = r2 - r11
            int r11 = r11 - r7
            goto L_0x0235
        L_0x020d:
            int r12 = r12.b()
            boolean r11 = androidx.compose.material.FabPosition.f(r11, r12)
            if (r11 == 0) goto L_0x0231
            androidx.compose.ui.unit.LayoutDirection r11 = r29.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r12 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r11 != r12) goto L_0x0228
            float r11 = androidx.compose.material.ScaffoldKt.f8256b
            int r11 = r1.P1(r11)
            goto L_0x0209
        L_0x0228:
            float r11 = androidx.compose.material.ScaffoldKt.f8256b
            int r11 = r1.P1(r11)
            goto L_0x0235
        L_0x0231:
            int r11 = r2 - r7
            int r11 = r11 / 2
        L_0x0235:
            androidx.compose.material.FabPlacement r12 = new androidx.compose.material.FabPlacement
            boolean r13 = r0.D
            r12.<init>(r13, r11, r7, r8)
            r13 = r12
            goto L_0x023f
        L_0x023e:
            r13 = 0
        L_0x023f:
            androidx.compose.material.ScaffoldLayoutContent r7 = androidx.compose.material.ScaffoldLayoutContent.BottomBar
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1 r8 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
            kotlin.jvm.functions.Function2 r11 = r0.G
            r8.<init>(r13, r11)
            r11 = 424088350(0x1947131e, float:1.02919196E-23)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r11, r12, r8)
            java.util.List r7 = r1.j0(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r11 = r7.size()
            r8.<init>(r11)
            int r11 = r7.size()
            r12 = 0
        L_0x0262:
            if (r12 >= r11) goto L_0x0274
            java.lang.Object r14 = r7.get(r12)
            androidx.compose.ui.layout.Measurable r14 = (androidx.compose.ui.layout.Measurable) r14
            androidx.compose.ui.layout.Placeable r14 = r14.c0(r3)
            r8.add(r14)
            int r12 = r12 + 1
            goto L_0x0262
        L_0x0274:
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x027c
            r11 = 0
            goto L_0x02ad
        L_0x027c:
            r7 = 0
            java.lang.Object r11 = r8.get(r7)
            r7 = r11
            androidx.compose.ui.layout.Placeable r7 = (androidx.compose.ui.layout.Placeable) r7
            int r7 = r7.C0()
            int r12 = kotlin.collections.CollectionsKt.o(r8)
            r14 = 1
            if (r14 > r12) goto L_0x02ad
            r14 = r11
            r11 = 1
        L_0x0291:
            java.lang.Object r17 = r8.get(r11)
            r18 = r17
            androidx.compose.ui.layout.Placeable r18 = (androidx.compose.ui.layout.Placeable) r18
            r19 = r14
            int r14 = r18.C0()
            if (r7 >= r14) goto L_0x02a5
            r7 = r14
            r14 = r17
            goto L_0x02a7
        L_0x02a5:
            r14 = r19
        L_0x02a7:
            if (r11 == r12) goto L_0x02ac
            int r11 = r11 + 1
            goto L_0x0291
        L_0x02ac:
            r11 = r14
        L_0x02ad:
            androidx.compose.ui.layout.Placeable r11 = (androidx.compose.ui.layout.Placeable) r11
            if (r11 == 0) goto L_0x02bb
            int r7 = r11.C0()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12 = r7
            goto L_0x02bc
        L_0x02bb:
            r12 = 0
        L_0x02bc:
            if (r13 == 0) goto L_0x02fd
            androidx.compose.foundation.layout.WindowInsets r7 = r0.E
            boolean r11 = r0.D
            if (r12 != 0) goto L_0x02d7
            int r11 = r13.a()
            float r14 = androidx.compose.material.ScaffoldKt.f8256b
            int r14 = r1.P1(r14)
            int r11 = r11 + r14
            int r7 = r7.c(r1)
            int r11 = r11 + r7
            goto L_0x02f7
        L_0x02d7:
            if (r11 == 0) goto L_0x02e5
            int r7 = r12.intValue()
            int r11 = r13.a()
            int r11 = r11 / 2
        L_0x02e3:
            int r11 = r11 + r7
            goto L_0x02f7
        L_0x02e5:
            int r7 = r12.intValue()
            int r11 = r13.a()
            int r7 = r7 + r11
            float r11 = androidx.compose.material.ScaffoldKt.f8256b
            int r11 = r1.P1(r11)
            goto L_0x02e3
        L_0x02f7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r14 = r7
            goto L_0x02fe
        L_0x02fd:
            r14 = 0
        L_0x02fe:
            if (r5 == 0) goto L_0x0317
            if (r14 == 0) goto L_0x0307
            int r7 = r14.intValue()
            goto L_0x0314
        L_0x0307:
            if (r12 == 0) goto L_0x030e
            int r7 = r12.intValue()
            goto L_0x0314
        L_0x030e:
            androidx.compose.foundation.layout.WindowInsets r7 = r0.E
            int r7 = r7.c(r1)
        L_0x0314:
            int r5 = r5 + r7
            r11 = r5
            goto L_0x0318
        L_0x0317:
            r11 = 0
        L_0x0318:
            androidx.compose.foundation.layout.WindowInsets r5 = r0.E
            androidx.compose.foundation.layout.PaddingValues r5 = androidx.compose.foundation.layout.WindowInsetsKt.h(r5, r1)
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 r7 = r0.F
            boolean r17 = r6.isEmpty()
            if (r17 == 0) goto L_0x0332
            float r17 = r5.d()
            r25 = r2
            r30 = r14
            r14 = r17
            r2 = 0
            goto L_0x033e
        L_0x0332:
            r25 = r2
            r30 = r14
            r2 = 0
            float r14 = (float) r2
            float r17 = androidx.compose.ui.unit.Dp.m(r14)
            r14 = r17
        L_0x033e:
            boolean r16 = r8.isEmpty()
            if (r16 != 0) goto L_0x0352
            if (r12 != 0) goto L_0x0347
            goto L_0x0352
        L_0x0347:
            int r2 = r12.intValue()
            float r2 = r1.D(r2)
        L_0x034f:
            r26 = r13
            goto L_0x0357
        L_0x0352:
            float r2 = r5.a()
            goto L_0x034f
        L_0x0357:
            androidx.compose.ui.unit.LayoutDirection r13 = r29.getLayoutDirection()
            float r13 = androidx.compose.foundation.layout.PaddingKt.g(r5, r13)
            r27 = r12
            androidx.compose.ui.unit.LayoutDirection r12 = r29.getLayoutDirection()
            float r5 = androidx.compose.foundation.layout.PaddingKt.f(r5, r12)
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.d(r13, r14, r5, r2)
            r7.f(r2)
            int r2 = r15 - r10
            androidx.compose.material.ScaffoldLayoutContent r5 = androidx.compose.material.ScaffoldLayoutContent.MainContent
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1 r7 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
            kotlin.jvm.functions.Function3 r12 = r0.H
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 r13 = r0.F
            r7.<init>(r12, r13)
            r12 = -570781649(0xffffffffddfa902f, float:-2.25687282E18)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r12, r13, r7)
            java.util.List r5 = r1.j0(r5, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r12 = r5.size()
            r7.<init>(r12)
            int r12 = r5.size()
            r13 = 0
        L_0x0397:
            if (r13 >= r12) goto L_0x03bf
            java.lang.Object r14 = r5.get(r13)
            androidx.compose.ui.layout.Measurable r14 = (androidx.compose.ui.layout.Measurable) r14
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r3
            r21 = r2
            long r0 = androidx.compose.ui.unit.Constraints.d(r16, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.layout.Placeable r0 = r14.c0(r0)
            r7.add(r0)
            int r13 = r13 + 1
            r0 = r28
            r1 = r29
            goto L_0x0397
        L_0x03bf:
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1 r0 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1
            r3 = r0
            r4 = r7
            r5 = r6
            r6 = r24
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r15
            r12 = r27
            r13 = r26
            r14 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r29
            r2 = r25
            r3 = r15
            r5 = r0
            androidx.compose.ui.layout.MeasureResult r0 = androidx.compose.ui.layout.MeasureScope.R1(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.b(androidx.compose.ui.layout.SubcomposeMeasureScope, long):androidx.compose.ui.layout.MeasureResult");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((SubcomposeMeasureScope) obj, ((Constraints) obj2).r());
    }
}
