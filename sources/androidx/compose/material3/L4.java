package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class L4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f10203A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f10204B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ VisualTransformation N;
    public final /* synthetic */ KeyboardOptions O;
    public final /* synthetic */ KeyboardActions P;
    public final /* synthetic */ boolean Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ MutableInteractionSource T;
    public final /* synthetic */ Shape U;
    public final /* synthetic */ TextFieldColors V;
    public final /* synthetic */ int W;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f10205z;

    public /* synthetic */ L4(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7) {
        this.f10205z = str;
        this.f10203A = function1;
        this.f10204B = modifier;
        this.C = z2;
        this.D = z3;
        this.E = textStyle;
        this.F = function2;
        this.G = function22;
        this.H = function23;
        this.I = function24;
        this.J = function25;
        this.K = function26;
        this.L = function27;
        this.M = z4;
        this.N = visualTransformation;
        this.O = keyboardOptions;
        this.P = keyboardActions;
        this.Q = z5;
        this.R = i2;
        this.S = i3;
        this.T = mutableInteractionSource;
        this.U = shape;
        this.V = textFieldColors;
        this.W = i4;
        this.X = i5;
        this.Y = i6;
        this.Z = i7;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return OutlinedTextFieldKt.h(this.f10205z, this.f10203A, this.f10204B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, (Composer) obj, intValue);
    }
}
