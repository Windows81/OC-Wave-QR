package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata
public abstract class NavigatorState {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f22435a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    public final MutableStateFlow f22436b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableStateFlow f22437c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22438d;

    /* renamed from: e  reason: collision with root package name */
    public final StateFlow f22439e;

    /* renamed from: f  reason: collision with root package name */
    public final StateFlow f22440f;

    public NavigatorState() {
        MutableStateFlow a2 = StateFlowKt.a(CollectionsKt.m());
        this.f22436b = a2;
        MutableStateFlow a3 = StateFlowKt.a(SetsKt.d());
        this.f22437c = a3;
        this.f22439e = FlowKt.e(a2);
        this.f22440f = FlowKt.e(a3);
    }

    public abstract NavBackStackEntry a(NavDestination navDestination, Bundle bundle);

    public final StateFlow b() {
        return this.f22439e;
    }

    public final StateFlow c() {
        return this.f22440f;
    }

    public final boolean d() {
        return this.f22438d;
    }

    public void e(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "entry");
        MutableStateFlow mutableStateFlow = this.f22437c;
        mutableStateFlow.setValue(SetsKt.g((Set) mutableStateFlow.getValue(), navBackStackEntry));
    }

    public void f(NavBackStackEntry navBackStackEntry) {
        int i2;
        Intrinsics.i(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f22435a;
        reentrantLock.lock();
        try {
            List P0 = CollectionsKt.P0((Collection) this.f22439e.getValue());
            ListIterator listIterator = P0.listIterator(P0.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (Intrinsics.d(((NavBackStackEntry) listIterator.previous()).h(), navBackStackEntry.h())) {
                        i2 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            P0.set(i2, navBackStackEntry);
            this.f22436b.setValue(P0);
            Unit unit = Unit.f40552a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void g(NavBackStackEntry navBackStackEntry, boolean z2) {
        Intrinsics.i(navBackStackEntry, "popUpTo");
        ReentrantLock reentrantLock = this.f22435a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.f22436b;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) mutableStateFlow.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d((NavBackStackEntry) next, navBackStackEntry)) {
                    break;
                }
                arrayList.add(next);
            }
            mutableStateFlow.setValue(arrayList);
            Unit unit = Unit.f40552a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void h(NavBackStackEntry navBackStackEntry, boolean z2) {
        Object obj;
        Intrinsics.i(navBackStackEntry, "popUpTo");
        Iterable iterable = (Iterable) this.f22437c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable<NavBackStackEntry> iterable2 = (Iterable) this.f22439e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (NavBackStackEntry navBackStackEntry2 : iterable2) {
                            if (navBackStackEntry2 == navBackStackEntry) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        MutableStateFlow mutableStateFlow = this.f22437c;
        mutableStateFlow.setValue(SetsKt.i((Set) mutableStateFlow.getValue(), navBackStackEntry));
        List list = (List) this.f22439e.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
            if (!Intrinsics.d(navBackStackEntry3, navBackStackEntry) && ((List) this.f22439e.getValue()).lastIndexOf(navBackStackEntry3) < ((List) this.f22439e.getValue()).lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj;
        if (navBackStackEntry4 != null) {
            MutableStateFlow mutableStateFlow2 = this.f22437c;
            mutableStateFlow2.setValue(SetsKt.i((Set) mutableStateFlow2.getValue(), navBackStackEntry4));
        }
        g(navBackStackEntry, z2);
    }

    public void i(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "entry");
        MutableStateFlow mutableStateFlow = this.f22437c;
        mutableStateFlow.setValue(SetsKt.i((Set) mutableStateFlow.getValue(), navBackStackEntry));
    }

    public void j(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f22435a;
        reentrantLock.lock();
        try {
            MutableStateFlow mutableStateFlow = this.f22436b;
            mutableStateFlow.setValue(CollectionsKt.y0((Collection) mutableStateFlow.getValue(), navBackStackEntry));
            Unit unit = Unit.f40552a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k(NavBackStackEntry navBackStackEntry) {
        Intrinsics.i(navBackStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this.f22437c.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable<NavBackStackEntry> iterable2 = (Iterable) this.f22439e.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (NavBackStackEntry navBackStackEntry2 : iterable2) {
                            if (navBackStackEntry2 == navBackStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt.q0((List) this.f22439e.getValue());
        if (navBackStackEntry3 != null) {
            MutableStateFlow mutableStateFlow = this.f22437c;
            mutableStateFlow.setValue(SetsKt.i((Set) mutableStateFlow.getValue(), navBackStackEntry3));
        }
        MutableStateFlow mutableStateFlow2 = this.f22437c;
        mutableStateFlow2.setValue(SetsKt.i((Set) mutableStateFlow2.getValue(), navBackStackEntry));
        j(navBackStackEntry);
    }

    public final void l(boolean z2) {
        this.f22438d = z2;
    }
}
