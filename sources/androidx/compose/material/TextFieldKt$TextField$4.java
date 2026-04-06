package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldKt$TextField$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8823A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f8824B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ VisualTransformation K;
    public final /* synthetic */ KeyboardOptions L;
    public final /* synthetic */ KeyboardActions M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ MutableInteractionSource Q;
    public final /* synthetic */ Shape R;
    public final /* synthetic */ TextFieldColors S;
    public final /* synthetic */ int T;
    public final /* synthetic */ int U;
    public final /* synthetic */ int V;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8825z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$4(String str, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6) {
        super(2);
        this.f8825z = str;
        this.f8823A = function1;
        this.f8824B = modifier;
        this.C = z2;
        this.D = z3;
        this.E = textStyle;
        this.F = function2;
        this.G = function22;
        this.H = function23;
        this.I = function24;
        this.J = z4;
        this.K = visualTransformation;
        this.L = keyboardOptions;
        this.M = keyboardActions;
        this.N = z5;
        this.O = i2;
        this.P = i3;
        this.Q = mutableInteractionSource;
        this.R = shape;
        this.S = textFieldColors;
        this.T = i4;
        this.U = i5;
        this.V = i6;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        String str = this.f8825z;
        String str2 = str;
        TextFieldKt.d(str2, this.f8823A, this.f8824B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, composer2, RecomposeScopeImplKt.a(this.T | 1), RecomposeScopeImplKt.a(this.U), this.V);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
