package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
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
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class TextFieldKt$TextField$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f11406A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f11407B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ TextStyle G;
    public final /* synthetic */ KeyboardOptions H;
    public final /* synthetic */ KeyboardActions I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ VisualTransformation M;
    public final /* synthetic */ MutableInteractionSource N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ Function2 P;
    public final /* synthetic */ Function2 Q;
    public final /* synthetic */ Function2 R;
    public final /* synthetic */ Function2 S;
    public final /* synthetic */ Function2 T;
    public final /* synthetic */ Function2 U;
    public final /* synthetic */ Shape V;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f11408z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1459735400, i3, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:454)");
            }
            Modifier modifier = this.f11408z;
            boolean z2 = this.f11406A;
            Strings.Companion companion = Strings.f12320b;
            Modifier z3 = TextFieldImplKt.z(modifier, z2, Strings_androidKt.b(Strings.a(R.string.f15528d), composer2, 0));
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11367a;
            Modifier a2 = SizeKt.a(z3, textFieldDefaults.q(), textFieldDefaults.p());
            SolidColor solidColor = r1;
            SolidColor solidColor2 = new SolidColor(this.f11407B.f(this.f11406A), (DefaultConstructorMarker) null);
            String str = this.C;
            Function1 function1 = this.D;
            boolean z4 = this.E;
            boolean z5 = z4;
            boolean z6 = this.F;
            TextStyle textStyle = this.G;
            KeyboardOptions keyboardOptions = this.H;
            KeyboardActions keyboardActions = this.I;
            boolean z7 = this.J;
            boolean z8 = z7;
            final boolean z9 = z7;
            int i4 = this.K;
            final boolean z10 = z4;
            int i5 = this.L;
            VisualTransformation visualTransformation = this.M;
            final String str2 = str;
            String str3 = str;
            MutableInteractionSource mutableInteractionSource = this.N;
            final VisualTransformation visualTransformation2 = visualTransformation;
            Modifier modifier2 = a2;
            boolean z11 = this.f11406A;
            boolean z12 = z5;
            Function2 function2 = this.O;
            boolean z13 = z6;
            Function2 function22 = this.P;
            TextStyle textStyle2 = textStyle;
            Function2 function23 = this.Q;
            KeyboardOptions keyboardOptions2 = keyboardOptions;
            Function2 function24 = this.R;
            KeyboardActions keyboardActions2 = keyboardActions;
            Function2 function25 = this.S;
            boolean z14 = z8;
            Function2 function26 = this.T;
            int i6 = i4;
            final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            final boolean z15 = z11;
            final Function2 function27 = function2;
            final Function2 function28 = function22;
            final Function2 function29 = function23;
            final Function2 function210 = function24;
            final Function2 function211 = function25;
            final Function2 function212 = function26;
            final Function2 function213 = this.U;
            final Shape shape = this.V;
            final TextFieldColors textFieldColors = this.f11407B;
            BasicTextFieldKt.e(str3, function1, modifier2, z12, z13, textStyle2, keyboardOptions2, keyboardActions2, z14, i6, i5, visualTransformation, (Function1) null, mutableInteractionSource, solidColor, ComposableLambdaKt.e(1451491557, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() {
                public final void b(Function2 function2, Composer composer, int i2) {
                    int i3;
                    Composer composer2 = composer;
                    Function2 function22 = function2;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer2.l(function22) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if (composer2.E((i3 & 19) != 18, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1451491557, i3, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:478)");
                        }
                        TextFieldDefaults.f11367a.e(str2, function2, z10, z9, visualTransformation2, mutableInteractionSource2, z15, function27, function28, function29, function210, function211, function212, function213, shape, textFieldColors, (PaddingValues) null, (Function2) null, composer, (i3 << 3) & 112, 100663296, 196608);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    b((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54), composer, 0, 196608, 4096);
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
