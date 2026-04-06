package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class TimePickerKt$ClockFace$1 implements Function3<IntList, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnalogTimePickerState f11489A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11490B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f11491z;

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.a0(semanticsPropertyReceiver);
        return Unit.f40552a;
    }

    public final void c(final IntList intList, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(747010833, i2, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1609)");
        }
        Modifier t2 = SizeKt.t(Modifier.f15489d, TimePickerTokens.f14264a.a());
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new L7();
            composer.N(g2);
        }
        Modifier d2 = SemanticsModifierKt.d(t2, false, (Function1) g2, 1, (Object) null);
        float p0 = TimePickerKt.f11468a;
        final TimePickerColors timePickerColors = this.f11491z;
        final AnalogTimePickerState analogTimePickerState = this.f11489A;
        final boolean z2 = this.f11490B;
        TimePickerKt.p(d2, p0, ComposableLambdaKt.e(-99063847, true, new Function2<Composer, Integer, Unit>() {
            public final void b(Composer composer, int i2) {
                if (composer.E((i2 & 3) != 2, i2 & 1)) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(-99063847, i2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1613)");
                    }
                    ProvidedValue d2 = ContentColorKt.a().d(Color.h(timePickerColors.a(false)));
                    final IntList intList = intList;
                    final AnalogTimePickerState analogTimePickerState = analogTimePickerState;
                    final boolean z2 = z2;
                    CompositionLocalKt.c(d2, ComposableLambdaKt.e(-596940007, true, new Function2<Composer, Integer, Unit>() {
                        /* access modifiers changed from: private */
                        public static final Unit e(int i2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.I0(semanticsPropertyReceiver, ((float) i2) + 1.0f);
                            return Unit.f40552a;
                        }

                        public final void c(Composer composer, int i2) {
                            if (composer.E((i2 & 3) != 2, i2 & 1)) {
                                if (ComposerKt.P()) {
                                    ComposerKt.Y(-596940007, i2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1616)");
                                }
                                composer.X(1866272144);
                                IntList intList = intList;
                                int i3 = intList.f1784b;
                                AnalogTimePickerState analogTimePickerState = analogTimePickerState;
                                boolean z2 = z2;
                                for (int i4 = 0; i4 < i3; i4++) {
                                    int e2 = (!analogTimePickerState.f() || TimePickerSelectionMode.f(analogTimePickerState.e(), TimePickerSelectionMode.f11521b.b())) ? intList.e(i4) : intList.e(i4) % 12;
                                    Modifier.Companion companion = Modifier.f15489d;
                                    boolean i5 = composer.i(i4);
                                    Object g2 = composer.g();
                                    if (i5 || g2 == Composer.f14567a.a()) {
                                        g2 = new M7(i4);
                                        composer.N(g2);
                                    }
                                    TimePickerKt.r(SemanticsModifierKt.d(companion, false, (Function1) g2, 1, (Object) null), analogTimePickerState, e2, z2, composer, 0);
                                }
                                composer.M();
                                if (!TimePickerSelectionMode.f(analogTimePickerState.e(), TimePickerSelectionMode.f11521b.a()) || !analogTimePickerState.f()) {
                                    composer.X(2021505641);
                                    composer.M();
                                } else {
                                    composer.X(2020585964);
                                    Modifier a2 = BackgroundKt.a(SizeKt.t(LayoutIdKt.b(Modifier.f15489d, LayoutId.InnerCircle), TimePickerTokens.f14264a.a()), Color.f15975b.e(), RoundedCornerShapeKt.f());
                                    float n0 = TimePickerKt.f11469b;
                                    final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                                    final boolean z3 = z2;
                                    TimePickerKt.p(a2, n0, ComposableLambdaKt.e(-1385767514, true, new Function2<Composer, Integer, Unit>() {
                                        public static final Unit e(int i2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.I0(semanticsPropertyReceiver, ((float) 12) + ((float) i2));
                                            return Unit.f40552a;
                                        }

                                        public final void c(Composer composer, int i2) {
                                            if (composer.E((i2 & 3) != 2, i2 & 1)) {
                                                if (ComposerKt.P()) {
                                                    ComposerKt.Y(-1385767514, i2, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1639)");
                                                }
                                                int i3 = TimePickerKt.f11479l.f1784b;
                                                AnalogTimePickerState analogTimePickerState = analogTimePickerState2;
                                                boolean z2 = z3;
                                                for (int i4 = 0; i4 < i3; i4++) {
                                                    int e2 = TimePickerKt.f11479l.e(i4);
                                                    Modifier.Companion companion = Modifier.f15489d;
                                                    boolean i5 = composer.i(i4);
                                                    Object g2 = composer.g();
                                                    if (i5 || g2 == Composer.f14567a.a()) {
                                                        g2 = new N7(i4);
                                                        composer.N(g2);
                                                    }
                                                    TimePickerKt.r(SemanticsModifierKt.d(companion, false, (Function1) g2, 1, (Object) null), analogTimePickerState, e2, z2, composer, 0);
                                                }
                                                if (ComposerKt.P()) {
                                                    ComposerKt.X();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer.B();
                                        }

                                        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                                            c((Composer) obj, ((Number) obj2).intValue());
                                            return Unit.f40552a;
                                        }
                                    }, composer, 54), composer, 432, 0);
                                    composer.M();
                                }
                                if (ComposerKt.P()) {
                                    ComposerKt.X();
                                    return;
                                }
                                return;
                            }
                            composer.B();
                        }

                        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                            c((Composer) obj, ((Number) obj2).intValue());
                            return Unit.f40552a;
                        }
                    }, composer, 54), composer, ProvidedValue.f14769i | 48);
                    if (ComposerKt.P()) {
                        ComposerKt.X();
                        return;
                    }
                    return;
                }
                composer.B();
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                b((Composer) obj, ((Number) obj2).intValue());
                return Unit.f40552a;
            }
        }, composer, 54), composer, 432, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((IntList) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
