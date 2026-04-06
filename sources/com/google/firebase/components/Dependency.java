package com.google.firebase.components;

public final class Dependency {

    /* renamed from: a  reason: collision with root package name */
    public final Qualified f29769a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29770b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29771c;

    public Dependency(Class cls, int i2, int i3) {
        this(Qualified.b(cls), i2, i3);
    }

    public static Dependency a(Class cls) {
        return new Dependency(cls, 0, 2);
    }

    public static String b(int i2) {
        if (i2 == 0) {
            return "direct";
        }
        if (i2 == 1) {
            return "provider";
        }
        if (i2 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i2);
    }

    public static Dependency h(Class cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency i(Qualified qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency j(Class cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency k(Qualified qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency l(Class cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency m(Class cls) {
        return new Dependency(cls, 2, 0);
    }

    public Qualified c() {
        return this.f29769a;
    }

    public boolean d() {
        return this.f29771c == 2;
    }

    public boolean e() {
        return this.f29771c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.f29769a.equals(dependency.f29769a) && this.f29770b == dependency.f29770b && this.f29771c == dependency.f29771c;
    }

    public boolean f() {
        return this.f29770b == 1;
    }

    public boolean g() {
        return this.f29770b == 2;
    }

    public int hashCode() {
        return ((((this.f29769a.hashCode() ^ 1000003) * 1000003) ^ this.f29770b) * 1000003) ^ this.f29771c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f29769a);
        sb.append(", type=");
        int i2 = this.f29770b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f29771c));
        sb.append("}");
        return sb.toString();
    }

    public Dependency(Qualified qualified, int i2, int i3) {
        this.f29769a = (Qualified) Preconditions.c(qualified, "Null dependency anInterface.");
        this.f29770b = i2;
        this.f29771c = i3;
    }
}
