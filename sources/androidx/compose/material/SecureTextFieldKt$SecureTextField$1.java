package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SecureTextFieldKt$SecureTextField$1 implements TextFieldDecorator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f8315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8317c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f8318d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function2 f8319e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Function2 f8320f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function2 f8321g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function2 f8322h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Shape f8323i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f8324j;

    public SecureTextFieldKt$SecureTextField$1(TextFieldState textFieldState, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Shape shape, TextFieldColors textFieldColors) {
        this.f8315a = textFieldState;
        this.f8316b = z2;
        this.f8317c = mutableInteractionSource;
        this.f8318d = z3;
        this.f8319e = function2;
        this.f8320f = function22;
        this.f8321g = function23;
        this.f8322h = function24;
        this.f8323i = shape;
        this.f8324j = textFieldColors;
    }

    public final void a(Function2 function2, Composer composer, int i2) {
        int i3 = i2;
        composer.X(-1548786338);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1548786338, i3, -1, "androidx.compose.material.SecureTextField.<no name provided>.Decoration (SecureTextField.kt:149)");
        }
        Function2 function22 = function2;
        TextFieldDefaults.f8730a.e(this.f8315a.i().toString(), function22, this.f8316b, true, VisualTransformation.f18929a.c(), this.f8317c, this.f8318d, this.f8319e, this.f8320f, this.f8321g, this.f8322h, this.f8323i, this.f8324j, (PaddingValues) null, composer, ((i3 << 3) & 112) | 27648, 24576, 8192);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
