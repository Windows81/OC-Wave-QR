package io.realm.internal;

import io.realm.internal.ObserverPairList.ObserverPair;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObserverPairList<T extends ObserverPair> {

    /* renamed from: a  reason: collision with root package name */
    public List f40144a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f40145b = false;

    public interface Callback<T extends ObserverPair> {
        void a(ObserverPair observerPair, Object obj);
    }

    public static abstract class ObserverPair<T, S> {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f40146a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f40147b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f40148c = false;

        public ObserverPair(Object obj, Object obj2) {
            this.f40147b = obj2;
            this.f40146a = new WeakReference(obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ObserverPair)) {
                return false;
            }
            ObserverPair observerPair = (ObserverPair) obj;
            return this.f40147b.equals(observerPair.f40147b) && this.f40146a.get() == observerPair.f40146a.get();
        }

        public int hashCode() {
            Object obj = this.f40146a.get();
            int i2 = 0;
            int hashCode = (527 + (obj != null ? obj.hashCode() : 0)) * 31;
            Object obj2 = this.f40147b;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            return hashCode + i2;
        }
    }

    public void a(ObserverPair observerPair) {
        if (!this.f40144a.contains(observerPair)) {
            this.f40144a.add(observerPair);
            observerPair.f40148c = false;
        }
        if (this.f40145b) {
            this.f40145b = false;
        }
    }

    public void b() {
        this.f40145b = true;
        this.f40144a.clear();
    }

    public void c(Callback callback) {
        for (ObserverPair observerPair : this.f40144a) {
            if (!this.f40145b) {
                Object obj = observerPair.f40146a.get();
                if (obj == null) {
                    this.f40144a.remove(observerPair);
                } else if (!observerPair.f40148c) {
                    callback.a(observerPair, obj);
                }
            } else {
                return;
            }
        }
    }

    public boolean d() {
        return this.f40144a.isEmpty();
    }

    public void e(Object obj, Object obj2) {
        for (ObserverPair observerPair : this.f40144a) {
            if (obj == observerPair.f40146a.get() && obj2.equals(observerPair.f40147b)) {
                observerPair.f40148c = true;
                this.f40144a.remove(observerPair);
                return;
            }
        }
    }

    public void f(Object obj) {
        for (ObserverPair observerPair : this.f40144a) {
            Object obj2 = observerPair.f40146a.get();
            if (obj2 == null || obj2 == obj) {
                observerPair.f40148c = true;
                this.f40144a.remove(observerPair);
            }
        }
    }

    public int g() {
        return this.f40144a.size();
    }
}
