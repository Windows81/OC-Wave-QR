package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
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
public final class SecureTextFieldKt$SecureTextField$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8325A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8326B;
    public final /* synthetic */ TextStyle C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ InputTransformation I;
    public final /* synthetic */ int J;
    public final /* synthetic */ char K;
    public final /* synthetic */ KeyboardOptions L;
    public final /* synthetic */ KeyboardActionHandler M;
    public final /* synthetic */ Shape N;
    public final /* synthetic */ TextFieldColors O;
    public final /* synthetic */ MutableInteractionSource P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f8327z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecureTextFieldKt$SecureTextField$2(TextFieldState textFieldState, Modifier modifier, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, InputTransformation inputTransformation, int i2, char c2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i3, int i4, int i5) {
        super(2);
        this.f8327z = textFieldState;
        this.f8325A = modifier;
        this.f8326B = z2;
        this.C = textStyle;
        this.D = function2;
        this.E = function22;
        this.F = function23;
        this.G = function24;
        this.H = z3;
        this.I = inputTransformation;
        this.J = i2;
        this.K = c2;
        this.L = keyboardOptions;
        this.M = keyboardActionHandler;
        this.N = shape;
        this.O = textFieldColors;
        this.P = mutableInteractionSource;
        this.Q = i3;
        this.R = i4;
        this.S = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldState textFieldState = this.f8327z;
        TextFieldState textFieldState2 = textFieldState;
        SecureTextFieldKt.b(textFieldState2, this.f8325A, this.f8326B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, composer2, RecomposeScopeImplKt.a(this.Q | 1), RecomposeScopeImplKt.a(this.R), this.S);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
