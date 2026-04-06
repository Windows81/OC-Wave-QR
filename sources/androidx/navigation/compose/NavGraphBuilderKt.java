package androidx.navigation.compose;

import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

@Metadata
public final class NavGraphBuilderKt {
    public static final void a(NavGraphBuilder navGraphBuilder, Object obj, KClass kClass, Map map, List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.i(), obj, kClass, map);
        function16.invoke(navGraphBuilder2);
        NavGraph g2 = navGraphBuilder2.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g2.h((NavDeepLink) it.next());
        }
        if (g2 instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) g2;
            composeNavGraph.u0(function1);
            composeNavGraph.v0(function12);
            composeNavGraph.x0(function13);
            composeNavGraph.y0(function14);
            composeNavGraph.z0(function15);
        }
        navGraphBuilder.f(g2);
    }
}
