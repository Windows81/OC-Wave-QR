package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
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
public final class BasicSecureTextFieldKt$BasicSecureTextField$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5490A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5491B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ InputTransformation D;
    public final /* synthetic */ TextStyle E;
    public final /* synthetic */ KeyboardOptions F;
    public final /* synthetic */ KeyboardActionHandler G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ MutableInteractionSource I;
    public final /* synthetic */ Brush J;
    public final /* synthetic */ TextFieldDecorator K;
    public final /* synthetic */ int L;
    public final /* synthetic */ char M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5492z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$4(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i2, char c2, int i3, int i4, int i5) {
        super(2);
        this.f5492z = textFieldState;
        this.f5490A = modifier;
        this.f5491B = z2;
        this.C = z3;
        this.D = inputTransformation;
        this.E = textStyle;
        this.F = keyboardOptions;
        this.G = keyboardActionHandler;
        this.H = function2;
        this.I = mutableInteractionSource;
        this.J = brush;
        this.K = textFieldDecorator;
        this.L = i2;
        this.M = c2;
        this.N = i3;
        this.O = i4;
        this.P = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        TextFieldState textFieldState = this.f5492z;
        TextFieldState textFieldState2 = textFieldState;
        BasicSecureTextFieldKt.c(textFieldState2, this.f5490A, this.f5491B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, composer2, RecomposeScopeImplKt.a(this.N | 1), RecomposeScopeImplKt.a(this.O), this.P);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
