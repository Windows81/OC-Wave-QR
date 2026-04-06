package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDefaults$indicatorLine$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8759A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f8760B;
    public final /* synthetic */ TextFieldColors C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8761z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLine$2(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3) {
        super(3);
        this.f8761z = z2;
        this.f8759A = z3;
        this.f8760B = interactionSource;
        this.C = textFieldColors;
        this.D = f2;
        this.E = f3;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(1398930845);
        if (ComposerKt.P()) {
            ComposerKt.Y(1398930845, i2, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
        }
        Modifier n2 = TextFieldKt.n(Modifier.f15489d, (BorderStroke) TextFieldDefaultsKt.b(this.f8761z, this.f8759A, this.f8760B, this.C, this.D, this.E, composer, 0).getValue());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return n2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
