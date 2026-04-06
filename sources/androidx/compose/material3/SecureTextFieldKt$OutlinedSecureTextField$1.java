package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
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
final class SecureTextFieldKt$OutlinedSecureTextField$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f10893A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldLabelPosition f10894B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ TextFieldColors D;
    public final /* synthetic */ TextFieldState E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ Function2 M;
    public final /* synthetic */ PaddingValues N;
    public final /* synthetic */ InputTransformation O;
    public final /* synthetic */ TextStyle P;
    public final /* synthetic */ KeyboardOptions Q;
    public final /* synthetic */ KeyboardActionHandler R;
    public final /* synthetic */ Function2 S;
    public final /* synthetic */ int T;
    public final /* synthetic */ char U;
    public final /* synthetic */ Shape V;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10895z;

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
                ComposerKt.Y(1147500080, i3, -1, "androidx.compose.material3.OutlinedSecureTextField.<anonymous> (SecureTextField.kt:327)");
            }
            Modifier modifier2 = this.f10895z;
            if (this.f10893A == null || (this.f10894B instanceof TextFieldLabelPosition.Above)) {
                composer2.X(1530795410);
                composer.M();
                modifier = Modifier.f15489d;
            } else {
                composer2.X(1530411723);
                Modifier.Companion companion = Modifier.f15489d;
                Object g2 = composer.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = new I5();
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
            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.f6073b;
            MutableInteractionSource mutableInteractionSource = this.G;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            TextFieldLabelPosition textFieldLabelPosition = this.f10894B;
            Function3 function3 = this.f10893A;
            Function2 function2 = this.H;
            Function2 function22 = this.I;
            Function2 function23 = this.J;
            Function2 function24 = this.K;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
            Function2 function25 = this.L;
            final boolean z6 = z4;
            Function2 function26 = this.M;
            boolean z7 = this.C;
            OutlinedTextFieldDefaults outlinedTextFieldDefaults3 = outlinedTextFieldDefaults2;
            final boolean z8 = z7;
            TextFieldColors textFieldColors = this.D;
            final TextFieldColors textFieldColors2 = textFieldColors;
            final Shape shape = this.V;
            TextFieldDecorator k2 = outlinedTextFieldDefaults3.k(textFieldState, z5, singleLine, (OutputTransformation) null, mutableInteractionSource2, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z7, textFieldColors, this.N, ComposableLambdaKt.e(-1406782897, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3 = i2;
                    if (composer.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1406782897, i3, -1, "androidx.compose.material3.OutlinedSecureTextField.<anonymous>.<anonymous> (SecureTextField.kt:376)");
                        }
                        OutlinedTextFieldDefaults.f10533a.c(z6, z8, mutableInteractionSource3, (Modifier) null, textFieldColors2, shape, 0.0f, 0.0f, composer, 100663296, 200);
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
            }, composer2, 54), composer, 3456, 14155776, 0);
            BasicSecureTextFieldKt.c(this.E, a2, this.F, false, this.O, this.P, this.Q, this.R, this.S, this.G, solidColor, k2, this.T, this.U, composer, 0, 0, 8);
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
