package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.IntRange;

@Metadata
public final class DatePickerKt$SwitchableDateEntryContent$3 implements Function4<AnimatedContentScope, DisplayMode, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f9754A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f9755B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ CalendarModel D;
    public final /* synthetic */ IntRange E;
    public final /* synthetic */ DatePickerFormatter F;
    public final /* synthetic */ SelectableDates G;
    public final /* synthetic */ DatePickerColors H;
    public final /* synthetic */ FocusRequester I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f9756z;

    public DatePickerKt$SwitchableDateEntryContent$3(Long l2, long j2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester) {
        this.f9756z = l2;
        this.f9754A = j2;
        this.f9755B = function1;
        this.C = function12;
        this.D = calendarModel;
        this.E = intRange;
        this.F = datePickerFormatter;
        this.G = selectableDates;
        this.H = datePickerColors;
        this.I = focusRequester;
    }

    public final void b(AnimatedContentScope animatedContentScope, int i2, Composer composer, int i3) {
        int i4 = i2;
        Composer composer2 = composer;
        if (ComposerKt.P()) {
            ComposerKt.Y(1838500091, i3, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1498)");
        }
        DisplayMode.Companion companion = DisplayMode.f9856b;
        if (DisplayMode.f(i4, companion.b())) {
            composer2.X(1567031954);
            DatePickerKt.D(this.f9756z, this.f9754A, this.f9755B, this.C, this.D, this.E, this.F, this.G, this.H, composer, 0);
            composer.M();
        } else if (DisplayMode.f(i4, companion.a())) {
            composer2.X(1567050592);
            DateInputKt.g(this.f9756z, this.f9755B, this.D, this.E, this.F, this.G, this.H, this.I, composer, 0);
            composer.M();
        } else {
            composer2.X(1334373351);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((AnimatedContentScope) obj, ((DisplayMode) obj2).i(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
