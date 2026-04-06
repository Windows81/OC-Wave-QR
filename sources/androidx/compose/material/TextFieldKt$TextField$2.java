package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldKt$TextField$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8817A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8818B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ TextStyle D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ InputTransformation J;
    public final /* synthetic */ OutputTransformation K;
    public final /* synthetic */ KeyboardOptions L;
    public final /* synthetic */ KeyboardActionHandler M;
    public final /* synthetic */ TextFieldLineLimits N;
    public final /* synthetic */ ScrollState O;
    public final /* synthetic */ Shape P;
    public final /* synthetic */ TextFieldColors Q;
    public final /* synthetic */ MutableInteractionSource R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;
    public final /* synthetic */ int U;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f8819z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$2(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z4, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
        super(2);
        this.f8819z = textFieldState;
        this.f8817A = modifier;
        this.f8818B = z2;
        this.C = z3;
        this.D = textStyle;
        this.E = function2;
        this.F = function22;
        this.G = function23;
        this.H = function24;
        this.I = z4;
        this.J = inputTransformation;
        this.K = outputTransformation;
        this.L = keyboardOptions;
        this.M = keyboardActionHandler;
        this.N = textFieldLineLimits;
        this.O = scrollState;
        this.P = shape;
        this.Q = textFieldColors;
        this.R = mutableInteractionSource;
        this.S = i2;
        this.T = i3;
        this.U = i4;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldState textFieldState = this.f8819z;
        TextFieldState textFieldState2 = textFieldState;
        TextFieldKt.a(textFieldState2, this.f8817A, this.f8818B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, composer2, RecomposeScopeImplKt.a(this.S | 1), RecomposeScopeImplKt.a(this.T), this.U);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
