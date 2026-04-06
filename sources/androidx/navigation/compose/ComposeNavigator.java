package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
@Navigator.Name("composable")
public final class ComposeNavigator extends Navigator<Destination> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f22462d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f22463c = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Destination extends NavDestination {
        public final Function4 L;
        public Function1 M;
        public Function1 N;
        public Function1 O;
        public Function1 P;
        public Function1 Q;

        @Metadata
        /* renamed from: androidx.navigation.compose.ComposeNavigator$Destination$1  reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ Function3 f22464z;

            public final void b(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
                if (ComposerKt.P()) {
                    ComposerKt.Y(1587956030, i2, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:107)");
                }
                this.f22464z.d(navBackStackEntry, composer, Integer.valueOf((i2 >> 3) & 14));
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
            }

            public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                b((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return Unit.f40552a;
            }
        }

        public Destination(ComposeNavigator composeNavigator, Function4 function4) {
            super((Navigator) composeNavigator);
            this.L = function4;
        }

        public final Function4 M() {
            return this.L;
        }

        public final Function1 O() {
            return this.M;
        }

        public final Function1 P() {
            return this.N;
        }

        public final Function1 Q() {
            return this.O;
        }

        public final Function1 R() {
            return this.P;
        }

        public final Function1 S() {
            return this.Q;
        }

        public final void U(Function1 function1) {
            this.M = function1;
        }

        public final void V(Function1 function1) {
            this.N = function1;
        }

        public final void W(Function1 function1) {
            this.O = function1;
        }

        public final void Y(Function1 function1) {
            this.P = function1;
        }

        public final void Z(Function1 function1) {
            this.Q = function1;
        }
    }

    public void e(List list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().k((NavBackStackEntry) it.next());
        }
        this.f22463c.setValue(Boolean.FALSE);
    }

    public void j(NavBackStackEntry navBackStackEntry, boolean z2) {
        b().h(navBackStackEntry, z2);
        this.f22463c.setValue(Boolean.TRUE);
    }

    /* renamed from: l */
    public Destination a() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.f22456a.a());
    }

    public final StateFlow m() {
        return b().b();
    }

    public final MutableState n() {
        return this.f22463c;
    }

    public final void o(NavBackStackEntry navBackStackEntry) {
        b().e(navBackStackEntry);
    }

    public final void p(NavBackStackEntry navBackStackEntry) {
        b().i(navBackStackEntry);
    }
}
