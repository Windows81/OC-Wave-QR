package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class RestrictedComponentContainer implements ComponentContainer {

    /* renamed from: a  reason: collision with root package name */
    public final Set f29787a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f29788b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f29789c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f29790d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f29791e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f29792f;

    /* renamed from: g  reason: collision with root package name */
    public final ComponentContainer f29793g;

    public static class RestrictedPublisher implements Publisher {

        /* renamed from: a  reason: collision with root package name */
        public final Set f29794a;

        /* renamed from: b  reason: collision with root package name */
        public final Publisher f29795b;

        public RestrictedPublisher(Set set, Publisher publisher) {
            this.f29794a = set;
            this.f29795b = publisher;
        }
    }

    public RestrictedComponentContainer(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.g()) {
            if (dependency.e()) {
                if (dependency.g()) {
                    hashSet4.add(dependency.c());
                } else {
                    hashSet.add(dependency.c());
                }
            } else if (dependency.d()) {
                hashSet3.add(dependency.c());
            } else if (dependency.g()) {
                hashSet5.add(dependency.c());
            } else {
                hashSet2.add(dependency.c());
            }
        }
        if (!component.k().isEmpty()) {
            hashSet.add(Qualified.b(Publisher.class));
        }
        this.f29787a = Collections.unmodifiableSet(hashSet);
        this.f29788b = Collections.unmodifiableSet(hashSet2);
        this.f29789c = Collections.unmodifiableSet(hashSet3);
        this.f29790d = Collections.unmodifiableSet(hashSet4);
        this.f29791e = Collections.unmodifiableSet(hashSet5);
        this.f29792f = component.k();
        this.f29793g = componentContainer;
    }

    public Object a(Class cls) {
        if (this.f29787a.contains(Qualified.b(cls))) {
            Object a2 = this.f29793g.a(cls);
            return !cls.equals(Publisher.class) ? a2 : new RestrictedPublisher(this.f29792f, (Publisher) a2);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public Provider b(Qualified qualified) {
        if (this.f29788b.contains(qualified)) {
            return this.f29793g.b(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{qualified}));
    }

    public Provider c(Class cls) {
        return b(Qualified.b(cls));
    }

    public Set d(Qualified qualified) {
        if (this.f29790d.contains(qualified)) {
            return this.f29793g.d(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{qualified}));
    }

    public Provider e(Qualified qualified) {
        if (this.f29791e.contains(qualified)) {
            return this.f29793g.e(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{qualified}));
    }

    public Object f(Qualified qualified) {
        if (this.f29787a.contains(qualified)) {
            return this.f29793g.f(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{qualified}));
    }

    public Deferred h(Qualified qualified) {
        if (this.f29789c.contains(qualified)) {
            return this.f29793g.h(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{qualified}));
    }

    public Deferred i(Class cls) {
        return h(Qualified.b(cls));
    }
}
