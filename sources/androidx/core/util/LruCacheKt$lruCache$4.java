package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f20154a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f20155b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function4 f20156c;

    public Object create(Object obj) {
        return this.f20155b.invoke(obj);
    }

    public void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
        this.f20156c.j(Boolean.valueOf(z2), obj, obj2, obj3);
    }

    public int sizeOf(Object obj, Object obj2) {
        return ((Number) this.f20154a.m(obj, obj2)).intValue();
    }
}
