package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Component<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f29733a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f29734b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f29735c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29736d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29737e;

    /* renamed from: f  reason: collision with root package name */
    public final ComponentFactory f29738f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f29739g;

    public static Builder c(Qualified qualified) {
        return new Builder(qualified, new Qualified[0]);
    }

    public static Builder d(Qualified qualified, Qualified... qualifiedArr) {
        return new Builder(qualified, qualifiedArr);
    }

    public static Builder e(Class cls) {
        return new Builder(cls, new Class[0]);
    }

    public static Builder f(Class cls, Class... clsArr) {
        return new Builder(cls, clsArr);
    }

    public static Component l(Object obj, Class cls) {
        return m(cls).e(new a(obj)).c();
    }

    public static Builder m(Class cls) {
        return e(cls).f();
    }

    public static /* synthetic */ Object q(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object r(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static Component s(Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).e(new b(obj)).c();
    }

    public Set g() {
        return this.f29735c;
    }

    public ComponentFactory h() {
        return this.f29738f;
    }

    public String i() {
        return this.f29733a;
    }

    public Set j() {
        return this.f29734b;
    }

    public Set k() {
        return this.f29739g;
    }

    public boolean n() {
        return this.f29736d == 1;
    }

    public boolean o() {
        return this.f29736d == 2;
    }

    public boolean p() {
        return this.f29737e == 0;
    }

    public Component t(ComponentFactory componentFactory) {
        return new Component(this.f29733a, this.f29734b, this.f29735c, this.f29736d, this.f29737e, componentFactory, this.f29739g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f29734b.toArray()) + ">{" + this.f29736d + ", type=" + this.f29737e + ", deps=" + Arrays.toString(this.f29735c.toArray()) + "}";
    }

    public static class Builder<T> {

        /* renamed from: a  reason: collision with root package name */
        public String f29740a;

        /* renamed from: b  reason: collision with root package name */
        public final Set f29741b;

        /* renamed from: c  reason: collision with root package name */
        public final Set f29742c;

        /* renamed from: d  reason: collision with root package name */
        public int f29743d;

        /* renamed from: e  reason: collision with root package name */
        public int f29744e;

        /* renamed from: f  reason: collision with root package name */
        public ComponentFactory f29745f;

        /* renamed from: g  reason: collision with root package name */
        public final Set f29746g;

        public Builder b(Dependency dependency) {
            Preconditions.c(dependency, "Null dependency");
            i(dependency.c());
            this.f29742c.add(dependency);
            return this;
        }

        public Component c() {
            Preconditions.d(this.f29745f != null, "Missing required property: factory.");
            return new Component(this.f29740a, new HashSet(this.f29741b), new HashSet(this.f29742c), this.f29743d, this.f29744e, this.f29745f, this.f29746g);
        }

        public Builder d() {
            return h(2);
        }

        public Builder e(ComponentFactory componentFactory) {
            this.f29745f = (ComponentFactory) Preconditions.c(componentFactory, "Null factory");
            return this;
        }

        public final Builder f() {
            this.f29744e = 1;
            return this;
        }

        public Builder g(String str) {
            this.f29740a = str;
            return this;
        }

        public final Builder h(int i2) {
            Preconditions.d(this.f29743d == 0, "Instantiation type has already been set.");
            this.f29743d = i2;
            return this;
        }

        public final void i(Qualified qualified) {
            Preconditions.a(!this.f29741b.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public Builder(Class cls, Class... clsArr) {
            this.f29740a = null;
            HashSet hashSet = new HashSet();
            this.f29741b = hashSet;
            this.f29742c = new HashSet();
            this.f29743d = 0;
            this.f29744e = 0;
            this.f29746g = new HashSet();
            Preconditions.c(cls, "Null interface");
            hashSet.add(Qualified.b(cls));
            for (Class cls2 : clsArr) {
                Preconditions.c(cls2, "Null interface");
                this.f29741b.add(Qualified.b(cls2));
            }
        }

        public Builder(Qualified qualified, Qualified... qualifiedArr) {
            this.f29740a = null;
            HashSet hashSet = new HashSet();
            this.f29741b = hashSet;
            this.f29742c = new HashSet();
            this.f29743d = 0;
            this.f29744e = 0;
            this.f29746g = new HashSet();
            Preconditions.c(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified c2 : qualifiedArr) {
                Preconditions.c(c2, "Null interface");
            }
            Collections.addAll(this.f29741b, qualifiedArr);
        }
    }

    public Component(String str, Set set, Set set2, int i2, int i3, ComponentFactory componentFactory, Set set3) {
        this.f29733a = str;
        this.f29734b = Collections.unmodifiableSet(set);
        this.f29735c = Collections.unmodifiableSet(set2);
        this.f29736d = i2;
        this.f29737e = i3;
        this.f29738f = componentFactory;
        this.f29739g = Collections.unmodifiableSet(set3);
    }
}
