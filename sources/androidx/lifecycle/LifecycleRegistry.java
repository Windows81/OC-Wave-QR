package androidx.lifecycle;

import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata
public class LifecycleRegistry extends Lifecycle {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f21909k = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21910b;

    /* renamed from: c  reason: collision with root package name */
    public FastSafeIterableMap f21911c;

    /* renamed from: d  reason: collision with root package name */
    public Lifecycle.State f21912d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f21913e;

    /* renamed from: f  reason: collision with root package name */
    public int f21914f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21915g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21916h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f21917i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableStateFlow f21918j;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleRegistry a(LifecycleOwner lifecycleOwner) {
            Intrinsics.i(lifecycleOwner, "owner");
            return new LifecycleRegistry(lifecycleOwner, false, (DefaultConstructorMarker) null);
        }

        public final Lifecycle.State b(Lifecycle.State state, Lifecycle.State state2) {
            Intrinsics.i(state, "state1");
            return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ObserverWithState {

        /* renamed from: a  reason: collision with root package name */
        public Lifecycle.State f21919a;

        /* renamed from: b  reason: collision with root package name */
        public LifecycleEventObserver f21920b;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            Intrinsics.i(state, "initialState");
            Intrinsics.f(lifecycleObserver);
            this.f21920b = Lifecycling.f(lifecycleObserver);
            this.f21919a = state;
        }

        public final void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Intrinsics.i(event, "event");
            Lifecycle.State f2 = event.f();
            this.f21919a = LifecycleRegistry.f21909k.b(this.f21919a, f2);
            LifecycleEventObserver lifecycleEventObserver = this.f21920b;
            Intrinsics.f(lifecycleOwner);
            lifecycleEventObserver.j(lifecycleOwner, event);
            this.f21919a = f2;
        }

        public final Lifecycle.State b() {
            return this.f21919a;
        }
    }

    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, z2);
    }

    public void a(LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner;
        Intrinsics.i(lifecycleObserver, "observer");
        g("addObserver");
        Lifecycle.State state = this.f21912d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(lifecycleObserver, state2);
        if (((ObserverWithState) this.f21911c.n(lifecycleObserver, observerWithState)) == null && (lifecycleOwner = (LifecycleOwner) this.f21913e.get()) != null) {
            boolean z2 = this.f21914f != 0 || this.f21915g;
            Lifecycle.State f2 = f(lifecycleObserver);
            this.f21914f++;
            while (observerWithState.b().compareTo(f2) < 0 && this.f21911c.contains(lifecycleObserver)) {
                m(observerWithState.b());
                Lifecycle.Event b2 = Lifecycle.Event.Companion.b(observerWithState.b());
                if (b2 != null) {
                    observerWithState.a(lifecycleOwner, b2);
                    l();
                    f2 = f(lifecycleObserver);
                } else {
                    throw new IllegalStateException("no event up from " + observerWithState.b());
                }
            }
            if (!z2) {
                o();
            }
            this.f21914f--;
        }
    }

    public Lifecycle.State b() {
        return this.f21912d;
    }

    public void d(LifecycleObserver lifecycleObserver) {
        Intrinsics.i(lifecycleObserver, "observer");
        g("removeObserver");
        this.f21911c.o(lifecycleObserver);
    }

    public final void e(LifecycleOwner lifecycleOwner) {
        Iterator descendingIterator = this.f21911c.descendingIterator();
        Intrinsics.h(descendingIterator, "descendingIterator(...)");
        while (descendingIterator.hasNext() && !this.f21916h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            Intrinsics.f(entry);
            LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
            ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
            while (observerWithState.b().compareTo(this.f21912d) > 0 && !this.f21916h && this.f21911c.contains(lifecycleObserver)) {
                Lifecycle.Event a2 = Lifecycle.Event.Companion.a(observerWithState.b());
                if (a2 != null) {
                    m(a2.f());
                    observerWithState.a(lifecycleOwner, a2);
                    l();
                } else {
                    throw new IllegalStateException("no event down from " + observerWithState.b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.Lifecycle.State f(androidx.lifecycle.LifecycleObserver r4) {
        /*
            r3 = this;
            androidx.arch.core.internal.FastSafeIterableMap r0 = r3.f21911c
            java.util.Map$Entry r4 = r0.p(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r4 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.Lifecycle$State r4 = r4.b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList r1 = r3.f21917i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x002d
            java.util.ArrayList r0 = r3.f21917i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
        L_0x002d:
            androidx.lifecycle.LifecycleRegistry$Companion r1 = f21909k
            androidx.lifecycle.Lifecycle$State r2 = r3.f21912d
            androidx.lifecycle.Lifecycle$State r4 = r1.b(r2, r4)
            androidx.lifecycle.Lifecycle$State r4 = r1.b(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.LifecycleRegistry.f(androidx.lifecycle.LifecycleObserver):androidx.lifecycle.Lifecycle$State");
    }

    public final void g(String str) {
        if (this.f21910b && !LifecycleRegistry_androidKt.a()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void h(LifecycleOwner lifecycleOwner) {
        SafeIterableMap.IteratorWithAdditions h2 = this.f21911c.h();
        Intrinsics.h(h2, "iteratorWithAdditions(...)");
        while (h2.hasNext() && !this.f21916h) {
            Map.Entry entry = (Map.Entry) h2.next();
            LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
            ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
            while (observerWithState.b().compareTo(this.f21912d) < 0 && !this.f21916h && this.f21911c.contains(lifecycleObserver)) {
                m(observerWithState.b());
                Lifecycle.Event b2 = Lifecycle.Event.Companion.b(observerWithState.b());
                if (b2 != null) {
                    observerWithState.a(lifecycleOwner, b2);
                    l();
                } else {
                    throw new IllegalStateException("no event up from " + observerWithState.b());
                }
            }
        }
    }

    public void i(Lifecycle.Event event) {
        Intrinsics.i(event, "event");
        g("handleLifecycleEvent");
        k(event.f());
    }

    public final boolean j() {
        if (this.f21911c.size() == 0) {
            return true;
        }
        Map.Entry e2 = this.f21911c.e();
        Intrinsics.f(e2);
        Lifecycle.State b2 = ((ObserverWithState) e2.getValue()).b();
        Map.Entry i2 = this.f21911c.i();
        Intrinsics.f(i2);
        Lifecycle.State b3 = ((ObserverWithState) i2.getValue()).b();
        return b2 == b3 && this.f21912d == b3;
    }

    public final void k(Lifecycle.State state) {
        if (this.f21912d != state) {
            LifecycleRegistryKt.a((LifecycleOwner) this.f21913e.get(), this.f21912d, state);
            this.f21912d = state;
            if (this.f21915g || this.f21914f != 0) {
                this.f21916h = true;
                return;
            }
            this.f21915g = true;
            o();
            this.f21915g = false;
            if (this.f21912d == Lifecycle.State.DESTROYED) {
                this.f21911c = new FastSafeIterableMap();
            }
        }
    }

    public final void l() {
        ArrayList arrayList = this.f21917i;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void m(Lifecycle.State state) {
        this.f21917i.add(state);
    }

    public void n(Lifecycle.State state) {
        Intrinsics.i(state, "state");
        g("setCurrentState");
        k(state);
    }

    public final void o() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f21913e.get();
        if (lifecycleOwner != null) {
            while (!j()) {
                this.f21916h = false;
                Lifecycle.State state = this.f21912d;
                Map.Entry e2 = this.f21911c.e();
                Intrinsics.f(e2);
                if (state.compareTo(((ObserverWithState) e2.getValue()).b()) < 0) {
                    e(lifecycleOwner);
                }
                Map.Entry i2 = this.f21911c.i();
                if (!this.f21916h && i2 != null && this.f21912d.compareTo(((ObserverWithState) i2.getValue()).b()) > 0) {
                    h(lifecycleOwner);
                }
            }
            this.f21916h = false;
            this.f21918j.setValue(b());
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z2) {
        this.f21910b = z2;
        this.f21911c = new FastSafeIterableMap();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.f21912d = state;
        this.f21917i = new ArrayList();
        this.f21913e = new WeakReference(lifecycleOwner);
        this.f21918j = StateFlowKt.a(state);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
        Intrinsics.i(lifecycleOwner, "provider");
    }
}
