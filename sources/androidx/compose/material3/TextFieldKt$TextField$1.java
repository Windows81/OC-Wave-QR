package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
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
final class TextFieldKt$TextField$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11400A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f11401B;
    public final /* synthetic */ TextFieldState C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ TextFieldLineLimits E;
    public final /* synthetic */ OutputTransformation F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ TextFieldLabelPosition H;
    public final /* synthetic */ Function3 I;
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
    public final /* synthetic */ Modifier f11402z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(484558238, i3, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:299)");
            }
            Modifier modifier = this.f11402z;
            boolean z2 = this.f11400A;
            Strings.Companion companion = Strings.f12320b;
            Modifier z3 = TextFieldImplKt.z(modifier, z2, Strings_androidKt.b(Strings.a(R.string.f15528d), composer2, 0));
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11367a;
            TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
            Modifier a2 = SizeKt.a(z3, textFieldDefaults.q(), textFieldDefaults.p());
            SolidColor solidColor = r2;
            SolidColor solidColor2 = new SolidColor(this.f11401B.f(this.f11400A), (DefaultConstructorMarker) null);
            TextFieldState textFieldState = this.C;
            boolean z4 = this.D;
            boolean z5 = z4;
            TextFieldLineLimits textFieldLineLimits = this.E;
            OutputTransformation outputTransformation = this.F;
            MutableInteractionSource mutableInteractionSource = this.G;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            TextFieldLabelPosition textFieldLabelPosition = this.H;
            Function3 function3 = this.I;
            Function2 function2 = this.J;
            Function2 function22 = this.K;
            Function2 function23 = this.L;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
            Function2 function24 = this.M;
            final boolean z6 = z4;
            Function2 function25 = this.N;
            Function2 function26 = this.O;
            TextFieldDefaults textFieldDefaults3 = textFieldDefaults2;
            boolean z7 = this.f11400A;
            boolean z8 = z5;
            TextFieldColors textFieldColors = this.f11401B;
            final boolean z9 = z7;
            final TextFieldColors textFieldColors2 = textFieldColors;
            final Shape shape = this.X;
            BasicTextFieldKt.a(this.C, a2, this.D, this.Q, this.R, this.S, this.T, this.U, this.E, this.V, this.G, solidColor, this.F, textFieldDefaults3.m(textFieldState, z8, textFieldLineLimits, outputTransformation, mutableInteractionSource2, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z7, textFieldColors, this.P, ComposableLambdaKt.e(-2009308227, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3 = i2;
                    if (composer.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-2009308227, i3, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:339)");
                        }
                        TextFieldDefaults.f11367a.c(z6, z9, mutableInteractionSource3, (Modifier) null, textFieldColors2, shape, 0.0f, 0.0f, composer, 100663296, 200);
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
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
