package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

@Metadata
public final class DatePickerKt$YearPicker$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f9760A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ IntRange f9761B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ DatePickerColors D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ SelectableDates F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9762z;

    public DatePickerKt$YearPicker$1(CalendarModel calendarModel, long j2, IntRange intRange, Modifier modifier, DatePickerColors datePickerColors, Function1 function1, SelectableDates selectableDates) {
        this.f9762z = calendarModel;
        this.f9760A = j2;
        this.f9761B = intRange;
        this.C = modifier;
        this.D = datePickerColors;
        this.E = function1;
        this.F = selectableDates;
    }

    public static final Unit e(IntRange intRange, CalendarModel calendarModel, int i2, int i3, Function1 function1, SelectableDates selectableDates, DatePickerColors datePickerColors, LazyGridScope lazyGridScope) {
        LazyGridScope.b(lazyGridScope, CollectionsKt.X(intRange), (Function1) null, (Function2) null, (Function1) null, ComposableLambdaKt.c(674613074, true, new DatePickerKt$YearPicker$1$1$1$1(intRange, calendarModel, i2, i3, function1, selectableDates, datePickerColors)), 14, (Object) null);
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b9, code lost:
        if (r13 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r12 = r22
            r1 = r23
            r2 = r1 & 3
            r3 = 0
            r4 = 2
            if (r2 == r4) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = r3
        L_0x000f:
            r5 = r1 & 1
            boolean r2 = r12.E(r2, r5)
            if (r2 == 0) goto L_0x00f5
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r5 = "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2070)"
            r6 = 1301915789(0x4d99a88d, float:3.22245024E8)
            androidx.compose.runtime.ComposerKt.Y(r6, r1, r2, r5)
        L_0x0026:
            androidx.compose.material3.internal.CalendarModel r1 = r0.f9762z
            androidx.compose.material3.internal.CalendarDate r2 = r1.j()
            androidx.compose.material3.internal.CalendarMonth r1 = r1.i(r2)
            int r1 = r1.f()
            androidx.compose.material3.internal.CalendarModel r2 = r0.f9762z
            long r5 = r0.f9760A
            androidx.compose.material3.internal.CalendarMonth r2 = r2.h(r5)
            int r2 = r2.f()
            kotlin.ranges.IntRange r5 = r0.f9761B
            int r5 = r5.n()
            int r5 = r2 - r5
            r6 = 3
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r3, r5)
            androidx.compose.foundation.lazy.grid.LazyGridState r3 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.b(r5, r3, r12, r3, r4)
            androidx.compose.foundation.lazy.grid.GridCells$Fixed r4 = new androidx.compose.foundation.lazy.grid.GridCells$Fixed
            r4.<init>(r6)
            androidx.compose.ui.Modifier r13 = r0.C
            androidx.compose.material3.DatePickerColors r5 = r0.D
            long r14 = r5.c()
            r17 = 2
            r18 = 0
            r16 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.BackgroundKt.b(r13, r14, r16, r17, r18)
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r7 = r6.e()
            float r8 = androidx.compose.material3.DatePickerKt.f9710g
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r6 = r6.n(r8)
            kotlin.ranges.IntRange r8 = r0.f9761B
            boolean r8 = r12.l(r8)
            androidx.compose.material3.internal.CalendarModel r9 = r0.f9762z
            boolean r9 = r12.l(r9)
            r8 = r8 | r9
            boolean r9 = r12.i(r2)
            r8 = r8 | r9
            boolean r9 = r12.i(r1)
            r8 = r8 | r9
            kotlin.jvm.functions.Function1 r9 = r0.E
            boolean r9 = r12.W(r9)
            r8 = r8 | r9
            androidx.compose.material3.SelectableDates r9 = r0.F
            boolean r9 = r12.W(r9)
            r8 = r8 | r9
            androidx.compose.material3.DatePickerColors r9 = r0.D
            boolean r9 = r12.W(r9)
            r8 = r8 | r9
            kotlin.ranges.IntRange r14 = r0.f9761B
            androidx.compose.material3.internal.CalendarModel r15 = r0.f9762z
            kotlin.jvm.functions.Function1 r9 = r0.E
            androidx.compose.material3.SelectableDates r10 = r0.F
            androidx.compose.material3.DatePickerColors r11 = r0.D
            java.lang.Object r13 = r22.g()
            if (r8 != 0) goto L_0x00bb
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r13 != r8) goto L_0x00ce
        L_0x00bb:
            androidx.compose.material3.B1 r8 = new androidx.compose.material3.B1
            r13 = r8
            r16 = r2
            r17 = r1
            r18 = r9
            r19 = r10
            r20 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r12.N(r8)
        L_0x00ce:
            r11 = r13
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r14 = 0
            r15 = 920(0x398, float:1.289E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r16 = 0
            r17 = 1769472(0x1b0000, float:2.479558E-39)
            r1 = r4
            r2 = r5
            r4 = r8
            r5 = r9
            r8 = r10
            r9 = r13
            r10 = r16
            r12 = r22
            r13 = r17
            androidx.compose.foundation.lazy.grid.LazyGridDslKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00f8
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00f8
        L_0x00f5:
            r22.B()
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$YearPicker$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
