package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TextFieldDefaults$DecorationBox$2$1 implements Function3<TextFieldLabelScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f11377z;

    public TextFieldDefaults$DecorationBox$2$1(Function2 function2) {
        this.f11377z = function2;
    }

    public final void b(TextFieldLabelScope textFieldLabelScope, Composer composer, int i2) {
        if (composer.E((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1110058497, i2, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:415)");
            }
            this.f11377z.m(composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((TextFieldLabelScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
