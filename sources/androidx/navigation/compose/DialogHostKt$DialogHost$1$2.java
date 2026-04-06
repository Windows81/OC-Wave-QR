package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DialogHostKt$DialogHost$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DialogNavigator f22479A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f22480B;
    public final /* synthetic */ SnapshotStateList C;
    public final /* synthetic */ DialogNavigator.Destination D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22481z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2(NavBackStackEntry navBackStackEntry, DialogNavigator dialogNavigator, SaveableStateHolder saveableStateHolder, SnapshotStateList snapshotStateList, DialogNavigator.Destination destination) {
        super(2);
        this.f22481z = navBackStackEntry;
        this.f22479A = dialogNavigator;
        this.f22480B = saveableStateHolder;
        this.C = snapshotStateList;
        this.D = destination;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1129586364, i2, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            NavBackStackEntry navBackStackEntry = this.f22481z;
            boolean l2 = composer.l(this.f22481z) | composer.W(this.f22479A);
            SnapshotStateList snapshotStateList = this.C;
            NavBackStackEntry navBackStackEntry2 = this.f22481z;
            DialogNavigator dialogNavigator = this.f22479A;
            Object g2 = composer.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new DialogHostKt$DialogHost$1$2$1$1(snapshotStateList, navBackStackEntry2, dialogNavigator);
                composer.N(g2);
            }
            EffectsKt.c(navBackStackEntry, (Function1) g2, composer, 0);
            final NavBackStackEntry navBackStackEntry3 = this.f22481z;
            SaveableStateHolder saveableStateHolder = this.f22480B;
            final DialogNavigator.Destination destination = this.D;
            NavBackStackEntryProviderKt.a(navBackStackEntry3, saveableStateHolder, ComposableLambdaKt.e(-497631156, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if ((i2 & 3) != 2 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-497631156, i2, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                        }
                        destination.M().d(navBackStackEntry3, composer, 0);
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
            }, composer, 54), composer, 384);
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
