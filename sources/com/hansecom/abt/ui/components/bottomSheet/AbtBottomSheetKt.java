package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata
public final class AbtBottomSheetKt {

    /* renamed from: a  reason: collision with root package name */
    public static final RoundedCornerShape f38023a;

    static {
        float f2 = (float) 8;
        float f3 = (float) 0;
        f38023a = RoundedCornerShapeKt.e(Dp.m(f2), Dp.m(f2), Dp.m(f3), Dp.m(f3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.material3.SheetState r29, java.lang.String r30, long r31, long r33, androidx.compose.ui.graphics.Shape r35, kotlin.jvm.functions.Function2 r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function3 r38, kotlin.jvm.functions.Function3 r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r13 = r29
            r8 = r30
            r9 = r37
            r6 = r39
            r7 = r41
            r5 = r42
            java.lang.String r0 = "sheetState"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            r0 = 689608317(0x291a967d, float:3.4325397E-14)
            r1 = r40
            androidx.compose.runtime.Composer r2 = r1.q(r0)
            r1 = r5 & 1
            if (r1 == 0) goto L_0x0030
            r1 = r7 | 6
            goto L_0x0040
        L_0x0030:
            r1 = r7 & 6
            if (r1 != 0) goto L_0x003f
            boolean r1 = r2.W(r13)
            if (r1 == 0) goto L_0x003c
            r1 = 4
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r1 = r1 | r7
            goto L_0x0040
        L_0x003f:
            r1 = r7
        L_0x0040:
            r4 = r5 & 2
            if (r4 == 0) goto L_0x0047
            r1 = r1 | 48
            goto L_0x0057
        L_0x0047:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x0057
            boolean r4 = r2.W(r8)
            if (r4 == 0) goto L_0x0054
            r4 = 32
            goto L_0x0056
        L_0x0054:
            r4 = 16
        L_0x0056:
            r1 = r1 | r4
        L_0x0057:
            r4 = r7 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x006e
            r4 = r5 & 4
            r10 = r31
            if (r4 != 0) goto L_0x006a
            boolean r4 = r2.j(r10)
            if (r4 == 0) goto L_0x006a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r1 = r1 | r4
            goto L_0x0070
        L_0x006e:
            r10 = r31
        L_0x0070:
            r4 = r7 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0087
            r4 = r5 & 8
            r14 = r33
            if (r4 != 0) goto L_0x0083
            boolean r4 = r2.j(r14)
            if (r4 == 0) goto L_0x0083
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r1 = r1 | r4
            goto L_0x0089
        L_0x0087:
            r14 = r33
        L_0x0089:
            r4 = r5 & 16
            if (r4 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008f:
            r12 = r35
            goto L_0x00a5
        L_0x0092:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x008f
            r12 = r35
            boolean r16 = r2.W(r12)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r16
        L_0x00a5:
            r16 = r5 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00b0
            r1 = r1 | r17
            r3 = r36
            goto L_0x00c3
        L_0x00b0:
            r17 = r7 & r17
            r3 = r36
            if (r17 != 0) goto L_0x00c3
            boolean r17 = r2.l(r3)
            if (r17 == 0) goto L_0x00bf
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r1 = r1 | r17
        L_0x00c3:
            r17 = r5 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00cc
            r1 = r1 | r19
            goto L_0x00dd
        L_0x00cc:
            r17 = r7 & r19
            if (r17 != 0) goto L_0x00dd
            boolean r17 = r2.l(r9)
            if (r17 == 0) goto L_0x00d9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r17
        L_0x00dd:
            r0 = r5 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e8
            r1 = r1 | r19
            r3 = r38
            goto L_0x00fb
        L_0x00e8:
            r19 = r7 & r19
            r3 = r38
            if (r19 != 0) goto L_0x00fb
            boolean r19 = r2.l(r3)
            if (r19 == 0) goto L_0x00f7
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r1 = r1 | r19
        L_0x00fb:
            r3 = r5 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0104
            r1 = r1 | r19
            goto L_0x0114
        L_0x0104:
            r3 = r7 & r19
            if (r3 != 0) goto L_0x0114
            boolean r3 = r2.l(r6)
            if (r3 == 0) goto L_0x0111
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x0111:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r1 = r1 | r3
        L_0x0114:
            r3 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r3 & r1
            r10 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r10) goto L_0x0133
            boolean r3 = r2.t()
            if (r3 != 0) goto L_0x0124
            goto L_0x0133
        L_0x0124:
            r2.B()
            r3 = r31
            r8 = r36
            r10 = r38
            r28 = r2
            r7 = r12
            r5 = r14
            goto L_0x02c9
        L_0x0133:
            r2.p()
            r3 = r7 & 1
            r10 = 0
            r11 = 6
            if (r3 == 0) goto L_0x015e
            boolean r3 = r2.J()
            if (r3 == 0) goto L_0x0143
            goto L_0x015e
        L_0x0143:
            r2.B()
            r0 = r5 & 4
            if (r0 == 0) goto L_0x014c
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014c:
            r0 = r5 & 8
            if (r0 == 0) goto L_0x0152
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0152:
            r21 = r31
            r26 = r36
            r27 = r38
            r0 = r1
            r25 = r12
            r23 = r14
            goto L_0x01a3
        L_0x015e:
            r3 = r5 & 4
            if (r3 == 0) goto L_0x016f
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r2, r11)
            long r19 = r3.z()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0171
        L_0x016f:
            r19 = r31
        L_0x0171:
            r3 = r5 & 8
            if (r3 == 0) goto L_0x0181
            com.hansecom.abt.ui.theme.AbtTheme r3 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r3 = r3.b(r2, r11)
            long r14 = r3.q()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0181:
            if (r4 == 0) goto L_0x0186
            androidx.compose.foundation.shape.RoundedCornerShape r3 = f38023a
            goto L_0x0187
        L_0x0186:
            r3 = r12
        L_0x0187:
            if (r16 == 0) goto L_0x018b
            r4 = r10
            goto L_0x018d
        L_0x018b:
            r4 = r36
        L_0x018d:
            if (r0 == 0) goto L_0x019b
            r0 = r1
            r25 = r3
            r26 = r4
            r27 = r10
        L_0x0196:
            r23 = r14
            r21 = r19
            goto L_0x01a3
        L_0x019b:
            r27 = r38
            r0 = r1
            r25 = r3
            r26 = r4
            goto L_0x0196
        L_0x01a3:
            r2.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01b5
            r1 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheet (AbtBottomSheet.kt:58)"
            r4 = 689608317(0x291a967d, float:3.4325397E-14)
            androidx.compose.runtime.ComposerKt.Y(r4, r0, r1, r3)
        L_0x01b5:
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r1 = r2.C(r1)
            androidx.compose.ui.focus.FocusManager r1 = (androidx.compose.ui.focus.FocusManager) r1
            java.lang.Object r3 = r2.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r4.a()
            if (r3 != r12) goto L_0x01d4
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r3 = androidx.compose.runtime.EffectsKt.j(r3, r2)
            r2.N(r3)
        L_0x01d4:
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            r12 = 1273233151(0x4be3feff, float:2.9883902E7)
            r2.X(r12)
            boolean r12 = r2.l(r3)
            r14 = r0 & 14
            r15 = 4
            if (r14 != r15) goto L_0x01e7
            r14 = 1
            goto L_0x01e8
        L_0x01e7:
            r14 = 0
        L_0x01e8:
            r12 = r12 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r0
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != r15) goto L_0x01f2
            r14 = 1
            goto L_0x01f3
        L_0x01f2:
            r14 = 0
        L_0x01f3:
            r12 = r12 | r14
            java.lang.Object r14 = r2.g()
            if (r12 != 0) goto L_0x0200
            java.lang.Object r12 = r4.a()
            if (r14 != r12) goto L_0x0208
        L_0x0200:
            com.hansecom.abt.ui.components.bottomSheet.b r14 = new com.hansecom.abt.ui.components.bottomSheet.b
            r14.<init>(r3, r13, r9)
            r2.N(r14)
        L_0x0208:
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            r2.M()
            kotlin.Unit r3 = kotlin.Unit.f40552a
            r12 = 1273238214(0x4be412c6, float:2.9894028E7)
            r2.X(r12)
            boolean r12 = r2.l(r1)
            java.lang.Object r15 = r2.g()
            if (r12 != 0) goto L_0x0225
            java.lang.Object r4 = r4.a()
            if (r15 != r4) goto L_0x022d
        L_0x0225:
            com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt$AbtBottomSheet$1$1 r15 = new com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt$AbtBottomSheet$1$1
            r15.<init>(r1, r10)
            r2.N(r15)
        L_0x022d:
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r2.M()
            androidx.compose.runtime.EffectsKt.g(r3, r15, r2, r11)
            r1 = 1273242507(0x4be4238b, float:2.9902614E7)
            r2.X(r1)
            if (r27 != 0) goto L_0x024e
            com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt$AbtBottomSheet$headerComposable$1 r1 = new com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt$AbtBottomSheet$headerComposable$1
            r1.<init>(r8, r14)
            r3 = 54
            r4 = -1327789989(0xffffffffb0db885b, float:-1.5973102E-9)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r10, r1, r2, r3)
            r3 = r1
            goto L_0x0250
        L_0x024e:
            r3 = r27
        L_0x0250:
            r2.M()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.layout.WindowInsets$Companion r4 = androidx.compose.foundation.layout.WindowInsets.f4206a
            androidx.compose.foundation.layout.WindowInsets r4 = androidx.compose.foundation.layout.WindowInsets_androidKt.e(r4, r2, r11)
            androidx.compose.foundation.layout.WindowInsetsSides$Companion r10 = androidx.compose.foundation.layout.WindowInsetsSides.f4266b
            int r10 = r10.k()
            androidx.compose.foundation.layout.WindowInsets r4 = androidx.compose.foundation.layout.WindowInsetsKt.j(r4, r10)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.e(r1, r4)
            com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt$AbtBottomSheet$2 r4 = new com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt$AbtBottomSheet$2
            r4.<init>(r3, r14, r6)
            r3 = 54
            r10 = 1137724507(0x43d04c5b, float:416.59653)
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r11, r4, r2, r3)
            int r3 = r0 >> 18
            r3 = r3 & 14
            int r4 = r0 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r4 = r0 << 3
            r10 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r10
            r3 = r3 | r4
            int r4 = r0 << 12
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r4
            r3 = r3 | r10
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r10
            r18 = r3 | r4
            int r0 = r0 >> 15
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r19 = r0
            r20 = 6936(0x1b18, float:9.72E-42)
            r3 = 0
            r4 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r0 = r37
            r28 = r2
            r2 = r29
            r5 = r25
            r6 = r21
            r8 = r23
            r13 = r26
            r17 = r28
            androidx.compose.material3.ModalBottomSheetKt.s(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02bf
            androidx.compose.runtime.ComposerKt.X()
        L_0x02bf:
            r3 = r21
            r5 = r23
            r7 = r25
            r8 = r26
            r10 = r27
        L_0x02c9:
            androidx.compose.runtime.ScopeUpdateScope r14 = r28.x()
            if (r14 == 0) goto L_0x02e4
            com.hansecom.abt.ui.components.bottomSheet.c r15 = new com.hansecom.abt.ui.components.bottomSheet.c
            r0 = r15
            r1 = r29
            r2 = r30
            r9 = r37
            r11 = r39
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            r14.a(r15)
        L_0x02e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt.e(androidx.compose.material3.SheetState, java.lang.String, long, long, androidx.compose.ui.graphics.Shape, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void f(String str, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        Function0 function02 = function0;
        Composer q2 = composer.q(1308929012);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.W(str2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1308929012, i4, -1, "com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetHeader (AbtBottomSheet.kt:101)");
            }
            Arrangement.HorizontalOrVertical d2 = Arrangement.f3739a.d();
            Alignment.Vertical i5 = Alignment.f15444a.i();
            Modifier.Companion companion = Modifier.f15489d;
            Modifier k2 = PaddingKt.k(SizeKt.h(companion, 0.0f, 1, (Object) null), 0.0f, Dp.m((float) 4), 1, (Object) null);
            MeasurePolicy b2 = RowKt.b(d2, i5, q2, 54);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, k2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            AbtTheme abtTheme = AbtTheme.f38851a;
            int i6 = i4;
            Composer composer3 = q2;
            AbtTextKt.c(str, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).b(), composer3, i4 & 14, 0, 65534);
            Modifier.Companion companion3 = companion;
            IconButtonKt.e(function0, OffsetKt.c(SizeKt.t(companion3, Dp.m((float) 48)), Dp.m((float) 12), 0.0f, 2, (Object) null), false, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableSingletons$AbtBottomSheetKt.f38029a.a(), composer3, ((i6 >> 3) & 14) | 1572912, 60);
            composer3.T();
            composer2 = composer3;
            DividerKt.e((Modifier) null, 0.0f, abtTheme.b(composer2, 6).u(), composer2, 0, 3);
            SpacerKt.a(SizeKt.i(companion3, Dp.m((float) 16)), composer2, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new a(str, function0, i2));
        }
    }

    public static final Unit g(String str, Function0 function0, int i2, Composer composer, int i3) {
        f(str, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit h(CoroutineScope coroutineScope, SheetState sheetState, Function0 function0) {
        BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AbtBottomSheetKt$AbtBottomSheet$close$1$1$1(sheetState, (Continuation) null), 3, (Object) null).S(new d(function0));
        return Unit.f40552a;
    }

    public static final Unit i(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit j(SheetState sheetState, String str, long j2, long j3, Shape shape, Function2 function2, Function0 function0, Function3 function3, Function3 function32, int i2, int i3, Composer composer, int i4) {
        e(sheetState, str, j2, j3, shape, function2, function0, function3, function32, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
