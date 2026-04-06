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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

@Metadata
public final class DatePickerKt$HorizontalMonthsList$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IntRange f9736A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9737B;
    public final /* synthetic */ CalendarMonth C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ CalendarDate E;
    public final /* synthetic */ Long F;
    public final /* synthetic */ DatePickerFormatter G;
    public final /* synthetic */ SelectableDates H;
    public final /* synthetic */ DatePickerColors I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f9738z;

    public DatePickerKt$HorizontalMonthsList$1(LazyListState lazyListState, IntRange intRange, CalendarModel calendarModel, CalendarMonth calendarMonth, Function1 function1, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.f9738z = lazyListState;
        this.f9736A = intRange;
        this.f9737B = calendarModel;
        this.C = calendarMonth;
        this.D = function1;
        this.E = calendarDate;
        this.F = l2;
        this.G = datePickerFormatter;
        this.H = selectableDates;
        this.I = datePickerColors;
    }

    public static final Unit h(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.k0(semanticsPropertyReceiver, new ScrollAxisRange(new C0281x1(), new C0290y1(), false, 4, (DefaultConstructorMarker) null));
        return Unit.f40552a;
    }

    public static final float i() {
        return 0.0f;
    }

    public static final float k() {
        return 0.0f;
    }

    public static final Unit p(IntRange intRange, CalendarModel calendarModel, CalendarMonth calendarMonth, Function1 function1, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, LazyListScope lazyListScope) {
        LazyListScope.e(lazyListScope, DatePickerKt.H0(intRange), (Function1) null, (Function1) null, ComposableLambdaKt.c(72599078, true, new DatePickerKt$HorizontalMonthsList$1$2$1$1(calendarModel, calendarMonth, function1, calendarDate, l2, datePickerFormatter, selectableDates, datePickerColors)), 6, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: androidx.compose.material3.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: androidx.compose.material3.w1} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ac, code lost:
        if (r0 == r7.a()) goto L_0x00ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.runtime.Composer r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r11 = r23
            r1 = r24
            r2 = r1 & 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x000f
            r2 = r5
            goto L_0x0010
        L_0x000f:
            r2 = r4
        L_0x0010:
            r3 = r1 & 1
            boolean r2 = r11.E(r2, r3)
            if (r2 == 0) goto L_0x00e4
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0027
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1721)"
            r6 = 1504086906(0x59a68b7a, float:5.8597753E15)
            androidx.compose.runtime.ComposerKt.Y(r6, r1, r2, r3)
        L_0x0027:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            java.lang.Object r2 = r23.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r7.a()
            if (r2 != r3) goto L_0x003d
            androidx.compose.material3.v1 r2 = new androidx.compose.material3.v1
            r2.<init>()
            r11.N(r2)
        L_0x003d:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r3 = 0
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r1, r4, r2, r5, r3)
            androidx.compose.foundation.lazy.LazyListState r9 = r0.f9738z
            androidx.compose.material3.DatePickerDefaults r1 = androidx.compose.material3.DatePickerDefaults.f9682a
            r5 = 384(0x180, float:5.38E-43)
            r6 = 2
            r2 = r9
            r4 = r23
            androidx.compose.foundation.gestures.FlingBehavior r10 = r1.k(r2, r3, r4, r5, r6)
            kotlin.ranges.IntRange r1 = r0.f9736A
            boolean r1 = r11.l(r1)
            androidx.compose.material3.internal.CalendarModel r2 = r0.f9737B
            boolean r2 = r11.l(r2)
            r1 = r1 | r2
            androidx.compose.material3.internal.CalendarMonth r2 = r0.C
            boolean r2 = r11.W(r2)
            r1 = r1 | r2
            kotlin.jvm.functions.Function1 r2 = r0.D
            boolean r2 = r11.W(r2)
            r1 = r1 | r2
            androidx.compose.material3.internal.CalendarDate r2 = r0.E
            boolean r2 = r11.W(r2)
            r1 = r1 | r2
            java.lang.Long r2 = r0.F
            boolean r2 = r11.W(r2)
            r1 = r1 | r2
            androidx.compose.material3.DatePickerFormatter r2 = r0.G
            boolean r2 = r11.l(r2)
            r1 = r1 | r2
            androidx.compose.material3.SelectableDates r2 = r0.H
            boolean r2 = r11.W(r2)
            r1 = r1 | r2
            androidx.compose.material3.DatePickerColors r2 = r0.I
            boolean r2 = r11.W(r2)
            r1 = r1 | r2
            kotlin.ranges.IntRange r13 = r0.f9736A
            androidx.compose.material3.internal.CalendarModel r14 = r0.f9737B
            androidx.compose.material3.internal.CalendarMonth r15 = r0.C
            kotlin.jvm.functions.Function1 r2 = r0.D
            androidx.compose.material3.internal.CalendarDate r3 = r0.E
            java.lang.Long r4 = r0.F
            androidx.compose.material3.DatePickerFormatter r5 = r0.G
            androidx.compose.material3.SelectableDates r6 = r0.H
            androidx.compose.material3.DatePickerColors r12 = r0.I
            java.lang.Object r0 = r23.g()
            if (r1 != 0) goto L_0x00ae
            java.lang.Object r1 = r7.a()
            if (r0 != r1) goto L_0x00c4
        L_0x00ae:
            androidx.compose.material3.w1 r0 = new androidx.compose.material3.w1
            r1 = r12
            r12 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11.N(r0)
        L_0x00c4:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r12 = 0
            r13 = 444(0x1bc, float:6.22E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r14 = 0
            r15 = 0
            r1 = r8
            r2 = r9
            r7 = r10
            r8 = r14
            r9 = r15
            r10 = r0
            r11 = r23
            androidx.compose.foundation.lazy.LazyDslKt.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00e7
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00e7
        L_0x00e4:
            r23.B()
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.g(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        g((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
