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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OutlinedTextFieldKt$OutlinedTextField$3 implements TextFieldDecorator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f8116a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f8117b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f8118c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f8119d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8120e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f8121f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function2 f8122g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function2 f8123h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Function2 f8124i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Function2 f8125j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Shape f8126k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f8127l;

    public OutlinedTextFieldKt$OutlinedTextField$3(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Shape shape, TextFieldColors textFieldColors) {
        this.f8116a = outputTransformation;
        this.f8117b = textFieldState;
        this.f8118c = textFieldLineLimits;
        this.f8119d = z2;
        this.f8120e = mutableInteractionSource;
        this.f8121f = z3;
        this.f8122g = function2;
        this.f8123h = function22;
        this.f8124i = function23;
        this.f8125j = function24;
        this.f8126k = shape;
        this.f8127l = textFieldColors;
    }

    public final void a(Function2 function2, Composer composer, int i2) {
        TextFieldBuffer textFieldBuffer;
        String obj;
        Composer composer2 = composer;
        int i3 = i2;
        composer2.X(640748446);
        if (ComposerKt.P()) {
            ComposerKt.Y(640748446, i3, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration (OutlinedTextField.kt:219)");
        }
        if (this.f8116a == null) {
            obj = this.f8117b.i().toString();
        } else {
            TextFieldState textFieldState = this.f8117b;
            TextFieldBuffer r2 = textFieldState.r();
            try {
                textFieldState.d(r2);
                textFieldState.f();
                OutputTransformation outputTransformation = this.f8116a;
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
        boolean d2 = Intrinsics.d(this.f8118c, TextFieldLineLimits.SingleLine.f6073b);
        boolean z2 = this.f8119d;
        MutableInteractionSource mutableInteractionSource = this.f8120e;
        boolean z3 = this.f8121f;
        boolean z4 = z3;
        Function2 function22 = this.f8122g;
        Function2 function23 = this.f8123h;
        Function2 function24 = this.f8124i;
        boolean z5 = z3;
        Function2 function25 = this.f8125j;
        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
        Shape shape = this.f8126k;
        TextFieldColors textFieldColors = this.f8127l;
        boolean z6 = z2;
        String str2 = str;
        Function2 function26 = function2;
        Composer composer3 = composer;
        TextFieldDefaults textFieldDefaults3 = textFieldDefaults2;
        boolean z7 = z2;
        boolean z8 = d2;
        textFieldDefaults3.c(str2, function26, z7, z8, c2, mutableInteractionSource, z4, function22, function23, function24, function25, shape, textFieldColors, (PaddingValues) null, ComposableLambdaKt.e(-1422288378, true, new OutlinedTextFieldKt$OutlinedTextField$3$Decoration$1(z6, z5, mutableInteractionSource, textFieldColors, shape), composer2, 54), composer3, ((i3 << 3) & 112) | 24576, 221184, 8192);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
