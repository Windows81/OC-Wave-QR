package com.google.firebase.components;

import android.util.Log;
import androidx.compose.animation.core.h;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class ComponentRuntime implements ComponentContainer, ComponentLoader {

    /* renamed from: i  reason: collision with root package name */
    public static final Provider f29751i = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Map f29752a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f29753b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f29754c;

    /* renamed from: d  reason: collision with root package name */
    public final List f29755d;

    /* renamed from: e  reason: collision with root package name */
    public Set f29756e;

    /* renamed from: f  reason: collision with root package name */
    public final EventBus f29757f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f29758g;

    /* renamed from: h  reason: collision with root package name */
    public final ComponentRegistrarProcessor f29759h;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f29760a;

        /* renamed from: b  reason: collision with root package name */
        public final List f29761b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final List f29762c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public ComponentRegistrarProcessor f29763d = ComponentRegistrarProcessor.f29750a;

        public Builder(Executor executor) {
            this.f29760a = executor;
        }

        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public Builder b(Component component) {
            this.f29762c.add(component);
            return this;
        }

        public Builder c(ComponentRegistrar componentRegistrar) {
            this.f29761b.add(new i(componentRegistrar));
            return this;
        }

        public Builder d(Collection collection) {
            this.f29761b.addAll(collection);
            return this;
        }

        public ComponentRuntime e() {
            return new ComponentRuntime(this.f29760a, this.f29761b, this.f29762c, this.f29763d);
        }

        public Builder g(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.f29763d = componentRegistrarProcessor;
            return this;
        }
    }

    public static Builder m(Executor executor) {
        return new Builder(executor);
    }

    public static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public synchronized Provider b(Qualified qualified) {
        Preconditions.c(qualified, "Null interface requested.");
        return (Provider) this.f29753b.get(qualified);
    }

    public synchronized Provider e(Qualified qualified) {
        LazySet lazySet = (LazySet) this.f29754c.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return f29751i;
    }

    public Deferred h(Qualified qualified) {
        Provider b2 = b(qualified);
        return b2 == null ? OptionalProvider.e() : b2 instanceof OptionalProvider ? (OptionalProvider) b2 : OptionalProvider.i(b2);
    }

    public final void n(List list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator it = this.f29755d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f29759h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((Component) it2.next()).j().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Object obj = array[i2];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f29756e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f29756e.add(obj.toString());
                    }
                    i2++;
                }
            }
            if (this.f29752a.isEmpty()) {
                CycleDetector.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f29752a.keySet());
                arrayList2.addAll(list);
                CycleDetector.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Component component = (Component) it3.next();
                this.f29752a.put(component, new Lazy(new f(this, component)));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        u();
    }

    public final void o(Map map, boolean z2) {
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            if (component.n() || (component.o() && z2)) {
                provider.get();
            }
        }
        this.f29757f.c();
    }

    public void p(boolean z2) {
        HashMap hashMap;
        if (h.a(this.f29758g, (Object) null, Boolean.valueOf(z2))) {
            synchronized (this) {
                hashMap = new HashMap(this.f29752a);
            }
            o(hashMap, z2);
        }
    }

    public final /* synthetic */ Object r(Component component) {
        return component.h().a(new RestrictedComponentContainer(component, this));
    }

    public final void u() {
        Boolean bool = (Boolean) this.f29758g.get();
        if (bool != null) {
            o(this.f29752a, bool.booleanValue());
        }
    }

    public final void v() {
        for (Component component : this.f29752a.keySet()) {
            Iterator it = component.g().iterator();
            while (true) {
                if (it.hasNext()) {
                    Dependency dependency = (Dependency) it.next();
                    if (dependency.g() && !this.f29754c.containsKey(dependency.c())) {
                        this.f29754c.put(dependency.c(), LazySet.b(Collections.emptySet()));
                    } else if (this.f29753b.containsKey(dependency.c())) {
                        continue;
                    } else if (dependency.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{component, dependency.c()}));
                    } else if (!dependency.g()) {
                        this.f29753b.put(dependency.c(), OptionalProvider.e());
                    }
                }
            }
        }
    }

    public final List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.p()) {
                Provider provider = (Provider) this.f29752a.get(component);
                for (Qualified qualified : component.j()) {
                    if (!this.f29753b.containsKey(qualified)) {
                        this.f29753b.put(qualified, provider);
                    } else {
                        arrayList.add(new g((OptionalProvider) ((Provider) this.f29753b.get(qualified)), provider));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f29752a.entrySet()) {
            Component component = (Component) entry.getKey();
            if (!component.p()) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.j()) {
                    if (!hashMap.containsKey(qualified)) {
                        hashMap.put(qualified, new HashSet());
                    }
                    ((Set) hashMap.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f29754c.containsKey(entry2.getKey())) {
                this.f29754c.put((Qualified) entry2.getKey(), LazySet.b((Collection) entry2.getValue()));
            } else {
                LazySet lazySet = (LazySet) this.f29754c.get(entry2.getKey());
                for (Provider hVar : (Set) entry2.getValue()) {
                    arrayList.add(new h(lazySet, hVar));
                }
            }
        }
        return arrayList;
    }

    public ComponentRuntime(Executor executor, Iterable iterable, Collection collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.f29752a = new HashMap();
        this.f29753b = new HashMap();
        this.f29754c = new HashMap();
        this.f29756e = new HashSet();
        this.f29758g = new AtomicReference();
        EventBus eventBus = new EventBus(executor);
        this.f29757f = eventBus;
        this.f29759h = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.s(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.s(this, ComponentLoader.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.f29755d = q(iterable);
        n(arrayList);
    }
}
