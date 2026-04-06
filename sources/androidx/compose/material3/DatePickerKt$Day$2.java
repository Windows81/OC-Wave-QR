package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DatePickerKt$Day$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9730A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f9731B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f9732z;

    public DatePickerKt$Day$2(String str, DatePickerColors datePickerColors, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f9732z = str;
        this.f9730A = datePickerColors;
        this.f9731B = z2;
        this.C = z3;
        this.D = z4;
        this.E = z5;
    }

    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1126347158, i3, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:2032)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f13010a;
            Modifier p2 = SizeKt.p(companion, datePickerModalTokens.f(), datePickerModalTokens.d());
            Alignment e2 = Alignment.f15444a.e();
            String str = this.f9732z;
            DatePickerColors datePickerColors = this.f9730A;
            boolean z2 = this.f9731B;
            boolean z3 = this.C;
            boolean z4 = this.D;
            boolean z5 = this.E;
            MeasurePolicy g2 = BoxKt.g(e2, false);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, p2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e3, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Object g3 = composer.g();
            if (g3 == Composer.f14567a.a()) {
                g3 = new C0236s1();
                composer2.N(g3);
            }
            TextKt.j(str, SemanticsModifierKt.a(companion, (Function1) g3), ((Color) datePickerColors.b(z2, z3, z4, z5, composer, 0).getValue()).v(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.a()), 0, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 261112);
            composer.T();
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
}
