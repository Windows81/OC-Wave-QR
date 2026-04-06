package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SnackbarKt$Snackbar$actionComposable$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8494A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f8495B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8496z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$actionComposable$1(long j2, SnackbarData snackbarData, String str) {
        super(2);
        this.f8496z = j2;
        this.f8494A = snackbarData;
        this.f8495B = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.runtime.Composer r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r11 = r15
            r1 = r16
            r2 = r1 & 3
            r3 = 2
            r12 = 1
            if (r2 == r3) goto L_0x000c
            r2 = r12
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            r3 = r1 & 1
            boolean r2 = r15.E(r2, r3)
            if (r2 == 0) goto L_0x007e
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0024
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:172)"
            r4 = 1843479216(0x6de142b0, float:8.7143434E27)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0024:
            androidx.compose.material.ButtonDefaults r1 = androidx.compose.material.ButtonDefaults.f7422a
            long r4 = r0.f8496z
            r9 = 3072(0xc00, float:4.305E-42)
            r10 = 5
            r2 = 0
            r6 = 0
            r8 = r15
            androidx.compose.material.ButtonColors r8 = r1.g(r2, r4, r6, r8, r9, r10)
            androidx.compose.material.SnackbarData r1 = r0.f8494A
            boolean r1 = r15.l(r1)
            androidx.compose.material.SnackbarData r2 = r0.f8494A
            java.lang.Object r3 = r15.g()
            if (r1 != 0) goto L_0x004a
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0052
        L_0x004a:
            androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1 r3 = new androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1
            r3.<init>(r2)
            r15.N(r3)
        L_0x0052:
            r1 = r3
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$2 r2 = new androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$2
            java.lang.String r3 = r0.f8495B
            r2.<init>(r3)
            r3 = 54
            r4 = -929149933(0xffffffffc89e4c13, float:-324192.6)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r12, r2, r15, r3)
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r13 = 382(0x17e, float:5.35E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = r15
            androidx.compose.material.ButtonKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0081
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0081
        L_0x007e:
            r15.B()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.b(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
