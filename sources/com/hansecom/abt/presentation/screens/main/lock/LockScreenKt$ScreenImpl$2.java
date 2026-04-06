package com.hansecom.abt.presentation.screens.main.lock;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.main.lock.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class LockScreenKt$ScreenImpl$2 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37673A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Lock.State f37674z;

    public LockScreenKt$ScreenImpl$2(Lock.State state, Function1 function1) {
        this.f37674z = state;
        this.f37673A = function1;
    }

    public static final Unit e(Function1 function1) {
        function1.invoke(Lock.Action.ShowBiometricDialog.f37667a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.layout.PaddingValues r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r13 = r26
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r2 = r27 & 6
            r3 = 2
            if (r2 != 0) goto L_0x001c
            boolean r2 = r13.W(r1)
            if (r2 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            r2 = r27 | r2
            goto L_0x001e
        L_0x001c:
            r2 = r27
        L_0x001e:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0030
            boolean r4 = r26.t()
            if (r4 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r26.B()
            goto L_0x0208
        L_0x0030:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003f
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.main.lock.ScreenImpl.<anonymous> (LockScreen.kt:85)"
            r6 = -694826253(0xffffffffd695caf3, float:-8.2349446E13)
            androidx.compose.runtime.ComposerKt.Y(r6, r2, r4, r5)
        L_0x003f:
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r14, r1)
            androidx.compose.foundation.layout.WindowInsets$Companion r2 = androidx.compose.foundation.layout.WindowInsets.f4206a
            r15 = 6
            androidx.compose.foundation.layout.WindowInsets r2 = androidx.compose.foundation.layout.WindowInsets_androidKt.e(r2, r13, r15)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.e(r1, r2)
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r2.c()
            r4 = 0
            r5 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r4, r3, r5)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r2 = r2.g()
            com.hansecom.abt.presentation.screens.main.lock.Lock$State r12 = r0.f37674z
            kotlin.jvm.functions.Function1 r11 = r0.f37673A
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            r4 = 48
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r3, r2, r13, r4)
            r10 = 0
            int r3 = androidx.compose.runtime.ComposablesKt.a(r13, r10)
            androidx.compose.runtime.CompositionLocalMap r4 = r26.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r13, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r26.v()
            if (r7 != 0) goto L_0x008e
            androidx.compose.runtime.ComposablesKt.d()
        L_0x008e:
            r26.s()
            boolean r7 = r26.n()
            if (r7 == 0) goto L_0x009b
            r13.y(r6)
            goto L_0x009e
        L_0x009b:
            r26.K()
        L_0x009e:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r26)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00c8
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00d6
        L_0x00c8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00d6:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r16 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r1 = 32
            float r1 = (float) r1
            float r2 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.i(r14, r2)
            androidx.compose.foundation.layout.SpacerKt.a(r2, r13, r15)
            int r2 = com.hansecom.abt.R.drawable.Z
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.ui.res.PainterResources_androidKt.c(r2, r13, r10)
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r13, r15)
            long r4 = r3.o()
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.t(r14, r1)
            r7 = 432(0x1b0, float:6.05E-43)
            r8 = 0
            r6 = 0
            r1 = r2
            r2 = r6
            r6 = r26
            androidx.compose.material3.IconKt.d(r1, r2, r3, r4, r6, r7, r8)
            int r1 = com.hansecom.abt.R.string.X6
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r10)
            int r1 = com.hansecom.abt.R.string.Y6
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r1 = r13.C(r1)
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r3 = r1.v()
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r1 = r13.C(r1)
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r5 = r1.v()
            r1 = 24
            float r1 = (float) r1
            float r18 = androidx.compose.ui.unit.Dp.m(r1)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r17, r18, r19, r20, r21, r22)
            r17 = 1572912(0x180030, float:2.204119E-39)
            r18 = 1
            r1 = 0
            r9 = 1
            r10 = r26
            r23 = r11
            r11 = r17
            r17 = r12
            r12 = r18
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = 96
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r15)
            boolean r1 = r17.a()
            r2 = 607836796(0x243ada7c, float:4.0517384E-17)
            r13.X(r2)
            boolean r1 = r13.d(r1)
            java.lang.Object r2 = r26.g()
            if (r1 != 0) goto L_0x018b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x019d
        L_0x018b:
            boolean r1 = r17.a()
            if (r1 == 0) goto L_0x0194
            int r1 = com.hansecom.abt.R.drawable.F
            goto L_0x0196
        L_0x0194:
            int r1 = com.hansecom.abt.R.drawable.G
        L_0x0196:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r13.N(r2)
        L_0x019d:
            java.lang.Number r2 = (java.lang.Number) r2
            int r3 = r2.intValue()
            r26.M()
            androidx.compose.foundation.shape.RoundedCornerShape r1 = androidx.compose.foundation.shape.RoundedCornerShapeKt.f()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.draw.ClipKt.a(r14, r1)
            r1 = 607848816(0x243b0970, float:4.0557155E-17)
            r13.X(r1)
            r1 = r23
            boolean r2 = r13.W(r1)
            java.lang.Object r5 = r26.g()
            if (r2 != 0) goto L_0x01c8
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x01d0
        L_0x01c8:
            com.hansecom.abt.presentation.screens.main.lock.g r5 = new com.hansecom.abt.presentation.screens.main.lock.g
            r5.<init>(r1)
            r13.N(r5)
        L_0x01d0:
            r8 = r5
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r26.M()
            r9 = 7
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClickableKt.f(r4, r5, r6, r7, r8, r9, r10)
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Type$Informative r1 = new com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Type$Informative
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Size r4 = com.hansecom.abt.ui.components.circleIcons.CircleIconStyle.Size.MEDIUM
            r1.<init>(r4)
            r6 = 0
            r4 = r26
            com.hansecom.abt.ui.components.circleIcons.CircleIconKt.b(r1, r2, r3, r4, r5, r6)
            r11 = 2
            r12 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r7 = r16
            r8 = r14
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.ColumnScope.c(r7, r8, r9, r10, r11, r12)
            r2 = 0
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r2)
            r26.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0208
            androidx.compose.runtime.ComposerKt.X()
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.lock.LockScreenKt$ScreenImpl$2.c(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
