package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FadeInFadeOutAnimationItem<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10008a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f10009b;

    public FadeInFadeOutAnimationItem(Object obj, Function3 function3) {
        this.f10008a = obj;
        this.f10009b = function3;
    }

    public final Object a() {
        return this.f10008a;
    }

    public final Function3 b() {
        return this.f10009b;
    }

    public final Object c() {
        return this.f10008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return Intrinsics.d(this.f10008a, fadeInFadeOutAnimationItem.f10008a) && Intrinsics.d(this.f10009b, fadeInFadeOutAnimationItem.f10009b);
    }

    public int hashCode() {
        Object obj = this.f10008a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f10009b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f10008a + ", transition=" + this.f10009b + ')';
    }
}
