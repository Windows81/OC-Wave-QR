package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* renamed from: j  reason: collision with root package name */
    public static final Companion f20597j = new Companion((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final String f20598k = "Resource deadlock would occur";

    /* renamed from: l  reason: collision with root package name */
    public static final long f20599l = 10;

    /* renamed from: m  reason: collision with root package name */
    public static final long f20600m = 60000;

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f20601a;

    /* renamed from: b  reason: collision with root package name */
    public final File f20602b;

    /* renamed from: c  reason: collision with root package name */
    public final Flow f20603c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20604d = ".lock";

    /* renamed from: e  reason: collision with root package name */
    public final String f20605e = ".version";

    /* renamed from: f  reason: collision with root package name */
    public final String f20606f = "fcntl failed: EAGAIN";

    /* renamed from: g  reason: collision with root package name */
    public final Mutex f20607g = MutexKt.b(false, 1, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    public final Lazy f20608h = LazyKt.b(new MultiProcessCoordinator$lockFile$2(this));

    /* renamed from: i  reason: collision with root package name */
    public final Lazy f20609i = LazyKt.b(new MultiProcessCoordinator$lazySharedCounter$1(this));

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[SYNTHETIC, Splitter:B:15:0x0049] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(java.io.FileOutputStream r14, kotlin.coroutines.Continuation r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L_0x0013
                r0 = r15
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.G
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.G = r1
                goto L_0x0018
            L_0x0013:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r13, r15)
            L_0x0018:
                java.lang.Object r15 = r0.E
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.G
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r4) goto L_0x0030
                long r5 = r0.D
                java.lang.Object r14 = r0.C
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                kotlin.ResultKt.b(r15)
                goto L_0x007d
            L_0x0030:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L_0x0038:
                kotlin.ResultKt.b(r15)
                long r5 = androidx.datastore.core.MultiProcessCoordinator.f20599l
            L_0x003f:
                long r7 = androidx.datastore.core.MultiProcessCoordinator.f20600m
                int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
                if (r15 > 0) goto L_0x0081
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch:{ IOException -> 0x005d }
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r15 = r7.lock(r8, r10, r12)     // Catch:{ IOException -> 0x005d }
                kotlin.jvm.internal.Intrinsics.h(r15, r2)     // Catch:{ IOException -> 0x005d }
                return r15
            L_0x005d:
                r15 = move-exception
                java.lang.String r2 = r15.getMessage()
                if (r2 == 0) goto L_0x0080
                java.lang.String r7 = androidx.datastore.core.MultiProcessCoordinator.f20598k
                r8 = 0
                r9 = 0
                boolean r2 = kotlin.text.StringsKt.W(r2, r7, r8, r3, r9)
                if (r2 != r4) goto L_0x0080
                r0.C = r14
                r0.D = r5
                r0.G = r4
                java.lang.Object r15 = kotlinx.coroutines.DelayKt.b(r5, r0)
                if (r15 != r1) goto L_0x007d
                return r1
            L_0x007d:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L_0x003f
            L_0x0080:
                throw r15
            L_0x0081:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                kotlin.jvm.internal.Intrinsics.h(r14, r2)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.b(java.io.FileOutputStream, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public Companion() {
        }
    }

    public MultiProcessCoordinator(CoroutineContext coroutineContext, File file) {
        Intrinsics.i(coroutineContext, "context");
        Intrinsics.i(file, "file");
        this.f20601a = coroutineContext;
        this.f20602b = file;
        this.f20603c = MulticastFileObserver.f20615c.e(file);
    }

    public Object a(Continuation continuation) {
        return this.f20609i.b() ? Boxing.c(r().b()) : BuildersKt.g(this.f20601a, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, (Continuation) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e5 A[SYNTHETIC, Splitter:B:59:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.jvm.functions.Function2 r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            boolean r3 = r0 instanceof androidx.datastore.core.MultiProcessCoordinator$tryLock$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            androidx.datastore.core.MultiProcessCoordinator$tryLock$1 r3 = (androidx.datastore.core.MultiProcessCoordinator$tryLock$1) r3
            int r4 = r3.I
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.I = r4
            goto L_0x001e
        L_0x0019:
            androidx.datastore.core.MultiProcessCoordinator$tryLock$1 r3 = new androidx.datastore.core.MultiProcessCoordinator$tryLock$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.G
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.I
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x005a
            if (r5 == r7) goto L_0x004d
            if (r5 != r6) goto L_0x0045
            boolean r2 = r3.F
            java.lang.Object r4 = r3.E
            java.nio.channels.FileLock r4 = (java.nio.channels.FileLock) r4
            java.lang.Object r5 = r3.D
            java.io.Closeable r5 = (java.io.Closeable) r5
            java.lang.Object r3 = r3.C
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            kotlin.ResultKt.b(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x00e3
        L_0x0042:
            r0 = move-exception
            goto L_0x00fc
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004d:
            boolean r2 = r3.F
            java.lang.Object r3 = r3.C
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            kotlin.ResultKt.b(r0)     // Catch:{ all -> 0x0057 }
            goto L_0x0079
        L_0x0057:
            r0 = move-exception
            goto L_0x0109
        L_0x005a:
            kotlin.ResultKt.b(r0)
            kotlinx.coroutines.sync.Mutex r5 = r1.f20607g
            boolean r9 = r5.a(r8)
            r10 = 0
            if (r9 != 0) goto L_0x0084
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r10)     // Catch:{ all -> 0x007f }
            r3.C = r5     // Catch:{ all -> 0x007f }
            r3.F = r9     // Catch:{ all -> 0x007f }
            r3.I = r7     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r2.m(r0, r3)     // Catch:{ all -> 0x007f }
            if (r0 != r4) goto L_0x0077
            return r4
        L_0x0077:
            r3 = r5
            r2 = r9
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r3.e(r8)
        L_0x007e:
            return r0
        L_0x007f:
            r0 = move-exception
            r3 = r5
            r2 = r9
            goto L_0x0109
        L_0x0084:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ all -> 0x007f }
            java.io.File r0 = r18.q()     // Catch:{ all -> 0x007f }
            r11.<init>(r0)     // Catch:{ all -> 0x007f }
            java.nio.channels.FileChannel r12 = r11.getChannel()     // Catch:{ IOException -> 0x00a7 }
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = 1
            r13 = 0
            java.nio.channels.FileLock r0 = r12.tryLock(r13, r15, r17)     // Catch:{ IOException -> 0x00a7 }
            r12 = r0
            goto L_0x00c6
        L_0x00a0:
            r0 = move-exception
            r3 = r5
            r4 = r8
            r2 = r9
            r5 = r11
            goto L_0x00fc
        L_0x00a7:
            r0 = move-exception
            java.lang.String r12 = r0.getMessage()     // Catch:{ all -> 0x00a0 }
            if (r12 == 0) goto L_0x00b7
            java.lang.String r13 = r1.f20606f     // Catch:{ all -> 0x00a0 }
            boolean r12 = kotlin.text.StringsKt.Q(r12, r13, r10, r6, r8)     // Catch:{ all -> 0x00a0 }
            if (r12 != r7) goto L_0x00b7
            goto L_0x00c5
        L_0x00b7:
            java.lang.String r12 = r0.getMessage()     // Catch:{ all -> 0x00a0 }
            if (r12 == 0) goto L_0x00fb
            java.lang.String r13 = f20598k     // Catch:{ all -> 0x00a0 }
            boolean r12 = kotlin.text.StringsKt.Q(r12, r13, r10, r6, r8)     // Catch:{ all -> 0x00a0 }
            if (r12 != r7) goto L_0x00fb
        L_0x00c5:
            r12 = r8
        L_0x00c6:
            if (r12 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r7 = r10
        L_0x00ca:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r7)     // Catch:{ all -> 0x00f5 }
            r3.C = r5     // Catch:{ all -> 0x00f5 }
            r3.D = r11     // Catch:{ all -> 0x00f5 }
            r3.E = r12     // Catch:{ all -> 0x00f5 }
            r3.F = r9     // Catch:{ all -> 0x00f5 }
            r3.I = r6     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = r2.m(r0, r3)     // Catch:{ all -> 0x00f5 }
            if (r0 != r4) goto L_0x00df
            return r4
        L_0x00df:
            r3 = r5
            r2 = r9
            r5 = r11
            r4 = r12
        L_0x00e3:
            if (r4 == 0) goto L_0x00ec
            r4.release()     // Catch:{ all -> 0x00e9 }
            goto L_0x00ec
        L_0x00e9:
            r0 = move-exception
            r4 = r0
            goto L_0x0102
        L_0x00ec:
            kotlin.io.CloseableKt.a(r5, r8)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x00f4
            r3.e(r8)
        L_0x00f4:
            return r0
        L_0x00f5:
            r0 = move-exception
            r3 = r5
            r2 = r9
            r5 = r11
            r4 = r12
            goto L_0x00fc
        L_0x00fb:
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00fc:
            if (r4 == 0) goto L_0x0101
            r4.release()     // Catch:{ all -> 0x00e9 }
        L_0x0101:
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x0102:
            throw r4     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            r6 = r0
            kotlin.io.CloseableKt.a(r5, r4)     // Catch:{ all -> 0x0057 }
            throw r6     // Catch:{ all -> 0x0057 }
        L_0x0109:
            if (r2 == 0) goto L_0x010e
            r3.e(r8)
        L_0x010e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.b(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb A[SYNTHETIC, Splitter:B:43:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d9 A[SYNTHETIC, Splitter:B:58:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.MultiProcessCoordinator$lock$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.datastore.core.MultiProcessCoordinator$lock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$lock$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.MultiProcessCoordinator$lock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$lock$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0070
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r9 = r0.E
            java.nio.channels.FileLock r9 = (java.nio.channels.FileLock) r9
            java.lang.Object r1 = r0.D
            java.io.Closeable r1 = (java.io.Closeable) r1
            java.lang.Object r0 = r0.C
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x003d }
            goto L_0x00b9
        L_0x003d:
            r10 = move-exception
            goto L_0x00d7
        L_0x0040:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0048:
            java.lang.Object r9 = r0.E
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.C
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0058 }
            goto L_0x00a4
        L_0x0058:
            r10 = move-exception
            r1 = r9
            r0 = r2
        L_0x005b:
            r9 = r6
            goto L_0x00d7
        L_0x005e:
            java.lang.Object r9 = r0.E
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.Object r2 = r0.D
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r5 = r0.C
            androidx.datastore.core.MultiProcessCoordinator r5 = (androidx.datastore.core.MultiProcessCoordinator) r5
            kotlin.ResultKt.b(r10)
            r10 = r9
            r9 = r2
            goto L_0x0085
        L_0x0070:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.sync.Mutex r10 = r8.f20607g
            r0.C = r8
            r0.D = r9
            r0.E = r10
            r0.H = r5
            java.lang.Object r2 = r10.d(r6, r0)
            if (r2 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r5 = r8
        L_0x0085:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00e3 }
            java.io.File r5 = r5.q()     // Catch:{ all -> 0x00e3 }
            r2.<init>(r5)     // Catch:{ all -> 0x00e3 }
            androidx.datastore.core.MultiProcessCoordinator$Companion r5 = f20597j     // Catch:{ all -> 0x00d2 }
            r0.C = r9     // Catch:{ all -> 0x00d2 }
            r0.D = r10     // Catch:{ all -> 0x00d2 }
            r0.E = r2     // Catch:{ all -> 0x00d2 }
            r0.H = r4     // Catch:{ all -> 0x00d2 }
            java.lang.Object r4 = r5.b(r2, r0)     // Catch:{ all -> 0x00d2 }
            if (r4 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r7 = r4
            r4 = r9
            r9 = r2
            r2 = r10
            r10 = r7
        L_0x00a4:
            java.nio.channels.FileLock r10 = (java.nio.channels.FileLock) r10     // Catch:{ all -> 0x0058 }
            r0.C = r2     // Catch:{ all -> 0x00cc }
            r0.D = r9     // Catch:{ all -> 0x00cc }
            r0.E = r10     // Catch:{ all -> 0x00cc }
            r0.H = r3     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r4.invoke(r0)     // Catch:{ all -> 0x00cc }
            if (r0 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r2
        L_0x00b9:
            if (r9 == 0) goto L_0x00c2
            r9.release()     // Catch:{ all -> 0x00bf }
            goto L_0x00c2
        L_0x00bf:
            r9 = move-exception
            r10 = r0
            goto L_0x00dd
        L_0x00c2:
            kotlin.io.CloseableKt.a(r1, r6)     // Catch:{ all -> 0x00c9 }
            r0.e(r6)
            return r10
        L_0x00c9:
            r9 = move-exception
            r10 = r0
            goto L_0x00e4
        L_0x00cc:
            r0 = move-exception
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            goto L_0x00d7
        L_0x00d2:
            r9 = move-exception
            r0 = r10
            r1 = r2
            r10 = r9
            goto L_0x005b
        L_0x00d7:
            if (r9 == 0) goto L_0x00dc
            r9.release()     // Catch:{ all -> 0x00bf }
        L_0x00dc:
            throw r10     // Catch:{ all -> 0x00bf }
        L_0x00dd:
            throw r9     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r1, r9)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r9 = move-exception
        L_0x00e4:
            r10.e(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.c(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Flow d() {
        return this.f20603c;
    }

    public Object e(Continuation continuation) {
        return this.f20609i.b() ? Boxing.c(r().c()) : BuildersKt.g(this.f20601a, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, (Continuation) null), continuation);
    }

    public final void n(File file) {
        o(file);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public final void o(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }

    public final File p(String str) {
        return new File(this.f20602b.getAbsolutePath() + str);
    }

    public final File q() {
        return (File) this.f20608h.getValue();
    }

    public final SharedCounter r() {
        return (SharedCounter) this.f20609i.getValue();
    }
}
