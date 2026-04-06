package com.hansecom.abt.data.repositories.base;

import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.abt.data.preferences.base.Seconds;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public abstract class MultipleValueRepository<P, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Seconds f33586a;

    /* renamed from: b  reason: collision with root package name */
    public final Seconds f33587b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMapLocalDataProvider f33588c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33589d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f33590e = new LinkedHashMap();

    public MultipleValueRepository(Seconds seconds, Seconds seconds2, HashMapLocalDataProvider hashMapLocalDataProvider) {
        Intrinsics.i(seconds, "timeToRefresh");
        Intrinsics.i(seconds2, "timeToExpiry");
        Intrinsics.i(hashMapLocalDataProvider, "hashMapLocalDataProvider");
        this.f33586a = seconds;
        this.f33587b = seconds2;
        this.f33588c = hashMapLocalDataProvider;
        this.f33589d = hashMapLocalDataProvider.p();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object e(com.hansecom.abt.data.repositories.base.MultipleValueRepository r4, java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof com.hansecom.abt.data.repositories.base.MultipleValueRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.repositories.base.MultipleValueRepository$get$1 r0 = (com.hansecom.abt.data.repositories.base.MultipleValueRepository$get$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.MultipleValueRepository$get$1 r0 = new com.hansecom.abt.data.repositories.base.MultipleValueRepository$get$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r4 = r6.j()
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.data.repositories.base.BaseRepository r4 = r4.m(r5)
            r0.E = r3
            java.lang.Object r4 = r4.i(r0)
            if (r4 != r1) goto L_0x0047
            return r1
        L_0x0047:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.MultipleValueRepository.e(com.hansecom.abt.data.repositories.base.MultipleValueRepository, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object a(Object obj, Continuation continuation) {
        Object f2 = m(obj).f(continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.repositories.base.MultipleValueRepository$clearCache$2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.repositories.base.MultipleValueRepository$clearCache$2 r0 = (com.hansecom.abt.data.repositories.base.MultipleValueRepository$clearCache$2) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.MultipleValueRepository$clearCache$2 r0 = new com.hansecom.abt.data.repositories.base.MultipleValueRepository$clearCache$2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r2 = r0.C
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.b(r5)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r5)
            java.util.Map r5 = r4.f33590e
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r2 = r5
        L_0x0045:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r2.next()
            com.hansecom.abt.data.repositories.base.BaseRepository r5 = (com.hansecom.abt.data.repositories.base.BaseRepository) r5
            r0.C = r2
            r0.F = r3
            java.lang.Object r5 = r5.f(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x005c:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.MultipleValueRepository.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final BaseRepository c(Object obj) {
        return new MultipleValueRepository$createNewParameterRepository$1(this, obj, this.f33586a, this.f33587b);
    }

    public Object d(Object obj, Continuation continuation) {
        return e(this, obj, continuation);
    }

    public Flow f(Object obj) {
        Intrinsics.i(obj, "parameter");
        return FlowKt.C(m(obj).o());
    }

    public final Flow g(Object obj) {
        Intrinsics.i(obj, "parameter");
        return FlowKt.j(new MultipleValueRepository$getFlowWithAutoRefresh$1(this, obj, (Continuation) null));
    }

    public Flow h(Object obj) {
        Intrinsics.i(obj, "parameter");
        return FlowKt.C(m(obj).p());
    }

    public final Flow i(Object obj) {
        Intrinsics.i(obj, "parameter");
        return FlowKt.C(m(obj).r());
    }

    public abstract Function2 j();

    public final HashMapLocalDataProvider k() {
        return this.f33588c;
    }

    public final String l() {
        return this.f33589d;
    }

    public final BaseRepository m(Object obj) {
        Intrinsics.i(obj, "parameter");
        Map map = this.f33590e;
        Object obj2 = map.get(obj);
        if (obj2 == null) {
            obj2 = c(obj);
            map.put(obj, obj2);
        }
        return (BaseRepository) obj2;
    }

    public final Object n(Object obj, Continuation continuation) {
        Object D = m(obj).D(continuation);
        return D == IntrinsicsKt.f() ? D : Unit.f40552a;
    }

    public final Object o(Object obj, Continuation continuation) {
        Object G = m(obj).G(continuation);
        return G == IntrinsicsKt.f() ? G : Unit.f40552a;
    }

    public final Object p(Object obj, Continuation continuation) {
        Object H = m(obj).H(continuation);
        return H == IntrinsicsKt.f() ? H : Unit.f40552a;
    }
}
