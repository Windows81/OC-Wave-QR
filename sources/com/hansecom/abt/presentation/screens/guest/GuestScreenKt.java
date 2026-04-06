package com.hansecom.abt.presentation.screens.guest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.hansecom.abt.presentation.screens.guest.Guest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class GuestScreenKt {
    /* JADX WARNING: Removed duplicated region for block: B:128:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function2 r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function0 r28, com.hansecom.abt.presentation.screens.guest.GuestViewModel r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
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
            java.lang.String r0 = "onCheckFareMediaBalance"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "onWebViewUrl"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onBrowserUrl"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = 221807198(0xd38825e, float:5.68563E-31)
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
            boolean r4 = r9.l(r3)
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
            r17 = r9
            goto L_0x0229
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
            goto L_0x019b
        L_0x011b:
            if (r2 == 0) goto L_0x013f
            r1 = 244547831(0xe9380f7, float:3.6362486E-30)
            r9.X(r1)
            java.lang.Object r1 = r9.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0137
            com.hansecom.abt.presentation.screens.guest.r r1 = new com.hansecom.abt.presentation.screens.guest.r
            r1.<init>()
            r9.N(r1)
        L_0x0137:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r9.M()
            r19 = r1
            goto L_0x0141
        L_0x013f:
            r19 = r3
        L_0x0141:
            r1 = r32 & 64
            if (r1 == 0) goto L_0x0196
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r9.f(r1)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r2 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r1.c(r9, r2)
            if (r2 == 0) goto L_0x018e
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r9, r7)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r9.f(r1)
            boolean r1 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x016c
            r1 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r1 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.n()
        L_0x016a:
            r5 = r1
            goto L_0x016f
        L_0x016c:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r1 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x016a
        L_0x016f:
            r20 = 36936(0x9048, float:5.1758E-41)
            r21 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.guest.GuestViewModel> r1 = com.hansecom.abt.presentation.screens.guest.GuestViewModel.class
            r3 = 0
            r6 = r9
            r22 = r7
            r7 = r20
            r8 = r21
            androidx.lifecycle.ViewModel r1 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.S()
            r9.S()
            com.hansecom.abt.presentation.screens.guest.GuestViewModel r1 = (com.hansecom.abt.presentation.screens.guest.GuestViewModel) r1
            r17 = r17 & r18
            r8 = r1
            goto L_0x0117
        L_0x018e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0196:
            r22 = r7
            r8 = r4
            goto L_0x0117
        L_0x019b:
            r9.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01aa
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.guest.GuestScreen (GuestScreen.kt:42)"
            androidx.compose.runtime.ComposerKt.Y(r0, r7, r1, r2)
        L_0x01aa:
            int r0 = r7 >> 12
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r8
            r4 = r9
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.guest.Guest$State r6 = g(r0)
            r0 = 244560102(0xe93b0e6, float:3.6408645E-30)
            r9.X(r0)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r7
            r0 = r0 ^ r16
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r1) goto L_0x01d0
            boolean r0 = r9.W(r8)
            if (r0 != 0) goto L_0x01d4
        L_0x01d0:
            r0 = r7 & r16
            if (r0 != r1) goto L_0x01d7
        L_0x01d4:
            r0 = 1
            r22 = r0
        L_0x01d7:
            java.lang.Object r0 = r9.g()
            if (r22 != 0) goto L_0x01e5
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x01ed
        L_0x01e5:
            com.hansecom.abt.presentation.screens.guest.GuestScreenKt$GuestScreen$2$1 r0 = new com.hansecom.abt.presentation.screens.guest.GuestScreenKt$GuestScreen$2$1
            r0.<init>(r8)
            r9.N(r0)
        L_0x01ed:
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            r9.M()
            r16 = r0
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            kotlinx.coroutines.flow.Flow r17 = r8.l()
            r0 = 524286(0x7fffe, float:7.34681E-40)
            r18 = r7 & r0
            r20 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r19
            r7 = r16
            r16 = r8
            r8 = r17
            r17 = r9
            r10 = r18
            r11 = r20
            i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0225
            androidx.compose.runtime.ComposerKt.X()
        L_0x0225:
            r7 = r16
            r6 = r19
        L_0x0229:
            androidx.compose.runtime.ScopeUpdateScope r10 = r17.x()
            if (r10 == 0) goto L_0x0246
            com.hansecom.abt.presentation.screens.guest.s r11 = new com.hansecom.abt.presentation.screens.guest.s
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
        L_0x0246:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.GuestScreenKt.e(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.guest.GuestViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f() {
        return Unit.f40552a;
    }

    public static final Guest.State g(State state) {
        return (Guest.State) state.getValue();
    }

    public static final Unit h(Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function1 function1, Function0 function04, GuestViewModel guestViewModel, int i2, int i3, Composer composer, int i4) {
        e(function0, function02, function03, function2, function1, function04, guestViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$4$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$4$1} */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ee, code lost:
        if (r2 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01f0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function0 r30, kotlin.jvm.functions.Function0 r31, kotlin.jvm.functions.Function2 r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function0 r34, com.hansecom.abt.presentation.screens.guest.Guest.State r35, kotlin.jvm.functions.Function1 r36, kotlinx.coroutines.flow.Flow r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r7 = r35
            r8 = r36
            r10 = r39
            r11 = r40
            r0 = 1884482482(0x7052ebb2, float:2.6110716E29)
            r1 = r38
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r10 | 6
            r4 = r2
            r2 = r29
            goto L_0x002f
        L_0x001b:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x002c
            r2 = r29
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r10
            goto L_0x002f
        L_0x002c:
            r2 = r29
            r4 = r10
        L_0x002f:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r5 = r30
            goto L_0x004a
        L_0x0038:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r30
            boolean r9 = r1.l(r5)
            if (r9 == 0) goto L_0x0047
            r9 = 32
            goto L_0x0049
        L_0x0047:
            r9 = 16
        L_0x0049:
            r4 = r4 | r9
        L_0x004a:
            r9 = r11 & 4
            if (r9 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r9 = r31
            goto L_0x0065
        L_0x0053:
            r9 = r10 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0050
            r9 = r31
            boolean r12 = r1.l(r9)
            if (r12 == 0) goto L_0x0062
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r12
        L_0x0065:
            r12 = r11 & 8
            if (r12 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r13 = r32
            goto L_0x0080
        L_0x006e:
            r12 = r10 & 3072(0xc00, float:4.305E-42)
            r13 = r32
            if (r12 != 0) goto L_0x0080
            boolean r12 = r1.l(r13)
            if (r12 == 0) goto L_0x007d
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r4 = r4 | r12
        L_0x0080:
            r12 = r11 & 16
            if (r12 == 0) goto L_0x0089
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r12 = r33
            goto L_0x009c
        L_0x0089:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0086
            r12 = r33
            boolean r16 = r1.l(r12)
            if (r16 == 0) goto L_0x0098
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r16
        L_0x009c:
            r16 = r11 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a7
            r4 = r4 | r17
            r14 = r34
            goto L_0x00ba
        L_0x00a7:
            r17 = r10 & r17
            r14 = r34
            if (r17 != 0) goto L_0x00ba
            boolean r18 = r1.l(r14)
            if (r18 == 0) goto L_0x00b6
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r4 = r4 | r18
        L_0x00ba:
            r18 = r11 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c3
            r4 = r4 | r19
            goto L_0x00df
        L_0x00c3:
            r18 = r10 & r19
            if (r18 != 0) goto L_0x00df
            r18 = 2097152(0x200000, float:2.938736E-39)
            r18 = r10 & r18
            if (r18 != 0) goto L_0x00d2
            boolean r18 = r1.W(r7)
            goto L_0x00d6
        L_0x00d2:
            boolean r18 = r1.l(r7)
        L_0x00d6:
            if (r18 == 0) goto L_0x00db
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r4 = r4 | r18
        L_0x00df:
            r15 = r11 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto L_0x00e8
            r4 = r4 | r19
            goto L_0x00f8
        L_0x00e8:
            r15 = r10 & r19
            if (r15 != 0) goto L_0x00f8
            boolean r15 = r1.l(r8)
            if (r15 == 0) goto L_0x00f5
            r15 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r15 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r4 = r4 | r15
        L_0x00f8:
            r15 = r11 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x0103
            r4 = r4 | r19
        L_0x0100:
            r15 = r37
            goto L_0x0116
        L_0x0103:
            r15 = r10 & r19
            if (r15 != 0) goto L_0x0100
            r15 = r37
            boolean r19 = r1.l(r15)
            if (r19 == 0) goto L_0x0112
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0112:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r4 = r4 | r19
        L_0x0116:
            r19 = 38347923(0x2492493, float:1.4777644E-37)
            r6 = r4 & r19
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 != r3) goto L_0x012d
            boolean r3 = r1.t()
            if (r3 != 0) goto L_0x0127
            goto L_0x012d
        L_0x0127:
            r1.B()
            r6 = r14
            goto L_0x0227
        L_0x012d:
            if (r16 == 0) goto L_0x014f
            r3 = -2111006851(0xffffffff822c977d, float:-1.2680039E-37)
            r1.X(r3)
            java.lang.Object r3 = r1.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r3 != r6) goto L_0x0149
            com.hansecom.abt.presentation.screens.guest.p r3 = new com.hansecom.abt.presentation.screens.guest.p
            r3.<init>()
            r1.N(r3)
        L_0x0149:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r1.M()
            goto L_0x0150
        L_0x014f:
            r3 = r14
        L_0x0150:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x015c
            r6 = -1
            java.lang.String r14 = "com.hansecom.abt.presentation.screens.guest.ScreenImpl (GuestScreen.kt:69)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r6, r14)
        L_0x015c:
            com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$2 r0 = new com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$2
            r0.<init>(r3)
            r6 = -1679916434(0xffffffff9bde826e, float:-3.6811107E-22)
            r14 = 1
            r2 = 54
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r14, r0, r1, r2)
            com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$3 r6 = new com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$3
            r6.<init>(r7, r8)
            r34 = r3
            r3 = -72096445(0xfffffffffbb3e543, float:-1.8681422E36)
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r14, r6, r1, r2)
            r25 = 805306416(0x30000030, float:4.6566395E-10)
            r26 = 509(0x1fd, float:7.13E-43)
            r2 = 0
            r3 = 0
            r6 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r27 = 0
            r22 = 0
            r12 = r2
            r13 = r0
            r0 = r14
            r2 = 2048(0x800, float:2.87E-42)
            r14 = r3
            r3 = 256(0x100, float:3.59E-43)
            r15 = r6
            r17 = r19
            r18 = r20
            r20 = r27
            r24 = r1
            androidx.compose.material3.ScaffoldKt.f(r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r1.C(r6)
            android.content.Context r6 = (android.content.Context) r6
            r12 = -2110952375(0xffffffff822d6c49, float:-1.2741109E-37)
            r1.X(r12)
            r12 = r4 & 14
            r14 = 0
            r13 = 4
            if (r12 != r13) goto L_0x01b7
            r12 = r0
            goto L_0x01b8
        L_0x01b7:
            r12 = r14
        L_0x01b8:
            r13 = r4 & 896(0x380, float:1.256E-42)
            if (r13 != r3) goto L_0x01be
            r3 = r0
            goto L_0x01bf
        L_0x01be:
            r3 = r14
        L_0x01bf:
            r3 = r3 | r12
            r12 = r4 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r12 != r13) goto L_0x01c8
            r12 = r0
            goto L_0x01c9
        L_0x01c8:
            r12 = r14
        L_0x01c9:
            r3 = r3 | r12
            r12 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != r2) goto L_0x01d0
            r2 = r0
            goto L_0x01d1
        L_0x01d0:
            r2 = r14
        L_0x01d1:
            r2 = r2 | r3
            boolean r3 = r1.l(r6)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r12) goto L_0x01e0
            r14 = r0
        L_0x01e0:
            r0 = r2 | r14
            java.lang.Object r2 = r1.g()
            if (r0 != 0) goto L_0x01f0
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0207
        L_0x01f0:
            com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$4$1 r2 = new com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$4$1
            r19 = 0
            r12 = r2
            r13 = r29
            r14 = r31
            r15 = r30
            r16 = r32
            r17 = r33
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1.N(r2)
        L_0x0207:
            r15 = r2
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r1.M()
            int r0 = r4 >> 24
            r17 = r0 & 14
            r18 = 6
            r13 = 0
            r14 = 0
            r12 = r37
            r16 = r1
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0225
            androidx.compose.runtime.ComposerKt.X()
        L_0x0225:
            r6 = r34
        L_0x0227:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x024a
            com.hansecom.abt.presentation.screens.guest.q r13 = new com.hansecom.abt.presentation.screens.guest.q
            r0 = r13
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r39
            r11 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.GuestScreenKt.i(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.guest.Guest$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit j() {
        return Unit.f40552a;
    }

    public static final Unit k(Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function1 function1, Function0 function04, Guest.State state, Function1 function12, Flow flow, int i2, int i3, Composer composer, int i4) {
        i(function0, function02, function03, function2, function1, function04, state, function12, flow, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
