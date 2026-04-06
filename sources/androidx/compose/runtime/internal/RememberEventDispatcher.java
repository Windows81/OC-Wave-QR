package androidx.compose.runtime.internal;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RememberEventDispatcher implements RememberManager {

    /* renamed from: a  reason: collision with root package name */
    public Set f15137a;

    /* renamed from: b  reason: collision with root package name */
    public CompositionErrorContext f15138b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableVector f15139c;

    /* renamed from: d  reason: collision with root package name */
    public MutableScatterSet f15140d = ScatterSetKt.a();

    /* renamed from: e  reason: collision with root package name */
    public MutableVector f15141e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableVector f15142f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableVector f15143g;

    /* renamed from: h  reason: collision with root package name */
    public MutableScatterSet f15144h;

    /* renamed from: i  reason: collision with root package name */
    public MutableScatterMap f15145i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f15146j;

    /* renamed from: k  reason: collision with root package name */
    public ScatterSet f15147k;

    public RememberEventDispatcher() {
        MutableVector mutableVector = new MutableVector(new RememberObserverHolder[16], 0);
        this.f15139c = mutableVector;
        this.f15141e = mutableVector;
        this.f15142f = new MutableVector(new Object[16], 0);
        this.f15143g = new MutableVector(new Function0[16], 0);
    }

    public static final boolean n(RememberObserverHolder rememberObserverHolder, MutableVector mutableVector) {
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            RememberObserver b2 = ((RememberObserverHolder) objArr[i2]).b();
            if (b2 instanceof PausedCompositionRemembers) {
                MutableVector a2 = ((PausedCompositionRemembers) b2).a();
                if (a2.v(rememberObserverHolder) || n(rememberObserverHolder, a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(RecomposeScopeImpl recomposeScopeImpl) {
        MutableVector mutableVector;
        MutableScatterMap mutableScatterMap = this.f15145i;
        if (mutableScatterMap != null && ((PausedCompositionRemembers) mutableScatterMap.e(recomposeScopeImpl)) != null) {
            ArrayList arrayList = this.f15146j;
            if (!(arrayList == null || (mutableVector = (MutableVector) Stack.k(arrayList)) == null)) {
                this.f15141e = mutableVector;
            }
            mutableScatterMap.u(recomposeScopeImpl);
        }
    }

    public void b(Function0 function0) {
        this.f15143g.d(function0);
    }

    public void c(RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterMap mutableScatterMap = this.f15145i;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? (PausedCompositionRemembers) mutableScatterMap.e(recomposeScopeImpl) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList arrayList = this.f15146j;
            if (arrayList == null) {
                arrayList = Stack.c((ArrayList) null, 1, (DefaultConstructorMarker) null);
                this.f15146j = arrayList;
            }
            Stack.l(arrayList, this.f15141e);
            this.f15141e = pausedCompositionRemembers.a();
        }
    }

    public void d(RememberObserverHolder rememberObserverHolder) {
        if (this.f15140d.a(rememberObserverHolder)) {
            this.f15140d.y(rememberObserverHolder);
            if (!this.f15141e.v(rememberObserverHolder) && !this.f15139c.v(rememberObserverHolder)) {
                n(rememberObserverHolder, this.f15139c);
            }
            Set set = this.f15137a;
            if (set != null) {
                set.add(rememberObserverHolder.b());
            } else {
                return;
            }
        }
        ScatterSet scatterSet = this.f15147k;
        if (scatterSet == null || !scatterSet.a(rememberObserverHolder)) {
            p(rememberObserverHolder);
        }
    }

    public void e(RememberObserverHolder rememberObserverHolder) {
        this.f15141e.d(rememberObserverHolder);
        this.f15140d.h(rememberObserverHolder);
    }

    public void f(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        MutableScatterSet mutableScatterSet = this.f15144h;
        if (mutableScatterSet == null) {
            mutableScatterSet = ScatterSetKt.a();
            this.f15144h = mutableScatterSet;
        }
        mutableScatterSet.x(composeNodeLifecycleCallback);
        p(composeNodeLifecycleCallback);
    }

    public void g(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        p(composeNodeLifecycleCallback);
    }

    public void h(RecomposeScopeImpl recomposeScopeImpl) {
        Set set = this.f15137a;
        if (set != null) {
            PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(set);
            MutableScatterMap mutableScatterMap = this.f15145i;
            if (mutableScatterMap == null) {
                mutableScatterMap = ScatterMapKt.c();
                this.f15145i = mutableScatterMap;
            }
            mutableScatterMap.x(recomposeScopeImpl, pausedCompositionRemembers);
            this.f15141e.d(new RememberObserverHolder(pausedCompositionRemembers, (Anchor) null));
        }
    }

    public final void i() {
        this.f15137a = null;
        this.f15138b = null;
        this.f15139c.l();
        this.f15140d.m();
        this.f15141e = this.f15139c;
        this.f15142f.l();
        this.f15143g.l();
        this.f15144h = null;
        this.f15145i = null;
        this.f15146j = null;
    }

    public final void j() {
        Set set = this.f15137a;
        if (set != null && !set.isEmpty()) {
            Object a2 = Trace.f15156a.a("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((RememberObserver) it.next()).e();
                }
                Unit unit = Unit.f40552a;
                Trace.f15156a.b(a2);
            } catch (Throwable th) {
                Trace.f15156a.b(a2);
                throw th;
            }
        }
    }

    public final void k(MutableVector mutableVector) {
        Set set = this.f15137a;
        if (set != null) {
            Object[] objArr = mutableVector.f15005z;
            int p2 = mutableVector.p();
            int i2 = 0;
            while (i2 < p2) {
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) objArr[i2];
                RememberObserver b2 = rememberObserverHolder.b();
                set.remove(b2);
                try {
                    b2.h();
                    Unit unit = Unit.f40552a;
                    i2++;
                } catch (Throwable th) {
                    CompositionErrorContext compositionErrorContext = this.f15138b;
                    if (compositionErrorContext != null) {
                        compositionErrorContext.e(th, rememberObserverHolder);
                    }
                    throw th;
                }
            }
        }
    }

    public final void l() {
        Object obj;
        Set set = this.f15137a;
        if (set != null) {
            this.f15147k = null;
            if (this.f15142f.p() != 0) {
                Object a2 = Trace.f15156a.a("Compose:onForgotten");
                try {
                    MutableScatterSet mutableScatterSet = this.f15144h;
                    for (int p2 = this.f15142f.p() - 1; -1 < p2; p2--) {
                        obj = this.f15142f.f15005z[p2];
                        if (obj instanceof RememberObserverHolder) {
                            RememberObserver b2 = ((RememberObserverHolder) obj).b();
                            set.remove(b2);
                            b2.f();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (mutableScatterSet == null || !mutableScatterSet.a(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).i();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).g();
                            }
                        }
                        Unit unit = Unit.f40552a;
                    }
                    Unit unit2 = Unit.f40552a;
                    Trace.f15156a.b(a2);
                } catch (Throwable th) {
                    Trace.f15156a.b(a2);
                    throw th;
                }
            }
            if (this.f15139c.p() != 0) {
                Trace trace = Trace.f15156a;
                Object a3 = trace.a("Compose:onRemembered");
                try {
                    k(this.f15139c);
                    Unit unit3 = Unit.f40552a;
                    trace.b(a3);
                } catch (Throwable th2) {
                    Trace.f15156a.b(a3);
                    throw th2;
                }
            }
        }
    }

    public final void m() {
        if (this.f15143g.p() != 0) {
            Object a2 = Trace.f15156a.a("Compose:sideeffects");
            try {
                MutableVector mutableVector = this.f15143g;
                Object[] objArr = mutableVector.f15005z;
                int p2 = mutableVector.p();
                for (int i2 = 0; i2 < p2; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                this.f15143g.l();
                Unit unit = Unit.f40552a;
                Trace.f15156a.b(a2);
            } catch (Throwable th) {
                Trace.f15156a.b(a2);
                throw th;
            }
        }
    }

    public final void o(Set set, CompositionErrorContext compositionErrorContext) {
        i();
        this.f15137a = set;
        this.f15138b = compositionErrorContext;
    }

    public final void p(Object obj) {
        this.f15142f.d(obj);
    }
}
