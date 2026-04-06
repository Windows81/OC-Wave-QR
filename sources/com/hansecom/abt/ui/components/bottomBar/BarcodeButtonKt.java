package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class BarcodeButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r18, kotlin.jvm.functions.Function0 r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r18
            r2 = r19
            r4 = r22
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            r0 = -1223340283(0xffffffffb7154f05, float:-8.89949E-6)
            r3 = r21
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r5 = r23 & 1
            if (r5 == 0) goto L_0x001b
            r5 = r4 | 6
            goto L_0x002b
        L_0x001b:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002a
            boolean r5 = r3.d(r1)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r4
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            r6 = r23 & 2
            if (r6 == 0) goto L_0x0032
            r5 = r5 | 48
            goto L_0x0042
        L_0x0032:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0042
            boolean r6 = r3.l(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r23 & 4
            if (r6 == 0) goto L_0x004b
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r7 = r20
            goto L_0x005d
        L_0x004b:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0048
            r7 = r20
            boolean r8 = r3.W(r7)
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
            if (r8 != r9) goto L_0x006f
            boolean r8 = r3.t()
            if (r8 != 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            r3.B()
            goto L_0x010f
        L_0x006f:
            if (r6 == 0) goto L_0x0075
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            r15 = r6
            goto L_0x0076
        L_0x0075:
            r15 = r7
        L_0x0076:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0082
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.ui.components.bottomBar.BarcodeButton (BarcodeButton.kt:27)"
            androidx.compose.runtime.ComposerKt.Y(r0, r5, r6, r7)
        L_0x0082:
            r0 = 76
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            r5 = 12
            float r5 = (float) r5
            float r14 = androidx.compose.ui.unit.Dp.m(r5)
            r12 = 6
            if (r1 == 0) goto L_0x00a7
            r5 = 1887992610(0x70887b22, float:3.3791056E29)
            r3.X(r5)
            com.hansecom.abt.ui.theme.AbtTheme r5 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r5.b(r3, r12)
            long r5 = r5.x()
            r3.M()
            goto L_0x00ba
        L_0x00a7:
            r5 = 1888050146(0x70895be2, float:3.400842E29)
            r3.X(r5)
            com.hansecom.abt.ui.theme.AbtTheme r5 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r5 = r5.b(r3, r12)
            long r5 = r5.u()
            r3.M()
        L_0x00ba:
            r11 = 384(0x180, float:5.38E-43)
            r16 = 10
            r7 = 0
            java.lang.String r8 = "color"
            r9 = 0
            r10 = r3
            r13 = r12
            r12 = r16
            androidx.compose.runtime.State r5 = androidx.compose.animation.SingleValueAnimationKt.a(r5, r7, r8, r9, r10, r11, r12)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.o(r15, r0)
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r7 = r6.b(r3, r13)
            long r7 = r7.A()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r6.b(r3, r13)
            long r9 = r6.x()
            androidx.compose.foundation.shape.RoundedCornerShape r6 = androidx.compose.foundation.shape.RoundedCornerShapeKt.f()
            r11 = 2
            float r11 = (float) r11
            float r12 = androidx.compose.ui.unit.Dp.m(r11)
            com.hansecom.abt.ui.components.bottomBar.BarcodeButtonKt$BarcodeButton$1 r11 = new com.hansecom.abt.ui.components.bottomBar.BarcodeButtonKt$BarcodeButton$1
            r11.<init>(r1, r2, r14, r5)
            r5 = 54
            r13 = 1249094922(0x4a73ad0a, float:3992386.5)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r14, r11, r3, r5)
            r16 = 12779520(0xc30000, float:1.7907922E-38)
            r17 = 80
            r11 = 0
            r13 = 0
            r5 = r0
            r0 = r15
            r15 = r3
            androidx.compose.material3.SurfaceKt.c(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x010e
            androidx.compose.runtime.ComposerKt.X()
        L_0x010e:
            r7 = r0
        L_0x010f:
            androidx.compose.runtime.ScopeUpdateScope r6 = r3.x()
            if (r6 == 0) goto L_0x0127
            com.hansecom.abt.ui.components.bottomBar.a r8 = new com.hansecom.abt.ui.components.bottomBar.a
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r7
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.bottomBar.BarcodeButtonKt.b(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long c(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final Unit d(boolean z2, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        b(z2, function0, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
