package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$DialogNavigatorKt$lambda1$1 extends Lambda implements Function3<NavBackStackEntry, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$DialogNavigatorKt$lambda1$1 f22461z = new ComposableSingletons$DialogNavigatorKt$lambda1$1();

    public ComposableSingletons$DialogNavigatorKt$lambda1$1() {
        super(3);
    }

    public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1092249270, i2, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:58)");
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
