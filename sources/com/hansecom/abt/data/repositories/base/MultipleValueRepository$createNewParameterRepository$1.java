package com.hansecom.abt.data.repositories.base;

import com.hansecom.abt.data.preferences.base.BaseLocalDataProvider;
import com.hansecom.abt.data.preferences.base.Seconds;
import kotlin.Metadata;

@Metadata
public final class MultipleValueRepository$createNewParameterRepository$1 extends BaseRepository<T> {

    /* renamed from: j  reason: collision with root package name */
    public final BaseLocalDataProvider f33591j;

    /* renamed from: k  reason: collision with root package name */
    public final String f33592k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ MultipleValueRepository f33593l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f33594m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleValueRepository$createNewParameterRepository$1(MultipleValueRepository multipleValueRepository, Object obj, Seconds seconds, Seconds seconds2) {
        super(seconds, seconds2);
        this.f33593l = multipleValueRepository;
        this.f33594m = obj;
        this.f33591j = new MultipleValueRepository$createNewParameterRepository$1$localBaseRepository$1(multipleValueRepository, obj);
        this.f33592k = multipleValueRepository.l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.repositories.base.MultipleValueRepository$createNewParameterRepository$1$getFreshData$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.repositories.base.MultipleValueRepository$createNewParameterRepository$1$getFreshData$1 r0 = (com.hansecom.abt.data.repositories.base.MultipleValueRepository$createNewParameterRepository$1$getFreshData$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.MultipleValueRepository$createNewParameterRepository$1$getFreshData$1 r0 = new com.hansecom.abt.data.repositories.base.MultipleValueRepository$createNewParameterRepository$1$getFreshData$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.data.repositories.base.MultipleValueRepository r5 = r4.f33593l
            kotlin.jvm.functions.Function2 r5 = r5.j()
            java.lang.Object r2 = r4.f33594m
            r0.E = r3
            java.lang.Object r5 = r5.m(r2, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.MultipleValueRepository$createNewParameterRepository$1.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public BaseLocalDataProvider t() {
        return this.f33591j;
    }

    public String v() {
        return this.f33592k;
    }
}
