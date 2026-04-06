package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DatePickerKt$DisplayModeToggleButton$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f9733A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f9734B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f9735z;

    public DatePickerKt$DisplayModeToggleButton$1(int i2, Function1 function1, Modifier modifier) {
        this.f9735z = i2;
        this.f9733A = function1;
        this.f9734B = modifier;
    }

    public static final Unit f(Function1 function1) {
        function1.invoke(DisplayMode.c(DisplayMode.f9856b.a()));
        return Unit.f40552a;
    }

    public static final Unit g(Function1 function1) {
        function1.invoke(DisplayMode.c(DisplayMode.f9856b.b()));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r13, int r14) {
        /*
            r12 = this;
            r0 = 1
            r1 = r14 & 3
            r2 = 2
            r3 = 0
            if (r1 == r2) goto L_0x0009
            r1 = r0
            goto L_0x000a
        L_0x0009:
            r1 = r3
        L_0x000a:
            r0 = r0 & r14
            boolean r0 = r13.E(r1, r0)
            if (r0 == 0) goto L_0x00c5
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0020
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.DisplayModeToggleButton.<anonymous> (DatePicker.kt:1408)"
            r2 = -1734512197(0xffffffff989d71bb, float:-4.0698387E-24)
            androidx.compose.runtime.ComposerKt.Y(r2, r14, r0, r1)
        L_0x0020:
            int r14 = r12.f9735z
            androidx.compose.material3.DisplayMode$Companion r0 = androidx.compose.material3.DisplayMode.f9856b
            int r0 = r0.b()
            boolean r14 = androidx.compose.material3.DisplayMode.f(r14, r0)
            if (r14 == 0) goto L_0x0075
            r14 = -101264927(0xfffffffff9f6d1e1, float:-1.6019523E35)
            r13.X(r14)
            androidx.compose.material3.internal.Icons$Filled r14 = androidx.compose.material3.internal.Icons.Filled.f12257a
            androidx.compose.ui.graphics.vector.ImageVector r5 = r14.e()
            androidx.compose.material3.internal.Strings$Companion r14 = androidx.compose.material3.internal.Strings.f12320b
            int r14 = androidx.compose.material3.R.string.f10673t
            int r14 = androidx.compose.material3.internal.Strings.a(r14)
            java.lang.String r6 = androidx.compose.material3.internal.Strings_androidKt.b(r14, r13, r3)
            kotlin.jvm.functions.Function1 r14 = r12.f9733A
            boolean r14 = r13.W(r14)
            kotlin.jvm.functions.Function1 r0 = r12.f9733A
            java.lang.Object r1 = r13.g()
            if (r14 != 0) goto L_0x005c
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r1 != r14) goto L_0x0064
        L_0x005c:
            androidx.compose.material3.t1 r1 = new androidx.compose.material3.t1
            r1.<init>(r0)
            r13.N(r1)
        L_0x0064:
            r4 = r1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            androidx.compose.ui.Modifier r7 = r12.f9734B
            r10 = 0
            r11 = 16
            r8 = 0
            r9 = r13
            androidx.compose.material3.DatePickerKt.S(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.M()
            goto L_0x00bb
        L_0x0075:
            r14 = -100967048(0xfffffffff9fb5d78, float:-1.6314529E35)
            r13.X(r14)
            androidx.compose.material3.internal.Icons$Filled r14 = androidx.compose.material3.internal.Icons.Filled.f12257a
            androidx.compose.ui.graphics.vector.ImageVector r5 = r14.d()
            androidx.compose.material3.internal.Strings$Companion r14 = androidx.compose.material3.internal.Strings.f12320b
            int r14 = androidx.compose.material3.R.string.f10671r
            int r14 = androidx.compose.material3.internal.Strings.a(r14)
            java.lang.String r6 = androidx.compose.material3.internal.Strings_androidKt.b(r14, r13, r3)
            kotlin.jvm.functions.Function1 r14 = r12.f9733A
            boolean r14 = r13.W(r14)
            kotlin.jvm.functions.Function1 r0 = r12.f9733A
            java.lang.Object r1 = r13.g()
            if (r14 != 0) goto L_0x00a3
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r1 != r14) goto L_0x00ab
        L_0x00a3:
            androidx.compose.material3.u1 r1 = new androidx.compose.material3.u1
            r1.<init>(r0)
            r13.N(r1)
        L_0x00ab:
            r4 = r1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            androidx.compose.ui.Modifier r7 = r12.f9734B
            r10 = 0
            r11 = 16
            r8 = 0
            r9 = r13
            androidx.compose.material3.DatePickerKt.S(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.M()
        L_0x00bb:
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x00c8
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00c8
        L_0x00c5:
            r13.B()
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
