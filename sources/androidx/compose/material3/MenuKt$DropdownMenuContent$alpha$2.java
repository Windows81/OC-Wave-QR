package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class MenuKt$DropdownMenuContent$alpha$2 implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10300z;

    public MenuKt$DropdownMenuContent$alpha$2(FiniteAnimationSpec finiteAnimationSpec) {
        this.f10300z = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(2839488);
        if (ComposerKt.P()) {
            ComposerKt.Y(2839488, i2, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
        }
        FiniteAnimationSpec finiteAnimationSpec = this.f10300z;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return finiteAnimationSpec;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
