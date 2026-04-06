package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldKt$TextField$3 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8820A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8821B;
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
    public final /* synthetic */ String f8822z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$3(String str, boolean z2, boolean z3, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z4, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Shape shape, TextFieldColors textFieldColors) {
        super(3);
        this.f8822z = str;
        this.f8820A = z2;
        this.f8821B = z3;
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
                ComposerKt.Y(989834338, i3, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:377)");
            }
            TextFieldDefaults.f8730a.e(this.f8822z, function2, this.f8820A, this.f8821B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (PaddingValues) null, composer, (i3 << 3) & 112, 24576, 8192);
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
