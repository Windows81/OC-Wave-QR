package com.hansecom.abt.data.preferences.base;

import androidx.datastore.core.Serializer;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata
public final class HashMapLocalDataProvider$buildCacheValueSerializer$1 implements Serializer<Map<String, ? extends CacheValue<T>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HashMapLocalDataProvider f33364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f33365b;

    public HashMapLocalDataProvider$buildCacheValueSerializer$1(HashMapLocalDataProvider hashMapLocalDataProvider, String str) {
        this.f33364a = hashMapLocalDataProvider;
        this.f33365b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.io.InputStream r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1$readFrom$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1$readFrom$1 r0 = (com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1$readFrom$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1$readFrom$1 r0 = new com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1$readFrom$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r8 = r0.C
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1 r8 = (com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1) r8
            kotlin.ResultKt.b(r9)     // Catch:{ Exception -> 0x002d }
            goto L_0x0054
        L_0x002d:
            r9 = move-exception
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            kotlin.ResultKt.b(r9)
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider r9 = r7.f33364a     // Catch:{ Exception -> 0x0070 }
            java.lang.String r2 = r7.f33365b     // Catch:{ Exception -> 0x0070 }
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.b()     // Catch:{ Exception -> 0x0070 }
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$readFromCatchingExceptions$2 r5 = new com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$readFromCatchingExceptions$2     // Catch:{ Exception -> 0x0070 }
            r6 = 0
            r5.<init>(r9, r8, r2, r6)     // Catch:{ Exception -> 0x0070 }
            r0.C = r7     // Catch:{ Exception -> 0x0070 }
            r0.F = r3     // Catch:{ Exception -> 0x0070 }
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.g(r4, r5, r0)     // Catch:{ Exception -> 0x0070 }
            if (r9 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r8 = r7
        L_0x0054:
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ Exception -> 0x002d }
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a     // Catch:{ Exception -> 0x002d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002d }
            r1.<init>()     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "read "
            r1.append(r2)     // Catch:{ Exception -> 0x002d }
            r1.append(r9)     // Catch:{ Exception -> 0x002d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x002d }
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x002d }
            r0.a(r1, r2)     // Catch:{ Exception -> 0x002d }
            goto L_0x007b
        L_0x0070:
            r9 = move-exception
            r8 = r7
        L_0x0072:
            timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
            r0.c(r9)
            java.util.Map r9 = r8.a()
        L_0x007b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$buildCacheValueSerializer$1.c(java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: d */
    public Map a() {
        return MapsKt.h();
    }

    /* renamed from: e */
    public Object b(Map map, OutputStream outputStream, Continuation continuation) {
        Object g2 = BuildersKt.g(Dispatchers.b(), new HashMapLocalDataProvider$buildCacheValueSerializer$1$writeTo$2(this.f33364a, map, outputStream, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }
}
