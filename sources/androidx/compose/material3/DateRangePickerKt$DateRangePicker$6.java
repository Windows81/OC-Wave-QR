package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class DateRangePickerKt$DateRangePicker$6 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9798A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9799B;
    public final /* synthetic */ DatePickerColors C;
    public final /* synthetic */ FocusRequester D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f9800z;

    public static final Unit f(DateRangePickerState dateRangePickerState, Long l2, Long l3) {
        try {
            dateRangePickerState.h(l2, l3);
        } catch (IllegalArgumentException unused) {
        }
        return Unit.f40552a;
    }

    public static final Unit g(DateRangePickerState dateRangePickerState, long j2) {
        dateRangePickerState.c(j2);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r14 = r18
            r1 = r19
            r2 = r1 & 3
            r3 = 2
            if (r2 == r3) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r3 = r1 & 1
            boolean r2 = r14.E(r2, r3)
            if (r2 == 0) goto L_0x00a5
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:154)"
            r4 = 684885105(0x28d28471, float:2.337212E-14)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0025:
            androidx.compose.material3.DateRangePickerState r1 = r0.f9800z
            java.lang.Long r1 = r1.j()
            androidx.compose.material3.DateRangePickerState r2 = r0.f9800z
            java.lang.Long r2 = r2.g()
            androidx.compose.material3.DateRangePickerState r3 = r0.f9800z
            long r3 = r3.e()
            androidx.compose.material3.DateRangePickerState r5 = r0.f9800z
            int r5 = r5.b()
            androidx.compose.material3.DateRangePickerState r6 = r0.f9800z
            boolean r6 = r14.W(r6)
            androidx.compose.material3.DateRangePickerState r7 = r0.f9800z
            java.lang.Object r8 = r18.g()
            if (r6 != 0) goto L_0x0053
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x005b
        L_0x0053:
            androidx.compose.material3.V1 r8 = new androidx.compose.material3.V1
            r8.<init>(r7)
            r14.N(r8)
        L_0x005b:
            r6 = r8
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            androidx.compose.material3.DateRangePickerState r7 = r0.f9800z
            boolean r7 = r14.W(r7)
            androidx.compose.material3.DateRangePickerState r8 = r0.f9800z
            java.lang.Object r9 = r18.g()
            if (r7 != 0) goto L_0x0074
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x007c
        L_0x0074:
            androidx.compose.material3.W1 r9 = new androidx.compose.material3.W1
            r9.<init>(r8)
            r14.N(r9)
        L_0x007c:
            r7 = r9
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.material3.internal.CalendarModel r8 = r0.f9798A
            androidx.compose.material3.DateRangePickerState r9 = r0.f9800z
            kotlin.ranges.IntRange r9 = r9.f()
            androidx.compose.material3.DatePickerFormatter r10 = r0.f9799B
            androidx.compose.material3.DateRangePickerState r11 = r0.f9800z
            androidx.compose.material3.SelectableDates r11 = r11.d()
            androidx.compose.material3.DatePickerColors r12 = r0.C
            androidx.compose.ui.focus.FocusRequester r13 = r0.D
            r15 = 0
            r16 = 0
            r14 = r18
            androidx.compose.material3.DateRangePickerKt.i(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00a8
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00a8
        L_0x00a5:
            r18.B()
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt$DateRangePicker$6.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
