package androidx.navigation.compose;

import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
@Navigator.Name("dialog")
public final class DialogNavigator extends Navigator<Destination> {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f22495c = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public void e(List list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().j((NavBackStackEntry) it.next());
        }
    }

    public void j(NavBackStackEntry navBackStackEntry, boolean z2) {
        b().h(navBackStackEntry, z2);
        int i0 = CollectionsKt.i0((Iterable) b().c().getValue(), navBackStackEntry);
        int i2 = 0;
        for (Object next : (Iterable) b().c().getValue()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next;
            if (i2 > i0) {
                p(navBackStackEntry2);
            }
            i2 = i3;
        }
    }

    /* renamed from: l */
    public Destination a() {
        return new Destination(this, (DialogProperties) null, ComposableSingletons$DialogNavigatorKt.f22459a.a(), 2, (DefaultConstructorMarker) null);
    }

    public final void m(NavBackStackEntry navBackStackEntry) {
        j(navBackStackEntry, false);
    }

    public final StateFlow n() {
        return b().b();
    }

    public final StateFlow o() {
        return b().c();
    }

    public final void p(NavBackStackEntry navBackStackEntry) {
        b().e(navBackStackEntry);
    }

    @Metadata
    public static final class Destination extends NavDestination implements FloatingWindow {
        public final DialogProperties L;
        public final Function3 M;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(dialogNavigator, (i2 & 2) != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties, function3);
        }

        public final Function3 M() {
            return this.M;
        }

        public final DialogProperties O() {
            return this.L;
        }

        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3 function3) {
            super((Navigator) dialogNavigator);
            this.L = dialogProperties;
            this.M = function3;
        }
    }
}
