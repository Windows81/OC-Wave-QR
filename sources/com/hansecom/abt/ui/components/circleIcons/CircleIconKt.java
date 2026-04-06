package com.hansecom.abt.ui.components.circleIcons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.circleIcons.CircleIconStyle;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class CircleIconKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.hansecom.abt.ui.components.circleIcons.CircleIconStyle.Type r14, androidx.compose.ui.Modifier r15, int r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            r1 = r14
            r4 = r18
            r0 = 2
            r2 = 4
            java.lang.String r3 = "type"
            kotlin.jvm.internal.Intrinsics.i(r14, r3)
            r3 = 1216193412(0x487da384, float:259726.06)
            r5 = r17
            androidx.compose.runtime.Composer r13 = r5.q(r3)
            r5 = r19 & 1
            if (r5 == 0) goto L_0x001a
            r5 = r4 | 6
            goto L_0x002a
        L_0x001a:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0029
            boolean r5 = r13.W(r14)
            if (r5 == 0) goto L_0x0026
            r5 = r2
            goto L_0x0027
        L_0x0026:
            r5 = r0
        L_0x0027:
            r5 = r5 | r4
            goto L_0x002a
        L_0x0029:
            r5 = r4
        L_0x002a:
            r0 = r19 & 2
            if (r0 == 0) goto L_0x0032
            r5 = r5 | 48
        L_0x0030:
            r6 = r15
            goto L_0x0043
        L_0x0032:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0030
            r6 = r15
            boolean r7 = r13.W(r15)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r5 = r5 | r7
        L_0x0043:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005c
            r7 = r19 & 4
            if (r7 != 0) goto L_0x0056
            r7 = r16
            boolean r8 = r13.i(r7)
            if (r8 == 0) goto L_0x0058
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r7 = r16
        L_0x0058:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r5 = r5 | r8
            goto L_0x005e
        L_0x005c:
            r7 = r16
        L_0x005e:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0072
            boolean r8 = r13.t()
            if (r8 != 0) goto L_0x006b
            goto L_0x0072
        L_0x006b:
            r13.B()
            r2 = r6
            r3 = r7
            goto L_0x0176
        L_0x0072:
            r13.p()
            r8 = r4 & 1
            if (r8 == 0) goto L_0x008c
            boolean r8 = r13.J()
            if (r8 == 0) goto L_0x0080
            goto L_0x008c
        L_0x0080:
            r13.B()
            r0 = r19 & 4
            if (r0 == 0) goto L_0x0089
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0089:
            r0 = r6
        L_0x008a:
            r2 = r7
            goto L_0x00a2
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0092
        L_0x0091:
            r0 = r6
        L_0x0092:
            r2 = r19 & 4
            if (r2 == 0) goto L_0x008a
            r2 = r5 & 14
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle r2 = r14.a(r13, r2)
            int r2 = r2.c()
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a2:
            r13.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x00b1
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.ui.components.circleIcons.CircleIcon (CircleIcon.kt:25)"
            androidx.compose.runtime.ComposerKt.Y(r3, r5, r6, r7)
        L_0x00b1:
            r3 = r5 & 14
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle r3 = r14.a(r13, r3)
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r6 = r6.e()
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Size r7 = r3.d()
            float r7 = r7.f()
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.t(r0, r7)
            long r8 = r3.a()
            androidx.compose.foundation.shape.RoundedCornerShape r10 = androidx.compose.foundation.shape.RoundedCornerShapeKt.f()
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.BackgroundKt.a(r7, r8, r10)
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.BoxKt.g(r6, r8)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r13, r8)
            androidx.compose.runtime.CompositionLocalMap r9 = r13.I()
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.ComposedModifierKt.e(r13, r7)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r10.a()
            androidx.compose.runtime.Applier r12 = r13.v()
            if (r12 != 0) goto L_0x00f5
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00f5:
            r13.s()
            boolean r12 = r13.n()
            if (r12 == 0) goto L_0x0102
            r13.y(r11)
            goto L_0x0105
        L_0x0102:
            r13.K()
        L_0x0105:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r13)
            kotlin.jvm.functions.Function2 r12 = r10.c()
            androidx.compose.runtime.Updater.g(r11, r6, r12)
            kotlin.jvm.functions.Function2 r6 = r10.e()
            androidx.compose.runtime.Updater.g(r11, r9, r6)
            kotlin.jvm.functions.Function2 r6 = r10.b()
            boolean r9 = r11.n()
            if (r9 != 0) goto L_0x012f
            java.lang.Object r9 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r12)
            if (r9 != 0) goto L_0x013d
        L_0x012f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.N(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.A(r8, r6)
        L_0x013d:
            kotlin.jvm.functions.Function2 r6 = r10.d()
            androidx.compose.runtime.Updater.g(r11, r7, r6)
            androidx.compose.foundation.layout.BoxScopeInstance r6 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r5 = r5 >> 6
            r5 = r5 & 14
            androidx.compose.ui.graphics.painter.Painter r5 = androidx.compose.ui.res.PainterResources_androidKt.c(r2, r13, r5)
            long r8 = r3.b()
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Size r3 = r3.d()
            float r3 = r3.h()
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.t(r6, r3)
            r11 = 48
            r12 = 0
            r6 = 0
            r10 = r13
            androidx.compose.material3.IconKt.d(r5, r6, r7, r8, r10, r11, r12)
            r13.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0174
            androidx.compose.runtime.ComposerKt.X()
        L_0x0174:
            r3 = r2
            r2 = r0
        L_0x0176:
            androidx.compose.runtime.ScopeUpdateScope r6 = r13.x()
            if (r6 == 0) goto L_0x018a
            com.hansecom.abt.ui.components.circleIcons.a r7 = new com.hansecom.abt.ui.components.circleIcons.a
            r0 = r7
            r1 = r14
            r4 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.circleIcons.CircleIconKt.b(com.hansecom.abt.ui.components.circleIcons.CircleIconStyle$Type, androidx.compose.ui.Modifier, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(CircleIconStyle.Type type, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        b(type, modifier, i2, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }
}
