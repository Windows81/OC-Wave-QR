package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.SerializersKt;

@Metadata
public class NavController {
    public static final Companion H = new Companion((DefaultConstructorMarker) null);
    public static boolean I = true;

    /* renamed from: A  reason: collision with root package name */
    public Function1 f22205A;

    /* renamed from: B  reason: collision with root package name */
    public final Map f22206B;
    public int C;
    public final List D;
    public final Lazy E;
    public final MutableSharedFlow F;
    public final Flow G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22207a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f22208b;

    /* renamed from: c  reason: collision with root package name */
    public NavInflater f22209c;

    /* renamed from: d  reason: collision with root package name */
    public NavGraph f22210d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f22211e;

    /* renamed from: f  reason: collision with root package name */
    public Parcelable[] f22212f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22213g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayDeque f22214h;

    /* renamed from: i  reason: collision with root package name */
    public final MutableStateFlow f22215i;

    /* renamed from: j  reason: collision with root package name */
    public final StateFlow f22216j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableStateFlow f22217k;

    /* renamed from: l  reason: collision with root package name */
    public final StateFlow f22218l;

    /* renamed from: m  reason: collision with root package name */
    public final Map f22219m;

    /* renamed from: n  reason: collision with root package name */
    public final Map f22220n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f22221o;

    /* renamed from: p  reason: collision with root package name */
    public final Map f22222p;

    /* renamed from: q  reason: collision with root package name */
    public LifecycleOwner f22223q;

    /* renamed from: r  reason: collision with root package name */
    public NavControllerViewModel f22224r;

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArrayList f22225s;

    /* renamed from: t  reason: collision with root package name */
    public Lifecycle.State f22226t;

    /* renamed from: u  reason: collision with root package name */
    public final LifecycleObserver f22227u;

    /* renamed from: v  reason: collision with root package name */
    public final OnBackPressedCallback f22228v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f22229w;

    /* renamed from: x  reason: collision with root package name */
    public NavigatorProvider f22230x;

    /* renamed from: y  reason: collision with root package name */
    public final Map f22231y;

    /* renamed from: z  reason: collision with root package name */
    public Function1 f22232z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class NavControllerNavigatorState extends NavigatorState {

        /* renamed from: g  reason: collision with root package name */
        public final Navigator f22233g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ NavController f22234h;

        public NavControllerNavigatorState(NavController navController, Navigator navigator) {
            Intrinsics.i(navigator, "navigator");
            this.f22234h = navController;
            this.f22233g = navigator;
        }

        public NavBackStackEntry a(NavDestination navDestination, Bundle bundle) {
            Intrinsics.i(navDestination, "destination");
            return NavBackStackEntry.Companion.b(NavBackStackEntry.N, this.f22234h.F(), navDestination, bundle, this.f22234h.L(), this.f22234h.f22224r, (String) null, (Bundle) null, 96, (Object) null);
        }

        public void e(NavBackStackEntry navBackStackEntry) {
            NavControllerViewModel k2;
            Intrinsics.i(navBackStackEntry, "entry");
            boolean d2 = Intrinsics.d(this.f22234h.f22206B.get(navBackStackEntry), Boolean.TRUE);
            super.e(navBackStackEntry);
            this.f22234h.f22206B.remove(navBackStackEntry);
            if (!this.f22234h.f22214h.contains(navBackStackEntry)) {
                this.f22234h.x0(navBackStackEntry);
                if (navBackStackEntry.a().b().f(Lifecycle.State.CREATED)) {
                    navBackStackEntry.o(Lifecycle.State.DESTROYED);
                }
                ArrayDeque d3 = this.f22234h.f22214h;
                if (d3 == null || !d3.isEmpty()) {
                    Iterator it = d3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.d(((NavBackStackEntry) it.next()).h(), navBackStackEntry.h())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!d2 && (k2 = this.f22234h.f22224r) != null) {
                    k2.h(navBackStackEntry.h());
                }
                this.f22234h.y0();
                this.f22234h.f22217k.i(this.f22234h.n0());
            } else if (!d()) {
                this.f22234h.y0();
                this.f22234h.f22215i.i(CollectionsKt.P0(this.f22234h.f22214h));
                this.f22234h.f22217k.i(this.f22234h.n0());
            }
        }

        public void g(NavBackStackEntry navBackStackEntry, boolean z2) {
            Intrinsics.i(navBackStackEntry, "popUpTo");
            Navigator e2 = this.f22234h.f22230x.e(navBackStackEntry.g().u());
            this.f22234h.f22206B.put(navBackStackEntry, Boolean.valueOf(z2));
            if (Intrinsics.d(e2, this.f22233g)) {
                Function1 j2 = this.f22234h.f22205A;
                if (j2 != null) {
                    j2.invoke(navBackStackEntry);
                    super.g(navBackStackEntry, z2);
                    return;
                }
                this.f22234h.f0(navBackStackEntry, new NavController$NavControllerNavigatorState$pop$1(this, navBackStackEntry, z2));
                return;
            }
            Object obj = this.f22234h.f22231y.get(e2);
            Intrinsics.f(obj);
            ((NavControllerNavigatorState) obj).g(navBackStackEntry, z2);
        }

        public void h(NavBackStackEntry navBackStackEntry, boolean z2) {
            Intrinsics.i(navBackStackEntry, "popUpTo");
            super.h(navBackStackEntry, z2);
        }

        public void i(NavBackStackEntry navBackStackEntry) {
            Intrinsics.i(navBackStackEntry, "entry");
            super.i(navBackStackEntry);
            if (this.f22234h.f22214h.contains(navBackStackEntry)) {
                navBackStackEntry.o(Lifecycle.State.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        public void j(NavBackStackEntry navBackStackEntry) {
            Intrinsics.i(navBackStackEntry, "backStackEntry");
            Navigator e2 = this.f22234h.f22230x.e(navBackStackEntry.g().u());
            if (Intrinsics.d(e2, this.f22233g)) {
                Function1 c2 = this.f22234h.f22232z;
                if (c2 != null) {
                    c2.invoke(navBackStackEntry);
                    n(navBackStackEntry);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + navBackStackEntry.g() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f22234h.f22231y.get(e2);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).j(navBackStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + navBackStackEntry.g().u() + " should already be created").toString());
        }

        public final void n(NavBackStackEntry navBackStackEntry) {
            Intrinsics.i(navBackStackEntry, "backStackEntry");
            super.j(navBackStackEntry);
        }
    }

    @Metadata
    public interface OnDestinationChangedListener {
        void a(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    public NavController(Context context) {
        Object obj;
        Intrinsics.i(context, "context");
        this.f22207a = context;
        Iterator it = SequencesKt.h(context, NavController$activity$1.f22238z).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f22208b = (Activity) obj;
        this.f22214h = new ArrayDeque();
        MutableStateFlow a2 = StateFlowKt.a(CollectionsKt.m());
        this.f22215i = a2;
        this.f22216j = FlowKt.e(a2);
        MutableStateFlow a3 = StateFlowKt.a(CollectionsKt.m());
        this.f22217k = a3;
        this.f22218l = FlowKt.e(a3);
        this.f22219m = new LinkedHashMap();
        this.f22220n = new LinkedHashMap();
        this.f22221o = new LinkedHashMap();
        this.f22222p = new LinkedHashMap();
        this.f22225s = new CopyOnWriteArrayList();
        this.f22226t = Lifecycle.State.INITIALIZED;
        this.f22227u = new a(this);
        this.f22228v = new NavController$onBackPressedCallback$1(this);
        this.f22229w = true;
        this.f22230x = new NavigatorProvider();
        this.f22231y = new LinkedHashMap();
        this.f22206B = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this.f22230x;
        navigatorProvider.b(new NavGraphNavigator(navigatorProvider));
        this.f22230x.b(new ActivityNavigator(this.f22207a));
        this.D = new ArrayList();
        this.E = LazyKt.b(new NavController$navInflater$2(this));
        MutableSharedFlow b2 = SharedFlowKt.b(1, 0, BufferOverflow.DROP_OLDEST, 2, (Object) null);
        this.F = b2;
        this.G = FlowKt.d(b2);
    }

    public static final void S(NavController navController, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(navController, "this$0");
        Intrinsics.i(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.i(event, "event");
        navController.f22226t = event.f();
        if (navController.f22210d != null) {
            for (NavBackStackEntry j2 : CollectionsKt.P0(navController.f22214h)) {
                j2.j(event);
            }
        }
    }

    public static /* synthetic */ void Y(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                navOptions = null;
            }
            if ((i2 & 4) != 0) {
                extras = null;
            }
            navController.V(obj, navOptions, extras);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    public static /* synthetic */ boolean k0(NavController navController, int i2, boolean z2, boolean z3, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                z3 = false;
            }
            return navController.h0(i2, z2, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    public static /* synthetic */ void m0(NavController navController, NavBackStackEntry navBackStackEntry, boolean z2, ArrayDeque arrayDeque, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            if ((i2 & 4) != 0) {
                arrayDeque = new ArrayDeque();
            }
            navController.l0(navBackStackEntry, z2, arrayDeque);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    public static /* synthetic */ void q(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                list = CollectionsKt.m();
            }
            navController.p(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    public static /* synthetic */ NavDestination x(NavController navController, int i2, NavDestination navDestination, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                navDestination = null;
            }
            return navController.w(i2, navDestination);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
    }

    public static /* synthetic */ NavDestination z(NavController navController, NavDestination navDestination, int i2, boolean z2, NavDestination navDestination2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                navDestination2 = null;
            }
            return navController.y(navDestination, i2, z2, navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
    }

    public final String A(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this.f22210d;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i2 >= length) {
                return null;
            }
            int i3 = iArr[i2];
            if (i2 == 0) {
                NavGraph navGraph3 = this.f22210d;
                Intrinsics.f(navGraph3);
                if (navGraph3.q() == i3) {
                    navDestination = this.f22210d;
                }
            } else {
                Intrinsics.f(navGraph2);
                navDestination = navGraph2.P(i3);
            }
            if (navDestination == null) {
                return NavDestination.J.b(this.f22207a, i3);
            }
            if (i2 != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    Intrinsics.f(navGraph);
                    if (!(navGraph.P(navGraph.Y()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.P(navGraph.Y());
                }
                navGraph2 = navGraph;
            }
            i2++;
        }
    }

    public final String B(Object obj) {
        NavDestination z2 = z(this, K(), RouteSerializerKt.g(SerializersKt.b(Reflection.b(obj.getClass()))), true, (NavDestination) null, 4, (Object) null);
        if (z2 != null) {
            Map o2 = z2.o();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.e(o2.size()));
            for (Map.Entry entry : o2.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).a());
            }
            return RouteSerializerKt.k(obj, linkedHashMap);
        }
        throw new IllegalArgumentException(("Destination with route " + Reflection.b(obj.getClass()).e() + " cannot be found in navigation graph " + this.f22210d).toString());
    }

    public NavBackStackEntry C(int i2) {
        Object obj;
        ArrayDeque arrayDeque = this.f22214h;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((NavBackStackEntry) obj).g().q() == i2) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + i2 + " is on the NavController's back stack. The current destination is " + I()).toString());
    }

    public final NavBackStackEntry D(Object obj) {
        Intrinsics.i(obj, "route");
        return E(B(obj));
    }

    public final NavBackStackEntry E(String str) {
        Object obj;
        Intrinsics.i(str, "route");
        ArrayDeque arrayDeque = this.f22214h;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry.g().A(str, navBackStackEntry.e())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + str + " is on the NavController's back stack. The current destination is " + I()).toString());
    }

    public final Context F() {
        return this.f22207a;
    }

    public NavBackStackEntry G() {
        return (NavBackStackEntry) this.f22214h.q();
    }

    public final Flow H() {
        return this.G;
    }

    public NavDestination I() {
        NavBackStackEntry G2 = G();
        if (G2 != null) {
            return G2.g();
        }
        return null;
    }

    public final int J() {
        ArrayDeque<NavBackStackEntry> arrayDeque = this.f22214h;
        int i2 = 0;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            for (NavBackStackEntry g2 : arrayDeque) {
                if (!(g2.g() instanceof NavGraph) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.v();
                }
            }
        }
        return i2;
    }

    public NavGraph K() {
        NavGraph navGraph = this.f22210d;
        if (navGraph != null) {
            Intrinsics.g(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return navGraph;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final Lifecycle.State L() {
        return this.f22223q == null ? Lifecycle.State.CREATED : this.f22226t;
    }

    public NavigatorProvider M() {
        return this.f22230x;
    }

    public final NavGraph N(ArrayDeque arrayDeque) {
        NavDestination navDestination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque.q();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.g()) == null) {
            navDestination = this.f22210d;
            Intrinsics.f(navDestination);
        }
        if (navDestination instanceof NavGraph) {
            return (NavGraph) navDestination;
        }
        NavGraph v2 = navDestination.v();
        Intrinsics.f(v2);
        return v2;
    }

    public final StateFlow O() {
        return this.f22218l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(android.content.Intent r20) {
        /*
            r19 = this;
            r7 = r19
            r1 = r20
            r8 = 0
            if (r1 != 0) goto L_0x0008
            return r8
        L_0x0008:
            android.os.Bundle r2 = r20.getExtras()
            java.lang.String r3 = "NavController"
            r9 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = "android-support-nav:controller:deepLinkIds"
            int[] r0 = r2.getIntArray(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x002e
        L_0x0018:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleDeepLink() could not extract deepLink from "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r0)
        L_0x002d:
            r0 = r9
        L_0x002e:
            if (r2 == 0) goto L_0x0037
            java.lang.String r4 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r4 = r2.getParcelableArrayList(r4)
            goto L_0x0038
        L_0x0037:
            r4 = r9
        L_0x0038:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r2 == 0) goto L_0x0046
            java.lang.String r6 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r2 = r2.getBundle(r6)
            goto L_0x0047
        L_0x0046:
            r2 = r9
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r5.putAll(r2)
        L_0x004c:
            r10 = 1
            if (r0 == 0) goto L_0x0052
            int r2 = r0.length
            if (r2 != 0) goto L_0x007a
        L_0x0052:
            kotlin.collections.ArrayDeque r2 = r7.f22214h
            androidx.navigation.NavGraph r2 = r7.N(r2)
            androidx.navigation.NavDeepLinkRequest r6 = new androidx.navigation.NavDeepLinkRequest
            r6.<init>(r1)
            androidx.navigation.NavDestination$DeepLinkMatch r2 = r2.a0(r6, r10, r10, r2)
            if (r2 == 0) goto L_0x007a
            androidx.navigation.NavDestination r0 = r2.f()
            int[] r4 = androidx.navigation.NavDestination.n(r0, r9, r10, r9)
            android.os.Bundle r2 = r2.h()
            android.os.Bundle r0 = r0.i(r2)
            if (r0 == 0) goto L_0x0078
            r5.putAll(r0)
        L_0x0078:
            r0 = r4
            r4 = r9
        L_0x007a:
            if (r0 == 0) goto L_0x01f2
            int r2 = r0.length
            if (r2 != 0) goto L_0x0081
            goto L_0x01f2
        L_0x0081:
            java.lang.String r2 = r7.A(r0)
            if (r2 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Could not find destination "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = " in the navigation graph, ignoring the deep link from "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            return r8
        L_0x00a4:
            java.lang.String r2 = "android-support-nav:controller:deepLinkIntent"
            r5.putParcelable(r2, r1)
            int r2 = r0.length
            android.os.Bundle[] r11 = new android.os.Bundle[r2]
            r3 = r8
        L_0x00ad:
            if (r3 >= r2) goto L_0x00c9
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putAll(r5)
            if (r4 == 0) goto L_0x00c4
            java.lang.Object r12 = r4.get(r3)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x00c4
            r6.putAll(r12)
        L_0x00c4:
            r11[r3] = r6
            int r3 = r3 + 1
            goto L_0x00ad
        L_0x00c9:
            int r2 = r20.getFlags()
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r2
            if (r3 == 0) goto L_0x00f8
            r4 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r4
            if (r2 != 0) goto L_0x00f8
            r1.addFlags(r4)
            android.content.Context r0 = r7.f22207a
            androidx.core.app.TaskStackBuilder r0 = androidx.core.app.TaskStackBuilder.m(r0)
            androidx.core.app.TaskStackBuilder r0 = r0.g(r1)
            java.lang.String r1 = "create(context).addNextI…ntWithParentStack(intent)"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            r0.p()
            android.app.Activity r0 = r7.f22208b
            if (r0 == 0) goto L_0x00f7
            r0.finish()
            r0.overridePendingTransition(r8, r8)
        L_0x00f7:
            return r10
        L_0x00f8:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r3 == 0) goto L_0x0160
            kotlin.collections.ArrayDeque r1 = r7.f22214h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0116
            androidx.navigation.NavGraph r1 = r7.f22210d
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r2 = r1.q()
            r5 = 4
            r6 = 0
            r3 = 1
            r4 = 0
            r1 = r19
            k0(r1, r2, r3, r4, r5, r6)
        L_0x0116:
            int r1 = r0.length
            if (r8 >= r1) goto L_0x015d
            r1 = r0[r8]
            int r2 = r8 + 1
            r3 = r11[r8]
            r4 = 2
            androidx.navigation.NavDestination r4 = x(r7, r1, r9, r4, r9)
            if (r4 == 0) goto L_0x0134
            androidx.navigation.NavController$handleDeepLink$2 r1 = new androidx.navigation.NavController$handleDeepLink$2
            r1.<init>(r4, r7)
            androidx.navigation.NavOptions r1 = androidx.navigation.NavOptionsBuilderKt.a(r1)
            r7.U(r4, r3, r1, r9)
            r8 = r2
            goto L_0x0116
        L_0x0134:
            androidx.navigation.NavDestination$Companion r0 = androidx.navigation.NavDestination.J
            android.content.Context r2 = r7.f22207a
            java.lang.String r0 = r0.b(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r2.append(r0)
            androidx.navigation.NavDestination r0 = r19.I()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x015d:
            r7.f22213g = r10
            return r10
        L_0x0160:
            androidx.navigation.NavGraph r1 = r7.f22210d
            int r2 = r0.length
            r3 = r8
        L_0x0164:
            if (r3 >= r2) goto L_0x01ef
            r4 = r0[r3]
            r5 = r11[r3]
            if (r3 != 0) goto L_0x016f
            androidx.navigation.NavGraph r6 = r7.f22210d
            goto L_0x0176
        L_0x016f:
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.navigation.NavDestination r6 = r1.P(r4)
        L_0x0176:
            if (r6 == 0) goto L_0x01ca
            int r4 = r0.length
            int r4 = r4 - r10
            if (r3 == r4) goto L_0x019f
            boolean r4 = r6 instanceof androidx.navigation.NavGraph
            if (r4 == 0) goto L_0x01c7
            androidx.navigation.NavGraph r6 = (androidx.navigation.NavGraph) r6
        L_0x0182:
            kotlin.jvm.internal.Intrinsics.f(r6)
            int r1 = r6.Y()
            androidx.navigation.NavDestination r1 = r6.P(r1)
            boolean r1 = r1 instanceof androidx.navigation.NavGraph
            if (r1 == 0) goto L_0x019d
            int r1 = r6.Y()
            androidx.navigation.NavDestination r1 = r6.P(r1)
            r6 = r1
            androidx.navigation.NavGraph r6 = (androidx.navigation.NavGraph) r6
            goto L_0x0182
        L_0x019d:
            r1 = r6
            goto L_0x01c7
        L_0x019f:
            androidx.navigation.NavOptions$Builder r13 = new androidx.navigation.NavOptions$Builder
            r13.<init>()
            androidx.navigation.NavGraph r4 = r7.f22210d
            kotlin.jvm.internal.Intrinsics.f(r4)
            int r14 = r4.q()
            r17 = 4
            r18 = 0
            r15 = 1
            r16 = 0
            androidx.navigation.NavOptions$Builder r4 = androidx.navigation.NavOptions.Builder.k(r13, r14, r15, r16, r17, r18)
            androidx.navigation.NavOptions$Builder r4 = r4.b(r8)
            androidx.navigation.NavOptions$Builder r4 = r4.c(r8)
            androidx.navigation.NavOptions r4 = r4.a()
            r7.U(r6, r5, r4, r9)
        L_0x01c7:
            int r3 = r3 + 1
            goto L_0x0164
        L_0x01ca:
            androidx.navigation.NavDestination$Companion r0 = androidx.navigation.NavDestination.J
            android.content.Context r2 = r7.f22207a
            java.lang.String r0 = r0.b(r2, r4)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r0)
            java.lang.String r0 = " cannot be found in graph "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01ef:
            r7.f22213g = r10
            return r10
        L_0x01f2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.P(android.content.Intent):boolean");
    }

    public final List Q(ArrayDeque arrayDeque) {
        NavDestination navDestination;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f22214h.q();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.g()) == null) {
            navDestination = K();
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination z2 = z(this, navDestination, navBackStackEntryState.a(), true, (NavDestination) null, 4, (Object) null);
                if (z2 != null) {
                    arrayList.add(navBackStackEntryState.b(this.f22207a, z2, L(), this.f22224r));
                    navDestination = z2;
                } else {
                    String b2 = NavDestination.J.b(this.f22207a, navBackStackEntryState.a());
                    throw new IllegalStateException(("Restore State failed: destination " + b2 + " cannot be found from the current destination " + navDestination).toString());
                }
            }
        }
        return arrayList;
    }

    public final boolean R(NavDestination navDestination, Bundle bundle) {
        int i2;
        NavDestination g2;
        NavBackStackEntry G2 = G();
        ArrayDeque arrayDeque = this.f22214h;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((NavBackStackEntry) listIterator.previous()).g() == navDestination) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            return false;
        }
        if (navDestination instanceof NavGraph) {
            List D2 = SequencesKt.D(SequencesKt.z(NavGraph.P.a((NavGraph) navDestination), NavController$launchSingleTopInternal$childHierarchyId$1.f22254z));
            if (this.f22214h.size() - i2 != D2.size()) {
                return false;
            }
            ArrayDeque arrayDeque2 = this.f22214h;
            Iterable<NavBackStackEntry> subList = arrayDeque2.subList(i2, arrayDeque2.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.x(subList, 10));
            for (NavBackStackEntry g3 : subList) {
                arrayList.add(Integer.valueOf(g3.g().q()));
            }
            if (!Intrinsics.d(arrayList, D2)) {
                return false;
            }
        } else if (G2 == null || (g2 = G2.g()) == null || navDestination.q() != g2.q()) {
            return false;
        }
        ArrayDeque<NavBackStackEntry> arrayDeque3 = new ArrayDeque<>();
        while (CollectionsKt.o(this.f22214h) >= i2) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.K(this.f22214h);
            x0(navBackStackEntry);
            arrayDeque3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.g().i(bundle)));
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque3) {
            NavGraph v2 = navBackStackEntry2.g().v();
            if (v2 != null) {
                T(navBackStackEntry2, C(v2.q()));
            }
            this.f22214h.add(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : arrayDeque3) {
            this.f22230x.e(navBackStackEntry3.g().u()).g(navBackStackEntry3);
        }
        return true;
    }

    public final void T(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f22219m.put(navBackStackEntry, navBackStackEntry2);
        if (this.f22220n.get(navBackStackEntry2) == null) {
            this.f22220n.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = this.f22220n.get(navBackStackEntry2);
        Intrinsics.f(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a A[LOOP:1: B:38:0x0124->B:40:0x012a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(androidx.navigation.NavDestination r22, android.os.Bundle r23, androidx.navigation.NavOptions r24, androidx.navigation.Navigator.Extras r25) {
        /*
            r21 = this;
            r6 = r21
            r3 = r24
            java.util.Map r0 = r6.f22231y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavController$NavControllerNavigatorState r1 = (androidx.navigation.NavController.NavControllerNavigatorState) r1
            r1.l(r2)
            goto L_0x0010
        L_0x0021:
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x0098
            java.lang.String r0 = r24.f()
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r24.f()
            kotlin.jvm.internal.Intrinsics.f(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.j0(r0, r1, r4)
        L_0x0042:
            r9 = r0
            goto L_0x0099
        L_0x0044:
            kotlin.reflect.KClass r0 = r24.g()
            if (r0 == 0) goto L_0x0066
            kotlin.reflect.KClass r0 = r24.g()
            kotlin.jvm.internal.Intrinsics.f(r0)
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.SerializersKt.b(r0)
            int r0 = androidx.navigation.serialization.RouteSerializerKt.g(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.h0(r0, r1, r4)
            goto L_0x0042
        L_0x0066:
            java.lang.Object r0 = r24.h()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r24.h()
            kotlin.jvm.internal.Intrinsics.f(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.i0(r0, r1, r4)
            goto L_0x0042
        L_0x0080:
            int r0 = r24.e()
            r1 = -1
            if (r0 == r1) goto L_0x0098
            int r0 = r24.e()
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.h0(r0, r1, r4)
            goto L_0x0042
        L_0x0098:
            r9 = r8
        L_0x0099:
            android.os.Bundle r0 = r22.i(r23)
            if (r3 == 0) goto L_0x00c4
            boolean r1 = r24.l()
            if (r1 != r2) goto L_0x00c4
            java.util.Map r1 = r6.f22221o
            int r4 = r22.q()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x00c4
            int r1 = r22.q()
            r4 = r25
            boolean r0 = r6.p0(r1, r0, r3, r4)
            r7.f40901z = r0
            r20 = r8
            goto L_0x0115
        L_0x00c4:
            r4 = r25
            if (r3 == 0) goto L_0x00d7
            boolean r1 = r24.j()
            if (r1 != r2) goto L_0x00d7
            boolean r1 = r21.R(r22, r23)
            if (r1 == 0) goto L_0x00d7
            r20 = r2
            goto L_0x00d9
        L_0x00d7:
            r20 = r8
        L_0x00d9:
            if (r20 != 0) goto L_0x0115
            androidx.navigation.NavBackStackEntry$Companion r10 = androidx.navigation.NavBackStackEntry.N
            android.content.Context r11 = r6.f22207a
            androidx.lifecycle.Lifecycle$State r14 = r21.L()
            androidx.navigation.NavControllerViewModel r15 = r6.f22224r
            r18 = 96
            r19 = 0
            r16 = 0
            r17 = 0
            r12 = r22
            r13 = r0
            androidx.navigation.NavBackStackEntry r1 = androidx.navigation.NavBackStackEntry.Companion.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            androidx.navigation.NavigatorProvider r2 = r6.f22230x
            java.lang.String r5 = r22.u()
            androidx.navigation.Navigator r2 = r2.e(r5)
            java.util.List r5 = kotlin.collections.CollectionsKt.e(r1)
            androidx.navigation.NavController$navigate$5 r10 = new androidx.navigation.NavController$navigate$5
            r1 = r22
            r10.<init>(r7, r6, r1, r0)
            r0 = r21
            r1 = r2
            r2 = r5
            r3 = r24
            r4 = r25
            r5 = r10
            r0.Z(r1, r2, r3, r4, r5)
        L_0x0115:
            r21.z0()
            java.util.Map r0 = r6.f22231y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0124:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0134
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavController$NavControllerNavigatorState r1 = (androidx.navigation.NavController.NavControllerNavigatorState) r1
            r1.l(r8)
            goto L_0x0124
        L_0x0134:
            if (r9 != 0) goto L_0x0141
            boolean r0 = r7.f40901z
            if (r0 != 0) goto L_0x0141
            if (r20 == 0) goto L_0x013d
            goto L_0x0141
        L_0x013d:
            r21.y0()
            goto L_0x0144
        L_0x0141:
            r21.t()
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.U(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    public final void V(Object obj, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.i(obj, "route");
        X(B(obj), navOptions, extras);
    }

    public final void W(Object obj, Function1 function1) {
        Intrinsics.i(obj, "route");
        Intrinsics.i(function1, "builder");
        Y(this, obj, NavOptionsBuilderKt.a(function1), (Navigator.Extras) null, 4, (Object) null);
    }

    public final void X(String str, NavOptions navOptions, Navigator.Extras extras) {
        Intrinsics.i(str, "route");
        if (this.f22210d != null) {
            NavGraph N = N(this.f22214h);
            NavDestination.DeepLinkMatch b0 = N.b0(str, true, true, N);
            if (b0 != null) {
                NavDestination f2 = b0.f();
                Bundle i2 = f2.i(b0.h());
                if (i2 == null) {
                    i2 = new Bundle();
                }
                NavDestination f3 = b0.f();
                Intent intent = new Intent();
                Uri parse = Uri.parse(NavDestination.J.a(f2.w()));
                Intrinsics.e(parse, "Uri.parse(this)");
                intent.setDataAndType(parse, (String) null);
                intent.setAction((String) null);
                i2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                U(f3, i2, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.f22210d);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    public final void Z(Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1) {
        this.f22232z = function1;
        navigator.e(list, navOptions, extras);
        this.f22232z = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a0() {
        /*
            r2 = this;
            int r0 = r2.J()
            r1 = 1
            if (r0 != r1) goto L_0x002c
            android.app.Activity r0 = r2.f22208b
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0017
            android.os.Bundle r0 = r0.getExtras()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = "android-support-nav:controller:deepLinkIds"
            int[] r1 = r0.getIntArray(r1)
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            boolean r0 = r2.v0()
            return r0
        L_0x0027:
            boolean r0 = r2.w0()
            return r0
        L_0x002c:
            boolean r0 = r2.c0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.a0():boolean");
    }

    public final void b0(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f22211e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                NavigatorProvider navigatorProvider = this.f22230x;
                Intrinsics.h(next, "name");
                Navigator e2 = navigatorProvider.e(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    e2.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f22212f;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i2 = 0;
            while (i2 < length) {
                Parcelable parcelable = parcelableArr[i2];
                Intrinsics.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination x2 = x(this, navBackStackEntryState.a(), (NavDestination) null, 2, (Object) null);
                if (x2 != null) {
                    NavBackStackEntry b2 = navBackStackEntryState.b(this.f22207a, x2, L(), this.f22224r);
                    Navigator e3 = this.f22230x.e(x2.u());
                    Map map = this.f22231y;
                    Object obj = map.get(e3);
                    if (obj == null) {
                        obj = new NavControllerNavigatorState(this, e3);
                        map.put(e3, obj);
                    }
                    this.f22214h.add(b2);
                    ((NavControllerNavigatorState) obj).n(b2);
                    NavGraph v2 = b2.g().v();
                    if (v2 != null) {
                        T(b2, C(v2.q()));
                    }
                    i2++;
                } else {
                    String b3 = NavDestination.J.b(this.f22207a, navBackStackEntryState.a());
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + b3 + " cannot be found from the current destination " + I());
                }
            }
            z0();
            this.f22212f = null;
        }
        ArrayList<Navigator> arrayList = new ArrayList<>();
        for (Object next2 : this.f22230x.f().values()) {
            if (!((Navigator) next2).c()) {
                arrayList.add(next2);
            }
        }
        for (Navigator navigator : arrayList) {
            Map map2 = this.f22231y;
            Object obj2 = map2.get(navigator);
            if (obj2 == null) {
                obj2 = new NavControllerNavigatorState(this, navigator);
                map2.put(navigator, obj2);
            }
            navigator.f((NavControllerNavigatorState) obj2);
        }
        if (this.f22210d == null || !this.f22214h.isEmpty()) {
            t();
            return;
        }
        if (!this.f22213g && (activity = this.f22208b) != null) {
            Intrinsics.f(activity);
            if (P(activity.getIntent())) {
                return;
            }
        }
        NavGraph navGraph = this.f22210d;
        Intrinsics.f(navGraph);
        U(navGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
    }

    public boolean c0() {
        if (this.f22214h.isEmpty()) {
            return false;
        }
        NavDestination I2 = I();
        Intrinsics.f(I2);
        return d0(I2.q(), true);
    }

    public boolean d0(int i2, boolean z2) {
        return e0(i2, z2, false);
    }

    public boolean e0(int i2, boolean z2, boolean z3) {
        return h0(i2, z2, z3) && t();
    }

    public final void f0(NavBackStackEntry navBackStackEntry, Function0 function0) {
        Intrinsics.i(navBackStackEntry, "popUpTo");
        Intrinsics.i(function0, "onComplete");
        int indexOf = this.f22214h.indexOf(navBackStackEntry);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
            return;
        }
        int i2 = indexOf + 1;
        if (i2 != this.f22214h.size()) {
            h0(((NavBackStackEntry) this.f22214h.get(i2)).g().q(), true, false);
        }
        m0(this, navBackStackEntry, false, (ArrayDeque) null, 6, (Object) null);
        function0.invoke();
        z0();
        t();
    }

    public final void g0(Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z2, Function1 function1) {
        this.f22205A = function1;
        navigator.j(navBackStackEntry, z2);
        this.f22205A = null;
    }

    public final boolean h0(int i2, boolean z2, boolean z3) {
        NavDestination navDestination;
        if (this.f22214h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.z0(this.f22214h).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).g();
            Navigator e2 = this.f22230x.e(navDestination.u());
            if (z2 || navDestination.q() != i2) {
                arrayList.add(e2);
            }
            if (navDestination.q() == i2) {
                break;
            }
        }
        if (navDestination != null) {
            return u(arrayList, navDestination, z2, z3);
        }
        String b2 = NavDestination.J.b(this.f22207a, i2);
        Log.i("NavController", "Ignoring popBackStack to destination " + b2 + " as it was not found on the current back stack");
        return false;
    }

    public final boolean i0(Object obj, boolean z2, boolean z3) {
        return j0(B(obj), z2, z3);
    }

    public final boolean j0(String str, boolean z2, boolean z3) {
        NavDestination navDestination;
        Object obj;
        if (this.f22214h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = this.f22214h;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            navDestination = null;
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            boolean A2 = navBackStackEntry.g().A(str, navBackStackEntry.e());
            if (z2 || !A2) {
                arrayList.add(this.f22230x.e(navBackStackEntry.g().u()));
                continue;
            }
            if (A2) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            navDestination = navBackStackEntry2.g();
        }
        if (navDestination != null) {
            return u(arrayList, navDestination, z2, z3);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void l0(NavBackStackEntry navBackStackEntry, boolean z2, ArrayDeque arrayDeque) {
        NavControllerViewModel navControllerViewModel;
        StateFlow c2;
        Set set;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f22214h.last();
        if (Intrinsics.d(navBackStackEntry2, navBackStackEntry)) {
            CollectionsKt.K(this.f22214h);
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f22231y.get(M().e(navBackStackEntry2.g().u()));
            boolean z3 = true;
            if ((navControllerNavigatorState == null || (c2 = navControllerNavigatorState.c()) == null || (set = (Set) c2.getValue()) == null || !set.contains(navBackStackEntry2)) && !this.f22220n.containsKey(navBackStackEntry2)) {
                z3 = false;
            }
            Lifecycle.State b2 = navBackStackEntry2.a().b();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (b2.f(state)) {
                if (z2) {
                    navBackStackEntry2.o(state);
                    arrayDeque.addFirst(new NavBackStackEntryState(navBackStackEntry2));
                }
                if (!z3) {
                    navBackStackEntry2.o(Lifecycle.State.DESTROYED);
                    x0(navBackStackEntry2);
                } else {
                    navBackStackEntry2.o(state);
                }
            }
            if (!z2 && !z3 && (navControllerViewModel = this.f22224r) != null) {
                navControllerViewModel.h(navBackStackEntry2.h());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.g() + ", which is not the top of the back stack (" + navBackStackEntry2.g() + ')').toString());
    }

    public final List n0() {
        ArrayList arrayList = new ArrayList();
        for (NavControllerNavigatorState c2 : this.f22231y.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (Iterable) c2.c().getValue()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) next;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.i().f(Lifecycle.State.STARTED)) {
                    arrayList2.add(next);
                }
            }
            CollectionsKt.B(arrayList, arrayList2);
        }
        ArrayDeque arrayDeque = this.f22214h;
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : arrayDeque) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next2;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.i().f(Lifecycle.State.STARTED)) {
                arrayList3.add(next2);
            }
        }
        CollectionsKt.B(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((NavBackStackEntry) next3).g() instanceof NavGraph)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    public void o0(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f22207a.getClassLoader());
            this.f22211e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f22212f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f22222p.clear();
            int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    this.f22221o.put(Integer.valueOf(intArray[i2]), stringArrayList.get(i3));
                    i2++;
                    i3++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        Map map = this.f22222p;
                        Intrinsics.h(str, "id");
                        ArrayDeque arrayDeque = new ArrayDeque(parcelableArray.length);
                        Iterator a2 = ArrayIteratorKt.a(parcelableArray);
                        while (a2.hasNext()) {
                            Parcelable parcelable = (Parcelable) a2.next();
                            Intrinsics.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            arrayDeque.add((NavBackStackEntryState) parcelable);
                        }
                        map.put(str, arrayDeque);
                    }
                }
            }
            this.f22213g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: androidx.navigation.NavGraph} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(androidx.navigation.NavDestination r31, android.os.Bundle r32, androidx.navigation.NavBackStackEntry r33, java.util.List r34) {
        /*
            r30 = this;
            r6 = r30
            r7 = r31
            r15 = r34
            androidx.navigation.NavDestination r14 = r33.g()
            boolean r0 = r14 instanceof androidx.navigation.FloatingWindow
            if (r0 != 0) goto L_0x0042
        L_0x000e:
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0042
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.last()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.g()
            boolean r0 = r0 instanceof androidx.navigation.FloatingWindow
            if (r0 == 0) goto L_0x0042
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.last()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.g()
            int r1 = r0.q()
            r4 = 4
            r5 = 0
            r2 = 1
            r3 = 0
            r0 = r30
            boolean r0 = k0(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x000e
        L_0x0042:
            kotlin.collections.ArrayDeque r5 = new kotlin.collections.ArrayDeque
            r5.<init>()
            boolean r0 = r7 instanceof androidx.navigation.NavGraph
            r18 = 0
            if (r0 == 0) goto L_0x00ef
            r0 = r14
        L_0x004e:
            kotlin.jvm.internal.Intrinsics.f(r0)
            androidx.navigation.NavGraph r4 = r0.v()
            if (r4 == 0) goto L_0x00da
            int r0 = r34.size()
            java.util.ListIterator r0 = r15.listIterator(r0)
        L_0x005f:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0077
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.NavDestination r2 = r2.g()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r4)
            if (r2 == 0) goto L_0x005f
            goto L_0x0079
        L_0x0077:
            r1 = r18
        L_0x0079:
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            if (r1 != 0) goto L_0x0099
            androidx.navigation.NavBackStackEntry$Companion r8 = androidx.navigation.NavBackStackEntry.N
            android.content.Context r9 = r6.f22207a
            androidx.lifecycle.Lifecycle$State r12 = r30.L()
            androidx.navigation.NavControllerViewModel r13 = r6.f22224r
            r16 = 96
            r17 = 0
            r0 = 0
            r1 = 0
            r10 = r4
            r11 = r32
            r19 = r14
            r14 = r0
            r15 = r1
            androidx.navigation.NavBackStackEntry r1 = androidx.navigation.NavBackStackEntry.Companion.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x009b
        L_0x0099:
            r19 = r14
        L_0x009b:
            r5.addFirst(r1)
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d1
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.last()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.g()
            if (r0 != r4) goto L_0x00d1
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.last()
            r1 = r0
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r8 = 6
            r9 = 0
            r2 = 0
            r3 = 0
            r0 = r30
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r4
            r4 = r8
            r8 = r5
            r5 = r9
            m0(r0, r1, r2, r3, r4, r5)
            goto L_0x00e3
        L_0x00d1:
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r4
            r8 = r5
            goto L_0x00e3
        L_0x00da:
            r10 = r32
            r11 = r33
            r13 = r4
            r8 = r5
            r19 = r14
            r12 = r15
        L_0x00e3:
            if (r13 == 0) goto L_0x00f7
            if (r13 != r7) goto L_0x00e8
            goto L_0x00f7
        L_0x00e8:
            r5 = r8
            r15 = r12
            r0 = r13
            r14 = r19
            goto L_0x004e
        L_0x00ef:
            r10 = r32
            r11 = r33
            r8 = r5
            r19 = r14
            r12 = r15
        L_0x00f7:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0100
            r14 = r19
            goto L_0x010a
        L_0x0100:
            java.lang.Object r0 = r8.first()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r14 = r0.g()
        L_0x010a:
            if (r14 == 0) goto L_0x0173
            int r0 = r14.q()
            androidx.navigation.NavDestination r0 = r6.w(r0, r14)
            if (r0 == r14) goto L_0x0173
            androidx.navigation.NavGraph r14 = r14.v()
            if (r14 == 0) goto L_0x010a
            if (r10 == 0) goto L_0x0128
            boolean r0 = r32.isEmpty()
            r1 = 1
            if (r0 != r1) goto L_0x0128
            r0 = r18
            goto L_0x0129
        L_0x0128:
            r0 = r10
        L_0x0129:
            int r1 = r34.size()
            java.util.ListIterator r1 = r12.listIterator(r1)
        L_0x0131:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L_0x0149
            java.lang.Object r2 = r1.previous()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            androidx.navigation.NavDestination r3 = r3.g()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r14)
            if (r3 == 0) goto L_0x0131
            goto L_0x014b
        L_0x0149:
            r2 = r18
        L_0x014b:
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            if (r2 != 0) goto L_0x016f
            androidx.navigation.NavBackStackEntry$Companion r20 = androidx.navigation.NavBackStackEntry.N
            android.content.Context r1 = r6.f22207a
            android.os.Bundle r23 = r14.i(r0)
            androidx.lifecycle.Lifecycle$State r24 = r30.L()
            androidx.navigation.NavControllerViewModel r0 = r6.f22224r
            r28 = 96
            r29 = 0
            r26 = 0
            r27 = 0
            r21 = r1
            r22 = r14
            r25 = r0
            androidx.navigation.NavBackStackEntry r2 = androidx.navigation.NavBackStackEntry.Companion.b(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x016f:
            r8.addFirst(r2)
            goto L_0x010a
        L_0x0173:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x017c
            r14 = r19
            goto L_0x0186
        L_0x017c:
            java.lang.Object r0 = r8.first()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r14 = r0.g()
        L_0x0186:
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01d2
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.last()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.g()
            boolean r0 = r0 instanceof androidx.navigation.NavGraph
            if (r0 == 0) goto L_0x01d2
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.last()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.g()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.NavGraph"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            androidx.navigation.NavGraph r0 = (androidx.navigation.NavGraph) r0
            androidx.collection.SparseArrayCompat r0 = r0.V()
            int r1 = r14.q()
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto L_0x01d2
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.last()
            r1 = r0
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r30
            m0(r0, r1, r2, r3, r4, r5)
            goto L_0x0186
        L_0x01d2:
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            java.lang.Object r0 = r0.o()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            if (r0 != 0) goto L_0x01e2
            java.lang.Object r0 = r8.o()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
        L_0x01e2:
            if (r0 == 0) goto L_0x01e9
            androidx.navigation.NavDestination r0 = r0.g()
            goto L_0x01eb
        L_0x01e9:
            r0 = r18
        L_0x01eb:
            androidx.navigation.NavGraph r1 = r6.f22210d
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 != 0) goto L_0x024c
            int r0 = r34.size()
            java.util.ListIterator r0 = r12.listIterator(r0)
        L_0x01fb:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0219
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.NavDestination r2 = r2.g()
            androidx.navigation.NavGraph r3 = r6.f22210d
            kotlin.jvm.internal.Intrinsics.f(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 == 0) goto L_0x01fb
            r18 = r1
        L_0x0219:
            androidx.navigation.NavBackStackEntry r18 = (androidx.navigation.NavBackStackEntry) r18
            if (r18 != 0) goto L_0x0247
            androidx.navigation.NavBackStackEntry$Companion r19 = androidx.navigation.NavBackStackEntry.N
            android.content.Context r0 = r6.f22207a
            androidx.navigation.NavGraph r1 = r6.f22210d
            kotlin.jvm.internal.Intrinsics.f(r1)
            androidx.navigation.NavGraph r2 = r6.f22210d
            kotlin.jvm.internal.Intrinsics.f(r2)
            android.os.Bundle r22 = r2.i(r10)
            androidx.lifecycle.Lifecycle$State r23 = r30.L()
            androidx.navigation.NavControllerViewModel r2 = r6.f22224r
            r27 = 96
            r28 = 0
            r25 = 0
            r26 = 0
            r20 = r0
            r21 = r1
            r24 = r2
            androidx.navigation.NavBackStackEntry r18 = androidx.navigation.NavBackStackEntry.Companion.b(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0247:
            r0 = r18
            r8.addFirst(r0)
        L_0x024c:
            java.util.Iterator r0 = r8.iterator()
        L_0x0250:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x029c
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavigatorProvider r2 = r6.f22230x
            androidx.navigation.NavDestination r3 = r1.g()
            java.lang.String r3 = r3.u()
            androidx.navigation.Navigator r2 = r2.e(r3)
            java.util.Map r3 = r6.f22231y
            java.lang.Object r2 = r3.get(r2)
            if (r2 == 0) goto L_0x0278
            androidx.navigation.NavController$NavControllerNavigatorState r2 = (androidx.navigation.NavController.NavControllerNavigatorState) r2
            r2.n(r1)
            goto L_0x0250
        L_0x0278:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NavigatorBackStack for "
            r0.append(r1)
            java.lang.String r1 = r31.u()
            r0.append(r1)
            java.lang.String r1 = " should already be created"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x029c:
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            r0.addAll(r8)
            kotlin.collections.ArrayDeque r0 = r6.f22214h
            r0.add(r11)
            java.util.List r0 = kotlin.collections.CollectionsKt.y0(r8, r11)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02b0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02d2
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r2 = r1.g()
            androidx.navigation.NavGraph r2 = r2.v()
            if (r2 == 0) goto L_0x02b0
            int r2 = r2.q()
            androidx.navigation.NavBackStackEntry r2 = r6.C(r2)
            r6.T(r1, r2)
            goto L_0x02b0
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.p(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavBackStackEntry, java.util.List):void");
    }

    public final boolean p0(int i2, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        if (!this.f22221o.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        String str = (String) this.f22221o.get(Integer.valueOf(i2));
        CollectionsKt.G(this.f22221o.values(), new NavController$restoreStateInternal$1(str));
        return v(Q((ArrayDeque) TypeIntrinsics.d(this.f22222p).remove(str)), bundle, navOptions, extras);
    }

    public Bundle q0() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f22230x.f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle i2 = ((Navigator) entry.getValue()).i();
            if (i2 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i2);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f22214h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f22214h.size()];
            Iterator it = this.f22214h.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                parcelableArr[i3] = new NavBackStackEntryState((NavBackStackEntry) it.next());
                i3++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f22221o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f22221o.size()];
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            for (Map.Entry entry2 : this.f22221o.entrySet()) {
                iArr[i4] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i4++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f22222p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : this.f22222p.entrySet()) {
                String str2 = (String) entry3.getKey();
                ArrayDeque arrayDeque = (ArrayDeque) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[arrayDeque.size()];
                int i5 = 0;
                for (Object next : arrayDeque) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.w();
                    }
                    parcelableArr2[i5] = (NavBackStackEntryState) next;
                    i5 = i6;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f22213g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f22213g);
        }
        return bundle;
    }

    public final boolean r(int i2) {
        for (NavControllerNavigatorState l2 : this.f22231y.values()) {
            l2.l(true);
        }
        boolean p0 = p0(i2, (Bundle) null, NavOptionsBuilderKt.a(NavController$clearBackStackInternal$restored$1.f22239z), (Navigator.Extras) null);
        for (NavControllerNavigatorState l3 : this.f22231y.values()) {
            l3.l(false);
        }
        return p0 && h0(i2, true, false);
    }

    public void r0(NavGraph navGraph) {
        Intrinsics.i(navGraph, "graph");
        s0(navGraph, (Bundle) null);
    }

    public NavDeepLinkBuilder s() {
        return new NavDeepLinkBuilder(this);
    }

    public void s0(NavGraph navGraph, Bundle bundle) {
        Intrinsics.i(navGraph, "graph");
        if (!this.f22214h.isEmpty() && L() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        } else if (!Intrinsics.d(this.f22210d, navGraph)) {
            NavGraph navGraph2 = this.f22210d;
            if (navGraph2 != null) {
                for (Integer num : new ArrayList(this.f22221o.keySet())) {
                    Intrinsics.h(num, "id");
                    r(num.intValue());
                }
                k0(this, navGraph2.q(), true, false, 4, (Object) null);
            }
            this.f22210d = navGraph;
            b0(bundle);
        } else {
            int o2 = navGraph.V().o();
            for (int i2 = 0; i2 < o2; i2++) {
                NavGraph navGraph3 = this.f22210d;
                Intrinsics.f(navGraph3);
                int j2 = navGraph3.V().j(i2);
                NavGraph navGraph4 = this.f22210d;
                Intrinsics.f(navGraph4);
                navGraph4.V().n(j2, (NavDestination) navGraph.V().p(i2));
            }
            for (NavBackStackEntry navBackStackEntry : this.f22214h) {
                NavDestination navDestination = this.f22210d;
                Intrinsics.f(navDestination);
                for (NavDestination navDestination2 : CollectionsKt.Q(SequencesKt.D(NavDestination.J.c(navBackStackEntry.g())))) {
                    if ((!Intrinsics.d(navDestination2, this.f22210d) || !Intrinsics.d(navDestination, navGraph)) && (navDestination instanceof NavGraph)) {
                        navDestination = ((NavGraph) navDestination).P(navDestination2.q());
                        Intrinsics.f(navDestination);
                    }
                }
                navBackStackEntry.l(navDestination);
            }
        }
    }

    public final boolean t() {
        while (!this.f22214h.isEmpty() && (((NavBackStackEntry) this.f22214h.last()).g() instanceof NavGraph)) {
            m0(this, (NavBackStackEntry) this.f22214h.last(), false, (ArrayDeque) null, 6, (Object) null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f22214h.q();
        if (navBackStackEntry != null) {
            this.D.add(navBackStackEntry);
        }
        this.C++;
        y0();
        int i2 = this.C - 1;
        this.C = i2;
        if (i2 == 0) {
            List<NavBackStackEntry> P0 = CollectionsKt.P0(this.D);
            this.D.clear();
            for (NavBackStackEntry navBackStackEntry2 : P0) {
                Iterator it = this.f22225s.iterator();
                while (it.hasNext()) {
                    ((OnDestinationChangedListener) it.next()).a(this, navBackStackEntry2.g(), navBackStackEntry2.e());
                }
                this.F.i(navBackStackEntry2);
            }
            this.f22215i.i(CollectionsKt.P0(this.f22214h));
            this.f22217k.i(n0());
        }
        return navBackStackEntry != null;
    }

    public void t0(LifecycleOwner lifecycleOwner) {
        Lifecycle a2;
        Intrinsics.i(lifecycleOwner, "owner");
        if (!Intrinsics.d(lifecycleOwner, this.f22223q)) {
            LifecycleOwner lifecycleOwner2 = this.f22223q;
            if (!(lifecycleOwner2 == null || (a2 = lifecycleOwner2.a()) == null)) {
                a2.d(this.f22227u);
            }
            this.f22223q = lifecycleOwner;
            lifecycleOwner.a().a(this.f22227u);
        }
    }

    public final boolean u(List list, NavDestination navDestination, boolean z2, boolean z3) {
        boolean z4 = z3;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            g0((Navigator) it.next(), (NavBackStackEntry) this.f22214h.last(), z4, new NavController$executePopOperations$1(booleanRef2, booleanRef, this, z3, arrayDeque));
            if (!booleanRef2.f40901z) {
                break;
            }
        }
        if (z4) {
            if (!z2) {
                for (NavDestination q2 : SequencesKt.B(SequencesKt.h(navDestination, NavController$executePopOperations$2.f22243z), new NavController$executePopOperations$3(this))) {
                    Map map = this.f22221o;
                    Integer valueOf = Integer.valueOf(q2.q());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) arrayDeque.o();
                    map.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.m() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) arrayDeque.first();
                for (NavDestination q3 : SequencesKt.B(SequencesKt.h(x(this, navBackStackEntryState2.a(), (NavDestination) null, 2, (Object) null), NavController$executePopOperations$5.f22245z), new NavController$executePopOperations$6(this))) {
                    this.f22221o.put(Integer.valueOf(q3.q()), navBackStackEntryState2.m());
                }
                if (this.f22221o.values().contains(navBackStackEntryState2.m())) {
                    this.f22222p.put(navBackStackEntryState2.m(), arrayDeque);
                }
            }
        }
        z0();
        return booleanRef.f40901z;
    }

    public void u0(ViewModelStore viewModelStore) {
        Intrinsics.i(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.f22224r;
        NavControllerViewModel.Companion companion = NavControllerViewModel.f22264c;
        if (!Intrinsics.d(navControllerViewModel, companion.a(viewModelStore))) {
            if (this.f22214h.isEmpty()) {
                this.f22224r = companion.a(viewModelStore);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r4 = (r4 = (androidx.navigation.NavBackStackEntry) kotlin.collections.CollectionsKt.p0(r3)).g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(java.util.List r12, android.os.Bundle r13, androidx.navigation.NavOptions r14, androidx.navigation.Navigator.Extras r15) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r1.next()
            r4 = r3
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.g()
            boolean r4 = r4 instanceof androidx.navigation.NavGraph
            if (r4 != 0) goto L_0x0011
            r2.add(r3)
            goto L_0x0011
        L_0x002a:
            java.util.Iterator r1 = r2.iterator()
        L_0x002e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r1.next()
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            java.lang.Object r3 = kotlin.collections.CollectionsKt.q0(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0055
            java.lang.Object r4 = kotlin.collections.CollectionsKt.p0(r3)
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            if (r4 == 0) goto L_0x0055
            androidx.navigation.NavDestination r4 = r4.g()
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = r4.u()
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            androidx.navigation.NavDestination r5 = r2.g()
            java.lang.String r5 = r5.u()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            if (r4 == 0) goto L_0x006a
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r2)
            goto L_0x002e
        L_0x006a:
            androidx.navigation.NavBackStackEntry[] r2 = new androidx.navigation.NavBackStackEntry[]{r2}
            java.util.List r2 = kotlin.collections.CollectionsKt.s(r2)
            r0.add(r2)
            goto L_0x002e
        L_0x0076:
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x007f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            androidx.navigation.NavigatorProvider r3 = r11.f22230x
            java.lang.Object r4 = kotlin.collections.CollectionsKt.e0(r2)
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.g()
            java.lang.String r4 = r4.u()
            androidx.navigation.Navigator r9 = r3.e(r4)
            kotlin.jvm.internal.Ref$IntRef r6 = new kotlin.jvm.internal.Ref$IntRef
            r6.<init>()
            androidx.navigation.NavController$executeRestoreState$3 r10 = new androidx.navigation.NavController$executeRestoreState$3
            r3 = r10
            r4 = r1
            r5 = r12
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r11
            r4 = r9
            r5 = r2
            r6 = r14
            r7 = r15
            r8 = r10
            r3.Z(r4, r5, r6, r7, r8)
            goto L_0x007f
        L_0x00b8:
            boolean r12 = r1.f40901z
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.v(java.util.List, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):boolean");
    }

    public final boolean v0() {
        int i2 = 0;
        if (!this.f22213g) {
            return false;
        }
        Activity activity = this.f22208b;
        Intrinsics.f(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.f(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        Intrinsics.f(intArray);
        List e1 = ArraysKt.e1(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        if (e1.size() < 2) {
            return false;
        }
        int intValue = ((Number) CollectionsKt.K(e1)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle = (Bundle) CollectionsKt.K(parcelableArrayList);
        }
        NavDestination z2 = z(this, K(), intValue, false, (NavDestination) null, 4, (Object) null);
        if (z2 instanceof NavGraph) {
            intValue = NavGraph.P.b((NavGraph) z2).q();
        }
        NavDestination I2 = I();
        if (I2 == null || intValue != I2.q()) {
            return false;
        }
        NavDeepLinkBuilder s2 = s();
        Bundle a2 = BundleKt.a(TuplesKt.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle2 != null) {
            a2.putAll(bundle2);
        }
        s2.e(a2);
        for (Object next : e1) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.w();
            }
            s2.a(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i2) : null);
            i2 = i3;
        }
        s2.b().p();
        Activity activity2 = this.f22208b;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    public final NavDestination w(int i2, NavDestination navDestination) {
        NavDestination navDestination2;
        NavGraph navGraph = this.f22210d;
        if (navGraph == null) {
            return null;
        }
        Intrinsics.f(navGraph);
        if (navGraph.q() == i2) {
            if (navDestination == null) {
                return this.f22210d;
            }
            if (Intrinsics.d(this.f22210d, navDestination) && navDestination.v() == null) {
                return this.f22210d;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f22214h.q();
        if (navBackStackEntry == null || (navDestination2 = navBackStackEntry.g()) == null) {
            navDestination2 = this.f22210d;
            Intrinsics.f(navDestination2);
        }
        return y(navDestination2, i2, false, navDestination);
    }

    public final boolean w0() {
        NavDestination I2 = I();
        Intrinsics.f(I2);
        int q2 = I2.q();
        for (NavGraph v2 = I2.v(); v2 != null; v2 = v2.v()) {
            if (v2.Y() != q2) {
                Bundle bundle = new Bundle();
                Activity activity = this.f22208b;
                if (activity != null) {
                    Intrinsics.f(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f22208b;
                        Intrinsics.f(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f22208b;
                            Intrinsics.f(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            NavGraph N = N(this.f22214h);
                            Activity activity4 = this.f22208b;
                            Intrinsics.f(activity4);
                            Intent intent = activity4.getIntent();
                            Intrinsics.h(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch a0 = N.a0(new NavDeepLinkRequest(intent), true, true, N);
                            if ((a0 != null ? a0.h() : null) != null) {
                                bundle.putAll(a0.f().i(a0.h()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.g(new NavDeepLinkBuilder(this), v2.q(), (Bundle) null, 2, (Object) null).e(bundle).b().p();
                Activity activity5 = this.f22208b;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            q2 = v2.q();
        }
        return false;
    }

    public final NavBackStackEntry x0(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "child");
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f22219m.remove(navBackStackEntry);
        Integer num = null;
        if (navBackStackEntry2 == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f22220n.get(navBackStackEntry2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f22231y.get(this.f22230x.e(navBackStackEntry2.g().u()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.e(navBackStackEntry2);
            }
            this.f22220n.remove(navBackStackEntry2);
        }
        return navBackStackEntry2;
    }

    public final NavDestination y(NavDestination navDestination, int i2, boolean z2, NavDestination navDestination2) {
        NavGraph navGraph;
        Intrinsics.i(navDestination, "<this>");
        if (navDestination.q() == i2 && (navDestination2 == null || (Intrinsics.d(navDestination, navDestination2) && Intrinsics.d(navDestination.v(), navDestination2.v())))) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            navGraph = navDestination.v();
            Intrinsics.f(navGraph);
        }
        return navGraph.S(i2, navGraph, z2, navDestination2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        r6 = (java.util.Set) (r6 = r6.c()).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y0() {
        /*
            r10 = this;
            kotlin.collections.ArrayDeque r0 = r10.f22214h
            java.util.List r0 = kotlin.collections.CollectionsKt.P0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r1 = kotlin.collections.CollectionsKt.p0(r0)
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            androidx.navigation.NavDestination r1 = r1.g()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1 instanceof androidx.navigation.FloatingWindow
            if (r3 == 0) goto L_0x0046
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.z0(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r3.next()
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.g()
            r2.add(r4)
            boolean r5 = r4 instanceof androidx.navigation.FloatingWindow
            if (r5 != 0) goto L_0x002b
            boolean r4 = r4 instanceof androidx.navigation.NavGraph
            if (r4 != 0) goto L_0x002b
        L_0x0046:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = kotlin.collections.CollectionsKt.z0(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0056:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r4.next()
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            androidx.lifecycle.Lifecycle$State r6 = r5.i()
            androidx.navigation.NavDestination r7 = r5.g()
            if (r1 == 0) goto L_0x00e9
            int r8 = r7.q()
            int r9 = r1.q()
            if (r8 != r9) goto L_0x00e9
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 == r8) goto L_0x00ce
            androidx.navigation.NavigatorProvider r6 = r10.M()
            androidx.navigation.NavDestination r9 = r5.g()
            java.lang.String r9 = r9.u()
            androidx.navigation.Navigator r6 = r6.e(r9)
            java.util.Map r9 = r10.f22231y
            java.lang.Object r6 = r9.get(r6)
            androidx.navigation.NavController$NavControllerNavigatorState r6 = (androidx.navigation.NavController.NavControllerNavigatorState) r6
            if (r6 == 0) goto L_0x00ab
            kotlinx.coroutines.flow.StateFlow r6 = r6.c()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r6.getValue()
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L_0x00ab
            boolean r6 = r6.contains(r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r9)
            if (r6 != 0) goto L_0x00c9
            java.util.Map r6 = r10.f22220n
            java.lang.Object r6 = r6.get(r5)
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            if (r6 == 0) goto L_0x00c5
            int r6 = r6.get()
            if (r6 != 0) goto L_0x00c5
            goto L_0x00c9
        L_0x00c5:
            r3.put(r5, r8)
            goto L_0x00ce
        L_0x00c9:
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r3.put(r5, r6)
        L_0x00ce:
            java.lang.Object r5 = kotlin.collections.CollectionsKt.g0(r2)
            androidx.navigation.NavDestination r5 = (androidx.navigation.NavDestination) r5
            if (r5 == 0) goto L_0x00e3
            int r5 = r5.q()
            int r6 = r7.q()
            if (r5 != r6) goto L_0x00e3
            kotlin.collections.CollectionsKt.I(r2)
        L_0x00e3:
            androidx.navigation.NavGraph r1 = r1.v()
            goto L_0x0056
        L_0x00e9:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L_0x0127
            int r7 = r7.q()
            java.lang.Object r8 = kotlin.collections.CollectionsKt.e0(r2)
            androidx.navigation.NavDestination r8 = (androidx.navigation.NavDestination) r8
            int r8 = r8.q()
            if (r7 != r8) goto L_0x0127
            java.lang.Object r7 = kotlin.collections.CollectionsKt.I(r2)
            androidx.navigation.NavDestination r7 = (androidx.navigation.NavDestination) r7
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 != r8) goto L_0x010f
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.o(r6)
            goto L_0x0116
        L_0x010f:
            androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r6 == r8) goto L_0x0116
            r3.put(r5, r8)
        L_0x0116:
            androidx.navigation.NavGraph r5 = r7.v()
            if (r5 == 0) goto L_0x0056
            boolean r6 = r2.contains(r5)
            if (r6 != 0) goto L_0x0056
            r2.add(r5)
            goto L_0x0056
        L_0x0127:
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED
            r5.o(r6)
            goto L_0x0056
        L_0x012e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0132:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x014e
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            java.lang.Object r2 = r3.get(r1)
            androidx.lifecycle.Lifecycle$State r2 = (androidx.lifecycle.Lifecycle.State) r2
            if (r2 == 0) goto L_0x014a
            r1.o(r2)
            goto L_0x0132
        L_0x014a:
            r1.p()
            goto L_0x0132
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.y0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (J() > 1) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z0() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.f22228v
            boolean r1 = r3.f22229w
            if (r1 == 0) goto L_0x000e
            int r1 = r3.J()
            r2 = 1
            if (r1 <= r2) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.z0():void");
    }
}
