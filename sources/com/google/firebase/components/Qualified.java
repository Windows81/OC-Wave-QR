package com.google.firebase.components;

public final class Qualified<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f29785a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f29786b;

    public @interface Unqualified {
    }

    public Qualified(Class cls, Class cls2) {
        this.f29785a = cls;
        this.f29786b = cls2;
    }

    public static Qualified a(Class cls, Class cls2) {
        return new Qualified(cls, cls2);
    }

    public static Qualified b(Class cls) {
        return new Qualified(Unqualified.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (!this.f29786b.equals(qualified.f29786b)) {
            return false;
        }
        return this.f29785a.equals(qualified.f29785a);
    }

    public int hashCode() {
        return (this.f29786b.hashCode() * 31) + this.f29785a.hashCode();
    }

    public String toString() {
        if (this.f29785a == Unqualified.class) {
            return this.f29786b.getName();
        }
        return "@" + this.f29785a.getName() + " " + this.f29786b.getName();
    }
}
