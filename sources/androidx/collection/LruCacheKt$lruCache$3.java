package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LruCacheKt$lruCache$3 extends Lambda implements Function4 {

    /* renamed from: z  reason: collision with root package name */
    public static final LruCacheKt$lruCache$3 f1860z = new LruCacheKt$lruCache$3();

    public LruCacheKt$lruCache$3() {
        super(4);
    }

    public final void b(boolean z2, Object obj, Object obj2, Object obj3) {
        Intrinsics.i(obj, "<anonymous parameter 1>");
        Intrinsics.i(obj2, "<anonymous parameter 2>");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
        return Unit.f40552a;
    }
}
