package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class BaseRepository$getFlow$$inlined$map$1 implements Flow<T> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BaseRepository f33569A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f33570z;

    public BaseRepository$getFlow$$inlined$map$1(Flow flow, BaseRepository baseRepository) {
        this.f33570z = flow;
        this.f33569A = baseRepository;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f33570z;
        final BaseRepository baseRepository = this.f33569A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x011f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1$2$1 r0 = (com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1$2$1 r0 = new com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1$2$1
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r14 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 5
                    r4 = 4
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    r8 = 0
                    if (r2 == 0) goto L_0x0076
                    if (r2 == r7) goto L_0x006a
                    if (r2 == r6) goto L_0x005d
                    if (r2 == r5) goto L_0x0050
                    if (r2 == r4) goto L_0x003f
                    if (r2 != r3) goto L_0x0037
                    kotlin.ResultKt.b(r14)
                    goto L_0x0120
                L_0x0037:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x003f:
                    java.lang.Object r13 = r0.H
                    com.hansecom.abt.data.repositories.base.BaseRepository r13 = (com.hansecom.abt.data.repositories.base.BaseRepository) r13
                    java.lang.Object r2 = r0.G
                    com.hansecom.abt.data.preferences.base.CacheValue r2 = (com.hansecom.abt.data.preferences.base.CacheValue) r2
                    java.lang.Object r4 = r0.E
                    kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                    kotlin.ResultKt.b(r14)
                    goto L_0x0106
                L_0x0050:
                    java.lang.Object r13 = r0.G
                    com.hansecom.abt.data.repositories.base.BaseRepository r13 = (com.hansecom.abt.data.repositories.base.BaseRepository) r13
                    java.lang.Object r2 = r0.E
                    kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                    kotlin.ResultKt.b(r14)
                    goto L_0x00e6
                L_0x005d:
                    java.lang.Object r13 = r0.G
                    kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
                    java.lang.Object r2 = r0.E
                    com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1$2 r2 = (com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1.AnonymousClass2) r2
                    kotlin.ResultKt.b(r14)
                    goto L_0x00d3
                L_0x006a:
                    java.lang.Object r13 = r0.G
                    com.hansecom.abt.data.repositories.base.BaseRepository r13 = (com.hansecom.abt.data.repositories.base.BaseRepository) r13
                    java.lang.Object r2 = r0.E
                    kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                    kotlin.ResultKt.b(r14)
                    goto L_0x00b5
                L_0x0076:
                    kotlin.ResultKt.b(r14)
                    kotlinx.coroutines.flow.FlowCollector r14 = r4
                    r2 = r13
                    com.hansecom.abt.data.preferences.base.CacheValue r2 = (com.hansecom.abt.data.preferences.base.CacheValue) r2
                    com.hansecom.abt.data.repositories.base.BaseRepository r13 = r2
                    timber.log.Timber$Tree r13 = r13.u()
                    com.hansecom.abt.data.repositories.base.BaseRepository r9 = r2
                    java.lang.String r9 = r9.l()
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r9)
                    java.lang.String r9 = " getting ..."
                    r10.append(r9)
                    java.lang.String r9 = r10.toString()
                    r10 = 0
                    java.lang.Object[] r10 = new java.lang.Object[r10]
                    r13.a(r9, r10)
                    if (r2 != 0) goto L_0x00bc
                    com.hansecom.abt.data.repositories.base.BaseRepository r13 = r2
                    r0.E = r14
                    r0.G = r13
                    r0.D = r7
                    java.lang.Object r2 = r13.h(r0)
                    if (r2 != r1) goto L_0x00b2
                    return r1
                L_0x00b2:
                    r11 = r2
                    r2 = r14
                    r14 = r11
                L_0x00b5:
                    kotlinx.coroutines.Job r14 = (kotlinx.coroutines.Job) r14
                    kotlinx.coroutines.Job unused = r13.z(r14)
                L_0x00ba:
                    r13 = r8
                    goto L_0x0111
                L_0x00bc:
                    boolean r13 = r2.f()
                    if (r13 == 0) goto L_0x00ec
                    com.hansecom.abt.data.repositories.base.BaseRepository r13 = r2
                    r0.E = r12
                    r0.G = r14
                    r0.D = r6
                    java.lang.Object r13 = r13.f(r0)
                    if (r13 != r1) goto L_0x00d1
                    return r1
                L_0x00d1:
                    r2 = r12
                    r13 = r14
                L_0x00d3:
                    com.hansecom.abt.data.repositories.base.BaseRepository r14 = r2
                    r0.E = r13
                    r0.G = r14
                    r0.D = r5
                    java.lang.Object r2 = r14.h(r0)
                    if (r2 != r1) goto L_0x00e2
                    return r1
                L_0x00e2:
                    r11 = r2
                    r2 = r13
                    r13 = r14
                    r14 = r11
                L_0x00e6:
                    kotlinx.coroutines.Job r14 = (kotlinx.coroutines.Job) r14
                    kotlinx.coroutines.Job unused = r13.z(r14)
                    goto L_0x00ba
                L_0x00ec:
                    boolean r13 = r2.g()
                    if (r13 == 0) goto L_0x010c
                    com.hansecom.abt.data.repositories.base.BaseRepository r13 = r2
                    r0.E = r14
                    r0.G = r2
                    r0.H = r13
                    r0.D = r4
                    java.lang.Object r4 = r13.h(r0)
                    if (r4 != r1) goto L_0x0103
                    return r1
                L_0x0103:
                    r11 = r4
                    r4 = r14
                    r14 = r11
                L_0x0106:
                    kotlinx.coroutines.Job r14 = (kotlinx.coroutines.Job) r14
                    kotlinx.coroutines.Job unused = r13.z(r14)
                    r14 = r4
                L_0x010c:
                    java.lang.Object r13 = r2.e()
                    r2 = r14
                L_0x0111:
                    r0.E = r8
                    r0.G = r8
                    r0.H = r8
                    r0.D = r3
                    java.lang.Object r13 = r2.c(r13, r0)
                    if (r13 != r1) goto L_0x0120
                    return r1
                L_0x0120:
                    kotlin.Unit r13 = kotlin.Unit.f40552a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository$getFlow$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
