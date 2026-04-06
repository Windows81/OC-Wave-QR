package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class ListItemKt$ListItem$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10237A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f10238B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10239z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1192488737, i2, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:164)");
            }
            ListItemKt.d(this.f10239z, this.f10237A, this.f10238B, this.C, this.D, composer, 384);
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
