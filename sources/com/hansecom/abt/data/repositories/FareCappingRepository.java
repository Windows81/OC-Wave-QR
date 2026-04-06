package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.domainExtensions.CappingPotExtKt;
import com.hansecom.abt.data.repositories.base.MultipleValueRepository;
import com.hansecom.mapi.apis.UserFareMediaApi;
import com.hansecom.mapi.models.CappingPot;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Singleton
@Metadata
public final class FareCappingRepository extends MultipleValueRepository<String, List<? extends CappingPot>> {

    /* renamed from: f  reason: collision with root package name */
    public final UserFareMediaApi f33418f;

    /* renamed from: g  reason: collision with root package name */
    public final Function2 f33419g = new FareCappingRepository$getFreshData$1(this, (Continuation) null);

    /* renamed from: h  reason: collision with root package name */
    public final Function1 f33420h = new a();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareCappingRepository(com.hansecom.mapi.apis.UserFareMediaApi r8, kotlinx.serialization.json.Json r9, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r10) {
        /*
            r7 = this;
            java.lang.String r0 = "userFareMediaApi"
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
            com.hansecom.mapi.models.CappingPot$Companion r6 = com.hansecom.mapi.models.CappingPot.Companion
            kotlinx.serialization.KSerializer r6 = r6.serializer()
            r5.<init>(r6)
            kotlinx.serialization.KSerializer r4 = r4.serializer(r5)
            kotlinx.serialization.KSerializer r4 = kotlinx.serialization.builtins.BuiltinSerializersKt.u(r4)
            r2.<init>(r3, r4)
            com.hansecom.abt.data.repositories.FareCappingRepository$special$$inlined$create$1 r3 = new com.hansecom.abt.data.repositories.FareCappingRepository$special$$inlined$create$1
            r3.<init>(r9, r2)
            com.hansecom.abt.data.repositories.FareCappingRepository$special$$inlined$create$2 r9 = new com.hansecom.abt.data.repositories.FareCappingRepository$special$$inlined$create$2
            java.lang.String r2 = "FareCapping"
            r9.<init>(r2, r10, r3)
            r7.<init>(r1, r0, r9)
            r7.f33418f = r8
            com.hansecom.abt.data.repositories.FareCappingRepository$getFreshData$1 r8 = new com.hansecom.abt.data.repositories.FareCappingRepository$getFreshData$1
            r9 = 0
            r8.<init>(r7, r9)
            r7.f33419g = r8
            com.hansecom.abt.data.repositories.a r8 = new com.hansecom.abt.data.repositories.a
            r8.<init>()
            r7.f33420h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareCappingRepository.<init>(com.hansecom.mapi.apis.UserFareMediaApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    public static final List w(List list) {
        Intrinsics.i(list, "list");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            CappingPot cappingPot = (CappingPot) next;
            if (!CappingPotExtKt.d(cappingPot) || CappingPotExtKt.a(cappingPot)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Function2 j() {
        return this.f33419g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object s(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.repositories.FareCappingRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.repositories.FareCappingRepository$get$1 r0 = (com.hansecom.abt.data.repositories.FareCappingRepository$get$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.FareCappingRepository$get$1 r0 = new com.hansecom.abt.data.repositories.FareCappingRepository$get$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.C
            com.hansecom.abt.data.repositories.FareCappingRepository r5 = (com.hansecom.abt.data.repositories.FareCappingRepository) r5
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x004a
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r6)
            r0.C = r4
            r0.F = r3
            java.lang.Object r6 = super.d(r5, r0)
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r5 = r4
        L_0x004a:
            kotlin.jvm.functions.Function1 r5 = r5.f33420h
            boolean r0 = kotlin.Result.h(r6)
            if (r0 == 0) goto L_0x005b
            java.lang.Object r5 = r5.invoke(r6)
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x005f
        L_0x005b:
            java.lang.Object r5 = kotlin.Result.b(r6)
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareCappingRepository.s(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: t */
    public Flow f(String str) {
        Intrinsics.i(str, "parameter");
        return new FareCappingRepository$getFlow$$inlined$map$1(super.f(str), this.f33420h);
    }

    public Flow u(String str) {
        Intrinsics.i(str, "parameter");
        return FlowKt.C(new FareCappingRepository$getFlowWithErrors$$inlined$map$1(super.h(str), this));
    }

    public final Function1 v() {
        return this.f33420h;
    }
}
