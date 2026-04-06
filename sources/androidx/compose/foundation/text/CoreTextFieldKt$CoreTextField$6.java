package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$6 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5692A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f5693B;
    public final /* synthetic */ TextStyle C;
    public final /* synthetic */ VisualTransformation D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ Brush G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ ImeOptions K;
    public final /* synthetic */ KeyboardActions L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ Function3 O;
    public final /* synthetic */ TextFieldScrollerPosition P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5694z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$6(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z2, int i2, int i3, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z3, boolean z4, Function3 function3, TextFieldScrollerPosition textFieldScrollerPosition, int i4, int i5, int i6) {
        super(2);
        this.f5694z = textFieldValue;
        this.f5692A = function1;
        this.f5693B = modifier;
        this.C = textStyle;
        this.D = visualTransformation;
        this.E = function12;
        this.F = mutableInteractionSource;
        this.G = brush;
        this.H = z2;
        this.I = i2;
        this.J = i3;
        this.K = imeOptions;
        this.L = keyboardActions;
        this.M = z3;
        this.N = z4;
        this.O = function3;
        this.P = textFieldScrollerPosition;
        this.Q = i4;
        this.R = i5;
        this.S = i6;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldValue textFieldValue = this.f5694z;
        TextFieldValue textFieldValue2 = textFieldValue;
        CoreTextFieldKt.a(textFieldValue2, this.f5692A, this.f5693B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, composer2, RecomposeScopeImplKt.a(this.Q | 1), RecomposeScopeImplKt.a(this.R), this.S);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
