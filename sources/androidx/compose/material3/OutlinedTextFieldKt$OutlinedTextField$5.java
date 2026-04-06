package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class OutlinedTextFieldKt$OutlinedTextField$5 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10578A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10579B;
    public final /* synthetic */ TextFieldColors C;
    public final /* synthetic */ TextFieldValue D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ TextStyle H;
    public final /* synthetic */ KeyboardOptions I;
    public final /* synthetic */ KeyboardActions J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ VisualTransformation N;
    public final /* synthetic */ MutableInteractionSource O;
    public final /* synthetic */ Function2 P;
    public final /* synthetic */ Function2 Q;
    public final /* synthetic */ Function2 R;
    public final /* synthetic */ Function2 S;
    public final /* synthetic */ Function2 T;
    public final /* synthetic */ Function2 U;
    public final /* synthetic */ Shape V;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10580z;

    public OutlinedTextFieldKt$OutlinedTextField$5(Modifier modifier, Function2 function2, boolean z2, TextFieldColors textFieldColors, TextFieldValue textFieldValue, Function1 function1, boolean z3, boolean z4, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Shape shape) {
        this.f10580z = modifier;
        this.f10578A = function2;
        this.f10579B = z2;
        this.C = textFieldColors;
        this.D = textFieldValue;
        this.E = function1;
        this.F = z3;
        this.G = z4;
        this.H = textStyle;
        this.I = keyboardOptions;
        this.J = keyboardActions;
        this.K = z5;
        this.L = i2;
        this.M = i3;
        this.N = visualTransformation;
        this.O = mutableInteractionSource;
        this.P = function22;
        this.Q = function23;
        this.R = function24;
        this.S = function25;
        this.T = function26;
        this.U = function27;
        this.V = shape;
    }

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
                ComposerKt.Y(-2094276683, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:572)");
            }
            Modifier modifier2 = this.f10580z;
            if (this.f10578A != null) {
                composer2.X(-1901539802);
                Modifier.Companion companion = Modifier.f15489d;
                Object g2 = composer.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = new R4();
                    composer2.N(g2);
                }
                modifier = PaddingKt.m(SemanticsModifierKt.c(companion, true, (Function1) g2), 0.0f, TextFieldImplKt.M(composer2, 0), 0.0f, 0.0f, 13, (Object) null);
                composer.M();
            } else {
                composer2.X(-1901156115);
                composer.M();
                modifier = Modifier.f15489d;
            }
            Modifier o0 = modifier2.o0(modifier);
            boolean z2 = this.f10579B;
            Strings.Companion companion2 = Strings.f12320b;
            Modifier z3 = TextFieldImplKt.z(o0, z2, Strings_androidKt.b(Strings.a(R.string.f15528d), composer2, 0));
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10533a;
            Modifier a2 = SizeKt.a(z3, outlinedTextFieldDefaults.o(), outlinedTextFieldDefaults.n());
            SolidColor solidColor = r1;
            SolidColor solidColor2 = new SolidColor(this.C.f(this.f10579B), (DefaultConstructorMarker) null);
            TextFieldValue textFieldValue = this.D;
            Function1 function1 = this.E;
            boolean z4 = this.F;
            boolean z5 = z4;
            boolean z6 = this.G;
            TextStyle textStyle = this.H;
            KeyboardOptions keyboardOptions = this.I;
            KeyboardActions keyboardActions = this.J;
            boolean z7 = this.K;
            boolean z8 = z7;
            final boolean z9 = z7;
            int i4 = this.L;
            final boolean z10 = z4;
            int i5 = this.M;
            VisualTransformation visualTransformation = this.N;
            final TextFieldValue textFieldValue2 = textFieldValue;
            TextFieldValue textFieldValue3 = textFieldValue;
            MutableInteractionSource mutableInteractionSource = this.O;
            final VisualTransformation visualTransformation2 = visualTransformation;
            Modifier modifier3 = a2;
            boolean z11 = this.f10579B;
            boolean z12 = z5;
            Function2 function2 = this.f10578A;
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
            final TextFieldColors textFieldColors = this.C;
            final Shape shape = this.V;
            BasicTextFieldKt.c(textFieldValue3, function1, modifier3, z12, z13, textStyle2, keyboardOptions2, keyboardActions2, z14, i6, i5, visualTransformation, (Function1) null, mutableInteractionSource, solidColor, ComposableLambdaKt.e(674541106, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() {
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
                            ComposerKt.Y(674541106, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:606)");
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10533a;
                        String i4 = textFieldValue2.i();
                        boolean z2 = z10;
                        boolean z3 = z2;
                        boolean z4 = z9;
                        VisualTransformation visualTransformation = visualTransformation2;
                        MutableInteractionSource mutableInteractionSource = mutableInteractionSource2;
                        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        boolean z5 = z15;
                        boolean z6 = z5;
                        Function2 function23 = function27;
                        final boolean z7 = z5;
                        Function2 function24 = function28;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                        Function2 function25 = function29;
                        final boolean z8 = z2;
                        Function2 function26 = function210;
                        Function2 function27 = function211;
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = outlinedTextFieldDefaults;
                        int i5 = i3;
                        Function2 function28 = function212;
                        Function2 function29 = function213;
                        TextFieldColors textFieldColors = textFieldColors;
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        final Shape shape = shape;
                        outlinedTextFieldDefaults2.e(i4, function2, z3, z4, visualTransformation, mutableInteractionSource2, z6, function23, function24, function25, function26, function27, function28, function29, textFieldColors, (PaddingValues) null, ComposableLambdaKt.e(1409265477, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                int i3 = i2;
                                if (composer.E((i3 & 3) != 2, i3 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(1409265477, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:623)");
                                    }
                                    OutlinedTextFieldDefaults.f10533a.c(z8, z7, mutableInteractionSource3, (Modifier) null, textFieldColors2, shape, 0.0f, 0.0f, composer, 100663296, 200);
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
                        }, composer2, 54), composer, (i5 << 3) & 112, 14155776, 32768);
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
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
