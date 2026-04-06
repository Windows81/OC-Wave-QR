package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata
public final class NavDeepLinkBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22307a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f22308b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f22309c;

    /* renamed from: d  reason: collision with root package name */
    public NavGraph f22310d;

    /* renamed from: e  reason: collision with root package name */
    public final List f22311e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f22312f;

    @Metadata
    public static final class DeepLinkDestination {

        /* renamed from: a  reason: collision with root package name */
        public final int f22313a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f22314b;

        public DeepLinkDestination(int i2, Bundle bundle) {
            this.f22313a = i2;
            this.f22314b = bundle;
        }

        public final Bundle a() {
            return this.f22314b;
        }

        public final int b() {
            return this.f22313a;
        }
    }

    @Metadata
    public static final class PermissiveNavigatorProvider extends NavigatorProvider {

        /* renamed from: d  reason: collision with root package name */
        public final Navigator f22315d;

        public Navigator e(String str) {
            Intrinsics.i(str, "name");
            try {
                return super.e(str);
            } catch (IllegalStateException unused) {
                Navigator navigator = this.f22315d;
                Intrinsics.g(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(Context context) {
        Intent intent;
        Intrinsics.i(context, "context");
        this.f22307a = context;
        Activity activity = (Activity) SequencesKt.u(SequencesKt.A(SequencesKt.h(context, NavDeepLinkBuilder$activity$1.f22316z), NavDeepLinkBuilder$activity$2.f22317z));
        this.f22308b = activity;
        if (activity != null) {
            intent = new Intent(context, activity.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f22309c = intent;
        this.f22311e = new ArrayList();
    }

    public static /* synthetic */ NavDeepLinkBuilder g(NavDeepLinkBuilder navDeepLinkBuilder, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.f(i2, bundle);
    }

    public final NavDeepLinkBuilder a(int i2, Bundle bundle) {
        this.f22311e.add(new DeepLinkDestination(i2, bundle));
        if (this.f22310d != null) {
            h();
        }
        return this;
    }

    public final TaskStackBuilder b() {
        if (this.f22310d == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else if (!this.f22311e.isEmpty()) {
            c();
            TaskStackBuilder g2 = TaskStackBuilder.m(this.f22307a).g(new Intent(this.f22309c));
            Intrinsics.h(g2, "create(context).addNextI…rentStack(Intent(intent))");
            int o2 = g2.o();
            for (int i2 = 0; i2 < o2; i2++) {
                Intent n2 = g2.n(i2);
                if (n2 != null) {
                    n2.putExtra("android-support-nav:controller:deepLinkIntent", this.f22309c);
                }
            }
            return g2;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        NavDestination navDestination = null;
        for (DeepLinkDestination deepLinkDestination : this.f22311e) {
            int b2 = deepLinkDestination.b();
            Bundle a2 = deepLinkDestination.a();
            NavDestination d2 = d(b2);
            if (d2 != null) {
                for (int valueOf : d2.m(navDestination)) {
                    arrayList.add(Integer.valueOf(valueOf));
                    arrayList2.add(a2);
                }
                navDestination = d2;
            } else {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.J.b(this.f22307a, b2) + " cannot be found in the navigation graph " + this.f22310d);
            }
        }
        this.f22309c.putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt.L0(arrayList));
        this.f22309c.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    public final NavDestination d(int i2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavGraph navGraph = this.f22310d;
        Intrinsics.f(navGraph);
        arrayDeque.add(navGraph);
        while (!arrayDeque.isEmpty()) {
            NavDestination navDestination = (NavDestination) arrayDeque.removeFirst();
            if (navDestination.q() == i2) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    arrayDeque.add((NavDestination) it.next());
                }
            }
        }
        return null;
    }

    public final NavDeepLinkBuilder e(Bundle bundle) {
        this.f22312f = bundle;
        this.f22309c.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final NavDeepLinkBuilder f(int i2, Bundle bundle) {
        this.f22311e.clear();
        this.f22311e.add(new DeepLinkDestination(i2, bundle));
        if (this.f22310d != null) {
            h();
        }
        return this;
    }

    public final void h() {
        for (DeepLinkDestination b2 : this.f22311e) {
            int b3 = b2.b();
            if (d(b3) == null) {
                String b4 = NavDestination.J.b(this.f22307a, b3);
                throw new IllegalArgumentException("Navigation destination " + b4 + " cannot be found in the navigation graph " + this.f22310d);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(NavController navController) {
        this(navController.F());
        Intrinsics.i(navController, "navController");
        this.f22310d = navController.K();
    }
}
