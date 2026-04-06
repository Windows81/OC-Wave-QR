package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareCappingInProgressCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.hansecom.abt.ui.components.fareCapping.FareCappingCardState.InProgress r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r0 = r30
            r1 = r33
            r2 = r34
            java.lang.String r3 = "state"
            kotlin.jvm.internal.Intrinsics.i(r0, r3)
            r3 = 1366011725(0x516baf4d, float:6.3266148E10)
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
            java.lang.String r5 = "com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCard (FareCappingInProgressCard.kt:46)"
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
            long r20 = r6.A()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r14, r4)
            long r22 = r3.q()
            r28 = 12
            r29 = 0
            r24 = 0
            r26 = 0
            androidx.compose.material3.CardColors r6 = androidx.compose.material3.CardColors.d(r19, r20, r22, r24, r26, r28, r29)
            com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt$FareCappingInProgressCard$1 r3 = new com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt$FareCappingInProgressCard$1
            r3.<init>(r0)
            r4 = 54
            r8 = 506186559(0x1e2bcb3f, float:9.094695E-21)
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
            com.hansecom.abt.ui.components.fareCapping.b r3 = new com.hansecom.abt.ui.components.fareCapping.b
            r4 = r33
            r3.<init>(r0, r6, r4, r2)
            r1.a(r3)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt.e(com.hansecom.abt.ui.components.fareCapping.FareCappingCardState$InProgress, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(FareCappingCardState.InProgress inProgress, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        e(inProgress, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(androidx.compose.ui.Modifier r17, float r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = 13178161(0xc91531, float:1.8466537E-38)
            r4 = r19
            androidx.compose.runtime.Composer r15 = r4.q(r3)
            r4 = r2 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.W(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 4
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.h(r1)
            if (r6 == 0) goto L_0x002e
            r6 = r7
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r4 = r4 | r6
        L_0x0031:
            r6 = r4 & 19
            r8 = 18
            if (r6 != r8) goto L_0x0045
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x003e
            goto L_0x0045
        L_0x003e:
            r15.B()
            r16 = r15
            goto L_0x0144
        L_0x0045:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0051
            r6 = -1
            java.lang.String r8 = "com.hansecom.abt.ui.components.fareCapping.Progressbar (FareCappingInProgressCard.kt:128)"
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r6, r8)
        L_0x0051:
            r3 = -263523751(0xfffffffff04af259, float:-2.512358E29)
            r15.X(r3)
            java.lang.Object r3 = r15.g()
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r13.a()
            r14 = 0
            r11 = 0
            if (r3 != r6) goto L_0x0070
            java.lang.Float r3 = java.lang.Float.valueOf(r14)
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r3, r11, r5, r11)
            r15.N(r3)
        L_0x0070:
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            r15.M()
            java.lang.Float r5 = java.lang.Float.valueOf(r18)
            r6 = -263521350(0xfffffffff04afbba, float:-2.5128116E29)
            r15.X(r6)
            r6 = r4 & 112(0x70, float:1.57E-43)
            r10 = 1
            if (r6 != r7) goto L_0x0086
            r6 = r10
            goto L_0x0087
        L_0x0086:
            r6 = 0
        L_0x0087:
            java.lang.Object r7 = r15.g()
            if (r6 != 0) goto L_0x0093
            java.lang.Object r6 = r13.a()
            if (r7 != r6) goto L_0x009b
        L_0x0093:
            com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt$Progressbar$1$1 r7 = new com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt$Progressbar$1$1
            r7.<init>(r1, r3, r11)
            r15.N(r7)
        L_0x009b:
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r15.M()
            int r4 = r4 >> 3
            r4 = r4 & 14
            androidx.compose.runtime.EffectsKt.g(r5, r7, r15, r4)
            float r4 = i(r3)
            r3 = 3072(0xc00, float:4.305E-42)
            r16 = 22
            r5 = 0
            r6 = 0
            java.lang.String r7 = "percentage"
            r8 = 0
            r9 = r15
            r12 = r10
            r10 = r3
            r3 = r11
            r11 = r16
            androidx.compose.runtime.State r4 = androidx.compose.animation.core.AnimateAsStateKt.d(r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.h(r0, r14, r12, r3)
            float r3 = (float) r12
            float r7 = androidx.compose.ui.unit.Dp.m(r3)
            r10 = 13
            r11 = 0
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m(r5, r6, r7, r8, r9, r10, r11)
            r5 = 4
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.i(r3, r5)
            r3 = -8
            float r3 = (float) r3
            float r11 = androidx.compose.ui.unit.Dp.m(r3)
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r6 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r15, r6)
            long r8 = r3.u()
            r3 = -263509980(0xfffffffff04b2824, float:-2.5149594E29)
            r15.X(r3)
            boolean r3 = r15.W(r4)
            java.lang.Object r6 = r15.g()
            if (r3 != 0) goto L_0x0101
            java.lang.Object r3 = r13.a()
            if (r6 != r3) goto L_0x0109
        L_0x0101:
            com.hansecom.abt.ui.components.fareCapping.c r6 = new com.hansecom.abt.ui.components.fareCapping.c
            r6.<init>(r4)
            r15.N(r6)
        L_0x0109:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.M()
            r3 = -263508336(0xfffffffff04b2e90, float:-2.5152699E29)
            r15.X(r3)
            java.lang.Object r3 = r15.g()
            java.lang.Object r6 = r13.a()
            if (r3 != r6) goto L_0x0127
            com.hansecom.abt.ui.components.fareCapping.d r3 = new com.hansecom.abt.ui.components.fareCapping.d
            r3.<init>()
            r15.N(r3)
        L_0x0127:
            r12 = r3
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r15.M()
            r14 = 1769472(0x1b0000, float:2.479558E-39)
            r3 = 20
            r6 = 0
            r10 = 0
            r13 = r15
            r16 = r15
            r15 = r3
            androidx.compose.material3.ProgressIndicatorKt.v(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0144
            androidx.compose.runtime.ComposerKt.X()
        L_0x0144:
            androidx.compose.runtime.ScopeUpdateScope r3 = r16.x()
            if (r3 == 0) goto L_0x0152
            com.hansecom.abt.ui.components.fareCapping.e r4 = new com.hansecom.abt.ui.components.fareCapping.e
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareCapping.FareCappingInProgressCardKt.g(androidx.compose.ui.Modifier, float, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit h(Modifier modifier, float f2, int i2, Composer composer, int i3) {
        g(modifier, f2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final float i(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    public static final void j(MutableState mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    public static final float k(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float l(State state) {
        return k(state);
    }

    public static final Unit m(DrawScope drawScope) {
        Intrinsics.i(drawScope, "$this$LinearProgressIndicator");
        return Unit.f40552a;
    }
}
