package androidx.navigation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializersKt;

@Metadata
@NavDestinationDsl
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {

    /* renamed from: i  reason: collision with root package name */
    public final NavigatorProvider f22349i;

    /* renamed from: j  reason: collision with root package name */
    public int f22350j;

    /* renamed from: k  reason: collision with root package name */
    public String f22351k;

    /* renamed from: l  reason: collision with root package name */
    public KClass f22352l;

    /* renamed from: m  reason: collision with root package name */
    public Object f22353m;

    /* renamed from: n  reason: collision with root package name */
    public final List f22354n = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, String str, String str2) {
        super(navigatorProvider.d(NavGraphNavigator.class), str2);
        Intrinsics.i(navigatorProvider, "provider");
        Intrinsics.i(str, "startDestination");
        this.f22349i = navigatorProvider;
        this.f22351k = str;
    }

    public final void f(NavDestination navDestination) {
        Intrinsics.i(navDestination, "destination");
        this.f22354n.add(navDestination);
    }

    /* renamed from: g */
    public NavGraph a() {
        NavGraph navGraph = (NavGraph) super.a();
        navGraph.O(this.f22354n);
        int i2 = this.f22350j;
        if (i2 != 0 || this.f22351k != null || this.f22352l != null || this.f22353m != null) {
            String str = this.f22351k;
            if (str != null) {
                Intrinsics.f(str);
                navGraph.h0(str);
            } else {
                KClass kClass = this.f22352l;
                if (kClass != null) {
                    Intrinsics.f(kClass);
                    navGraph.i0(SerializersKt.b(kClass), NavGraphBuilder$build$1$1.f22355z);
                } else {
                    Object obj = this.f22353m;
                    if (obj != null) {
                        Intrinsics.f(obj);
                        navGraph.f0(obj);
                    } else {
                        navGraph.d0(i2);
                    }
                }
            }
            return navGraph;
        } else if (c() != null) {
            throw new IllegalStateException("You must set a start destination route");
        } else {
            throw new IllegalStateException("You must set a start destination id");
        }
    }

    public final void h(NavDestinationBuilder navDestinationBuilder) {
        Intrinsics.i(navDestinationBuilder, "navDestination");
        this.f22354n.add(navDestinationBuilder.a());
    }

    public final NavigatorProvider i() {
        return this.f22349i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, KClass kClass, KClass kClass2, Map map) {
        super(navigatorProvider.d(NavGraphNavigator.class), kClass2, map);
        Intrinsics.i(navigatorProvider, "provider");
        Intrinsics.i(kClass, "startDestination");
        Intrinsics.i(map, "typeMap");
        this.f22349i = navigatorProvider;
        this.f22352l = kClass;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, Object obj, KClass kClass, Map map) {
        super(navigatorProvider.d(NavGraphNavigator.class), kClass, map);
        Intrinsics.i(navigatorProvider, "provider");
        Intrinsics.i(obj, "startDestination");
        Intrinsics.i(map, "typeMap");
        this.f22349i = navigatorProvider;
        this.f22353m = obj;
    }
}
