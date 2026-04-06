package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager implements FragmentResultOwner {
    public static boolean S = false;

    /* renamed from: A  reason: collision with root package name */
    public FragmentFactory f21608A = new FragmentFactory() {
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.A0().e(FragmentManager.this.A0().l(), str, (Bundle) null);
        }
    };

    /* renamed from: B  reason: collision with root package name */
    public SpecialEffectsControllerFactory f21609B = null;
    public SpecialEffectsControllerFactory C = new SpecialEffectsControllerFactory() {
        public SpecialEffectsController a(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    };
    public ActivityResultLauncher D;
    public ActivityResultLauncher E;
    public ActivityResultLauncher F;
    public ArrayDeque G = new ArrayDeque();
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public FragmentManagerViewModel P;
    public FragmentStrictMode.Policy Q;
    public Runnable R = new Runnable() {
        public void run() {
            FragmentManager.this.d0(true);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f21610a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f21611b;

    /* renamed from: c  reason: collision with root package name */
    public final FragmentStore f21612c = new FragmentStore();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f21613d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f21614e;

    /* renamed from: f  reason: collision with root package name */
    public final FragmentLayoutInflaterFactory f21615f = new FragmentLayoutInflaterFactory(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f21616g;

    /* renamed from: h  reason: collision with root package name */
    public final OnBackPressedCallback f21617h = new OnBackPressedCallback(false) {
        public void d() {
            FragmentManager.this.J0();
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f21618i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map f21619j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map f21620k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map f21621l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f21622m;

    /* renamed from: n  reason: collision with root package name */
    public final FragmentLifecycleCallbacksDispatcher f21623n = new FragmentLifecycleCallbacksDispatcher(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList f21624o = new CopyOnWriteArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final Consumer f21625p = new e(this);

    /* renamed from: q  reason: collision with root package name */
    public final Consumer f21626q = new f(this);

    /* renamed from: r  reason: collision with root package name */
    public final Consumer f21627r = new g(this);

    /* renamed from: s  reason: collision with root package name */
    public final Consumer f21628s = new h(this);

    /* renamed from: t  reason: collision with root package name */
    public final MenuProvider f21629t = new MenuProvider() {
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.M(menuItem);
        }

        public void b(Menu menu) {
            FragmentManager.this.N(menu);
        }

        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.F(menu, menuInflater);
        }

        public void d(Menu menu) {
            FragmentManager.this.R(menu);
        }
    };

    /* renamed from: u  reason: collision with root package name */
    public int f21630u = -1;

    /* renamed from: v  reason: collision with root package name */
    public FragmentHostCallback f21631v;

    /* renamed from: w  reason: collision with root package name */
    public FragmentContainer f21632w;

    /* renamed from: x  reason: collision with root package name */
    public Fragment f21633x;

    /* renamed from: y  reason: collision with root package name */
    public Fragment f21634y;

    /* renamed from: z  reason: collision with root package name */
    public FragmentFactory f21635z = null;

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    class AnonymousClass6 implements LifecycleEventObserver {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ FragmentResultListener f21642A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Lifecycle f21643B;
        public final /* synthetic */ FragmentManager C;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f21644z;

        public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Bundle bundle;
            if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) this.C.f21620k.get(this.f21644z)) != null) {
                this.f21642A.a(this.f21644z, bundle);
                this.C.v(this.f21644z);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f21643B.d(this);
                this.C.f21621l.remove(this.f21644z);
            }
        }
    }

    public interface BackStackEntry {
    }

    public class ClearBackStackState implements OpGenerator {

        /* renamed from: a  reason: collision with root package name */
        public final String f21649a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FragmentManager f21650b;

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return this.f21650b.t(arrayList, arrayList2, this.f21649a);
        }
    }

    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        /* renamed from: d */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a2 = intentSenderRequest.a();
            if (!(a2 == null || (bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.Builder(intentSenderRequest.d()).b((Intent) null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public ActivityResult c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void d(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void k(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void l(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    public static class LifecycleAwareResultListener implements FragmentResultListener {

        /* renamed from: a  reason: collision with root package name */
        public final FragmentResultListener f21653a;

        public void a(String str, Bundle bundle) {
            this.f21653a.a(str, bundle);
        }
    }

    public interface OnBackStackChangedListener {
        void a();
    }

    public interface OpGenerator {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class PopBackStackState implements OpGenerator {

        /* renamed from: a  reason: collision with root package name */
        public final String f21654a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21655b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21656c;

        public PopBackStackState(String str, int i2, int i3) {
            this.f21654a = str;
            this.f21655b = i2;
            this.f21656c = i3;
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f21634y;
            if (fragment != null && this.f21655b < 0 && this.f21654a == null && fragment.t().f1()) {
                return false;
            }
            return FragmentManager.this.i1(arrayList, arrayList2, this.f21654a, this.f21655b, this.f21656c);
        }
    }

    public class RestoreBackStackState implements OpGenerator {

        /* renamed from: a  reason: collision with root package name */
        public final String f21658a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FragmentManager f21659b;

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return this.f21659b.p1(arrayList, arrayList2, this.f21658a);
        }
    }

    public class SaveBackStackState implements OpGenerator {

        /* renamed from: a  reason: collision with root package name */
        public final String f21660a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FragmentManager f21661b;

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return this.f21661b.t1(arrayList, arrayList2, this.f21660a);
        }
    }

    public static Fragment H0(View view) {
        Object tag = view.getTag(R.id.f21478a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean N0(int i2) {
        return S || Log.isLoggable("FragmentManager", i2);
    }

    public static void f0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        while (i2 < i3) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                backStackRecord.s(-1);
                backStackRecord.y();
            } else {
                backStackRecord.s(1);
                backStackRecord.x();
            }
            i2++;
        }
    }

    public static FragmentManager n0(View view) {
        FragmentActivity fragmentActivity;
        Fragment o0 = o0(view);
        if (o0 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    fragmentActivity = null;
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                return fragmentActivity.f0();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (o0.h0()) {
            return o0.t();
        } else {
            throw new IllegalStateException("The Fragment " + o0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    public static Fragment o0(View view) {
        while (view != null) {
            Fragment H0 = H0(view);
            if (H0 != null) {
                return H0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static int r1(int i2) {
        int i3 = 4097;
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 8194) {
            i3 = 8197;
            if (i2 == 8197) {
                return 4100;
            }
            if (i2 == 4099) {
                return 4099;
            }
            if (i2 != 4100) {
                return 0;
            }
        }
        return i3;
    }

    public void A() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        V(4);
    }

    public FragmentHostCallback A0() {
        return this.f21631v;
    }

    public void A1(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.Z) {
            fragment.Z = false;
            fragment.m0 = !fragment.m0;
        }
    }

    public void B() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        V(0);
    }

    public LayoutInflater.Factory2 B0() {
        return this.f21615f;
    }

    public final void B1() {
        for (FragmentStateManager d1 : this.f21612c.k()) {
            d1(d1);
        }
    }

    /* renamed from: C */
    public void V0(Configuration configuration) {
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null) {
                fragment.c1(configuration);
            }
        }
    }

    public FragmentLifecycleCallbacksDispatcher C0() {
        return this.f21623n;
    }

    public final void C1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
        FragmentHostCallback fragmentHostCallback = this.f21631v;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.n("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                Z("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    public boolean D(MenuItem menuItem) {
        if (this.f21630u < 1) {
            return false;
        }
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null && fragment.d1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment D0() {
        return this.f21633x;
    }

    public void D1(FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.f21623n.p(fragmentLifecycleCallbacks);
    }

    public void E() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        V(1);
    }

    public Fragment E0() {
        return this.f21634y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r3.f21617h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (s0() <= 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (R0(r3.f21633x) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0.j(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f21610a
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.f21610a     // Catch:{ all -> 0x0013 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0013 }
            r2 = 1
            if (r1 != 0) goto L_0x0015
            androidx.activity.OnBackPressedCallback r1 = r3.f21617h     // Catch:{ all -> 0x0013 }
            r1.j(r2)     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x002c
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            androidx.activity.OnBackPressedCallback r0 = r3.f21617h
            int r1 = r3.s0()
            if (r1 <= 0) goto L_0x0027
            androidx.fragment.app.Fragment r1 = r3.f21633x
            boolean r1 = r3.R0(r1)
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            r0.j(r2)
            return
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.E1():void");
    }

    public boolean F(Menu menu, MenuInflater menuInflater) {
        if (this.f21630u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null && Q0(fragment) && fragment.f1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f21614e != null) {
            for (int i2 = 0; i2 < this.f21614e.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f21614e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.F0();
                }
            }
        }
        this.f21614e = arrayList;
        return z2;
    }

    public SpecialEffectsControllerFactory F0() {
        SpecialEffectsControllerFactory specialEffectsControllerFactory = this.f21609B;
        if (specialEffectsControllerFactory != null) {
            return specialEffectsControllerFactory;
        }
        Fragment fragment = this.f21633x;
        return fragment != null ? fragment.S.F0() : this.C;
    }

    public void G() {
        this.K = true;
        d0(true);
        a0();
        u();
        V(-1);
        FragmentHostCallback fragmentHostCallback = this.f21631v;
        if (fragmentHostCallback instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) fragmentHostCallback).k(this.f21626q);
        }
        FragmentHostCallback fragmentHostCallback2 = this.f21631v;
        if (fragmentHostCallback2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) fragmentHostCallback2).u(this.f21625p);
        }
        FragmentHostCallback fragmentHostCallback3 = this.f21631v;
        if (fragmentHostCallback3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) fragmentHostCallback3).z(this.f21627r);
        }
        FragmentHostCallback fragmentHostCallback4 = this.f21631v;
        if (fragmentHostCallback4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) fragmentHostCallback4).j(this.f21628s);
        }
        FragmentHostCallback fragmentHostCallback5 = this.f21631v;
        if (fragmentHostCallback5 instanceof MenuHost) {
            ((MenuHost) fragmentHostCallback5).d(this.f21629t);
        }
        this.f21631v = null;
        this.f21632w = null;
        this.f21633x = null;
        if (this.f21616g != null) {
            this.f21617h.h();
            this.f21616g = null;
        }
        ActivityResultLauncher activityResultLauncher = this.D;
        if (activityResultLauncher != null) {
            activityResultLauncher.c();
            this.E.c();
            this.F.c();
        }
    }

    public FragmentStrictMode.Policy G0() {
        return this.Q;
    }

    public void H() {
        V(1);
    }

    public void I() {
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null) {
                fragment.l1();
            }
        }
    }

    public ViewModelStore I0(Fragment fragment) {
        return this.P.o(fragment);
    }

    public void J(boolean z2) {
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null) {
                fragment.m1(z2);
            }
        }
    }

    public void J0() {
        d0(true);
        if (this.f21617h.g()) {
            f1();
        } else {
            this.f21616g.l();
        }
    }

    public void K(Fragment fragment) {
        Iterator it = this.f21624o.iterator();
        while (it.hasNext()) {
            ((FragmentOnAttachListener) it.next()).b(this, fragment);
        }
    }

    public void K0(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.Z) {
            fragment.Z = true;
            fragment.m0 = true ^ fragment.m0;
            z1(fragment);
        }
    }

    public void L() {
        for (Fragment fragment : this.f21612c.l()) {
            if (fragment != null) {
                fragment.J0(fragment.j0());
                fragment.U.L();
            }
        }
    }

    public void L0(Fragment fragment) {
        if (fragment.K && O0(fragment)) {
            this.H = true;
        }
    }

    public boolean M(MenuItem menuItem) {
        if (this.f21630u < 1) {
            return false;
        }
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null && fragment.n1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean M0() {
        return this.K;
    }

    public void N(Menu menu) {
        if (this.f21630u >= 1) {
            for (Fragment fragment : this.f21612c.o()) {
                if (fragment != null) {
                    fragment.o1(menu);
                }
            }
        }
    }

    public final void O(Fragment fragment) {
        if (fragment != null && fragment.equals(i0(fragment.E))) {
            fragment.s1();
        }
    }

    public final boolean O0(Fragment fragment) {
        return (fragment.d0 && fragment.e0) || fragment.U.q();
    }

    public void P() {
        V(5);
    }

    public boolean P0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.j0();
    }

    public void Q(boolean z2) {
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null) {
                fragment.q1(z2);
            }
        }
    }

    public boolean Q0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.m0();
    }

    public boolean R(Menu menu) {
        boolean z2 = false;
        if (this.f21630u < 1) {
            return false;
        }
        for (Fragment fragment : this.f21612c.o()) {
            if (fragment != null && Q0(fragment) && fragment.r1(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean R0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.S;
        return fragment.equals(fragmentManager.E0()) && R0(fragmentManager.f21633x);
    }

    public void S() {
        E1();
        O(this.f21634y);
    }

    public boolean S0(int i2) {
        return this.f21630u >= i2;
    }

    public void T() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        V(7);
    }

    public boolean T0() {
        return this.I || this.J;
    }

    public void U() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        V(5);
    }

    /* JADX INFO: finally extract failed */
    public final void V(int i2) {
        try {
            this.f21611b = true;
            this.f21612c.d(i2);
            a1(i2, false);
            for (SpecialEffectsController j2 : w()) {
                j2.j();
            }
            this.f21611b = false;
            d0(true);
        } catch (Throwable th) {
            this.f21611b = false;
            throw th;
        }
    }

    public void W() {
        this.J = true;
        this.P.r(true);
        V(4);
    }

    public final /* synthetic */ void W0(Integer num) {
        if (num.intValue() == 80) {
            I();
        }
    }

    public void X() {
        V(2);
    }

    public final /* synthetic */ void X0(MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        J(multiWindowModeChangedInfo.a());
    }

    public final void Y() {
        if (this.L) {
            this.L = false;
            B1();
        }
    }

    public final /* synthetic */ void Y0(PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        Q(pictureInPictureModeChangedInfo.a());
    }

    public void Z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f21612c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f21614e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f21614e.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.f21613d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) this.f21613d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f21618i.get());
        synchronized (this.f21610a) {
            try {
                int size3 = this.f21610a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println((OpGenerator) this.f21610a.get(i4));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f21631v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f21632w);
        if (this.f21633x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f21633x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f21630u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public void Z0(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (this.D != null) {
            this.G.addLast(new LaunchedFragmentInfo(fragment.E, i2));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.D.a(intent);
            return;
        }
        this.f21631v.w(fragment, intent, i2, bundle);
    }

    public final void a0() {
        for (SpecialEffectsController j2 : w()) {
            j2.j();
        }
    }

    public void a1(int i2, boolean z2) {
        FragmentHostCallback fragmentHostCallback;
        if (this.f21631v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f21630u) {
            this.f21630u = i2;
            this.f21612c.t();
            B1();
            if (this.H && (fragmentHostCallback = this.f21631v) != null && this.f21630u == 7) {
                fragmentHostCallback.A();
                this.H = false;
            }
        }
    }

    public void b0(OpGenerator opGenerator, boolean z2) {
        if (!z2) {
            if (this.f21631v != null) {
                r();
            } else if (this.K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f21610a) {
            try {
                if (this.f21631v != null) {
                    this.f21610a.add(opGenerator);
                    v1();
                } else if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b1() {
        if (this.f21631v != null) {
            this.I = false;
            this.J = false;
            this.P.r(false);
            for (Fragment fragment : this.f21612c.o()) {
                if (fragment != null) {
                    fragment.s0();
                }
            }
        }
    }

    public final void c0(boolean z2) {
        if (this.f21611b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f21631v == null) {
            if (this.K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f21631v.m().getLooper()) {
            if (!z2) {
                r();
            }
            if (this.M == null) {
                this.M = new ArrayList();
                this.N = new ArrayList();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public void c1(FragmentContainerView fragmentContainerView) {
        View view;
        for (FragmentStateManager fragmentStateManager : this.f21612c.k()) {
            Fragment k2 = fragmentStateManager.k();
            if (k2.X == fragmentContainerView.getId() && (view = k2.h0) != null && view.getParent() == null) {
                k2.g0 = fragmentContainerView;
                fragmentStateManager.b();
            }
        }
    }

    public boolean d0(boolean z2) {
        c0(z2);
        boolean z3 = false;
        while (q0(this.M, this.N)) {
            z3 = true;
            this.f21611b = true;
            try {
                m1(this.M, this.N);
            } finally {
                s();
            }
        }
        E1();
        Y();
        this.f21612c.b();
        return z3;
    }

    public void d1(FragmentStateManager fragmentStateManager) {
        Fragment k2 = fragmentStateManager.k();
        if (!k2.i0) {
            return;
        }
        if (this.f21611b) {
            this.L = true;
            return;
        }
        k2.i0 = false;
        fragmentStateManager.m();
    }

    public void e0(OpGenerator opGenerator, boolean z2) {
        if (!z2 || (this.f21631v != null && !this.K)) {
            c0(z2);
            if (opGenerator.a(this.M, this.N)) {
                this.f21611b = true;
                try {
                    m1(this.M, this.N);
                } finally {
                    s();
                }
            }
            E1();
            Y();
            this.f21612c.b();
        }
    }

    public void e1(int i2, int i3, boolean z2) {
        if (i2 >= 0) {
            b0(new PopBackStackState((String) null, i2, i3), z2);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public boolean f1() {
        return h1((String) null, -1, 0);
    }

    public final void g0(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        boolean z2 = ((BackStackRecord) arrayList.get(i2)).f21726r;
        ArrayList arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.f21612c.o());
        Fragment E0 = E0();
        boolean z3 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i4);
            E0 = !((Boolean) arrayList2.get(i4)).booleanValue() ? backStackRecord.z(this.O, E0) : backStackRecord.C(this.O, E0);
            z3 = z3 || backStackRecord.f21717i;
        }
        this.O.clear();
        if (!z2 && this.f21630u >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                Iterator it = ((BackStackRecord) arrayList.get(i5)).f21711c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.Op) it.next()).f21729b;
                    if (!(fragment == null || fragment.S == null)) {
                        this.f21612c.r(y(fragment));
                    }
                }
            }
        }
        f0(arrayList, arrayList2, i2, i3);
        boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
        for (int i6 = i2; i6 < i3; i6++) {
            BackStackRecord backStackRecord2 = (BackStackRecord) arrayList.get(i6);
            if (booleanValue) {
                for (int size = backStackRecord2.f21711c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((FragmentTransaction.Op) backStackRecord2.f21711c.get(size)).f21729b;
                    if (fragment2 != null) {
                        y(fragment2).m();
                    }
                }
            } else {
                Iterator it2 = backStackRecord2.f21711c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((FragmentTransaction.Op) it2.next()).f21729b;
                    if (fragment3 != null) {
                        y(fragment3).m();
                    }
                }
            }
        }
        a1(this.f21630u, true);
        for (SpecialEffectsController specialEffectsController : x(arrayList, i2, i3)) {
            specialEffectsController.r(booleanValue);
            specialEffectsController.p();
            specialEffectsController.g();
        }
        while (i2 < i3) {
            BackStackRecord backStackRecord3 = (BackStackRecord) arrayList.get(i2);
            if (((Boolean) arrayList2.get(i2)).booleanValue() && backStackRecord3.f21490v >= 0) {
                backStackRecord3.f21490v = -1;
            }
            backStackRecord3.B();
            i2++;
        }
        if (z3) {
            o1();
        }
    }

    public boolean g1(int i2, int i3) {
        if (i2 >= 0) {
            return h1((String) null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public boolean h0() {
        boolean d0 = d0(true);
        p0();
        return d0;
    }

    public final boolean h1(String str, int i2, int i3) {
        d0(false);
        c0(true);
        Fragment fragment = this.f21634y;
        if (fragment != null && i2 < 0 && str == null && fragment.t().f1()) {
            return true;
        }
        boolean i1 = i1(this.M, this.N, str, i2, i3);
        if (i1) {
            this.f21611b = true;
            try {
                m1(this.M, this.N);
            } finally {
                s();
            }
        }
        E1();
        Y();
        this.f21612c.b();
        return i1;
    }

    public void i(BackStackRecord backStackRecord) {
        if (this.f21613d == null) {
            this.f21613d = new ArrayList();
        }
        this.f21613d.add(backStackRecord);
    }

    public Fragment i0(String str) {
        return this.f21612c.f(str);
    }

    public boolean i1(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int j0 = j0(str, i2, (i3 & 1) != 0);
        if (j0 < 0) {
            return false;
        }
        for (int size = this.f21613d.size() - 1; size >= j0; size--) {
            arrayList.add((BackStackRecord) this.f21613d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public FragmentStateManager j(Fragment fragment) {
        String str = fragment.p0;
        if (str != null) {
            FragmentStrictMode.h(fragment, str);
        }
        if (N0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager y2 = y(fragment);
        fragment.S = this;
        this.f21612c.r(y2);
        if (!fragment.a0) {
            this.f21612c.a(fragment);
            fragment.L = false;
            if (fragment.h0 == null) {
                fragment.m0 = false;
            }
            if (O0(fragment)) {
                this.H = true;
            }
        }
        return y2;
    }

    public final int j0(String str, int i2, boolean z2) {
        ArrayList arrayList = this.f21613d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i2 >= 0) {
            int size = this.f21613d.size() - 1;
            while (size >= 0) {
                BackStackRecord backStackRecord = (BackStackRecord) this.f21613d.get(size);
                if ((str != null && str.equals(backStackRecord.A())) || (i2 >= 0 && i2 == backStackRecord.f21490v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z2) {
                while (size > 0) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) this.f21613d.get(size - 1);
                    if ((str == null || !str.equals(backStackRecord2.A())) && (i2 < 0 || i2 != backStackRecord2.f21490v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f21613d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z2) {
            return 0;
        } else {
            return this.f21613d.size() - 1;
        }
    }

    public void j1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.S != this) {
            C1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.E);
    }

    public void k(FragmentOnAttachListener fragmentOnAttachListener) {
        this.f21624o.add(fragmentOnAttachListener);
    }

    public Fragment k0(int i2) {
        return this.f21612c.g(i2);
    }

    public void k1(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z2) {
        this.f21623n.o(fragmentLifecycleCallbacks, z2);
    }

    public void l(Fragment fragment) {
        this.P.g(fragment);
    }

    public Fragment l0(String str) {
        return this.f21612c.h(str);
    }

    public void l1(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.R);
        }
        boolean k0 = fragment.k0();
        if (!fragment.a0 || !k0) {
            this.f21612c.u(fragment);
            if (O0(fragment)) {
                this.H = true;
            }
            fragment.L = true;
            z1(fragment);
        }
    }

    public int m() {
        return this.f21618i.getAndIncrement();
    }

    public Fragment m0(String str) {
        return this.f21612c.i(str);
    }

    public final void m1(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!((BackStackRecord) arrayList.get(i2)).f21726r) {
                        if (i3 != i2) {
                            g0(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((BackStackRecord) arrayList.get(i3)).f21726r) {
                                i3++;
                            }
                        }
                        g0(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    g0(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.OnBackPressedDispatcherOwner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(androidx.fragment.app.FragmentHostCallback r4, androidx.fragment.app.FragmentContainer r5, final androidx.fragment.app.Fragment r6) {
        /*
            r3 = this;
            androidx.fragment.app.FragmentHostCallback r0 = r3.f21631v
            if (r0 != 0) goto L_0x016c
            r3.f21631v = r4
            r3.f21632w = r5
            r3.f21633x = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$7 r5 = new androidx.fragment.app.FragmentManager$7
            r5.<init>(r6)
            r3.k(r5)
            goto L_0x001f
        L_0x0015:
            boolean r5 = r4 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r5 == 0) goto L_0x001f
            r5 = r4
            androidx.fragment.app.FragmentOnAttachListener r5 = (androidx.fragment.app.FragmentOnAttachListener) r5
            r3.k(r5)
        L_0x001f:
            androidx.fragment.app.Fragment r5 = r3.f21633x
            if (r5 == 0) goto L_0x0026
            r3.E1()
        L_0x0026:
            boolean r5 = r4 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r5 == 0) goto L_0x003b
            r5 = r4
            androidx.activity.OnBackPressedDispatcherOwner r5 = (androidx.activity.OnBackPressedDispatcherOwner) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.c()
            r3.f21616g = r0
            if (r6 == 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            androidx.activity.OnBackPressedCallback r1 = r3.f21617h
            r0.i(r5, r1)
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r4 = r6.S
            androidx.fragment.app.FragmentManagerViewModel r4 = r4.t0(r6)
            r3.P = r4
            goto L_0x005f
        L_0x0046:
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r5 == 0) goto L_0x0057
            androidx.lifecycle.ViewModelStoreOwner r4 = (androidx.lifecycle.ViewModelStoreOwner) r4
            androidx.lifecycle.ViewModelStore r4 = r4.s()
            androidx.fragment.app.FragmentManagerViewModel r4 = androidx.fragment.app.FragmentManagerViewModel.m(r4)
            r3.P = r4
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.FragmentManagerViewModel r4 = new androidx.fragment.app.FragmentManagerViewModel
            r5 = 0
            r4.<init>(r5)
            r3.P = r4
        L_0x005f:
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.P
            boolean r5 = r3.T0()
            r4.r(r5)
            androidx.fragment.app.FragmentStore r4 = r3.f21612c
            androidx.fragment.app.FragmentManagerViewModel r5 = r3.P
            r4.A(r5)
            androidx.fragment.app.FragmentHostCallback r4 = r3.f21631v
            boolean r5 = r4 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            androidx.savedstate.SavedStateRegistryOwner r4 = (androidx.savedstate.SavedStateRegistryOwner) r4
            androidx.savedstate.SavedStateRegistry r4 = r4.v()
            androidx.fragment.app.i r5 = new androidx.fragment.app.i
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.c(r0, r5)
            android.os.Bundle r4 = r4.a(r0)
            if (r4 == 0) goto L_0x0090
            r3.q1(r4)
        L_0x0090:
            androidx.fragment.app.FragmentHostCallback r4 = r3.f21631v
            boolean r5 = r4 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r5 == 0) goto L_0x0128
            androidx.activity.result.ActivityResultRegistryOwner r4 = (androidx.activity.result.ActivityResultRegistryOwner) r4
            androidx.activity.result.ActivityResultRegistry r4 = r4.p()
            if (r6 == 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.E
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r5 = ""
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r1 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r1.<init>()
            androidx.fragment.app.FragmentManager$8 r2 = new androidx.fragment.app.FragmentManager$8
            r2.<init>()
            androidx.activity.result.ActivityResultLauncher r0 = r4.l(r0, r1, r2)
            r3.D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r1 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r1.<init>()
            androidx.fragment.app.FragmentManager$9 r2 = new androidx.fragment.app.FragmentManager$9
            r2.<init>()
            androidx.activity.result.ActivityResultLauncher r0 = r4.l(r0, r1, r2)
            r3.E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r0.<init>()
            androidx.fragment.app.FragmentManager$10 r1 = new androidx.fragment.app.FragmentManager$10
            r1.<init>()
            androidx.activity.result.ActivityResultLauncher r4 = r4.l(r5, r0, r1)
            r3.F = r4
        L_0x0128:
            androidx.fragment.app.FragmentHostCallback r4 = r3.f21631v
            boolean r5 = r4 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r5 == 0) goto L_0x0135
            androidx.core.content.OnConfigurationChangedProvider r4 = (androidx.core.content.OnConfigurationChangedProvider) r4
            androidx.core.util.Consumer r5 = r3.f21625p
            r4.g(r5)
        L_0x0135:
            androidx.fragment.app.FragmentHostCallback r4 = r3.f21631v
            boolean r5 = r4 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r5 == 0) goto L_0x0142
            androidx.core.content.OnTrimMemoryProvider r4 = (androidx.core.content.OnTrimMemoryProvider) r4
            androidx.core.util.Consumer r5 = r3.f21626q
            r4.x(r5)
        L_0x0142:
            androidx.fragment.app.FragmentHostCallback r4 = r3.f21631v
            boolean r5 = r4 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r5 == 0) goto L_0x014f
            androidx.core.app.OnMultiWindowModeChangedProvider r4 = (androidx.core.app.OnMultiWindowModeChangedProvider) r4
            androidx.core.util.Consumer r5 = r3.f21627r
            r4.q(r5)
        L_0x014f:
            androidx.fragment.app.FragmentHostCallback r4 = r3.f21631v
            boolean r5 = r4 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r5 == 0) goto L_0x015c
            androidx.core.app.OnPictureInPictureModeChangedProvider r4 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r4
            androidx.core.util.Consumer r5 = r3.f21628s
            r4.o(r5)
        L_0x015c:
            androidx.fragment.app.FragmentHostCallback r4 = r3.f21631v
            boolean r5 = r4 instanceof androidx.core.view.MenuHost
            if (r5 == 0) goto L_0x016b
            if (r6 != 0) goto L_0x016b
            androidx.core.view.MenuHost r4 = (androidx.core.view.MenuHost) r4
            androidx.core.view.MenuProvider r5 = r3.f21629t
            r4.y(r5)
        L_0x016b:
            return
        L_0x016c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.n(androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer, androidx.fragment.app.Fragment):void");
    }

    public void n1(Fragment fragment) {
        this.P.q(fragment);
    }

    public void o(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.a0) {
            fragment.a0 = false;
            if (!fragment.K) {
                this.f21612c.a(fragment);
                if (N0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (O0(fragment)) {
                    this.H = true;
                }
            }
        }
    }

    public final void o1() {
        if (this.f21622m != null) {
            for (int i2 = 0; i2 < this.f21622m.size(); i2++) {
                ((OnBackStackChangedListener) this.f21622m.get(i2)).a();
            }
        }
    }

    public FragmentTransaction p() {
        return new BackStackRecord(this);
    }

    public final void p0() {
        for (SpecialEffectsController k2 : w()) {
            k2.k();
        }
    }

    public boolean p1(ArrayList arrayList, ArrayList arrayList2, String str) {
        BackStackState backStackState = (BackStackState) this.f21619j.remove(str);
        if (backStackState == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BackStackRecord backStackRecord = (BackStackRecord) it.next();
            if (backStackRecord.f21491w) {
                Iterator it2 = backStackRecord.f21711c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.Op) it2.next()).f21729b;
                    if (fragment != null) {
                        hashMap.put(fragment.E, fragment);
                    }
                }
            }
        }
        Iterator it3 = backStackState.a(this, hashMap).iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it3.hasNext()) {
                    return z2;
                }
                if (((BackStackRecord) it3.next()).a(arrayList, arrayList2) || z2) {
                    z2 = true;
                }
            }
        }
    }

    public boolean q() {
        boolean z2 = false;
        for (Fragment fragment : this.f21612c.l()) {
            if (fragment != null) {
                z2 = O0(fragment);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean q0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f21610a) {
            if (this.f21610a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f21610a.size();
                boolean z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z2 |= ((OpGenerator) this.f21610a.get(i2)).a(arrayList, arrayList2);
                }
                return z2;
            } finally {
                this.f21610a.clear();
                this.f21631v.m().removeCallbacks(this.R);
            }
        }
    }

    public void q1(Parcelable parcelable) {
        FragmentStateManager fragmentStateManager;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f21631v.l().getClassLoader());
                    this.f21620k.put(next.substring(7), bundle2);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f21631v.l().getClassLoader());
                    arrayList.add((FragmentState) bundle.getParcelable("state"));
                }
            }
            this.f21612c.x(arrayList);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
            if (fragmentManagerState != null) {
                this.f21612c.v();
                Iterator it = fragmentManagerState.f21664z.iterator();
                while (it.hasNext()) {
                    FragmentState B2 = this.f21612c.B((String) it.next(), (FragmentState) null);
                    if (B2 != null) {
                        Fragment k2 = this.P.k(B2.f21678A);
                        if (k2 != null) {
                            if (N0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + k2);
                            }
                            fragmentStateManager = new FragmentStateManager(this.f21623n, this.f21612c, k2, B2);
                        } else {
                            fragmentStateManager = new FragmentStateManager(this.f21623n, this.f21612c, this.f21631v.l().getClassLoader(), x0(), B2);
                        }
                        Fragment k3 = fragmentStateManager.k();
                        k3.S = this;
                        if (N0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k3.E + "): " + k3);
                        }
                        fragmentStateManager.o(this.f21631v.l().getClassLoader());
                        this.f21612c.r(fragmentStateManager);
                        fragmentStateManager.u(this.f21630u);
                    }
                }
                for (Fragment fragment : this.P.n()) {
                    if (!this.f21612c.c(fragment.E)) {
                        if (N0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f21664z);
                        }
                        this.P.q(fragment);
                        fragment.S = this;
                        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.f21623n, this.f21612c, fragment);
                        fragmentStateManager2.u(1);
                        fragmentStateManager2.m();
                        fragment.L = true;
                        fragmentStateManager2.m();
                    }
                }
                this.f21612c.w(fragmentManagerState.f21662A);
                if (fragmentManagerState.f21663B != null) {
                    this.f21613d = new ArrayList(fragmentManagerState.f21663B.length);
                    int i2 = 0;
                    while (true) {
                        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f21663B;
                        if (i2 >= backStackRecordStateArr.length) {
                            break;
                        }
                        BackStackRecord b2 = backStackRecordStateArr[i2].b(this);
                        if (N0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + b2.f21490v + "): " + b2);
                            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                            b2.w("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f21613d.add(b2);
                        i2++;
                    }
                } else {
                    this.f21613d = null;
                }
                this.f21618i.set(fragmentManagerState.C);
                String str = fragmentManagerState.D;
                if (str != null) {
                    Fragment i0 = i0(str);
                    this.f21634y = i0;
                    O(i0);
                }
                ArrayList arrayList2 = fragmentManagerState.E;
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        this.f21619j.put((String) arrayList2.get(i3), (BackStackState) fragmentManagerState.F.get(i3));
                    }
                }
                this.G = new ArrayDeque(fragmentManagerState.G);
            }
        }
    }

    public final void r() {
        if (T0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public List r0() {
        return this.f21612c.l();
    }

    public final void s() {
        this.f21611b = false;
        this.N.clear();
        this.M.clear();
    }

    public int s0() {
        ArrayList arrayList = this.f21613d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: s1 */
    public Bundle U0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        p0();
        a0();
        d0(true);
        this.I = true;
        this.P.r(true);
        ArrayList y2 = this.f21612c.y();
        ArrayList m2 = this.f21612c.m();
        if (!m2.isEmpty()) {
            ArrayList z2 = this.f21612c.z();
            ArrayList arrayList = this.f21613d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState((BackStackRecord) this.f21613d.get(i2));
                    if (N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f21613d.get(i2));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f21664z = y2;
            fragmentManagerState.f21662A = z2;
            fragmentManagerState.f21663B = backStackRecordStateArr;
            fragmentManagerState.C = this.f21618i.get();
            Fragment fragment = this.f21634y;
            if (fragment != null) {
                fragmentManagerState.D = fragment.E;
            }
            fragmentManagerState.E.addAll(this.f21619j.keySet());
            fragmentManagerState.F.addAll(this.f21619j.values());
            fragmentManagerState.G = new ArrayList(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f21620k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f21620k.get(str));
            }
            Iterator it = m2.iterator();
            while (it.hasNext()) {
                FragmentState fragmentState = (FragmentState) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f21678A, bundle2);
            }
        } else if (N0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public boolean t(ArrayList arrayList, ArrayList arrayList2, String str) {
        if (!p1(arrayList, arrayList2, str)) {
            return false;
        }
        return i1(arrayList, arrayList2, str, -1, 1);
    }

    public final FragmentManagerViewModel t0(Fragment fragment) {
        return this.P.l(fragment);
    }

    public boolean t1(ArrayList arrayList, ArrayList arrayList2, String str) {
        String str2;
        int i2;
        String str3 = str;
        int j0 = j0(str3, -1, true);
        if (j0 < 0) {
            return false;
        }
        for (int i3 = j0; i3 < this.f21613d.size(); i3++) {
            BackStackRecord backStackRecord = (BackStackRecord) this.f21613d.get(i3);
            if (!backStackRecord.f21726r) {
                C1(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + backStackRecord + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i4 = j0; i4 < this.f21613d.size(); i4++) {
            BackStackRecord backStackRecord2 = (BackStackRecord) this.f21613d.get(i4);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it = backStackRecord2.f21711c.iterator();
            while (it.hasNext()) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) it.next();
                Fragment fragment = op.f21729b;
                if (fragment != null) {
                    if (!op.f21730c || (i2 = op.f21728a) == 1 || i2 == 2 || i2 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i5 = op.f21728a;
                    if (i5 == 1 || i5 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str3);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str2 = " " + hashSet2.iterator().next();
                } else {
                    str2 = "s " + hashSet2;
                }
                sb.append(str2);
                sb.append(" in ");
                sb.append(backStackRecord2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                C1(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.b0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str3);
                sb2.append("\") must not contain retained fragments. Found ");
                sb2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb2.append("fragment ");
                sb2.append(fragment2);
                C1(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.U.r0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).E);
        }
        ArrayList arrayList4 = new ArrayList(this.f21613d.size() - j0);
        for (int i6 = j0; i6 < this.f21613d.size(); i6++) {
            arrayList4.add((Object) null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f21613d.size() - 1; size >= j0; size--) {
            BackStackRecord backStackRecord3 = (BackStackRecord) this.f21613d.remove(size);
            BackStackRecord backStackRecord4 = new BackStackRecord(backStackRecord3);
            backStackRecord4.t();
            arrayList4.set(size - j0, new BackStackRecordState(backStackRecord4));
            backStackRecord3.f21491w = true;
            arrayList.add(backStackRecord3);
            arrayList2.add(Boolean.TRUE);
        }
        this.f21619j.put(str3, backStackState);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f21633x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f21633x)));
            sb.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.f21631v;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f21631v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        FragmentHostCallback fragmentHostCallback = this.f21631v;
        if (fragmentHostCallback instanceof ViewModelStoreOwner ? this.f21612c.p().p() : fragmentHostCallback.l() instanceof Activity ? !((Activity) this.f21631v.l()).isChangingConfigurations() : true) {
            for (BackStackState backStackState : this.f21619j.values()) {
                for (String i2 : backStackState.f21496z) {
                    this.f21612c.p().i(i2);
                }
            }
        }
    }

    public FragmentContainer u0() {
        return this.f21632w;
    }

    public Fragment.SavedState u1(Fragment fragment) {
        FragmentStateManager n2 = this.f21612c.n(fragment.E);
        if (n2 == null || !n2.k().equals(fragment)) {
            C1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n2.r();
    }

    public final void v(String str) {
        this.f21620k.remove(str);
        if (N0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public Fragment v0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment i0 = i0(string);
        if (i0 == null) {
            C1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return i0;
    }

    public void v1() {
        synchronized (this.f21610a) {
            try {
                if (this.f21610a.size() == 1) {
                    this.f21631v.m().removeCallbacks(this.R);
                    this.f21631v.m().post(this.R);
                    E1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set w() {
        HashSet hashSet = new HashSet();
        for (FragmentStateManager k2 : this.f21612c.k()) {
            ViewGroup viewGroup = k2.k().g0;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.o(viewGroup, F0()));
            }
        }
        return hashSet;
    }

    public final ViewGroup w0(Fragment fragment) {
        ViewGroup viewGroup = fragment.g0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.X > 0 && this.f21632w.h()) {
            View f2 = this.f21632w.f(fragment.X);
            if (f2 instanceof ViewGroup) {
                return (ViewGroup) f2;
            }
        }
        return null;
    }

    public void w1(Fragment fragment, boolean z2) {
        ViewGroup w0 = w0(fragment);
        if (w0 != null && (w0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) w0).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final Set x(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((BackStackRecord) arrayList.get(i2)).f21711c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).f21729b;
                if (!(fragment == null || (viewGroup = fragment.g0) == null)) {
                    hashSet.add(SpecialEffectsController.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public FragmentFactory x0() {
        FragmentFactory fragmentFactory = this.f21635z;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.f21633x;
        return fragment != null ? fragment.S.x0() : this.f21608A;
    }

    public void x1(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(i0(fragment.E)) || !(fragment.T == null || fragment.S == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.q0 = state;
    }

    public FragmentStateManager y(Fragment fragment) {
        FragmentStateManager n2 = this.f21612c.n(fragment.E);
        if (n2 != null) {
            return n2;
        }
        FragmentStateManager fragmentStateManager = new FragmentStateManager(this.f21623n, this.f21612c, fragment);
        fragmentStateManager.o(this.f21631v.l().getClassLoader());
        fragmentStateManager.u(this.f21630u);
        return fragmentStateManager;
    }

    public FragmentStore y0() {
        return this.f21612c;
    }

    public void y1(Fragment fragment) {
        if (fragment == null || (fragment.equals(i0(fragment.E)) && (fragment.T == null || fragment.S == this))) {
            Fragment fragment2 = this.f21634y;
            this.f21634y = fragment;
            O(fragment2);
            O(this.f21634y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void z(Fragment fragment) {
        if (N0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.a0) {
            fragment.a0 = true;
            if (fragment.K) {
                if (N0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f21612c.u(fragment);
                if (O0(fragment)) {
                    this.H = true;
                }
                z1(fragment);
            }
        }
    }

    public List z0() {
        return this.f21612c.o();
    }

    public final void z1(Fragment fragment) {
        ViewGroup w0 = w0(fragment);
        if (w0 != null && fragment.w() + fragment.z() + fragment.L() + fragment.M() > 0) {
            if (w0.getTag(R.id.f21480c) == null) {
                w0.setTag(R.id.f21480c, fragment);
            }
            ((Fragment) w0.getTag(R.id.f21480c)).N1(fragment.K());
        }
    }

    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() {
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        };

        /* renamed from: A  reason: collision with root package name */
        public int f21651A;

        /* renamed from: z  reason: collision with root package name */
        public String f21652z;

        public LaunchedFragmentInfo(String str, int i2) {
            this.f21652z = str;
            this.f21651A = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f21652z);
            parcel.writeInt(this.f21651A);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f21652z = parcel.readString();
            this.f21651A = parcel.readInt();
        }
    }
}
