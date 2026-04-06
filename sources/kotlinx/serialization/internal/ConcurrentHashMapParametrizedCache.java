package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f42097a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f42098b = new ConcurrentHashMap();

    public ConcurrentHashMapParametrizedCache(Function2 function2) {
        Intrinsics.i(function2, "compute");
        this.f42097a = function2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r2 = new kotlinx.serialization.internal.ParametrizedCacheEntry();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.reflect.KClass r6, java.util.List r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "types"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r5.f42098b
            java.lang.Class r1 = kotlin.jvm.JvmClassMappingKt.a(r6)
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x0023
            kotlinx.serialization.internal.ParametrizedCacheEntry r2 = new kotlinx.serialization.internal.ParametrizedCacheEntry
            r2.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            if (r0 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = r0
        L_0x0023:
            kotlinx.serialization.internal.ParametrizedCacheEntry r2 = (kotlinx.serialization.internal.ParametrizedCacheEntry) r2
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.x(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0037:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r0.next()
            kotlin.reflect.KType r3 = (kotlin.reflect.KType) r3
            kotlinx.serialization.internal.KTypeWrapper r4 = new kotlinx.serialization.internal.KTypeWrapper
            r4.<init>(r3)
            r1.add(r4)
            goto L_0x0037
        L_0x004c:
            java.util.concurrent.ConcurrentHashMap r0 = r2.f42167a
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x007d
            kotlin.Result$Companion r2 = kotlin.Result.f40519A     // Catch:{ all -> 0x0065 }
            kotlin.jvm.functions.Function2 r2 = r5.f42097a     // Catch:{ all -> 0x0065 }
            java.lang.Object r6 = r2.m(r6, r7)     // Catch:{ all -> 0x0065 }
            kotlinx.serialization.KSerializer r6 = (kotlinx.serialization.KSerializer) r6     // Catch:{ all -> 0x0065 }
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch:{ all -> 0x0065 }
            goto L_0x0070
        L_0x0065:
            r6 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.f40519A
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L_0x0070:
            kotlin.Result r6 = kotlin.Result.a(r6)
            java.lang.Object r7 = r0.putIfAbsent(r1, r6)
            if (r7 != 0) goto L_0x007c
            r2 = r6
            goto L_0x007d
        L_0x007c:
            r2 = r7
        L_0x007d:
            java.lang.String r6 = "getOrPut(...)"
            kotlin.jvm.internal.Intrinsics.h(r2, r6)
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r6 = r2.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.ConcurrentHashMapParametrizedCache.a(kotlin.reflect.KClass, java.util.List):java.lang.Object");
    }
}
