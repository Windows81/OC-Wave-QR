package androidx.compose.foundation.text;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5522A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5523B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ InputTransformation D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ KeyboardOptions F;
    public final /* synthetic */ KeyboardActionHandler G;
    public final /* synthetic */ TextFieldLineLimits H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ MutableInteractionSource J;
    public final /* synthetic */ Brush K;
    public final /* synthetic */ OutputTransformation L;
    public final /* synthetic */ TextFieldDecorator M;
    public final /* synthetic */ ScrollState N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5524z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$1(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, int i2, int i3, int i4) {
        super(2);
        this.f5524z = textFieldState;
        this.f5522A = modifier;
        this.f5523B = z2;
        this.C = z3;
        this.D = inputTransformation;
        this.E = textStyle;
        this.F = keyboardOptions;
        this.G = keyboardActionHandler;
        this.H = textFieldLineLimits;
        this.I = function2;
        this.J = mutableInteractionSource;
        this.K = brush;
        this.L = outputTransformation;
        this.M = textFieldDecorator;
        this.N = scrollState;
        this.O = i2;
        this.P = i3;
        this.Q = i4;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldState textFieldState = this.f5524z;
        TextFieldState textFieldState2 = textFieldState;
        BasicTextFieldKt.a(textFieldState2, this.f5522A, this.f5523B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, composer2, RecomposeScopeImplKt.a(this.O | 1), RecomposeScopeImplKt.a(this.P), this.Q);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
