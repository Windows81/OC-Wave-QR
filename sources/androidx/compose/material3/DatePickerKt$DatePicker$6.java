package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class DatePickerKt$DatePicker$6 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9723A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9724B;
    public final /* synthetic */ DatePickerColors C;
    public final /* synthetic */ FocusRequester D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerState f9725z;

    public static final Unit f(DatePickerState datePickerState, Long l2) {
        datePickerState.k(l2);
        return Unit.f40552a;
    }

    public static final Unit g(DatePickerState datePickerState, long j2) {
        datePickerState.c(j2);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.runtime.Composer r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r13 = r17
            r1 = r18
            r2 = r1 & 3
            r3 = 2
            if (r2 == r3) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r3 = r1 & 1
            boolean r2 = r13.E(r2, r3)
            if (r2 == 0) goto L_0x009e
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:220)"
            r4 = -1346903698(0xffffffffafb7e16e, float:-3.3447684E-10)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0025:
            androidx.compose.material3.DatePickerState r1 = r0.f9725z
            java.lang.Long r1 = r1.i()
            androidx.compose.material3.DatePickerState r2 = r0.f9725z
            long r2 = r2.e()
            androidx.compose.material3.DatePickerState r4 = r0.f9725z
            int r4 = r4.b()
            androidx.compose.material3.DatePickerState r5 = r0.f9725z
            boolean r5 = r13.W(r5)
            androidx.compose.material3.DatePickerState r6 = r0.f9725z
            java.lang.Object r7 = r17.g()
            if (r5 != 0) goto L_0x004d
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x0055
        L_0x004d:
            androidx.compose.material3.o1 r7 = new androidx.compose.material3.o1
            r7.<init>(r6)
            r13.N(r7)
        L_0x0055:
            r5 = r7
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.material3.DatePickerState r6 = r0.f9725z
            boolean r6 = r13.W(r6)
            androidx.compose.material3.DatePickerState r7 = r0.f9725z
            java.lang.Object r8 = r17.g()
            if (r6 != 0) goto L_0x006e
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0076
        L_0x006e:
            androidx.compose.material3.p1 r8 = new androidx.compose.material3.p1
            r8.<init>(r7)
            r13.N(r8)
        L_0x0076:
            r6 = r8
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            androidx.compose.material3.internal.CalendarModel r7 = r0.f9723A
            androidx.compose.material3.DatePickerState r8 = r0.f9725z
            kotlin.ranges.IntRange r8 = r8.f()
            androidx.compose.material3.DatePickerFormatter r9 = r0.f9724B
            androidx.compose.material3.DatePickerState r10 = r0.f9725z
            androidx.compose.material3.SelectableDates r10 = r10.d()
            androidx.compose.material3.DatePickerColors r11 = r0.C
            androidx.compose.ui.focus.FocusRequester r12 = r0.D
            r14 = 0
            r15 = 0
            r13 = r17
            androidx.compose.material3.DatePickerKt.a0(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00a1
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00a1
        L_0x009e:
            r17.B()
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$DatePicker$6.e(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
