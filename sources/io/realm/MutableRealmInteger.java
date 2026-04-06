package io.realm;

import io.realm.internal.ManageableObject;
import io.realm.internal.Row;

public abstract class MutableRealmInteger implements Comparable<MutableRealmInteger>, ManageableObject {

    public static abstract class Managed<T extends RealmModel> extends MutableRealmInteger {
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return MutableRealmInteger.super.compareTo((MutableRealmInteger) obj);
        }

        public final Long f() {
            Row k2 = k();
            k2.F();
            long h2 = h();
            if (k2.y(h2)) {
                return null;
            }
            return Long.valueOf(k2.p(h2));
        }

        public abstract long h();

        public abstract ProxyState j();

        public final Row k() {
            return j().e();
        }
    }

    public static final class Unmanaged extends MutableRealmInteger {

        /* renamed from: z  reason: collision with root package name */
        public Long f39908z;

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return MutableRealmInteger.super.compareTo((MutableRealmInteger) obj);
        }

        public Long f() {
            return this.f39908z;
        }
    }

    /* renamed from: d */
    public final int compareTo(MutableRealmInteger mutableRealmInteger) {
        Long f2 = f();
        Long f3 = mutableRealmInteger.f();
        if (f2 == null) {
            return f3 == null ? 0 : -1;
        }
        if (f3 == null) {
            return 1;
        }
        return f2.compareTo(f3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutableRealmInteger)) {
            return false;
        }
        Long f2 = f();
        Long f3 = ((MutableRealmInteger) obj).f();
        return f2 == null ? f3 == null : f2.equals(f3);
    }

    public abstract Long f();

    public final int hashCode() {
        Long f2 = f();
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }
}
