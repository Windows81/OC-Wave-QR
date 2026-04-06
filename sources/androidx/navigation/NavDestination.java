package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.serialization.RouteSerializerKt;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializersKt;

@Metadata
public class NavDestination {
    public static final Companion J = new Companion((DefaultConstructorMarker) null);
    public static final Map K = new LinkedHashMap();

    /* renamed from: A  reason: collision with root package name */
    public NavGraph f22323A;

    /* renamed from: B  reason: collision with root package name */
    public String f22324B;
    public CharSequence C;
    public final List D;
    public final SparseArrayCompat E;
    public Map F;
    public int G;
    public String H;
    public Lazy I;

    /* renamed from: z  reason: collision with root package name */
    public final String f22325z;

    @Target
    @Retention
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata
    @java.lang.annotation.Retention(RetentionPolicy.CLASS)
    public @interface ClassType {
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String b(Context context, int i2) {
            String str;
            Intrinsics.i(context, "context");
            if (i2 <= 16777215) {
                return String.valueOf(i2);
            }
            try {
                str = context.getResources().getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i2);
            }
            Intrinsics.h(str, "try {\n                  …tring()\n                }");
            return str;
        }

        public final Sequence c(NavDestination navDestination) {
            Intrinsics.i(navDestination, "<this>");
            return SequencesKt.h(navDestination, NavDestination$Companion$hierarchy$1.f22326z);
        }

        public final boolean d(NavDestination navDestination, KClass kClass) {
            Intrinsics.i(navDestination, "<this>");
            Intrinsics.i(kClass, "route");
            return RouteSerializerKt.g(SerializersKt.b(kClass)) == navDestination.q();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        /* renamed from: A  reason: collision with root package name */
        public final Bundle f22327A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f22328B;
        public final int C;
        public final boolean D;
        public final int E;

        /* renamed from: z  reason: collision with root package name */
        public final NavDestination f22329z;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z2, int i2, boolean z3, int i3) {
            Intrinsics.i(navDestination, "destination");
            this.f22329z = navDestination;
            this.f22327A = bundle;
            this.f22328B = z2;
            this.C = i2;
            this.D = z3;
            this.E = i3;
        }

        /* renamed from: d */
        public int compareTo(DeepLinkMatch deepLinkMatch) {
            Intrinsics.i(deepLinkMatch, "other");
            boolean z2 = this.f22328B;
            if (z2 && !deepLinkMatch.f22328B) {
                return 1;
            }
            if (!z2 && deepLinkMatch.f22328B) {
                return -1;
            }
            int i2 = this.C - deepLinkMatch.C;
            if (i2 > 0) {
                return 1;
            }
            if (i2 < 0) {
                return -1;
            }
            Bundle bundle = this.f22327A;
            if (bundle != null && deepLinkMatch.f22327A == null) {
                return 1;
            }
            if (bundle == null && deepLinkMatch.f22327A != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = deepLinkMatch.f22327A;
                Intrinsics.f(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z3 = this.D;
            if (z3 && !deepLinkMatch.D) {
                return 1;
            }
            if (z3 || !deepLinkMatch.D) {
                return this.E - deepLinkMatch.E;
            }
            return -1;
        }

        public final NavDestination f() {
            return this.f22329z;
        }

        public final Bundle h() {
            return this.f22327A;
        }

        public final boolean j(Bundle bundle) {
            Bundle bundle2;
            Object obj;
            if (bundle == null || (bundle2 = this.f22327A) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            Intrinsics.h(keySet, "matchingArgs.keySet()");
            for (String str : keySet) {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.f22329z.F.get(str);
                Object obj2 = null;
                NavType a2 = navArgument != null ? navArgument.a() : null;
                if (a2 != null) {
                    Bundle bundle3 = this.f22327A;
                    Intrinsics.h(str, "key");
                    obj = a2.a(bundle3, str);
                } else {
                    obj = null;
                }
                if (a2 != null) {
                    Intrinsics.h(str, "key");
                    obj2 = a2.a(bundle, str);
                }
                if (a2 != null && !a2.j(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public NavDestination(String str) {
        Intrinsics.i(str, "navigatorName");
        this.f22325z = str;
        this.D = new ArrayList();
        this.E = new SparseArrayCompat(0, 1, (DefaultConstructorMarker) null);
        this.F = new LinkedHashMap();
    }

    public static /* synthetic */ int[] n(NavDestination navDestination, NavDestination navDestination2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.m(navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    public final boolean A(String str, Bundle bundle) {
        Intrinsics.i(str, "route");
        if (Intrinsics.d(this.H, str)) {
            return true;
        }
        DeepLinkMatch C2 = C(str);
        if (!Intrinsics.d(this, C2 != null ? C2.f() : null)) {
            return false;
        }
        return C2.j(bundle);
    }

    public DeepLinkMatch B(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.i(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.D.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.D) {
            Uri c2 = navDeepLinkRequest.c();
            if (navDeepLink.E(navDeepLinkRequest)) {
                Bundle o2 = c2 != null ? navDeepLink.o(c2, this.F) : null;
                int h2 = navDeepLink.h(c2);
                String a2 = navDeepLinkRequest.a();
                boolean z2 = a2 != null && Intrinsics.d(a2, navDeepLink.i());
                String b2 = navDeepLinkRequest.b();
                int u2 = b2 != null ? navDeepLink.u(b2) : -1;
                if (o2 != null || ((z2 || u2 > -1) && z(navDeepLink, c2, this.F))) {
                    DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, o2, navDeepLink.z(), h2, z2, u2);
                    if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                        deepLinkMatch = deepLinkMatch2;
                    }
                }
            }
        }
        return deepLinkMatch;
    }

    public final DeepLinkMatch C(String str) {
        NavDeepLink navDeepLink;
        Intrinsics.i(str, "route");
        Lazy lazy = this.I;
        if (lazy == null || (navDeepLink = (NavDeepLink) lazy.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(J.a(str));
        Intrinsics.e(parse, "Uri.parse(this)");
        Bundle o2 = navDeepLink.o(parse, this.F);
        if (o2 == null) {
            return null;
        }
        return new DeepLinkMatch(this, o2, navDeepLink.z(), navDeepLink.h(parse), false, -1);
    }

    public final void D(int i2, NavAction navAction) {
        Intrinsics.i(navAction, "action");
        if (!L()) {
            throw new UnsupportedOperationException("Cannot add action " + i2 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i2 != 0) {
            this.E.k(i2, navAction);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    public final void E(int i2) {
        this.G = i2;
        this.f22324B = null;
    }

    public final void F(CharSequence charSequence) {
        this.C = charSequence;
    }

    public final void J(NavGraph navGraph) {
        this.f22323A = navGraph;
    }

    public final void K(String str) {
        if (str == null) {
            E(0);
        } else if (!StringsKt.l0(str)) {
            String a2 = J.a(str);
            List a3 = NavArgumentKt.a(this.F, new NavDestination$route$missingRequiredArguments$1(new NavDeepLink.Builder().b(a2).a()));
            if (a3.isEmpty()) {
                this.I = LazyKt.b(new NavDestination$route$3(a2));
                E(a2.hashCode());
            } else {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + a3).toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        this.H = str;
    }

    public boolean L() {
        return true;
    }

    public boolean equals(Object obj) {
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavDestination)) {
            return false;
        }
        NavDestination navDestination = (NavDestination) obj;
        boolean d2 = Intrinsics.d(this.D, navDestination.D);
        if (this.E.o() == navDestination.E.o()) {
            Iterator it = SequencesKt.e(SparseArrayKt.a(this.E)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                int intValue = ((Number) it.next()).intValue();
                if (!Intrinsics.d(this.E.g(intValue), navDestination.E.g(intValue))) {
                    break;
                }
            }
        } else {
            z2 = false;
        }
        if (this.F.size() == navDestination.F.size()) {
            Iterator it2 = MapsKt.v(this.F).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z3 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (navDestination.F.containsKey(entry.getKey())) {
                    if (!Intrinsics.d(navDestination.F.get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z3 = false;
        return this.G == navDestination.G && Intrinsics.d(this.H, navDestination.H) && d2 && z2 && z3;
    }

    public final void g(String str, NavArgument navArgument) {
        Intrinsics.i(str, "argumentName");
        Intrinsics.i(navArgument, "argument");
        this.F.put(str, navArgument);
    }

    public final void h(NavDeepLink navDeepLink) {
        Intrinsics.i(navDeepLink, "navDeepLink");
        List a2 = NavArgumentKt.a(this.F, new NavDestination$addDeepLink$missingRequiredArguments$1(navDeepLink));
        if (a2.isEmpty()) {
            this.D.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a2).toString());
    }

    public int hashCode() {
        int i2;
        Set<String> keySet;
        int i3 = this.G * 31;
        String str = this.H;
        int hashCode = i3 + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.D) {
            int i4 = i2 * 31;
            String y2 = navDeepLink.y();
            int hashCode2 = (i4 + (y2 != null ? y2.hashCode() : 0)) * 31;
            String i5 = navDeepLink.i();
            int hashCode3 = (hashCode2 + (i5 != null ? i5.hashCode() : 0)) * 31;
            String t2 = navDeepLink.t();
            hashCode = hashCode3 + (t2 != null ? t2.hashCode() : 0);
        }
        Iterator b2 = SparseArrayKt.b(this.E);
        while (b2.hasNext()) {
            NavAction navAction = (NavAction) b2.next();
            int b3 = ((i2 * 31) + navAction.b()) * 31;
            NavOptions c2 = navAction.c();
            i2 = b3 + (c2 != null ? c2.hashCode() : 0);
            Bundle a2 = navAction.a();
            if (!(a2 == null || (keySet = a2.keySet()) == null)) {
                Intrinsics.h(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i6 = i2 * 31;
                    Bundle a3 = navAction.a();
                    Intrinsics.f(a3);
                    Object obj = a3.get(str2);
                    i2 = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.F.keySet()) {
            int hashCode4 = ((i2 * 31) + str3.hashCode()) * 31;
            Object obj2 = this.F.get(str3);
            i2 = hashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return i2;
    }

    public final Bundle i(Bundle bundle) {
        if (bundle == null && this.F.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.F.entrySet()) {
            ((NavArgument) entry.getValue()).e((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.F.entrySet()) {
                String str = (String) entry2.getKey();
                NavArgument navArgument = (NavArgument) entry2.getValue();
                if (!navArgument.c() && !navArgument.f(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + navArgument.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public final int[] m(NavDestination navDestination) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavGraph navGraph = this;
        while (true) {
            Intrinsics.f(navGraph);
            NavGraph navGraph2 = navGraph.f22323A;
            if ((navDestination != null ? navDestination.f22323A : null) != null) {
                NavGraph navGraph3 = navDestination.f22323A;
                Intrinsics.f(navGraph3);
                if (navGraph3.P(navGraph.G) == navGraph) {
                    arrayDeque.addFirst(navGraph);
                    break;
                }
            }
            if (navGraph2 == null || navGraph2.Y() != navGraph.G) {
                arrayDeque.addFirst(navGraph);
            }
            if (Intrinsics.d(navGraph2, navDestination) || navGraph2 == null) {
                break;
            }
            navGraph = navGraph2;
        }
        Iterable<NavDestination> M0 = CollectionsKt.M0(arrayDeque);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(M0, 10));
        for (NavDestination navDestination2 : M0) {
            arrayList.add(Integer.valueOf(navDestination2.G));
        }
        return CollectionsKt.L0(arrayList);
    }

    public final Map o() {
        return MapsKt.s(this.F);
    }

    public String p() {
        String str = this.f22324B;
        return str == null ? String.valueOf(this.G) : str;
    }

    public final int q() {
        return this.G;
    }

    public final CharSequence s() {
        return this.C;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f22324B;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.G));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.H;
        if (str2 != null && !StringsKt.l0(str2)) {
            sb.append(" route=");
            sb.append(this.H);
        }
        if (this.C != null) {
            sb.append(" label=");
            sb.append(this.C);
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }

    public final String u() {
        return this.f22325z;
    }

    public final NavGraph v() {
        return this.f22323A;
    }

    public final String w() {
        return this.H;
    }

    public final boolean z(NavDeepLink navDeepLink, Uri uri, Map map) {
        return NavArgumentKt.a(map, new NavDestination$hasRequiredArguments$missingRequiredArguments$1(navDeepLink.p(uri, map))).isEmpty();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator navigator) {
        this(NavigatorProvider.f22432b.a(navigator.getClass()));
        Intrinsics.i(navigator, "navigator");
    }
}
