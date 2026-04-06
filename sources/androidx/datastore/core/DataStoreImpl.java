package androidx.datastore.core;

import androidx.datastore.core.UpdatingDataContextElement;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class DataStoreImpl<T> implements DataStore<T> {

    /* renamed from: m  reason: collision with root package name */
    public static final Companion f20548m = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Storage f20549a;

    /* renamed from: b  reason: collision with root package name */
    public final CorruptionHandler f20550b;

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineScope f20551c;

    /* renamed from: d  reason: collision with root package name */
    public final Flow f20552d = FlowKt.I(new DataStoreImpl$data$1(this, (Continuation) null));

    /* renamed from: e  reason: collision with root package name */
    public final Mutex f20553e = MutexKt.b(false, 1, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    public int f20554f;

    /* renamed from: g  reason: collision with root package name */
    public Job f20555g;

    /* renamed from: h  reason: collision with root package name */
    public final DataStoreInMemoryCache f20556h = new DataStoreInMemoryCache();

    /* renamed from: i  reason: collision with root package name */
    public final InitDataStore f20557i;

    /* renamed from: j  reason: collision with root package name */
    public final Lazy f20558j;

    /* renamed from: k  reason: collision with root package name */
    public final Lazy f20559k;

    /* renamed from: l  reason: collision with root package name */
    public final SimpleActor f20560l;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class InitDataStore extends RunOnce {

        /* renamed from: c  reason: collision with root package name */
        public List f20563c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DataStoreImpl f20564d;

        public InitDataStore(DataStoreImpl dataStoreImpl, List list) {
            Intrinsics.i(list, "initTasksList");
            this.f20564d = dataStoreImpl;
            this.f20563c = CollectionsKt.M0(list);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object b(kotlin.coroutines.Continuation r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.F
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.F = r1
                goto L_0x0018
            L_0x0013:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L_0x0018:
                java.lang.Object r7 = r0.D
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.F
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r0 = r0.C
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.ResultKt.b(r7)
                goto L_0x006b
            L_0x0030:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0038:
                java.lang.Object r0 = r0.C
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.ResultKt.b(r7)
                goto L_0x007d
            L_0x0040:
                kotlin.ResultKt.b(r7)
                java.util.List r7 = r6.f20563c
                if (r7 == 0) goto L_0x006e
                kotlin.jvm.internal.Intrinsics.f(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0051
                goto L_0x006e
            L_0x0051:
                androidx.datastore.core.DataStoreImpl r7 = r6.f20564d
                androidx.datastore.core.InterProcessCoordinator r7 = r7.r()
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl r4 = r6.f20564d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.C = r6
                r0.F = r3
                java.lang.Object r7 = r7.c(r2, r0)
                if (r7 != r1) goto L_0x006a
                return r1
            L_0x006a:
                r0 = r6
            L_0x006b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L_0x007f
            L_0x006e:
                androidx.datastore.core.DataStoreImpl r7 = r6.f20564d
                r0.C = r6
                r0.F = r4
                r2 = 0
                java.lang.Object r7 = r7.y(r2, r0)
                if (r7 != r1) goto L_0x007c
                return r1
            L_0x007c:
                r0 = r6
            L_0x007d:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L_0x007f:
                androidx.datastore.core.DataStoreImpl r0 = r0.f20564d
                androidx.datastore.core.DataStoreInMemoryCache r0 = r0.f20556h
                r0.c(r7)
                kotlin.Unit r7 = kotlin.Unit.f40552a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.b(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope) {
        Intrinsics.i(storage, "storage");
        Intrinsics.i(list, "initTasksList");
        Intrinsics.i(corruptionHandler, "corruptionHandler");
        Intrinsics.i(coroutineScope, "scope");
        this.f20549a = storage;
        this.f20550b = corruptionHandler;
        this.f20551c = coroutineScope;
        this.f20557i = new InitDataStore(this, list);
        this.f20558j = LazyKt.b(new DataStoreImpl$storageConnectionDelegate$1(this));
        this.f20559k = LazyKt.b(new DataStoreImpl$coordinator$2(this));
        this.f20560l = new SimpleActor(coroutineScope, new DataStoreImpl$writeActor$1(this), DataStoreImpl$writeActor$2.f20573z, new DataStoreImpl$writeActor$3(this, (Continuation) null));
    }

    public final Object A(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        return r().c(new DataStoreImpl$transformAndWrite$2(this, coroutineContext, function2, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(java.lang.Object r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r12 = r0.C
            kotlin.jvm.internal.Ref$IntRef r12 = (kotlin.jvm.internal.Ref.IntRef) r12
            kotlin.ResultKt.b(r14)
            goto L_0x0058
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            kotlin.ResultKt.b(r14)
            kotlin.jvm.internal.Ref$IntRef r14 = new kotlin.jvm.internal.Ref$IntRef
            r14.<init>()
            androidx.datastore.core.StorageConnection r2 = r11.s()
            androidx.datastore.core.DataStoreImpl$writeData$2 r10 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.C = r14
            r0.F = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r12 = r14
        L_0x0058:
            int r12 = r12.f40906z
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.c(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.B(java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object a(Function2 function2, Continuation continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.f().d(UpdatingDataContextElement.Companion.Key.f20646z);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.e(this);
        }
        return BuildersKt.g(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$updateData$2(this, function2, (Continuation) null), continuation);
    }

    public Flow getData() {
        return this.f20552d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl$decrementCollector$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$decrementCollector$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.D
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.C
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.ResultKt.b(r6)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f20553e
            r0.C = r5
            r0.D = r6
            r0.G = r3
            java.lang.Object r0 = r6.d(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            int r6 = r0.f20554f     // Catch:{ all -> 0x005e }
            int r6 = r6 + -1
            r0.f20554f = r6     // Catch:{ all -> 0x005e }
            if (r6 != 0) goto L_0x0062
            kotlinx.coroutines.Job r6 = r0.f20555g     // Catch:{ all -> 0x005e }
            if (r6 == 0) goto L_0x0060
            kotlinx.coroutines.Job.DefaultImpls.a(r6, r4, r3, r4)     // Catch:{ all -> 0x005e }
            goto L_0x0060
        L_0x005e:
            r6 = move-exception
            goto L_0x006a
        L_0x0060:
            r0.f20555g = r4     // Catch:{ all -> 0x005e }
        L_0x0062:
            kotlin.Unit r6 = kotlin.Unit.f40552a     // Catch:{ all -> 0x005e }
            r1.e(r4)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x006a:
            r1.e(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.p(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object q(boolean z2, Function1 function1, Continuation continuation) {
        return z2 ? function1.invoke(continuation) : r().c(new DataStoreImpl$doWithWriteFileLock$3(function1, (Continuation) null), continuation);
    }

    public final InterProcessCoordinator r() {
        return (InterProcessCoordinator) this.f20559k.getValue();
    }

    public final StorageConnection s() {
        return (StorageConnection) this.f20558j.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(androidx.datastore.core.Message.Update r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.DataStoreImpl$handleUpdate$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.datastore.core.DataStoreImpl$handleUpdate$1 r0 = (androidx.datastore.core.DataStoreImpl$handleUpdate$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$handleUpdate$1 r0 = new androidx.datastore.core.DataStoreImpl$handleUpdate$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0051
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r9 = r0.C
            kotlinx.coroutines.CompletableDeferred r9 = (kotlinx.coroutines.CompletableDeferred) r9
        L_0x002f:
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00bc
        L_0x0034:
            r10 = move-exception
            goto L_0x00de
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            java.lang.Object r9 = r0.E
            kotlinx.coroutines.CompletableDeferred r9 = (kotlinx.coroutines.CompletableDeferred) r9
            java.lang.Object r2 = r0.D
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            java.lang.Object r4 = r0.C
            androidx.datastore.core.Message$Update r4 = (androidx.datastore.core.Message.Update) r4
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0034 }
            r10 = r9
            r9 = r4
            goto L_0x00a4
        L_0x0051:
            java.lang.Object r9 = r0.C
            kotlinx.coroutines.CompletableDeferred r9 = (kotlinx.coroutines.CompletableDeferred) r9
            goto L_0x002f
        L_0x0056:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.CompletableDeferred r10 = r9.a()
            kotlin.Result$Companion r2 = kotlin.Result.f40519A     // Catch:{ all -> 0x0080 }
            androidx.datastore.core.DataStoreInMemoryCache r2 = r8.f20556h     // Catch:{ all -> 0x0080 }
            androidx.datastore.core.State r2 = r2.a()     // Catch:{ all -> 0x0080 }
            boolean r6 = r2 instanceof androidx.datastore.core.Data     // Catch:{ all -> 0x0080 }
            if (r6 == 0) goto L_0x0085
            kotlin.jvm.functions.Function2 r2 = r9.d()     // Catch:{ all -> 0x0080 }
            kotlin.coroutines.CoroutineContext r9 = r9.b()     // Catch:{ all -> 0x0080 }
            r0.C = r10     // Catch:{ all -> 0x0080 }
            r0.H = r5     // Catch:{ all -> 0x0080 }
            java.lang.Object r9 = r8.A(r2, r9, r0)     // Catch:{ all -> 0x0080 }
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00bc
        L_0x0080:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00de
        L_0x0085:
            boolean r6 = r2 instanceof androidx.datastore.core.ReadException     // Catch:{ all -> 0x0080 }
            if (r6 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            boolean r5 = r2 instanceof androidx.datastore.core.UnInitialized     // Catch:{ all -> 0x0080 }
        L_0x008c:
            if (r5 == 0) goto L_0x00cd
            androidx.datastore.core.State r5 = r9.c()     // Catch:{ all -> 0x0080 }
            if (r2 != r5) goto L_0x00c1
            r0.C = r9     // Catch:{ all -> 0x0080 }
            r0.D = r8     // Catch:{ all -> 0x0080 }
            r0.E = r10     // Catch:{ all -> 0x0080 }
            r0.H = r4     // Catch:{ all -> 0x0080 }
            java.lang.Object r2 = r8.v(r0)     // Catch:{ all -> 0x0080 }
            if (r2 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r2 = r8
        L_0x00a4:
            kotlin.jvm.functions.Function2 r4 = r9.d()     // Catch:{ all -> 0x0080 }
            kotlin.coroutines.CoroutineContext r9 = r9.b()     // Catch:{ all -> 0x0080 }
            r0.C = r10     // Catch:{ all -> 0x0080 }
            r5 = 0
            r0.D = r5     // Catch:{ all -> 0x0080 }
            r0.E = r5     // Catch:{ all -> 0x0080 }
            r0.H = r3     // Catch:{ all -> 0x0080 }
            java.lang.Object r9 = r2.A(r4, r9, r0)     // Catch:{ all -> 0x0080 }
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x00bc:
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00e8
        L_0x00c1:
            java.lang.String r9 = "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>"
            kotlin.jvm.internal.Intrinsics.g(r2, r9)     // Catch:{ all -> 0x0080 }
            androidx.datastore.core.ReadException r2 = (androidx.datastore.core.ReadException) r2     // Catch:{ all -> 0x0080 }
            java.lang.Throwable r9 = r2.b()     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x00cd:
            boolean r9 = r2 instanceof androidx.datastore.core.Final     // Catch:{ all -> 0x0080 }
            if (r9 == 0) goto L_0x00d8
            androidx.datastore.core.Final r2 = (androidx.datastore.core.Final) r2     // Catch:{ all -> 0x0080 }
            java.lang.Throwable r9 = r2.b()     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x00d8:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0080 }
            r9.<init>()     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0080 }
        L_0x00de:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r10 = kotlin.ResultKt.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
        L_0x00e8:
            kotlinx.coroutines.CompletableDeferredKt.c(r9, r10)
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.t(androidx.datastore.core.Message$Update, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl$incrementCollector$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl$incrementCollector$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
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
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.ResultKt.b(r12)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003a:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.sync.Mutex r12 = r11.f20553e
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
            int r12 = r0.f20554f     // Catch:{ all -> 0x0067 }
            int r12 = r12 + r3
            r0.f20554f = r12     // Catch:{ all -> 0x0067 }
            if (r12 != r3) goto L_0x0069
            kotlinx.coroutines.CoroutineScope r5 = r0.f20551c     // Catch:{ all -> 0x0067 }
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r8 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch:{ all -> 0x0067 }
            r8.<init>(r0, r4)     // Catch:{ all -> 0x0067 }
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Job r12 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0067 }
            r0.f20555g = r12     // Catch:{ all -> 0x0067 }
            goto L_0x0069
        L_0x0067:
            r12 = move-exception
            goto L_0x0071
        L_0x0069:
            kotlin.Unit r12 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0067 }
            r1.e(r4)
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x0071:
            r1.e(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.u(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r1 = r0.D
            java.lang.Object r0 = r0.C
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.ResultKt.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x006c
        L_0x0032:
            r6 = move-exception
            goto L_0x0073
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            java.lang.Object r2 = r0.C
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.b(r6)
            goto L_0x0057
        L_0x0044:
            kotlin.ResultKt.b(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.r()
            r0.C = r5
            r0.G = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r5
        L_0x0057:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl$InitDataStore r4 = r2.f20557i     // Catch:{ all -> 0x006f }
            r0.C = r2     // Catch:{ all -> 0x006f }
            r0.D = r6     // Catch:{ all -> 0x006f }
            r0.G = r3     // Catch:{ all -> 0x006f }
            java.lang.Object r6 = r4.c(r0)     // Catch:{ all -> 0x006f }
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x006f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L_0x0073:
            androidx.datastore.core.DataStoreInMemoryCache r0 = r0.f20556h
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.v(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 r0 = (androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 r0 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r10 = r0.C
            androidx.datastore.core.DataStoreImpl r10 = (androidx.datastore.core.DataStoreImpl) r10
            kotlin.ResultKt.b(r11)
            goto L_0x00c3
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            java.lang.Object r10 = r0.C
            androidx.datastore.core.DataStoreImpl r10 = (androidx.datastore.core.DataStoreImpl) r10
            kotlin.ResultKt.b(r11)
            goto L_0x00aa
        L_0x0045:
            boolean r10 = r0.E
            java.lang.Object r2 = r0.D
            androidx.datastore.core.State r2 = (androidx.datastore.core.State) r2
            java.lang.Object r5 = r0.C
            androidx.datastore.core.DataStoreImpl r5 = (androidx.datastore.core.DataStoreImpl) r5
            kotlin.ResultKt.b(r11)
            r8 = r11
            r11 = r10
            r10 = r5
            r5 = r2
            r2 = r8
            goto L_0x007c
        L_0x0058:
            kotlin.ResultKt.b(r11)
            androidx.datastore.core.DataStoreInMemoryCache r11 = r9.f20556h
            androidx.datastore.core.State r2 = r11.a()
            boolean r11 = r2 instanceof androidx.datastore.core.UnInitialized
            if (r11 != 0) goto L_0x00dd
            androidx.datastore.core.InterProcessCoordinator r11 = r9.r()
            r0.C = r9
            r0.D = r2
            r0.E = r10
            r0.H = r5
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r5 = r2
            r2 = r11
            r11 = r10
            r10 = r9
        L_0x007c:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            boolean r6 = r5 instanceof androidx.datastore.core.Data
            if (r6 == 0) goto L_0x008b
            int r7 = r5.a()
            goto L_0x008c
        L_0x008b:
            r7 = -1
        L_0x008c:
            if (r6 == 0) goto L_0x0091
            if (r2 != r7) goto L_0x0091
            return r5
        L_0x0091:
            r2 = 0
            if (r11 == 0) goto L_0x00ad
            androidx.datastore.core.InterProcessCoordinator r11 = r10.r()
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 r3 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3
            r3.<init>(r10, r2)
            r0.C = r10
            r0.D = r2
            r0.H = r4
            java.lang.Object r11 = r11.c(r3, r0)
            if (r11 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            kotlin.Pair r11 = (kotlin.Pair) r11
            goto L_0x00c5
        L_0x00ad:
            androidx.datastore.core.InterProcessCoordinator r11 = r10.r()
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 r4 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4
            r4.<init>(r10, r7, r2)
            r0.C = r10
            r0.D = r2
            r0.H = r3
            java.lang.Object r11 = r11.b(r4, r0)
            if (r11 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            kotlin.Pair r11 = (kotlin.Pair) r11
        L_0x00c5:
            java.lang.Object r0 = r11.a()
            androidx.datastore.core.State r0 = (androidx.datastore.core.State) r0
            java.lang.Object r11 = r11.b()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00dc
            androidx.datastore.core.DataStoreInMemoryCache r10 = r10.f20556h
            r10.c(r0)
        L_0x00dc:
            return r0
        L_0x00dd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.w(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object x(Continuation continuation) {
        return StorageConnectionKt.a(s(), continuation);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        if (r12 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2 = r12.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        r12 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        r3 = r6.r();
        r0.C = r6;
        r0.D = r12;
        r0.G = r11;
        r0.H = r2;
        r0.K = 2;
        r3 = r3.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r3 != r1) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        r8 = r2;
        r2 = r11;
        r11 = r8;
        r9 = r3;
        r3 = r12;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r12 = ((java.lang.Number) r12).intValue();
        r3 = r2.r();
        r6 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2(r2, r12, (kotlin.coroutines.Continuation) null);
        r0.C = r2;
        r0.G = r11;
        r0.K = 4;
        r12 = r3.b(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0109, code lost:
        if (r12 != r1) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012b, code lost:
        r6 = r12;
        r12 = r3;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012e, code lost:
        r3.f40908z = r12;
        r12 = new kotlin.jvm.internal.Ref.IntRef();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r3 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3(r2, r7, r12, (kotlin.coroutines.Continuation) null);
        r0.C = r6;
        r0.D = r2;
        r0.E = r12;
        r0.F = null;
        r0.K = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0149, code lost:
        if (r7.q(r11, r3, r0) == r1) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014c, code lost:
        r11 = r12;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014e, code lost:
        r0 = r1.f40908z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0152, code lost:
        if (r0 != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0154, code lost:
        r5 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015d, code lost:
        return new androidx.datastore.core.Data(r0, r5, r11.f40906z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015e, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015f, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0160, code lost:
        kotlin.ExceptionsKt.a(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0163, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return (androidx.datastore.core.Data) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return new androidx.datastore.core.Data(r3, r11, ((java.lang.Number) r12).intValue());
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.K = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.K
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r2) {
                case 0: goto L_0x0094;
                case 1: goto L_0x0089;
                case 2: goto L_0x0076;
                case 3: goto L_0x006b;
                case 4: goto L_0x005c;
                case 5: goto L_0x0042;
                case 6: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002e:
            java.lang.Object r11 = r0.E
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            java.lang.Object r1 = r0.D
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r0 = r0.C
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x003f }
            goto L_0x014e
        L_0x003f:
            r11 = move-exception
            goto L_0x0160
        L_0x0042:
            boolean r11 = r0.G
            java.lang.Object r2 = r0.F
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r3 = r0.E
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r6 = r0.D
            androidx.datastore.core.CorruptionException r6 = (androidx.datastore.core.CorruptionException) r6
            java.lang.Object r7 = r0.C
            androidx.datastore.core.DataStoreImpl r7 = (androidx.datastore.core.DataStoreImpl) r7
            kotlin.ResultKt.b(r12)
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x012e
        L_0x005c:
            boolean r11 = r0.G
            java.lang.Object r2 = r0.C
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.b(r12)     // Catch:{ CorruptionException -> 0x0067 }
            goto L_0x010c
        L_0x0067:
            r12 = move-exception
            r7 = r2
            goto L_0x0110
        L_0x006b:
            boolean r11 = r0.G
            java.lang.Object r2 = r0.C
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.b(r12)     // Catch:{ CorruptionException -> 0x0067 }
            goto L_0x00ef
        L_0x0076:
            int r11 = r0.H
            boolean r2 = r0.G
            java.lang.Object r3 = r0.D
            java.lang.Object r6 = r0.C
            androidx.datastore.core.DataStoreImpl r6 = (androidx.datastore.core.DataStoreImpl) r6
            kotlin.ResultKt.b(r12)     // Catch:{ CorruptionException -> 0x0084 }
            goto L_0x00cd
        L_0x0084:
            r12 = move-exception
            r11 = r2
        L_0x0086:
            r7 = r6
            goto L_0x0110
        L_0x0089:
            boolean r11 = r0.G
            java.lang.Object r2 = r0.C
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.b(r12)     // Catch:{ CorruptionException -> 0x0067 }
            r6 = r2
            goto L_0x00a7
        L_0x0094:
            kotlin.ResultKt.b(r12)
            if (r11 == 0) goto L_0x00dc
            r0.C = r10     // Catch:{ CorruptionException -> 0x00d9 }
            r0.G = r11     // Catch:{ CorruptionException -> 0x00d9 }
            r0.K = r3     // Catch:{ CorruptionException -> 0x00d9 }
            java.lang.Object r12 = r10.x(r0)     // Catch:{ CorruptionException -> 0x00d9 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r6 = r10
        L_0x00a7:
            if (r12 == 0) goto L_0x00b0
            int r2 = r12.hashCode()     // Catch:{ CorruptionException -> 0x00ae }
            goto L_0x00b1
        L_0x00ae:
            r12 = move-exception
            goto L_0x0086
        L_0x00b0:
            r2 = r5
        L_0x00b1:
            androidx.datastore.core.InterProcessCoordinator r3 = r6.r()     // Catch:{ CorruptionException -> 0x00ae }
            r0.C = r6     // Catch:{ CorruptionException -> 0x00ae }
            r0.D = r12     // Catch:{ CorruptionException -> 0x00ae }
            r0.G = r11     // Catch:{ CorruptionException -> 0x00ae }
            r0.H = r2     // Catch:{ CorruptionException -> 0x00ae }
            r7 = 2
            r0.K = r7     // Catch:{ CorruptionException -> 0x00ae }
            java.lang.Object r3 = r3.a(r0)     // Catch:{ CorruptionException -> 0x00ae }
            if (r3 != r1) goto L_0x00c7
            return r1
        L_0x00c7:
            r8 = r2
            r2 = r11
            r11 = r8
            r9 = r3
            r3 = r12
            r12 = r9
        L_0x00cd:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ CorruptionException -> 0x0084 }
            int r12 = r12.intValue()     // Catch:{ CorruptionException -> 0x0084 }
            androidx.datastore.core.Data r7 = new androidx.datastore.core.Data     // Catch:{ CorruptionException -> 0x0084 }
            r7.<init>(r3, r11, r12)     // Catch:{ CorruptionException -> 0x0084 }
            goto L_0x010f
        L_0x00d9:
            r12 = move-exception
            r7 = r10
            goto L_0x0110
        L_0x00dc:
            androidx.datastore.core.InterProcessCoordinator r12 = r10.r()     // Catch:{ CorruptionException -> 0x00d9 }
            r0.C = r10     // Catch:{ CorruptionException -> 0x00d9 }
            r0.G = r11     // Catch:{ CorruptionException -> 0x00d9 }
            r2 = 3
            r0.K = r2     // Catch:{ CorruptionException -> 0x00d9 }
            java.lang.Object r12 = r12.a(r0)     // Catch:{ CorruptionException -> 0x00d9 }
            if (r12 != r1) goto L_0x00ee
            return r1
        L_0x00ee:
            r2 = r10
        L_0x00ef:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ CorruptionException -> 0x0067 }
            int r12 = r12.intValue()     // Catch:{ CorruptionException -> 0x0067 }
            androidx.datastore.core.InterProcessCoordinator r3 = r2.r()     // Catch:{ CorruptionException -> 0x0067 }
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 r6 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2     // Catch:{ CorruptionException -> 0x0067 }
            r6.<init>(r2, r12, r4)     // Catch:{ CorruptionException -> 0x0067 }
            r0.C = r2     // Catch:{ CorruptionException -> 0x0067 }
            r0.G = r11     // Catch:{ CorruptionException -> 0x0067 }
            r12 = 4
            r0.K = r12     // Catch:{ CorruptionException -> 0x0067 }
            java.lang.Object r12 = r3.b(r6, r0)     // Catch:{ CorruptionException -> 0x0067 }
            if (r12 != r1) goto L_0x010c
            return r1
        L_0x010c:
            r7 = r12
            androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7     // Catch:{ CorruptionException -> 0x0067 }
        L_0x010f:
            return r7
        L_0x0110:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            androidx.datastore.core.CorruptionHandler r3 = r7.f20550b
            r0.C = r7
            r0.D = r12
            r0.E = r2
            r0.F = r2
            r0.G = r11
            r6 = 5
            r0.K = r6
            java.lang.Object r3 = r3.a(r12, r0)
            if (r3 != r1) goto L_0x012b
            return r1
        L_0x012b:
            r6 = r12
            r12 = r3
            r3 = r2
        L_0x012e:
            r3.f40908z = r12
            kotlin.jvm.internal.Ref$IntRef r12 = new kotlin.jvm.internal.Ref$IntRef
            r12.<init>()
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 r3 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3     // Catch:{ all -> 0x015e }
            r3.<init>(r2, r7, r12, r4)     // Catch:{ all -> 0x015e }
            r0.C = r6     // Catch:{ all -> 0x015e }
            r0.D = r2     // Catch:{ all -> 0x015e }
            r0.E = r12     // Catch:{ all -> 0x015e }
            r0.F = r4     // Catch:{ all -> 0x015e }
            r4 = 6
            r0.K = r4     // Catch:{ all -> 0x015e }
            java.lang.Object r11 = r7.q(r11, r3, r0)     // Catch:{ all -> 0x015e }
            if (r11 != r1) goto L_0x014c
            return r1
        L_0x014c:
            r11 = r12
            r1 = r2
        L_0x014e:
            androidx.datastore.core.Data r12 = new androidx.datastore.core.Data
            java.lang.Object r0 = r1.f40908z
            if (r0 == 0) goto L_0x0158
            int r5 = r0.hashCode()
        L_0x0158:
            int r11 = r11.f40906z
            r12.<init>(r0, r5, r11)
            return r12
        L_0x015e:
            r11 = move-exception
            r0 = r6
        L_0x0160:
            kotlin.ExceptionsKt.a(r0, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.y(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object z(boolean z2, Continuation continuation) {
        return BuildersKt.g(this.f20551c.getCoroutineContext(), new DataStoreImpl$readState$2(this, z2, (Continuation) null), continuation);
    }
}
