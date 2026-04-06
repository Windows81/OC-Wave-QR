package androidx.compose.foundation.contextmenu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ContextMenuUi_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PopupProperties f3270a = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final ContextMenuColors f3271b;

    static {
        Color.Companion companion = Color.f15975b;
        f3271b = new ContextMenuColors(companion.g(), companion.a(), companion.a(), Color.l(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.contextmenu.ContextMenuColors r28, androidx.compose.ui.Modifier r29, kotlin.jvm.functions.Function3 r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r3 = r30
            r4 = r32
            r0 = -921259293(0xffffffffc916b2e3, float:-617262.2)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r4 | 6
            r5 = r2
            r2 = r28
            goto L_0x002b
        L_0x0017:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r28
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r4
            goto L_0x002b
        L_0x0028:
            r2 = r28
            r5 = r4
        L_0x002b:
            r6 = r33 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r7 = r29
            goto L_0x0046
        L_0x0034:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r29
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r5 = r5 | r8
        L_0x0046:
            r8 = r33 & 4
            if (r8 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005d
        L_0x004d:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005d
            boolean r8 = r1.l(r3)
            if (r8 == 0) goto L_0x005a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r5 = r5 | r8
        L_0x005d:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            r10 = 0
            r11 = 1
            if (r8 == r9) goto L_0x0067
            r8 = r11
            goto L_0x0068
        L_0x0067:
            r8 = r10
        L_0x0068:
            r9 = r5 & 1
            boolean r8 = r1.E(r8, r9)
            if (r8 == 0) goto L_0x0166
            if (r6 == 0) goto L_0x0075
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0076
        L_0x0075:
            r6 = r7
        L_0x0076:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0082
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:147)"
            androidx.compose.runtime.ComposerKt.Y(r0, r5, r7, r8)
        L_0x0082:
            androidx.compose.foundation.contextmenu.ContextMenuSpec r0 = androidx.compose.foundation.contextmenu.ContextMenuSpec.f3252a
            float r13 = r0.h()
            float r7 = r0.c()
            androidx.compose.foundation.shape.RoundedCornerShape r14 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r7)
            r20 = 28
            r21 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r12 = r6
            androidx.compose.ui.Modifier r22 = androidx.compose.ui.draw.ShadowKt.b(r12, r13, r14, r15, r16, r18, r20, r21)
            long r23 = r28.a()
            r26 = 2
            r27 = 0
            r25 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.BackgroundKt.b(r22, r23, r25, r26, r27)
            androidx.compose.foundation.layout.IntrinsicSize r8 = androidx.compose.foundation.layout.IntrinsicSize.Max
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.IntrinsicKt.b(r7, r8)
            float r0 = r0.i()
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.PaddingKt.k(r7, r9, r0, r11, r8)
            androidx.compose.foundation.ScrollState r13 = androidx.compose.foundation.ScrollKt.c(r10, r1, r10, r11)
            r17 = 14
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ScrollKt.g(r12, r13, r14, r15, r16, r17, r18)
            int r5 = r5 << 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r7.g()
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r8 = r8.k()
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.ColumnKt.a(r7, r8, r1, r10)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r1, r10)
            androidx.compose.runtime.CompositionLocalMap r9 = r1.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r1, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r10.a()
            androidx.compose.runtime.Applier r12 = r1.v()
            if (r12 != 0) goto L_0x00fb
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00fb:
            r1.s()
            boolean r12 = r1.n()
            if (r12 == 0) goto L_0x0108
            r1.y(r11)
            goto L_0x010b
        L_0x0108:
            r1.K()
        L_0x010b:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r12 = r10.c()
            androidx.compose.runtime.Updater.g(r11, r7, r12)
            kotlin.jvm.functions.Function2 r7 = r10.e()
            androidx.compose.runtime.Updater.g(r11, r9, r7)
            kotlin.jvm.functions.Function2 r7 = r10.b()
            boolean r9 = r11.n()
            if (r9 != 0) goto L_0x0135
            java.lang.Object r9 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r12)
            if (r9 != 0) goto L_0x0143
        L_0x0135:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.N(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.A(r8, r7)
        L_0x0143:
            kotlin.jvm.functions.Function2 r7 = r10.d()
            androidx.compose.runtime.Updater.g(r11, r0, r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            int r5 = r5 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.d(r0, r1, r5)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x016a
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x016a
        L_0x0166:
            r1.B()
            r6 = r7
        L_0x016a:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x0182
            androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuColumn$1 r8 = new androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuColumn$1
            r0 = r8
            r1 = r28
            r2 = r6
            r3 = r30
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.a(androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r26, boolean r27, androidx.compose.foundation.contextmenu.ContextMenuColors r28, androidx.compose.ui.Modifier r29, kotlin.jvm.functions.Function3 r30, kotlin.jvm.functions.Function0 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r7 = r27
            r8 = r31
            r9 = r33
            r0 = 16
            r1 = 32
            r2 = 4
            r3 = 791018367(0x2f25fb7f, float:1.5096012E-10)
            r4 = r32
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r10 = 1
            r4 = r34 & 1
            r11 = 2
            if (r4 == 0) goto L_0x001f
            r4 = r9 | 6
            r14 = r26
            goto L_0x0031
        L_0x001f:
            r4 = r9 & 6
            r14 = r26
            if (r4 != 0) goto L_0x0030
            boolean r4 = r15.W(r14)
            if (r4 == 0) goto L_0x002d
            r4 = r2
            goto L_0x002e
        L_0x002d:
            r4 = r11
        L_0x002e:
            r4 = r4 | r9
            goto L_0x0031
        L_0x0030:
            r4 = r9
        L_0x0031:
            r5 = r34 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0046
        L_0x0038:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0046
            boolean r5 = r15.d(r7)
            if (r5 == 0) goto L_0x0044
            r5 = r1
            goto L_0x0045
        L_0x0044:
            r5 = r0
        L_0x0045:
            r4 = r4 | r5
        L_0x0046:
            r2 = r34 & 4
            if (r2 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
            r13 = r28
            goto L_0x0061
        L_0x004f:
            r2 = r9 & 384(0x180, float:5.38E-43)
            r13 = r28
            if (r2 != 0) goto L_0x0061
            boolean r2 = r15.W(r13)
            if (r2 == 0) goto L_0x005e
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r2
        L_0x0061:
            r2 = r34 & 8
            if (r2 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r5 = r29
            goto L_0x007c
        L_0x006a:
            r5 = r9 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r29
            boolean r6 = r15.W(r5)
            if (r6 == 0) goto L_0x0079
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r6
        L_0x007c:
            r0 = r34 & 16
            if (r0 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r6 = r30
            goto L_0x0097
        L_0x0085:
            r6 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0082
            r6 = r30
            boolean r12 = r15.l(r6)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r12
        L_0x0097:
            r12 = r34 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x00a1
            r4 = r4 | r16
        L_0x009f:
            r12 = r4
            goto L_0x00b2
        L_0x00a1:
            r12 = r9 & r16
            if (r12 != 0) goto L_0x009f
            boolean r12 = r15.l(r8)
            if (r12 == 0) goto L_0x00ae
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r4 = r4 | r12
            goto L_0x009f
        L_0x00b2:
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r12
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r4 == r11) goto L_0x00bd
            r4 = r10
            goto L_0x00be
        L_0x00bd:
            r4 = 0
        L_0x00be:
            r11 = r12 & 1
            boolean r4 = r15.E(r4, r11)
            if (r4 == 0) goto L_0x02dc
            if (r2 == 0) goto L_0x00cd
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r23 = r2
            goto L_0x00cf
        L_0x00cd:
            r23 = r5
        L_0x00cf:
            r11 = 0
            if (r0 == 0) goto L_0x00d4
            r5 = r11
            goto L_0x00d6
        L_0x00d4:
            r5 = r30
        L_0x00d6:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00e2
            r0 = -1
            java.lang.String r2 = "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:185)"
            androidx.compose.runtime.ComposerKt.Y(r3, r12, r0, r2)
        L_0x00e2:
            androidx.compose.foundation.contextmenu.ContextMenuSpec r4 = androidx.compose.foundation.contextmenu.ContextMenuSpec.f3252a
            androidx.compose.ui.Alignment$Vertical r3 = r4.f()
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r2 = r4.d()
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r2 = r0.n(r2)
            r0 = r12 & 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L_0x00f8
            r0 = r10
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r12
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r6) goto L_0x0102
            r1 = r10
            goto L_0x0103
        L_0x0102:
            r1 = 0
        L_0x0103:
            r0 = r0 | r1
            java.lang.Object r1 = r15.g()
            if (r0 != 0) goto L_0x0112
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x011a
        L_0x0112:
            androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1 r1 = new androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
            r1.<init>(r7, r8)
            r15.N(r1)
        L_0x011a:
            r6 = r1
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r16 = 4
            r18 = 0
            r19 = 0
            r0 = r23
            r1 = r27
            r24 = r2
            r2 = r26
            r25 = r3
            r3 = r19
            r29 = r4
            r4 = r6
            r6 = r5
            r5 = r16
            r14 = r6
            r6 = r18
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.f(r0, r1, r2, r3, r4, r5, r6)
            r1 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r1, r10, r11)
            float r2 = r29.b()
            float r3 = r29.a()
            float r4 = r29.g()
            float r5 = r29.g()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.w(r0, r2, r4, r3, r5)
            float r2 = r29.d()
            r3 = 2
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.k(r0, r2, r1, r3, r11)
            r1 = 54
            r3 = r24
            r2 = r25
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.RowKt.b(r3, r2, r15, r1)
            r2 = 0
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r2)
            androidx.compose.runtime.CompositionLocalMap r4 = r15.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r15, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r11 = r15.v()
            if (r11 != 0) goto L_0x0184
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0184:
            r15.s()
            boolean r11 = r15.n()
            if (r11 == 0) goto L_0x0191
            r15.y(r6)
            goto L_0x0194
        L_0x0191:
            r15.K()
        L_0x0194:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r11 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r1, r11)
            kotlin.jvm.functions.Function2 r1 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x01be
            java.lang.Object r4 = r6.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r11)
            if (r4 != 0) goto L_0x01cc
        L_0x01be:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r1)
        L_0x01cc:
            kotlin.jvm.functions.Function2 r1 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r0, r1)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            if (r14 != 0) goto L_0x01e2
            r1 = 554788141(0x2111652d, float:4.9261816E-19)
            r15.X(r1)
        L_0x01dd:
            r15.M()
            goto L_0x0291
        L_0x01e2:
            r1 = 554788142(0x2111652e, float:4.926182E-19)
            r15.X(r1)
            androidx.compose.ui.Modifier$Companion r16 = androidx.compose.ui.Modifier.f15489d
            float r17 = r29.e()
            float r19 = r29.e()
            float r20 = r29.e()
            r21 = 2
            r22 = 0
            r18 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.r(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.o()
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.g(r3, r2)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r15, r2)
            androidx.compose.runtime.CompositionLocalMap r6 = r15.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            kotlin.jvm.functions.Function0 r11 = r5.a()
            androidx.compose.runtime.Applier r16 = r15.v()
            if (r16 != 0) goto L_0x0223
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0223:
            r15.s()
            boolean r16 = r15.n()
            if (r16 == 0) goto L_0x0230
            r15.y(r11)
            goto L_0x0233
        L_0x0230:
            r15.K()
        L_0x0233:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r10 = r5.c()
            androidx.compose.runtime.Updater.g(r11, r3, r10)
            kotlin.jvm.functions.Function2 r3 = r5.e()
            androidx.compose.runtime.Updater.g(r11, r6, r3)
            kotlin.jvm.functions.Function2 r3 = r5.b()
            boolean r6 = r11.n()
            if (r6 != 0) goto L_0x025d
            java.lang.Object r6 = r11.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r10)
            if (r6 != 0) goto L_0x026b
        L_0x025d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r11.N(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.A(r4, r3)
        L_0x026b:
            kotlin.jvm.functions.Function2 r3 = r5.d()
            androidx.compose.runtime.Updater.g(r11, r1, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            if (r7 == 0) goto L_0x027b
            long r3 = r28.d()
            goto L_0x027f
        L_0x027b:
            long r3 = r28.b()
        L_0x027f:
            androidx.compose.ui.graphics.Color r1 = androidx.compose.ui.graphics.Color.h(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.d(r1, r15, r2)
            r15.T()
            kotlin.Unit r1 = kotlin.Unit.f40552a
            goto L_0x01dd
        L_0x0291:
            if (r7 == 0) goto L_0x029a
            long r1 = r28.e()
        L_0x0297:
            r3 = r29
            goto L_0x029f
        L_0x029a:
            long r1 = r28.c()
            goto L_0x0297
        L_0x029f:
            androidx.compose.ui.text.TextStyle r1 = r3.j(r1)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            androidx.compose.ui.Modifier r11 = r0.a(r2, r3, r4)
            r0 = r12 & 14
            r2 = 1572864(0x180000, float:2.204052E-39)
            r21 = r0 | r2
            r22 = 952(0x3b8, float:1.334E-42)
            r0 = 0
            r2 = 0
            r3 = 0
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r10 = r26
            r12 = r1
            r13 = r0
            r0 = r14
            r14 = r2
            r1 = r15
            r15 = r3
            r20 = r1
            androidx.compose.foundation.text.BasicTextKt.f(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1.T()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x02d8
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d8:
            r5 = r0
            r4 = r23
            goto L_0x02e3
        L_0x02dc:
            r1 = r15
            r1.B()
            r4 = r5
            r5 = r30
        L_0x02e3:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x02fe
            androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3 r11 = new androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
            r0 = r11
            r1 = r26
            r2 = r27
            r3 = r28
            r6 = r31
            r7 = r33
            r8 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x02fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.b(java.lang.String, boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.window.PopupPositionProvider r16, kotlin.jvm.functions.Function0 r17, androidx.compose.ui.Modifier r18, androidx.compose.foundation.contextmenu.ContextMenuColors r19, kotlin.jvm.functions.Function1 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r4 = r19
            r5 = r20
            r6 = r22
            r0 = 1447189339(0x56425b5b, float:5.3424406E13)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r6 | 6
            r3 = r2
            r2 = r16
            goto L_0x002d
        L_0x0019:
            r2 = r6 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r16
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r6
            goto L_0x002d
        L_0x002a:
            r2 = r16
            r3 = r6
        L_0x002d:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0036
            r3 = r3 | 48
            r14 = r17
            goto L_0x0048
        L_0x0036:
            r7 = r6 & 48
            r14 = r17
            if (r7 != 0) goto L_0x0048
            boolean r7 = r1.l(r14)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r3 = r3 | r7
        L_0x0048:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r18
            goto L_0x0063
        L_0x0051:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r18
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r1.W(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r9
        L_0x007a:
            r9 = r23 & 16
            if (r9 == 0) goto L_0x0081
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x0081:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0091
            boolean r9 = r1.l(r5)
            if (r9 == 0) goto L_0x008e
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r3 = r3 | r9
        L_0x0091:
            r9 = r3 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            r11 = 1
            if (r9 == r10) goto L_0x009a
            r9 = r11
            goto L_0x009b
        L_0x009a:
            r9 = 0
        L_0x009b:
            r10 = r3 & 1
            boolean r9 = r1.E(r9, r10)
            if (r9 == 0) goto L_0x00e2
            if (r7 == 0) goto L_0x00a9
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r15 = r7
            goto L_0x00aa
        L_0x00a9:
            r15 = r8
        L_0x00aa:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00b6
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:124)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r7, r8)
        L_0x00b6:
            androidx.compose.ui.window.PopupProperties r9 = f3270a
            androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2 r0 = new androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
            r0.<init>(r4, r15, r5)
            r7 = 54
            r8 = 795909757(0x2f709e7d, float:2.1884179E-10)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r11, r0, r1, r7)
            r0 = r3 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r3 = r3 & 112(0x70, float:1.57E-43)
            r12 = r0 | r3
            r13 = 0
            r7 = r16
            r8 = r17
            r11 = r1
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00e0
            androidx.compose.runtime.ComposerKt.X()
        L_0x00e0:
            r3 = r15
            goto L_0x00e6
        L_0x00e2:
            r1.B()
            r3 = r8
        L_0x00e6:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x0101
            androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3 r9 = new androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
            r0 = r9
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.c(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.contextmenu.ContextMenuColors, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(PopupPositionProvider popupPositionProvider, Function0 function0, Modifier modifier, Function1 function1, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(712057293);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(popupPositionProvider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function0) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.W(modifier) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= q2.l(function1) ? 2048 : 1024;
        }
        if (q2.E((i4 & 1171) != 1170, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(712057293, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:106)");
            }
            c(popupPositionProvider, function0, modifier, e(0, 0, q2, 0, 3), function1, q2, (i4 & 1022) | ((i4 << 3) & 57344), 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ContextMenuUi_androidKt$ContextMenuPopup$1(popupPositionProvider, function0, modifier2, function1, i2, i3));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.foundation.contextmenu.ContextMenuColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.compose.foundation.contextmenu.ContextMenuColors} */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r5 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0052;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.contextmenu.ContextMenuColors e(int r20, int r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r0 = r22
            r1 = r24 & 1
            if (r1 == 0) goto L_0x000a
            r1 = 16973958(0x1030086, float:2.4061276E-38)
            goto L_0x000c
        L_0x000a:
            r1 = r20
        L_0x000c:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0014
            r2 = 16973952(0x1030080, float:2.406126E-38)
            goto L_0x0016
        L_0x0014:
            r2 = r21
        L_0x0016:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0027
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:363)"
            r5 = 1689505294(0x64b3ce0e, float:2.653452E22)
            r6 = r23
            androidx.compose.runtime.ComposerKt.Y(r5, r6, r3, r4)
        L_0x0027:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r0.C(r3)
            android.content.Context r3 = (android.content.Context) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r4 = r0.C(r4)
            android.content.res.Configuration r4 = (android.content.res.Configuration) r4
            boolean r5 = r0.W(r3)
            boolean r4 = r0.W(r4)
            r4 = r4 | r5
            java.lang.Object r5 = r22.g()
            if (r4 != 0) goto L_0x0052
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0084
        L_0x0052:
            androidx.compose.foundation.contextmenu.ContextMenuColors r4 = f3271b
            long r5 = r4.a()
            r7 = 16842801(0x1010031, float:2.3693695E-38)
            long r9 = h(r3, r1, r7, r5)
            r1 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r1 = i(r3, r2, r1)
            long r2 = r4.e()
            long r13 = g(r1, r2)
            long r2 = r4.c()
            long r17 = f(r1, r2)
            androidx.compose.foundation.contextmenu.ContextMenuColors r5 = new androidx.compose.foundation.contextmenu.ContextMenuColors
            r19 = 0
            r8 = r5
            r11 = r13
            r15 = r17
            r8.<init>(r9, r11, r13, r15, r17, r19)
            r0.N(r5)
        L_0x0084:
            androidx.compose.foundation.contextmenu.ContextMenuColors r5 = (androidx.compose.foundation.contextmenu.ContextMenuColors) r5
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x008f
            androidx.compose.runtime.ComposerKt.X()
        L_0x008f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.e(int, int, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.contextmenu.ContextMenuColors");
    }

    public static final long f(ColorStateList colorStateList, long j2) {
        int j3 = ColorKt.j(j2);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, j3)) : null;
        return (valueOf == null || valueOf.intValue() == j3) ? j2 : ColorKt.b(valueOf.intValue());
    }

    public static final long g(ColorStateList colorStateList, long j2) {
        int j3 = ColorKt.j(j2);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{16842910}, j3)) : null;
        return (valueOf == null || valueOf.intValue() == j3) ? j2 : ColorKt.b(valueOf.intValue());
    }

    public static final long h(Context context, int i2, int i3, long j2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        int j3 = ColorKt.j(j2);
        int color = obtainStyledAttributes.getColor(0, j3);
        obtainStyledAttributes.recycle();
        return color == j3 ? j2 : ColorKt.b(color);
    }

    public static final ColorStateList i(Context context, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }
}
