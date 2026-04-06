package androidx.compose.material;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ListItemKt {
    public static final void a(List list, Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(1631148337);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function2) ? 256 : 128;
        }
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(1631148337, i4, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:365)");
            }
            boolean l2 = q2.l(list);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new ListItemKt$BaselinesOffsetColumn$1$1(list);
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            int i6 = ((i4 >> 6) & 14) | (i4 & 112);
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
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ListItemKt$BaselinesOffsetColumn$2(list, modifier2, function2, i2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r21, kotlin.jvm.functions.Function2 r22, kotlin.jvm.functions.Function2 r23, boolean r24, kotlin.jvm.functions.Function2 r25, kotlin.jvm.functions.Function2 r26, kotlin.jvm.functions.Function2 r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r7 = r27
            r8 = r29
            r0 = -450923337(0xffffffffe51f74b7, float:-4.706308E22)
            r1 = r28
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r8 | 6
            r4 = r3
            r3 = r21
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r21
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r21
            r4 = r8
        L_0x002b:
            r5 = r30 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r22
            goto L_0x0046
        L_0x0034:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r22
            boolean r9 = r1.l(r6)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r4 = r4 | r9
        L_0x0046:
            r9 = r30 & 4
            if (r9 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r23
            goto L_0x0061
        L_0x004f:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r23
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r11
        L_0x0061:
            r11 = r30 & 8
            if (r11 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r12 = r24
            goto L_0x007c
        L_0x006a:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0067
            r12 = r24
            boolean r13 = r1.d(r12)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r13
        L_0x007c:
            r13 = r30 & 16
            if (r13 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r14 = r25
            goto L_0x0097
        L_0x0085:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0082
            r14 = r25
            boolean r15 = r1.l(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r15
        L_0x0097:
            r15 = r30 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a2
            r4 = r4 | r16
            r0 = r26
            goto L_0x00b5
        L_0x00a2:
            r16 = r8 & r16
            r0 = r26
            if (r16 != 0) goto L_0x00b5
            boolean r17 = r1.l(r0)
            if (r17 == 0) goto L_0x00b1
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r4 = r4 | r17
        L_0x00b5:
            r17 = r30 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00be
            r4 = r4 | r18
            goto L_0x00cf
        L_0x00be:
            r17 = r8 & r18
            if (r17 != 0) goto L_0x00cf
            boolean r17 = r1.l(r7)
            if (r17 == 0) goto L_0x00cb
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r4 = r4 | r17
        L_0x00cf:
            r17 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r17
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 == r3) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x01cb
            if (r2 == 0) goto L_0x00e9
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00eb
        L_0x00e9:
            r0 = r21
        L_0x00eb:
            r2 = 0
            if (r5 == 0) goto L_0x00f0
            r3 = r2
            goto L_0x00f2
        L_0x00f0:
            r3 = r22
        L_0x00f2:
            if (r9 == 0) goto L_0x00f6
            r5 = r2
            goto L_0x00f7
        L_0x00f6:
            r5 = r10
        L_0x00f7:
            if (r11 == 0) goto L_0x00fc
            r19 = 1
            goto L_0x00fe
        L_0x00fc:
            r19 = r12
        L_0x00fe:
            if (r13 == 0) goto L_0x0101
            r14 = r2
        L_0x0101:
            if (r15 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r2 = r26
        L_0x0106:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0115
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.ListItem (ListItem.kt:88)"
            r11 = -450923337(0xffffffffe51f74b7, float:-4.706308E22)
            androidx.compose.runtime.ComposerKt.Y(r11, r4, r9, r10)
        L_0x0115:
            androidx.compose.material.MaterialTheme r9 = androidx.compose.material.MaterialTheme.f7937a
            r10 = 6
            androidx.compose.material.Typography r9 = r9.c(r1, r10)
            androidx.compose.ui.text.TextStyle r11 = r9.g()
            androidx.compose.material.ContentAlpha r12 = androidx.compose.material.ContentAlpha.f7561a
            float r13 = r12.c(r1, r10)
            kotlin.jvm.functions.Function2 r13 = f(r11, r13, r7)
            kotlin.jvm.internal.Intrinsics.f(r13)
            androidx.compose.ui.text.TextStyle r11 = r9.b()
            float r15 = r12.d(r1, r10)
            kotlin.jvm.functions.Function2 r15 = f(r11, r15, r5)
            androidx.compose.ui.text.TextStyle r11 = r9.f()
            float r6 = r12.c(r1, r10)
            kotlin.jvm.functions.Function2 r6 = f(r11, r6, r14)
            androidx.compose.ui.text.TextStyle r9 = r9.d()
            float r10 = r12.c(r1, r10)
            kotlin.jvm.functions.Function2 r16 = f(r9, r10, r2)
            androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1 r9 = androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1.f7922z
            r10 = 1
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r0, r10, r9)
            if (r15 != 0) goto L_0x0179
            if (r6 != 0) goto L_0x0179
            r6 = -215900426(0xfffffffff3219ef6, float:-1.280493E31)
            r1.X(r6)
            androidx.compose.material.OneLine r9 = androidx.compose.material.OneLine.f8085a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r15 = r4 | 24576(0x6000, float:3.4438E-41)
            r4 = 0
            r11 = r3
            r12 = r13
            r13 = r16
            r20 = r14
            r14 = r1
            r16 = r4
            r9.a(r10, r11, r12, r13, r14, r15, r16)
            r1.M()
            goto L_0x01ba
        L_0x0179:
            r20 = r14
            if (r6 != 0) goto L_0x017f
            if (r19 != 0) goto L_0x0181
        L_0x017f:
            if (r15 != 0) goto L_0x019e
        L_0x0181:
            r9 = -215701189(0xfffffffff324a93b, float:-1.3045793E31)
            r1.X(r9)
            androidx.compose.material.TwoLine r9 = androidx.compose.material.TwoLine.f8902a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r17 = r4 | r18
            r18 = 0
            r11 = r3
            r12 = r13
            r13 = r15
            r14 = r6
            r15 = r16
            r16 = r1
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.M()
            goto L_0x01ba
        L_0x019e:
            r9 = -215488839(0xfffffffff327e6b9, float:-1.3302508E31)
            r1.X(r9)
            androidx.compose.material.ThreeLine r9 = androidx.compose.material.ThreeLine.f8884a
            r4 = r4 & 112(0x70, float:1.57E-43)
            r17 = r4 | r18
            r18 = 0
            r11 = r3
            r12 = r13
            r13 = r15
            r14 = r6
            r15 = r16
            r16 = r1
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.M()
        L_0x01ba:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01c3
            androidx.compose.runtime.ComposerKt.X()
        L_0x01c3:
            r6 = r2
            r10 = r5
            r4 = r19
            r5 = r20
            r2 = r0
            goto L_0x01d6
        L_0x01cb:
            r1.B()
            r2 = r21
            r3 = r22
            r6 = r26
            r4 = r12
            r5 = r14
        L_0x01d6:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x01ee
            androidx.compose.material.ListItemKt$ListItem$1 r12 = new androidx.compose.material.ListItemKt$ListItem$1
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r10
            r7 = r27
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r12)
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.b(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(float f2, Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1062692685);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.h(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function2) ? 256 : 128;
        }
        boolean z2 = true;
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1062692685, i4, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:404)");
            }
            if ((i4 & 14) != 4) {
                z2 = false;
            }
            Object g2 = q2.g();
            if (z2 || g2 == Composer.f14567a.a()) {
                g2 = new ListItemKt$OffsetToBaselineOrCenter$1$1(f2);
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            int i6 = ((((i4 & 112) | ((i4 >> 6) & 14)) << 6) & 896) | 6;
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
            function2.m(q2, Integer.valueOf((i6 >> 6) & 14));
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ListItemKt$OffsetToBaselineOrCenter$2(f2, modifier2, function2, i2, i3));
        }
    }

    public static final Function2 f(TextStyle textStyle, float f2, Function2 function2) {
        if (function2 == null) {
            return null;
        }
        return ComposableLambdaKt.c(-830176860, true, new ListItemKt$applyTextStyle$1(f2, textStyle, new LineHeightStyle(LineHeightStyle.Alignment.f19061b.b(), LineHeightStyle.Trim.f19071b.a(), (DefaultConstructorMarker) null), function2));
    }
}
