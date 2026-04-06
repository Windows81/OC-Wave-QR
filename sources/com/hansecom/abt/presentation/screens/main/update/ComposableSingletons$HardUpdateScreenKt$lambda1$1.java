package com.hansecom.abt.presentation.screens.main.update;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.appUpdate.AppUpdateHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.main.update.ComposableSingletons$HardUpdateScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$HardUpdateScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$HardUpdateScreenKt$lambda1$1 f37712z = new ComposableSingletons$HardUpdateScreenKt$lambda1$1();

    public static final Unit e(AppUpdateHelper appUpdateHelper) {
        if (appUpdateHelper != null) {
            appUpdateHelper.d();
        }
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r24, int r25) {
        /*
            r23 = this;
            r12 = r24
            r0 = r25
            r1 = r0 & 3
            r2 = 2
            if (r1 != r2) goto L_0x0015
            boolean r1 = r24.t()
            if (r1 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r24.B()
            goto L_0x01bb
        L_0x0015:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0024
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.main.update.ComposableSingletons$HardUpdateScreenKt.lambda-1.<anonymous> (HardUpdateScreen.kt:40)"
            r3 = 1549465704(0x5c5af868, float:2.46538682E17)
            androidx.compose.runtime.ComposerKt.Y(r3, r0, r1, r2)
        L_0x0024:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.presentation.appUpdate.AppUpdateHelperKt.c()
            java.lang.Object r0 = r12.C(r0)
            r13 = r0
            com.hansecom.abt.presentation.appUpdate.AppUpdateHelper r13 = (com.hansecom.abt.presentation.appUpdate.AppUpdateHelper) r13
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.WindowInsets$Companion r0 = androidx.compose.foundation.layout.WindowInsets.f4206a
            r15 = 6
            androidx.compose.foundation.layout.WindowInsets r0 = androidx.compose.foundation.layout.WindowInsets_androidKt.e(r0, r12, r15)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.e(r14, r0)
            com.hansecom.abt.ui.theme.Dimensions r1 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r1 = r1.c()
            r2 = 32
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.j(r0, r1, r2)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r1 = r1.g()
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            r10 = 48
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.ColumnKt.a(r2, r1, r12, r10)
            r11 = 0
            int r2 = androidx.compose.runtime.ComposablesKt.a(r12, r11)
            androidx.compose.runtime.CompositionLocalMap r3 = r24.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r12, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r24.v()
            if (r6 != 0) goto L_0x007b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x007b:
            r24.s()
            boolean r6 = r24.n()
            if (r6 == 0) goto L_0x0088
            r12.y(r5)
            goto L_0x008b
        L_0x0088:
            r24.K()
        L_0x008b:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r24)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r3, r1)
            kotlin.jvm.functions.Function2 r1 = r4.b()
            boolean r3 = r5.n()
            if (r3 != 0) goto L_0x00b5
            java.lang.Object r3 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r6)
            if (r3 != 0) goto L_0x00c3
        L_0x00b5:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.N(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.A(r2, r1)
        L_0x00c3:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r16 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r0 = com.hansecom.abt.R.drawable.h0
            androidx.compose.ui.graphics.painter.Painter r0 = androidx.compose.ui.res.PainterResources_androidKt.c(r0, r12, r11)
            r1 = 162(0xa2, float:2.27E-43)
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.y(r14, r1)
            r2 = 60
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.i(r1, r2)
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 120(0x78, float:1.68E-43)
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r24
            androidx.compose.foundation.ImageKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = com.hansecom.abt.R.string.u0
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r12, r11)
            int r0 = com.hansecom.abt.R.string.v0
            java.lang.String r7 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r12, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r0 = r12.C(r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r2 = r0.v()
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r0 = r12.C(r0)
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r4 = r0.v()
            r0 = 64
            float r0 = (float) r0
            float r18 = androidx.compose.ui.unit.Dp.m(r0)
            float r0 = (float) r10
            float r20 = androidx.compose.ui.unit.Dp.m(r0)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.e(r17, r18, r19, r20, r21, r22)
            r10 = 1572912(0x180030, float:2.204119E-39)
            r17 = 1
            r0 = 0
            r8 = 1
            r9 = r24
            r15 = r11
            r11 = r17
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11)
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Type$Informative r0 = new com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Type$Informative
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Size r1 = com.hansecom.abt.ui.components.circleIcons.CircleIconStyle.Size.MEDIUM
            r0.<init>(r1)
            int r2 = com.hansecom.abt.R.drawable.S
            r4 = 0
            r5 = 2
            r1 = 0
            r3 = r24
            com.hansecom.abt.ui.components.circleIcons.CircleIconKt.b(r0, r1, r2, r3, r4, r5)
            r4 = 2
            r5 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r0 = r16
            r1 = r14
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.ColumnScope.c(r0, r1, r2, r3, r4, r5)
            androidx.compose.foundation.layout.SpacerKt.a(r0, r12, r15)
            r0 = 1
            r1 = 0
            r2 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.h(r14, r2, r0, r1)
            int r0 = com.hansecom.abt.R.string.w0
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r12, r15)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r2 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r0 = r0.a(r12, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r2 = r0.g(r12, r15)
            r0 = -1160490318(0xffffffffbad452b2, float:-0.0016198962)
            r12.X(r0)
            boolean r0 = r12.l(r13)
            java.lang.Object r3 = r24.g()
            if (r0 != 0) goto L_0x0195
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x019d
        L_0x0195:
            com.hansecom.abt.presentation.screens.main.update.a r3 = new com.hansecom.abt.presentation.screens.main.update.a
            r3.<init>(r13)
            r12.N(r3)
        L_0x019d:
            r0 = r3
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r24.M()
            r8 = 48
            r9 = 104(0x68, float:1.46E-43)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = r24
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r24.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01bb
            androidx.compose.runtime.ComposerKt.X()
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.main.update.ComposableSingletons$HardUpdateScreenKt$lambda1$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
