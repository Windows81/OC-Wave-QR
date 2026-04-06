package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtBaseTextFieldKt$AbtBaseTextField$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f38243A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Density f38244B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ TextFieldColors E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ TextStyle K;
    public final /* synthetic */ KeyboardOptions L;
    public final /* synthetic */ KeyboardActions M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ VisualTransformation Q;
    public final /* synthetic */ MutableInteractionSource R;
    public final /* synthetic */ Function2 S;
    public final /* synthetic */ Function2 T;
    public final /* synthetic */ Function2 U;
    public final /* synthetic */ Function2 V;
    public final /* synthetic */ Function2 W;
    public final /* synthetic */ Function2 X;
    public final /* synthetic */ PaddingValues Y;
    public final /* synthetic */ Shape Z;
    public final /* synthetic */ Function0 a0;
    public final /* synthetic */ float b0;
    public final /* synthetic */ float c0;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f38245z;

    public AbtBaseTextFieldKt$AbtBaseTextField$1(Modifier modifier, Function2 function2, Density density, float f2, float f3, TextFieldColors textFieldColors, boolean z2, String str, Function1 function1, boolean z3, boolean z4, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, PaddingValues paddingValues, Shape shape, Function0 function0, float f4, float f5) {
        this.f38245z = modifier;
        this.f38243A = function2;
        this.f38244B = density;
        this.C = f2;
        this.D = f3;
        this.E = textFieldColors;
        this.F = z2;
        this.G = str;
        this.H = function1;
        this.I = z3;
        this.J = z4;
        this.K = textStyle;
        this.L = keyboardOptions;
        this.M = keyboardActions;
        this.N = z5;
        this.O = i2;
        this.P = i3;
        this.Q = visualTransformation;
        this.R = mutableInteractionSource;
        this.S = function22;
        this.T = function23;
        this.U = function24;
        this.V = function25;
        this.W = function26;
        this.X = function27;
        this.Y = paddingValues;
        this.Z = shape;
        this.a0 = function0;
        this.b0 = f4;
        this.c0 = f5;
    }

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.i(semanticsPropertyReceiver, "$this$semantics");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Modifier modifier;
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-955686613, i3, -1, "com.hansecom.abt.ui.components.formFields.AbtBaseTextField.<anonymous> (AbtBaseTextField.kt:88)");
            }
            Modifier modifier2 = this.f38245z;
            composer2.X(-385483341);
            if (this.f38243A != null) {
                Modifier.Companion companion = Modifier.f15489d;
                composer2.X(-385474501);
                Object g2 = composer.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = new C0636c();
                    composer2.N(g2);
                }
                composer.M();
                modifier = PaddingKt.m(SemanticsModifierKt.c(companion, true, (Function1) g2), 0.0f, this.f38244B.v(AbtBaseTextFieldKt.f38241a), 0.0f, 0.0f, 13, (Object) null);
            } else {
                modifier = Modifier.f15489d;
            }
            composer.M();
            Modifier a2 = SizeKt.a(IntrinsicKt.b(modifier2.o0(modifier), IntrinsicSize.Min), this.C, this.D);
            SolidColor solidColor = r1;
            SolidColor solidColor2 = new SolidColor(AbtBaseTextFieldKt.i(this.E, this.F), (DefaultConstructorMarker) null);
            String str = this.G;
            String str2 = str;
            final String str3 = str;
            Function1 function1 = this.H;
            boolean z2 = this.I;
            boolean z3 = z2;
            final boolean z4 = z2;
            boolean z5 = this.J;
            TextStyle textStyle = this.K;
            KeyboardOptions keyboardOptions = this.L;
            KeyboardActions keyboardActions = this.M;
            boolean z6 = this.N;
            boolean z7 = z6;
            final boolean z8 = z6;
            int i4 = this.O;
            int i5 = this.P;
            VisualTransformation visualTransformation = this.Q;
            final VisualTransformation visualTransformation2 = visualTransformation;
            String str4 = str2;
            MutableInteractionSource mutableInteractionSource = this.R;
            final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            final boolean z9 = this.F;
            final Function2 function2 = this.f38243A;
            final Function2 function22 = this.S;
            final Function2 function23 = this.T;
            final Function2 function24 = this.U;
            final Function2 function25 = this.V;
            final Function2 function26 = this.W;
            final Function2 function27 = this.X;
            final TextFieldColors textFieldColors = this.E;
            final PaddingValues paddingValues = this.Y;
            final Shape shape = this.Z;
            final Function0 function0 = this.a0;
            final float f2 = this.b0;
            final float f3 = this.c0;
            String str5 = str4;
            Modifier modifier3 = a2;
            Function1 function12 = function1;
            BasicTextFieldKt.e(str5, function12, modifier3, z3, z5, textStyle, keyboardOptions, keyboardActions, z7, i4, i5, visualTransformation, (Function1) null, mutableInteractionSource, solidColor, ComposableLambdaKt.e(2016101198, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() {
                public final void b(Function2 function2, Composer composer, int i2) {
                    int i3;
                    Function2 function22 = function2;
                    Composer composer2 = composer;
                    Intrinsics.i(function22, "innerTextField");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer2.l(function22) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) != 18 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(2016101198, i3, -1, "com.hansecom.abt.ui.components.formFields.AbtBaseTextField.<anonymous>.<anonymous> (AbtBaseTextField.kt:121)");
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10533a;
                        String str = str3;
                        boolean z2 = z4;
                        boolean z3 = z2;
                        boolean z4 = z8;
                        VisualTransformation visualTransformation = visualTransformation2;
                        MutableInteractionSource mutableInteractionSource = mutableInteractionSource2;
                        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        boolean z5 = z9;
                        boolean z6 = z5;
                        Function2 function23 = function2;
                        Function2 function24 = function22;
                        final boolean z7 = z5;
                        Function2 function25 = function23;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                        Function2 function26 = function24;
                        final boolean z8 = z2;
                        Function2 function27 = function25;
                        int i4 = i3;
                        Function2 function28 = function26;
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = outlinedTextFieldDefaults;
                        Composer composer3 = composer2;
                        Function2 function29 = function27;
                        TextFieldColors textFieldColors = textFieldColors;
                        boolean z9 = z3;
                        Shape shape = shape;
                        boolean z10 = z4;
                        final Shape shape2 = shape;
                        final Function0 function0 = function0;
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        final float f2 = f2;
                        final float f3 = f3;
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults3 = outlinedTextFieldDefaults2;
                        String str2 = str;
                        outlinedTextFieldDefaults3.e(str2, function2, z9, z10, visualTransformation, mutableInteractionSource2, z6, function23, function24, function25, function26, function27, function28, function29, textFieldColors, paddingValues, ComposableLambdaKt.e(-1099410533, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                if ((i2 & 3) != 2 || !composer.t()) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(-1099410533, i2, -1, "com.hansecom.abt.ui.components.formFields.AbtBaseTextField.<anonymous>.<anonymous>.<anonymous> (AbtBaseTextField.kt:139)");
                                    }
                                    Shape shape = shape2;
                                    boolean z2 = z8;
                                    Function0 function0 = function0;
                                    final boolean z3 = z7;
                                    final MutableInteractionSource mutableInteractionSource = mutableInteractionSource3;
                                    final TextFieldColors textFieldColors = textFieldColors2;
                                    final float f2 = f2;
                                    final float f3 = f3;
                                    final boolean z4 = z2;
                                    final Shape shape2 = shape;
                                    AbtBaseTextFieldKt.e(shape, z2, function0, ComposableLambdaKt.e(-429237140, true, new Function2<Composer, Integer, Unit>() {
                                        public final void b(Composer composer, int i2) {
                                            int i3 = i2;
                                            if ((i3 & 3) != 2 || !composer.t()) {
                                                if (ComposerKt.P()) {
                                                    ComposerKt.Y(-429237140, i3, -1, "com.hansecom.abt.ui.components.formFields.AbtBaseTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AbtBaseTextField.kt:144)");
                                                }
                                                OutlinedTextFieldDefaults.f10533a.c(z4, z3, mutableInteractionSource, SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null), textFieldColors, shape2, f2, f3, composer, 100666368, 0);
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
                                    }, composer, 54), composer, 3072, 0);
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
                        }, composer3, 54), composer, (i4 << 3) & 112, 14155776, 0);
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
