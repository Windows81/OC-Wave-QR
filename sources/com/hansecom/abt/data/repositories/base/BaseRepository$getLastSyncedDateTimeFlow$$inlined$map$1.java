package com.hansecom.abt.data.repositories.base;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1 implements Flow<LocalDateTime> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BaseRepository f33581A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f33582z;

    public BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1(Flow flow, BaseRepository baseRepository) {
        this.f33582z = flow;
        this.f33581A = baseRepository;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f33582z;
        final BaseRepository baseRepository = this.f33581A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r6 = r7 instanceof com.hansecom.abt.data.repositories.base.BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r6 == 0) goto L_0x0013
                    r6 = r7
                    com.hansecom.abt.data.repositories.base.BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1$2$1 r6 = (com.hansecom.abt.data.repositories.base.BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                    int r0 = r6.D
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L_0x0013
                    int r0 = r0 - r1
                    r6.D = r0
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.data.repositories.base.BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1$2$1 r6 = new com.hansecom.abt.data.repositories.base.BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1$2$1
                    r6.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r6.C
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r6.D
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x003c
                    if (r1 == r3) goto L_0x0034
                    if (r1 != r2) goto L_0x002c
                    kotlin.ResultKt.b(r7)
                    goto L_0x0064
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r1 = r6.E
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    kotlin.ResultKt.b(r7)
                    goto L_0x0058
                L_0x003c:
                    kotlin.ResultKt.b(r7)
                    kotlinx.coroutines.flow.FlowCollector r1 = r4
                    com.hansecom.abt.data.repositories.base.BaseRepository r7 = r2
                    com.hansecom.abt.data.preferences.base.BaseLocalDataProvider r7 = r7.t()
                    com.hansecom.abt.data.repositories.base.BaseRepository r4 = r2
                    com.hansecom.abt.data.preferences.base.Seconds r4 = r4.w()
                    r6.E = r1
                    r6.D = r3
                    java.lang.Object r7 = r7.e(r4, r6)
                    if (r7 != r0) goto L_0x0058
                    return r0
                L_0x0058:
                    r3 = 0
                    r6.E = r3
                    r6.D = r2
                    java.lang.Object r6 = r1.c(r7, r6)
                    if (r6 != r0) goto L_0x0064
                    return r0
                L_0x0064:
                    kotlin.Unit r6 = kotlin.Unit.f40552a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
