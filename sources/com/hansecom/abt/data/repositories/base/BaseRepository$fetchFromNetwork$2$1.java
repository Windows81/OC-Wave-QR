package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$2$1", f = "BaseRepository.kt", l = {113, 115, 121}, m = "invokeSuspend")
public final class BaseRepository$fetchFromNetwork$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public Object F;
    public int G;
    public final /* synthetic */ BaseRepository H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRepository$fetchFromNetwork$2$1(BaseRepository baseRepository, Continuation continuation) {
        super(2, continuation);
        this.H = baseRepository;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseRepository$fetchFromNetwork$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new BaseRepository$fetchFromNetwork$2$1(this.H, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r8.G
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            if (r1 == r4) goto L_0x002d
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r0 = r8.F
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r1 = r8.E
            com.hansecom.abt.data.repositories.base.BaseRepository r1 = (com.hansecom.abt.data.repositories.base.BaseRepository) r1
            kotlin.ResultKt.b(r9)
            goto L_0x00be
        L_0x001f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0027:
            java.lang.Object r1 = r8.D
            kotlin.ResultKt.b(r9)
            goto L_0x00a1
        L_0x002d:
            kotlin.ResultKt.b(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.j()
        L_0x0036:
            r1 = r9
            goto L_0x0068
        L_0x0038:
            kotlin.ResultKt.b(r9)
            com.hansecom.abt.data.repositories.base.BaseRepository r9 = r8.H
            timber.log.Timber$Tree r9 = r9.u()
            com.hansecom.abt.data.repositories.base.BaseRepository r1 = r8.H
            java.lang.String r1 = r1.l()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r1 = " fetching from network 📶 🚀 ..."
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r9.a(r1, r6)
            com.hansecom.abt.data.repositories.base.BaseRepository r9 = r8.H
            r8.G = r4
            java.lang.Object r9 = r9.q(r8)
            if (r9 != r0) goto L_0x0036
            return r0
        L_0x0068:
            com.hansecom.abt.data.repositories.base.BaseRepository r9 = r8.H
            boolean r4 = kotlin.Result.h(r1)
            if (r4 == 0) goto L_0x00a1
            timber.log.Timber$Tree r4 = r9.u()
            java.lang.String r6 = r9.l()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " fetched from network 📶 ✅..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r4.a(r6, r7)
            com.hansecom.abt.data.preferences.base.Seconds r4 = r9.x()
            com.hansecom.abt.data.preferences.base.Seconds r6 = r9.w()
            r8.D = r1
            r8.G = r3
            java.lang.Object r9 = r9.J(r1, r4, r6, r8)
            if (r9 != r0) goto L_0x00a1
            return r0
        L_0x00a1:
            com.hansecom.abt.data.repositories.base.BaseRepository r9 = r8.H
            java.lang.Throwable r3 = kotlin.Result.e(r1)
            if (r3 == 0) goto L_0x00e1
            kotlinx.coroutines.flow.MutableSharedFlow r4 = r9.f33564e
            r8.D = r1
            r8.E = r9
            r8.F = r3
            r8.G = r2
            java.lang.Object r1 = r4.c(r3, r8)
            if (r1 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            r1 = r9
            r0 = r3
        L_0x00be:
            timber.log.Timber$Forest r9 = timber.log.Timber.f44337a
            r9.c(r0)
            timber.log.Timber$Tree r9 = r1.u()
            java.lang.String r1 = r1.l()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " error fetching from network 📶 ❌..."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r9.d(r0, r1, r2)
        L_0x00e1:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$2$1.x(java.lang.Object):java.lang.Object");
    }
}
