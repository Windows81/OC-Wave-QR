package com.hansecom.abt.ui.components.listItem;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class MenuItemCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r25, kotlin.jvm.functions.Function0 r26, androidx.compose.ui.graphics.painter.Painter r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.painter.Painter r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r31
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "leftIcon"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            r0 = 1849279379(0x6e39c393, float:1.437279E28)
            r1 = r30
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0027
            r1 = r9 | 6
            goto L_0x0037
        L_0x0027:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0036
            boolean r1 = r14.W(r6)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r9
            goto L_0x0037
        L_0x0036:
            r1 = r9
        L_0x0037:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x003e
            r1 = r1 | 48
            goto L_0x004e
        L_0x003e:
            r2 = r9 & 48
            if (r2 != 0) goto L_0x004e
            boolean r2 = r14.l(r7)
            if (r2 == 0) goto L_0x004b
            r2 = 32
            goto L_0x004d
        L_0x004b:
            r2 = 16
        L_0x004d:
            r1 = r1 | r2
        L_0x004e:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0065
            boolean r2 = r14.l(r8)
            if (r2 == 0) goto L_0x0062
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r2
        L_0x0065:
            r2 = r32 & 8
            if (r2 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r3 = r28
            goto L_0x0080
        L_0x006e:
            r3 = r9 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006b
            r3 = r28
            boolean r4 = r14.W(r3)
            if (r4 == 0) goto L_0x007d
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r4
        L_0x0080:
            r4 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0099
            r4 = r32 & 16
            if (r4 != 0) goto L_0x0093
            r4 = r29
            boolean r5 = r14.l(r4)
            if (r5 == 0) goto L_0x0095
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r4 = r29
        L_0x0095:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r5
            goto L_0x009b
        L_0x0099:
            r4 = r29
        L_0x009b:
            r5 = r1 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r10) goto L_0x00b0
            boolean r5 = r14.t()
            if (r5 != 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            r14.B()
            r5 = r4
            r2 = r14
            r4 = r3
            goto L_0x0148
        L_0x00b0:
            r14.p()
            r5 = r9 & 1
            r10 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x00ce
            boolean r5 = r14.J()
            if (r5 == 0) goto L_0x00c1
            goto L_0x00ce
        L_0x00c1:
            r14.B()
            r2 = r32 & 16
            if (r2 == 0) goto L_0x00c9
            r1 = r1 & r10
        L_0x00c9:
            r23 = r3
        L_0x00cb:
            r24 = r4
            goto L_0x00e8
        L_0x00ce:
            if (r2 == 0) goto L_0x00d3
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00d4
        L_0x00d3:
            r2 = r3
        L_0x00d4:
            r3 = r32 & 16
            if (r3 == 0) goto L_0x00e5
            int r3 = com.hansecom.abt.R.drawable.f33014p
            r4 = 0
            androidx.compose.ui.graphics.painter.Painter r3 = androidx.compose.ui.res.PainterResources_androidKt.c(r3, r14, r4)
            r1 = r1 & r10
            r23 = r2
            r24 = r3
            goto L_0x00e8
        L_0x00e5:
            r23 = r2
            goto L_0x00cb
        L_0x00e8:
            r14.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00f7
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.listItem.MenuItemCard (MenuItemCard.kt:29)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x00f7:
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r1 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r0 = r0.b(r14, r1)
            long r12 = r0.A()
            r0 = 8
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.foundation.shape.RoundedCornerShape r11 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r0)
            com.hansecom.abt.ui.components.listItem.MenuItemCardKt$MenuItemCard$1 r10 = new com.hansecom.abt.ui.components.listItem.MenuItemCardKt$MenuItemCard$1
            r0 = r10
            r1 = r25
            r2 = r23
            r3 = r26
            r4 = r27
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = -1450556904(0xffffffffa98a4218, float:-6.1398965E-14)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r10, r14, r0)
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = 121(0x79, float:1.7E-43)
            r10 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r2 = r14
            r14 = r0
            r20 = r2
            androidx.compose.material3.SurfaceKt.c(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0144
            androidx.compose.runtime.ComposerKt.X()
        L_0x0144:
            r4 = r23
            r5 = r24
        L_0x0148:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.x()
            if (r10 == 0) goto L_0x0161
            com.hansecom.abt.ui.components.listItem.l r11 = new com.hansecom.abt.ui.components.listItem.l
            r0 = r11
            r1 = r25
            r2 = r26
            r3 = r27
            r6 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.a(r11)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.MenuItemCardKt.b(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(String str, Function0 function0, Painter painter, Modifier modifier, Painter painter2, int i2, int i3, Composer composer, int i4) {
        b(str, function0, painter, modifier, painter2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
