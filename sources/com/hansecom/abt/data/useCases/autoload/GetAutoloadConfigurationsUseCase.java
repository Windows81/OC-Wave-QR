package com.hansecom.abt.data.useCases.autoload;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetAutoloadConfigurationsUseCase {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f33840c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f33841d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final FareMediaConfigRepository f33842a;

    /* renamed from: b  reason: collision with root package name */
    public final AppFeatures f33843b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public GetAutoloadConfigurationsUseCase(FareMediaConfigRepository fareMediaConfigRepository, AppFeatures appFeatures) {
        Intrinsics.i(fareMediaConfigRepository, "fareMediaConfigRepository");
        Intrinsics.i(appFeatures, "appFeatures");
        this.f33842a = fareMediaConfigRepository;
        this.f33843b = appFeatures;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase$invoke$1 r0 = (com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase$invoke$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase$invoke$1 r0 = new com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r9 = r0.C
            com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase r9 = (com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase) r9
            kotlin.ResultKt.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.j()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            kotlin.ResultKt.b(r10)
            com.hansecom.abt.data.repositories.FareMediaConfigRepository r10 = r8.f33842a
            r0.C = r8
            r0.F = r3
            java.lang.Object r10 = r10.d(r9, r0)
            if (r10 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r9 = r8
        L_0x004c:
            boolean r0 = kotlin.Result.h(r10)
            if (r0 == 0) goto L_0x00ed
            com.hansecom.mapi.models.FareMediumConfigurations r10 = (com.hansecom.mapi.models.FareMediumConfigurations) r10
            com.hansecom.abt.AppFeatures r0 = r9.f33843b
            boolean r2 = r0.q()
            java.lang.Integer r0 = r10.g()
            r1 = 100
            if (r0 == 0) goto L_0x0067
            int r0 = r0.intValue()
            goto L_0x0068
        L_0x0067:
            r0 = r1
        L_0x0068:
            java.math.BigDecimal r3 = com.hansecom.abt.util.BigDecimalExtKt.a(r0)
            java.lang.Integer r0 = r10.f()
            if (r0 == 0) goto L_0x0077
            int r0 = r0.intValue()
            goto L_0x0079
        L_0x0077:
            r0 = 20000(0x4e20, float:2.8026E-41)
        L_0x0079:
            java.lang.Integer r4 = r10.g()
            if (r4 == 0) goto L_0x0083
            int r1 = r4.intValue()
        L_0x0083:
            int r0 = r0 - r1
            java.math.BigDecimal r4 = com.hansecom.abt.util.BigDecimalExtKt.a(r0)
            com.hansecom.abt.AppFeatures r9 = r9.f33843b
            int r9 = r9.i()
            java.math.BigDecimal r5 = com.hansecom.abt.util.BigDecimalExtKt.a(r9)
            java.lang.Integer r9 = r10.d()
            if (r9 == 0) goto L_0x009d
            int r9 = r9.intValue()
            goto L_0x009f
        L_0x009d:
            r9 = 25000(0x61a8, float:3.5032E-41)
        L_0x009f:
            java.math.BigDecimal r6 = com.hansecom.abt.util.BigDecimalExtKt.a(r9)
            java.util.List r9 = r10.c()
            if (r9 == 0) goto L_0x00dd
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt.x(r9, r0)
            r10.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x00ba:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r9.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.math.BigDecimal r0 = com.hansecom.abt.util.BigDecimalExtKt.a(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            r10.add(r0)
            goto L_0x00ba
        L_0x00db:
            r7 = r10
            goto L_0x00e2
        L_0x00dd:
            java.util.List r9 = kotlin.collections.CollectionsKt.m()
            r7 = r9
        L_0x00e2:
            com.hansecom.abt.data.localDomain.AutoloadConfiguration r9 = new com.hansecom.abt.data.localDomain.AutoloadConfiguration
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = kotlin.Result.b(r9)
            goto L_0x00f1
        L_0x00ed:
            java.lang.Object r9 = kotlin.Result.b(r10)
        L_0x00f1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
