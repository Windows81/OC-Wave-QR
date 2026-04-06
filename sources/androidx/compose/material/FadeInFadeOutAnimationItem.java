package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FadeInFadeOutAnimationItem<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7857a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f7858b;

    public FadeInFadeOutAnimationItem(Object obj, Function3 function3) {
        this.f7857a = obj;
        this.f7858b = function3;
    }

    public final Object a() {
        return this.f7857a;
    }

    public final Function3 b() {
        return this.f7858b;
    }

    public final Object c() {
        return this.f7857a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return Intrinsics.d(this.f7857a, fadeInFadeOutAnimationItem.f7857a) && Intrinsics.d(this.f7858b, fadeInFadeOutAnimationItem.f7858b);
    }

    public int hashCode() {
        Object obj = this.f7857a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f7858b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f7857a + ", transition=" + this.f7858b + ')';
    }
}
