package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SnackbarKt$Snackbar$dismissActionComposable$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11198z;

    public SnackbarKt$Snackbar$dismissActionComposable$1(SnackbarData snackbarData) {
        this.f11198z = snackbarData;
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
            if (r0 == r1) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r1 = r14 & 1
            boolean r0 = r13.E(r0, r1)
            if (r0 == 0) goto L_0x005d
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x001f
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:223)"
            r2 = -1812633777(0xffffffff93f5674f, float:-6.1948565E-27)
            androidx.compose.runtime.ComposerKt.Y(r2, r14, r0, r1)
        L_0x001f:
            androidx.compose.material3.SnackbarData r14 = r12.f11198z
            boolean r14 = r13.W(r14)
            androidx.compose.material3.SnackbarData r0 = r12.f11198z
            java.lang.Object r1 = r13.g()
            if (r14 != 0) goto L_0x0035
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r1 != r14) goto L_0x003d
        L_0x0035:
            androidx.compose.material3.I6 r1 = new androidx.compose.material3.I6
            r1.<init>(r0)
            r13.N(r1)
        L_0x003d:
            r2 = r1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            androidx.compose.material3.ComposableSingletons$SnackbarKt r14 = androidx.compose.material3.ComposableSingletons$SnackbarKt.f9588a
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
            if (r13 == 0) goto L_0x0060
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0060
        L_0x005d:
            r13.B()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
