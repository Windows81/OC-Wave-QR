package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.home.account.Account;
import com.hansecom.abt.ui.components.ScreenContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class AccountScreenKt {
    public static final Unit A(Function1 function1, boolean z2, int i2, Composer composer, int i3) {
        w(function1, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$ScreenImpl$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$ScreenImpl$2$1} */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0263, code lost:
        if (r4 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0265;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void B(com.hansecom.abt.presentation.screens.home.account.Account.State r34, kotlin.jvm.functions.Function1 r35, kotlinx.coroutines.flow.Flow r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, kotlin.jvm.functions.Function0 r39, kotlin.jvm.functions.Function0 r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function0 r42, kotlin.jvm.functions.Function0 r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            r0 = r34
            r11 = r45
            r12 = r46
            r1 = 1796763736(0x6b187058, float:1.8428725E26)
            r2 = r44
            androidx.compose.runtime.Composer r9 = r2.q(r1)
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002b
            r2 = r12 & 1
            if (r2 != 0) goto L_0x0028
            r2 = r11 & 8
            if (r2 != 0) goto L_0x0020
            boolean r2 = r9.W(r0)
            goto L_0x0024
        L_0x0020:
            boolean r2 = r9.l(r0)
        L_0x0024:
            if (r2 == 0) goto L_0x0028
            r2 = 4
            goto L_0x0029
        L_0x0028:
            r2 = 2
        L_0x0029:
            r2 = r2 | r11
            goto L_0x002c
        L_0x002b:
            r2 = r11
        L_0x002c:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0035
            r2 = r2 | 48
        L_0x0032:
            r4 = r35
            goto L_0x0047
        L_0x0035:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x0032
            r4 = r35
            boolean r5 = r9.l(r4)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r2 = r2 | r5
        L_0x0047:
            r5 = r11 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0060
            r5 = r12 & 4
            if (r5 != 0) goto L_0x005a
            r5 = r36
            boolean r6 = r9.l(r5)
            if (r6 == 0) goto L_0x005c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r5 = r36
        L_0x005c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r2 = r2 | r6
            goto L_0x0062
        L_0x0060:
            r5 = r36
        L_0x0062:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x006b
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r10 = r37
            goto L_0x007d
        L_0x006b:
            r6 = r11 & 3072(0xc00, float:4.305E-42)
            r10 = r37
            if (r6 != 0) goto L_0x007d
            boolean r6 = r9.l(r10)
            if (r6 == 0) goto L_0x007a
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r2 = r2 | r6
        L_0x007d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0086
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r6 = r38
            goto L_0x0098
        L_0x0086:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0083
            r6 = r38
            boolean r13 = r9.l(r6)
            if (r13 == 0) goto L_0x0095
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r2 = r2 | r13
        L_0x0098:
            r13 = r12 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a2
            r2 = r2 | r15
            r15 = r39
            goto L_0x00b4
        L_0x00a2:
            r13 = r11 & r15
            r15 = r39
            if (r13 != 0) goto L_0x00b4
            boolean r13 = r9.l(r15)
            if (r13 == 0) goto L_0x00b1
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r2 = r2 | r13
        L_0x00b4:
            r13 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00bf
            r2 = r2 | r16
        L_0x00bc:
            r13 = r40
            goto L_0x00d2
        L_0x00bf:
            r13 = r11 & r16
            if (r13 != 0) goto L_0x00bc
            r13 = r40
            boolean r16 = r9.l(r13)
            if (r16 == 0) goto L_0x00ce
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r2 = r2 | r16
        L_0x00d2:
            r8 = r12 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00dd
            r2 = r2 | r18
        L_0x00da:
            r8 = r41
            goto L_0x00f0
        L_0x00dd:
            r8 = r11 & r18
            if (r8 != 0) goto L_0x00da
            r8 = r41
            boolean r18 = r9.l(r8)
            if (r18 == 0) goto L_0x00ec
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r2 = r2 | r18
        L_0x00f0:
            r14 = r12 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x00fa
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r14
        L_0x00f7:
            r14 = r42
            goto L_0x010e
        L_0x00fa:
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00f7
            r14 = r42
            boolean r19 = r9.l(r14)
            if (r19 == 0) goto L_0x010a
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x010a:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r2 = r2 | r19
        L_0x010e:
            r7 = r12 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0118
            r7 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r7
        L_0x0115:
            r7 = r43
            goto L_0x012c
        L_0x0118:
            r7 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x0115
            r7 = r43
            boolean r20 = r9.l(r7)
            if (r20 == 0) goto L_0x0128
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0128:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r2 = r2 | r20
        L_0x012c:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r2 & r20
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x0146
            boolean r0 = r9.t()
            if (r0 != 0) goto L_0x013d
            goto L_0x0146
        L_0x013d:
            r9.B()
            r1 = r34
            r2 = r4
            r3 = r5
            goto L_0x02a3
        L_0x0146:
            r9.p()
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0169
            boolean r0 = r9.J()
            if (r0 == 0) goto L_0x0154
            goto L_0x0169
        L_0x0154:
            r9.B()
            r0 = r12 & 1
            if (r0 == 0) goto L_0x015d
            r2 = r2 & -15
        L_0x015d:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0163
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0163:
            r0 = r34
        L_0x0165:
            r1 = r4
            r23 = r5
            goto L_0x01be
        L_0x0169:
            r0 = r12 & 1
            if (r0 == 0) goto L_0x018d
            com.hansecom.abt.presentation.screens.home.account.Account$State r0 = new com.hansecom.abt.presentation.screens.home.account.Account$State
            r32 = 511(0x1ff, float:7.16E-43)
            r33 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2 = r2 & -15
            goto L_0x018f
        L_0x018d:
            r0 = r34
        L_0x018f:
            if (r3 == 0) goto L_0x01b1
            r1 = -1233423387(0xffffffffb67b73e5, float:-3.7469374E-6)
            r9.X(r1)
            java.lang.Object r1 = r9.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x01ab
            com.hansecom.abt.presentation.screens.home.account.x r1 = new com.hansecom.abt.presentation.screens.home.account.x
            r1.<init>()
            r9.N(r1)
        L_0x01ab:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r9.M()
            r4 = r1
        L_0x01b1:
            r1 = r12 & 4
            if (r1 == 0) goto L_0x0165
            kotlinx.coroutines.flow.Flow r1 = kotlinx.coroutines.flow.FlowKt.A()
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            r23 = r1
            r1 = r4
        L_0x01be:
            r9.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01d0
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.account.ScreenImpl (AccountScreen.kt:83)"
            r5 = 1796763736(0x6b187058, float:1.8428725E26)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x01d0:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r4 = "AccountScreen"
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.platform.TestTagKt.a(r3, r4)
            int r4 = r2 << 3
            r5 = r4 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            u(r3, r0, r1, r9, r4)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r3 = r9.C(r3)
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r3 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r3
            r4 = -1233405607(0xffffffffb67bb959, float:-3.75098E-6)
            r9.X(r4)
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r2
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r20 = 0
            r21 = 1
            if (r4 != r5) goto L_0x0202
            r4 = r21
            goto L_0x0204
        L_0x0202:
            r4 = r20
        L_0x0204:
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r24 = r0
            r0 = 2048(0x800, float:2.87E-42)
            if (r5 != r0) goto L_0x020f
            r0 = r21
            goto L_0x0211
        L_0x020f:
            r0 = r20
        L_0x0211:
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r2
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r4 != r5) goto L_0x021c
            r4 = r21
            goto L_0x021e
        L_0x021c:
            r4 = r20
        L_0x021e:
            r0 = r0 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r2
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r4 != r5) goto L_0x0229
            r4 = r21
            goto L_0x022b
        L_0x0229:
            r4 = r20
        L_0x022b:
            r0 = r0 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r2
            r5 = 1048576(0x100000, float:1.469368E-39)
            if (r4 != r5) goto L_0x0236
            r4 = r21
            goto L_0x0238
        L_0x0236:
            r4 = r20
        L_0x0238:
            r0 = r0 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r2
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            if (r4 != r5) goto L_0x0243
            r4 = r21
            goto L_0x0245
        L_0x0243:
            r4 = r20
        L_0x0245:
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 != r5) goto L_0x0250
            r20 = r21
        L_0x0250:
            r0 = r0 | r20
            boolean r4 = r9.l(r3)
            r0 = r0 | r4
            java.lang.Object r4 = r9.g()
            if (r0 != 0) goto L_0x0265
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0280
        L_0x0265:
            com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$ScreenImpl$2$1 r4 = new com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$ScreenImpl$2$1
            r22 = 0
            r13 = r4
            r14 = r43
            r15 = r37
            r16 = r39
            r17 = r41
            r18 = r40
            r19 = r42
            r20 = r38
            r21 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9.N(r4)
        L_0x0280:
            r5 = r4
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r9.M()
            int r0 = r2 >> 6
            r0 = r0 & 14
            r13 = 6
            r3 = 0
            r4 = 0
            r2 = r23
            r6 = r9
            r7 = r0
            r8 = r13
            com.hansecom.abt.presentation.mvi.MviEffectKt.b(r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x029e
            androidx.compose.runtime.ComposerKt.X()
        L_0x029e:
            r2 = r1
            r3 = r23
            r1 = r24
        L_0x02a3:
            androidx.compose.runtime.ScopeUpdateScope r13 = r9.x()
            if (r13 == 0) goto L_0x02c4
            com.hansecom.abt.presentation.screens.home.account.A r14 = new com.hansecom.abt.presentation.screens.home.account.A
            r0 = r14
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r45
            r12 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt.B(com.hansecom.abt.presentation.screens.home.account.Account$State, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit C(Account.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit D(Account.State state, Function1 function1, Flow flow, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, int i2, int i3, Composer composer, int i4) {
        B(state, function1, flow, function0, function02, function03, function04, function05, function06, function07, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x012b, code lost:
        if ((r7 & 128) != 0) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function0 r30, com.hansecom.abt.presentation.screens.home.account.AccountViewModel r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r13 = r24
            r14 = r25
            r15 = r26
            r12 = r27
            r11 = r28
            r10 = r29
            r9 = r30
            r8 = r33
            r7 = r34
            java.lang.String r0 = "onInformationClick"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "onAddressClick"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "onPaymentMethodsClick"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            java.lang.String r0 = "onChangePasswordClick"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "onChangeQuestionsClick"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            java.lang.String r0 = "onChangePinClick"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r0 = "goBack"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = 608040154(0x243df4da, float:4.119024E-17)
            r1 = r32
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0045
            r1 = r8 | 6
            goto L_0x0055
        L_0x0045:
            r1 = r8 & 6
            if (r1 != 0) goto L_0x0054
            boolean r1 = r6.l(r13)
            if (r1 == 0) goto L_0x0051
            r1 = 4
            goto L_0x0052
        L_0x0051:
            r1 = 2
        L_0x0052:
            r1 = r1 | r8
            goto L_0x0055
        L_0x0054:
            r1 = r8
        L_0x0055:
            r2 = r7 & 2
            if (r2 == 0) goto L_0x005c
            r1 = r1 | 48
            goto L_0x006c
        L_0x005c:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x006c
            boolean r2 = r6.l(r14)
            if (r2 == 0) goto L_0x0069
            r2 = 32
            goto L_0x006b
        L_0x0069:
            r2 = 16
        L_0x006b:
            r1 = r1 | r2
        L_0x006c:
            r2 = r7 & 4
            if (r2 == 0) goto L_0x0073
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0083
        L_0x0073:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0083
            boolean r2 = r6.l(r15)
            if (r2 == 0) goto L_0x0080
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0082
        L_0x0080:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0082:
            r1 = r1 | r2
        L_0x0083:
            r2 = r7 & 8
            if (r2 == 0) goto L_0x008a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009a
        L_0x008a:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x009a
            boolean r2 = r6.l(r12)
            if (r2 == 0) goto L_0x0097
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0099
        L_0x0097:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r1 = r1 | r2
        L_0x009a:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x00a1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b1
        L_0x00a1:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00b1
            boolean r2 = r6.l(r11)
            if (r2 == 0) goto L_0x00ae
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b0
        L_0x00ae:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00b0:
            r1 = r1 | r2
        L_0x00b1:
            r2 = r7 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b9
            r1 = r1 | r3
            goto L_0x00c9
        L_0x00b9:
            r2 = r8 & r3
            if (r2 != 0) goto L_0x00c9
            boolean r2 = r6.l(r10)
            if (r2 == 0) goto L_0x00c6
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c8
        L_0x00c6:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00c8:
            r1 = r1 | r2
        L_0x00c9:
            r2 = r7 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00d1
            r1 = r1 | r3
            goto L_0x00e1
        L_0x00d1:
            r2 = r8 & r3
            if (r2 != 0) goto L_0x00e1
            boolean r2 = r6.l(r9)
            if (r2 == 0) goto L_0x00de
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r1 = r1 | r2
        L_0x00e1:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00fb
            r2 = r7 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f5
            r2 = r31
            boolean r3 = r6.l(r2)
            if (r3 == 0) goto L_0x00f7
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f5:
            r2 = r31
        L_0x00f7:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r1 = r1 | r3
            goto L_0x00fd
        L_0x00fb:
            r2 = r31
        L_0x00fd:
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r1
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r4) goto L_0x0115
            boolean r3 = r6.t()
            if (r3 != 0) goto L_0x010d
            goto L_0x0115
        L_0x010d:
            r6.B()
            r8 = r2
            r18 = r6
            goto L_0x0209
        L_0x0115:
            r6.p()
            r3 = r8 & 1
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r3 == 0) goto L_0x0131
            boolean r3 = r6.J()
            if (r3 == 0) goto L_0x0126
            goto L_0x0131
        L_0x0126:
            r6.B()
            r3 = r7 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x012e
        L_0x012d:
            r1 = r1 & r4
        L_0x012e:
            r4 = r1
            r5 = r2
            goto L_0x0183
        L_0x0131:
            r3 = r7 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x012e
            r2 = 1890788296(0x70b323c8, float:4.435286E29)
            r6.f(r2)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r2 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r3 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r2.c(r6, r3)
            if (r2 == 0) goto L_0x017b
            r3 = 0
            androidx.lifecycle.ViewModelProvider$Factory r19 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r6, r3)
            r3 = 1729797275(0x671a9c9b, float:7.301333E23)
            r6.f(r3)
            boolean r3 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r3 == 0) goto L_0x015e
            r3 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r3 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r3
            androidx.lifecycle.viewmodel.CreationExtras r3 = r3.n()
        L_0x015b:
            r20 = r3
            goto L_0x0161
        L_0x015e:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r3 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x015b
        L_0x0161:
            r22 = 36936(0x9048, float:5.1758E-41)
            r23 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.account.AccountViewModel> r16 = com.hansecom.abt.presentation.screens.home.account.AccountViewModel.class
            r18 = 0
            r17 = r2
            r21 = r6
            androidx.lifecycle.ViewModel r2 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r16, r17, r18, r19, r20, r21, r22, r23)
            r6.S()
            r6.S()
            com.hansecom.abt.presentation.screens.home.account.AccountViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.AccountViewModel) r2
            goto L_0x012d
        L_0x017b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0183:
            r6.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0192
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.account.AccountScreen (AccountScreen.kt:55)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r1, r2)
        L_0x0192:
            int r0 = r4 >> 15
            r0 = r0 & 896(0x380, float:1.256E-42)
            r16 = 3
            r2 = 0
            r3 = 0
            r1 = r5
            r17 = r4
            r4 = r6
            r12 = r5
            r5 = r0
            r0 = r6
            r6 = r16
            androidx.compose.runtime.State r1 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.account.Account$State r1 = n(r1)
            r2 = -9732077(0xffffffffff6b8013, float:-3.1303358E38)
            r0.X(r2)
            boolean r2 = r0.l(r12)
            java.lang.Object r3 = r0.g()
            if (r2 != 0) goto L_0x01c3
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x01cb
        L_0x01c3:
            com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$AccountScreen$1$1 r3 = new com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$AccountScreen$1$1
            r3.<init>(r12)
            r0.N(r3)
        L_0x01cb:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            r0.M()
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlinx.coroutines.flow.Flow r3 = r12.l()
            int r4 = r17 << 9
            r5 = 2147482624(0x7ffffc00, float:NaN)
            r16 = r4 & r5
            r17 = 0
            r18 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r18
            r11 = r16
            r16 = r12
            r12 = r17
            B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0207
            androidx.compose.runtime.ComposerKt.X()
        L_0x0207:
            r8 = r16
        L_0x0209:
            androidx.compose.runtime.ScopeUpdateScope r11 = r18.x()
            if (r11 == 0) goto L_0x022a
            com.hansecom.abt.presentation.screens.home.account.B r12 = new com.hansecom.abt.presentation.screens.home.account.B
            r0 = r12
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt.m(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.hansecom.abt.presentation.screens.home.account.AccountViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Account.State n(State state) {
        return (Account.State) state.getValue();
    }

    public static final Unit o(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, AccountViewModel accountViewModel, int i2, int i3, Composer composer, int i4) {
        m(function0, function02, function03, function04, function05, function06, function07, accountViewModel, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(com.hansecom.abt.presentation.screens.home.account.Account.State r28, kotlin.jvm.functions.Function1 r29, boolean r30, androidx.compose.runtime.Composer r31, int r32) {
        /*
            r0 = r28
            r1 = r29
            r14 = r30
            r13 = r32
            r2 = -1154823145(0xffffffffbb2acc17, float:-0.0026061588)
            r3 = r31
            androidx.compose.runtime.Composer r12 = r3.q(r2)
            r3 = r13 & 6
            r4 = 2
            if (r3 != 0) goto L_0x002a
            r3 = r13 & 8
            if (r3 != 0) goto L_0x001f
            boolean r3 = r12.W(r0)
            goto L_0x0023
        L_0x001f:
            boolean r3 = r12.l(r0)
        L_0x0023:
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = r4
        L_0x0028:
            r3 = r3 | r13
            goto L_0x002b
        L_0x002a:
            r3 = r13
        L_0x002b:
            r5 = r13 & 48
            r6 = 32
            if (r5 != 0) goto L_0x003c
            boolean r5 = r12.l(r1)
            if (r5 == 0) goto L_0x0039
            r5 = r6
            goto L_0x003b
        L_0x0039:
            r5 = 16
        L_0x003b:
            r3 = r3 | r5
        L_0x003c:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004c
            boolean r5 = r12.d(r14)
            if (r5 == 0) goto L_0x0049
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r3 = r3 | r5
        L_0x004c:
            r5 = r3 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0060
            boolean r5 = r12.t()
            if (r5 != 0) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r12.B()
            r23 = r12
            goto L_0x0188
        L_0x0060:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x006c
            r5 = -1
            java.lang.String r7 = "com.hansecom.abt.presentation.screens.home.account.CloseAccountDialog (AccountScreen.kt:158)"
            androidx.compose.runtime.ComposerKt.Y(r2, r3, r5, r7)
        L_0x006c:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r2 = r12.C(r2)
            androidx.compose.ui.focus.FocusManager r2 = (androidx.compose.ui.focus.FocusManager) r2
            r5 = -268355084(0xfffffffff00139f4, float:-1.599745E29)
            r12.X(r5)
            boolean r5 = r28.c()
            r7 = 1
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L_0x0088
            r17 = r8
            goto L_0x00b2
        L_0x0088:
            r5 = -268352583(0xfffffffff00143b9, float:-1.6002175E29)
            r12.X(r5)
            r5 = r3 & 112(0x70, float:1.57E-43)
            if (r5 != r6) goto L_0x0094
            r5 = r7
            goto L_0x0095
        L_0x0094:
            r5 = r9
        L_0x0095:
            java.lang.Object r10 = r12.g()
            if (r5 != 0) goto L_0x00a3
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r10 != r5) goto L_0x00ab
        L_0x00a3:
            com.hansecom.abt.presentation.screens.home.account.D r10 = new com.hansecom.abt.presentation.screens.home.account.D
            r10.<init>(r1)
            r12.N(r10)
        L_0x00ab:
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r12.M()
            r17 = r10
        L_0x00b2:
            r12.M()
            int r5 = com.hansecom.abt.R.string.f33064q
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r12, r9)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r5 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            r10 = 6
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r5 = r5.a(r12, r10)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r19 = r5.b(r12, r9)
            boolean r5 = r28.c()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r23 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r8, r5, r7, r8)
            int r5 = com.hansecom.abt.R.string.f33063p
            java.lang.String r24 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r12, r9)
            boolean r5 = r28.c()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            com.hansecom.abt.ui.components.abtButton.AbtButtonState r25 = com.hansecom.abt.ui.components.abtButton.AbtButtonStateKt.b(r5, r8, r4, r8)
            int r4 = com.hansecom.abt.R.string.f33067t
            java.lang.String r5 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r12, r9)
            int r4 = com.hansecom.abt.R.string.f33065r
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r12, r9)
            com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$CloseAccountDialog$2 r4 = new com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$CloseAccountDialog$2
            r4.<init>(r0, r1)
            r10 = 54
            r15 = -751039316(0xffffffffd33c0cac, float:-8.0766645E11)
            androidx.compose.runtime.internal.ComposableLambda r26 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r7, r4, r12, r10)
            r4 = -268342202(0xfffffffff0016c46, float:-1.6021784E29)
            r12.X(r4)
            boolean r4 = r12.l(r2)
            r10 = r3 & 112(0x70, float:1.57E-43)
            if (r10 != r6) goto L_0x010e
            r15 = r7
            goto L_0x010f
        L_0x010e:
            r15 = r9
        L_0x010f:
            r4 = r4 | r15
            java.lang.Object r15 = r12.g()
            if (r4 != 0) goto L_0x011e
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r15 != r4) goto L_0x0126
        L_0x011e:
            com.hansecom.abt.presentation.screens.home.account.E r15 = new com.hansecom.abt.presentation.screens.home.account.E
            r15.<init>(r2, r1)
            r12.N(r15)
        L_0x0126:
            r27 = r15
            kotlin.jvm.functions.Function0 r27 = (kotlin.jvm.functions.Function0) r27
            r12.M()
            r2 = -268332743(0xfffffffff0019139, float:-1.6039652E29)
            r12.X(r2)
            if (r10 != r6) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r7 = r9
        L_0x0137:
            java.lang.Object r2 = r12.g()
            if (r7 != 0) goto L_0x0145
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x014d
        L_0x0145:
            com.hansecom.abt.presentation.screens.home.account.F r2 = new com.hansecom.abt.presentation.screens.home.account.F
            r2.<init>(r1)
            r12.N(r2)
        L_0x014d:
            r15 = r2
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r12.M()
            int r2 = r3 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = 196608(0x30000, float:2.75506E-40)
            r20 = r2 | r3
            r21 = 0
            r22 = 82196(0x14114, float:1.15181E-40)
            r4 = 0
            r6 = 0
            r10 = 0
            r16 = 0
            r18 = 0
            r2 = r5
            r3 = r8
            r5 = r30
            r7 = r26
            r8 = r23
            r9 = r11
            r11 = r19
            r23 = r12
            r12 = r27
            r13 = r25
            r14 = r24
            r19 = r23
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0188
            androidx.compose.runtime.ComposerKt.X()
        L_0x0188:
            androidx.compose.runtime.ScopeUpdateScope r2 = r23.x()
            if (r2 == 0) goto L_0x019a
            com.hansecom.abt.presentation.screens.home.account.G r3 = new com.hansecom.abt.presentation.screens.home.account.G
            r4 = r30
            r5 = r32
            r3.<init>(r0, r1, r4, r5)
            r2.a(r3)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt.p(com.hansecom.abt.presentation.screens.home.account.Account$State, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit q(FocusManager focusManager, Function1 function1) {
        FocusManager.g(focusManager, false, 1, (Object) null);
        function1.invoke(Account.Action.Close.f35015a);
        return Unit.f40552a;
    }

    public static final Unit r(Function1 function1) {
        function1.invoke(new Account.Action.CloseDialog(false));
        return Unit.f40552a;
    }

    public static final Unit s(Account.State state, Function1 function1, boolean z2, int i2, Composer composer, int i3) {
        p(state, function1, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit t(Function1 function1) {
        function1.invoke(new Account.Action.CloseDialog(false));
        return Unit.f40552a;
    }

    public static final void u(Modifier modifier, Account.State state, Function1 function1, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-378684544);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? q2.W(state) : q2.l(state) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function1) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-378684544, i4, -1, "com.hansecom.abt.presentation.screens.home.account.Content (AccountScreen.kt:118)");
            }
            ScreenContentKt.d((Modifier) null, 0, 0, ComposableLambdaKt.e(419099969, true, new AccountScreenKt$Content$1(modifier, state, function1), q2, 54), q2, 3072, 7);
            p(state, function1, state.g(), q2, (i4 >> 3) & 126);
            w(function1, state.h(), q2, (i4 >> 6) & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C(modifier, state, function1, i2));
        }
    }

    public static final Unit v(Modifier modifier, Account.State state, Function1 function1, int i2, Composer composer, int i3) {
        u(modifier, state, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(kotlin.jvm.functions.Function1 r24, boolean r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            r0 = r24
            r14 = r25
            r1 = 214366919(0xcc6fac7, float:3.0657661E-31)
            r2 = r26
            androidx.compose.runtime.Composer r13 = r2.q(r1)
            r2 = r27 & 6
            r3 = 4
            if (r2 != 0) goto L_0x001e
            boolean r2 = r13.l(r0)
            if (r2 == 0) goto L_0x001a
            r2 = r3
            goto L_0x001b
        L_0x001a:
            r2 = 2
        L_0x001b:
            r2 = r27 | r2
            goto L_0x0020
        L_0x001e:
            r2 = r27
        L_0x0020:
            r4 = r27 & 48
            if (r4 != 0) goto L_0x0030
            boolean r4 = r13.d(r14)
            if (r4 == 0) goto L_0x002d
            r4 = 32
            goto L_0x002f
        L_0x002d:
            r4 = 16
        L_0x002f:
            r2 = r2 | r4
        L_0x0030:
            r4 = r2 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0044
            boolean r4 = r13.t()
            if (r4 != 0) goto L_0x003d
            goto L_0x0044
        L_0x003d:
            r13.B()
            r22 = r13
            goto L_0x0110
        L_0x0044:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0050
            r4 = -1
            java.lang.String r5 = "com.hansecom.abt.presentation.screens.home.account.LogoutDialog (AccountScreen.kt:197)"
            androidx.compose.runtime.ComposerKt.Y(r1, r2, r4, r5)
        L_0x0050:
            int r1 = com.hansecom.abt.R.string.f33072y
            r4 = 0
            java.lang.String r8 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r4)
            int r1 = com.hansecom.abt.R.string.f33071x
            java.lang.String r18 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r4)
            int r1 = com.hansecom.abt.R.string.f33073z
            java.lang.String r1 = androidx.compose.ui.res.StringResources_androidKt.b(r1, r13, r4)
            int r5 = com.hansecom.abt.R.string.f33046A
            java.lang.String r11 = androidx.compose.ui.res.StringResources_androidKt.b(r5, r13, r4)
            r5 = 1188228002(0x46d2eba2, float:26997.816)
            r13.X(r5)
            r5 = r2 & 14
            r6 = 1
            if (r5 != r3) goto L_0x0076
            r7 = r6
            goto L_0x0077
        L_0x0076:
            r7 = r4
        L_0x0077:
            java.lang.Object r9 = r13.g()
            if (r7 != 0) goto L_0x0085
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x008d
        L_0x0085:
            com.hansecom.abt.presentation.screens.home.account.H r9 = new com.hansecom.abt.presentation.screens.home.account.H
            r9.<init>(r0)
            r13.N(r9)
        L_0x008d:
            r22 = r9
            kotlin.jvm.functions.Function0 r22 = (kotlin.jvm.functions.Function0) r22
            r13.M()
            r7 = 1188232783(0x46d2fe4f, float:27007.154)
            r13.X(r7)
            if (r5 != r3) goto L_0x009e
            r7 = r6
            goto L_0x009f
        L_0x009e:
            r7 = r4
        L_0x009f:
            java.lang.Object r9 = r13.g()
            if (r7 != 0) goto L_0x00ad
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x00b5
        L_0x00ad:
            com.hansecom.abt.presentation.screens.home.account.I r9 = new com.hansecom.abt.presentation.screens.home.account.I
            r9.<init>(r0)
            r13.N(r9)
        L_0x00b5:
            r23 = r9
            kotlin.jvm.functions.Function0 r23 = (kotlin.jvm.functions.Function0) r23
            r13.M()
            r7 = 1188222863(0x46d2d78f, float:26987.78)
            r13.X(r7)
            if (r5 != r3) goto L_0x00c5
            r4 = r6
        L_0x00c5:
            java.lang.Object r3 = r13.g()
            if (r4 != 0) goto L_0x00d3
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x00db
        L_0x00d3:
            com.hansecom.abt.presentation.screens.home.account.y r3 = new com.hansecom.abt.presentation.screens.home.account.y
            r3.<init>(r0)
            r13.N(r3)
        L_0x00db:
            r16 = r3
            kotlin.jvm.functions.Function0 r16 = (kotlin.jvm.functions.Function0) r16
            r13.M()
            int r2 = r2 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r19 = r2
            r20 = 0
            r21 = 84852(0x14b74, float:1.18903E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r2 = r11
            r4 = r25
            r11 = r22
            r22 = r13
            r13 = r18
            r14 = r23
            r18 = r22
            com.hansecom.abt.ui.components.dialog.AbtDialogKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0110
            androidx.compose.runtime.ComposerKt.X()
        L_0x0110:
            androidx.compose.runtime.ScopeUpdateScope r1 = r22.x()
            if (r1 == 0) goto L_0x0122
            com.hansecom.abt.presentation.screens.home.account.z r2 = new com.hansecom.abt.presentation.screens.home.account.z
            r3 = r25
            r4 = r27
            r2.<init>(r0, r3, r4)
            r1.a(r2)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt.w(kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit x(Function1 function1) {
        function1.invoke(Account.Action.LogOut.f35019a);
        return Unit.f40552a;
    }

    public static final Unit y(Function1 function1) {
        function1.invoke(new Account.Action.LogoutDialog(false));
        return Unit.f40552a;
    }

    public static final Unit z(Function1 function1) {
        function1.invoke(new Account.Action.LogoutDialog(false));
        return Unit.f40552a;
    }
}
