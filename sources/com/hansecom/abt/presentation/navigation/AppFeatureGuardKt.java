package com.hansecom.abt.presentation.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AppFeatureGuardKt {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.navigation.NavController r17, boolean r18, java.lang.String r19, kotlin.jvm.functions.Function2 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r17
            r2 = r18
            r4 = r20
            r5 = r22
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            r0 = -1705035559(0xffffffff9a5f38d9, float:-4.616124E-23)
            r3 = r21
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r6 = r23 & 1
            if (r6 == 0) goto L_0x0022
            r6 = r5 | 6
            goto L_0x0032
        L_0x0022:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0031
            boolean r6 = r3.l(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 4
            goto L_0x002f
        L_0x002e:
            r6 = 2
        L_0x002f:
            r6 = r6 | r5
            goto L_0x0032
        L_0x0031:
            r6 = r5
        L_0x0032:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0039
            r6 = r6 | 48
            goto L_0x0049
        L_0x0039:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0049
            boolean r7 = r3.d(r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r6 = r6 | r7
        L_0x0049:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x0052
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r8 = r19
            goto L_0x0064
        L_0x0052:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004f
            r8 = r19
            boolean r9 = r3.W(r8)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r6 = r6 | r9
        L_0x0064:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x006b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007b
            boolean r9 = r3.l(r4)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r6 = r6 | r9
        L_0x007b:
            r9 = r6 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008d
            boolean r9 = r3.t()
            if (r9 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r3.B()
            r7 = r8
            goto L_0x00e5
        L_0x008d:
            if (r7 == 0) goto L_0x0091
            r7 = 0
            goto L_0x0092
        L_0x0091:
            r7 = r8
        L_0x0092:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x009e
            r8 = -1
            java.lang.String r9 = "com.hansecom.abt.presentation.navigation.AppFeatureGuard (AppFeatureGuard.kt:13)"
            androidx.compose.runtime.ComposerKt.Y(r0, r6, r8, r9)
        L_0x009e:
            if (r2 != 0) goto L_0x00c8
            r0 = -705358402(0xffffffffd5f515be, float:-3.36842163E13)
            r3.X(r0)
            r17.c0()
            if (r7 == 0) goto L_0x00c4
            androidx.compose.runtime.ProvidableCompositionLocal r0 = com.hansecom.abt.ui.CompositionLocalKt.c()
            java.lang.Object r0 = r3.C(r0)
            r8 = r0
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState r8 = (com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState) r8
            com.hansecom.abt.ui.components.snackbar.SnackbarType r10 = com.hansecom.abt.ui.components.snackbar.SnackbarType.WARNING
            r15 = 60
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r7
            com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState.e(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00c4:
            r3.M()
            goto L_0x00dc
        L_0x00c8:
            r0 = -705171007(0xffffffffd5f7f1c1, float:-3.40772121E13)
            r3.X(r0)
            int r0 = r6 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.m(r3, r0)
            r3.M()
        L_0x00dc:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00e5
            androidx.compose.runtime.ComposerKt.X()
        L_0x00e5:
            androidx.compose.runtime.ScopeUpdateScope r8 = r3.x()
            if (r8 == 0) goto L_0x00ff
            w.a r9 = new w.a
            r0 = r9
            r1 = r17
            r2 = r18
            r3 = r7
            r4 = r20
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.a(r9)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.navigation.AppFeatureGuardKt.b(androidx.navigation.NavController, boolean, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(NavController navController, boolean z2, String str, Function2 function2, int i2, int i3, Composer composer, int i4) {
        b(navController, z2, str, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
