package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowKt$ScrollableTabRow$1 extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f8697z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$1(int i2) {
        super(3);
        this.f8697z = i2;
    }

    public final void b(List list, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-655609869, i2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
        }
        TabRowDefaults tabRowDefaults = TabRowDefaults.f8682a;
        tabRowDefaults.b(tabRowDefaults.e(Modifier.f15489d, (TabPosition) list.get(this.f8697z)), 0.0f, 0, composer, 3072, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((List) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
