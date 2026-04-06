package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.repositories.base.MultipleValueRepository;
import com.hansecom.mapi.apis.AutoloadsApi;
import com.hansecom.mapi.models.FareMediaAutoload;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Singleton
@Metadata
public final class AutoloadRepository extends MultipleValueRepository<String, List<? extends FareMediaAutoload>> {

    /* renamed from: f  reason: collision with root package name */
    public final AutoloadsApi f33392f;

    /* renamed from: g  reason: collision with root package name */
    public final Function2 f33393g = new AutoloadRepository$getFreshData$1(this, (Continuation) null);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoloadRepository(com.hansecom.mapi.apis.AutoloadsApi r8, kotlinx.serialization.json.Json r9, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r10) {
        /*
            r7 = this;
            java.lang.String r0 = "autoloadsApi"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 2
            com.hansecom.abt.data.preferences.base.Seconds r1 = r0.c(r1)
            r2 = 15
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.a(r2)
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$Companion r2 = com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider.f33346d
            r9.a()
            kotlinx.serialization.internal.LinkedHashMapSerializer r2 = new kotlinx.serialization.internal.LinkedHashMapSerializer
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r4 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            kotlinx.serialization.internal.ArrayListSerializer r5 = new kotlinx.serialization.internal.ArrayListSerializer
            com.hansecom.mapi.models.FareMediaAutoload$Companion r6 = com.hansecom.mapi.models.FareMediaAutoload.Companion
            kotlinx.serialization.KSerializer r6 = r6.serializer()
            r5.<init>(r6)
            kotlinx.serialization.KSerializer r4 = r4.serializer(r5)
            kotlinx.serialization.KSerializer r4 = kotlinx.serialization.builtins.BuiltinSerializersKt.u(r4)
            r2.<init>(r3, r4)
            com.hansecom.abt.data.repositories.AutoloadRepository$special$$inlined$create$1 r3 = new com.hansecom.abt.data.repositories.AutoloadRepository$special$$inlined$create$1
            r3.<init>(r9, r2)
            com.hansecom.abt.data.repositories.AutoloadRepository$special$$inlined$create$2 r9 = new com.hansecom.abt.data.repositories.AutoloadRepository$special$$inlined$create$2
            java.lang.String r2 = "Autoload"
            r9.<init>(r2, r10, r3)
            r7.<init>(r1, r0, r9)
            r7.f33392f = r8
            com.hansecom.abt.data.repositories.AutoloadRepository$getFreshData$1 r8 = new com.hansecom.abt.data.repositories.AutoloadRepository$getFreshData$1
            r9 = 0
            r8.<init>(r7, r9)
            r7.f33393g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.AutoloadRepository.<init>(com.hansecom.mapi.apis.AutoloadsApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    public Function2 j() {
        return this.f33393g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.lang.String r5, long r6, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.data.repositories.AutoloadRepository$getAutoload$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.data.repositories.AutoloadRepository$getAutoload$1 r0 = (com.hansecom.abt.data.repositories.AutoloadRepository$getAutoload$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.AutoloadRepository$getAutoload$1 r0 = new com.hansecom.abt.data.repositories.AutoloadRepository$getAutoload$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            long r6 = r0.C
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r5 = r8.j()
            goto L_0x0047
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.ResultKt.b(r8)
            r0.C = r6
            r0.F = r3
            java.lang.Object r5 = r4.d(r5, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            boolean r8 = kotlin.Result.h(r5)
            if (r8 == 0) goto L_0x007d
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0055:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0075
            java.lang.Object r8 = r5.next()
            com.hansecom.mapi.models.FareMediaAutoload r8 = (com.hansecom.mapi.models.FareMediaAutoload) r8
            java.lang.Long r0 = r8.c()
            if (r0 != 0) goto L_0x0068
            goto L_0x0055
        L_0x0068:
            long r0 = r0.longValue()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            java.lang.Object r5 = kotlin.Result.b(r8)
            goto L_0x0081
        L_0x0075:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Collection contains no element matching the predicate."
            r5.<init>(r6)
            throw r5
        L_0x007d:
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x0081:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.AutoloadRepository.r(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
