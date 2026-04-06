package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class FareCappingConcludedCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.hansecom.abt.ui.components.fareCapping.FareCappingCardState.Concluded r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r0 = r30
            r1 = r33
            r2 = r34
            java.lang.String r3 = "state"
            kotlin.jvm.internal.Intrinsics.i(r0, r3)
            r3 = 1242039768(0x4a0805d8, float:2228598.0)
            r4 = r32
            androidx.compose.runtime.Composer r14 = r4.q(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r14.W(r0)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r1
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0035
            r4 = r4 | 48
        L_0x0031:
            r6 = r31
        L_0x0033:
            r15 = r4
            goto L_0x0048
        L_0x0035:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r31
            boolean r7 = r14.W(r6)
            if (r7 == 0) goto L_0x0044
            r7 = 32
            goto L_0x0046
        L_0x0044:
            r7 = 16
        L_0x0046:
            r4 = r4 | r7
            goto L_0x0033
        L_0x0048:
            r4 = r15 & 19
            r7 = 18
            if (r4 != r7) goto L_0x005a
            boolean r4 = r14.t()
            if (r4 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r14.B()
            goto L_0x00ec
        L_0x005a:
            if (r5 == 0) goto L_0x0061
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r16 = r4
            goto L_0x0063
        L_0x0061:
            r16 = r6
        L_0x0063:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x006f
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.ui.components.fareCapping.FareCappingConcludedCard (FareCappingConcludedCard.kt:33)"
            androidx.compose.runtime.ComposerKt.Y(r3, r15, r4, r5)
        L_0x006f:
            androidx.compose.material3.CardDefaults r3 = androidx.compose.material3.CardDefaults.f9356a
            r13 = 1
            float r4 = (float) r13
            float r5 = androidx.compose.ui.unit.Dp.m(r4)
            int r12 = androidx.compose.material3.CardDefaults.f9357b
            int r4 = r12 << 18
            r11 = 6
            r17 = r4 | 6
            r18 = 62
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r3
            r11 = r14
            r19 = r12
            r12 = r17
            r1 = r13
            r13 = r18
            androidx.compose.material3.CardElevation r7 = r4.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 8
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.foundation.shape.RoundedCornerShape r5 = androidx.compose.foundation.shape.RoundedCornerShapeKt.d(r4)
            r4 = r19
            androidx.compose.material3.CardColors r19 = r3.a(r14, r4)
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r4 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r6 = r3.b(r14, r4)
            long r20 = r6.x()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r14, r4)
            long r22 = r3.o()
            r28 = 12
            r29 = 0
            r24 = 0
            r26 = 0
            androidx.compose.material3.CardColors r6 = androidx.compose.material3.CardColors.d(r19, r20, r22, r24, r26, r28, r29)
            com.hansecom.abt.ui.components.fareCapping.FareCappingConcludedCardKt$FareCappingConcludedCard$1 r3 = new com.hansecom.abt.ui.components.fareCapping.FareCappingConcludedCardKt$FareCappingConcludedCard$1
            r3.<init>(r0)
            r4 = 54
            r8 = 1074052902(0x4004bf26, float:2.0741668)
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r1, r3, r14, r4)
            int r1 = r15 >> 3
            r1 = r1 & 14
            r3 = 196608(0x30000, float:2.75506E-40)
            r11 = r1 | r3
            r12 = 16
            r8 = 0
            r4 = r16
            r10 = r14
            androidx.compose.material3.CardKt.c(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00ea
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ea:
            r6 = r16
        L_0x00ec:
            androidx.compose.runtime.ScopeUpdateScope r1 = r14.x()
            if (r1 == 0) goto L_0x00fc
            com.hansecom.abt.ui.components.fareCapping.a r3 = new com.hansecom.abt.ui.components.fareCapping.a
            r4 = r33
            r3.<init>(r0, r6, r4, r2)
            r1.a(r3)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareCapping.FareCappingConcludedCardKt.b(com.hansecom.abt.ui.components.fareCapping.FareCappingCardState$Concluded, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(FareCappingCardState.Concluded concluded, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        b(concluded, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
