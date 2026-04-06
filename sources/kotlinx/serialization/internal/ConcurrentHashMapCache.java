package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ConcurrentHashMapCache<T> implements SerializerCache<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f42095a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f42096b = new ConcurrentHashMap();

    public ConcurrentHashMapCache(Function1 function1) {
        Intrinsics.i(function1, "compute");
        this.f42095a = function1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = new kotlinx.serialization.internal.CacheEntry((kotlinx.serialization.KSerializer) r4.f42095a.invoke(r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlinx.serialization.KSerializer a(kotlin.reflect.KClass r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r4.f42096b
            java.lang.Class r1 = kotlin.jvm.JvmClassMappingKt.a(r5)
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x0026
            kotlinx.serialization.internal.CacheEntry r2 = new kotlinx.serialization.internal.CacheEntry
            kotlin.jvm.functions.Function1 r3 = r4.f42095a
            java.lang.Object r5 = r3.invoke(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            r2.<init>(r5)
            java.lang.Object r5 = r0.putIfAbsent(r1, r2)
            if (r5 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r5
        L_0x0026:
            kotlinx.serialization.internal.CacheEntry r2 = (kotlinx.serialization.internal.CacheEntry) r2
            kotlinx.serialization.KSerializer r5 = r2.f42080a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.ConcurrentHashMapCache.a(kotlin.reflect.KClass):kotlinx.serialization.KSerializer");
    }
}
