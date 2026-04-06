package com.google.common.net;

@ElementTypesAreNonnullByDefault
public final class HostSpecifier {

    /* renamed from: a  reason: collision with root package name */
    public final String f29073a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostSpecifier) {
            return this.f29073a.equals(((HostSpecifier) obj).f29073a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29073a.hashCode();
    }

    public String toString() {
        return this.f29073a;
    }
}
