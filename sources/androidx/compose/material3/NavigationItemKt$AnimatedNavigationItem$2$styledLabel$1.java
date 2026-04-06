package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class NavigationItemKt$AnimatedNavigationItem$2$styledLabel$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavigationItemColors f10467A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10468B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ State D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10469z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(22475789, i2, -1, "androidx.compose.material3.AnimatedNavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:387)");
            }
            NavigationItemKt.h(this.f10469z, NavigationItemKt.g(this.D), this.f10467A, this.f10468B, this.C, composer, 0);
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
