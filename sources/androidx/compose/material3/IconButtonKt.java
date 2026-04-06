package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IconButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function0 r19, androidx.compose.ui.Modifier r20, boolean r21, androidx.compose.material3.IconButtonColors r22, androidx.compose.foundation.interaction.MutableInteractionSource r23, androidx.compose.ui.graphics.Shape r24, kotlin.jvm.functions.Function2 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r8 = r27
            r0 = 1413012038(0x5438da46, float:3.17574401E12)
            r1 = r26
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r28 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 6
            r3 = r2
            r2 = r19
            goto L_0x0029
        L_0x0015:
            r2 = r8 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r19
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r8
            goto L_0x0029
        L_0x0026:
            r2 = r19
            r3 = r8
        L_0x0029:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r20
            goto L_0x0044
        L_0x0032:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r20
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r28 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r21
            goto L_0x005f
        L_0x004d:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r21
            boolean r9 = r1.d(r7)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r8 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0078
            r9 = r28 & 8
            if (r9 != 0) goto L_0x0072
            r9 = r22
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r9 = r22
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r10
            goto L_0x007a
        L_0x0078:
            r9 = r22
        L_0x007a:
            r10 = r28 & 16
            if (r10 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r11 = r23
            goto L_0x0095
        L_0x0083:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0080
            r11 = r23
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0092
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r12
        L_0x0095:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x00af
            r12 = r28 & 32
            if (r12 != 0) goto L_0x00a9
            r12 = r24
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x00ab
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00a9:
            r12 = r24
        L_0x00ab:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r3 = r3 | r13
            goto L_0x00b1
        L_0x00af:
            r12 = r24
        L_0x00b1:
            r13 = r28 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00bb
            r3 = r3 | r14
            r15 = r25
            goto L_0x00cd
        L_0x00bb:
            r13 = r8 & r14
            r15 = r25
            if (r13 != 0) goto L_0x00cd
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00ca
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r13
        L_0x00cd:
            r13 = 599187(0x92493, float:8.3964E-40)
            r13 = r13 & r3
            r14 = 599186(0x92492, float:8.39638E-40)
            r16 = 1
            if (r13 == r14) goto L_0x00db
            r13 = r16
            goto L_0x00dc
        L_0x00db:
            r13 = 0
        L_0x00dc:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x017e
            r1.p()
            r13 = r8 & 1
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r13 == 0) goto L_0x010c
            boolean r13 = r1.J()
            if (r13 == 0) goto L_0x00f5
            goto L_0x010c
        L_0x00f5:
            r1.B()
            r4 = r28 & 8
            if (r4 == 0) goto L_0x00fe
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00fe:
            r4 = r28 & 32
            if (r4 == 0) goto L_0x0103
            r3 = r3 & r14
        L_0x0103:
            r4 = r5
        L_0x0104:
            r5 = r11
            r6 = r12
        L_0x0106:
            r18 = r9
            r9 = r3
            r3 = r18
            goto L_0x0136
        L_0x010c:
            if (r4 == 0) goto L_0x0111
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0112
        L_0x0111:
            r4 = r5
        L_0x0112:
            if (r6 == 0) goto L_0x0116
            r7 = r16
        L_0x0116:
            r5 = r28 & 8
            r6 = 6
            if (r5 == 0) goto L_0x0124
            androidx.compose.material3.IconButtonDefaults r5 = androidx.compose.material3.IconButtonDefaults.f10121a
            androidx.compose.material3.IconButtonColors r5 = r5.e(r1, r6)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r9 = r5
        L_0x0124:
            if (r10 == 0) goto L_0x0128
            r5 = 0
            r11 = r5
        L_0x0128:
            r5 = r28 & 32
            if (r5 == 0) goto L_0x0104
            androidx.compose.material3.IconButtonDefaults r5 = androidx.compose.material3.IconButtonDefaults.f10121a
            androidx.compose.ui.graphics.Shape r5 = r5.d(r1, r6)
            r3 = r3 & r14
            r6 = r5
            r5 = r11
            goto L_0x0106
        L_0x0136:
            r1.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0145
            r10 = -1
            java.lang.String r11 = "androidx.compose.material3.IconButton (IconButton.kt:151)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r10, r11)
        L_0x0145:
            int r0 = r9 >> 3
            r0 = r0 & 14
            int r10 = r9 << 3
            r11 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 | r11
            r11 = r9 & 896(0x380, float:1.256E-42)
            r0 = r0 | r11
            int r11 = r9 >> 6
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            r0 = r0 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r0 = r0 | r10
            r10 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r10
            r17 = r0 | r9
            r9 = r4
            r10 = r19
            r11 = r7
            r12 = r6
            r13 = r3
            r14 = r5
            r15 = r25
            r16 = r1
            g(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x017b
            androidx.compose.runtime.ComposerKt.X()
        L_0x017b:
            r9 = r3
            r3 = r7
            goto L_0x0185
        L_0x017e:
            r1.B()
            r4 = r5
            r3 = r7
            r5 = r11
            r6 = r12
        L_0x0185:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x019e
            androidx.compose.material3.W2 r11 = new androidx.compose.material3.W2
            r0 = r11
            r1 = r19
            r2 = r4
            r4 = r9
            r7 = r25
            r8 = r27
            r9 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.e(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.IconButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(Function0 function0, Modifier modifier, boolean z2, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i2, int i3, Composer composer, int i4) {
        e(function0, modifier, z2, iconButtonColors, mutableInteractionSource, shape, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void g(Modifier modifier, Function0 function0, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3 = z2;
        Shape shape2 = shape;
        IconButtonColors iconButtonColors2 = iconButtonColors;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        Function2 function22 = function2;
        int i4 = i2;
        Composer q2 = composer.q(-1134296466);
        Modifier modifier2 = modifier;
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        Function0 function02 = function0;
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(shape2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.W(iconButtonColors2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.W(mutableInteractionSource3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.l(function22) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (q2.E((599187 & i5) != 599186, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1134296466, i5, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:171)");
            }
            if (mutableInteractionSource3 == null) {
                q2.X(977045485);
                Object g2 = q2.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = InteractionSourceKt.a();
                    q2.N(g2);
                }
                q2.M();
                mutableInteractionSource2 = (MutableInteractionSource) g2;
            } else {
                q2.X(862800938);
                q2.M();
                mutableInteractionSource2 = mutableInteractionSource3;
            }
            int i6 = i5;
            Modifier c2 = ChildParentSemanticsKt.c(ClickableKt.d(BackgroundKt.a(ClipKt.a(SizeKt.u(InteractiveComponentSizeKt.h(modifier), IconButtonDefaults.j(IconButtonDefaults.f10121a, 0, 1, (Object) null)), shape2), iconButtonColors2.a(z3), shape2), mutableInteractionSource2, RippleKt.e(false, 0.0f, 0, 7, (Object) null), z2, (String) null, Role.j(Role.f18040b.a()), function0, 8, (Object) null), (Function1) null, 1, (Object) null);
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.e(), false);
            composer2 = q2;
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer2.I();
            Modifier e2 = ComposedModifierKt.e(composer2, c2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a3);
            } else {
                composer2.K();
            }
            Composer b2 = Updater.b(composer2);
            Updater.g(b2, g3, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(iconButtonColors2.b(z3))), function22, composer2, ProvidedValue.f14769i | ((i6 >> 15) & 112));
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            Y2 y2 = r0;
            Y2 y22 = new Y2(modifier, function0, z2, shape, iconButtonColors, mutableInteractionSource, function2, i2);
            x2.a(y2);
        }
    }

    public static final Unit h(Modifier modifier, Function0 function0, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i2, Composer composer, int i3) {
        g(modifier, function0, z2, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(boolean r22, kotlin.jvm.functions.Function1 r23, androidx.compose.ui.Modifier r24, boolean r25, androidx.compose.material3.IconToggleButtonColors r26, androidx.compose.foundation.interaction.MutableInteractionSource r27, androidx.compose.ui.graphics.Shape r28, kotlin.jvm.functions.Function2 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r9 = r31
            r10 = r32
            r0 = -1031402037(0xffffffffc2860dcb, float:-67.02694)
            r1 = r30
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r22
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r22
            boolean r3 = r1.d(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r22
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r23
            goto L_0x0046
        L_0x0034:
            r4 = r9 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r23
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r24
            goto L_0x0061
        L_0x004f:
            r6 = r9 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r24
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r10 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r25
            goto L_0x007c
        L_0x006a:
            r8 = r9 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r25
            boolean r11 = r1.d(r8)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0095
            r11 = r10 & 16
            if (r11 != 0) goto L_0x008f
            r11 = r26
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0091
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r11 = r26
        L_0x0091:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r12
            goto L_0x0097
        L_0x0095:
            r11 = r26
        L_0x0097:
            r12 = r10 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x00a1
            r3 = r3 | r13
        L_0x009e:
            r13 = r27
            goto L_0x00b2
        L_0x00a1:
            r13 = r13 & r9
            if (r13 != 0) goto L_0x009e
            r13 = r27
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00af
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r14
        L_0x00b2:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00cc
            r14 = r10 & 64
            if (r14 != 0) goto L_0x00c6
            r14 = r28
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00c8
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r14 = r28
        L_0x00c8:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r15
            goto L_0x00ce
        L_0x00cc:
            r14 = r28
        L_0x00ce:
            r15 = r10 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto L_0x00d9
            r3 = r3 | r16
        L_0x00d6:
            r15 = r29
            goto L_0x00ec
        L_0x00d9:
            r15 = r9 & r16
            if (r15 != 0) goto L_0x00d6
            r15 = r29
            boolean r16 = r1.l(r15)
            if (r16 == 0) goto L_0x00e8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r3 = r3 | r16
        L_0x00ec:
            r16 = 4793491(0x492493, float:6.717112E-39)
            r0 = r3 & r16
            r2 = 4793490(0x492492, float:6.71711E-39)
            r16 = 1
            if (r0 == r2) goto L_0x00fb
            r0 = r16
            goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x018e
            r1.p()
            r0 = r9 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x012b
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0118
            goto L_0x012b
        L_0x0118:
            r1.B()
            r0 = r10 & 16
            if (r0 == 0) goto L_0x0121
            r3 = r3 & r18
        L_0x0121:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0126
            r3 = r3 & r2
        L_0x0126:
            r5 = r3
            r0 = r11
            r2 = r13
            r3 = r14
            goto L_0x0155
        L_0x012b:
            if (r5 == 0) goto L_0x0130
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r6 = r0
        L_0x0130:
            if (r7 == 0) goto L_0x0134
            r8 = r16
        L_0x0134:
            r0 = r10 & 16
            r5 = 6
            if (r0 == 0) goto L_0x0142
            androidx.compose.material3.IconButtonDefaults r0 = androidx.compose.material3.IconButtonDefaults.f10121a
            androidx.compose.material3.IconToggleButtonColors r0 = r0.g(r1, r5)
            r3 = r3 & r18
            r11 = r0
        L_0x0142:
            if (r12 == 0) goto L_0x0146
            r0 = 0
            r13 = r0
        L_0x0146:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0126
            androidx.compose.material3.IconButtonDefaults r0 = androidx.compose.material3.IconButtonDefaults.f10121a
            androidx.compose.ui.graphics.Shape r0 = r0.d(r1, r5)
            r3 = r3 & r2
            r5 = r3
            r2 = r13
            r3 = r0
            r0 = r11
        L_0x0155:
            r1.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0167
            r7 = -1
            java.lang.String r11 = "androidx.compose.material3.IconToggleButton (IconButton.kt:299)"
            r12 = -1031402037(0xffffffffc2860dcb, float:-67.02694)
            androidx.compose.runtime.ComposerKt.Y(r12, r5, r7, r11)
        L_0x0167:
            r7 = 33554430(0x1fffffe, float:9.4039537E-38)
            r20 = r5 & r7
            r21 = 0
            r11 = r22
            r12 = r23
            r13 = r6
            r14 = r8
            r15 = r0
            r16 = r2
            r17 = r3
            r18 = r29
            r19 = r1
            k(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0189
            androidx.compose.runtime.ComposerKt.X()
        L_0x0189:
            r5 = r0
            r7 = r3
            r3 = r6
            r6 = r2
            goto L_0x0195
        L_0x018e:
            r1.B()
            r3 = r6
            r5 = r11
            r6 = r13
            r7 = r14
        L_0x0195:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x01af
            androidx.compose.material3.X2 r12 = new androidx.compose.material3.X2
            r0 = r12
            r1 = r22
            r2 = r23
            r4 = r8
            r8 = r29
            r9 = r31
            r10 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.i(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit j(boolean z2, Function1 function1, Modifier modifier, boolean z3, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i2, int i3, Composer composer, int i4) {
        i(z2, function1, modifier, z3, iconToggleButtonColors, mutableInteractionSource, shape, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(boolean r27, kotlin.jvm.functions.Function1 r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.material3.IconToggleButtonColors r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, androidx.compose.ui.graphics.Shape r33, kotlin.jvm.functions.Function2 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r7 = r27
            r8 = r34
            r9 = r36
            r10 = r37
            r0 = 128(0x80, float:1.794E-43)
            r1 = 32
            r2 = 2
            r3 = 4
            r4 = 16
            r5 = 6
            r6 = 1724745099(0x66cd858b, float:4.8527428E23)
            r11 = r35
            androidx.compose.runtime.Composer r11 = r11.q(r6)
            r12 = 1
            r13 = r10 & 1
            if (r13 == 0) goto L_0x0022
            r13 = r9 | 6
            goto L_0x0032
        L_0x0022:
            r13 = r9 & 6
            if (r13 != 0) goto L_0x0031
            boolean r13 = r11.d(r7)
            if (r13 == 0) goto L_0x002e
            r13 = r3
            goto L_0x002f
        L_0x002e:
            r13 = r2
        L_0x002f:
            r13 = r13 | r9
            goto L_0x0032
        L_0x0031:
            r13 = r9
        L_0x0032:
            r2 = r2 & r10
            if (r2 == 0) goto L_0x003a
            r13 = r13 | 48
            r14 = r28
            goto L_0x004a
        L_0x003a:
            r2 = r9 & 48
            r14 = r28
            if (r2 != 0) goto L_0x004a
            boolean r2 = r11.l(r14)
            if (r2 == 0) goto L_0x0048
            r2 = r1
            goto L_0x0049
        L_0x0048:
            r2 = r4
        L_0x0049:
            r13 = r13 | r2
        L_0x004a:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x0053
            r13 = r13 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r3 = r29
            goto L_0x0064
        L_0x0053:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0050
            r3 = r29
            boolean r15 = r11.W(r3)
            if (r15 == 0) goto L_0x0062
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0062:
            r15 = r0
        L_0x0063:
            r13 = r13 | r15
        L_0x0064:
            r15 = r10 & 8
            if (r15 == 0) goto L_0x006d
            r13 = r13 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r6 = r30
            goto L_0x0080
        L_0x006d:
            r6 = r9 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x006a
            r6 = r30
            boolean r17 = r11.d(r6)
            if (r17 == 0) goto L_0x007c
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r13 = r13 | r17
        L_0x0080:
            r5 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x009a
            r5 = r10 & 16
            if (r5 != 0) goto L_0x0093
            r5 = r31
            boolean r18 = r11.W(r5)
            if (r18 == 0) goto L_0x0095
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r5 = r31
        L_0x0095:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r13 = r13 | r18
            goto L_0x009c
        L_0x009a:
            r5 = r31
        L_0x009c:
            r1 = r1 & r10
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a6
            r13 = r13 | r18
            r4 = r32
            goto L_0x00b9
        L_0x00a6:
            r18 = r9 & r18
            r4 = r32
            if (r18 != 0) goto L_0x00b9
            boolean r19 = r11.W(r4)
            if (r19 == 0) goto L_0x00b5
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r13 = r13 | r19
        L_0x00b9:
            r19 = 1572864(0x180000, float:2.204052E-39)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x00d3
            r19 = r10 & 64
            r12 = r33
            if (r19 != 0) goto L_0x00ce
            boolean r19 = r11.W(r12)
            if (r19 == 0) goto L_0x00ce
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r13 = r13 | r19
            goto L_0x00d5
        L_0x00d3:
            r12 = r33
        L_0x00d5:
            r0 = r0 & r10
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dd
            r13 = r13 | r19
            goto L_0x00ed
        L_0x00dd:
            r0 = r9 & r19
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r11.l(r8)
            if (r0 == 0) goto L_0x00ea
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r13 = r13 | r0
        L_0x00ed:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r13
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r3) goto L_0x00f9
            r0 = 1
        L_0x00f7:
            r3 = 1
            goto L_0x00fb
        L_0x00f9:
            r0 = 0
            goto L_0x00f7
        L_0x00fb:
            r12 = r13 & 1
            boolean r0 = r11.E(r0, r12)
            if (r0 == 0) goto L_0x02b1
            r11.p()
            r0 = r9 & 1
            r3 = 0
            r12 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0131
            boolean r0 = r11.J()
            if (r0 == 0) goto L_0x0118
            goto L_0x0131
        L_0x0118:
            r11.B()
            r0 = 16
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0122
            r13 = r13 & r20
        L_0x0122:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x0127
            r13 = r13 & r12
        L_0x0127:
            r12 = r29
        L_0x0129:
            r18 = r4
            r15 = r5
            r5 = r13
            r13 = r6
            r6 = r33
            goto L_0x0164
        L_0x0131:
            if (r2 == 0) goto L_0x0136
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0138
        L_0x0136:
            r0 = r29
        L_0x0138:
            r2 = 16
            if (r15 == 0) goto L_0x013d
            r6 = 1
        L_0x013d:
            r2 = r2 & r10
            if (r2 == 0) goto L_0x014b
            androidx.compose.material3.IconButtonDefaults r2 = androidx.compose.material3.IconButtonDefaults.f10121a
            r15 = 6
            androidx.compose.material3.IconToggleButtonColors r2 = r2.h(r11, r15)
            r13 = r13 & r20
            r5 = r2
            goto L_0x014c
        L_0x014b:
            r15 = 6
        L_0x014c:
            if (r1 == 0) goto L_0x014f
            r4 = r3
        L_0x014f:
            r1 = r10 & 64
            if (r1 == 0) goto L_0x0162
            androidx.compose.material3.IconButtonDefaults r1 = androidx.compose.material3.IconButtonDefaults.f10121a
            androidx.compose.ui.graphics.Shape r1 = r1.d(r11, r15)
            r13 = r13 & r12
            r12 = r0
            r18 = r4
            r15 = r5
            r5 = r13
            r13 = r6
            r6 = r1
            goto L_0x0164
        L_0x0162:
            r12 = r0
            goto L_0x0129
        L_0x0164:
            r11.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0176
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)"
            r2 = 1724745099(0x66cd858b, float:4.8527428E23)
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r0, r1)
        L_0x0176:
            if (r18 != 0) goto L_0x0198
            r0 = 1187972528(0x46cf05b0, float:26498.844)
            r11.X(r0)
            java.lang.Object r0 = r11.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0191
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r11.N(r0)
        L_0x0191:
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r11.M()
            r2 = r0
            goto L_0x01a3
        L_0x0198:
            r0 = -377320953(0xffffffffe9828a07, float:-1.9726522E25)
            r11.X(r0)
            r11.M()
            r2 = r18
        L_0x01a3:
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.InteractiveComponentSizeKt.h(r12)
            androidx.compose.material3.IconButtonDefaults r1 = androidx.compose.material3.IconButtonDefaults.f10121a
            r4 = 1
            r9 = 0
            long r3 = androidx.compose.material3.IconButtonDefaults.j(r1, r9, r4, r3)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.u(r0, r3)
            androidx.compose.ui.Modifier r20 = androidx.compose.ui.draw.ClipKt.a(r0, r6)
            int r0 = r5 >> 9
            r0 = r0 & 14
            int r1 = r5 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = 6
            int r1 = r5 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r9 = r0 | r1
            androidx.compose.runtime.State r0 = r15.a(r13, r7, r11, r9)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r21 = r0.v()
            r24 = 2
            r25 = 0
            r23 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.b(r20, r21, r23, r24, r25)
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.c()
            r24 = 7
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.foundation.IndicationNodeFactory r3 = androidx.compose.material3.RippleKt.e(r20, r21, r22, r24, r25)
            androidx.compose.ui.semantics.Role r16 = androidx.compose.ui.semantics.Role.j(r1)
            r1 = r27
            r4 = r13
            r17 = r5
            r5 = r16
            r16 = r6
            r6 = r28
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.a(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.e()
            r2 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r2)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r11, r2)
            androidx.compose.runtime.CompositionLocalMap r3 = r11.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r11, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r11.v()
            if (r6 != 0) goto L_0x022a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x022a:
            r11.s()
            boolean r6 = r11.n()
            if (r6 == 0) goto L_0x0237
            r11.y(r5)
            goto L_0x023a
        L_0x0237:
            r11.K()
        L_0x023a:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r11)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r3, r1)
            kotlin.jvm.functions.Function2 r1 = r4.b()
            boolean r3 = r5.n()
            if (r3 != 0) goto L_0x0264
            java.lang.Object r3 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r6)
            if (r3 != 0) goto L_0x0272
        L_0x0264:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.N(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.A(r2, r1)
        L_0x0272:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.runtime.State r0 = r15.b(r13, r7, r11, r9)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r0 = r0.v()
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.material3.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r0 = androidx.compose.ui.graphics.Color.h(r0)
            androidx.compose.runtime.ProvidedValue r0 = r2.d(r0)
            int r1 = androidx.compose.runtime.ProvidedValue.f14769i
            int r2 = r17 >> 18
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            androidx.compose.runtime.CompositionLocalKt.c(r0, r8, r11, r1)
            r11.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02ab
            androidx.compose.runtime.ComposerKt.X()
        L_0x02ab:
            r3 = r12
            r4 = r13
            r5 = r15
            r6 = r18
            goto L_0x02bd
        L_0x02b1:
            r11.B()
            r3 = r29
            r16 = r33
            r26 = r6
            r6 = r4
            r4 = r26
        L_0x02bd:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x02d8
            androidx.compose.material3.Z2 r12 = new androidx.compose.material3.Z2
            r0 = r12
            r1 = r27
            r2 = r28
            r7 = r16
            r8 = r34
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconButtonKt.k(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.IconToggleButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit l(boolean z2, Function1 function1, Modifier modifier, boolean z3, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i2, int i3, Composer composer, int i4) {
        k(z2, function1, modifier, z3, iconToggleButtonColors, mutableInteractionSource, shape, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
