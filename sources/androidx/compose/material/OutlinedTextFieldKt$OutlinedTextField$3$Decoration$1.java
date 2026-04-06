package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OutlinedTextFieldKt$OutlinedTextField$3$Decoration$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8128A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8129B;
    public final /* synthetic */ TextFieldColors C;
    public final /* synthetic */ Shape D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8130z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$3$Decoration$1(boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape) {
        super(2);
        this.f8130z = z2;
        this.f8128A = z3;
        this.f8129B = mutableInteractionSource;
        this.C = textFieldColors;
        this.D = shape;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1422288378, i3, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration.<anonymous> (OutlinedTextField.kt:247)");
            }
            TextFieldDefaults.f8730a.a(this.f8130z, this.f8128A, this.f8129B, this.C, this.D, 0.0f, 0.0f, composer, 12582912, 96);
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
