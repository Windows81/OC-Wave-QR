package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class OutlinedTextFieldKt$OutlinedTextField$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f10563A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldLabelPosition f10564B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ TextFieldColors D;
    public final /* synthetic */ TextFieldState E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ TextFieldLineLimits G;
    public final /* synthetic */ OutputTransformation H;
    public final /* synthetic */ MutableInteractionSource I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ Function2 M;
    public final /* synthetic */ Function2 N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ PaddingValues P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ InputTransformation R;
    public final /* synthetic */ TextStyle S;
    public final /* synthetic */ KeyboardOptions T;
    public final /* synthetic */ KeyboardActionHandler U;
    public final /* synthetic */ Function2 V;
    public final /* synthetic */ ScrollState W;
    public final /* synthetic */ Shape X;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10565z;

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Modifier modifier;
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-416142558, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:240)");
            }
            Modifier modifier2 = this.f10565z;
            if (this.f10563A == null || (this.f10564B instanceof TextFieldLabelPosition.Above)) {
                composer2.X(-2026714080);
                composer.M();
                modifier = Modifier.f15489d;
            } else {
                composer2.X(-2027097767);
                Modifier.Companion companion = Modifier.f15489d;
                Object g2 = composer.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = new P4();
                    composer2.N(g2);
                }
                modifier = PaddingKt.m(SemanticsModifierKt.c(companion, true, (Function1) g2), 0.0f, TextFieldImplKt.M(composer2, 0), 0.0f, 0.0f, 13, (Object) null);
                composer.M();
            }
            Modifier o0 = modifier2.o0(modifier);
            boolean z2 = this.C;
            Strings.Companion companion2 = Strings.f12320b;
            Modifier z3 = TextFieldImplKt.z(o0, z2, Strings_androidKt.b(Strings.a(R.string.f15528d), composer2, 0));
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10533a;
            OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = outlinedTextFieldDefaults;
            Modifier a2 = SizeKt.a(z3, outlinedTextFieldDefaults.o(), outlinedTextFieldDefaults.n());
            SolidColor solidColor = r2;
            SolidColor solidColor2 = new SolidColor(this.D.f(this.C), (DefaultConstructorMarker) null);
            TextFieldState textFieldState = this.E;
            boolean z4 = this.F;
            boolean z5 = z4;
            TextFieldLineLimits textFieldLineLimits = this.G;
            OutputTransformation outputTransformation = this.H;
            MutableInteractionSource mutableInteractionSource = this.I;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            TextFieldLabelPosition textFieldLabelPosition = this.f10564B;
            Function3 function3 = this.f10563A;
            Function2 function2 = this.J;
            Function2 function22 = this.K;
            Function2 function23 = this.L;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
            Function2 function24 = this.M;
            final boolean z6 = z4;
            Function2 function25 = this.N;
            Function2 function26 = this.O;
            OutlinedTextFieldDefaults outlinedTextFieldDefaults3 = outlinedTextFieldDefaults2;
            boolean z7 = this.C;
            boolean z8 = z5;
            TextFieldColors textFieldColors = this.D;
            final boolean z9 = z7;
            final TextFieldColors textFieldColors2 = textFieldColors;
            final Shape shape = this.X;
            BasicTextFieldKt.a(this.E, a2, this.F, this.Q, this.R, this.S, this.T, this.U, this.G, this.V, this.I, solidColor, this.H, outlinedTextFieldDefaults3.k(textFieldState, z8, textFieldLineLimits, outputTransformation, mutableInteractionSource2, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z7, textFieldColors, this.P, ComposableLambdaKt.e(-98391231, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3 = i2;
                    if (composer.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-98391231, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:291)");
                        }
                        OutlinedTextFieldDefaults.f10533a.c(z6, z9, mutableInteractionSource3, (Modifier) null, textFieldColors2, shape, 0.0f, 0.0f, composer, 100663296, 200);
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
            }, composer2, 54), composer, 0, 14155776, 0), this.W, composer, 0, 0, 0);
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
