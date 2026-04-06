package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$18 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5536A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f5537B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ KeyboardOptions F;
    public final /* synthetic */ KeyboardActions G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ VisualTransformation J;
    public final /* synthetic */ Function1 K;
    public final /* synthetic */ MutableInteractionSource L;
    public final /* synthetic */ Brush M;
    public final /* synthetic */ Function3 N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5538z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$18(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, int i3, int i4, int i5) {
        super(2);
        this.f5538z = textFieldValue;
        this.f5536A = function1;
        this.f5537B = modifier;
        this.C = z2;
        this.D = z3;
        this.E = textStyle;
        this.F = keyboardOptions;
        this.G = keyboardActions;
        this.H = z4;
        this.I = i2;
        this.J = visualTransformation;
        this.K = function12;
        this.L = mutableInteractionSource;
        this.M = brush;
        this.N = function3;
        this.O = i3;
        this.P = i4;
        this.Q = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldValue textFieldValue = this.f5538z;
        TextFieldValue textFieldValue2 = textFieldValue;
        BasicTextFieldKt.d(textFieldValue2, this.f5536A, this.f5537B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, composer2, RecomposeScopeImplKt.a(this.O | 1), RecomposeScopeImplKt.a(this.P), this.Q);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
