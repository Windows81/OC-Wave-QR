package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OutlinedTextFieldKt$OutlinedTextField$7 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8135A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8136B;
    public final /* synthetic */ VisualTransformation C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Shape J;
    public final /* synthetic */ TextFieldColors K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8137z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$7(String str, boolean z2, boolean z3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z4, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Shape shape, TextFieldColors textFieldColors) {
        super(3);
        this.f8137z = str;
        this.f8135A = z2;
        this.f8136B = z3;
        this.C = visualTransformation;
        this.D = mutableInteractionSource;
        this.E = z4;
        this.F = function2;
        this.G = function22;
        this.H = function23;
        this.I = function24;
        this.J = shape;
        this.K = textFieldColors;
    }

    public final void b(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer composer2 = composer;
        Function2 function22 = function2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.l(function22) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1710364390, i3, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:383)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f8730a;
            String str = this.f8137z;
            boolean z2 = this.f8135A;
            boolean z3 = z2;
            boolean z4 = this.f8136B;
            VisualTransformation visualTransformation = this.C;
            MutableInteractionSource mutableInteractionSource = this.D;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            boolean z5 = this.E;
            boolean z6 = z5;
            Function2 function23 = this.F;
            final boolean z7 = z5;
            Function2 function24 = this.G;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
            Function2 function25 = this.H;
            final boolean z8 = z2;
            Function2 function26 = this.I;
            Shape shape = this.J;
            final Shape shape2 = shape;
            TextFieldColors textFieldColors = this.K;
            final TextFieldColors textFieldColors2 = textFieldColors;
            TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
            String str2 = str;
            textFieldDefaults2.c(str2, function2, z3, z4, visualTransformation, mutableInteractionSource2, z6, function23, function24, function25, function26, shape, textFieldColors, (PaddingValues) null, ComposableLambdaKt.e(1757478222, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3 = i2;
                    if (composer.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1757478222, i3, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:398)");
                        }
                        TextFieldDefaults.f8730a.a(z8, z7, mutableInteractionSource3, textFieldColors2, shape2, 0.0f, 0.0f, composer, 12582912, 96);
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
            }, composer2, 54), composer, (i3 << 3) & 112, 221184, 8192);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
