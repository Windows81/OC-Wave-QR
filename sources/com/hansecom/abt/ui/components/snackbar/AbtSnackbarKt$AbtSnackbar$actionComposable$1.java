package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarData;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtSnackbarKt$AbtSnackbar$actionComposable$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f38790A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f38791z;

    public AbtSnackbarKt$AbtSnackbar$actionComposable$1(SnackbarData snackbarData, String str) {
        this.f38791z = snackbarData;
        this.f38790A = str;
    }

    /* access modifiers changed from: private */
    public static final Unit e(SnackbarData snackbarData) {
        snackbarData.b();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            r15 = r28
            r1 = r29
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r28.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r28.B()
            goto L_0x0097
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.snackbar.AbtSnackbar.<anonymous> (AbtSnackbar.kt:106)"
            r4 = -1816814818(0xffffffff93b59b1e, float:-4.584378E-27)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r2 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r1.d(r15, r2)
            androidx.compose.ui.text.TextStyle r22 = r1.g()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r2 = -1628495730(0xffffffff9eef208e, float:-2.5318574E-20)
            r15.X(r2)
            androidx.compose.material3.SnackbarData r2 = r0.f38791z
            boolean r2 = r15.W(r2)
            androidx.compose.material3.SnackbarData r3 = r0.f38791z
            java.lang.Object r4 = r28.g()
            if (r2 != 0) goto L_0x004f
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0057
        L_0x004f:
            com.hansecom.abt.ui.components.snackbar.e r4 = new com.hansecom.abt.ui.components.snackbar.e
            r4.<init>(r3)
            r15.N(r4)
        L_0x0057:
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r28.M()
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClickableKt.f(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = r0.f38790A
            r25 = 0
            r26 = 131068(0x1fffc, float:1.83665E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r23 = r28
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0097
            androidx.compose.runtime.ComposerKt.X()
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$actionComposable$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
