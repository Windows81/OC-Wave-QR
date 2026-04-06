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
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicSecureTextFieldKt$BasicSecureTextField$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5487A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f5488B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ InputTransformation E;
    public final /* synthetic */ SecureTextFieldController F;
    public final /* synthetic */ TextStyle G;
    public final /* synthetic */ KeyboardOptions H;
    public final /* synthetic */ KeyboardActionHandler I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ MutableInteractionSource K;
    public final /* synthetic */ Brush L;
    public final /* synthetic */ CodepointTransformation M;
    public final /* synthetic */ TextFieldDecorator N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f5489z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$3(TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, boolean z4, InputTransformation inputTransformation, SecureTextFieldController secureTextFieldController, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, TextFieldDecorator textFieldDecorator) {
        super(2);
        this.f5489z = textFieldState;
        this.f5487A = modifier;
        this.f5488B = z2;
        this.C = z3;
        this.D = z4;
        this.E = inputTransformation;
        this.F = secureTextFieldController;
        this.G = textStyle;
        this.H = keyboardOptions;
        this.I = keyboardActionHandler;
        this.J = function2;
        this.K = mutableInteractionSource;
        this.L = brush;
        this.M = codepointTransformation;
        this.N = textFieldDecorator;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(252521481, i3, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:184)");
            }
            BasicTextFieldKt.b(this.f5489z, this.f5487A, this.f5488B, this.C, this.D ? BasicSecureTextFieldKt.h(this.E, this.F.f()) : this.E, this.G, this.H, this.I, TextFieldLineLimits.SingleLine.f6073b, this.J, this.K, this.L, this.M, (OutputTransformation) null, this.N, (ScrollState) null, true, composer, 100663296, 1572864, 40960);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
