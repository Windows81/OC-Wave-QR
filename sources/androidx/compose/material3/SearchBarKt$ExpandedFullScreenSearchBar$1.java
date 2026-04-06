package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
final class SearchBarKt$ExpandedFullScreenSearchBar$1 implements Function2<Composer, Integer, WindowInsets> {

    /* renamed from: z  reason: collision with root package name */
    public static final SearchBarKt$ExpandedFullScreenSearchBar$1 f10855z = new SearchBarKt$ExpandedFullScreenSearchBar$1();

    public final WindowInsets b(Composer composer, int i2) {
        composer.X(-2028768625);
        if (ComposerKt.P()) {
            ComposerKt.Y(-2028768625, i2, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:350)");
        }
        WindowInsets m2 = SearchBarDefaults.f10786a.m(composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return m2;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Composer) obj, ((Number) obj2).intValue());
    }
}
