package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class AppBarRowKt$AppBarRow$2$1$2 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f9211A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AppBarMenuState f9212B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppBarOverflowState f9213z;

    public AppBarRowKt$AppBarRow$2$1$2(AppBarOverflowState appBarOverflowState, State state, AppBarMenuState appBarMenuState) {
        this.f9213z = appBarOverflowState;
        this.f9211A = state;
        this.f9212B = appBarMenuState;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        if (composer.E((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1786124721, i2, -1, "androidx.compose.material3.AppBarRow.<anonymous>.<anonymous>.<anonymous> (AppBarRow.kt:79)");
            }
            List subList = AppBarRowKt.a(this.f9211A).a().subList(this.f9213z.c(), this.f9213z.a());
            AppBarMenuState appBarMenuState = this.f9212B;
            int size = subList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AppBarItem) subList.get(i3)).a(appBarMenuState, composer, 6);
            }
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
