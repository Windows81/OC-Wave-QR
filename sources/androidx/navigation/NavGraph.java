package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@Metadata
public class NavGraph extends NavDestination implements Iterable<NavDestination>, KMappedMarker {
    public static final Companion P = new Companion((DefaultConstructorMarker) null);
    public final SparseArrayCompat L = new SparseArrayCompat(0, 1, (DefaultConstructorMarker) null);
    public int M;
    public String N;
    public String O;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Sequence a(NavGraph navGraph) {
            Intrinsics.i(navGraph, "<this>");
            return SequencesKt.h(navGraph, NavGraph$Companion$childHierarchy$1.f22343z);
        }

        public final NavDestination b(NavGraph navGraph) {
            Intrinsics.i(navGraph, "<this>");
            return (NavDestination) SequencesKt.y(a(navGraph));
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator navigator) {
        super(navigator);
        Intrinsics.i(navigator, "navGraphNavigator");
    }

    public static /* synthetic */ NavDestination U(NavGraph navGraph, int i2, NavDestination navDestination, boolean z2, NavDestination navDestination2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 8) != 0) {
                navDestination2 = null;
            }
            return navGraph.S(i2, navDestination, z2, navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
    }

    public NavDestination.DeepLinkMatch B(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.i(navDeepLinkRequest, "navDeepLinkRequest");
        return a0(navDeepLinkRequest, true, false, this);
    }

    public final void M(NavDestination navDestination) {
        Intrinsics.i(navDestination, "node");
        int q2 = navDestination.q();
        String w2 = navDestination.w();
        if (q2 == 0 && w2 == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        } else if (w() != null && Intrinsics.d(w2, w())) {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + this).toString());
        } else if (q2 != q()) {
            NavDestination navDestination2 = (NavDestination) this.L.g(q2);
            if (navDestination2 != navDestination) {
                if (navDestination.v() == null) {
                    if (navDestination2 != null) {
                        navDestination2.J((NavGraph) null);
                    }
                    navDestination.J(this);
                    this.L.k(navDestination.q(), navDestination);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + this).toString());
        }
    }

    public final void O(Collection collection) {
        Intrinsics.i(collection, "nodes");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            NavDestination navDestination = (NavDestination) it.next();
            if (navDestination != null) {
                M(navDestination);
            }
        }
    }

    public final NavDestination P(int i2) {
        return U(this, i2, this, false, (NavDestination) null, 8, (Object) null);
    }

    public final NavDestination Q(String str) {
        if (str == null || StringsKt.l0(str)) {
            return null;
        }
        return R(str, true);
    }

    public final NavDestination R(String str, boolean z2) {
        Object obj;
        Intrinsics.i(str, "route");
        Iterator it = SequencesKt.e(SparseArrayKt.b(this.L)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NavDestination navDestination = (NavDestination) obj;
            if (!StringsKt.C(navDestination.w(), str, false, 2, (Object) null)) {
                if (navDestination.C(str) != null) {
                    break;
                }
            } else {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) obj;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z2 || v() == null) {
            return null;
        }
        NavGraph v2 = v();
        Intrinsics.f(v2);
        return v2.Q(str);
    }

    public final NavDestination S(int i2, NavDestination navDestination, boolean z2, NavDestination navDestination2) {
        NavDestination navDestination3;
        NavDestination navDestination4 = (NavDestination) this.L.g(i2);
        if (navDestination2 != null) {
            if (Intrinsics.d(navDestination4, navDestination2) && Intrinsics.d(navDestination4.v(), navDestination2.v())) {
                return navDestination4;
            }
            navDestination4 = null;
        } else if (navDestination4 != null) {
            return navDestination4;
        }
        if (z2) {
            Iterator it = SequencesKt.e(SparseArrayKt.b(this.L)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination4 = null;
                    break;
                }
                NavDestination navDestination5 = (NavDestination) it.next();
                if (!(navDestination5 instanceof NavGraph) || Intrinsics.d(navDestination5, navDestination)) {
                    navDestination3 = null;
                    continue;
                } else {
                    navDestination3 = ((NavGraph) navDestination5).S(i2, this, true, navDestination2);
                    continue;
                }
                if (navDestination3 != null) {
                    navDestination4 = navDestination3;
                    break;
                }
            }
        }
        if (navDestination4 != null) {
            return navDestination4;
        }
        if (v() == null || Intrinsics.d(v(), navDestination)) {
            return null;
        }
        NavGraph v2 = v();
        Intrinsics.f(v2);
        return v2.S(i2, this, z2, navDestination2);
    }

    public final SparseArrayCompat V() {
        return this.L;
    }

    public final String W() {
        if (this.N == null) {
            String str = this.O;
            if (str == null) {
                str = String.valueOf(this.M);
            }
            this.N = str;
        }
        String str2 = this.N;
        Intrinsics.f(str2);
        return str2;
    }

    public final int Y() {
        return this.M;
    }

    public final String Z() {
        return this.O;
    }

    public final NavDestination.DeepLinkMatch a0(NavDeepLinkRequest navDeepLinkRequest, boolean z2, boolean z3, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Intrinsics.i(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.i(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch B2 = super.B(navDeepLinkRequest);
        NavDestination.DeepLinkMatch deepLinkMatch2 = null;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                NavDestination navDestination2 = (NavDestination) it.next();
                NavDestination.DeepLinkMatch B3 = !Intrinsics.d(navDestination2, navDestination) ? navDestination2.B(navDeepLinkRequest) : null;
                if (B3 != null) {
                    arrayList.add(B3);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) CollectionsKt.r0(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph v2 = v();
        if (v2 != null && z3 && !Intrinsics.d(v2, navDestination)) {
            deepLinkMatch2 = v2.a0(navDeepLinkRequest, z2, true, this);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.r0(CollectionsKt.r(B2, deepLinkMatch, deepLinkMatch2));
    }

    public final NavDestination.DeepLinkMatch b0(String str, boolean z2, boolean z3, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Intrinsics.i(str, "route");
        Intrinsics.i(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch C = C(str);
        NavDestination.DeepLinkMatch deepLinkMatch2 = null;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                NavDestination navDestination2 = (NavDestination) it.next();
                NavDestination.DeepLinkMatch b0 = Intrinsics.d(navDestination2, navDestination) ? null : navDestination2 instanceof NavGraph ? ((NavGraph) navDestination2).b0(str, true, false, this) : navDestination2.C(str);
                if (b0 != null) {
                    arrayList.add(b0);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) CollectionsKt.r0(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph v2 = v();
        if (v2 != null && z3 && !Intrinsics.d(v2, navDestination)) {
            deepLinkMatch2 = v2.b0(str, z2, true, this);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.r0(CollectionsKt.r(C, deepLinkMatch, deepLinkMatch2));
    }

    public final void d0(int i2) {
        j0(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        if (super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (this.L.o() == navGraph.L.o() && Y() == navGraph.Y()) {
                for (NavDestination navDestination : SequencesKt.e(SparseArrayKt.b(this.L))) {
                    if (!Intrinsics.d(navDestination, navGraph.L.g(navDestination.q()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f0(Object obj) {
        Intrinsics.i(obj, "startDestRoute");
        i0(SerializersKt.b(Reflection.b(obj.getClass())), new NavGraph$setStartDestination$2(obj));
    }

    public final void h0(String str) {
        Intrinsics.i(str, "startDestRoute");
        k0(str);
    }

    public int hashCode() {
        int Y = Y();
        SparseArrayCompat sparseArrayCompat = this.L;
        int o2 = sparseArrayCompat.o();
        for (int i2 = 0; i2 < o2; i2++) {
            Y = (((Y * 31) + sparseArrayCompat.j(i2)) * 31) + ((NavDestination) sparseArrayCompat.p(i2)).hashCode();
        }
        return Y;
    }

    public final void i0(KSerializer kSerializer, Function1 function1) {
        Intrinsics.i(kSerializer, "serializer");
        Intrinsics.i(function1, "parseRoute");
        int g2 = RouteSerializerKt.g(kSerializer);
        NavDestination P2 = P(g2);
        if (P2 != null) {
            k0((String) function1.invoke(P2));
            this.M = g2;
            return;
        }
        throw new IllegalStateException(("Cannot find startDestination " + kSerializer.a().a() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
    }

    public final Iterator iterator() {
        return new NavGraph$iterator$1(this);
    }

    public final void j0(int i2) {
        if (i2 != q()) {
            if (this.O != null) {
                k0((String) null);
            }
            this.M = i2;
            this.N = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i2 + " cannot use the same id as the graph " + this).toString());
    }

    public final void k0(String str) {
        int i2;
        if (str == null) {
            i2 = 0;
        } else if (Intrinsics.d(str, w())) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if (!StringsKt.l0(str)) {
            i2 = NavDestination.J.a(str).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route");
        }
        this.M = i2;
        this.O = str;
    }

    public String p() {
        return q() != 0 ? super.p() : "the root navigation";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination Q = Q(this.O);
        if (Q == null) {
            Q = P(Y());
        }
        sb.append(" startDestination=");
        if (Q == null) {
            String str = this.O;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.N;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.M));
                }
            }
        } else {
            sb.append("{");
            sb.append(Q.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }
}
