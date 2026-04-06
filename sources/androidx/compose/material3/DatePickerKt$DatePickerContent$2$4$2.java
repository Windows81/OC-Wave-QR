package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class DatePickerKt$DatePickerContent$2$4$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f9726A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f9727B;
    public final /* synthetic */ LazyListState C;
    public final /* synthetic */ IntRange D;
    public final /* synthetic */ CalendarMonth E;
    public final /* synthetic */ SelectableDates F;
    public final /* synthetic */ CalendarModel G;
    public final /* synthetic */ DatePickerColors H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f9728z;

    public DatePickerKt$DatePickerContent$2$4$2(long j2, MutableState mutableState, CoroutineScope coroutineScope, LazyListState lazyListState, IntRange intRange, CalendarMonth calendarMonth, SelectableDates selectableDates, CalendarModel calendarModel, DatePickerColors datePickerColors) {
        this.f9728z = j2;
        this.f9726A = mutableState;
        this.f9727B = coroutineScope;
        this.C = lazyListState;
        this.D = intRange;
        this.E = calendarMonth;
        this.F = selectableDates;
        this.G = calendarModel;
        this.H = datePickerColors;
    }

    /* access modifiers changed from: private */
    public static final Unit f(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final Unit g(CoroutineScope coroutineScope, MutableState mutableState, LazyListState lazyListState, IntRange intRange, CalendarMonth calendarMonth, int i2) {
        DatePickerKt.G(mutableState, !DatePickerKt.F(mutableState));
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(lazyListState, i2, intRange, calendarMonth, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: androidx.compose.material3.r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: androidx.compose.material3.r1} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.animation.AnimatedVisibilityScope r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r11 = r21
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0015
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1632)"
            r3 = 1193716082(0x4726a972, float:42665.445)
            r4 = r22
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r1, r2)
        L_0x0015:
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.f10679z
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            r2 = 0
            java.lang.String r1 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r11, r2)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            boolean r4 = r11.W(r1)
            java.lang.Object r5 = r21.g()
            if (r4 != 0) goto L_0x0036
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x003e
        L_0x0036:
            androidx.compose.material3.q1 r5 = new androidx.compose.material3.q1
            r5.<init>(r1)
            r11.N(r5)
        L_0x003e:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r1 = 1
            r4 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r3, r2, r5, r1, r4)
            long r5 = r0.f9728z
            androidx.compose.runtime.MutableState r14 = r0.f9726A
            kotlinx.coroutines.CoroutineScope r13 = r0.f9727B
            androidx.compose.foundation.lazy.LazyListState r15 = r0.C
            kotlin.ranges.IntRange r7 = r0.D
            androidx.compose.material3.internal.CalendarMonth r8 = r0.E
            androidx.compose.material3.SelectableDates r9 = r0.F
            androidx.compose.material3.internal.CalendarModel r10 = r0.G
            androidx.compose.material3.DatePickerColors r12 = r0.H
            androidx.compose.foundation.layout.Arrangement r16 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r4 = r16.g()
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r0 = r16.k()
            androidx.compose.ui.layout.MeasurePolicy r0 = androidx.compose.foundation.layout.ColumnKt.a(r4, r0, r11, r2)
            int r2 = androidx.compose.runtime.ComposablesKt.a(r11, r2)
            androidx.compose.runtime.CompositionLocalMap r4 = r21.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r11, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r17 = r12
            kotlin.jvm.functions.Function0 r12 = r16.a()
            androidx.compose.runtime.Applier r18 = r21.v()
            if (r18 != 0) goto L_0x0085
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0085:
            r21.s()
            boolean r18 = r21.n()
            if (r18 == 0) goto L_0x0092
            r11.y(r12)
            goto L_0x0095
        L_0x0092:
            r21.K()
        L_0x0095:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r21)
            r18 = r10
            kotlin.jvm.functions.Function2 r10 = r16.c()
            androidx.compose.runtime.Updater.g(r12, r0, r10)
            kotlin.jvm.functions.Function2 r0 = r16.e()
            androidx.compose.runtime.Updater.g(r12, r4, r0)
            kotlin.jvm.functions.Function2 r0 = r16.b()
            boolean r4 = r12.n()
            if (r4 != 0) goto L_0x00c1
            java.lang.Object r4 = r12.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r10)
            if (r4 != 0) goto L_0x00cf
        L_0x00c1:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r12.N(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.A(r2, r0)
        L_0x00cf:
            kotlin.jvm.functions.Function2 r0 = r16.d()
            androidx.compose.runtime.Updater.g(r12, r1, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            float r0 = androidx.compose.material3.DatePickerKt.G0()
            r1 = 7
            float r1 = (float) r1
            float r0 = r0 * r1
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.material3.DividerDefaults r1 = androidx.compose.material3.DividerDefaults.f9860a
            float r1 = r1.b()
            float r0 = r0 - r1
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.l(r3, r0)
            float r1 = androidx.compose.material3.DatePickerKt.E0()
            r2 = 0
            r3 = 2
            r4 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r0, r1, r2, r3, r4)
            boolean r0 = r11.W(r14)
            boolean r2 = r11.l(r13)
            r0 = r0 | r2
            boolean r2 = r11.W(r15)
            r0 = r0 | r2
            boolean r2 = r11.l(r7)
            r0 = r0 | r2
            boolean r2 = r11.W(r8)
            r0 = r0 | r2
            java.lang.Object r2 = r21.g()
            if (r0 != 0) goto L_0x0127
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r0 = r17
            goto L_0x0136
        L_0x0127:
            androidx.compose.material3.r1 r2 = new androidx.compose.material3.r1
            r0 = r17
            r12 = r2
            r16 = r7
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r11.N(r2)
        L_0x0136:
            r4 = r2
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r10 = 6
            r2 = r5
            r5 = r9
            r6 = r18
            r8 = r0
            r9 = r21
            androidx.compose.material3.DatePickerKt.p0(r1, r2, r4, r5, r6, r7, r8, r9, r10)
            long r3 = r0.f()
            r6 = 0
            r7 = 3
            r1 = 0
            r2 = 0
            r5 = r21
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            r21.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x015d
            androidx.compose.runtime.ComposerKt.X()
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2.e(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
    }
}
