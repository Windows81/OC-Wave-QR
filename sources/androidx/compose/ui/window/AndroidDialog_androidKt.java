package androidx.compose.ui.window;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidDialog_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function0 r24, androidx.compose.ui.window.DialogProperties r25, kotlin.jvm.functions.Function2 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r7 = r24
            r8 = r26
            r9 = r28
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r1 = r27
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r29 & 1
            r5 = 4
            if (r1 == 0) goto L_0x0017
            r1 = r9 | 6
            goto L_0x0027
        L_0x0017:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0026
            boolean r1 = r6.l(r7)
            if (r1 == 0) goto L_0x0023
            r1 = r5
            goto L_0x0024
        L_0x0023:
            r1 = 2
        L_0x0024:
            r1 = r1 | r9
            goto L_0x0027
        L_0x0026:
            r1 = r9
        L_0x0027:
            r2 = r29 & 2
            r4 = 32
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
        L_0x002f:
            r3 = r25
            goto L_0x0043
        L_0x0032:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x002f
            r3 = r25
            boolean r10 = r6.W(r3)
            if (r10 == 0) goto L_0x0040
            r10 = r4
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r1 = r1 | r10
        L_0x0043:
            r10 = r29 & 4
            if (r10 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r10 = r9 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005a
            boolean r10 = r6.l(r8)
            if (r10 == 0) goto L_0x0057
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r10
        L_0x005a:
            r10 = r1 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            r15 = 0
            r14 = 1
            if (r10 == r11) goto L_0x0064
            r10 = r14
            goto L_0x0065
        L_0x0064:
            r10 = r15
        L_0x0065:
            r11 = r1 & 1
            boolean r10 = r6.E(r10, r11)
            if (r10 == 0) goto L_0x018a
            if (r2 == 0) goto L_0x0081
            androidx.compose.ui.window.DialogProperties r2 = new androidx.compose.ui.window.DialogProperties
            r20 = 7
            r21 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r2
            r16.<init>((boolean) r17, (boolean) r18, (boolean) r19, (int) r20, (kotlin.jvm.internal.DefaultConstructorMarker) r21)
            r3 = r2
        L_0x0081:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x008d
            r2 = -1
            java.lang.String r10 = "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:177)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r10)
        L_0x008d:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r6.C(r0)
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r6.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r10 = r6.C(r10)
            r13 = r10
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.ui.unit.LayoutDirection) r13
            androidx.compose.runtime.CompositionContext r12 = androidx.compose.runtime.ComposablesKt.e(r6, r15)
            int r10 = r1 >> 6
            r10 = r10 & 14
            androidx.compose.runtime.State r11 = androidx.compose.runtime.SnapshotStateKt.p(r8, r6, r10)
            java.lang.Object[] r10 = new java.lang.Object[r15]
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1 r16 = androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1.f19271z
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = 6
            r19 = 0
            r20 = 0
            r22 = r11
            r11 = r19
            r23 = r12
            r12 = r20
            r25 = r13
            r13 = r16
            r14 = r6
            r15 = r17
            r16 = r18
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r10, r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = (java.util.UUID) r10
            boolean r11 = r6.W(r2)
            boolean r12 = r6.W(r0)
            r11 = r11 | r12
            java.lang.Object r12 = r6.g()
            if (r11 != 0) goto L_0x00fa
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x00f4
            goto L_0x00fa
        L_0x00f4:
            r13 = r1
            r15 = r3
            r14 = r5
            r11 = r6
            r2 = 1
            goto L_0x0126
        L_0x00fa:
            androidx.compose.ui.window.DialogWrapper r12 = new androidx.compose.ui.window.DialogWrapper
            r11 = r0
            r0 = r12
            r13 = r1
            r1 = r24
            r14 = r2
            r2 = r3
            r15 = r3
            r3 = r14
            r14 = r4
            r4 = r25
            r14 = r5
            r5 = r11
            r11 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
            r1 = r22
            r0.<init>(r1)
            r1 = 488261145(0x1d1a4619, float:2.041797E-21)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r1, r2, r0)
            r1 = r23
            r12.m(r1, r0)
            r11.N(r12)
        L_0x0126:
            androidx.compose.ui.window.DialogWrapper r12 = (androidx.compose.ui.window.DialogWrapper) r12
            boolean r0 = r11.l(r12)
            java.lang.Object r1 = r11.g()
            if (r0 != 0) goto L_0x013a
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0142
        L_0x013a:
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1 r1 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
            r1.<init>(r12)
            r11.N(r1)
        L_0x0142:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0 = 0
            androidx.compose.runtime.EffectsKt.c(r12, r1, r11, r0)
            boolean r1 = r11.l(r12)
            r3 = r13 & 14
            if (r3 != r14) goto L_0x0152
            r3 = r2
            goto L_0x0153
        L_0x0152:
            r3 = r0
        L_0x0153:
            r1 = r1 | r3
            r3 = r13 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r3 != r4) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r2 = r0
        L_0x015c:
            r1 = r1 | r2
            r10 = r25
            boolean r2 = r11.W(r10)
            r1 = r1 | r2
            java.lang.Object r2 = r11.g()
            if (r1 != 0) goto L_0x0172
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x017a
        L_0x0172:
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1 r2 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
            r2.<init>(r12, r7, r15, r10)
            r11.N(r2)
        L_0x017a:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            androidx.compose.runtime.EffectsKt.h(r2, r11, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0188
            androidx.compose.runtime.ComposerKt.X()
        L_0x0188:
            r2 = r15
            goto L_0x018f
        L_0x018a:
            r11 = r6
            r11.B()
            r2 = r3
        L_0x018f:
            androidx.compose.runtime.ScopeUpdateScope r6 = r11.x()
            if (r6 == 0) goto L_0x01a6
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3 r10 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
            r0 = r10
            r1 = r24
            r3 = r26
            r4 = r28
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r10)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidDialog_androidKt.a(kotlin.jvm.functions.Function0, androidx.compose.ui.window.DialogProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Function2 b(State state) {
        return (Function2) state.getValue();
    }

    public static final void c(Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1177876616);
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
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1177876616, i4, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:608)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = AndroidDialog_androidKt$DialogLayout$1.f19272a;
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
            Updater.g(b2, androidDialog_androidKt$DialogLayout$1, companion.c());
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
            x2.a(new AndroidDialog_androidKt$DialogLayout$2(modifier, function2, i2, i3));
        }
    }
}
