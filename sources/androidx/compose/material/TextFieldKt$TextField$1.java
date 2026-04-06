package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldKt$TextField$1 implements TextFieldDecorator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f8802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f8803b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f8804c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f8805d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8806e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f8807f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function2 f8808g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function2 f8809h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Function2 f8810i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Function2 f8811j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Shape f8812k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f8813l;

    public TextFieldKt$TextField$1(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Shape shape, TextFieldColors textFieldColors) {
        this.f8802a = outputTransformation;
        this.f8803b = textFieldState;
        this.f8804c = textFieldLineLimits;
        this.f8805d = z2;
        this.f8806e = mutableInteractionSource;
        this.f8807f = z3;
        this.f8808g = function2;
        this.f8809h = function22;
        this.f8810i = function23;
        this.f8811j = function24;
        this.f8812k = shape;
        this.f8813l = textFieldColors;
    }

    public final void a(Function2 function2, Composer composer, int i2) {
        TextFieldBuffer textFieldBuffer;
        String obj;
        int i3 = i2;
        composer.X(626218266);
        if (ComposerKt.P()) {
            ComposerKt.Y(626218266, i3, -1, "androidx.compose.material.TextField.<no name provided>.Decoration (TextField.kt:226)");
        }
        if (this.f8802a == null) {
            obj = this.f8803b.i().toString();
        } else {
            TextFieldState textFieldState = this.f8803b;
            TextFieldBuffer r2 = textFieldState.r();
            try {
                textFieldState.d(r2);
                textFieldState.f();
                OutputTransformation outputTransformation = this.f8802a;
                if (r2 == null) {
                    Intrinsics.y("buffer");
                    textFieldBuffer = null;
                } else {
                    textFieldBuffer = r2;
                }
                outputTransformation.a(textFieldBuffer);
                obj = r2.a().toString();
            } catch (Throwable th) {
                Throwable th2 = th;
                textFieldState.f();
                throw th2;
            }
        }
        String str = obj;
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f8730a;
        VisualTransformation c2 = VisualTransformation.f18929a.c();
        Function2 function22 = function2;
        textFieldDefaults.e(str, function22, this.f8805d, Intrinsics.d(this.f8804c, TextFieldLineLimits.SingleLine.f6073b), c2, this.f8806e, this.f8807f, this.f8808g, this.f8809h, this.f8810i, this.f8811j, this.f8812k, this.f8813l, (PaddingValues) null, composer, ((i3 << 3) & 112) | 24576, 24576, 8192);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
