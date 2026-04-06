package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.NavigationRailVerticalItemTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class NavigationRailKt$NavigationRailItem$styledLabel$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10503A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10504B;
    public final /* synthetic */ FiniteAnimationSpec C;
    public final /* synthetic */ Function2 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavigationRailItemColors f10505z;

    private static final long c(State state) {
        return ((Color) state.getValue()).v();
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2056532825, i2, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:231)");
            }
            ProvideContentColorTextStyleKt.b(c(SingleValueAnimationKt.a(this.f10505z.c(this.f10503A, this.f10504B), this.C, (String) null, (Function1) null, composer, 0, 12)), TypographyKt.e(NavigationRailVerticalItemTokens.f13666a.c(), composer, 6), this.D, composer, 0);
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
