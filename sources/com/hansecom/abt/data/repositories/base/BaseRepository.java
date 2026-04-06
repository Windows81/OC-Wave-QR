package com.hansecom.abt.data.repositories.base;

import com.hansecom.abt.data.preferences.base.BaseLocalDataProvider;
import com.hansecom.abt.data.preferences.base.Seconds;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import timber.log.Timber;

@Metadata
public abstract class BaseRepository<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Seconds f33560a;

    /* renamed from: b  reason: collision with root package name */
    public final Seconds f33561b;

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineExceptionHandler f33562c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineScope f33563d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableSharedFlow f33564e = SharedFlowKt.b(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public Job f33565f;

    /* renamed from: g  reason: collision with root package name */
    public final Mutex f33566g = MutexKt.b(false, 1, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    public final Mutex f33567h = MutexKt.b(false, 1, (Object) null);

    /* renamed from: i  reason: collision with root package name */
    public final Lazy f33568i = LazyKt.b(new a());

    public BaseRepository(Seconds seconds, Seconds seconds2) {
        Intrinsics.i(seconds, "timeToRefresh");
        Intrinsics.i(seconds2, "timeToExpiry");
        this.f33560a = seconds;
        this.f33561b = seconds2;
        BaseRepository$special$$inlined$CoroutineExceptionHandler$1 baseRepository$special$$inlined$CoroutineExceptionHandler$1 = new BaseRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.f41378w, this);
        this.f33562c = baseRepository$special$$inlined$CoroutineExceptionHandler$1;
        this.f33563d = CoroutineScopeKt.a(Dispatchers.b().y(baseRepository$special$$inlined$CoroutineExceptionHandler$1).y(SupervisorKt.b((Job) null, 1, (Object) null)));
    }

    public static final Timber.Tree A() {
        return Timber.f44337a.p("Cache Repository");
    }

    public static /* synthetic */ Object C(BaseRepository baseRepository, Continuation continuation) {
        Object h2 = baseRepository.t().h(continuation);
        return h2 == IntrinsicsKt.f() ? h2 : Unit.f40552a;
    }

    public static /* synthetic */ Object E(BaseRepository baseRepository, Continuation continuation) {
        Object i2 = baseRepository.t().i(continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }

    public static /* synthetic */ Object K(BaseRepository baseRepository, Object obj, Seconds seconds, Seconds seconds2, Continuation continuation, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                seconds = baseRepository.f33560a;
            }
            if ((i2 & 4) != 0) {
                seconds2 = baseRepository.f33561b;
            }
            return baseRepository.J(obj, seconds, seconds2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }

    public static /* synthetic */ Object g(BaseRepository baseRepository, Continuation continuation) {
        if (baseRepository.f33565f != null) {
            Job.DefaultImpls.a(baseRepository.m(), (CancellationException) null, 1, (Object) null);
        }
        Object b2 = baseRepository.t().b(continuation);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object j(com.hansecom.abt.data.repositories.base.BaseRepository r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof com.hansecom.abt.data.repositories.base.BaseRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.repositories.base.BaseRepository$get$1 r0 = (com.hansecom.abt.data.repositories.base.BaseRepository$get$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.BaseRepository$get$1 r0 = new com.hansecom.abt.data.repositories.base.BaseRepository$get$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.flow.Flow r4 = r4.p()
            r0.E = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.D(r4, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r4 = r5.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository.j(com.hansecom.abt.data.repositories.base.BaseRepository, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object B(Continuation continuation) {
        return C(this, continuation);
    }

    public Object D(Continuation continuation) {
        return E(this, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.repositories.base.BaseRepository$markAsNotFreshAndRefresh$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.repositories.base.BaseRepository$markAsNotFreshAndRefresh$1 r0 = (com.hansecom.abt.data.repositories.base.BaseRepository$markAsNotFreshAndRefresh$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.BaseRepository$markAsNotFreshAndRefresh$1 r0 = new com.hansecom.abt.data.repositories.base.BaseRepository$markAsNotFreshAndRefresh$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r6)
            goto L_0x0057
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.data.repositories.base.BaseRepository r2 = (com.hansecom.abt.data.repositories.base.BaseRepository) r2
            kotlin.ResultKt.b(r6)
            goto L_0x004b
        L_0x003c:
            kotlin.ResultKt.b(r6)
            r0.C = r5
            r0.F = r4
            java.lang.Object r6 = r5.D(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            r6 = 0
            r0.C = r6
            r0.F = r3
            java.lang.Object r6 = r2.H(r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository.F(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.repositories.base.BaseRepository$refreshData$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.repositories.base.BaseRepository$refreshData$1 r0 = (com.hansecom.abt.data.repositories.base.BaseRepository$refreshData$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.BaseRepository$refreshData$1 r0 = new com.hansecom.abt.data.repositories.base.BaseRepository$refreshData$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r6)
            goto L_0x004f
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.b(r6)
            goto L_0x0044
        L_0x0038:
            kotlin.ResultKt.b(r6)
            r0.E = r4
            java.lang.Object r6 = r5.h(r0)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            r0.E = r3
            java.lang.Object r6 = r6.D(r0)
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.repositories.base.BaseRepository$refreshDataInBackground$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.repositories.base.BaseRepository$refreshDataInBackground$1 r0 = (com.hansecom.abt.data.repositories.base.BaseRepository$refreshDataInBackground$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.BaseRepository$refreshDataInBackground$1 r0 = new com.hansecom.abt.data.repositories.base.BaseRepository$refreshDataInBackground$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.C
            com.hansecom.abt.data.repositories.base.BaseRepository r0 = (com.hansecom.abt.data.repositories.base.BaseRepository) r0
            kotlin.ResultKt.b(r5)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r5)
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r4.h(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r0.z(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository.H(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void I(Job job) {
        Intrinsics.i(job, "<set-?>");
        this.f33565f = job;
    }

    public final Object J(Object obj, Seconds seconds, Seconds seconds2, Continuation continuation) {
        Object g2 = BuildersKt.g(Dispatchers.b(), new BaseRepository$update$2(this, obj, seconds, seconds2, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public Object f(Continuation continuation) {
        return g(this, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$1 r0 = (com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$1 r0 = new com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.D
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.C
            com.hansecom.abt.data.repositories.base.BaseRepository r0 = (com.hansecom.abt.data.repositories.base.BaseRepository) r0
            kotlin.ResultKt.b(r12)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003a:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.sync.Mutex r12 = r11.f33566g
            r0.C = r11
            r0.D = r12
            r0.G = r3
            java.lang.Object r0 = r12.d(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r11
            r1 = r12
        L_0x004e:
            boolean r12 = r0.y()     // Catch:{ all -> 0x005f }
            if (r12 == 0) goto L_0x0061
            kotlinx.coroutines.Job r12 = r0.m()     // Catch:{ all -> 0x005f }
            boolean r12 = r12.b()     // Catch:{ all -> 0x005f }
            if (r12 != 0) goto L_0x0073
            goto L_0x0061
        L_0x005f:
            r12 = move-exception
            goto L_0x007d
        L_0x0061:
            kotlinx.coroutines.CoroutineScope r5 = r0.f33563d     // Catch:{ all -> 0x005f }
            com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$2$1 r8 = new com.hansecom.abt.data.repositories.base.BaseRepository$fetchFromNetwork$2$1     // Catch:{ all -> 0x005f }
            r8.<init>(r0, r4)     // Catch:{ all -> 0x005f }
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Job r12 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x005f }
            r0.I(r12)     // Catch:{ all -> 0x005f }
        L_0x0073:
            kotlin.Unit r12 = kotlin.Unit.f40552a     // Catch:{ all -> 0x005f }
            r1.e(r4)
            kotlinx.coroutines.Job r12 = r0.m()
            return r12
        L_0x007d:
            r1.e(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.base.BaseRepository.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object i(Continuation continuation) {
        return j(this, continuation);
    }

    public final CoroutineScope k() {
        return this.f33563d;
    }

    public final String l() {
        String v2 = v();
        return v2 + " -->";
    }

    public final Job m() {
        Job job = this.f33565f;
        if (job != null) {
            return job;
        }
        Intrinsics.y("fetchJob");
        return null;
    }

    public final Mutex n() {
        return this.f33566g;
    }

    public final Flow o() {
        return new BaseRepository$getFlow$$inlined$mapNotNull$1(new BaseRepository$getFlow$$inlined$map$1(t().d(), this));
    }

    public final Flow p() {
        return FlowKt.S(new BaseRepository$getFlowWithErrors$$inlined$map$1(o()), new BaseRepository$getFlowWithErrors$$inlined$map$2(this.f33564e));
    }

    public abstract Object q(Continuation continuation);

    public final Flow r() {
        return new BaseRepository$getFreshnessDataFlow$$inlined$map$1(t().d());
    }

    public final Flow s() {
        return new BaseRepository$getLastSyncedDateTimeFlow$$inlined$map$1(o(), this);
    }

    public abstract BaseLocalDataProvider t();

    public final Timber.Tree u() {
        return (Timber.Tree) this.f33568i.getValue();
    }

    public abstract String v();

    public final Seconds w() {
        return this.f33561b;
    }

    public final Seconds x() {
        return this.f33560a;
    }

    public final boolean y() {
        return this.f33565f != null;
    }

    public final Job z(Job job) {
        return BuildersKt__Builders_commonKt.d(this.f33563d, (CoroutineContext) null, (CoroutineStart) null, new BaseRepository$launchInParallel$1(job, (Continuation) null), 3, (Object) null);
    }
}
