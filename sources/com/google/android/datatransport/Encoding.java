package com.google.android.datatransport;

public final class Encoding {

    /* renamed from: a  reason: collision with root package name */
    public final String f23824a;

    public Encoding(String str) {
        if (str != null) {
            this.f23824a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static Encoding b(String str) {
        return new Encoding(str);
    }

    public String a() {
        return this.f23824a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f23824a.equals(((Encoding) obj).f23824a);
    }

    public int hashCode() {
        return this.f23824a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f23824a + "\"}";
    }
}
