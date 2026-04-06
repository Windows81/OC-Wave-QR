package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.FareMedium;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class FareMediaRepository$getFareMediaFlow$$inlined$map$1 implements Flow<Result<? extends FareMedium>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f33488A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f33489z;

    public FareMediaRepository$getFareMediaFlow$$inlined$map$1(Flow flow, String str) {
        this.f33489z = flow;
        this.f33488A = str;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f33489z;
        final String str = this.f33488A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.hansecom.abt.data.repositories.FareMediaRepository$getFareMediaFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.hansecom.abt.data.repositories.FareMediaRepository$getFareMediaFlow$$inlined$map$1$2$1 r0 = (com.hansecom.abt.data.repositories.FareMediaRepository$getFareMediaFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.data.repositories.FareMediaRepository$getFareMediaFlow$$inlined$map$1$2$1 r0 = new com.hansecom.abt.data.repositories.FareMediaRepository$getFareMediaFlow$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.ResultKt.b(r8)
                    goto L_0x007d
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    kotlin.ResultKt.b(r8)
                    kotlinx.coroutines.flow.FlowCollector r8 = r4
                    kotlin.Result r7 = (kotlin.Result) r7
                    java.lang.Object r7 = r7.j()
                    boolean r2 = kotlin.Result.h(r7)
                    if (r2 == 0) goto L_0x006c
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L_0x004a:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L_0x0064
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    com.hansecom.mapi.models.FareMedium r4 = (com.hansecom.mapi.models.FareMedium) r4
                    java.lang.String r4 = r4.f()
                    java.lang.String r5 = r2
                    boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
                    if (r4 == 0) goto L_0x004a
                    goto L_0x0065
                L_0x0064:
                    r2 = 0
                L_0x0065:
                    com.hansecom.mapi.models.FareMedium r2 = (com.hansecom.mapi.models.FareMedium) r2
                    java.lang.Object r7 = kotlin.Result.b(r2)
                    goto L_0x0070
                L_0x006c:
                    java.lang.Object r7 = kotlin.Result.b(r7)
                L_0x0070:
                    kotlin.Result r7 = kotlin.Result.a(r7)
                    r0.D = r3
                    java.lang.Object r7 = r8.c(r7, r0)
                    if (r7 != r1) goto L_0x007d
                    return r1
                L_0x007d:
                    kotlin.Unit r7 = kotlin.Unit.f40552a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareMediaRepository$getFareMediaFlow$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
