package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomNavigationKt$BottomNavigationTransition$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f7343A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f7344z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationTransition$1(Function3 function3, State state) {
        super(2);
        this.f7344z = function3;
        this.f7343A = state;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-138092754, i2, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:295)");
            }
            this.f7344z.d(Float.valueOf(BottomNavigationKt.f(this.f7343A)), composer, 0);
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
