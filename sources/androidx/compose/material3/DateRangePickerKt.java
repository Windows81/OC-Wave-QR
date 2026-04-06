package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class DateRangePickerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final PaddingValues f9787a = PaddingKt.e(Dp.m((float) 24), Dp.m((float) 20), 0.0f, Dp.m((float) 8), 4, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final PaddingValues f9788b;

    /* renamed from: c  reason: collision with root package name */
    public static final PaddingValues f9789c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f9790d = Dp.m((float) 60);

    static {
        float f2 = (float) 64;
        float f3 = (float) 12;
        f9788b = PaddingKt.e(Dp.m(f2), 0.0f, Dp.m(f3), 0.0f, 10, (Object) null);
        f9789c = PaddingKt.e(Dp.m(f2), 0.0f, Dp.m(f3), Dp.m(f3), 2, (Object) null);
    }

    public static final void g(Long l2, Long l3, long j2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Composer composer2;
        long j3 = j2;
        CalendarModel calendarModel2 = calendarModel;
        IntRange intRange2 = intRange;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        DatePickerColors datePickerColors2 = datePickerColors;
        int i4 = i2;
        Composer q2 = composer.q(-787063721);
        Long l4 = l2;
        if ((i4 & 6) == 0) {
            i3 = (q2.W(l4) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        Long l5 = l3;
        if ((i4 & 48) == 0) {
            i3 |= q2.W(l5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.j(j3) ? 256 : 128;
        }
        Function2 function22 = function2;
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function22) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function1) ? 16384 : 8192;
        } else {
            Function1 function12 = function1;
        }
        if ((i4 & 196608) == 0) {
            i3 |= q2.l(calendarModel2) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i3 |= q2.l(intRange2) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i3 |= (i4 & 16777216) == 0 ? q2.W(datePickerFormatter2) : q2.l(datePickerFormatter2) ? 8388608 : 4194304;
        }
        SelectableDates selectableDates2 = selectableDates;
        if ((i4 & 100663296) == 0) {
            i3 |= q2.W(selectableDates2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i3 |= q2.W(datePickerColors2) ? 536870912 : 268435456;
        }
        if (q2.E((i3 & 306783379) != 306783378, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-787063721, i3, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:764)");
            }
            int e2 = RangesKt.e(calendarModel2.h(j3).g(intRange2), 0);
            LazyListState b2 = LazyListStateKt.b(e2, 0, q2, 0, 2);
            Integer valueOf = Integer.valueOf(e2);
            boolean W = q2.W(b2) | q2.i(e2);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new DateRangePickerKt$DateRangePickerContent$1$1(b2, e2, (Continuation) null);
                q2.N(g2);
            }
            EffectsKt.g(valueOf, (Function2) g2, q2, 0);
            Modifier k2 = PaddingKt.k(Modifier.f15489d, DatePickerKt.E0(), 0.0f, 2, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, k2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, a2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
            }
            Updater.g(b3, e3, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            DatePickerKt.j0(datePickerColors2, calendarModel2, q2, ((i3 >> 27) & 14) | ((i3 >> 12) & 112));
            composer2 = q2;
            l(b2, l2, l3, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, ((i3 << 3) & 1008) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3));
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new O1(l2, l3, j2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i2));
        }
    }

    public static final Unit h(Long l2, Long l3, long j2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        g(l2, l3, j2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void i(Long l2, Long l3, long j2, int i2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        int i7 = i3;
        Composer q2 = composer.q(621028059);
        int i8 = 2;
        Long l4 = l2;
        if ((i7 & 6) == 0) {
            i5 = (q2.W(l4) ? 4 : 2) | i7;
        } else {
            i5 = i7;
        }
        int i9 = 16;
        Long l5 = l3;
        if ((i7 & 48) == 0) {
            i5 |= q2.W(l5) ? 32 : 16;
        }
        long j3 = j2;
        if ((i7 & 384) == 0) {
            i5 |= q2.j(j3) ? 256 : 128;
        }
        int i10 = i2;
        if ((i7 & 3072) == 0) {
            i5 |= q2.i(i10) ? 2048 : 1024;
        }
        Function2 function22 = function2;
        if ((i7 & 24576) == 0) {
            i5 |= q2.l(function22) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i5 |= q2.l(function1) ? 131072 : 65536;
        } else {
            Function1 function12 = function1;
        }
        CalendarModel calendarModel2 = calendarModel;
        if ((i7 & 1572864) == 0) {
            i5 |= q2.l(calendarModel2) ? 1048576 : 524288;
        }
        IntRange intRange2 = intRange;
        if ((i7 & 12582912) == 0) {
            i5 |= q2.l(intRange2) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i5 |= (i7 & 134217728) == 0 ? q2.W(datePickerFormatter2) : q2.l(datePickerFormatter2) ? 67108864 : 33554432;
        }
        SelectableDates selectableDates2 = selectableDates;
        if ((i7 & 805306368) == 0) {
            i5 |= q2.W(selectableDates2) ? 536870912 : 268435456;
        }
        DatePickerColors datePickerColors2 = datePickerColors;
        if ((i4 & 6) == 0) {
            if (q2.W(datePickerColors2)) {
                i8 = 4;
            }
            i6 = i4 | i8;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            if (q2.W(focusRequester)) {
                i9 = 32;
            }
            i6 |= i9;
        } else {
            FocusRequester focusRequester2 = focusRequester;
        }
        if (q2.E(((306783379 & i5) == 306783378 && (i6 & 19) == 18) ? false : true, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(621028059, i5, i6, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:708)");
            }
            FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, q2, 6);
            Modifier.Companion companion = Modifier.f15489d;
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new P1();
                q2.N(g2);
            }
            Modifier d2 = SemanticsModifierKt.d(companion, false, (Function1) g2, 1, (Object) null);
            DisplayMode c2 = DisplayMode.c(i2);
            DateRangePickerKt$SwitchableDateEntryContent$2 dateRangePickerKt$SwitchableDateEntryContent$2 = r0;
            DateRangePickerKt$SwitchableDateEntryContent$2 dateRangePickerKt$SwitchableDateEntryContent$22 = new DateRangePickerKt$SwitchableDateEntryContent$2(l2, l3, j2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester);
            CrossfadeKt.b(c2, d2, b2, (String) null, ComposableLambdaKt.e(-773828161, true, dateRangePickerKt$SwitchableDateEntryContent$2, q2, 54), q2, ((i5 >> 9) & 14) | 24576, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            Q1 q1 = r0;
            Q1 q12 = new Q1(l2, l3, j2, i2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i3, i4);
            x2.a(q1);
        }
    }

    public static final Unit j(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.c0(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public static final Unit k(Long l2, Long l3, long j2, int i2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4, Composer composer, int i5) {
        i(l2, l3, j2, i2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.a(i3 | 1), RecomposeScopeImplKt.a(i4));
        return Unit.f40552a;
    }

    public static final void l(LazyListState lazyListState, Long l2, Long l3, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i2) {
        int i3;
        Composer composer2;
        CalendarMonth calendarMonth;
        LazyListState lazyListState2 = lazyListState;
        CalendarModel calendarModel2 = calendarModel;
        IntRange intRange2 = intRange;
        DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
        int i4 = i2;
        Composer q2 = composer.q(1257365001);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(lazyListState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        Long l4 = l2;
        if ((i4 & 48) == 0) {
            i3 |= q2.W(l4) ? 32 : 16;
        }
        Long l5 = l3;
        if ((i4 & 384) == 0) {
            i3 |= q2.W(l5) ? 256 : 128;
        }
        Function2 function22 = function2;
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function22) ? 2048 : 1024;
        }
        Function1 function12 = function1;
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function12) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.l(calendarModel2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.l(intRange2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i3 |= (16777216 & i4) == 0 ? q2.W(datePickerFormatter2) : q2.l(datePickerFormatter2) ? 8388608 : 4194304;
        }
        SelectableDates selectableDates2 = selectableDates;
        if ((100663296 & i4) == 0) {
            i3 |= q2.W(selectableDates2) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i3 |= q2.W(datePickerColors) ? 536870912 : 268435456;
        } else {
            DatePickerColors datePickerColors2 = datePickerColors;
        }
        boolean z2 = false;
        if (q2.E((i3 & 306783379) != 306783378, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1257365001, i3, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:812)");
            }
            CalendarDate j2 = calendarModel.j();
            boolean W = q2.W(intRange2);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                calendarMonth = calendarModel2.g(intRange.n(), 1);
                q2.N(calendarMonth);
            } else {
                calendarMonth = g2;
            }
            DateRangePickerKt$VerticalMonthsList$1 dateRangePickerKt$VerticalMonthsList$1 = r0;
            int i5 = i3;
            TextStyle e2 = TypographyKt.e(DatePickerModalTokens.f13010a.g(), q2, 6);
            Composer composer3 = q2;
            DateRangePickerKt$VerticalMonthsList$1 dateRangePickerKt$VerticalMonthsList$12 = new DateRangePickerKt$VerticalMonthsList$1(l2, l3, function2, lazyListState, intRange, calendarModel, calendarMonth, datePickerFormatter, datePickerColors, j2, selectableDates);
            TextKt.h(e2, ComposableLambdaKt.e(1090773432, true, dateRangePickerKt$VerticalMonthsList$1, composer3, 54), composer3, 48);
            int i6 = i5 & 14;
            boolean z3 = i6 == 4;
            if ((i5 & 57344) == 16384) {
                z2 = true;
            }
            boolean l6 = z3 | z2 | composer3.l(calendarModel2) | composer3.l(intRange2);
            Object g3 = composer3.g();
            if (l6 || g3 == Composer.f14567a.a()) {
                DateRangePickerKt$VerticalMonthsList$2$1 dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, function1, calendarModel, intRange, (Continuation) null);
                composer3.N(dateRangePickerKt$VerticalMonthsList$2$1);
                g3 = dateRangePickerKt$VerticalMonthsList$2$1;
            }
            composer2 = composer3;
            EffectsKt.g(lazyListState, (Function2) g3, composer2, i6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            LazyListState lazyListState3 = lazyListState2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new T1(lazyListState, l2, l3, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i2));
        }
    }

    public static final Unit m(LazyListState lazyListState, Long l2, Long l3, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2, Composer composer, int i3) {
        l(lazyListState, l2, l3, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final List t(LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.p(new CustomAccessibilityAction(str, new R1(lazyListState, coroutineScope)), new CustomAccessibilityAction(str2, new S1(lazyListState, coroutineScope)));
    }

    public static final boolean u(LazyListState lazyListState, CoroutineScope coroutineScope) {
        if (!lazyListState.d()) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DateRangePickerKt$customScrollActions$scrollUpAction$1$1(lazyListState, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final boolean v(LazyListState lazyListState, CoroutineScope coroutineScope) {
        if (!lazyListState.f()) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DateRangePickerKt$customScrollActions$scrollDownAction$1$1(lazyListState, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final void w(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j2) {
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float B1 = contentDrawScope2.B1(DatePickerKt.G0());
        float B12 = contentDrawScope2.B1(DatePickerKt.G0());
        float B13 = contentDrawScope2.B1(DatePickerModalTokens.f13010a.j());
        float f2 = (float) 2;
        float f3 = (B12 - B13) / f2;
        float f4 = (float) 7;
        float intBitsToFloat = (Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) - (f4 * B1)) / f4;
        long c2 = selectedRangeInfo.c();
        int k2 = IntOffset.k(c2);
        int l2 = IntOffset.l(c2);
        long b2 = selectedRangeInfo.b();
        int k3 = IntOffset.k(b2);
        int l3 = IntOffset.l(b2);
        float f5 = B1 + intBitsToFloat;
        float f6 = 0.0f;
        float f7 = intBitsToFloat / f2;
        float f8 = (((float) k2) * f5) + (selectedRangeInfo.a() ? B1 / f2 : 0.0f) + f7;
        float f9 = (((float) l2) * B12) + f3;
        float f10 = ((float) k3) * f5;
        if (selectedRangeInfo.d()) {
            B1 /= f2;
        }
        float f11 = f10 + B1 + f7;
        float f12 = (((float) l3) * B12) + f3;
        boolean z2 = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z2) {
            f8 = Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) - f8;
            f11 = Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) - f11;
        }
        float f13 = f11;
        int i2 = l2;
        DrawScope.A1(contentDrawScope, j2, Offset.e((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L)), Size.d((((long) Float.floatToRawIntBits(l2 == l3 ? f13 - f8 : z2 ? -f8 : Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) - f8)) << 32) | (((long) Float.floatToRawIntBits(B13)) & 4294967295L)), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
        int i3 = l3;
        if (i2 != i3) {
            for (int i4 = (i3 - i2) - 1; i4 > 0; i4--) {
                DrawScope.A1(contentDrawScope, j2, Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f9 + (((float) i4) * B12))) & 4294967295L)), Size.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(B13)) & 4294967295L)), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
            }
            if (contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr) {
                f6 = Float.intBitsToFloat((int) (contentDrawScope.c() >> 32));
            }
            long e2 = Offset.e((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
            if (z2) {
                f13 -= Float.intBitsToFloat((int) (contentDrawScope.c() >> 32));
            }
            DrawScope.A1(contentDrawScope, j2, e2, Size.d((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(B13)) & 4294967295L)), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
        }
    }

    public static final PaddingValues x() {
        return f9787a;
    }

    public static final void y(long j2, Long l2, Long l3, Function2 function2) {
        if ((l2 == null && l3 == null) || (l2 != null && l3 != null)) {
            function2.m(Long.valueOf(j2), (Object) null);
        } else if (l2 == null || j2 < l2.longValue()) {
            function2.m(Long.valueOf(j2), (Object) null);
        } else {
            function2.m(l2, Long.valueOf(j2));
        }
    }
}
