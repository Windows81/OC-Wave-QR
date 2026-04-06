package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class TabKt$Tab$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11281A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f11282z;

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        if (composer.E((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-906085472, i2, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:120)");
            }
            TabKt.b(this.f11282z, this.f11281A, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
