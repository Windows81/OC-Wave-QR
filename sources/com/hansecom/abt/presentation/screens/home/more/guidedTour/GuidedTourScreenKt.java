package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import coil.compose.EqualityDelegate;
import coil.compose.SingletonAsyncImageKt;
import com.hansecom.abt.data.config.guidedTour.GuidedTourPage;
import com.hansecom.abt.data.config.guidedTour.MediaType;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.Dimensions;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class GuidedTourScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -80552671(0xfffffffffb32dd21, float:-9.287139E35)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r14 & 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.l(r10)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r13
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0028
            r1 = r1 | 48
        L_0x0026:
            r9 = r1
            goto L_0x0039
        L_0x0028:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0026
            boolean r2 = r12.l(r11)
            if (r2 == 0) goto L_0x0035
            r2 = 32
            goto L_0x0037
        L_0x0035:
            r2 = 16
        L_0x0037:
            r1 = r1 | r2
            goto L_0x0026
        L_0x0039:
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x004b
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r12.B()
            goto L_0x00dd
        L_0x004b:
            r12.p()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0063
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            r12.B()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
        L_0x0060:
            r9 = r9 & -15
            goto L_0x00af
        L_0x0063:
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r12, r1)
            if (r2 == 0) goto L_0x00a7
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x008f
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x008d:
            r5 = r10
            goto L_0x0092
        L_0x008f:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x008d
        L_0x0092:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel> r1 = com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel r10 = (com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel) r10
            goto L_0x0060
        L_0x00a7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00af:
            r12.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00be
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourScreen (GuidedTourScreen.kt:48)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00be:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r12
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour$State r0 = h(r0)
            r1 = r9 & 112(0x70, float:1.57E-43)
            o(r0, r11, r12, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00dd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00dd:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x00eb
            com.hansecom.abt.presentation.screens.home.more.guidedTour.e r0 = new com.hansecom.abt.presentation.screens.home.more.guidedTour.e
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourScreenKt.g(com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final GuidedTour.State h(State state) {
        return (GuidedTour.State) state.getValue();
    }

    public static final Unit i(GuidedTourViewModel guidedTourViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        g(guidedTourViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void j(GuidedTourPage guidedTourPage, Composer composer, int i2) {
        int i3;
        Composer composer2;
        GuidedTourPage guidedTourPage2 = guidedTourPage;
        int i4 = i2;
        Composer q2 = composer.q(1717177806);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(guidedTourPage2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1717177806, i3, -1, "com.hansecom.abt.presentation.screens.home.more.guidedTour.PageView (GuidedTourScreen.kt:103)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier k2 = PaddingKt.k(SizeKt.h(companion, 0.0f, 1, (Object) null), Dimensions.f38856a.c(), 0.0f, 2, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m((float) 32)), companion2.g(), q2, 54);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, k2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a4 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, a2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Composer composer3 = q2;
            TextKt.j(StringResourceKt.c(guidedTourPage.d(), new Object[0], q2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.a()), 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).l(), composer3, 0, 0, 130046);
            Modifier c2 = ColumnScope.c(columnScopeInstance, SizeKt.h(companion, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            MeasurePolicy g2 = BoxKt.g(companion2.e(), false);
            Composer composer4 = composer3;
            int a5 = ComposablesKt.a(composer4, 0);
            CompositionLocalMap I2 = composer4.I();
            Modifier e3 = ComposedModifierKt.e(composer4, c2);
            Function0 a6 = companion3.a();
            if (composer4.v() == null) {
                ComposablesKt.d();
            }
            composer4.s();
            if (composer4.n()) {
                composer4.y(a6);
            } else {
                composer4.K();
            }
            Composer b4 = Updater.b(composer4);
            Updater.g(b4, g2, companion3.c());
            Updater.g(b4, I2, companion3.e());
            Function2 b5 = companion3.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a5))) {
                b4.N(Integer.valueOf(a5));
                b4.A(Integer.valueOf(a5), b5);
            }
            Updater.g(b4, e3, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            MediaType b6 = guidedTourPage.b();
            composer4.X(456156752);
            if (b6 == MediaType.IMAGE) {
                composer2 = composer4;
                SingletonAsyncImageKt.a(guidedTourPage.c(), (String) null, (Modifier) null, (Function1) null, (Function1) null, (Alignment) null, ContentScale.f17026a.d(), 0.0f, (ColorFilter) null, 0, false, (EqualityDelegate) null, composer4, 1572912, 0, 4028);
            } else {
                composer2 = composer4;
            }
            composer2.M();
            composer2.T();
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new d(guidedTourPage2, i4));
        }
    }

    public static final Unit k(GuidedTourPage guidedTourPage, int i2, Composer composer, int i3) {
        j(guidedTourPage, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(androidx.compose.foundation.pager.PagerState r39, kotlin.jvm.functions.Function0 r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            r0 = r39
            r11 = r40
            r12 = r42
            r1 = 328496682(0x1394762a, float:3.747697E-27)
            r2 = r41
            androidx.compose.runtime.Composer r10 = r2.q(r1)
            r2 = 6
            r3 = r12 & 6
            if (r3 != 0) goto L_0x001f
            boolean r3 = r10.W(r0)
            if (r3 == 0) goto L_0x001c
            r3 = 4
            goto L_0x001d
        L_0x001c:
            r3 = 2
        L_0x001d:
            r3 = r3 | r12
            goto L_0x0020
        L_0x001f:
            r3 = r12
        L_0x0020:
            r5 = r12 & 48
            r6 = 32
            if (r5 != 0) goto L_0x0031
            boolean r5 = r10.l(r11)
            if (r5 == 0) goto L_0x002e
            r5 = r6
            goto L_0x0030
        L_0x002e:
            r5 = 16
        L_0x0030:
            r3 = r3 | r5
        L_0x0031:
            r5 = r3 & 19
            r7 = 18
            if (r5 != r7) goto L_0x0044
            boolean r5 = r10.t()
            if (r5 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r10.B()
            r14 = r10
            goto L_0x0224
        L_0x0044:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0050
            r5 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.more.guidedTour.PagerNavigation (GuidedTourScreen.kt:136)"
            androidx.compose.runtime.ComposerKt.Y(r1, r3, r5, r7)
        L_0x0050:
            java.lang.Object r1 = r10.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r5.a()
            if (r1 != r7) goto L_0x0065
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r1 = androidx.compose.runtime.EffectsKt.j(r1, r10)
            r10.N(r1)
        L_0x0065:
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r8 = 0
            r9 = 1
            r15 = 0
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r9, r15)
            com.hansecom.abt.ui.theme.Dimensions r14 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r14 = r14.c()
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.PaddingKt.j(r13, r14, r6)
            androidx.compose.ui.Alignment$Companion r13 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r13 = r13.g()
            androidx.compose.foundation.layout.Arrangement r14 = androidx.compose.foundation.layout.Arrangement.f3739a
            r15 = 24
            float r15 = (float) r15
            float r15 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r14 = r14.n(r15)
            r15 = 54
            androidx.compose.ui.layout.MeasurePolicy r13 = androidx.compose.foundation.layout.ColumnKt.a(r14, r13, r10, r15)
            r15 = 0
            int r14 = androidx.compose.runtime.ComposablesKt.a(r10, r15)
            androidx.compose.runtime.CompositionLocalMap r4 = r10.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r10, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r8 = r16.a()
            androidx.compose.runtime.Applier r17 = r10.v()
            if (r17 != 0) goto L_0x00b4
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00b4:
            r10.s()
            boolean r17 = r10.n()
            if (r17 == 0) goto L_0x00c1
            r10.y(r8)
            goto L_0x00c4
        L_0x00c1:
            r10.K()
        L_0x00c4:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r2 = r16.c()
            androidx.compose.runtime.Updater.g(r8, r13, r2)
            kotlin.jvm.functions.Function2 r2 = r16.e()
            androidx.compose.runtime.Updater.g(r8, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r16.b()
            boolean r4 = r8.n()
            if (r4 != 0) goto L_0x00ee
            java.lang.Object r4 = r8.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r13)
            if (r4 != 0) goto L_0x00fc
        L_0x00ee:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r8.N(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r8.A(r4, r2)
        L_0x00fc:
            kotlin.jvm.functions.Function2 r2 = r16.d()
            androidx.compose.runtime.Updater.g(r8, r6, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r2 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r2 = 1366992731(0x517aa75b, float:6.7284349E10)
            r10.X(r2)
            int r2 = r39.H()
            if (r2 <= 0) goto L_0x0167
            int r2 = com.hansecom.abt.R.string.G5
            int r4 = r39.v()
            int r4 = r4 + r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r6 = r39.H()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}
            java.lang.String r13 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r2, r4, r10, r15)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r4 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r2.d(r10, r4)
            androidx.compose.ui.text.TextStyle r34 = r2.l()
            r37 = 0
            r38 = 131070(0x1fffe, float:1.83668E-40)
            r14 = 0
            r16 = 0
            r4 = r15
            r2 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r36 = 0
            r35 = r10
            androidx.compose.material3.TextKt.j(r13, r14, r15, r17, r18, r20, r21, r22, r23, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0169
        L_0x0167:
            r4 = r15
            r2 = 0
        L_0x0169:
            r10.M()
            int r6 = r39.H()
            if (r6 == 0) goto L_0x01e0
            int r6 = r39.v()
            int r8 = r39.H()
            int r8 = r8 - r9
            if (r6 != r8) goto L_0x017e
            goto L_0x01e0
        L_0x017e:
            r6 = -572154359(0xffffffffdde59e09, float:-2.068209E18)
            r10.X(r6)
            int r6 = com.hansecom.abt.R.string.I5
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r17 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r6, r8, r10, r4)
            int r6 = com.hansecom.abt.R.drawable.f33014p
            r8 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.SizeKt.h(r7, r8, r9, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r2 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r7 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r2 = r2.a(r10, r7)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r15 = r2.g(r10, r4)
            r2 = 1367020627(0x517b1453, float:6.7398611E10)
            r10.X(r2)
            boolean r2 = r10.l(r1)
            r3 = r3 & 14
            r7 = 4
            if (r3 != r7) goto L_0x01ae
            goto L_0x01af
        L_0x01ae:
            r9 = r4
        L_0x01af:
            r2 = r2 | r9
            java.lang.Object r3 = r10.g()
            if (r2 != 0) goto L_0x01bc
            java.lang.Object r2 = r5.a()
            if (r3 != r2) goto L_0x01c4
        L_0x01bc:
            com.hansecom.abt.presentation.screens.home.more.guidedTour.b r3 = new com.hansecom.abt.presentation.screens.home.more.guidedTour.b
            r3.<init>(r1, r0)
            r10.N(r3)
        L_0x01c4:
            r13 = r3
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r10.M()
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)
            r21 = 48
            r22 = 72
            r16 = 0
            r19 = 0
            r20 = r10
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r10.M()
            r14 = r10
            goto L_0x0218
        L_0x01e0:
            r1 = -572444705(0xffffffffdde12fdf, float:-2.02830415E18)
            r10.X(r1)
            int r1 = com.hansecom.abt.R.string.H5
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r5, r10, r4)
            r1 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r7, r1, r9, r2)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r1 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r6 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r1.a(r10, r6)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r4 = r1.g(r10, r4)
            int r1 = r3 >> 3
            r1 = r1 & 14
            r9 = r1 | 48
            r13 = 104(0x68, float:1.46E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r40
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r14 = r10
            r10 = r13
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.M()
        L_0x0218:
            r14.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0224
            androidx.compose.runtime.ComposerKt.X()
        L_0x0224:
            androidx.compose.runtime.ScopeUpdateScope r1 = r14.x()
            if (r1 == 0) goto L_0x0232
            com.hansecom.abt.presentation.screens.home.more.guidedTour.c r2 = new com.hansecom.abt.presentation.screens.home.more.guidedTour.c
            r2.<init>(r0, r11, r12)
            r1.a(r2)
        L_0x0232:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourScreenKt.l(androidx.compose.foundation.pager.PagerState, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit m(CoroutineScope coroutineScope, PagerState pagerState) {
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new GuidedTourScreenKt$PagerNavigation$1$1$1$1(pagerState, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit n(PagerState pagerState, Function0 function0, int i2, Composer composer, int i3) {
        l(pagerState, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour.State r18, kotlin.jvm.functions.Function0 r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = -47771340(0xfffffffffd271134, float:-1.38794E37)
            r4 = r20
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r4 = r2 & 6
            r5 = 4
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.W(r0)
            if (r4 == 0) goto L_0x001c
            r4 = r5
            goto L_0x001d
        L_0x001c:
            r4 = 2
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            if (r6 != 0) goto L_0x0030
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x002d
            r6 = 32
            goto L_0x002f
        L_0x002d:
            r6 = 16
        L_0x002f:
            r4 = r4 | r6
        L_0x0030:
            r6 = r4 & 19
            r7 = 18
            if (r6 != r7) goto L_0x0044
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x003d
            goto L_0x0044
        L_0x003d:
            r15.B()
            r17 = r15
            goto L_0x00c5
        L_0x0044:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0050
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.more.guidedTour.ScreenImpl (GuidedTourScreen.kt:61)"
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r6, r7)
        L_0x0050:
            r3 = 1664001803(0x632ea70b, float:3.2217702E21)
            r15.X(r3)
            r3 = r4 & 14
            r10 = 1
            if (r3 != r5) goto L_0x005d
            r3 = r10
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            java.lang.Object r4 = r15.g()
            if (r3 != 0) goto L_0x006c
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0074
        L_0x006c:
            com.hansecom.abt.presentation.screens.home.more.guidedTour.f r4 = new com.hansecom.abt.presentation.screens.home.more.guidedTour.f
            r4.<init>(r0)
            r15.N(r4)
        L_0x0074:
            r6 = r4
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r15.M()
            r8 = 0
            r9 = 3
            r4 = 0
            r5 = 0
            r7 = r15
            androidx.compose.foundation.pager.PagerState r3 = androidx.compose.foundation.pager.PagerStateKt.k(r4, r5, r6, r7, r8, r9)
            com.hansecom.abt.ui.theme.AbtTheme r4 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r5 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r4.b(r15, r5)
            long r6 = r6.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r4 = r4.b(r15, r5)
            long r8 = r4.o()
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r5 = 0
            r11 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r4, r5, r10, r11)
            com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourScreenKt$ScreenImpl$1 r5 = new com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourScreenKt$ScreenImpl$1
            r5.<init>(r3, r1, r0)
            r3 = 54
            r11 = 971559823(0x39e8d38f, float:4.4408112E-4)
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r10, r5, r15, r3)
            r3 = 12582918(0xc00006, float:1.7632424E-38)
            r16 = 114(0x72, float:1.6E-43)
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = r15
            r17 = r15
            r15 = r3
            androidx.compose.material3.SurfaceKt.c(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00c5
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c5:
            androidx.compose.runtime.ScopeUpdateScope r3 = r17.x()
            if (r3 == 0) goto L_0x00d3
            com.hansecom.abt.presentation.screens.home.more.guidedTour.g r4 = new com.hansecom.abt.presentation.screens.home.more.guidedTour.g
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourScreenKt.o(com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour$State, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final int p(GuidedTour.State state) {
        return state.b().size();
    }

    public static final Unit q(GuidedTour.State state, Function0 function0, int i2, Composer composer, int i3) {
        o(state, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
