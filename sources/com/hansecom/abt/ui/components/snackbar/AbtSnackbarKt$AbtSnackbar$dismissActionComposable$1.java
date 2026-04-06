package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarData;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtSnackbarKt$AbtSnackbar$dismissActionComposable$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f38792z;

    public AbtSnackbarKt$AbtSnackbar$dismissActionComposable$1(SnackbarData snackbarData) {
        this.f38792z = snackbarData;
    }

    /* access modifiers changed from: private */
    public static final Unit e(SnackbarData snackbarData) {
        snackbarData.dismiss();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r13, int r14) {
        /*
            r12 = this;
            r0 = r14 & 3
            r1 = 2
            if (r0 != r1) goto L_0x0010
            boolean r0 = r13.t()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r13.B()
            goto L_0x0065
        L_0x0010:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x001f
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.ui.components.snackbar.AbtSnackbar.<anonymous> (AbtSnackbar.kt:119)"
            r2 = 1313047952(0x4e438590, float:8.2007757E8)
            androidx.compose.runtime.ComposerKt.Y(r2, r14, r0, r1)
        L_0x001f:
            r14 = -1628486232(0xffffffff9eef45a8, float:-2.5333918E-20)
            r13.X(r14)
            androidx.compose.material3.SnackbarData r14 = r12.f38792z
            boolean r14 = r13.W(r14)
            androidx.compose.material3.SnackbarData r0 = r12.f38792z
            java.lang.Object r1 = r13.g()
            if (r14 != 0) goto L_0x003b
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r1 != r14) goto L_0x0043
        L_0x003b:
            com.hansecom.abt.ui.components.snackbar.f r1 = new com.hansecom.abt.ui.components.snackbar.f
            r1.<init>(r0)
            r13.N(r1)
        L_0x0043:
            r2 = r1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r13.M()
            com.hansecom.abt.ui.components.snackbar.ComposableSingletons$AbtSnackbarKt r14 = com.hansecom.abt.ui.components.snackbar.ComposableSingletons$AbtSnackbarKt.f38803a
            kotlin.jvm.functions.Function2 r8 = r14.a()
            r10 = 1572864(0x180000, float:2.204052E-39)
            r11 = 62
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = r13
            androidx.compose.material3.IconButtonKt.e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0065
            androidx.compose.runtime.ComposerKt.X()
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.snackbar.AbtSnackbarKt$AbtSnackbar$dismissActionComposable$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
