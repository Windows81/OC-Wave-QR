package androidx.compose.foundation.text;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
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
public final class BasicTextFieldKt$BasicTextField$5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5549A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5550B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ InputTransformation D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ KeyboardOptions F;
    public final /* synthetic */ KeyboardActionHandler G;
    public final /* synthetic */ TextFieldLineLimits H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ MutableInteractionSource J;
    public final /* synthetic */ Brush K;
    public final /* synthetic */ CodepointTransformation L;
    public final /* synthetic */ OutputTransformation M;
    public final /* synthetic */ TextFieldDecorator N;
    public final /* synthetic */ ScrollState O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5551z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$5(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z4, int i2, int i3, int i4) {
        super(2);
        this.f5551z = textFieldState;
        this.f5549A = modifier;
        this.f5550B = z2;
        this.C = z3;
        this.D = inputTransformation;
        this.E = textStyle;
        this.F = keyboardOptions;
        this.G = keyboardActionHandler;
        this.H = textFieldLineLimits;
        this.I = function2;
        this.J = mutableInteractionSource;
        this.K = brush;
        this.L = codepointTransformation;
        this.M = outputTransformation;
        this.N = textFieldDecorator;
        this.O = scrollState;
        this.P = z4;
        this.Q = i2;
        this.R = i3;
        this.S = i4;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldState textFieldState = this.f5551z;
        TextFieldState textFieldState2 = textFieldState;
        BasicTextFieldKt.b(textFieldState2, this.f5549A, this.f5550B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, composer2, RecomposeScopeImplKt.a(this.Q | 1), RecomposeScopeImplKt.a(this.R), this.S);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
