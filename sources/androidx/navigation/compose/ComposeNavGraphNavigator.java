package androidx.navigation.compose;

import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
@Navigator.Name("navigation")
public final class ComposeNavGraphNavigator extends NavGraphNavigator {

    @Metadata
    public static final class ComposeNavGraph extends NavGraph {
        public Function1 Q;
        public Function1 R;
        public Function1 S;
        public Function1 T;
        public Function1 U;

        public ComposeNavGraph(Navigator navigator) {
            super(navigator);
        }

        public final Function1 l0() {
            return this.Q;
        }

        public final Function1 o0() {
            return this.R;
        }

        public final Function1 p0() {
            return this.S;
        }

        public final Function1 q0() {
            return this.T;
        }

        public final Function1 r0() {
            return this.U;
        }

        public final void u0(Function1 function1) {
            this.Q = function1;
        }

        public final void v0(Function1 function1) {
            this.R = function1;
        }

        public final void x0(Function1 function1) {
            this.S = function1;
        }

        public final void y0(Function1 function1) {
            this.T = function1;
        }

        public final void z0(Function1 function1) {
            this.U = function1;
        }
    }

    public ComposeNavGraphNavigator(NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    /* renamed from: l */
    public NavGraph a() {
        return new ComposeNavGraph(this);
    }
}
