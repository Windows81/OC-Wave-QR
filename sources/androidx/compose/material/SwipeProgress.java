package androidx.compose.material;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class SwipeProgress<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8542a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8543b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8544c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        return Intrinsics.d(this.f8542a, swipeProgress.f8542a) && Intrinsics.d(this.f8543b, swipeProgress.f8543b) && this.f8544c == swipeProgress.f8544c;
    }

    public int hashCode() {
        Object obj = this.f8542a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f8543b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return ((hashCode + i2) * 31) + Float.hashCode(this.f8544c);
    }

    public String toString() {
        return "SwipeProgress(from=" + this.f8542a + ", to=" + this.f8543b + ", fraction=" + this.f8544c + ')';
    }
}
