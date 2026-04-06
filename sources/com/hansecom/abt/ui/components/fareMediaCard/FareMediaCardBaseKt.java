package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata
public final class FareMediaCardBaseKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f38202a = 1.6f;

    /* renamed from: b  reason: collision with root package name */
    public static final RoundedCornerShape f38203b = RoundedCornerShapeKt.d(Dp.m((float) 8));

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function3 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r9 = r26
            r10 = r28
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = -2089473971(0xffffffff8375284d, float:-7.204529E-37)
            r1 = r27
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r1 = r29 & 1
            r2 = 4
            if (r1 == 0) goto L_0x001d
            r3 = r10 | 6
            r4 = r3
            r3 = r24
            goto L_0x0031
        L_0x001d:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x002e
            r3 = r24
            boolean r4 = r8.W(r3)
            if (r4 == 0) goto L_0x002b
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r10
            goto L_0x0031
        L_0x002e:
            r3 = r24
            r4 = r10
        L_0x0031:
            r5 = r29 & 2
            r6 = 32
            if (r5 == 0) goto L_0x003c
            r4 = r4 | 48
        L_0x0039:
            r7 = r25
            goto L_0x004d
        L_0x003c:
            r7 = r10 & 48
            if (r7 != 0) goto L_0x0039
            r7 = r25
            boolean r11 = r8.l(r7)
            if (r11 == 0) goto L_0x004a
            r11 = r6
            goto L_0x004c
        L_0x004a:
            r11 = 16
        L_0x004c:
            r4 = r4 | r11
        L_0x004d:
            r11 = r29 & 4
            if (r11 == 0) goto L_0x0054
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r11 = r10 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0064
            boolean r11 = r8.l(r9)
            if (r11 == 0) goto L_0x0061
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r11
        L_0x0064:
            r11 = r4 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r11 != r12) goto L_0x0079
            boolean r11 = r8.t()
            if (r11 != 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r8.B()
            r1 = r3
            r2 = r7
            r11 = r8
            goto L_0x0136
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r3 = r1
        L_0x007e:
            r1 = 0
            if (r5 == 0) goto L_0x0082
            r7 = r1
        L_0x0082:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x008e
            r5 = -1
            java.lang.String r11 = "com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardBase (FareMediaCardBase.kt:21)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r5, r11)
        L_0x008e:
            r0 = 0
            r5 = 1
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.SizeKt.h(r3, r0, r5, r1)
            r0 = 0
            if (r7 == 0) goto L_0x0099
            r12 = r5
            goto L_0x009a
        L_0x0099:
            r12 = r0
        L_0x009a:
            r1 = 454596580(0x1b1897e4, float:1.2622224E-22)
            r8.X(r1)
            r1 = r4 & 112(0x70, float:1.57E-43)
            if (r1 != r6) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r5 = r0
        L_0x00a6:
            java.lang.Object r0 = r8.g()
            if (r5 != 0) goto L_0x00b4
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x00bc
        L_0x00b4:
            com.hansecom.abt.ui.components.fareMediaCard.a r0 = new com.hansecom.abt.ui.components.fareMediaCard.a
            r0.<init>(r7)
            r8.N(r0)
        L_0x00bc:
            r15 = r0
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r8.M()
            r16 = 6
            r17 = 0
            r13 = 0
            r14 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.f(r11, r12, r13, r14, r15, r16, r17)
            androidx.compose.foundation.shape.RoundedCornerShape r1 = f38203b
            androidx.compose.material3.CardDefaults r5 = androidx.compose.material3.CardDefaults.f9356a
            com.hansecom.abt.ui.theme.AbtTheme r6 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r14 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r11 = r6.b(r8, r14)
            long r12 = r11.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r6.b(r8, r14)
            long r15 = r6.g()
            int r6 = androidx.compose.material3.CardDefaults.f9357b
            int r21 = r6 << 12
            r22 = 12
            r17 = 0
            r19 = 0
            r11 = r5
            r23 = r14
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r8
            androidx.compose.material3.CardColors r21 = r11.b(r12, r14, r16, r18, r20, r21, r22)
            float r2 = (float) r2
            float r12 = androidx.compose.ui.unit.Dp.m(r2)
            int r2 = r6 << 18
            r19 = r2 | 6
            r20 = 62
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = r8
            androidx.compose.material3.CardElevation r5 = r11.c(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            int r2 = r4 << 9
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r11 = r2 | 48
            r12 = 16
            r4 = 0
            r2 = r21
            r13 = r3
            r3 = r5
            r5 = r26
            r6 = r8
            r14 = r7
            r7 = r11
            r11 = r8
            r8 = r12
            androidx.compose.material3.CardKt.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0134
            androidx.compose.runtime.ComposerKt.X()
        L_0x0134:
            r1 = r13
            r2 = r14
        L_0x0136:
            androidx.compose.runtime.ScopeUpdateScope r6 = r11.x()
            if (r6 == 0) goto L_0x014b
            com.hansecom.abt.ui.components.fareMediaCard.b r7 = new com.hansecom.abt.ui.components.fareMediaCard.b
            r0 = r7
            r3 = r26
            r4 = r28
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardBaseKt.c(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f40552a;
    }

    public static final Unit e(Modifier modifier, Function0 function0, Function3 function3, int i2, int i3, Composer composer, int i4) {
        c(modifier, function0, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final float f() {
        return f38202a;
    }

    public static final RoundedCornerShape g() {
        return f38203b;
    }
}
