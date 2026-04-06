package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializersKt;

@Metadata
public final class NavOptions {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22362a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22363b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22364c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22365d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f22366e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22367f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22368g;

    /* renamed from: h  reason: collision with root package name */
    public final int f22369h;

    /* renamed from: i  reason: collision with root package name */
    public final int f22370i;

    /* renamed from: j  reason: collision with root package name */
    public String f22371j;

    /* renamed from: k  reason: collision with root package name */
    public KClass f22372k;

    /* renamed from: l  reason: collision with root package name */
    public Object f22373l;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22374a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22375b;

        /* renamed from: c  reason: collision with root package name */
        public int f22376c = -1;

        /* renamed from: d  reason: collision with root package name */
        public String f22377d;

        /* renamed from: e  reason: collision with root package name */
        public KClass f22378e;

        /* renamed from: f  reason: collision with root package name */
        public Object f22379f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f22380g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f22381h;

        /* renamed from: i  reason: collision with root package name */
        public int f22382i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f22383j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f22384k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f22385l = -1;

        public static /* synthetic */ Builder k(Builder builder, int i2, boolean z2, boolean z3, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                z3 = false;
            }
            return builder.g(i2, z2, z3);
        }

        public final NavOptions a() {
            String str = this.f22377d;
            if (str != null) {
                return new NavOptions(this.f22374a, this.f22375b, str, this.f22380g, this.f22381h, this.f22382i, this.f22383j, this.f22384k, this.f22385l);
            }
            KClass kClass = this.f22378e;
            if (kClass != null) {
                return new NavOptions(this.f22374a, this.f22375b, kClass, this.f22380g, this.f22381h, this.f22382i, this.f22383j, this.f22384k, this.f22385l);
            }
            Object obj = this.f22379f;
            if (obj != null) {
                boolean z2 = this.f22374a;
                boolean z3 = this.f22375b;
                Intrinsics.f(obj);
                return new NavOptions(z2, z3, obj, this.f22380g, this.f22381h, this.f22382i, this.f22383j, this.f22384k, this.f22385l);
            }
            return new NavOptions(this.f22374a, this.f22375b, this.f22376c, this.f22380g, this.f22381h, this.f22382i, this.f22383j, this.f22384k, this.f22385l);
        }

        public final Builder b(int i2) {
            this.f22382i = i2;
            return this;
        }

        public final Builder c(int i2) {
            this.f22383j = i2;
            return this;
        }

        public final Builder d(boolean z2) {
            this.f22374a = z2;
            return this;
        }

        public final Builder e(int i2) {
            this.f22384k = i2;
            return this;
        }

        public final Builder f(int i2) {
            this.f22385l = i2;
            return this;
        }

        public final Builder g(int i2, boolean z2, boolean z3) {
            this.f22376c = i2;
            this.f22377d = null;
            this.f22380g = z2;
            this.f22381h = z3;
            return this;
        }

        public final Builder h(Object obj, boolean z2, boolean z3) {
            Intrinsics.i(obj, "route");
            this.f22379f = obj;
            g(RouteSerializerKt.g(SerializersKt.b(Reflection.b(obj.getClass()))), z2, z3);
            return this;
        }

        public final Builder i(String str, boolean z2, boolean z3) {
            this.f22377d = str;
            this.f22376c = -1;
            this.f22380g = z2;
            this.f22381h = z3;
            return this;
        }

        public final Builder j(KClass kClass, boolean z2, boolean z3) {
            Intrinsics.i(kClass, "klass");
            this.f22378e = kClass;
            this.f22376c = -1;
            this.f22380g = z2;
            this.f22381h = z3;
            return this;
        }

        public final Builder l(boolean z2) {
            this.f22375b = z2;
            return this;
        }
    }

    public NavOptions(boolean z2, boolean z3, int i2, boolean z4, boolean z5, int i3, int i4, int i5, int i6) {
        this.f22362a = z2;
        this.f22363b = z3;
        this.f22364c = i2;
        this.f22365d = z4;
        this.f22366e = z5;
        this.f22367f = i3;
        this.f22368g = i4;
        this.f22369h = i5;
        this.f22370i = i6;
    }

    public final int a() {
        return this.f22367f;
    }

    public final int b() {
        return this.f22368g;
    }

    public final int c() {
        return this.f22369h;
    }

    public final int d() {
        return this.f22370i;
    }

    public final int e() {
        return this.f22364c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavOptions)) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        return this.f22362a == navOptions.f22362a && this.f22363b == navOptions.f22363b && this.f22364c == navOptions.f22364c && Intrinsics.d(this.f22371j, navOptions.f22371j) && Intrinsics.d(this.f22372k, navOptions.f22372k) && Intrinsics.d(this.f22373l, navOptions.f22373l) && this.f22365d == navOptions.f22365d && this.f22366e == navOptions.f22366e && this.f22367f == navOptions.f22367f && this.f22368g == navOptions.f22368g && this.f22369h == navOptions.f22369h && this.f22370i == navOptions.f22370i;
    }

    public final String f() {
        return this.f22371j;
    }

    public final KClass g() {
        return this.f22372k;
    }

    public final Object h() {
        return this.f22373l;
    }

    public int hashCode() {
        int i2 = (((((j() ? 1 : 0) * true) + (l() ? 1 : 0)) * 31) + this.f22364c) * 31;
        String str = this.f22371j;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        KClass kClass = this.f22372k;
        int hashCode2 = (hashCode + (kClass != null ? kClass.hashCode() : 0)) * 31;
        Object obj = this.f22373l;
        if (obj != null) {
            i3 = obj.hashCode();
        }
        return ((((((((((((hashCode2 + i3) * 31) + (i() ? 1 : 0)) * 31) + (k() ? 1 : 0)) * 31) + this.f22367f) * 31) + this.f22368g) * 31) + this.f22369h) * 31) + this.f22370i;
    }

    public final boolean i() {
        return this.f22365d;
    }

    public final boolean j() {
        return this.f22362a;
    }

    public final boolean k() {
        return this.f22366e;
    }

    public final boolean l() {
        return this.f22363b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavOptions.class.getSimpleName());
        sb.append("(");
        if (this.f22362a) {
            sb.append("launchSingleTop ");
        }
        if (this.f22363b) {
            sb.append("restoreState ");
        }
        String str = this.f22371j;
        if (!((str == null && this.f22364c == -1) || str == null)) {
            sb.append("popUpTo(");
            String str2 = this.f22371j;
            if (str2 != null) {
                sb.append(str2);
            } else {
                KClass kClass = this.f22372k;
                if (kClass != null) {
                    sb.append(kClass);
                } else {
                    Object obj = this.f22373l;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(this.f22364c));
                    }
                }
            }
            if (this.f22365d) {
                sb.append(" inclusive");
            }
            if (this.f22366e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (!(this.f22367f == -1 && this.f22368g == -1 && this.f22369h == -1 && this.f22370i == -1)) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.f22367f));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.f22368g));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.f22369h));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.f22370i));
            sb.append(")");
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }

    public NavOptions(boolean z2, boolean z3, String str, boolean z4, boolean z5, int i2, int i3, int i4, int i5) {
        this(z2, z3, NavDestination.J.a(str).hashCode(), z4, z5, i2, i3, i4, i5);
        this.f22371j = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z2, boolean z3, KClass kClass, boolean z4, boolean z5, int i2, int i3, int i4, int i5) {
        this(z2, z3, RouteSerializerKt.g(SerializersKt.b(kClass)), z4, z5, i2, i3, i4, i5);
        Intrinsics.f(kClass);
        this.f22372k = kClass;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z2, boolean z3, Object obj, boolean z4, boolean z5, int i2, int i3, int i4, int i5) {
        this(z2, z3, RouteSerializerKt.g(SerializersKt.b(Reflection.b(obj.getClass()))), z4, z5, i2, i3, i4, i5);
        Intrinsics.i(obj, "popUpToRouteObject");
        this.f22373l = obj;
    }
}
