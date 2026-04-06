package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicatorKt;
import com.hansecom.abt.ui.effects.BarcodeBrightnessEffectKt;
import com.hansecom.abt.ui.effects.NfcSuppressionEffectKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class BarcodeDisplayScreenKt {
    public static final void d(BarcodeDisplay.State state, Composer composer, int i2) {
        int i3;
        BarcodeDisplay.State state2 = state;
        int i4 = i2;
        Composer q2 = composer.q(-1530293191);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(state2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1530293191, i3, -1, "com.hansecom.abt.presentation.screens.home.barcode.AztecCode (BarcodeDisplayScreen.kt:157)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier b2 = AspectRatioKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            Color.Companion companion2 = Color.f15975b;
            Modifier i5 = PaddingKt.i(BackgroundKt.b(b2, companion2.g(), (Shape) null, 2, (Object) null), Dp.m((float) 16));
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.e(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, i5);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, g2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            if (state.e() == null) {
                q2.X(-2024519848);
                AbtCircularProgressIndicatorKt.e((Modifier) null, companion2.a(), 0.0f, 0, 0, q2, 48, 29);
                q2.M();
            } else {
                q2.X(-2024431064);
                BarcodeBrightnessEffectKt.d(q2, 0);
                NfcSuppressionEffectKt.d(q2, 0);
                ImageKt.b(AndroidImageBitmap_androidKt.c(state.e()), (String) null, TestTagKt.a(SizeKt.f(companion, 0.0f, 1, (Object) null), "barcode"), (Alignment) null, ContentScale.f17026a.c(), 0.0f, (ColorFilter) null, 0, q2, 25008, 232);
                q2.M();
            }
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new a(state2, i4));
        }
    }

    public static final Unit e(BarcodeDisplay.State state, int i2, Composer composer, int i3) {
        d(state, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if ((r24 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function0 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r8 = r20
            r9 = r21
            r10 = r23
            java.lang.String r0 = "onHelpClick"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onUpClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = -1778142772(0xffffffff9603b1cc, float:-1.0638199E-25)
            r1 = r22
            androidx.compose.runtime.Composer r7 = r1.q(r0)
            r1 = r10 & 6
            r6 = 4
            if (r1 != 0) goto L_0x0031
            r1 = r24 & 1
            if (r1 != 0) goto L_0x002c
            r1 = r19
            boolean r2 = r7.W(r1)
            if (r2 == 0) goto L_0x002e
            r2 = r6
            goto L_0x002f
        L_0x002c:
            r1 = r19
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r10
            goto L_0x0034
        L_0x0031:
            r1 = r19
            r2 = r10
        L_0x0034:
            r3 = r24 & 2
            if (r3 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x004b
            boolean r3 = r7.l(r8)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r2 = r2 | r3
        L_0x004b:
            r3 = r24 & 4
            if (r3 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0062
            boolean r3 = r7.l(r9)
            if (r3 == 0) goto L_0x005f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r2 = r2 | r3
        L_0x0062:
            r3 = r2 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x0075
            boolean r3 = r7.t()
            if (r3 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r7.B()
            r13 = r7
            goto L_0x0158
        L_0x0075:
            r7.p()
            r3 = r10 & 1
            r5 = 0
            if (r3 == 0) goto L_0x0090
            boolean r3 = r7.J()
            if (r3 == 0) goto L_0x0084
            goto L_0x0090
        L_0x0084:
            r7.B()
            r3 = r24 & 1
            if (r3 == 0) goto L_0x008d
        L_0x008b:
            r2 = r2 & -15
        L_0x008d:
            r11 = r1
            r12 = r2
            goto L_0x00dd
        L_0x0090:
            r3 = r24 & 1
            if (r3 == 0) goto L_0x008d
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r7.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r3 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r12 = r1.c(r7, r3)
            if (r12 == 0) goto L_0x00d5
            androidx.lifecycle.ViewModelProvider$Factory r14 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r12, r7, r5)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r7.f(r1)
            boolean r1 = r12 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x00bb
            r1 = r12
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x00b9:
            r15 = r1
            goto L_0x00be
        L_0x00bb:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00b9
        L_0x00be:
            r17 = 36936(0x9048, float:5.1758E-41)
            r18 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel> r11 = com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel.class
            r13 = 0
            r16 = r7
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r11, r12, r13, r14, r15, r16, r17, r18)
            r7.S()
            r7.S()
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel r1 = (com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel) r1
            goto L_0x008b
        L_0x00d5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r7.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00ec
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreen (BarcodeDisplayScreen.kt:61)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r1, r2)
        L_0x00ec:
            int r0 = r12 << 6
            r13 = r0 & 896(0x380, float:1.256E-42)
            r14 = 3
            r2 = 0
            r3 = 0
            r1 = r11
            r4 = r7
            r15 = r5
            r5 = r13
            r13 = r6
            r6 = r14
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay$State r1 = g(r1)
            r2 = 386105219(0x17037f83, float:4.2489325E-25)
            r7.X(r2)
            r2 = r12 & 14
            r2 = r2 ^ 6
            if (r2 <= r13) goto L_0x0113
            boolean r2 = r7.W(r11)
            if (r2 != 0) goto L_0x0117
        L_0x0113:
            r2 = r12 & 6
            if (r2 != r13) goto L_0x0119
        L_0x0117:
            r5 = 1
            goto L_0x011a
        L_0x0119:
            r5 = r15
        L_0x011a:
            java.lang.Object r2 = r7.g()
            if (r5 != 0) goto L_0x0128
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0130
        L_0x0128:
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$BarcodeDisplayScreen$1$1 r2 = new com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$BarcodeDisplayScreen$1$1
            r2.<init>(r11)
            r7.N(r2)
        L_0x0130:
            kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
            r7.M()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r11.l()
            r4 = 64512(0xfc00, float:9.04E-41)
            r6 = r0 & r4
            r12 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r20
            r4 = r21
            r5 = r7
            r13 = r7
            r7 = r12
            i(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0157
            androidx.compose.runtime.ComposerKt.X()
        L_0x0157:
            r1 = r11
        L_0x0158:
            androidx.compose.runtime.ScopeUpdateScope r6 = r13.x()
            if (r6 == 0) goto L_0x016f
            com.hansecom.abt.presentation.screens.home.barcode.c r7 = new com.hansecom.abt.presentation.screens.home.barcode.c
            r0 = r7
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt.f(com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final BarcodeDisplay.State g(State state) {
        return (BarcodeDisplay.State) state.getValue();
    }

    public static final Unit h(BarcodeDisplayViewModel barcodeDisplayViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        f(barcodeDisplayViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0098, code lost:
        if ((r34 & 4) != 0) goto L_0x009a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay.State r27, kotlin.jvm.functions.Function1 r28, kotlinx.coroutines.flow.Flow r29, kotlin.jvm.functions.Function0 r30, kotlin.jvm.functions.Function0 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r1 = r27
            r4 = r30
            r5 = r31
            r6 = r33
            r0 = 1150686296(0x44961458, float:1200.6357)
            r2 = r32
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r6 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = 2
        L_0x0025:
            r3 = r3 | r6
            goto L_0x0028
        L_0x0027:
            r3 = r6
        L_0x0028:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0041
            r7 = r34 & 4
            if (r7 != 0) goto L_0x003b
            r7 = r29
            boolean r8 = r2.l(r7)
            if (r8 == 0) goto L_0x003d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x003f
        L_0x003b:
            r7 = r29
        L_0x003d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x003f:
            r3 = r3 | r8
            goto L_0x0043
        L_0x0041:
            r7 = r29
        L_0x0043:
            r8 = r34 & 8
            if (r8 == 0) goto L_0x004a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x005a
        L_0x004a:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x005a
            boolean r8 = r2.l(r4)
            if (r8 == 0) goto L_0x0057
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0059
        L_0x0057:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0059:
            r3 = r3 | r8
        L_0x005a:
            r8 = r34 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x0063
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0072
        L_0x0063:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0072
            boolean r8 = r2.l(r5)
            if (r8 == 0) goto L_0x006f
            r8 = r15
            goto L_0x0071
        L_0x006f:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0071:
            r3 = r3 | r8
        L_0x0072:
            r8 = r3 & 9347(0x2483, float:1.3098E-41)
            r9 = 9346(0x2482, float:1.3097E-41)
            if (r8 != r9) goto L_0x0085
            boolean r8 = r2.t()
            if (r8 != 0) goto L_0x007f
            goto L_0x0085
        L_0x007f:
            r2.B()
            r3 = r7
            goto L_0x0173
        L_0x0085:
            r2.p()
            r8 = r6 & 1
            if (r8 == 0) goto L_0x009f
            boolean r8 = r2.J()
            if (r8 == 0) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            r2.B()
            r8 = r34 & 4
            if (r8 == 0) goto L_0x009c
        L_0x009a:
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x009c:
            r13 = r3
            r3 = r7
            goto L_0x00a8
        L_0x009f:
            r8 = r34 & 4
            if (r8 == 0) goto L_0x009c
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.A()
            goto L_0x009a
        L_0x00a8:
            r2.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00b7
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.barcode.ScreenImpl (BarcodeDisplayScreen.kt:80)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r7, r8)
        L_0x00b7:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r2.C(r0)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r0 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r0
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r8 = "BarcodeDisplayScreen"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r7, r8)
            com.hansecom.abt.ui.theme.AbtTheme r8 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r14 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r9 = r8.b(r2, r14)
            long r16 = r9.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r8 = r8.b(r2, r14)
            long r18 = r8.o()
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$1 r8 = new com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$1
            r8.<init>(r5)
            r9 = 1554456340(0x5ca71f14, float:3.76323935E17)
            r12 = 1
            r10 = 54
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r12, r8, r2, r10)
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$2 r9 = new com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$2
            r9.<init>(r0)
            r11 = 768458450(0x2dcdbed2, float:2.3390543E-11)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r12, r9, r2, r10)
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$3 r9 = new com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$3
            r9.<init>(r1, r4)
            r14 = -806391575(0xffffffffcfef70e9, float:-8.0343086E9)
            androidx.compose.runtime.internal.ComposableLambda r20 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r12, r9, r2, r10)
            r21 = 805309494(0x30000c36, float:4.658348E-10)
            r22 = 308(0x134, float:4.32E-43)
            r9 = 0
            r14 = 0
            r23 = 0
            r24 = 0
            r10 = r11
            r11 = r14
            r25 = r12
            r12 = r23
            r23 = r13
            r26 = 6
            r13 = r16
            r15 = r18
            r17 = r24
            r18 = r20
            r19 = r2
            r20 = r21
            r21 = r22
            androidx.compose.material3.ScaffoldKt.f(r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)
            r7 = -1218211443(0xffffffffb763918d, float:-1.3564143E-5)
            r2.X(r7)
            boolean r7 = r2.l(r0)
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r23 & r8
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r8 != r9) goto L_0x013f
            r12 = r25
            goto L_0x0140
        L_0x013f:
            r12 = 0
        L_0x0140:
            r7 = r7 | r12
            java.lang.Object r8 = r2.g()
            if (r7 != 0) goto L_0x014f
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0158
        L_0x014f:
            com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$4$1 r8 = new com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt$ScreenImpl$4$1
            r7 = 0
            r8.<init>(r0, r5, r7)
            r2.N(r8)
        L_0x0158:
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r2.M()
            int r0 = r23 >> 6
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r3
            r11 = r2
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0173
            androidx.compose.runtime.ComposerKt.X()
        L_0x0173:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.x()
            if (r8 == 0) goto L_0x018e
            com.hansecom.abt.presentation.screens.home.barcode.b r9 = new com.hansecom.abt.presentation.screens.home.barcode.b
            r0 = r9
            r1 = r27
            r2 = r28
            r4 = r30
            r5 = r31
            r6 = r33
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayScreenKt.i(com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit j(BarcodeDisplay.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        i(state, function1, flow, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
