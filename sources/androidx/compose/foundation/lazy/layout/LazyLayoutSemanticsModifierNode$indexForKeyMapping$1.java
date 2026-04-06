package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutSemanticsModifierNode$indexForKeyMapping$1 extends Lambda implements Function1<Object, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f4930z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$indexForKeyMapping$1(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        super(1);
        this.f4930z = lazyLayoutSemanticsModifierNode;
    }

    /* renamed from: b */
    public final Integer invoke(Object obj) {
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f4930z.N.invoke();
        int b2 = lazyLayoutItemProvider.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b2) {
                i2 = -1;
                break;
            } else if (Intrinsics.d(lazyLayoutItemProvider.c(i2), obj)) {
                break;
            } else {
                i2++;
            }
        }
        return Integer.valueOf(i2);
    }
}
