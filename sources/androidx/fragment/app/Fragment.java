package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ActivityResultCaller {
    public static final Object A0 = new Object();

    /* renamed from: A  reason: collision with root package name */
    public Bundle f21546A;

    /* renamed from: B  reason: collision with root package name */
    public SparseArray f21547B;
    public Bundle C;
    public Boolean D;
    public String E = UUID.randomUUID().toString();
    public Bundle F;
    public Fragment G;
    public String H = null;
    public int I;
    public Boolean J = null;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public FragmentManager S;
    public FragmentHostCallback T;
    public FragmentManager U = new FragmentManagerImpl();
    public Fragment V;
    public int W;
    public int X;
    public String Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0 = true;
    public boolean f0;
    public ViewGroup g0;
    public View h0;
    public boolean i0;
    public boolean j0 = true;
    public AnimationInfo k0;
    public Runnable l0 = new Runnable() {
        public void run() {
            Fragment.this.V1();
        }
    };
    public boolean m0;
    public LayoutInflater n0;
    public boolean o0;
    public String p0;
    public Lifecycle.State q0 = Lifecycle.State.RESUMED;
    public LifecycleRegistry r0;
    public FragmentViewLifecycleOwner s0;
    public MutableLiveData t0 = new MutableLiveData();
    public ViewModelProvider.Factory u0;
    public SavedStateRegistryController v0;
    public int w0;
    public final AtomicInteger x0 = new AtomicInteger();
    public final ArrayList y0 = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public int f21548z = -1;
    public final OnPreAttachedListener z0 = new OnPreAttachedListener() {
        public void a() {
            Fragment.this.v0.c();
            SavedStateHandleSupport.c(Fragment.this);
        }
    };

    /* renamed from: androidx.fragment.app.Fragment$10  reason: invalid class name */
    class AnonymousClass10 extends ActivityResultLauncher<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f21550a;

        public void b(Object obj, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f21550a.get();
            if (activityResultLauncher != null) {
                activityResultLauncher.b(obj, activityOptionsCompat);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        public void c() {
            ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f21550a.getAndSet((Object) null);
            if (activityResultLauncher != null) {
                activityResultLauncher.c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$7  reason: invalid class name */
    class AnonymousClass7 implements Function<Void, ActivityResultRegistry> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f21557a;

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            Fragment fragment = this.f21557a;
            FragmentHostCallback fragmentHostCallback = fragment.T;
            return fragmentHostCallback instanceof ActivityResultRegistryOwner ? ((ActivityResultRegistryOwner) fragmentHostCallback).p() : fragment.A1().p();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$8  reason: invalid class name */
    class AnonymousClass8 implements Function<Void, ActivityResultRegistry> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f21558a;

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            return this.f21558a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$9  reason: invalid class name */
    class AnonymousClass9 extends OnPreAttachedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Function f21559a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f21560b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ActivityResultContract f21561c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ActivityResultCallback f21562d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Fragment f21563e;

        public void a() {
            this.f21560b.set(((ActivityResultRegistry) this.f21559a.apply((Object) null)).m(this.f21563e.k(), this.f21563e, this.f21561c, this.f21562d));
        }
    }

    public static class AnimationInfo {

        /* renamed from: a  reason: collision with root package name */
        public View f21564a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f21565b;

        /* renamed from: c  reason: collision with root package name */
        public int f21566c;

        /* renamed from: d  reason: collision with root package name */
        public int f21567d;

        /* renamed from: e  reason: collision with root package name */
        public int f21568e;

        /* renamed from: f  reason: collision with root package name */
        public int f21569f;

        /* renamed from: g  reason: collision with root package name */
        public int f21570g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList f21571h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList f21572i;

        /* renamed from: j  reason: collision with root package name */
        public Object f21573j = null;

        /* renamed from: k  reason: collision with root package name */
        public Object f21574k;

        /* renamed from: l  reason: collision with root package name */
        public Object f21575l;

        /* renamed from: m  reason: collision with root package name */
        public Object f21576m;

        /* renamed from: n  reason: collision with root package name */
        public Object f21577n;

        /* renamed from: o  reason: collision with root package name */
        public Object f21578o;

        /* renamed from: p  reason: collision with root package name */
        public Boolean f21579p;

        /* renamed from: q  reason: collision with root package name */
        public Boolean f21580q;

        /* renamed from: r  reason: collision with root package name */
        public SharedElementCallback f21581r;

        /* renamed from: s  reason: collision with root package name */
        public SharedElementCallback f21582s;

        /* renamed from: t  reason: collision with root package name */
        public float f21583t;

        /* renamed from: u  reason: collision with root package name */
        public View f21584u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f21585v;

        public AnimationInfo() {
            Object obj = Fragment.A0;
            this.f21574k = obj;
            this.f21575l = null;
            this.f21576m = obj;
            this.f21577n = null;
            this.f21578o = obj;
            this.f21581r = null;
            this.f21582s = null;
            this.f21583t = 1.0f;
            this.f21584u = null;
        }
    }

    public static class Api19Impl {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class OnPreAttachedListener {
        public OnPreAttachedListener() {
        }

        public abstract void a();
    }

    public Fragment() {
        e0();
    }

    public static Fragment g0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) FragmentFactory.d(context.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.H1(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public Object A() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f21575l;
    }

    public Animation A0(int i2, boolean z2, int i3) {
        return null;
    }

    public final FragmentActivity A1() {
        FragmentActivity l2 = l();
        if (l2 != null) {
            return l2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public SharedElementCallback B() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f21582s;
    }

    public Animator B0(int i2, boolean z2, int i3) {
        return null;
    }

    public final Context B1() {
        Context u2 = u();
        if (u2 != null) {
            return u2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public View C() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f21584u;
    }

    public void C0(Menu menu, MenuInflater menuInflater) {
    }

    public final View C1() {
        View c02 = c0();
        if (c02 != null) {
            return c02;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final Object D() {
        FragmentHostCallback fragmentHostCallback = this.T;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.r();
    }

    public View D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.w0;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public void D1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.U.q1(parcelable);
            this.U.E();
        }
    }

    public final int E() {
        return this.W;
    }

    public void E0() {
        this.f0 = true;
    }

    public final void E1() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.h0 != null) {
            F1(this.f21546A);
        }
        this.f21546A = null;
    }

    public LayoutInflater F(Bundle bundle) {
        FragmentHostCallback fragmentHostCallback = this.T;
        if (fragmentHostCallback != null) {
            LayoutInflater t2 = fragmentHostCallback.t();
            LayoutInflaterCompat.a(t2, this.U.B0());
            return t2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void F0() {
    }

    public final void F1(Bundle bundle) {
        SparseArray sparseArray = this.f21547B;
        if (sparseArray != null) {
            this.h0.restoreHierarchyState(sparseArray);
            this.f21547B = null;
        }
        if (this.h0 != null) {
            this.s0.f(this.C);
            this.C = null;
        }
        this.f0 = false;
        Z0(bundle);
        if (!this.f0) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.h0 != null) {
            this.s0.b(Lifecycle.Event.ON_CREATE);
        }
    }

    public final int G() {
        Lifecycle.State state = this.q0;
        return (state == Lifecycle.State.INITIALIZED || this.V == null) ? state.ordinal() : Math.min(state.ordinal(), this.V.G());
    }

    public void G0() {
        this.f0 = true;
    }

    public void G1(int i2, int i3, int i4, int i5) {
        if (this.k0 != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            i().f21566c = i2;
            i().f21567d = i3;
            i().f21568e = i4;
            i().f21569f = i5;
        }
    }

    public int H() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f21570g;
    }

    public void H0() {
        this.f0 = true;
    }

    public void H1(Bundle bundle) {
        if (this.S == null || !q0()) {
            this.F = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final Fragment I() {
        return this.V;
    }

    public LayoutInflater I0(Bundle bundle) {
        return F(bundle);
    }

    public void I1(View view) {
        i().f21584u = view;
    }

    public final FragmentManager J() {
        FragmentManager fragmentManager = this.S;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void J0(boolean z2) {
    }

    public void J1(boolean z2) {
        if (this.d0 != z2) {
            this.d0 = z2;
            if (h0() && !j0()) {
                this.T.A();
            }
        }
    }

    public boolean K() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.f21565b;
    }

    public void K0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f0 = true;
    }

    public void K1(SavedState savedState) {
        Bundle bundle;
        if (this.S == null) {
            if (savedState == null || (bundle = savedState.f21586z) == null) {
                bundle = null;
            }
            this.f21546A = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public int L() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f21568e;
    }

    public void L0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f0 = true;
        FragmentHostCallback fragmentHostCallback = this.T;
        Activity i2 = fragmentHostCallback == null ? null : fragmentHostCallback.i();
        if (i2 != null) {
            this.f0 = false;
            K0(i2, attributeSet, bundle);
        }
    }

    public void L1(boolean z2) {
        if (this.e0 != z2) {
            this.e0 = z2;
            if (this.d0 && h0() && !j0()) {
                this.T.A();
            }
        }
    }

    public int M() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f21569f;
    }

    public void M0(boolean z2) {
    }

    public void M1(int i2) {
        if (this.k0 != null || i2 != 0) {
            i();
            this.k0.f21570g = i2;
        }
    }

    public float N() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return 1.0f;
        }
        return animationInfo.f21583t;
    }

    public boolean N0(MenuItem menuItem) {
        return false;
    }

    public void N1(boolean z2) {
        if (this.k0 != null) {
            i().f21565b = z2;
        }
    }

    public Object O() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f21576m;
        return obj == A0 ? A() : obj;
    }

    public void O0(Menu menu) {
    }

    public void O1(float f2) {
        i().f21583t = f2;
    }

    public final Resources P() {
        return B1().getResources();
    }

    public void P0() {
        this.f0 = true;
    }

    public void P1(boolean z2) {
        FragmentStrictMode.m(this);
        this.b0 = z2;
        FragmentManager fragmentManager = this.S;
        if (fragmentManager == null) {
            this.c0 = true;
        } else if (z2) {
            fragmentManager.l(this);
        } else {
            fragmentManager.n1(this);
        }
    }

    public final boolean Q() {
        FragmentStrictMode.j(this);
        return this.b0;
    }

    public void Q0(boolean z2) {
    }

    public void Q1(ArrayList arrayList, ArrayList arrayList2) {
        i();
        AnimationInfo animationInfo = this.k0;
        animationInfo.f21571h = arrayList;
        animationInfo.f21572i = arrayList2;
    }

    public Object R() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f21574k;
        return obj == A0 ? x() : obj;
    }

    public void R0(Menu menu) {
    }

    public void R1(boolean z2) {
        FragmentStrictMode.n(this, z2);
        if (!this.j0 && z2 && this.f21548z < 5 && this.S != null && h0() && this.o0) {
            FragmentManager fragmentManager = this.S;
            fragmentManager.d1(fragmentManager.y(this));
        }
        this.j0 = z2;
        this.i0 = this.f21548z < 5 && !z2;
        if (this.f21546A != null) {
            this.D = Boolean.valueOf(z2);
        }
    }

    public Object S() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f21577n;
    }

    public void S0(boolean z2) {
    }

    public void S1(Intent intent) {
        T1(intent, (Bundle) null);
    }

    public Object T() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f21578o;
        return obj == A0 ? S() : obj;
    }

    public void T0(int i2, String[] strArr, int[] iArr) {
    }

    public void T1(Intent intent, Bundle bundle) {
        FragmentHostCallback fragmentHostCallback = this.T;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.w(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f21571h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList U() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.k0
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f21571h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.U():java.util.ArrayList");
    }

    public void U0() {
        this.f0 = true;
    }

    public void U1(Intent intent, int i2, Bundle bundle) {
        if (this.T != null) {
            J().Z0(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f21572i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList V() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.k0
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f21572i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.V():java.util.ArrayList");
    }

    public void V0(Bundle bundle) {
    }

    public void V1() {
        if (this.k0 != null && i().f21585v) {
            if (this.T == null) {
                i().f21585v = false;
            } else if (Looper.myLooper() != this.T.m().getLooper()) {
                this.T.m().postAtFrontOfQueue(new Runnable() {
                    public void run() {
                        Fragment.this.f(false);
                    }
                });
            } else {
                f(true);
            }
        }
    }

    public final String W(int i2) {
        return P().getString(i2);
    }

    public void W0() {
        this.f0 = true;
    }

    public void W1(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public final String X() {
        return this.Y;
    }

    public void X0() {
        this.f0 = true;
    }

    public final Fragment Y() {
        return Z(true);
    }

    public void Y0(View view, Bundle bundle) {
    }

    public final Fragment Z(boolean z2) {
        String str;
        if (z2) {
            FragmentStrictMode.l(this);
        }
        Fragment fragment = this.G;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.S;
        if (fragmentManager == null || (str = this.H) == null) {
            return null;
        }
        return fragmentManager.i0(str);
    }

    public void Z0(Bundle bundle) {
        this.f0 = true;
    }

    public Lifecycle a() {
        return this.r0;
    }

    public final int a0() {
        FragmentStrictMode.k(this);
        return this.I;
    }

    public void a1(Bundle bundle) {
        this.U.b1();
        this.f21548z = 3;
        this.f0 = false;
        t0(bundle);
        if (this.f0) {
            E1();
            this.U.A();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public boolean b0() {
        return this.j0;
    }

    public void b1() {
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((OnPreAttachedListener) it.next()).a();
        }
        this.y0.clear();
        this.U.n(this.T, g(), this);
        this.f21548z = 0;
        this.f0 = false;
        w0(this.T.l());
        if (this.f0) {
            this.S.K(this);
            this.U.B();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
    }

    public View c0() {
        return this.h0;
    }

    public void c1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.U.V0(configuration);
    }

    public LiveData d0() {
        return this.t0;
    }

    public boolean d1(MenuItem menuItem) {
        if (this.Z) {
            return false;
        }
        if (y0(menuItem)) {
            return true;
        }
        return this.U.D(menuItem);
    }

    public final void e0() {
        this.r0 = new LifecycleRegistry(this);
        this.v0 = SavedStateRegistryController.a(this);
        this.u0 = null;
        if (!this.y0.contains(this.z0)) {
            z1(this.z0);
        }
    }

    public void e1(Bundle bundle) {
        this.U.b1();
        this.f21548z = 1;
        this.f0 = false;
        this.r0.a(new LifecycleEventObserver() {
            public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.h0) != null) {
                    Api19Impl.a(view);
                }
            }
        });
        this.v0.d(bundle);
        z0(bundle);
        this.o0 = true;
        if (this.f0) {
            this.r0.i(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(boolean z2) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        AnimationInfo animationInfo = this.k0;
        if (animationInfo != null) {
            animationInfo.f21585v = false;
        }
        if (this.h0 != null && (viewGroup = this.g0) != null && (fragmentManager = this.S) != null) {
            final SpecialEffectsController n2 = SpecialEffectsController.n(viewGroup, fragmentManager);
            n2.p();
            if (z2) {
                this.T.m().post(new Runnable() {
                    public void run() {
                        n2.g();
                    }
                });
            } else {
                n2.g();
            }
        }
    }

    public void f0() {
        e0();
        this.p0 = this.E;
        this.E = UUID.randomUUID().toString();
        this.K = false;
        this.L = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.R = 0;
        this.S = null;
        this.U = new FragmentManagerImpl();
        this.T = null;
        this.W = 0;
        this.X = 0;
        this.Y = null;
        this.Z = false;
        this.a0 = false;
    }

    public boolean f1(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.Z) {
            return false;
        }
        if (this.d0 && this.e0) {
            C0(menu, menuInflater);
            z2 = true;
        }
        return z2 | this.U.F(menu, menuInflater);
    }

    public FragmentContainer g() {
        return new FragmentContainer() {
            public View f(int i2) {
                View view = Fragment.this.h0;
                if (view != null) {
                    return view.findViewById(i2);
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
            }

            public boolean h() {
                return Fragment.this.h0 != null;
            }
        };
    }

    public void g1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.U.b1();
        this.Q = true;
        this.s0 = new FragmentViewLifecycleOwner(this, s());
        View D0 = D0(layoutInflater, viewGroup, bundle);
        this.h0 = D0;
        if (D0 != null) {
            this.s0.d();
            ViewTreeLifecycleOwner.b(this.h0, this.s0);
            ViewTreeViewModelStoreOwner.b(this.h0, this.s0);
            ViewTreeSavedStateRegistryOwner.b(this.h0, this.s0);
            this.t0.o(this.s0);
        } else if (!this.s0.e()) {
            this.s0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.W));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.X));
        printWriter.print(" mTag=");
        printWriter.println(this.Y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f21548z);
        printWriter.print(" mWho=");
        printWriter.print(this.E);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.R);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.K);
        printWriter.print(" mRemoving=");
        printWriter.print(this.L);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.N);
        printWriter.print(" mInLayout=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.Z);
        printWriter.print(" mDetached=");
        printWriter.print(this.a0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.e0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.d0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.b0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.j0);
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.T);
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.V);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.F);
        }
        if (this.f21546A != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f21546A);
        }
        if (this.f21547B != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f21547B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.C);
        }
        Fragment Z2 = Z(false);
        if (Z2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(Z2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.I);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(K());
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(w());
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(z());
        }
        if (L() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(L());
        }
        if (M() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(M());
        }
        if (this.g0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.g0);
        }
        if (this.h0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.h0);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (u() != null) {
            LoaderManager.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.U + ":");
        FragmentManager fragmentManager = this.U;
        fragmentManager.Z(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean h0() {
        return this.T != null && this.K;
    }

    public void h1() {
        this.U.G();
        this.r0.i(Lifecycle.Event.ON_DESTROY);
        this.f21548z = 0;
        this.f0 = false;
        this.o0 = false;
        E0();
        if (!this.f0) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final AnimationInfo i() {
        if (this.k0 == null) {
            this.k0 = new AnimationInfo();
        }
        return this.k0;
    }

    public final boolean i0() {
        return this.a0;
    }

    public void i1() {
        this.U.H();
        if (this.h0 != null && this.s0.a().b().f(Lifecycle.State.CREATED)) {
            this.s0.b(Lifecycle.Event.ON_DESTROY);
        }
        this.f21548z = 1;
        this.f0 = false;
        G0();
        if (this.f0) {
            LoaderManager.b(this).c();
            this.Q = false;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public Fragment j(String str) {
        return str.equals(this.E) ? this : this.U.m0(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j0() {
        /*
            r2 = this;
            boolean r0 = r2.Z
            if (r0 != 0) goto L_0x0013
            androidx.fragment.app.FragmentManager r0 = r2.S
            if (r0 == 0) goto L_0x0011
            androidx.fragment.app.Fragment r1 = r2.V
            boolean r0 = r0.P0(r1)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.j0():boolean");
    }

    public void j1() {
        this.f21548z = -1;
        this.f0 = false;
        H0();
        this.n0 = null;
        if (!this.f0) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.U.M0()) {
            this.U.G();
            this.U = new FragmentManagerImpl();
        }
    }

    public String k() {
        return "fragment_" + this.E + "_rq#" + this.x0.getAndIncrement();
    }

    public final boolean k0() {
        return this.R > 0;
    }

    public LayoutInflater k1(Bundle bundle) {
        LayoutInflater I0 = I0(bundle);
        this.n0 = I0;
        return I0;
    }

    public final FragmentActivity l() {
        FragmentHostCallback fragmentHostCallback = this.T;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (FragmentActivity) fragmentHostCallback.i();
    }

    public final boolean l0() {
        return this.O;
    }

    public void l1() {
        onLowMemory();
        this.U.I();
    }

    public ViewModelProvider.Factory m() {
        Application application;
        if (this.S != null) {
            if (this.u0 == null) {
                Context applicationContext = B1().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.N0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + B1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.u0 = new SavedStateViewModelFactory(application, this, r());
            }
            return this.u0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m0() {
        /*
            r2 = this;
            boolean r0 = r2.e0
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.S
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.V
            boolean r0 = r0.Q0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.m0():boolean");
    }

    public void m1(boolean z2) {
        M0(z2);
        this.U.J(z2);
    }

    public CreationExtras n() {
        Application application;
        Context applicationContext = B1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + B1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.c(ViewModelProvider.AndroidViewModelFactory.f21999h, application);
        }
        mutableCreationExtras.c(SavedStateHandleSupport.f21969a, this);
        mutableCreationExtras.c(SavedStateHandleSupport.f21970b, this);
        if (r() != null) {
            mutableCreationExtras.c(SavedStateHandleSupport.f21971c, r());
        }
        return mutableCreationExtras;
    }

    public boolean n0() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.f21585v;
    }

    public boolean n1(MenuItem menuItem) {
        if (this.Z) {
            return false;
        }
        if (!this.d0 || !this.e0 || !N0(menuItem)) {
            return this.U.M(menuItem);
        }
        return true;
    }

    public boolean o() {
        Boolean bool;
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null || (bool = animationInfo.f21580q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean o0() {
        return this.L;
    }

    public void o1(Menu menu) {
        if (!this.Z) {
            if (this.d0 && this.e0) {
                O0(menu);
            }
            this.U.N(menu);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f0 = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        A1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f0 = true;
    }

    public boolean p() {
        Boolean bool;
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null || (bool = animationInfo.f21579p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean p0() {
        return this.f21548z >= 7;
    }

    public void p1() {
        this.U.P();
        if (this.h0 != null) {
            this.s0.b(Lifecycle.Event.ON_PAUSE);
        }
        this.r0.i(Lifecycle.Event.ON_PAUSE);
        this.f21548z = 6;
        this.f0 = false;
        P0();
        if (!this.f0) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public View q() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f21564a;
    }

    public final boolean q0() {
        FragmentManager fragmentManager = this.S;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.T0();
    }

    public void q1(boolean z2) {
        Q0(z2);
        this.U.Q(z2);
    }

    public final Bundle r() {
        return this.F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.h0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r0() {
        /*
            r1 = this;
            boolean r0 = r1.h0()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.j0()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.h0
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.h0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.r0():boolean");
    }

    public boolean r1(Menu menu) {
        boolean z2 = false;
        if (this.Z) {
            return false;
        }
        if (this.d0 && this.e0) {
            R0(menu);
            z2 = true;
        }
        return z2 | this.U.R(menu);
    }

    public ViewModelStore s() {
        if (this.S == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (G() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.S.I0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void s0() {
        this.U.b1();
    }

    public void s1() {
        boolean R0 = this.S.R0(this);
        Boolean bool = this.J;
        if (bool == null || bool.booleanValue() != R0) {
            this.J = Boolean.valueOf(R0);
            S0(R0);
            this.U.S();
        }
    }

    public void startActivityForResult(Intent intent, int i2) {
        U1(intent, i2, (Bundle) null);
    }

    public final FragmentManager t() {
        if (this.T != null) {
            return this.U;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void t0(Bundle bundle) {
        this.f0 = true;
    }

    public void t1() {
        this.U.b1();
        this.U.d0(true);
        this.f21548z = 7;
        this.f0 = false;
        U0();
        if (this.f0) {
            LifecycleRegistry lifecycleRegistry = this.r0;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            lifecycleRegistry.i(event);
            if (this.h0 != null) {
                this.s0.b(event);
            }
            this.U.T();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.E);
        if (this.W != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.W));
        }
        if (this.Y != null) {
            sb.append(" tag=");
            sb.append(this.Y);
        }
        sb.append(")");
        return sb.toString();
    }

    public Context u() {
        FragmentHostCallback fragmentHostCallback = this.T;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.l();
    }

    public void u0(int i2, int i3, Intent intent) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void u1(Bundle bundle) {
        V0(bundle);
        this.v0.e(bundle);
        Bundle s1 = this.U.U0();
        if (s1 != null) {
            bundle.putParcelable("android:support:fragments", s1);
        }
    }

    public final SavedStateRegistry v() {
        return this.v0.b();
    }

    public void v0(Activity activity) {
        this.f0 = true;
    }

    public void v1() {
        this.U.b1();
        this.U.d0(true);
        this.f21548z = 5;
        this.f0 = false;
        W0();
        if (this.f0) {
            LifecycleRegistry lifecycleRegistry = this.r0;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            lifecycleRegistry.i(event);
            if (this.h0 != null) {
                this.s0.b(event);
            }
            this.U.U();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    public int w() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f21566c;
    }

    public void w0(Context context) {
        this.f0 = true;
        FragmentHostCallback fragmentHostCallback = this.T;
        Activity i2 = fragmentHostCallback == null ? null : fragmentHostCallback.i();
        if (i2 != null) {
            this.f0 = false;
            v0(i2);
        }
    }

    public void w1() {
        this.U.W();
        if (this.h0 != null) {
            this.s0.b(Lifecycle.Event.ON_STOP);
        }
        this.r0.i(Lifecycle.Event.ON_STOP);
        this.f21548z = 4;
        this.f0 = false;
        X0();
        if (!this.f0) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public Object x() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f21573j;
    }

    public void x0(Fragment fragment) {
    }

    public void x1() {
        Y0(this.h0, this.f21546A);
        this.U.X();
    }

    public SharedElementCallback y() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f21581r;
    }

    public boolean y0(MenuItem menuItem) {
        return false;
    }

    public void y1(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public int z() {
        AnimationInfo animationInfo = this.k0;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f21567d;
    }

    public void z0(Bundle bundle) {
        this.f0 = true;
        D1(bundle);
        if (!this.U.S0(1)) {
            this.U.E();
        }
    }

    public final void z1(OnPreAttachedListener onPreAttachedListener) {
        if (this.f21548z >= 0) {
            onPreAttachedListener.a();
        } else {
            this.y0.add(onPreAttachedListener);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: z  reason: collision with root package name */
        public final Bundle f21586z;

        public SavedState(Bundle bundle) {
            this.f21586z = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeBundle(this.f21586z);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f21586z = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }
}
