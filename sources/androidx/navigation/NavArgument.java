package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavArgument {

    /* renamed from: a  reason: collision with root package name */
    public final NavType f22182a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22183b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22184c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22185d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f22186e;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public NavType f22187a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22188b;

        /* renamed from: c  reason: collision with root package name */
        public Object f22189c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22190d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22191e;

        public final NavArgument a() {
            NavType navType = this.f22187a;
            if (navType == null) {
                navType = NavType.f22399c.a(this.f22189c);
                Intrinsics.g(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navType, this.f22188b, this.f22189c, this.f22190d, this.f22191e);
        }

        public final Builder b(boolean z2) {
            this.f22188b = z2;
            return this;
        }

        public final Builder c(NavType navType) {
            Intrinsics.i(navType, "type");
            this.f22187a = navType;
            return this;
        }

        public final Builder d(boolean z2) {
            this.f22191e = z2;
            return this;
        }
    }

    public NavArgument(NavType navType, boolean z2, Object obj, boolean z3, boolean z4) {
        Intrinsics.i(navType, "type");
        if (!navType.c() && z2) {
            throw new IllegalArgumentException((navType.b() + " does not allow nullable values").toString());
        } else if (z2 || !z3 || obj != null) {
            this.f22182a = navType;
            this.f22183b = z2;
            this.f22186e = obj;
            this.f22184c = z3 || z4;
            this.f22185d = z4;
        } else {
            throw new IllegalArgumentException(("Argument with type " + navType.b() + " has null value but is not nullable.").toString());
        }
    }

    public final NavType a() {
        return this.f22182a;
    }

    public final boolean b() {
        return this.f22184c;
    }

    public final boolean c() {
        return this.f22185d;
    }

    public final boolean d() {
        return this.f22183b;
    }

    public final void e(String str, Bundle bundle) {
        Object obj;
        Intrinsics.i(str, "name");
        Intrinsics.i(bundle, "bundle");
        if (this.f22184c && (obj = this.f22186e) != null) {
            this.f22182a.h(bundle, str, obj);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (Intrinsics.d(NavArgument.class, obj.getClass())) {
                NavArgument navArgument = (NavArgument) obj;
                if (this.f22183b != navArgument.f22183b || this.f22184c != navArgument.f22184c || !Intrinsics.d(this.f22182a, navArgument.f22182a)) {
                    return false;
                }
                Object obj2 = this.f22186e;
                return obj2 != null ? Intrinsics.d(obj2, navArgument.f22186e) : navArgument.f22186e == null;
            }
        }
        return false;
    }

    public final boolean f(String str, Bundle bundle) {
        Intrinsics.i(str, "name");
        Intrinsics.i(bundle, "bundle");
        if (!this.f22183b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f22182a.a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = ((((this.f22182a.hashCode() * 31) + (this.f22183b ? 1 : 0)) * 31) + (this.f22184c ? 1 : 0)) * 31;
        Object obj = this.f22186e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavArgument.class.getSimpleName());
        sb.append(" Type: " + this.f22182a);
        sb.append(" Nullable: " + this.f22183b);
        if (this.f22184c) {
            sb.append(" DefaultValue: " + this.f22186e);
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }
}
