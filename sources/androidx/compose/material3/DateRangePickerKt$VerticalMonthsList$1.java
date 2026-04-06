package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

@Metadata
public final class DateRangePickerKt$VerticalMonthsList$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f9804A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9805B;
    public final /* synthetic */ LazyListState C;
    public final /* synthetic */ IntRange D;
    public final /* synthetic */ CalendarModel E;
    public final /* synthetic */ CalendarMonth F;
    public final /* synthetic */ DatePickerFormatter G;
    public final /* synthetic */ DatePickerColors H;
    public final /* synthetic */ CalendarDate I;
    public final /* synthetic */ SelectableDates J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f9806z;

    public DateRangePickerKt$VerticalMonthsList$1(Long l2, Long l3, Function2 function2, LazyListState lazyListState, IntRange intRange, CalendarModel calendarModel, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, CalendarDate calendarDate, SelectableDates selectableDates) {
        this.f9806z = l2;
        this.f9804A = l3;
        this.f9805B = function2;
        this.C = lazyListState;
        this.D = intRange;
        this.E = calendarModel;
        this.F = calendarMonth;
        this.G = datePickerFormatter;
        this.H = datePickerColors;
        this.I = calendarDate;
        this.J = selectableDates;
    }

    public static final Unit i(Long l2, Long l3, Function2 function2, long j2) {
        DateRangePickerKt.y(j2, l2, l3, function2);
        return Unit.f40552a;
    }

    public static final Unit k(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.J0(semanticsPropertyReceiver, new ScrollAxisRange(new C0045a2(), new C0055b2(), false, 4, (DefaultConstructorMarker) null));
        return Unit.f40552a;
    }

    public static final float p() {
        return 0.0f;
    }

    public static final float q() {
        return 0.0f;
    }

    public static final Unit s(IntRange intRange, CalendarModel calendarModel, CalendarMonth calendarMonth, Long l2, Long l3, Function1 function1, CalendarDate calendarDate, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, List list, LazyListScope lazyListScope) {
        LazyListScope.e(lazyListScope, DatePickerKt.H0(intRange), (Function1) null, (Function1) null, ComposableLambdaKt.c(682334170, true, new DateRangePickerKt$VerticalMonthsList$1$2$1$1(calendarModel, calendarMonth, l2, l3, function1, calendarDate, datePickerFormatter, selectableDates, datePickerColors, list)), 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.compose.material3.Z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.compose.material3.Z1} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x010e, code lost:
        if (r0 == r2.a()) goto L_0x0110;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.compose.runtime.Composer r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r11 = r26
            r1 = r27
            r2 = r1 & 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x000f
            r2 = r4
            goto L_0x0010
        L_0x000f:
            r2 = r5
        L_0x0010:
            r3 = r1 & 1
            boolean r2 = r11.E(r2, r3)
            if (r2 == 0) goto L_0x014c
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0027
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:822)"
            r6 = 1090773432(0x4103e1b8, float:8.242607)
            androidx.compose.runtime.ComposerKt.Y(r6, r1, r2, r3)
        L_0x0027:
            java.lang.Object r1 = r26.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r2.a()
            if (r1 != r3) goto L_0x003c
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r1 = androidx.compose.runtime.EffectsKt.j(r1, r11)
            r11.N(r1)
        L_0x003c:
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            androidx.compose.material3.internal.Strings$Companion r3 = androidx.compose.material3.internal.Strings.f12320b
            int r3 = androidx.compose.material3.R.string.F
            int r3 = androidx.compose.material3.internal.Strings.a(r3)
            java.lang.String r3 = androidx.compose.material3.internal.Strings_androidKt.b(r3, r11, r5)
            int r6 = androidx.compose.material3.R.string.E
            int r6 = androidx.compose.material3.internal.Strings.a(r6)
            java.lang.String r6 = androidx.compose.material3.internal.Strings_androidKt.b(r6, r11, r5)
            java.lang.Long r7 = r0.f9806z
            boolean r7 = r11.W(r7)
            java.lang.Long r8 = r0.f9804A
            boolean r8 = r11.W(r8)
            r7 = r7 | r8
            kotlin.jvm.functions.Function2 r8 = r0.f9805B
            boolean r8 = r11.W(r8)
            r7 = r7 | r8
            java.lang.Long r8 = r0.f9806z
            java.lang.Long r9 = r0.f9804A
            kotlin.jvm.functions.Function2 r10 = r0.f9805B
            java.lang.Object r12 = r26.g()
            if (r7 != 0) goto L_0x007a
            java.lang.Object r7 = r2.a()
            if (r12 != r7) goto L_0x0082
        L_0x007a:
            androidx.compose.material3.X1 r12 = new androidx.compose.material3.X1
            r12.<init>(r8, r9, r10)
            r11.N(r12)
        L_0x0082:
            r7 = r12
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            androidx.compose.foundation.lazy.LazyListState r8 = r0.C
            java.util.List r1 = androidx.compose.material3.DateRangePickerKt.t(r8, r1, r3, r6)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            java.lang.Object r6 = r26.g()
            java.lang.Object r8 = r2.a()
            if (r6 != r8) goto L_0x009f
            androidx.compose.material3.Y1 r6 = new androidx.compose.material3.Y1
            r6.<init>()
            r11.N(r6)
        L_0x009f:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r8 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r3, r5, r6, r4, r8)
            androidx.compose.foundation.lazy.LazyListState r4 = r0.C
            kotlin.ranges.IntRange r5 = r0.D
            boolean r5 = r11.l(r5)
            androidx.compose.material3.internal.CalendarModel r6 = r0.E
            boolean r6 = r11.l(r6)
            r5 = r5 | r6
            androidx.compose.material3.internal.CalendarMonth r6 = r0.F
            boolean r6 = r11.W(r6)
            r5 = r5 | r6
            androidx.compose.material3.DatePickerFormatter r6 = r0.G
            boolean r6 = r11.l(r6)
            r5 = r5 | r6
            boolean r6 = r11.l(r1)
            r5 = r5 | r6
            androidx.compose.material3.DatePickerColors r6 = r0.H
            boolean r6 = r11.W(r6)
            r5 = r5 | r6
            java.lang.Long r6 = r0.f9806z
            boolean r6 = r11.W(r6)
            r5 = r5 | r6
            java.lang.Long r6 = r0.f9804A
            boolean r6 = r11.W(r6)
            r5 = r5 | r6
            boolean r6 = r11.W(r7)
            r5 = r5 | r6
            androidx.compose.material3.internal.CalendarDate r6 = r0.I
            boolean r6 = r11.W(r6)
            r5 = r5 | r6
            androidx.compose.material3.SelectableDates r6 = r0.J
            boolean r6 = r11.W(r6)
            r5 = r5 | r6
            kotlin.ranges.IntRange r14 = r0.D
            androidx.compose.material3.internal.CalendarModel r15 = r0.E
            androidx.compose.material3.internal.CalendarMonth r6 = r0.F
            java.lang.Long r8 = r0.f9806z
            java.lang.Long r9 = r0.f9804A
            androidx.compose.material3.internal.CalendarDate r10 = r0.I
            androidx.compose.material3.DatePickerFormatter r12 = r0.G
            androidx.compose.material3.SelectableDates r13 = r0.J
            r27 = r4
            androidx.compose.material3.DatePickerColors r4 = r0.H
            java.lang.Object r0 = r26.g()
            if (r5 != 0) goto L_0x0110
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x012c
        L_0x0110:
            androidx.compose.material3.Z1 r0 = new androidx.compose.material3.Z1
            r2 = r13
            r13 = r0
            r16 = r6
            r17 = r8
            r18 = r9
            r19 = r7
            r20 = r10
            r21 = r12
            r22 = r2
            r23 = r4
            r24 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11.N(r0)
        L_0x012c:
            r10 = r0
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r12 = 0
            r13 = 508(0x1fc, float:7.12E-43)
            r0 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r3
            r2 = r27
            r3 = r0
            r11 = r26
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x014f
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x014f
        L_0x014c:
            r26.B()
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.h(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        h((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
