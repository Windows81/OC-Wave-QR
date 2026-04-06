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
public final class DrawerKt$BottomDrawer$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f7710A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7711B;
    public final /* synthetic */ long C;
    public final /* synthetic */ CoroutineScope D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ Function3 I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7712z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1(boolean z2, BottomDrawerState bottomDrawerState, Function2 function2, long j2, CoroutineScope coroutineScope, Shape shape, long j3, long j4, float f2, Function3 function3) {
        super(3);
        this.f7712z = z2;
        this.f7710A = bottomDrawerState;
        this.f7711B = function2;
        this.C = j2;
        this.D = coroutineScope;
        this.E = shape;
        this.F = j3;
        this.G = j4;
        this.H = f2;
        this.I = function3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.layout.BoxWithConstraintsScope r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r13 = r28
            r7 = 1
            r8 = 6
            r1 = r29 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0019
            r1 = r27
            boolean r3 = r13.W(r1)
            if (r3 == 0) goto L_0x0015
            r3 = 4
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            r3 = r29 | r3
            goto L_0x001d
        L_0x0019:
            r1 = r27
            r3 = r29
        L_0x001d:
            r4 = r3 & 19
            r5 = 18
            if (r4 == r5) goto L_0x0025
            r4 = r7
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            r5 = r3 & 1
            boolean r4 = r13.E(r4, r5)
            if (r4 == 0) goto L_0x0252
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003d
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:595)"
            r6 = 1220102512(0x48b94970, float:379467.5)
            androidx.compose.runtime.ComposerKt.Y(r6, r3, r4, r5)
        L_0x003d:
            long r3 = r27.d()
            int r3 = androidx.compose.ui.unit.Constraints.k(r3)
            float r10 = (float) r3
            long r3 = r27.d()
            int r3 = androidx.compose.ui.unit.Constraints.l(r3)
            long r4 = r27.d()
            int r4 = androidx.compose.ui.unit.Constraints.k(r4)
            if (r3 <= r4) goto L_0x005a
            r11 = r7
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r3 = r13.C(r3)
            androidx.compose.ui.unit.Density r3 = (androidx.compose.ui.unit.Density) r3
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            long r5 = r27.d()
            int r5 = androidx.compose.ui.unit.Constraints.l(r5)
            float r17 = r3.D(r5)
            long r5 = r27.d()
            int r1 = androidx.compose.ui.unit.Constraints.k(r5)
            float r18 = r3.D(r1)
            r19 = 3
            r20 = 0
            r15 = 0
            r16 = 0
            r14 = r4
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.x(r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = r0.f7712z
            r14 = 0
            if (r1 == 0) goto L_0x009b
            androidx.compose.material.BottomDrawerState r1 = r0.f7710A
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r1.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.b(r4, r1, r14, r2, r14)
            goto L_0x009c
        L_0x009b:
            r1 = r4
        L_0x009c:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r2 = r13.C(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r2 != r3) goto L_0x00ab
            r19 = r7
            goto L_0x00ad
        L_0x00ab:
            r19 = 0
        L_0x00ad:
            androidx.compose.ui.Modifier r15 = r4.o0(r1)
            androidx.compose.material.BottomDrawerState r1 = r0.f7710A
            androidx.compose.material.AnchoredDraggableState r16 = r1.c()
            androidx.compose.foundation.gestures.Orientation r17 = androidx.compose.foundation.gestures.Orientation.Vertical
            boolean r1 = r0.f7712z
            r22 = 48
            r23 = 0
            r20 = 0
            r21 = 0
            r18 = r1
            androidx.compose.ui.Modifier r1 = androidx.compose.material.AnchoredDraggableKt.e(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            kotlin.jvm.functions.Function2 r2 = r0.f7711B
            long r3 = r0.C
            boolean r5 = r0.f7712z
            androidx.compose.material.BottomDrawerState r15 = r0.f7710A
            kotlinx.coroutines.CoroutineScope r6 = r0.D
            androidx.compose.ui.graphics.Shape r7 = r0.E
            r17 = r15
            long r14 = r0.F
            long r8 = r0.G
            r19 = r8
            float r8 = r0.H
            kotlin.jvm.functions.Function3 r9 = r0.I
            androidx.compose.ui.Alignment$Companion r21 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r21.o()
            r21 = r8
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.BoxKt.g(r0, r8)
            int r22 = androidx.compose.runtime.ComposablesKt.a(r13, r8)
            androidx.compose.runtime.CompositionLocalMap r8 = r28.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r13, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r23 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r24 = r14
            kotlin.jvm.functions.Function0 r14 = r23.a()
            androidx.compose.runtime.Applier r15 = r28.v()
            if (r15 != 0) goto L_0x010b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x010b:
            r28.s()
            boolean r15 = r28.n()
            if (r15 == 0) goto L_0x0118
            r13.y(r14)
            goto L_0x011b
        L_0x0118:
            r28.K()
        L_0x011b:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r28)
            kotlin.jvm.functions.Function2 r15 = r23.c()
            androidx.compose.runtime.Updater.g(r14, r0, r15)
            kotlin.jvm.functions.Function2 r0 = r23.e()
            androidx.compose.runtime.Updater.g(r14, r8, r0)
            kotlin.jvm.functions.Function2 r0 = r23.b()
            boolean r8 = r14.n()
            if (r8 != 0) goto L_0x0145
            java.lang.Object r8 = r14.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r22)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r15)
            if (r8 != 0) goto L_0x0153
        L_0x0145:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            r14.N(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            r14.A(r8, r0)
        L_0x0153:
            kotlin.jvm.functions.Function2 r0 = r23.d()
            androidx.compose.runtime.Updater.g(r14, r1, r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.m(r13, r1)
            boolean r0 = r13.d(r5)
            r8 = r17
            boolean r1 = r13.l(r8)
            r0 = r0 | r1
            boolean r1 = r13.l(r6)
            r0 = r0 | r1
            java.lang.Object r1 = r28.g()
            if (r0 != 0) goto L_0x0182
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x018a
        L_0x0182:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1 r1 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1
            r1.<init>(r5, r8, r6)
            r13.N(r1)
        L_0x018a:
            r0 = r1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            androidx.compose.material.BottomDrawerValue r1 = r8.f()
            androidx.compose.material.BottomDrawerValue r2 = androidx.compose.material.BottomDrawerValue.Closed
            if (r1 == r2) goto L_0x0197
            r5 = 1
            goto L_0x0198
        L_0x0197:
            r5 = 0
        L_0x0198:
            r14 = 0
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r28
            r0 = r6
            r6 = r14
            androidx.compose.material.DrawerKt.b(r1, r3, r4, r5, r6)
            androidx.compose.material.Strings$Companion r1 = androidx.compose.material.Strings.f8507b
            int r1 = r1.e()
            r2 = 6
            java.lang.String r1 = androidx.compose.material.Strings_androidKt.a(r1, r13, r2)
            boolean r2 = r13.h(r10)
            boolean r3 = r13.d(r11)
            r2 = r2 | r3
            boolean r3 = r13.l(r8)
            r2 = r2 | r3
            java.lang.Object r3 = r28.g()
            if (r2 != 0) goto L_0x01ca
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x01d2
        L_0x01ca:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1 r3 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1
            r3.<init>(r8, r10, r11)
            r13.N(r3)
        L_0x01d2:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.OnRemeasuredModifierKt.a(r12, r3)
            boolean r3 = r13.l(r8)
            java.lang.Object r4 = r28.g()
            if (r3 != 0) goto L_0x01ea
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x01f2
        L_0x01ea:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1 r4 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
            r4.<init>(r8)
            r13.N(r4)
        L_0x01f2:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.OffsetKt.a(r2, r4)
            boolean r3 = r13.W(r1)
            boolean r4 = r13.l(r8)
            r3 = r3 | r4
            boolean r4 = r13.l(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r28.g()
            if (r3 != 0) goto L_0x0214
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x021c
        L_0x0214:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1 r4 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1
            r4.<init>(r1, r8, r0)
            r13.N(r4)
        L_0x021c:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r0 = 0
            r1 = 0
            r3 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r0, r4, r3, r1)
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$5 r0 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
            r0.<init>(r9)
            r2 = 54
            r4 = 457750254(0x1b48b6ee, float:1.660272E-22)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r3, r0, r13, r2)
            r11 = 1572864(0x180000, float:2.204052E-39)
            r12 = 16
            r0 = 0
            r2 = r7
            r3 = r24
            r5 = r19
            r7 = r0
            r8 = r21
            r10 = r28
            androidx.compose.material.SurfaceKt.a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r28.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0255
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0255
        L_0x0252:
            r28.B()
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$BottomDrawer$1.b(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
