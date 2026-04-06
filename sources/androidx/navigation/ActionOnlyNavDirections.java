package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ActionOnlyNavDirections implements NavDirections {

    /* renamed from: a  reason: collision with root package name */
    public final int f22154a;

    public int a() {
        return this.f22154a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (Intrinsics.d(ActionOnlyNavDirections.class, obj.getClass())) {
                return a() == ((ActionOnlyNavDirections) obj).a();
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 + a();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + a() + ')';
    }
}
