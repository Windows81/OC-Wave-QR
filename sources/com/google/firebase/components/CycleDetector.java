package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class CycleDetector {

    public static class ComponentNode {

        /* renamed from: a  reason: collision with root package name */
        public final Component f29764a;

        /* renamed from: b  reason: collision with root package name */
        public final Set f29765b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Set f29766c = new HashSet();

        public ComponentNode(Component component) {
            this.f29764a = component;
        }

        public void a(ComponentNode componentNode) {
            this.f29765b.add(componentNode);
        }

        public void b(ComponentNode componentNode) {
            this.f29766c.add(componentNode);
        }

        public Component c() {
            return this.f29764a;
        }

        public Set d() {
            return this.f29765b;
        }

        public boolean e() {
            return this.f29765b.isEmpty();
        }

        public boolean f() {
            return this.f29766c.isEmpty();
        }

        public void g(ComponentNode componentNode) {
            this.f29766c.remove(componentNode);
        }
    }

    public static class Dep {

        /* renamed from: a  reason: collision with root package name */
        public final Qualified f29767a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29768b;

        public boolean equals(Object obj) {
            if (!(obj instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) obj;
            return dep.f29767a.equals(this.f29767a) && dep.f29768b == this.f29768b;
        }

        public int hashCode() {
            return ((this.f29767a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f29768b).hashCode();
        }

        public Dep(Qualified qualified, boolean z2) {
            this.f29767a = qualified;
            this.f29768b = z2;
        }
    }

    public static void a(List list) {
        Set<ComponentNode> c2 = c(list);
        Set b2 = b(c2);
        int i2 = 0;
        while (!b2.isEmpty()) {
            ComponentNode componentNode = (ComponentNode) b2.iterator().next();
            b2.remove(componentNode);
            i2++;
            for (ComponentNode componentNode2 : componentNode.d()) {
                componentNode2.g(componentNode);
                if (componentNode2.f()) {
                    b2.add(componentNode2);
                }
            }
        }
        if (i2 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (ComponentNode componentNode3 : c2) {
                if (!componentNode3.f() && !componentNode3.e()) {
                    arrayList.add(componentNode3.c());
                }
            }
            throw new DependencyCycleException(arrayList);
        }
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ComponentNode componentNode = (ComponentNode) it.next();
            if (componentNode.f()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<ComponentNode> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            ComponentNode componentNode = new ComponentNode(component);
            Iterator it2 = component.j().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Qualified qualified = (Qualified) it2.next();
                    Dep dep = new Dep(qualified, !component.p());
                    if (!hashMap.containsKey(dep)) {
                        hashMap.put(dep, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(dep);
                    if (set2.isEmpty() || dep.f29768b) {
                        set2.add(componentNode);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{qualified}));
                    }
                }
            }
        }
        for (Set<ComponentNode> it3 : hashMap.values()) {
            for (ComponentNode componentNode2 : it3) {
                for (Dependency dependency : componentNode2.c().g()) {
                    if (dependency.e() && (set = (Set) hashMap.get(new Dep(dependency.c(), dependency.g()))) != null) {
                        for (ComponentNode componentNode3 : set) {
                            componentNode2.a(componentNode3);
                            componentNode3.b(componentNode2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
