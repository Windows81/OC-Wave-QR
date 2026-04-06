package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Function2 f1861j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Function1 f1862k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Function4 f1863l;

    public Object a(Object obj) {
        Intrinsics.i(obj, "key");
        return this.f1862k.invoke(obj);
    }

    public void b(boolean z2, Object obj, Object obj2, Object obj3) {
        Intrinsics.i(obj, "key");
        Intrinsics.i(obj2, "oldValue");
        this.f1863l.j(Boolean.valueOf(z2), obj, obj2, obj3);
    }

    public int j(Object obj, Object obj2) {
        Intrinsics.i(obj, "key");
        Intrinsics.i(obj2, "value");
        return ((Number) this.f1861j.m(obj, obj2)).intValue();
    }
}
