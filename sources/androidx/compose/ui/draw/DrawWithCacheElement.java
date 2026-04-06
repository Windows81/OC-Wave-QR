package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15708z;

    public DrawWithCacheElement(Function1 function1) {
        this.f15708z = function1;
    }

    /* renamed from: c */
    public CacheDrawModifierNodeImpl a() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.f15708z);
    }

    /* renamed from: d */
    public void b(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.c3(this.f15708z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.d(this.f15708z, ((DrawWithCacheElement) obj).f15708z);
    }

    public int hashCode() {
        return this.f15708z.hashCode();
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f15708z + ')';
    }
}
