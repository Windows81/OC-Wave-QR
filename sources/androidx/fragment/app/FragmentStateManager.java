package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.ViewModelStoreOwner;

class FragmentStateManager {

    /* renamed from: a  reason: collision with root package name */
    public final FragmentLifecycleCallbacksDispatcher f21681a;

    /* renamed from: b  reason: collision with root package name */
    public final FragmentStore f21682b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f21683c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21684d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f21685e = -1;

    /* renamed from: androidx.fragment.app.FragmentStateManager$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21688a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21688a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21688a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21688a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21688a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentStateManager.AnonymousClass2.<clinit>():void");
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment) {
        this.f21681a = fragmentLifecycleCallbacksDispatcher;
        this.f21682b = fragmentStore;
        this.f21683c = fragment;
    }

    public void a() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f21683c);
        }
        Fragment fragment = this.f21683c;
        fragment.a1(fragment.f21546A);
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f21681a;
        Fragment fragment2 = this.f21683c;
        fragmentLifecycleCallbacksDispatcher.a(fragment2, fragment2.f21546A, false);
    }

    public void b() {
        int j2 = this.f21682b.j(this.f21683c);
        Fragment fragment = this.f21683c;
        fragment.g0.addView(fragment.h0, j2);
    }

    public void c() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f21683c);
        }
        Fragment fragment = this.f21683c;
        Fragment fragment2 = fragment.G;
        FragmentStateManager fragmentStateManager = null;
        if (fragment2 != null) {
            FragmentStateManager n2 = this.f21682b.n(fragment2.E);
            if (n2 != null) {
                Fragment fragment3 = this.f21683c;
                fragment3.H = fragment3.G.E;
                fragment3.G = null;
                fragmentStateManager = n2;
            } else {
                throw new IllegalStateException("Fragment " + this.f21683c + " declared target fragment " + this.f21683c.G + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.H;
            if (str != null && (fragmentStateManager = this.f21682b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f21683c + " declared target fragment " + this.f21683c.H + " that does not belong to this FragmentManager!");
            }
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.m();
        }
        Fragment fragment4 = this.f21683c;
        fragment4.T = fragment4.S.A0();
        Fragment fragment5 = this.f21683c;
        fragment5.V = fragment5.S.D0();
        this.f21681a.g(this.f21683c, false);
        this.f21683c.b1();
        this.f21681a.b(this.f21683c, false);
    }

    public int d() {
        Fragment fragment = this.f21683c;
        if (fragment.S == null) {
            return fragment.f21548z;
        }
        int i2 = this.f21685e;
        int i3 = AnonymousClass2.f21688a[fragment.q0.ordinal()];
        if (i3 != 1) {
            i2 = i3 != 2 ? i3 != 3 ? i3 != 4 ? Math.min(i2, -1) : Math.min(i2, 0) : Math.min(i2, 1) : Math.min(i2, 5);
        }
        Fragment fragment2 = this.f21683c;
        if (fragment2.N) {
            if (fragment2.O) {
                i2 = Math.max(this.f21685e, 2);
                View view = this.f21683c.h0;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f21685e < 4 ? Math.min(i2, fragment2.f21548z) : Math.min(i2, 1);
            }
        }
        if (!this.f21683c.K) {
            i2 = Math.min(i2, 1);
        }
        Fragment fragment3 = this.f21683c;
        ViewGroup viewGroup = fragment3.g0;
        SpecialEffectsController.Operation.LifecycleImpact l2 = viewGroup != null ? SpecialEffectsController.n(viewGroup, fragment3.J()).l(this) : null;
        if (l2 == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (l2 == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment4 = this.f21683c;
            if (fragment4.L) {
                i2 = fragment4.k0() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        Fragment fragment5 = this.f21683c;
        if (fragment5.i0 && fragment5.f21548z < 5) {
            i2 = Math.min(i2, 4);
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + this.f21683c);
        }
        return i2;
    }

    public void e() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f21683c);
        }
        Fragment fragment = this.f21683c;
        if (!fragment.o0) {
            this.f21681a.h(fragment, fragment.f21546A, false);
            Fragment fragment2 = this.f21683c;
            fragment2.e1(fragment2.f21546A);
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f21681a;
            Fragment fragment3 = this.f21683c;
            fragmentLifecycleCallbacksDispatcher.c(fragment3, fragment3.f21546A, false);
            return;
        }
        fragment.D1(fragment.f21546A);
        this.f21683c.f21548z = 1;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r7 = this;
            androidx.fragment.app.Fragment r0 = r7.f21683c
            boolean r0 = r0.N
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.N0(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto CREATE_VIEW: "
            r0.append(r2)
            androidx.fragment.app.Fragment r2 = r7.f21683c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x0026:
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.os.Bundle r2 = r0.f21546A
            android.view.LayoutInflater r0 = r0.k1(r2)
            androidx.fragment.app.Fragment r2 = r7.f21683c
            android.view.ViewGroup r3 = r2.g0
            if (r3 == 0) goto L_0x0036
            goto L_0x00c0
        L_0x0036:
            int r3 = r2.X
            if (r3 == 0) goto L_0x00bf
            r4 = -1
            if (r3 == r4) goto L_0x00a1
            androidx.fragment.app.FragmentManager r2 = r2.S
            androidx.fragment.app.FragmentContainer r2 = r2.u0()
            androidx.fragment.app.Fragment r3 = r7.f21683c
            int r3 = r3.X
            android.view.View r2 = r2.f(r3)
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L_0x0097
            androidx.fragment.app.Fragment r2 = r7.f21683c
            boolean r4 = r2.P
            if (r4 == 0) goto L_0x0057
            goto L_0x00c0
        L_0x0057:
            android.content.res.Resources r0 = r2.P()     // Catch:{ NotFoundException -> 0x0064 }
            androidx.fragment.app.Fragment r1 = r7.f21683c     // Catch:{ NotFoundException -> 0x0064 }
            int r1 = r1.X     // Catch:{ NotFoundException -> 0x0064 }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = "unknown"
        L_0x0066:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            androidx.fragment.app.Fragment r3 = r7.f21683c
            int r3 = r3.X
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r7.f21683c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0097:
            boolean r2 = r3 instanceof androidx.fragment.app.FragmentContainerView
            if (r2 != 0) goto L_0x00c0
            androidx.fragment.app.Fragment r2 = r7.f21683c
            androidx.fragment.app.strictmode.FragmentStrictMode.o(r2, r3)
            goto L_0x00c0
        L_0x00a1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r7.f21683c
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            androidx.fragment.app.Fragment r2 = r7.f21683c
            r2.g0 = r3
            android.os.Bundle r4 = r2.f21546A
            r2.g1(r0, r3, r4)
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.view.View r0 = r0.h0
            r2 = 2
            if (r0 == 0) goto L_0x0173
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.view.View r5 = r0.h0
            int r6 = androidx.fragment.R.id.f21478a
            r5.setTag(r6, r0)
            if (r3 == 0) goto L_0x00e2
            r7.b()
        L_0x00e2:
            androidx.fragment.app.Fragment r0 = r7.f21683c
            boolean r3 = r0.Z
            if (r3 == 0) goto L_0x00ef
            android.view.View r0 = r0.h0
            r3 = 8
            r0.setVisibility(r3)
        L_0x00ef:
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.view.View r0 = r0.h0
            boolean r0 = androidx.core.view.ViewCompat.C(r0)
            if (r0 == 0) goto L_0x0101
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.view.View r0 = r0.h0
            androidx.core.view.ViewCompat.R(r0)
            goto L_0x010d
        L_0x0101:
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.view.View r0 = r0.h0
            androidx.fragment.app.FragmentStateManager$1 r3 = new androidx.fragment.app.FragmentStateManager$1
            r3.<init>(r0)
            r0.addOnAttachStateChangeListener(r3)
        L_0x010d:
            androidx.fragment.app.Fragment r0 = r7.f21683c
            r0.x1()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r7.f21681a
            androidx.fragment.app.Fragment r3 = r7.f21683c
            android.view.View r5 = r3.h0
            android.os.Bundle r6 = r3.f21546A
            r0.m(r3, r5, r6, r4)
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.view.View r0 = r0.h0
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r3 = r7.f21683c
            android.view.View r3 = r3.h0
            float r3 = r3.getAlpha()
            androidx.fragment.app.Fragment r4 = r7.f21683c
            r4.O1(r3)
            androidx.fragment.app.Fragment r3 = r7.f21683c
            android.view.ViewGroup r4 = r3.g0
            if (r4 == 0) goto L_0x0173
            if (r0 != 0) goto L_0x0173
            android.view.View r0 = r3.h0
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L_0x016b
            androidx.fragment.app.Fragment r3 = r7.f21683c
            r3.I1(r0)
            boolean r3 = androidx.fragment.app.FragmentManager.N0(r2)
            if (r3 == 0) goto L_0x016b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestFocus: Saved focused view "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " for Fragment "
            r3.append(r0)
            androidx.fragment.app.Fragment r0 = r7.f21683c
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r1, r0)
        L_0x016b:
            androidx.fragment.app.Fragment r0 = r7.f21683c
            android.view.View r0 = r0.h0
            r1 = 0
            r0.setAlpha(r1)
        L_0x0173:
            androidx.fragment.app.Fragment r0 = r7.f21683c
            r0.f21548z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentStateManager.f():void");
    }

    public void g() {
        Fragment f2;
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f21683c);
        }
        Fragment fragment = this.f21683c;
        boolean z2 = true;
        boolean z3 = fragment.L && !fragment.k0();
        if (z3) {
            Fragment fragment2 = this.f21683c;
            if (!fragment2.M) {
                this.f21682b.B(fragment2.E, (FragmentState) null);
            }
        }
        if (z3 || this.f21682b.p().s(this.f21683c)) {
            FragmentHostCallback fragmentHostCallback = this.f21683c.T;
            if (fragmentHostCallback instanceof ViewModelStoreOwner) {
                z2 = this.f21682b.p().p();
            } else if (fragmentHostCallback.l() instanceof Activity) {
                z2 = true ^ ((Activity) fragmentHostCallback.l()).isChangingConfigurations();
            }
            if ((z3 && !this.f21683c.M) || z2) {
                this.f21682b.p().h(this.f21683c);
            }
            this.f21683c.h1();
            this.f21681a.d(this.f21683c, false);
            for (FragmentStateManager fragmentStateManager : this.f21682b.k()) {
                if (fragmentStateManager != null) {
                    Fragment k2 = fragmentStateManager.k();
                    if (this.f21683c.E.equals(k2.H)) {
                        k2.G = this.f21683c;
                        k2.H = null;
                    }
                }
            }
            Fragment fragment3 = this.f21683c;
            String str = fragment3.H;
            if (str != null) {
                fragment3.G = this.f21682b.f(str);
            }
            this.f21682b.s(this);
            return;
        }
        String str2 = this.f21683c.H;
        if (!(str2 == null || (f2 = this.f21682b.f(str2)) == null || !f2.b0)) {
            this.f21683c.G = f2;
        }
        this.f21683c.f21548z = 0;
    }

    public void h() {
        View view;
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f21683c);
        }
        Fragment fragment = this.f21683c;
        ViewGroup viewGroup = fragment.g0;
        if (!(viewGroup == null || (view = fragment.h0) == null)) {
            viewGroup.removeView(view);
        }
        this.f21683c.i1();
        this.f21681a.n(this.f21683c, false);
        Fragment fragment2 = this.f21683c;
        fragment2.g0 = null;
        fragment2.h0 = null;
        fragment2.s0 = null;
        fragment2.t0.o((Object) null);
        this.f21683c.O = false;
    }

    public void i() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f21683c);
        }
        this.f21683c.j1();
        this.f21681a.e(this.f21683c, false);
        Fragment fragment = this.f21683c;
        fragment.f21548z = -1;
        fragment.T = null;
        fragment.V = null;
        fragment.S = null;
        if ((fragment.L && !fragment.k0()) || this.f21682b.p().s(this.f21683c)) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f21683c);
            }
            this.f21683c.f0();
        }
    }

    public void j() {
        Fragment fragment = this.f21683c;
        if (fragment.N && fragment.O && !fragment.Q) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f21683c);
            }
            Fragment fragment2 = this.f21683c;
            fragment2.g1(fragment2.k1(fragment2.f21546A), (ViewGroup) null, this.f21683c.f21546A);
            View view = this.f21683c.h0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f21683c;
                fragment3.h0.setTag(R.id.f21478a, fragment3);
                Fragment fragment4 = this.f21683c;
                if (fragment4.Z) {
                    fragment4.h0.setVisibility(8);
                }
                this.f21683c.x1();
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.f21681a;
                Fragment fragment5 = this.f21683c;
                fragmentLifecycleCallbacksDispatcher.m(fragment5, fragment5.h0, fragment5.f21546A, false);
                this.f21683c.f21548z = 2;
            }
        }
    }

    public Fragment k() {
        return this.f21683c;
    }

    public final boolean l(View view) {
        if (view == this.f21683c.h0) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f21683c.h0) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f21684d) {
            try {
                this.f21684d = true;
                boolean z2 = false;
                while (true) {
                    int d2 = d();
                    Fragment fragment = this.f21683c;
                    int i2 = fragment.f21548z;
                    if (d2 != i2) {
                        if (d2 <= i2) {
                            switch (i2 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    if (fragment.M && this.f21682b.q(fragment.E) == null) {
                                        s();
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f21683c.f21548z = 1;
                                    break;
                                case 2:
                                    fragment.O = false;
                                    fragment.f21548z = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.N0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f21683c);
                                    }
                                    Fragment fragment2 = this.f21683c;
                                    if (fragment2.M) {
                                        s();
                                    } else if (fragment2.h0 != null && fragment2.f21547B == null) {
                                        t();
                                    }
                                    Fragment fragment3 = this.f21683c;
                                    if (!(fragment3.h0 == null || (viewGroup2 = fragment3.g0) == null)) {
                                        SpecialEffectsController.n(viewGroup2, fragment3.J()).d(this);
                                    }
                                    this.f21683c.f21548z = 3;
                                    break;
                                case 4:
                                    w();
                                    break;
                                case 5:
                                    fragment.f21548z = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i2 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.h0 == null || (viewGroup3 = fragment.g0) == null)) {
                                        SpecialEffectsController.n(viewGroup3, fragment.J()).b(SpecialEffectsController.Operation.State.f(this.f21683c.h0.getVisibility()), this);
                                    }
                                    this.f21683c.f21548z = 4;
                                    break;
                                case 5:
                                    v();
                                    break;
                                case 6:
                                    fragment.f21548z = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                        z2 = true;
                    } else {
                        if (!z2 && i2 == -1 && fragment.L && !fragment.k0() && !this.f21683c.M) {
                            if (FragmentManager.N0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f21683c);
                            }
                            this.f21682b.p().h(this.f21683c);
                            this.f21682b.s(this);
                            if (FragmentManager.N0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f21683c);
                            }
                            this.f21683c.f0();
                        }
                        Fragment fragment4 = this.f21683c;
                        if (fragment4.m0) {
                            if (!(fragment4.h0 == null || (viewGroup = fragment4.g0) == null)) {
                                SpecialEffectsController n2 = SpecialEffectsController.n(viewGroup, fragment4.J());
                                if (this.f21683c.Z) {
                                    n2.c(this);
                                } else {
                                    n2.e(this);
                                }
                            }
                            Fragment fragment5 = this.f21683c;
                            FragmentManager fragmentManager = fragment5.S;
                            if (fragmentManager != null) {
                                fragmentManager.L0(fragment5);
                            }
                            Fragment fragment6 = this.f21683c;
                            fragment6.m0 = false;
                            fragment6.J0(fragment6.Z);
                            this.f21683c.U.L();
                        }
                        this.f21684d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f21684d = false;
                throw th;
            }
        } else if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    public void n() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f21683c);
        }
        this.f21683c.p1();
        this.f21681a.f(this.f21683c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f21683c.f21546A;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f21683c;
            fragment.f21547B = fragment.f21546A.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f21683c;
            fragment2.C = fragment2.f21546A.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f21683c;
            fragment3.H = fragment3.f21546A.getString("android:target_state");
            Fragment fragment4 = this.f21683c;
            if (fragment4.H != null) {
                fragment4.I = fragment4.f21546A.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f21683c;
            Boolean bool = fragment5.D;
            if (bool != null) {
                fragment5.j0 = bool.booleanValue();
                this.f21683c.D = null;
            } else {
                fragment5.j0 = fragment5.f21546A.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f21683c;
            if (!fragment6.j0) {
                fragment6.i0 = true;
            }
        }
    }

    public void p() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f21683c);
        }
        View C = this.f21683c.C();
        if (C != null && l(C)) {
            boolean requestFocus = C.requestFocus();
            if (FragmentManager.N0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(C);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f21683c);
                sb.append(" resulting in focused view ");
                sb.append(this.f21683c.h0.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f21683c.I1((View) null);
        this.f21683c.t1();
        this.f21681a.i(this.f21683c, false);
        Fragment fragment = this.f21683c;
        fragment.f21546A = null;
        fragment.f21547B = null;
        fragment.C = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.f21683c.u1(bundle);
        this.f21681a.j(this.f21683c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f21683c.h0 != null) {
            t();
        }
        if (this.f21683c.f21547B != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f21683c.f21547B);
        }
        if (this.f21683c.C != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f21683c.C);
        }
        if (!this.f21683c.j0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f21683c.j0);
        }
        return bundle;
    }

    public Fragment.SavedState r() {
        Bundle q2;
        if (this.f21683c.f21548z <= -1 || (q2 = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q2);
    }

    public void s() {
        FragmentState fragmentState = new FragmentState(this.f21683c);
        Fragment fragment = this.f21683c;
        if (fragment.f21548z <= -1 || fragmentState.L != null) {
            fragmentState.L = fragment.f21546A;
        } else {
            Bundle q2 = q();
            fragmentState.L = q2;
            if (this.f21683c.H != null) {
                if (q2 == null) {
                    fragmentState.L = new Bundle();
                }
                fragmentState.L.putString("android:target_state", this.f21683c.H);
                int i2 = this.f21683c.I;
                if (i2 != 0) {
                    fragmentState.L.putInt("android:target_req_state", i2);
                }
            }
        }
        this.f21682b.B(this.f21683c.E, fragmentState);
    }

    public void t() {
        if (this.f21683c.h0 != null) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f21683c + " with view " + this.f21683c.h0);
            }
            SparseArray sparseArray = new SparseArray();
            this.f21683c.h0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f21683c.f21547B = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f21683c.s0.g(bundle);
            if (!bundle.isEmpty()) {
                this.f21683c.C = bundle;
            }
        }
    }

    public void u(int i2) {
        this.f21685e = i2;
    }

    public void v() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f21683c);
        }
        this.f21683c.v1();
        this.f21681a.k(this.f21683c, false);
    }

    public void w() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f21683c);
        }
        this.f21683c.w1();
        this.f21681a.l(this.f21683c, false);
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, FragmentState fragmentState) {
        this.f21681a = fragmentLifecycleCallbacksDispatcher;
        this.f21682b = fragmentStore;
        Fragment a2 = fragmentState.a(fragmentFactory, classLoader);
        this.f21683c = a2;
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment, FragmentState fragmentState) {
        this.f21681a = fragmentLifecycleCallbacksDispatcher;
        this.f21682b = fragmentStore;
        this.f21683c = fragment;
        fragment.f21547B = null;
        fragment.C = null;
        fragment.R = 0;
        fragment.O = false;
        fragment.K = false;
        Fragment fragment2 = fragment.G;
        fragment.H = fragment2 != null ? fragment2.E : null;
        fragment.G = null;
        Bundle bundle = fragmentState.L;
        if (bundle != null) {
            fragment.f21546A = bundle;
        } else {
            fragment.f21546A = new Bundle();
        }
    }
}
