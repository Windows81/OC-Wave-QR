package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class SecureTextFieldKt$SecureTextField$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10899A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10900B;
    public final /* synthetic */ TextFieldState C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ TextFieldLabelPosition F;
    public final /* synthetic */ Function3 G;
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
    public final /* synthetic */ Modifier f10901z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2072926674, i3, -1, "androidx.compose.material3.SecureTextField.<anonymous> (SecureTextField.kt:167)");
            }
            Modifier modifier = this.f10901z;
            boolean z2 = this.f10899A;
            Strings.Companion companion = Strings.f12320b;
            Modifier z3 = TextFieldImplKt.z(modifier, z2, Strings_androidKt.b(Strings.a(R.string.f15528d), composer2, 0));
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11367a;
            TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
            Modifier a2 = SizeKt.a(z3, textFieldDefaults.q(), textFieldDefaults.p());
            SolidColor solidColor = r2;
            SolidColor solidColor2 = new SolidColor(this.f10900B.f(this.f10899A), (DefaultConstructorMarker) null);
            TextFieldState textFieldState = this.C;
            boolean z4 = this.D;
            boolean z5 = z4;
            TextFieldLineLimits.SingleLine singleLine = TextFieldLineLimits.SingleLine.f6073b;
            MutableInteractionSource mutableInteractionSource = this.E;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            TextFieldLabelPosition textFieldLabelPosition = this.F;
            Function3 function3 = this.G;
            Function2 function2 = this.H;
            Function2 function22 = this.I;
            Function2 function23 = this.J;
            Function2 function24 = this.K;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
            Function2 function25 = this.L;
            final boolean z6 = z4;
            Function2 function26 = this.M;
            boolean z7 = this.f10899A;
            TextFieldDefaults textFieldDefaults3 = textFieldDefaults2;
            final boolean z8 = z7;
            TextFieldColors textFieldColors = this.f10900B;
            final TextFieldColors textFieldColors2 = textFieldColors;
            final Shape shape = this.V;
            TextFieldDecorator m2 = textFieldDefaults3.m(textFieldState, z5, singleLine, (OutputTransformation) null, mutableInteractionSource2, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z7, textFieldColors, this.N, ComposableLambdaKt.e(-43781811, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3 = i2;
                    if (composer.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-43781811, i3, -1, "androidx.compose.material3.SecureTextField.<anonymous>.<anonymous> (SecureTextField.kt:205)");
                        }
                        TextFieldDefaults.f11367a.c(z6, z8, mutableInteractionSource3, (Modifier) null, textFieldColors2, shape, 0.0f, 0.0f, composer, 100663296, 200);
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
            BasicSecureTextFieldKt.c(this.C, a2, this.D, false, this.O, this.P, this.Q, this.R, this.S, this.E, solidColor, m2, this.T, this.U, composer, 0, 0, 8);
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
}
