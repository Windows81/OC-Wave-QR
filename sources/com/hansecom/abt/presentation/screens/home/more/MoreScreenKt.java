package com.hansecom.abt.presentation.screens.home.more;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.home.more.More;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class MoreScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function2 r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function0 r27, androidx.compose.ui.Modifier r28, com.hansecom.abt.presentation.screens.home.more.MoreViewModel r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r11 = r27
            r10 = r31
            java.lang.String r0 = "onGuidedTour"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "onHelpRequest"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "onWebViewUrl"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "onBrowserUrl"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onDebugMenu"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -864862112(0xffffffffcc734060, float:-6.3766912E7)
            r1 = r30
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0035
            r1 = r10 | 6
            goto L_0x0045
        L_0x0035:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0044
            boolean r1 = r9.l(r12)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r10
            goto L_0x0045
        L_0x0044:
            r1 = r10
        L_0x0045:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x004c
            r1 = r1 | 48
            goto L_0x005c
        L_0x004c:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x005c
            boolean r2 = r9.l(r13)
            if (r2 == 0) goto L_0x0059
            r2 = 32
            goto L_0x005b
        L_0x0059:
            r2 = 16
        L_0x005b:
            r1 = r1 | r2
        L_0x005c:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0063:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0073
            boolean r2 = r9.l(r14)
            if (r2 == 0) goto L_0x0070
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r1 = r1 | r2
        L_0x0073:
            r2 = r32 & 8
            if (r2 == 0) goto L_0x007a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x007a:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x008a
            boolean r2 = r9.l(r15)
            if (r2 == 0) goto L_0x0087
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r1 = r1 | r2
        L_0x008a:
            r2 = r32 & 16
            if (r2 == 0) goto L_0x0091
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x0091:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a1
            boolean r2 = r9.l(r11)
            if (r2 == 0) goto L_0x009e
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r2
        L_0x00a1:
            r2 = r32 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00ab
            r1 = r1 | r3
        L_0x00a8:
            r3 = r28
            goto L_0x00bc
        L_0x00ab:
            r3 = r3 & r10
            if (r3 != 0) goto L_0x00a8
            r3 = r28
            boolean r4 = r9.W(r3)
            if (r4 == 0) goto L_0x00b9
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r4
        L_0x00bc:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r4 = r10 & r16
            r8 = 1048576(0x100000, float:1.469368E-39)
            if (r4 != 0) goto L_0x00da
            r4 = r32 & 64
            if (r4 != 0) goto L_0x00d2
            r4 = r29
            boolean r5 = r9.W(r4)
            if (r5 == 0) goto L_0x00d4
            r5 = r8
            goto L_0x00d6
        L_0x00d2:
            r4 = r29
        L_0x00d4:
            r5 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r5
        L_0x00d7:
            r17 = r1
            goto L_0x00dd
        L_0x00da:
            r4 = r29
            goto L_0x00d7
        L_0x00dd:
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r17 & r1
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r5) goto L_0x00f7
            boolean r1 = r9.t()
            if (r1 != 0) goto L_0x00ee
            goto L_0x00f7
        L_0x00ee:
            r9.B()
            r6 = r3
            r7 = r4
            r20 = r9
            goto L_0x020e
        L_0x00f7:
            r9.p()
            r1 = r10 & 1
            r7 = 0
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r1 == 0) goto L_0x011b
            boolean r1 = r9.J()
            if (r1 == 0) goto L_0x0109
            goto L_0x011b
        L_0x0109:
            r9.B()
            r1 = r32 & 64
            if (r1 == 0) goto L_0x0112
            r17 = r17 & r18
        L_0x0112:
            r19 = r3
            r8 = r4
            r22 = r7
        L_0x0117:
            r7 = r17
            goto L_0x017d
        L_0x011b:
            if (r2 == 0) goto L_0x0122
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r19 = r1
            goto L_0x0124
        L_0x0122:
            r19 = r3
        L_0x0124:
            r1 = r32 & 64
            if (r1 == 0) goto L_0x0179
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r9.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r2 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r1.c(r9, r2)
            if (r2 == 0) goto L_0x0171
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r9, r7)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r9.f(r1)
            boolean r1 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x014f
            r1 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x014d:
            r5 = r1
            goto L_0x0152
        L_0x014f:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x014d
        L_0x0152:
            r20 = 36936(0x9048, float:5.1758E-41)
            r21 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.more.MoreViewModel> r1 = com.hansecom.abt.presentation.screens.home.more.MoreViewModel.class
            r3 = 0
            r6 = r9
            r22 = r7
            r7 = r20
            r8 = r21
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.S()
            r9.S()
            com.hansecom.abt.presentation.screens.home.more.MoreViewModel r1 = (com.hansecom.abt.presentation.screens.home.more.MoreViewModel) r1
            r17 = r17 & r18
            r8 = r1
            goto L_0x0117
        L_0x0171:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0179:
            r22 = r7
            r8 = r4
            goto L_0x0117
        L_0x017d:
            r9.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x018c
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.more.MoreScreen (MoreScreen.kt:44)"
            androidx.compose.runtime.ComposerKt.Y(r0, r7, r1, r2)
        L_0x018c:
            int r0 = r7 >> 12
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r8
            r4 = r9
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.more.More$State r5 = d(r0)
            r0 = 1381965646(0x525f1f4e, float:2.39575728E11)
            r9.X(r0)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r7
            r0 = r0 ^ r16
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r1) goto L_0x01b2
            boolean r0 = r9.W(r8)
            if (r0 != 0) goto L_0x01b6
        L_0x01b2:
            r0 = r7 & r16
            if (r0 != r1) goto L_0x01b9
        L_0x01b6:
            r0 = 1
            r22 = r0
        L_0x01b9:
            java.lang.Object r0 = r9.g()
            if (r22 != 0) goto L_0x01c7
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x01cf
        L_0x01c7:
            com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$MoreScreen$1$1 r0 = new com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$MoreScreen$1$1
            r0.<init>(r8)
            r9.N(r0)
        L_0x01cf:
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            r9.M()
            r6 = r0
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlinx.coroutines.flow.Flow r16 = r8.l()
            r0 = 65534(0xfffe, float:9.1833E-41)
            r0 = r0 & r7
            int r1 = r7 << 9
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r17 = r0 | r1
            r18 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r7 = r16
            r16 = r8
            r8 = r19
            r20 = r9
            r10 = r17
            r11 = r18
            f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x020a
            androidx.compose.runtime.ComposerKt.X()
        L_0x020a:
            r7 = r16
            r6 = r19
        L_0x020e:
            androidx.compose.runtime.ScopeUpdateScope r10 = r20.x()
            if (r10 == 0) goto L_0x022b
            com.hansecom.abt.presentation.screens.home.more.n r11 = new com.hansecom.abt.presentation.screens.home.more.n
            r0 = r11
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x022b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.MoreScreenKt.c(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.hansecom.abt.presentation.screens.home.more.MoreViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final More.State d(State state) {
        return (More.State) state.getValue();
    }

    public static final Unit e(Function0 function0, Function0 function02, Function2 function2, Function1 function1, Function0 function03, Modifier modifier, MoreViewModel moreViewModel, int i2, int i3, Composer composer, int i4) {
        c(function0, function02, function2, function1, function03, modifier, moreViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$2$1} */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01a8, code lost:
        if (r3 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function0 r29, com.hansecom.abt.presentation.screens.home.more.More.State r30, kotlin.jvm.functions.Function1 r31, kotlinx.coroutines.flow.Flow r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r5 = r29
            r6 = r30
            r7 = r31
            r10 = r35
            r11 = r36
            r0 = 541817732(0x204b7b84, float:1.7235637E-19)
            r1 = r34
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r10 | 6
            r4 = r2
            r2 = r25
            goto L_0x0031
        L_0x001d:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x002e
            r2 = r25
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r10
            goto L_0x0031
        L_0x002e:
            r2 = r25
            r4 = r10
        L_0x0031:
            r8 = r11 & 2
            if (r8 == 0) goto L_0x003a
            r4 = r4 | 48
        L_0x0037:
            r8 = r26
            goto L_0x004c
        L_0x003a:
            r8 = r10 & 48
            if (r8 != 0) goto L_0x0037
            r8 = r26
            boolean r12 = r1.l(r8)
            if (r12 == 0) goto L_0x0049
            r12 = 32
            goto L_0x004b
        L_0x0049:
            r12 = 16
        L_0x004b:
            r4 = r4 | r12
        L_0x004c:
            r12 = r11 & 4
            if (r12 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            r13 = r27
            goto L_0x0067
        L_0x0055:
            r12 = r10 & 384(0x180, float:5.38E-43)
            r13 = r27
            if (r12 != 0) goto L_0x0067
            boolean r12 = r1.l(r13)
            if (r12 == 0) goto L_0x0064
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r12
        L_0x0067:
            r12 = r11 & 8
            if (r12 == 0) goto L_0x0070
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r12 = r28
            goto L_0x0083
        L_0x0070:
            r12 = r10 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x006d
            r12 = r28
            boolean r16 = r1.l(r12)
            if (r16 == 0) goto L_0x007f
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r4 = r4 | r16
        L_0x0083:
            r16 = r11 & 16
            if (r16 == 0) goto L_0x008a
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009a
        L_0x008a:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x009a
            boolean r14 = r1.l(r5)
            if (r14 == 0) goto L_0x0097
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r14
        L_0x009a:
            r14 = r11 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a3
            r4 = r4 | r16
            goto L_0x00bd
        L_0x00a3:
            r14 = r10 & r16
            if (r14 != 0) goto L_0x00bd
            r14 = 262144(0x40000, float:3.67342E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00b1
            boolean r14 = r1.W(r6)
            goto L_0x00b5
        L_0x00b1:
            boolean r14 = r1.l(r6)
        L_0x00b5:
            if (r14 == 0) goto L_0x00ba
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r4 = r4 | r14
        L_0x00bd:
            r14 = r11 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00c6
            r4 = r4 | r16
            goto L_0x00d6
        L_0x00c6:
            r14 = r10 & r16
            if (r14 != 0) goto L_0x00d6
            boolean r14 = r1.l(r7)
            if (r14 == 0) goto L_0x00d3
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r4 = r4 | r14
        L_0x00d6:
            r14 = r11 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r14 == 0) goto L_0x00e1
            r4 = r4 | r16
        L_0x00de:
            r14 = r32
            goto L_0x00f4
        L_0x00e1:
            r14 = r10 & r16
            if (r14 != 0) goto L_0x00de
            r14 = r32
            boolean r16 = r1.l(r14)
            if (r16 == 0) goto L_0x00f0
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r4 = r4 | r16
        L_0x00f4:
            r15 = r11 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x00ff
            r4 = r4 | r17
            r9 = r33
            goto L_0x0112
        L_0x00ff:
            r17 = r10 & r17
            r9 = r33
            if (r17 != 0) goto L_0x0112
            boolean r17 = r1.W(r9)
            if (r17 == 0) goto L_0x010e
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0110
        L_0x010e:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0110:
            r4 = r4 | r17
        L_0x0112:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r4 & r17
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r0) goto L_0x0128
            boolean r0 = r1.t()
            if (r0 != 0) goto L_0x0123
            goto L_0x0128
        L_0x0123:
            r1.B()
            goto L_0x01de
        L_0x0128:
            if (r15 == 0) goto L_0x012d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r9 = r0
        L_0x012d:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x013c
            r0 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.more.ScreenImpl (MoreScreen.kt:71)"
            r15 = 541817732(0x204b7b84, float:1.7235637E-19)
            androidx.compose.runtime.ComposerKt.Y(r15, r4, r0, r3)
        L_0x013c:
            com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$1 r0 = new com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$1
            r0.<init>(r9, r6, r7, r5)
            r3 = 54
            r15 = 505284293(0x1e1e06c5, float:8.36585E-21)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r17 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r13, r0, r1, r3)
            r19 = 3072(0xc00, float:4.305E-42)
            r20 = 7
            r0 = 0
            r21 = 0
            r23 = 0
            r12 = r0
            r0 = r13
            r3 = 2048(0x800, float:2.87E-42)
            r13 = r21
            r0 = 256(0x100, float:3.59E-43)
            r15 = r23
            r18 = r1
            com.hansecom.abt.ui.components.ScreenContentKt.d(r12, r13, r15, r17, r18, r19, r20)
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r12 = r1.C(r12)
            r15 = r12
            android.content.Context r15 = (android.content.Context) r15
            r12 = -737512686(0xffffffffd40a7312, float:-2.37854419E12)
            r1.X(r12)
            r12 = r4 & 14
            r14 = 4
            if (r12 != r14) goto L_0x017b
            r12 = 1
            goto L_0x017c
        L_0x017b:
            r12 = 0
        L_0x017c:
            r14 = r4 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r14 != r13) goto L_0x0184
            r13 = 1
            goto L_0x0185
        L_0x0184:
            r13 = 0
        L_0x0185:
            r12 = r12 | r13
            r13 = r4 & 896(0x380, float:1.256E-42)
            if (r13 != r0) goto L_0x018c
            r13 = 1
            goto L_0x018d
        L_0x018c:
            r13 = 0
        L_0x018d:
            r0 = r12 | r13
            boolean r12 = r1.l(r15)
            r0 = r0 | r12
            r12 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != r3) goto L_0x019a
            r13 = 1
            goto L_0x019b
        L_0x019a:
            r13 = 0
        L_0x019b:
            r0 = r0 | r13
            java.lang.Object r3 = r1.g()
            if (r0 != 0) goto L_0x01aa
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x01c0
        L_0x01aa:
            com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$2$1 r3 = new com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$2$1
            r18 = 0
            r12 = r3
            r13 = r25
            r14 = r26
            r0 = r15
            r15 = r27
            r16 = r28
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.N(r3)
        L_0x01c0:
            r15 = r3
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r1.M()
            int r0 = r4 >> 21
            r17 = r0 & 14
            r18 = 6
            r13 = 0
            r14 = 0
            r12 = r32
            r16 = r1
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01de
            androidx.compose.runtime.ComposerKt.X()
        L_0x01de:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0201
            com.hansecom.abt.presentation.screens.home.more.m r13 = new com.hansecom.abt.presentation.screens.home.more.m
            r0 = r13
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.MoreScreenKt.f(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.home.more.More$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit g(Function0 function0, Function0 function02, Function2 function2, Function1 function1, Function0 function03, More.State state, Function1 function12, Flow flow, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        f(function0, function02, function2, function1, function03, state, function12, flow, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
