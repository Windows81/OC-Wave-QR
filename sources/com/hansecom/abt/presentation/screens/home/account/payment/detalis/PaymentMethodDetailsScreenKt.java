package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import coil.compose.EqualityDelegate;
import coil.compose.SingletonAsyncImageKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class PaymentMethodDetailsScreenKt {
    public static final Unit A(PaymentMethodDetailsViewModel paymentMethodDetailsViewModel, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        y(paymentMethodDetailsViewModel, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void B(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.State r22, kotlin.jvm.functions.Function1 r23, kotlinx.coroutines.flow.Flow r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r26
            r6 = r28
            r0 = -967029184(0xffffffffc65c4e40, float:-14099.5625)
            r3 = r27
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0022
            boolean r7 = r3.W(r1)
            if (r7 == 0) goto L_0x001f
            r7 = 4
            goto L_0x0020
        L_0x001f:
            r7 = 2
        L_0x0020:
            r7 = r7 | r6
            goto L_0x0023
        L_0x0022:
            r7 = r6
        L_0x0023:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0033
            boolean r8 = r3.l(r2)
            if (r8 == 0) goto L_0x0030
            r8 = 32
            goto L_0x0032
        L_0x0030:
            r8 = 16
        L_0x0032:
            r7 = r7 | r8
        L_0x0033:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r15 = r24
            if (r8 != 0) goto L_0x0045
            boolean r8 = r3.l(r15)
            if (r8 == 0) goto L_0x0042
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r7 = r7 | r8
        L_0x0045:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            r14 = 2048(0x800, float:2.87E-42)
            if (r8 != 0) goto L_0x0056
            boolean r8 = r3.l(r4)
            if (r8 == 0) goto L_0x0053
            r8 = r14
            goto L_0x0055
        L_0x0053:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r7 = r7 | r8
        L_0x0056:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r8 != 0) goto L_0x0067
            boolean r8 = r3.l(r5)
            if (r8 == 0) goto L_0x0064
            r8 = r13
            goto L_0x0066
        L_0x0064:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r7 = r7 | r8
        L_0x0067:
            r12 = r7
            r7 = r12 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r8) goto L_0x007a
            boolean r7 = r3.t()
            if (r7 != 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r3.B()
            goto L_0x0114
        L_0x007a:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0086
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.ScreenImpl (PaymentMethodDetailsScreen.kt:82)"
            androidx.compose.runtime.ComposerKt.Y(r0, r12, r7, r8)
        L_0x0086:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r7 = "PaymentMethodDetailsScreen"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r0, r7)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$ScreenImpl$1
            r0.<init>(r1, r2)
            r8 = 54
            r9 = 300982785(0x11f0a201, float:3.7965166E-28)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r10, r0, r3, r8)
            r16 = 3078(0xc06, float:4.313E-42)
            r17 = 6
            r8 = 0
            r18 = 0
            r20 = r10
            r10 = r18
            r21 = r12
            r12 = r0
            r0 = r13
            r13 = r3
            r0 = r14
            r14 = r16
            r15 = r17
            com.hansecom.abt.ui.components.ScreenContentKt.d(r7, r8, r10, r12, r13, r14, r15)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r7 = r3.C(r7)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r7 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r7
            r8 = 473004782(0x1c317aee, float:5.872327E-22)
            r3.X(r8)
            r8 = r21
            r9 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = 0
            if (r9 != r0) goto L_0x00d0
            r0 = r20
            goto L_0x00d1
        L_0x00d0:
            r0 = r10
        L_0x00d1:
            boolean r9 = r3.l(r7)
            r0 = r0 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r8
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r11) goto L_0x00e0
            r10 = r20
        L_0x00e0:
            r0 = r0 | r10
            java.lang.Object r9 = r3.g()
            if (r0 != 0) goto L_0x00ef
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r9 != r0) goto L_0x00f8
        L_0x00ef:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$ScreenImpl$2$1 r9 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$ScreenImpl$2$1
            r0 = 0
            r9.<init>(r4, r7, r5, r0)
            r3.N(r9)
        L_0x00f8:
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r3.M()
            int r0 = r8 >> 6
            r12 = r0 & 14
            r13 = 6
            r8 = 0
            r9 = 0
            r7 = r24
            r11 = r3
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0114
            androidx.compose.runtime.ComposerKt.X()
        L_0x0114:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.x()
            if (r7 == 0) goto L_0x012f
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.c r8 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.c
            r0 = r8
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.B(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit C(PaymentMethodDetails.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        B(state, function1, flow, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void l(PaymentMethodState.CreditCard creditCard, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composer3;
        PaymentMethodState.CreditCard creditCard2 = creditCard;
        int i4 = i2;
        Composer q2 = composer.q(-2012092899);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(creditCard2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2012092899, i3, -1, "com.hansecom.abt.presentation.screens.home.account.payment.detalis.CardInfo (PaymentMethodDetailsScreen.kt:144)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.Horizontal f2 = arrangement.f();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy b2 = RowKt.b(f2, companion2.l(), q2, 0);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
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
            Updater.g(b3, b2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            Modifier c2 = RowScope.c(RowScopeInstance.f4150a, companion, 1.0f, false, 2, (Object) null);
            MeasurePolicy a4 = ColumnKt.a(arrangement.g(), companion2.k(), q2, 0);
            int a5 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, c2);
            Function0 a6 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a6);
            } else {
                q2.K();
            }
            Composer b5 = Updater.b(q2);
            Updater.g(b5, a4, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            TextAlign.Companion companion4 = TextAlign.f19080b;
            int f3 = companion4.f();
            String b7 = StringResources_androidKt.b(R.string.P7, q2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            AbtTheme abtTheme2 = abtTheme;
            Arrangement arrangement2 = arrangement;
            Composer composer4 = q2;
            TextKt.j(b7, h2, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(f3), 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).f(), composer4, 48, 0, 130044);
            float f4 = (float) 8;
            Composer composer5 = composer4;
            SpacerKt.a(SizeKt.i(companion, Dp.m(f4)), composer5, 6);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int f5 = companion4.f();
            String d2 = creditCard.d();
            if (d2 == null) {
                d2 = "";
            }
            AbtTheme abtTheme3 = abtTheme2;
            AbtTheme abtTheme4 = abtTheme3;
            Composer composer6 = composer5;
            float f6 = f4;
            TextKt.j(d2, h3, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(f5), 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer5, 6).b(), composer6, 48, 0, 130044);
            composer6.T();
            Composer composer7 = composer6;
            composer7.X(-480958200);
            String a7 = creditCard.a();
            if (a7 == null || a7.length() == 0) {
                composer3 = composer7;
            } else {
                composer3 = composer7;
                SingletonAsyncImageKt.a(creditCard.a(), (String) null, SizeKt.i(SizeKt.y(companion, Dp.m((float) 77)), Dp.m((float) 40)), (Function1) null, (Function1) null, (Alignment) null, ContentScale.f17026a.d(), 0.0f, (ColorFilter) null, 0, false, (EqualityDelegate) null, composer7, 1573296, 0, 4024);
            }
            composer3.M();
            composer3.T();
            Composer composer8 = composer3;
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 24)), composer8, 6);
            AbtTheme abtTheme5 = abtTheme4;
            AbtTheme abtTheme6 = abtTheme5;
            TextKt.j(StringResources_androidKt.b(R.string.T7, composer8, 0), SizeKt.h(companion, 0.0f, 1, (Object) null), 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(companion4.f()), 0, 0, false, 0, 0, (Function1) null, abtTheme5.d(composer8, 6).f(), composer3, 48, 0, 130044);
            Composer composer9 = composer3;
            SpacerKt.a(SizeKt.i(companion, Dp.m(f6)), composer9, 6);
            if (creditCard.g()) {
                composer9.X(1630539588);
                MeasurePolicy b8 = RowKt.b(arrangement2.n(Dp.m((float) 4)), companion2.i(), composer9, 54);
                int a8 = ComposablesKt.a(composer9, 0);
                CompositionLocalMap I3 = composer9.I();
                Modifier e4 = ComposedModifierKt.e(composer9, companion);
                Function0 a9 = companion3.a();
                if (composer9.v() == null) {
                    ComposablesKt.d();
                }
                composer9.s();
                if (composer9.n()) {
                    composer9.y(a9);
                } else {
                    composer9.K();
                }
                Composer b9 = Updater.b(composer9);
                Updater.g(b9, b8, companion3.c());
                Updater.g(b9, I3, companion3.e());
                Function2 b10 = companion3.b();
                if (b9.n() || !Intrinsics.d(b9.g(), Integer.valueOf(a8))) {
                    b9.N(Integer.valueOf(a8));
                    b9.A(Integer.valueOf(a8), b10);
                }
                Updater.g(b9, e4, companion3.d());
                AbtTheme abtTheme7 = abtTheme6;
                IconKt.d(PainterResources_androidKt.c(R.drawable.f33007i, composer9, 0), (String) null, SizeKt.t(companion, Dp.m((float) 16)), abtTheme7.b(composer9, 6).b(), composer9, 432, 0);
                Composer composer10 = composer9;
                TextKt.j(StringResources_androidKt.c(R.string.K7, new Object[]{creditCard.b()}, composer9, 0), (Modifier) null, abtTheme7.b(composer9, 6).b(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme7.d(composer9, 6).b(), composer10, 0, 0, 131066);
                composer10.T();
                composer10.M();
                composer2 = composer10;
            } else {
                Composer composer11 = composer9;
                composer9.X(1631254727);
                composer2 = composer9;
                TextKt.j(creditCard.b(), SizeKt.h(companion, 0.0f, 1, (Object) null), 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(companion4.f()), 0, 0, false, 0, 0, (Function1) null, abtTheme6.d(composer9, 6).b(), composer2, 48, 0, 130044);
                composer2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new b(creditCard2, i4));
        }
    }

    public static final Unit m(PaymentMethodState.CreditCard creditCard, int i2, Composer composer, int i3) {
        l(creditCard, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void n(Composer composer, int i2) {
        Composer composer2;
        int i3 = i2;
        Composer q2 = composer.q(-1461597004);
        if (i3 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1461597004, i3, -1, "com.hansecom.abt.presentation.screens.home.account.payment.detalis.ChangeNicknameInfo (PaymentMethodDetailsScreen.kt:242)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            TextAlign.Companion companion2 = TextAlign.f19080b;
            int f2 = companion2.f();
            String b2 = StringResources_androidKt.b(R.string.W7, q2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            Composer composer3 = q2;
            TextKt.j(b2, h2, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(f2), 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).f(), composer3, 48, 0, 130040);
            Composer composer4 = composer3;
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 16)), composer4, 6);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int f3 = companion2.f();
            composer2 = composer4;
            TextKt.j(StringResources_androidKt.b(R.string.V7, composer4, 0), h3, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(f3), 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer4, 6).b(), composer2, 48, 0, 130044);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new d(i3));
        }
    }

    public static final Unit o(int i2, Composer composer, int i3) {
        n(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.State r34, kotlin.jvm.functions.Function1 r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            r0 = r34
            r1 = r35
            r2 = r37
            r3 = 245212592(0xe9da5b0, float:3.886304E-30)
            r4 = r36
            androidx.compose.runtime.Composer r14 = r4.q(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x001e
            boolean r4 = r14.W(r0)
            if (r4 == 0) goto L_0x001b
            r4 = 4
            goto L_0x001c
        L_0x001b:
            r4 = 2
        L_0x001c:
            r4 = r4 | r2
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            r5 = r2 & 48
            r13 = 16
            r12 = 32
            if (r5 != 0) goto L_0x0031
            boolean r5 = r14.l(r1)
            if (r5 == 0) goto L_0x002f
            r5 = r12
            goto L_0x0030
        L_0x002f:
            r5 = r13
        L_0x0030:
            r4 = r4 | r5
        L_0x0031:
            r11 = r4
            r4 = r11 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0045
            boolean r4 = r14.t()
            if (r4 != 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            r14.B()
            r3 = r14
            goto L_0x025d
        L_0x0045:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0051
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.DeleteCardSection (PaymentMethodDetailsScreen.kt:260)"
            androidx.compose.runtime.ComposerKt.Y(r3, r11, r4, r5)
        L_0x0051:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r9 = 0
            r10 = 1
            r8 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r3, r9, r10, r8)
            androidx.compose.ui.text.style.TextAlign$Companion r30 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r16 = r30.f()
            int r4 = com.hansecom.abt.R.string.S7
            r6 = 0
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r14, r6)
            com.hansecom.abt.ui.theme.AbtTheme r7 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r15 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r17 = r7.d(r14, r15)
            androidx.compose.ui.text.TextStyle r25 = r17.f()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r17 = r7.b(r14, r15)
            long r17 = r17.q()
            r31 = r7
            r6 = r17
            androidx.compose.ui.text.style.TextAlign r17 = androidx.compose.ui.text.style.TextAlign.h(r16)
            r28 = 0
            r29 = 130040(0x1fbf8, float:1.82225E-40)
            r16 = 0
            r8 = r16
            r18 = 0
            r9 = r18
            r32 = r11
            r11 = r16
            r12 = r16
            r13 = r16
            r33 = r14
            r14 = r18
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 48
            r26 = r33
            androidx.compose.material3.TextKt.j(r4, r5, r6, r8, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 16
            float r14 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r14)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.i(r3, r4)
            r15 = r33
            r13 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r4, r15, r13)
            r9 = 0
            r11 = 1
            r12 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r3, r12, r11, r9)
            int r6 = r30.f()
            int r4 = com.hansecom.abt.R.string.R7
            r10 = 0
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r15, r10)
            r7 = r31
            com.hansecom.abt.ui.theme.typography.AbtTypography r7 = r7.d(r15, r13)
            androidx.compose.ui.text.TextStyle r25 = r7.b()
            androidx.compose.ui.text.style.TextAlign r17 = androidx.compose.ui.text.style.TextAlign.h(r6)
            r29 = 130044(0x1fbfc, float:1.8223E-40)
            r6 = 0
            r8 = 0
            r9 = r18
            r11 = r16
            r12 = r16
            r13 = r16
            r30 = r14
            r14 = r18
            androidx.compose.material3.TextKt.j(r4, r5, r6, r8, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            float r4 = androidx.compose.ui.unit.Dp.m(r30)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.i(r3, r4)
            r15 = r33
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r4, r15, r14)
            int r4 = com.hansecom.abt.R.string.Q7
            r13 = 0
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r15, r13)
            boolean r4 = r34.d()
            if (r4 != 0) goto L_0x0116
            boolean r4 = r34.f()
            if (r4 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r10 = r13
            goto L_0x0117
        L_0x0116:
            r10 = 1
        L_0x0117:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            r11 = 0
            r12 = 2
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r4, r11, r12, r11)
            int r4 = com.hansecom.abt.R.drawable.Y
            r5 = 0
            r10 = 1
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r3, r5, r10, r11)
            java.lang.String r5 = "delete"
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.platform.TestTagKt.a(r3, r5)
            com.hansecom.abt.presentation.model.PaymentMethodState$CreditCard r3 = r34.i()
            if (r3 == 0) goto L_0x0150
            boolean r3 = r3.g()
            if (r3 != r10) goto L_0x0150
            r3 = -1804095194(0xffffffff9477b126, float:-1.25052496E-26)
            r15.X(r3)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r3 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r3 = r3.a(r15, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r3.b(r15, r13)
            r15.M()
        L_0x014e:
            r6 = r3
            goto L_0x0164
        L_0x0150:
            r3 = -1804034403(0xffffffff94789e9d, float:-1.2552081E-26)
            r15.X(r3)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r3 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r3 = r3.a(r15, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r3.f(r15, r13)
            r15.M()
            goto L_0x014e
        L_0x0164:
            r3 = -889494870(0xffffffffcafb62aa, float:-8237397.0)
            r15.X(r3)
            r3 = r32 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r3 != r9) goto L_0x0173
            r16 = r10
            goto L_0x0175
        L_0x0173:
            r16 = r13
        L_0x0175:
            java.lang.Object r9 = r15.g()
            if (r16 != 0) goto L_0x0183
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r16.a()
            if (r9 != r10) goto L_0x018b
        L_0x0183:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.e r9 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.e
            r9.<init>(r1)
            r15.N(r9)
        L_0x018b:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r15.M()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r16 = 48
            r17 = 64
            r18 = 0
            r4 = r9
            r9 = r10
            r10 = r18
            r11 = r15
            r12 = r16
            r14 = r13
            r13 = r17
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r7 = r34.j()
            int r4 = com.hansecom.abt.R.string.N7
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r15, r14)
            int r5 = com.hansecom.abt.R.string.O7
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r15, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r6 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r8 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r6 = r6.a(r15, r8)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r13 = r6.b(r15, r14)
            int r6 = com.hansecom.abt.R.string.M7
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r15, r14)
            boolean r6 = r34.e()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r8 = 1
            r9 = 0
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r10 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r9, r6, r8, r9)
            int r6 = com.hansecom.abt.R.string.L7
            java.lang.String r16 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r15, r14)
            boolean r6 = r34.e()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r12 = 2
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r21 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r6, r9, r12, r9)
            r6 = -889468194(0xffffffffcafbcade, float:-8250735.0)
            r15.X(r6)
            r6 = 32
            if (r3 != r6) goto L_0x01f5
            r9 = r8
            goto L_0x01f6
        L_0x01f5:
            r9 = r14
        L_0x01f6:
            java.lang.Object r12 = r15.g()
            if (r9 != 0) goto L_0x0204
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x020c
        L_0x0204:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.f r12 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.f
            r12.<init>(r1)
            r15.N(r12)
        L_0x020c:
            r25 = r12
            kotlin.jvm.functions.Function0 r25 = (kotlin.jvm.functions.Function0) r25
            r15.M()
            r9 = -889458869(0xffffffffcafbef4b, float:-8255397.5)
            r15.X(r9)
            if (r3 != r6) goto L_0x021c
            r14 = r8
        L_0x021c:
            java.lang.Object r3 = r15.g()
            if (r14 != 0) goto L_0x022a
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r3 != r6) goto L_0x0232
        L_0x022a:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.g r3 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.g
            r3.<init>(r1)
            r15.N(r3)
        L_0x0232:
            r17 = r3
            kotlin.jvm.functions.Function0 r17 = (kotlin.jvm.functions.Function0) r17
            r15.M()
            r23 = 0
            r24 = 114996(0x1c134, float:1.61144E-40)
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r14 = r25
            r3 = r15
            r15 = r21
            r21 = r3
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x025d
            androidx.compose.runtime.ComposerKt.X()
        L_0x025d:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.x()
            if (r3 == 0) goto L_0x026b
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.h r4 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.h
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x026b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.p(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit q(Function1 function1) {
        function1.invoke(new PaymentMethodDetails.Action.DeleteDialog(true));
        return Unit.f40552a;
    }

    public static final Unit r(Function1 function1) {
        function1.invoke(PaymentMethodDetails.Action.Delete.f35764a);
        return Unit.f40552a;
    }

    public static final Unit s(Function1 function1) {
        function1.invoke(new PaymentMethodDetails.Action.DeleteDialog(false));
        return Unit.f40552a;
    }

    public static final Unit t(PaymentMethodDetails.State state, Function1 function1, int i2, Composer composer, int i3) {
        p(state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails.State r28, kotlin.jvm.functions.Function1 r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            r0 = r28
            r1 = r29
            r2 = r31
            r3 = 897373297(0x357cd471, float:9.418646E-7)
            r4 = r30
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x001e
            boolean r4 = r15.W(r0)
            if (r4 == 0) goto L_0x001b
            r4 = 4
            goto L_0x001c
        L_0x001b:
            r4 = 2
        L_0x001c:
            r4 = r4 | r2
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            r5 = r2 & 48
            r14 = 32
            if (r5 != 0) goto L_0x0030
            boolean r5 = r15.l(r1)
            if (r5 == 0) goto L_0x002d
            r5 = r14
            goto L_0x002f
        L_0x002d:
            r5 = 16
        L_0x002f:
            r4 = r4 | r5
        L_0x0030:
            r5 = r4 & 19
            r6 = 18
            if (r5 != r6) goto L_0x0043
            boolean r5 = r15.t()
            if (r5 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r15.B()
            r14 = r15
            goto L_0x0158
        L_0x0043:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x004f
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.NicknameInputAndButton (PaymentMethodDetailsScreen.kt:215)"
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r5, r6)
        L_0x004f:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r3 = r15.C(r3)
            androidx.compose.ui.focus.FocusManager r3 = (androidx.compose.ui.focus.FocusManager) r3
            java.lang.String r6 = r28.g()
            int r7 = com.hansecom.abt.R.string.U7
            com.hansecom.abt.util.resourcesResolvers.StringValue r8 = r28.h()
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.f15489d
            r12 = 0
            r11 = 1
            r10 = 0
            androidx.compose.ui.Modifier r20 = androidx.compose.foundation.layout.SizeKt.h(r13, r12, r11, r10)
            androidx.compose.ui.text.input.ImeAction$Companion r5 = androidx.compose.ui.text.input.ImeAction.f18821b
            int r24 = r5.d()
            androidx.compose.ui.text.input.KeyboardCapitalization$Companion r5 = androidx.compose.ui.text.input.KeyboardCapitalization.f18845b
            int r25 = r5.e()
            r5 = 1424601591(0x54e9b1f7, float:8.0297051E12)
            r15.X(r5)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r14) goto L_0x0084
            r5 = r11
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            java.lang.Object r9 = r15.g()
            if (r5 != 0) goto L_0x0093
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x009b
        L_0x0093:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.i r9 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.i
            r9.<init>(r1)
            r15.N(r9)
        L_0x009b:
            r5 = r9
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r15.M()
            r22 = 54
            r23 = 62432(0xf3e0, float:8.7486E-41)
            r9 = 0
            r16 = 0
            r10 = r16
            r11 = r16
            r16 = 0
            r12 = r16
            r16 = 0
            r26 = r13
            r13 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 24576(0x6000, float:3.4438E-41)
            r27 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r20
            r14 = r25
            r30 = r15
            r15 = r24
            r20 = r30
            com.hansecom.abt.ui.components.formFields.ValidatedOutlinedTextFieldKt.d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = 8
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            r5 = r26
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.i(r5, r4)
            r6 = 6
            r14 = r30
            androidx.compose.foundation.layout.SpacerKt.a(r4, r14, r6)
            int r4 = com.hansecom.abt.R.string.X7
            r6 = 0
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r14, r6)
            boolean r4 = r28.d()
            if (r4 != 0) goto L_0x00fc
            boolean r4 = r28.e()
            if (r4 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r11 = r6
            goto L_0x00fd
        L_0x00fc:
            r11 = 1
        L_0x00fd:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            boolean r7 = r28.f()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.a(r4, r7)
            r4 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r5, r4, r9, r10)
            r4 = 1424613155(0x54e9df23, float:8.0357679E12)
            r14.X(r4)
            boolean r4 = r14.l(r3)
            r11 = r27
            r10 = 32
            if (r11 != r10) goto L_0x0126
            r11 = r9
            goto L_0x0127
        L_0x0126:
            r11 = r6
        L_0x0127:
            r4 = r4 | r11
            java.lang.Object r6 = r14.g()
            if (r4 != 0) goto L_0x0136
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x013e
        L_0x0136:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.j r6 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.j
            r6.<init>(r3, r1)
            r14.N(r6)
        L_0x013e:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r14.M()
            r12 = 48
            r13 = 100
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = r14
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0158
            androidx.compose.runtime.ComposerKt.X()
        L_0x0158:
            androidx.compose.runtime.ScopeUpdateScope r3 = r14.x()
            if (r3 == 0) goto L_0x0166
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.k r4 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.k
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.u(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit v(Function1 function1, String str) {
        Intrinsics.i(str, "it");
        function1.invoke(new PaymentMethodDetails.Action.NickNameChange(str));
        return Unit.f40552a;
    }

    public static final Unit w(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(PaymentMethodDetails.Action.Save.f35767a);
        return Unit.f40552a;
    }

    public static final Unit x(PaymentMethodDetails.State state, Function1 function1, int i2, Composer composer, int i3) {
        u(state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlinx.coroutines.flow.Flow} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if ((r15 & 1) != 0) goto L_0x007d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void y(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel r10, kotlin.jvm.functions.Function0 r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            java.lang.String r0 = "onChangesMade"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onUp"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            r0 = 941121172(0x38185e94, float:3.6327707E-5)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0024
            r1 = r15 & 1
            if (r1 != 0) goto L_0x0021
            boolean r1 = r13.l(r10)
            if (r1 == 0) goto L_0x0021
            r1 = 4
            goto L_0x0022
        L_0x0021:
            r1 = 2
        L_0x0022:
            r1 = r1 | r14
            goto L_0x0025
        L_0x0024:
            r1 = r14
        L_0x0025:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x002c
            r1 = r1 | 48
            goto L_0x003c
        L_0x002c:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x003c
            boolean r2 = r13.l(r11)
            if (r2 == 0) goto L_0x0039
            r2 = 32
            goto L_0x003b
        L_0x0039:
            r2 = 16
        L_0x003b:
            r1 = r1 | r2
        L_0x003c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0044
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0042:
            r9 = r1
            goto L_0x0055
        L_0x0044:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r13.l(r12)
            if (r2 == 0) goto L_0x0051
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0053
        L_0x0051:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0053:
            r1 = r1 | r2
            goto L_0x0042
        L_0x0055:
            r1 = r9 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x0068
            boolean r1 = r13.t()
            if (r1 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            r13.B()
        L_0x0065:
            r2 = r10
            goto L_0x014f
        L_0x0068:
            r13.p()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0080
            boolean r1 = r13.J()
            if (r1 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            r13.B()
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
        L_0x007d:
            r9 = r9 & -15
            goto L_0x00cc
        L_0x0080:
            r1 = r15 & 1
            if (r1 == 0) goto L_0x00cc
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r13.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r13, r1)
            if (r2 == 0) goto L_0x00c4
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r13, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r13.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x00ac
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x00aa:
            r5 = r10
            goto L_0x00af
        L_0x00ac:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x00aa
        L_0x00af:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel> r1 = com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel.class
            r3 = 0
            r6 = r13
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.S()
            r13.S()
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel r10 = (com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel) r10
            goto L_0x007d
        L_0x00c4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00cc:
            r13.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00db
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreen (PaymentMethodDetailsScreen.kt:64)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00db:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r13
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails$State r1 = z(r1)
            r2 = 656361853(0x271f497d, float:2.210552E-15)
            r13.X(r2)
            boolean r2 = r13.l(r10)
            java.lang.Object r3 = r13.g()
            if (r2 != 0) goto L_0x0104
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x010c
        L_0x0104:
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$PaymentMethodDetailsScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt$PaymentMethodDetailsScreen$1$1
            r3.<init>(r10)
            r13.N(r3)
        L_0x010c:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r13.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r3 = 656363061(0x271f4e35, float:2.2108079E-15)
            r13.X(r3)
            boolean r3 = r13.W(r10)
            java.lang.Object r4 = r13.g()
            if (r3 != 0) goto L_0x012c
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0133
        L_0x012c:
            kotlinx.coroutines.flow.Flow r4 = r10.l()
            r13.N(r4)
        L_0x0133:
            r3 = r4
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            r13.M()
            r4 = 64512(0xfc00, float:9.04E-41)
            r7 = r0 & r4
            r4 = r11
            r5 = r12
            r6 = r13
            B(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0065
        L_0x014f:
            androidx.compose.runtime.ScopeUpdateScope r10 = r13.x()
            if (r10 == 0) goto L_0x0162
            com.hansecom.abt.presentation.screens.home.account.payment.detalis.a r13 = new com.hansecom.abt.presentation.screens.home.account.payment.detalis.a
            r1 = r13
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r13)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsScreenKt.y(com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final PaymentMethodDetails.State z(State state) {
        return (PaymentMethodDetails.State) state.getValue();
    }
}
