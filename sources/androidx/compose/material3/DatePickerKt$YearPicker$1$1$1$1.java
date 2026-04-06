package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.IntRange;

@Metadata
public final class DatePickerKt$YearPicker$1$1$1$1 implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9763A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f9764B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ SelectableDates E;
    public final /* synthetic */ DatePickerColors F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntRange f9765z;

    public DatePickerKt$YearPicker$1$1$1$1(IntRange intRange, CalendarModel calendarModel, int i2, int i3, Function1 function1, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.f9765z = intRange;
        this.f9763A = calendarModel;
        this.f9764B = i2;
        this.C = i3;
        this.D = function1;
        this.E = selectableDates;
        this.F = datePickerColors;
    }

    public static final Unit e(Function1 function1, int i2) {
        function1.invoke(Integer.valueOf(i2));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.lazy.grid.LazyGridItemScope r18, int r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r9 = r20
            r2 = 1
            r3 = r21 & 48
            if (r3 != 0) goto L_0x0019
            boolean r3 = r9.i(r1)
            if (r3 == 0) goto L_0x0014
            r3 = 32
            goto L_0x0016
        L_0x0014:
            r3 = 16
        L_0x0016:
            r3 = r21 | r3
            goto L_0x001b
        L_0x0019:
            r3 = r21
        L_0x001b:
            r4 = r3 & 145(0x91, float:2.03E-43)
            r5 = 144(0x90, float:2.02E-43)
            r6 = 0
            if (r4 == r5) goto L_0x0024
            r4 = r2
            goto L_0x0025
        L_0x0024:
            r4 = r6
        L_0x0025:
            r5 = r3 & 1
            boolean r4 = r9.E(r4, r5)
            if (r4 == 0) goto L_0x00d7
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003c
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2088)"
            r7 = 674613074(0x2835c752, float:1.0090739E-14)
            androidx.compose.runtime.ComposerKt.Y(r7, r3, r4, r5)
        L_0x003c:
            kotlin.ranges.IntRange r3 = r0.f9765z
            int r3 = r3.n()
            int r1 = r1 + r3
            androidx.compose.material3.internal.CalendarModel r3 = r0.f9763A
            java.util.Locale r14 = r3.f()
            r15 = 7
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.String r3 = androidx.compose.material3.CalendarLocale_jvmKt.c(r10, r11, r12, r13, r14, r15, r16)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material3.tokens.DatePickerModalTokens r5 = androidx.compose.material3.tokens.DatePickerModalTokens.f13010a
            float r7 = r5.v()
            float r5 = r5.u()
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.p(r4, r7, r5)
            int r5 = r0.f9764B
            if (r1 != r5) goto L_0x006a
            r5 = r2
            goto L_0x006b
        L_0x006a:
            r5 = r6
        L_0x006b:
            int r7 = r0.C
            if (r1 != r7) goto L_0x0071
            r7 = r2
            goto L_0x0072
        L_0x0071:
            r7 = r6
        L_0x0072:
            kotlin.jvm.functions.Function1 r8 = r0.D
            boolean r8 = r9.W(r8)
            boolean r10 = r9.i(r1)
            r8 = r8 | r10
            kotlin.jvm.functions.Function1 r10 = r0.D
            java.lang.Object r11 = r20.g()
            if (r8 != 0) goto L_0x008d
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r11 != r8) goto L_0x0095
        L_0x008d:
            androidx.compose.material3.C1 r11 = new androidx.compose.material3.C1
            r11.<init>(r10, r1)
            r9.N(r11)
        L_0x0095:
            r8 = r11
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            androidx.compose.material3.SelectableDates r10 = r0.E
            boolean r10 = r10.b(r1)
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.f10669p
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r1 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r9, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r3}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            java.lang.String r11 = java.lang.String.format(r1, r2)
            java.lang.String r1 = "format(...)"
            kotlin.jvm.internal.Intrinsics.h(r11, r1)
            androidx.compose.material3.DatePickerColors r12 = r0.F
            r13 = 48
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r8
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r20
            r10 = r13
            androidx.compose.material3.DatePickerKt.m0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00da
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00da
        L_0x00d7:
            r20.B()
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1$1.c(androidx.compose.foundation.lazy.grid.LazyGridItemScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
