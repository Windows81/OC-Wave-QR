package io.realm;

import io.realm.internal.OsList;

abstract class ManagedListOperator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final BaseRealm f39897a;

    /* renamed from: b  reason: collision with root package name */
    public final OsList f39898b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f39899c;

    public ManagedListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        this.f39897a = baseRealm;
        this.f39899c = cls;
        this.f39898b = osList;
    }

    public final void a(Object obj) {
        e(obj);
        if (obj == null) {
            b();
        } else {
            c(obj);
        }
    }

    public final void b() {
        this.f39898b.j();
    }

    public abstract void c(Object obj);

    public void d(int i2) {
        int q2 = q();
        if (i2 < 0 || q2 < i2) {
            throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + this.f39898b.a0());
        }
    }

    public abstract void e(Object obj);

    public abstract Object f(int i2);

    public final OsList g() {
        return this.f39898b;
    }

    public final void h(int i2, Object obj) {
        e(obj);
        if (obj == null) {
            i(i2);
        } else {
            j(i2, obj);
        }
    }

    public void i(int i2) {
        this.f39898b.C((long) i2);
    }

    public abstract void j(int i2, Object obj);

    public final boolean k() {
        return this.f39898b.I();
    }

    public final void l(int i2) {
        this.f39898b.J((long) i2);
    }

    public final void m() {
        this.f39898b.K();
    }

    public final Object n(int i2, Object obj) {
        e(obj);
        Object f2 = f(i2);
        if (obj == null) {
            o(i2);
        } else {
            p(i2, obj);
        }
        return f2;
    }

    public void o(int i2) {
        this.f39898b.U((long) i2);
    }

    public abstract void p(int i2, Object obj);

    public final int q() {
        long a0 = this.f39898b.a0();
        if (a0 < 2147483647L) {
            return (int) a0;
        }
        return Integer.MAX_VALUE;
    }
}
