package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

abstract class SpecialEffectsController {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f21765a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f21766b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f21767c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f21768d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21769e = false;

    /* renamed from: androidx.fragment.app.SpecialEffectsController$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21774a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21775b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21775b = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21775b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f21775b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f21774a = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f21774a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f21774a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f21774a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.AnonymousClass3.<clinit>():void");
        }
    }

    public static class FragmentStateManagerOperation extends Operation {

        /* renamed from: h  reason: collision with root package name */
        public final FragmentStateManager f21776h;

        public FragmentStateManagerOperation(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager, CancellationSignal cancellationSignal) {
            super(state, lifecycleImpact, fragmentStateManager.k(), cancellationSignal);
            this.f21776h = fragmentStateManager;
        }

        public void c() {
            super.c();
            this.f21776h.m();
        }

        public void l() {
            if (g() == Operation.LifecycleImpact.ADDING) {
                Fragment k2 = this.f21776h.k();
                View findFocus = k2.h0.findFocus();
                if (findFocus != null) {
                    k2.I1(findFocus);
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k2);
                    }
                }
                View C1 = f().C1();
                if (C1.getParent() == null) {
                    this.f21776h.b();
                    C1.setAlpha(0.0f);
                }
                if (C1.getAlpha() == 0.0f && C1.getVisibility() == 0) {
                    C1.setVisibility(4);
                }
                C1.setAlpha(k2.N());
            } else if (g() == Operation.LifecycleImpact.REMOVING) {
                Fragment k3 = this.f21776h.k();
                View C12 = k3.C1();
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + C12.findFocus() + " on view " + C12 + " for Fragment " + k3);
                }
                C12.clearFocus();
            }
        }
    }

    public static class Operation {

        /* renamed from: a  reason: collision with root package name */
        public State f21777a;

        /* renamed from: b  reason: collision with root package name */
        public LifecycleImpact f21778b;

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f21779c;

        /* renamed from: d  reason: collision with root package name */
        public final List f21780d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet f21781e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        public boolean f21782f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f21783g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State f(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            public static State h(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : f(view.getVisibility());
            }

            public void d(View view) {
                int i2 = AnonymousClass3.f21774a[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i2 == 2) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i2 == 3) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i2 == 4) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, CancellationSignal cancellationSignal) {
            this.f21777a = state;
            this.f21778b = lifecycleImpact;
            this.f21779c = fragment;
            cancellationSignal.c(new CancellationSignal.OnCancelListener() {
                public void onCancel() {
                    Operation.this.b();
                }
            });
        }

        public final void a(Runnable runnable) {
            this.f21780d.add(runnable);
        }

        public final void b() {
            if (!h()) {
                this.f21782f = true;
                if (this.f21781e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f21781e).iterator();
                while (it.hasNext()) {
                    ((CancellationSignal) it.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f21783g) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f21783g = true;
                for (Runnable run : this.f21780d) {
                    run.run();
                }
            }
        }

        public final void d(CancellationSignal cancellationSignal) {
            if (this.f21781e.remove(cancellationSignal) && this.f21781e.isEmpty()) {
                c();
            }
        }

        public State e() {
            return this.f21777a;
        }

        public final Fragment f() {
            return this.f21779c;
        }

        public LifecycleImpact g() {
            return this.f21778b;
        }

        public final boolean h() {
            return this.f21782f;
        }

        public final boolean i() {
            return this.f21783g;
        }

        public final void j(CancellationSignal cancellationSignal) {
            l();
            this.f21781e.add(cancellationSignal);
        }

        public final void k(State state, LifecycleImpact lifecycleImpact) {
            int i2 = AnonymousClass3.f21775b[lifecycleImpact.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f21779c + " mFinalState = " + this.f21777a + " -> REMOVED. mLifecycleImpact  = " + this.f21778b + " to REMOVING.");
                    }
                    this.f21777a = State.REMOVED;
                    this.f21778b = LifecycleImpact.REMOVING;
                } else if (i2 == 3 && this.f21777a != State.REMOVED) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f21779c + " mFinalState = " + this.f21777a + " -> " + state + ". ");
                    }
                    this.f21777a = state;
                }
            } else if (this.f21777a == State.REMOVED) {
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f21779c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f21778b + " to ADDING.");
                }
                this.f21777a = State.VISIBLE;
                this.f21778b = LifecycleImpact.ADDING;
            }
        }

        public void l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f21777a + "} " + "{" + "mLifecycleImpact = " + this.f21778b + "} " + "{" + "mFragment = " + this.f21779c + "}";
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f21765a = viewGroup;
    }

    public static SpecialEffectsController n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.F0());
    }

    public static SpecialEffectsController o(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        Object tag = viewGroup.getTag(R.id.f21479b);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController a2 = specialEffectsControllerFactory.a(viewGroup);
        viewGroup.setTag(R.id.f21479b, a2);
        return a2;
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.f21766b) {
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                Operation h2 = h(fragmentStateManager.k());
                if (h2 != null) {
                    h2.k(state, lifecycleImpact);
                    return;
                }
                final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
                this.f21766b.add(fragmentStateManagerOperation);
                fragmentStateManagerOperation.a(new Runnable() {
                    public void run() {
                        if (SpecialEffectsController.this.f21766b.contains(fragmentStateManagerOperation)) {
                            fragmentStateManagerOperation.e().d(fragmentStateManagerOperation.f().h0);
                        }
                    }
                });
                fragmentStateManagerOperation.a(new Runnable() {
                    public void run() {
                        SpecialEffectsController.this.f21766b.remove(fragmentStateManagerOperation);
                        SpecialEffectsController.this.f21767c.remove(fragmentStateManagerOperation);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Operation.State state, FragmentStateManager fragmentStateManager) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        a(state, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public void c(FragmentStateManager fragmentStateManager) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        a(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public void d(FragmentStateManager fragmentStateManager) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public void e(FragmentStateManager fragmentStateManager) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void f(List list, boolean z2);

    public void g() {
        if (!this.f21769e) {
            if (!ViewCompat.C(this.f21765a)) {
                j();
                this.f21768d = false;
                return;
            }
            synchronized (this.f21766b) {
                try {
                    if (!this.f21766b.isEmpty()) {
                        ArrayList arrayList = new ArrayList(this.f21767c);
                        this.f21767c.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Operation operation = (Operation) it.next();
                            if (FragmentManager.N0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                            }
                            operation.b();
                            if (!operation.i()) {
                                this.f21767c.add(operation);
                            }
                        }
                        q();
                        ArrayList arrayList2 = new ArrayList(this.f21766b);
                        this.f21766b.clear();
                        this.f21767c.addAll(arrayList2);
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((Operation) it2.next()).l();
                        }
                        f(arrayList2, this.f21768d);
                        this.f21768d = false;
                        if (FragmentManager.N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final Operation h(Fragment fragment) {
        Iterator it = this.f21766b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    public final Operation i(Fragment fragment) {
        Iterator it = this.f21767c.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    public void j() {
        String str;
        String str2;
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean C = ViewCompat.C(this.f21765a);
        synchronized (this.f21766b) {
            try {
                q();
                Iterator it = this.f21766b.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).l();
                }
                Iterator it2 = new ArrayList(this.f21767c).iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (FragmentManager.N0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (C) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f21765a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(operation);
                        Log.v("FragmentManager", sb.toString());
                    }
                    operation.b();
                }
                Iterator it3 = new ArrayList(this.f21766b).iterator();
                while (it3.hasNext()) {
                    Operation operation2 = (Operation) it3.next();
                    if (FragmentManager.N0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (C) {
                            str = "";
                        } else {
                            str = "Container " + this.f21765a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(operation2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    operation2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        if (this.f21769e) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f21769e = false;
            g();
        }
    }

    public Operation.LifecycleImpact l(FragmentStateManager fragmentStateManager) {
        Operation h2 = h(fragmentStateManager.k());
        Operation.LifecycleImpact g2 = h2 != null ? h2.g() : null;
        Operation i2 = i(fragmentStateManager.k());
        return (i2 == null || !(g2 == null || g2 == Operation.LifecycleImpact.NONE)) ? g2 : i2.g();
    }

    public ViewGroup m() {
        return this.f21765a;
    }

    public void p() {
        synchronized (this.f21766b) {
            try {
                q();
                this.f21769e = false;
                int size = this.f21766b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    Operation operation = (Operation) this.f21766b.get(size);
                    Operation.State h2 = Operation.State.h(operation.f().h0);
                    Operation.State e2 = operation.e();
                    Operation.State state = Operation.State.VISIBLE;
                    if (e2 == state && h2 != state) {
                        this.f21769e = operation.f().n0();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        Iterator it = this.f21766b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.g() == Operation.LifecycleImpact.ADDING) {
                operation.k(Operation.State.f(operation.f().C1().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public void r(boolean z2) {
        this.f21768d = z2;
    }
}
