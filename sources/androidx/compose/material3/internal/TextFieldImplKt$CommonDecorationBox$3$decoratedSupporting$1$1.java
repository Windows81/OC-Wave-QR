package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12354A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12355B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f12356z;

    public TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(long j2, TextStyle textStyle, Function2 function2) {
        this.f12356z = j2;
        this.f12354A = textStyle;
        this.f12355B = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(837168720, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
            }
            TextFieldImplKt.s(this.f12356z, this.f12354A, this.f12355B, composer, 0);
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
