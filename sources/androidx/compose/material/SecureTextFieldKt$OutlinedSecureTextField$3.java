package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SecureTextFieldKt$OutlinedSecureTextField$3 implements TextFieldDecorator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f8299a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8300b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8301c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f8302d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function2 f8303e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Function2 f8304f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function2 f8305g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function2 f8306h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Shape f8307i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f8308j;

    public SecureTextFieldKt$OutlinedSecureTextField$3(TextFieldState textFieldState, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Shape shape, TextFieldColors textFieldColors) {
        this.f8299a = textFieldState;
        this.f8300b = z2;
        this.f8301c = mutableInteractionSource;
        this.f8302d = z3;
        this.f8303e = function2;
        this.f8304f = function22;
        this.f8305g = function23;
        this.f8306h = function24;
        this.f8307i = shape;
        this.f8308j = textFieldColors;
    }

    public final void a(Function2 function2, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        composer2.X(-1518484896);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1518484896, i3, -1, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration (SecureTextField.kt:284)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f8730a;
        String obj = this.f8299a.i().toString();
        VisualTransformation c2 = VisualTransformation.f18929a.c();
        boolean z2 = this.f8300b;
        MutableInteractionSource mutableInteractionSource = this.f8301c;
        boolean z3 = this.f8302d;
        Function2 function22 = this.f8303e;
        Function2 function23 = this.f8304f;
        Function2 function24 = this.f8305g;
        Function2 function25 = this.f8306h;
        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
        Shape shape = this.f8307i;
        String str = obj;
        TextFieldColors textFieldColors = this.f8308j;
        Function2 function26 = function2;
        Composer composer3 = composer;
        TextFieldDefaults textFieldDefaults3 = textFieldDefaults2;
        String str2 = str;
        textFieldDefaults3.c(str2, function26, z2, true, c2, mutableInteractionSource, z3, function22, function23, function24, function25, shape, textFieldColors, (PaddingValues) null, ComposableLambdaKt.e(-1223036728, true, new SecureTextFieldKt$OutlinedSecureTextField$3$Decoration$1(z2, z3, mutableInteractionSource, textFieldColors, shape), composer2, 54), composer3, ((i3 << 3) & 112) | 27648, 221184, 8192);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
