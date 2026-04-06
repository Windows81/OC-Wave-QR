package androidx.navigation;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavAction {

    /* renamed from: a  reason: collision with root package name */
    public final int f22174a;

    /* renamed from: b  reason: collision with root package name */
    public NavOptions f22175b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f22176c;

    public final Bundle a() {
        return this.f22176c;
    }

    public final int b() {
        return this.f22174a;
    }

    public final NavOptions c() {
        return this.f22175b;
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavAction)) {
            return false;
        }
        NavAction navAction = (NavAction) obj;
        if (this.f22174a == navAction.f22174a && Intrinsics.d(this.f22175b, navAction.f22175b)) {
            if (Intrinsics.d(this.f22176c, navAction.f22176c)) {
                return true;
            }
            Bundle bundle = this.f22176c;
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                Iterable<String> iterable = keySet;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return true;
                }
                for (String str : iterable) {
                    Bundle bundle2 = this.f22176c;
                    Object obj2 = null;
                    Object obj3 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = navAction.f22176c;
                    if (bundle3 != null) {
                        obj2 = bundle3.get(str);
                    }
                    if (!Intrinsics.d(obj3, obj2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.f22174a) * 31;
        NavOptions navOptions = this.f22175b;
        int hashCode2 = hashCode + (navOptions != null ? navOptions.hashCode() : 0);
        Bundle bundle = this.f22176c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i2 = hashCode2 * 31;
                Bundle bundle2 = this.f22176c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i2 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavAction.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f22174a));
        sb.append(")");
        if (this.f22175b != null) {
            sb.append(" navOptions=");
            sb.append(this.f22175b);
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }
}
