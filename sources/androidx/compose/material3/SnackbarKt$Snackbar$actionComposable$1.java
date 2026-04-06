package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SnackbarKt$Snackbar$actionComposable$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11194A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f11195B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f11196z;

    public SnackbarKt$Snackbar$actionComposable$1(long j2, SnackbarData snackbarData, String str) {
        this.f11196z = j2;
        this.f11194A = snackbarData;
        this.f11195B = str;
    }

    public static final Unit e(SnackbarData snackbarData) {
        snackbarData.b();
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            r13 = r16
            r1 = r17
            r2 = r1 & 3
            r3 = 2
            r14 = 1
            if (r2 == r3) goto L_0x000d
            r2 = r14
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r3 = r1 & 1
            boolean r2 = r13.E(r2, r3)
            if (r2 == 0) goto L_0x0085
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:211)"
            r4 = -1378313599(0xffffffffadd89a81, float:-2.462497E-11)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0025:
            androidx.compose.material3.ButtonDefaults r1 = androidx.compose.material3.ButtonDefaults.f9301a
            long r4 = r0.f11196z
            r11 = 24576(0x6000, float:3.4438E-41)
            r12 = 13
            r2 = 0
            r6 = 0
            r8 = 0
            r10 = r16
            androidx.compose.material3.ButtonColors r5 = r1.n(r2, r4, r6, r8, r10, r11, r12)
            androidx.compose.material3.SnackbarData r1 = r0.f11194A
            boolean r1 = r13.W(r1)
            androidx.compose.material3.SnackbarData r2 = r0.f11194A
            java.lang.Object r3 = r16.g()
            if (r1 != 0) goto L_0x004f
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0057
        L_0x004f:
            androidx.compose.material3.H6 r3 = new androidx.compose.material3.H6
            r3.<init>(r2)
            r13.N(r3)
        L_0x0057:
            r1 = r3
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2 r2 = new androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2
            java.lang.String r3 = r0.f11195B
            r2.<init>(r3)
            r3 = 54
            r4 = 521110564(0x1f0f8424, float:3.0390732E-20)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r14, r2, r13, r3)
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r14 = 494(0x1ee, float:6.92E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r16
            r13 = r14
            androidx.compose.material3.ButtonKt.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0088
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0088
        L_0x0085:
            r16.B()
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
