package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class FareMediaScreenKt$EmptyStateContent$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35955A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f35956B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f35957z;

    public FareMediaScreenKt$EmptyStateContent$1(boolean z2, Function1 function1, Function0 function0) {
        this.f35957z = z2;
        this.f35955A = function1;
        this.f35956B = function0;
    }

    public static final Unit e(Function1 function1) {
        function1.invoke(FareMedia.Action.AddCard.f35900a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r13 = r22
            r1 = r23
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r22.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r22.B()
            goto L_0x0222
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.EmptyStateContent.<anonymous> (FareMediaScreen.kt:657)"
            r5 = 402414389(0x17fc5b35, float:1.6308142E-24)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0026:
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            r15 = 0
            r12 = 1
            r11 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r14, r15, r12, r11)
            r2 = 0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.ScrollKt.c(r2, r13, r2, r12)
            r9 = 14
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r4, r5, r6, r7, r8, r9, r10)
            com.hansecom.abt.ui.theme.Dimensions r4 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r4 = r4.c()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r4, r15, r3, r11)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.g()
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r4 = r4.b()
            boolean r5 = r0.f35957z
            kotlin.jvm.functions.Function1 r10 = r0.f35955A
            kotlin.jvm.functions.Function0 r9 = r0.f35956B
            r6 = 54
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.ColumnKt.a(r4, r3, r13, r6)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r13, r2)
            androidx.compose.runtime.CompositionLocalMap r6 = r22.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r13, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r8 = r7.a()
            androidx.compose.runtime.Applier r16 = r22.v()
            if (r16 != 0) goto L_0x007b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x007b:
            r22.s()
            boolean r16 = r22.n()
            if (r16 == 0) goto L_0x0088
            r13.y(r8)
            goto L_0x008b
        L_0x0088:
            r22.K()
        L_0x008b:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r22)
            kotlin.jvm.functions.Function2 r11 = r7.c()
            androidx.compose.runtime.Updater.g(r8, r3, r11)
            kotlin.jvm.functions.Function2 r3 = r7.e()
            androidx.compose.runtime.Updater.g(r8, r6, r3)
            kotlin.jvm.functions.Function2 r3 = r7.b()
            boolean r6 = r8.n()
            if (r6 != 0) goto L_0x00b5
            java.lang.Object r6 = r8.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r11)
            if (r6 != 0) goto L_0x00c3
        L_0x00b5:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r8.N(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.A(r4, r3)
        L_0x00c3:
            kotlin.jvm.functions.Function2 r3 = r7.d()
            androidx.compose.runtime.Updater.g(r8, r1, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r1 = com.hansecom.abt.R.drawable.d0
            androidx.compose.ui.graphics.painter.Painter r1 = androidx.compose.ui.res.PainterResources_androidKt.c(r1, r13, r2)
            r3 = 200(0xc8, float:2.8E-43)
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.y(r14, r3)
            r4 = 150(0x96, float:2.1E-43)
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.i(r3, r4)
            if (r5 == 0) goto L_0x00ec
            r4 = r15
            goto L_0x00ee
        L_0x00ec:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00ee:
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.draw.AlphaKt.a(r3, r4)
            r11 = 48
            r16 = 120(0x78, float:1.68E-43)
            java.lang.String r4 = "company icon"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r15 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r22
            r17 = r9
            r9 = r11
            r11 = r10
            r10 = r16
            androidx.compose.foundation.ImageKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 32
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            r10 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r10)
            int r1 = com.hansecom.abt.R.string.W4
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r7 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r13, r15)
            int r1 = com.hansecom.abt.R.string.Y4
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.String r8 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r13, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r1 = r13.C(r1)
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r3 = r1.v()
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r1 = r13.C(r1)
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r5 = r1.v()
            float r1 = (float) r15
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.a(r1)
            r16 = 1572912(0x180030, float:2.204119E-39)
            r18 = 1
            r1 = 0
            r9 = 1
            r15 = r10
            r10 = r22
            r19 = r11
            r11 = r16
            r12 = r18
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = 48
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r15)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r11 = com.hansecom.abt.ui.components.abtButton.AbtButtonState.Enabled
            r1 = 0
            r10 = 0
            r12 = 1
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r14, r1, r12, r10)
            java.lang.String r1 = "empty_add_card"
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.platform.TestTagKt.a(r2, r1)
            int r1 = com.hansecom.abt.R.string.V4
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r4, r13, r3)
            int r1 = com.hansecom.abt.R.drawable.Q
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r9 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r4 = r9.a(r13, r15)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r4 = r4.g(r13, r3)
            r3 = -1811477761(0xffffffff94070aff, float:-6.817927E-27)
            r13.X(r3)
            r3 = r19
            boolean r6 = r13.W(r3)
            java.lang.Object r7 = r22.g()
            if (r6 != 0) goto L_0x01b0
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x01b8
        L_0x01b0:
            com.hansecom.abt.presentation.screens.home.faremedia.Y r7 = new com.hansecom.abt.presentation.screens.home.faremedia.Y
            r7.<init>(r3)
            r13.N(r7)
        L_0x01b8:
            r3 = r7
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r22.M()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r16 = 3120(0xc30, float:4.372E-42)
            r18 = 64
            r7 = 0
            r1 = r3
            r3 = r4
            r4 = r11
            r8 = r22
            r20 = r9
            r9 = r16
            r10 = r18
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -1811475085(0xffffffff94071573, float:-6.819988E-27)
            r13.X(r1)
            if (r17 != 0) goto L_0x01de
            goto L_0x0213
        L_0x01de:
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r14, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r15)
            r1 = 0
            r2 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r14, r1, r12, r2)
            int r1 = com.hansecom.abt.R.string.X4
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r4, r13, r3)
            r1 = r20
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r1.a(r13, r15)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.d(r13, r3)
            r9 = 3120(0xc30, float:4.372E-42)
            r10 = 96
            r6 = 0
            r7 = 0
            r1 = r17
            r4 = r11
            r8 = r22
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0213:
            r22.M()
            r22.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0222
            androidx.compose.runtime.ComposerKt.X()
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$EmptyStateContent$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
