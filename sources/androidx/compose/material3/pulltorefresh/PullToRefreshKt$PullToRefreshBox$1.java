package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class PullToRefreshKt$PullToRefreshBox$1 implements Function3<BoxScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12614A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f12615z;

    public PullToRefreshKt$PullToRefreshBox$1(PullToRefreshState pullToRefreshState, boolean z2) {
        this.f12615z = pullToRefreshState;
        this.f12614A = z2;
    }

    public final void b(BoxScope boxScope, Composer composer, int i2) {
        int i3;
        BoxScope boxScope2 = boxScope;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.W(boxScope) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1028036671, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:126)");
            }
            PullToRefreshDefaults.f12593a.g(this.f12615z, this.f12614A, boxScope.g(Modifier.f15489d, Alignment.f15444a.m()), 0, 0, 0.0f, composer, 1572864, 56);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
