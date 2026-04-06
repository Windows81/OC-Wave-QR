package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class NavigationRailKt$NavigationRailItem$1$indicator$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ NavigationRailItemColors f10495A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shape f10496B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f10497z;

    /* access modifiers changed from: private */
    public static final Unit e(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(((Number) state.getValue()).floatValue());
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2137606782, i2, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:306)");
            }
            Modifier b2 = LayoutIdKt.b(Modifier.f15489d, "indicator");
            boolean W = composer.W(this.f10497z);
            State state = this.f10497z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new F4(state);
                composer.N(g2);
            }
            BoxKt.a(BackgroundKt.a(GraphicsLayerModifierKt.a(b2, (Function1) g2), this.f10495A.a(), this.f10496B), composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
