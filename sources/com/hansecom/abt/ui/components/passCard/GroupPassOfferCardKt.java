package com.hansecom.abt.ui.components.passCard;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupPassOfferCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.hansecom.abt.ui.components.passCard.PassOfferCardState r16, androidx.compose.ui.Modifier r17, java.lang.String r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function0 r20, kotlin.jvm.functions.Function0 r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r6 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "buttonLabel"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "onMinusClick"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onPlusClick"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "onButtonClick"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            r0 = -1965597331(0xffffffff8ad75d6d, float:-2.073889E-32)
            r1 = r22
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0035
            r1 = r11 | 6
            goto L_0x0045
        L_0x0035:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0044
            boolean r1 = r12.l(r6)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r11
            goto L_0x0045
        L_0x0044:
            r1 = r11
        L_0x0045:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 48
        L_0x004b:
            r3 = r17
            goto L_0x0060
        L_0x004e:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x004b
            r3 = r17
            boolean r4 = r12.W(r3)
            if (r4 == 0) goto L_0x005d
            r4 = 32
            goto L_0x005f
        L_0x005d:
            r4 = 16
        L_0x005f:
            r1 = r1 | r4
        L_0x0060:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x0067
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0077
        L_0x0067:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0077
            boolean r4 = r12.W(r7)
            if (r4 == 0) goto L_0x0074
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0076
        L_0x0074:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0076:
            r1 = r1 | r4
        L_0x0077:
            r4 = r24 & 8
            if (r4 == 0) goto L_0x007e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007e:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x008e
            boolean r4 = r12.l(r8)
            if (r4 == 0) goto L_0x008b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r1 = r1 | r4
        L_0x008e:
            r4 = r24 & 16
            if (r4 == 0) goto L_0x0095
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0095:
            r4 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x00a5
            boolean r4 = r12.l(r9)
            if (r4 == 0) goto L_0x00a2
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r1 = r1 | r4
        L_0x00a5:
            r4 = r24 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00ae
            r1 = r1 | r5
        L_0x00ac:
            r13 = r1
            goto L_0x00bf
        L_0x00ae:
            r4 = r11 & r5
            if (r4 != 0) goto L_0x00ac
            boolean r4 = r12.l(r10)
            if (r4 == 0) goto L_0x00bb
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r1 = r1 | r4
            goto L_0x00ac
        L_0x00bf:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r13
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r4) goto L_0x00d4
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r12.B()
            r2 = r3
            goto L_0x0114
        L_0x00d4:
            if (r2 == 0) goto L_0x00da
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r14 = r1
            goto L_0x00db
        L_0x00da:
            r14 = r3
        L_0x00db:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00e7
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.ui.components.passCard.GroupPassOfferCard (GroupPassOfferCard.kt:45)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r1, r2)
        L_0x00e7:
            com.hansecom.abt.ui.components.passCard.GroupPassOfferCardKt$GroupPassOfferCard$1 r15 = new com.hansecom.abt.ui.components.passCard.GroupPassOfferCardKt$GroupPassOfferCard$1
            r0 = r15
            r1 = r16
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = 1369243009(0x519cfd81, float:8.4283498E10)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r15, r12, r0)
            int r1 = r13 >> 3
            r1 = r1 & 14
            r1 = r1 | 48
            com.hansecom.abt.ui.components.passCard.PassCardStatusKt.m(r14, r0, r12, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0113
            androidx.compose.runtime.ComposerKt.X()
        L_0x0113:
            r2 = r14
        L_0x0114:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x0131
            com.hansecom.abt.ui.components.passCard.t r13 = new com.hansecom.abt.ui.components.passCard.t
            r0 = r13
            r1 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.a(r13)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.passCard.GroupPassOfferCardKt.e(com.hansecom.abt.ui.components.passCard.PassOfferCardState, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(PassOfferCardState passOfferCardState, Modifier modifier, String str, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, Composer composer, int i4) {
        e(passOfferCardState, modifier, str, function0, function02, function03, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void g(PassOfferCardState passOfferCardState, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(passOfferCardState, "state");
        Composer q2 = composer.q(1895455485);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(passOfferCardState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(1895455485, i4, -1, "com.hansecom.abt.ui.components.passCard.GroupPassOfferCardSmall (GroupPassOfferCard.kt:187)");
            }
            PassCardStatusKt.m(modifier, ComposableLambdaKt.e(1252346641, true, new GroupPassOfferCardKt$GroupPassOfferCardSmall$1(passOfferCardState), q2, 54), q2, ((i4 >> 3) & 14) | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new w(passOfferCardState, modifier, i2, i3));
        }
    }

    public static final Unit h(PassOfferCardState passOfferCardState, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        g(passOfferCardState, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void i(PassOfferCardState passOfferCardState, Function0 function0, Function0 function02, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1613291655);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(passOfferCardState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function02) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1613291655, i3, -1, "com.hansecom.abt.ui.components.passCard.GroupSizeInput (GroupPassOfferCard.kt:83)");
            }
            k((Modifier) null, ComposableLambdaKt.e(2054733979, true, new GroupPassOfferCardKt$GroupSizeInput$1(passOfferCardState, function0, function02), q2, 54), q2, 48, 1);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new u(passOfferCardState, function0, function02, i2));
        }
    }

    public static final Unit j(PassOfferCardState passOfferCardState, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        i(passOfferCardState, function0, function02, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void k(Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-70383145);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function2) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-70383145, i4, -1, "com.hansecom.abt.ui.components.passCard.GroupSizeInputLayout (GroupPassOfferCard.kt:158)");
            }
            q2.X(1352818202);
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = GroupPassOfferCardKt$GroupSizeInputLayout$1$1.f38618a;
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            q2.M();
            int i6 = ((i4 >> 3) & 14) | 384 | ((i4 << 3) & 112);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            int i7 = ((i6 << 6) & 896) | 6;
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, measurePolicy, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            function2.m(q2, Integer.valueOf((i7 >> 6) & 14));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new v(modifier, function2, i2, i3));
        }
    }

    public static final Unit l(Modifier modifier, Function2 function2, int i2, int i3, Composer composer, int i4) {
        k(modifier, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
