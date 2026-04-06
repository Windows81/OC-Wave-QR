package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class SearchBarKt$SearchBarImpl$surface$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10871A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10872B;
    public final /* synthetic */ float C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Shape f10873z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1304392981, i3, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.kt:2119)");
            }
            SurfaceKt.c((Modifier) null, this.f10873z, this.f10871A.a(), ColorSchemeKt.g(this.f10871A.a(), composer2, 0), this.f10872B, this.C, (BorderStroke) null, ComposableSingletons$SearchBarKt.f9577a.b(), composer, 12582912, 65);
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
