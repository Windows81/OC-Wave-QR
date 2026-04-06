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
public final class BasicSecureTextFieldKt$BasicSecureTextField$5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5493A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5494B;
    public final /* synthetic */ InputTransformation C;
    public final /* synthetic */ TextStyle D;
    public final /* synthetic */ KeyboardOptions E;
    public final /* synthetic */ KeyboardActionHandler F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ MutableInteractionSource H;
    public final /* synthetic */ Brush I;
    public final /* synthetic */ TextFieldDecorator J;
    public final /* synthetic */ int K;
    public final /* synthetic */ char L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5495z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$5(TextFieldState textFieldState, Modifier modifier, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i2, char c2, int i3, int i4, int i5) {
        super(2);
        this.f5495z = textFieldState;
        this.f5493A = modifier;
        this.f5494B = z2;
        this.C = inputTransformation;
        this.D = textStyle;
        this.E = keyboardOptions;
        this.F = keyboardActionHandler;
        this.G = function2;
        this.H = mutableInteractionSource;
        this.I = brush;
        this.J = textFieldDecorator;
        this.K = i2;
        this.L = c2;
        this.M = i3;
        this.N = i4;
        this.O = i5;
    }

    public final void b(Composer composer, int i2) {
        TextFieldState textFieldState = this.f5495z;
        Modifier modifier = this.f5493A;
        boolean z2 = this.f5494B;
        InputTransformation inputTransformation = this.C;
        TextStyle textStyle = this.D;
        KeyboardOptions keyboardOptions = this.E;
        KeyboardActionHandler keyboardActionHandler = this.F;
        Function2 function2 = this.G;
        MutableInteractionSource mutableInteractionSource = this.H;
        Brush brush = this.I;
        TextFieldDecorator textFieldDecorator = this.J;
        int i3 = this.K;
        char c2 = this.L;
        TextFieldState textFieldState2 = textFieldState;
        BasicSecureTextFieldKt.b(textFieldState2, modifier, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, function2, mutableInteractionSource, brush, textFieldDecorator, i3, c2, composer, RecomposeScopeImplKt.a(this.M | 1), RecomposeScopeImplKt.a(this.N), this.O);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
