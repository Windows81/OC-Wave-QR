package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okio.FileSystem;
import okio.Path;

@Metadata
public final class OkioStorageConnection<T> implements StorageConnection<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FileSystem f20666a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f20667b;

    /* renamed from: c  reason: collision with root package name */
    public final OkioSerializer f20668c;

    /* renamed from: d  reason: collision with root package name */
    public final InterProcessCoordinator f20669d;

    /* renamed from: e  reason: collision with root package name */
    public final Function0 f20670e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f20671f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public final Mutex f20672g = MutexKt.b(false, 1, (Object) null);

    public OkioStorageConnection(FileSystem fileSystem, Path path, OkioSerializer okioSerializer, InterProcessCoordinator interProcessCoordinator, Function0 function0) {
        Intrinsics.i(fileSystem, "fileSystem");
        Intrinsics.i(path, "path");
        Intrinsics.i(okioSerializer, "serializer");
        Intrinsics.i(interProcessCoordinator, "coordinator");
        Intrinsics.i(function0, "onClose");
        this.f20666a = fileSystem;
        this.f20667b = path;
        this.f20668c = okioSerializer;
        this.f20669d = interProcessCoordinator;
        this.f20670e = function0;
    }

    private final void f() {
        if (this.f20671f.a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x010f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[SYNTHETIC, Splitter:B:39:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef A[SYNTHETIC, Splitter:B:51:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.okio.OkioStorageConnection$writeScope$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection$writeScope$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$writeScope$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r10 = r0.F
            androidx.datastore.core.Closeable r10 = (androidx.datastore.core.Closeable) r10
            java.lang.Object r1 = r0.E
            okio.Path r1 = (okio.Path) r1
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r0 = r0.C
            androidx.datastore.core.okio.OkioStorageConnection r0 = (androidx.datastore.core.okio.OkioStorageConnection) r0
            kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x003f }
            goto L_0x00c5
        L_0x003f:
            r11 = move-exception
            goto L_0x00f6
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            java.lang.Object r10 = r0.F
            kotlinx.coroutines.sync.Mutex r10 = (kotlinx.coroutines.sync.Mutex) r10
            java.lang.Object r2 = r0.E
            okio.Path r2 = (okio.Path) r2
            java.lang.Object r5 = r0.D
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r7 = r0.C
            androidx.datastore.core.okio.OkioStorageConnection r7 = (androidx.datastore.core.okio.OkioStorageConnection) r7
            kotlin.ResultKt.b(r11)
            r11 = r10
            r10 = r5
            goto L_0x0087
        L_0x0060:
            kotlin.ResultKt.b(r11)
            r9.f()
            okio.Path r11 = r9.f20667b
            okio.Path r2 = r11.o()
            if (r2 == 0) goto L_0x0114
            okio.FileSystem r11 = r9.f20666a
            r11.e(r2, r3)
            kotlinx.coroutines.sync.Mutex r11 = r9.f20672g
            r0.C = r9
            r0.D = r10
            r0.E = r2
            r0.F = r11
            r0.I = r5
            java.lang.Object r5 = r11.d(r6, r0)
            if (r5 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r7 = r9
        L_0x0087:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r5.<init>()     // Catch:{ all -> 0x00ff }
            okio.Path r8 = r7.f20667b     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = r8.l()     // Catch:{ all -> 0x00ff }
            r5.append(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = ".tmp"
            r5.append(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ff }
            okio.Path r2 = r2.r(r5)     // Catch:{ all -> 0x00ff }
            okio.FileSystem r5 = r7.f20666a     // Catch:{ IOException -> 0x0101 }
            r5.i(r2, r3)     // Catch:{ IOException -> 0x0101 }
            androidx.datastore.core.okio.OkioWriteScope r3 = new androidx.datastore.core.okio.OkioWriteScope     // Catch:{ IOException -> 0x0101 }
            okio.FileSystem r5 = r7.f20666a     // Catch:{ IOException -> 0x0101 }
            androidx.datastore.core.okio.OkioSerializer r8 = r7.f20668c     // Catch:{ IOException -> 0x0101 }
            r3.<init>(r5, r2, r8)     // Catch:{ IOException -> 0x0101 }
            r0.C = r7     // Catch:{ all -> 0x00f0 }
            r0.D = r11     // Catch:{ all -> 0x00f0 }
            r0.E = r2     // Catch:{ all -> 0x00f0 }
            r0.F = r3     // Catch:{ all -> 0x00f0 }
            r0.I = r4     // Catch:{ all -> 0x00f0 }
            java.lang.Object r10 = r10.m(r3, r0)     // Catch:{ all -> 0x00f0 }
            if (r10 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            r1 = r2
            r10 = r3
            r0 = r7
            r2 = r11
        L_0x00c5:
            kotlin.Unit r11 = kotlin.Unit.f40552a     // Catch:{ all -> 0x003f }
            r10.close()     // Catch:{ all -> 0x00cc }
            r10 = r6
            goto L_0x00cd
        L_0x00cc:
            r10 = move-exception
        L_0x00cd:
            if (r10 != 0) goto L_0x00ef
            okio.FileSystem r10 = r0.f20666a     // Catch:{ IOException -> 0x00e2 }
            boolean r10 = r10.j(r1)     // Catch:{ IOException -> 0x00e2 }
            if (r10 == 0) goto L_0x00e7
            okio.FileSystem r10 = r0.f20666a     // Catch:{ IOException -> 0x00e2 }
            okio.Path r11 = r0.f20667b     // Catch:{ IOException -> 0x00e2 }
            r10.c(r1, r11)     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00e7
        L_0x00df:
            r10 = move-exception
            r11 = r2
            goto L_0x0110
        L_0x00e2:
            r10 = move-exception
            r7 = r0
            r11 = r2
            r2 = r1
            goto L_0x0102
        L_0x00e7:
            kotlin.Unit r10 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00df }
            r2.e(r6)
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x00ef:
            throw r10     // Catch:{ IOException -> 0x00e2 }
        L_0x00f0:
            r10 = move-exception
            r1 = r2
            r0 = r7
            r2 = r11
            r11 = r10
            r10 = r3
        L_0x00f6:
            r10.close()     // Catch:{ all -> 0x00fa }
            goto L_0x00fe
        L_0x00fa:
            r10 = move-exception
            kotlin.ExceptionsKt.a(r11, r10)     // Catch:{ IOException -> 0x00e2 }
        L_0x00fe:
            throw r11     // Catch:{ IOException -> 0x00e2 }
        L_0x00ff:
            r10 = move-exception
            goto L_0x0110
        L_0x0101:
            r10 = move-exception
        L_0x0102:
            okio.FileSystem r0 = r7.f20666a     // Catch:{ all -> 0x00ff }
            boolean r0 = r0.j(r2)     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x010f
            okio.FileSystem r0 = r7.f20666a     // Catch:{ IOException -> 0x010f }
            r0.h(r2)     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            throw r10     // Catch:{ all -> 0x00ff }
        L_0x0110:
            r11.e(r6)
            throw r10
        L_0x0114:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "must have a parent path"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.b(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public InterProcessCoordinator c() {
        return this.f20669d;
    }

    public void close() {
        this.f20671f.b(true);
        this.f20670e.invoke();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        kotlin.ExceptionsKt.a(r11, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x007d, B:36:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[SYNTHETIC, Splitter:B:31:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(kotlin.jvm.functions.Function3 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection$readScope$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            boolean r10 = r0.E
            java.lang.Object r1 = r0.D
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.C
            androidx.datastore.core.okio.OkioStorageConnection r0 = (androidx.datastore.core.okio.OkioStorageConnection) r0
            kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x006d
        L_0x0034:
            r11 = move-exception
            goto L_0x0086
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003e:
            kotlin.ResultKt.b(r11)
            r9.f()
            kotlinx.coroutines.sync.Mutex r11 = r9.f20672g
            boolean r11 = kotlinx.coroutines.sync.Mutex.DefaultImpls.b(r11, r4, r3, r4)
            androidx.datastore.core.okio.OkioReadScope r2 = new androidx.datastore.core.okio.OkioReadScope     // Catch:{ all -> 0x008f }
            okio.FileSystem r5 = r9.f20666a     // Catch:{ all -> 0x008f }
            okio.Path r6 = r9.f20667b     // Catch:{ all -> 0x008f }
            androidx.datastore.core.okio.OkioSerializer r7 = r9.f20668c     // Catch:{ all -> 0x008f }
            r2.<init>(r5, r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r11)     // Catch:{ all -> 0x0080 }
            r0.C = r9     // Catch:{ all -> 0x0080 }
            r0.D = r2     // Catch:{ all -> 0x0080 }
            r0.E = r11     // Catch:{ all -> 0x0080 }
            r0.H = r3     // Catch:{ all -> 0x0080 }
            java.lang.Object r10 = r10.d(r2, r5, r0)     // Catch:{ all -> 0x0080 }
            if (r10 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x006d:
            r1.close()     // Catch:{ all -> 0x0072 }
            r1 = r4
            goto L_0x0073
        L_0x0072:
            r1 = move-exception
        L_0x0073:
            if (r1 != 0) goto L_0x007d
            if (r10 == 0) goto L_0x007c
            kotlinx.coroutines.sync.Mutex r10 = r0.f20672g
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r10, r4, r3, r4)
        L_0x007c:
            return r11
        L_0x007d:
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r11 = move-exception
            goto L_0x0094
        L_0x0080:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0086:
            r1.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r11, r1)     // Catch:{ all -> 0x007e }
        L_0x008e:
            throw r11     // Catch:{ all -> 0x007e }
        L_0x008f:
            r10 = move-exception
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0094:
            if (r10 == 0) goto L_0x009b
            kotlinx.coroutines.sync.Mutex r10 = r0.f20672g
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r10, r4, r3, r4)
        L_0x009b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.e(kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
