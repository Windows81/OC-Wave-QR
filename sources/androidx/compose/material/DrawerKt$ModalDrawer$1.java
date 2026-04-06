package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class DrawerKt$ModalDrawer$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7744A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f7745B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function3 I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7746z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z2, CoroutineScope coroutineScope, long j2, Shape shape, long j3, long j4, float f2, Function2 function2, Function3 function3) {
        super(3);
        this.f7746z = drawerState;
        this.f7744A = z2;
        this.f7745B = coroutineScope;
        this.C = j2;
        this.D = shape;
        this.E = j3;
        this.F = j4;
        this.G = f2;
        this.H = function2;
        this.I = function3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.layout.BoxWithConstraintsScope r34, androidx.compose.runtime.Composer r35, int r36) {
        /*
            r33 = this;
            r0 = r33
            r13 = r35
            r8 = 1
            r9 = 6
            r1 = r36 & 6
            if (r1 != 0) goto L_0x0018
            r1 = r34
            boolean r2 = r13.W(r1)
            if (r2 == 0) goto L_0x0014
            r2 = 4
            goto L_0x0015
        L_0x0014:
            r2 = 2
        L_0x0015:
            r2 = r36 | r2
            goto L_0x001c
        L_0x0018:
            r1 = r34
            r2 = r36
        L_0x001c:
            r3 = r2 & 19
            r4 = 18
            r10 = 0
            if (r3 == r4) goto L_0x0025
            r3 = r8
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r4 = r2 & 1
            boolean r3 = r13.E(r3, r4)
            if (r3 == 0) goto L_0x02f3
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x003d
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:468)"
            r5 = 816674999(0x30ad78b7, float:1.2621716E-9)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x003d:
            long r11 = r34.d()
            boolean r1 = androidx.compose.ui.unit.Constraints.h(r11)
            if (r1 == 0) goto L_0x02eb
            int r1 = androidx.compose.ui.unit.Constraints.l(r11)
            float r1 = (float) r1
            float r1 = -r1
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r13.C(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.material.DrawerState r3 = r0.f7746z
            boolean r3 = r13.W(r3)
            boolean r4 = r13.W(r2)
            r3 = r3 | r4
            boolean r4 = r13.h(r1)
            r3 = r3 | r4
            androidx.compose.material.DrawerState r4 = r0.f7746z
            java.lang.Object r5 = r35.g()
            r6 = 0
            if (r3 != 0) goto L_0x0078
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0080
        L_0x0078:
            androidx.compose.material.DrawerKt$ModalDrawer$1$1$1 r5 = new androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
            r5.<init>(r4, r2, r1, r6)
            r13.N(r5)
        L_0x0080:
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            androidx.compose.runtime.EffectsKt.h(r5, r13, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r2 = r13.C(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r2 != r3) goto L_0x0094
            r18 = r8
            goto L_0x0096
        L_0x0094:
            r18 = r10
        L_0x0096:
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material.DrawerState r2 = r0.f7746z
            androidx.compose.material.AnchoredDraggableState r15 = r2.c()
            androidx.compose.foundation.gestures.Orientation r16 = androidx.compose.foundation.gestures.Orientation.Horizontal
            boolean r2 = r0.f7744A
            r21 = 48
            r22 = 0
            r19 = 0
            r20 = 0
            r14 = r7
            r17 = r2
            androidx.compose.ui.Modifier r2 = androidx.compose.material.AnchoredDraggableKt.e(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.material.DrawerState r14 = r0.f7746z
            boolean r3 = r0.f7744A
            kotlinx.coroutines.CoroutineScope r15 = r0.f7745B
            long r4 = r0.C
            androidx.compose.ui.graphics.Shape r8 = r0.D
            r36 = r7
            long r6 = r0.E
            r18 = r6
            r17 = r8
            long r7 = r0.F
            float r6 = r0.G
            kotlin.jvm.functions.Function2 r9 = r0.H
            r21 = r7
            kotlin.jvm.functions.Function3 r7 = r0.I
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r8.o()
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r0, r10)
            int r23 = androidx.compose.runtime.ComposablesKt.a(r13, r10)
            androidx.compose.runtime.CompositionLocalMap r10 = r35.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r13, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r24 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r25 = r6
            kotlin.jvm.functions.Function0 r6 = r24.a()
            androidx.compose.runtime.Applier r26 = r35.v()
            if (r26 != 0) goto L_0x00f4
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00f4:
            r35.s()
            boolean r26 = r35.n()
            if (r26 == 0) goto L_0x0101
            r13.y(r6)
            goto L_0x0104
        L_0x0101:
            r35.K()
        L_0x0104:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r35)
            r26 = r7
            kotlin.jvm.functions.Function2 r7 = r24.c()
            androidx.compose.runtime.Updater.g(r6, r0, r7)
            kotlin.jvm.functions.Function2 r0 = r24.e()
            androidx.compose.runtime.Updater.g(r6, r10, r0)
            kotlin.jvm.functions.Function2 r0 = r24.b()
            boolean r7 = r6.n()
            if (r7 != 0) goto L_0x0130
            java.lang.Object r7 = r6.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r10)
            if (r7 != 0) goto L_0x013e
        L_0x0130:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r23)
            r6.N(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r23)
            r6.A(r7, r0)
        L_0x013e:
            kotlin.jvm.functions.Function2 r0 = r24.d()
            androidx.compose.runtime.Updater.g(r6, r2, r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Alignment r0 = r8.o()
            r2 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r0, r2)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r13, r2)
            androidx.compose.runtime.CompositionLocalMap r2 = r35.I()
            r7 = r36
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.ComposedModifierKt.e(r13, r7)
            kotlin.jvm.functions.Function0 r10 = r24.a()
            androidx.compose.runtime.Applier r23 = r35.v()
            if (r23 != 0) goto L_0x016b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x016b:
            r35.s()
            boolean r23 = r35.n()
            if (r23 == 0) goto L_0x0178
            r13.y(r10)
            goto L_0x017b
        L_0x0178:
            r35.K()
        L_0x017b:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r35)
            r36 = r7
            kotlin.jvm.functions.Function2 r7 = r24.c()
            androidx.compose.runtime.Updater.g(r10, r0, r7)
            kotlin.jvm.functions.Function2 r0 = r24.e()
            androidx.compose.runtime.Updater.g(r10, r2, r0)
            kotlin.jvm.functions.Function2 r0 = r24.b()
            boolean r2 = r10.n()
            if (r2 != 0) goto L_0x01a7
            java.lang.Object r2 = r10.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r7)
            if (r2 != 0) goto L_0x01b5
        L_0x01a7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r10.N(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r10.A(r2, r0)
        L_0x01b5:
            kotlin.jvm.functions.Function2 r0 = r24.d()
            androidx.compose.runtime.Updater.g(r10, r8, r0)
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r9.m(r13, r2)
            r35.T()
            boolean r0 = r14.e()
            boolean r2 = r13.d(r3)
            boolean r6 = r13.W(r14)
            r2 = r2 | r6
            boolean r6 = r13.l(r15)
            r2 = r2 | r6
            java.lang.Object r6 = r35.g()
            if (r2 != 0) goto L_0x01e7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x01ef
        L_0x01e7:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1 r6 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1
            r6.<init>(r3, r14, r15)
            r13.N(r6)
        L_0x01ef:
            r2 = r6
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            boolean r3 = r13.h(r1)
            boolean r6 = r13.W(r14)
            r3 = r3 | r6
            java.lang.Object r6 = r35.g()
            if (r3 != 0) goto L_0x0209
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0212
        L_0x0209:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1 r6 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
            r3 = 0
            r6.<init>(r1, r3, r14)
            r13.N(r6)
        L_0x0212:
            r3 = r6
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r7 = 0
            r1 = r0
            r8 = r18
            r0 = r25
            r6 = r35
            r10 = r36
            r18 = r21
            r0 = r26
            androidx.compose.material.DrawerKt.f(r1, r2, r3, r4, r6, r7)
            androidx.compose.material.Strings$Companion r1 = androidx.compose.material.Strings.f8507b
            int r1 = r1.e()
            r2 = 6
            java.lang.String r1 = androidx.compose.material.Strings_androidKt.a(r1, r13, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r13.C(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            int r3 = androidx.compose.ui.unit.Constraints.n(r11)
            float r3 = r2.D(r3)
            int r4 = androidx.compose.ui.unit.Constraints.m(r11)
            float r4 = r2.D(r4)
            int r5 = androidx.compose.ui.unit.Constraints.l(r11)
            float r5 = r2.D(r5)
            int r6 = androidx.compose.ui.unit.Constraints.k(r11)
            float r2 = r2.D(r6)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.w(r10, r3, r4, r5, r2)
            boolean r3 = r13.W(r14)
            java.lang.Object r4 = r35.g()
            if (r3 != 0) goto L_0x0271
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0279
        L_0x0271:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1 r4 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
            r4.<init>(r14)
            r13.N(r4)
        L_0x0279:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r26 = androidx.compose.foundation.layout.OffsetKt.a(r2, r4)
            float r29 = androidx.compose.material.DrawerKt.f7706a
            r31 = 11
            r32 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r26, r27, r28, r29, r30, r31, r32)
            boolean r3 = r13.W(r1)
            boolean r4 = r13.W(r14)
            r3 = r3 | r4
            boolean r4 = r13.l(r15)
            r3 = r3 | r4
            java.lang.Object r4 = r35.g()
            if (r3 != 0) goto L_0x02ad
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x02b5
        L_0x02ad:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1 r4 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1
            r4.<init>(r1, r14, r15)
            r13.N(r4)
        L_0x02b5:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r1 = 0
            r3 = 0
            r5 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r3, r4, r5, r1)
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$7 r2 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
            r2.<init>(r0)
            r0 = 54
            r3 = -1941234439(0xffffffff8c4b1cf9, float:-1.564727E-31)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r5, r2, r13, r0)
            r11 = 1572864(0x180000, float:2.204052E-39)
            r12 = 16
            r7 = 0
            r2 = r17
            r3 = r8
            r5 = r18
            r8 = r25
            r9 = r0
            r10 = r35
            androidx.compose.material.SurfaceKt.a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r35.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02f6
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x02f6
        L_0x02eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Drawer shouldn't have infinite width"
            r0.<init>(r1)
            throw r0
        L_0x02f3:
            r35.B()
        L_0x02f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ModalDrawer$1.b(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
