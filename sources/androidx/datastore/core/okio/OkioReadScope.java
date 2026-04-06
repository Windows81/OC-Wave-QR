package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;

@Metadata
public class OkioReadScope<T> implements ReadScope<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FileSystem f20651a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f20652b;

    /* renamed from: c  reason: collision with root package name */
    public final OkioSerializer f20653c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f20654d = new AtomicBoolean(false);

    public OkioReadScope(FileSystem fileSystem, Path path, OkioSerializer okioSerializer) {
        Intrinsics.i(fileSystem, "fileSystem");
        Intrinsics.i(path, "path");
        Intrinsics.i(okioSerializer, "serializer");
        this.f20651a = fileSystem;
        this.f20652b = path;
        this.f20653c = okioSerializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC, Splitter:B:29:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090 A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094 A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf A[SYNTHETIC, Splitter:B:57:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object j(androidx.datastore.core.okio.OkioReadScope r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.datastore.core.okio.OkioReadScope$readData$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.datastore.core.okio.OkioReadScope$readData$1 r0 = (androidx.datastore.core.okio.OkioReadScope$readData$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.okio.OkioReadScope$readData$1 r0 = new androidx.datastore.core.okio.OkioReadScope$readData$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r7 = r0.C
            java.io.Closeable r7 = (java.io.Closeable) r7
            kotlin.ResultKt.b(r8)     // Catch:{ all -> 0x0032 }
            goto L_0x00bd
        L_0x0032:
            r8 = move-exception
            goto L_0x00c9
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            java.lang.Object r7 = r0.D
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.C
            androidx.datastore.core.okio.OkioReadScope r2 = (androidx.datastore.core.okio.OkioReadScope) r2
            kotlin.ResultKt.b(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0070
        L_0x0049:
            r8 = move-exception
            goto L_0x007f
        L_0x004b:
            kotlin.ResultKt.b(r8)
            r7.f()
            okio.FileSystem r8 = r7.f20651a     // Catch:{ FileNotFoundException -> 0x0095 }
            okio.Path r2 = r7.f20652b     // Catch:{ FileNotFoundException -> 0x0095 }
            okio.Source r8 = r8.t(r2)     // Catch:{ FileNotFoundException -> 0x0095 }
            okio.BufferedSource r8 = okio.Okio.d(r8)     // Catch:{ FileNotFoundException -> 0x0095 }
            androidx.datastore.core.okio.OkioSerializer r2 = r7.f20653c     // Catch:{ all -> 0x007a }
            r0.C = r7     // Catch:{ all -> 0x007a }
            r0.D = r8     // Catch:{ all -> 0x007a }
            r0.G = r4     // Catch:{ all -> 0x007a }
            java.lang.Object r2 = r2.b(r8, r0)     // Catch:{ all -> 0x007a }
            if (r2 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0070:
            if (r7 == 0) goto L_0x0078
            r7.close()     // Catch:{ all -> 0x0076 }
            goto L_0x0078
        L_0x0076:
            r7 = move-exception
            goto L_0x008e
        L_0x0078:
            r7 = r5
            goto L_0x008e
        L_0x007a:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x007f:
            if (r7 == 0) goto L_0x008c
            r7.close()     // Catch:{ all -> 0x0085 }
            goto L_0x008c
        L_0x0085:
            r7 = move-exception
            kotlin.ExceptionsKt.a(r8, r7)     // Catch:{ FileNotFoundException -> 0x008a }
            goto L_0x008c
        L_0x008a:
            r7 = r2
            goto L_0x0095
        L_0x008c:
            r7 = r8
            r8 = r5
        L_0x008e:
            if (r7 != 0) goto L_0x0094
            kotlin.jvm.internal.Intrinsics.f(r8)     // Catch:{ FileNotFoundException -> 0x008a }
            goto L_0x00e4
        L_0x0094:
            throw r7     // Catch:{ FileNotFoundException -> 0x008a }
        L_0x0095:
            okio.FileSystem r8 = r7.f20651a
            okio.Path r2 = r7.f20652b
            boolean r8 = r8.j(r2)
            if (r8 == 0) goto L_0x00dd
            okio.FileSystem r8 = r7.f20651a
            okio.Path r2 = r7.f20652b
            okio.Source r8 = r8.t(r2)
            okio.BufferedSource r8 = okio.Okio.d(r8)
            androidx.datastore.core.okio.OkioSerializer r7 = r7.f20653c     // Catch:{ all -> 0x00c5 }
            r0.C = r8     // Catch:{ all -> 0x00c5 }
            r0.D = r5     // Catch:{ all -> 0x00c5 }
            r0.G = r3     // Catch:{ all -> 0x00c5 }
            java.lang.Object r7 = r7.b(r8, r0)     // Catch:{ all -> 0x00c5 }
            if (r7 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00bd:
            if (r7 == 0) goto L_0x00d6
            r7.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00d6
        L_0x00c3:
            r5 = move-exception
            goto L_0x00d6
        L_0x00c5:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00c9:
            if (r7 == 0) goto L_0x00d3
            r7.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r7 = move-exception
            kotlin.ExceptionsKt.a(r8, r7)
        L_0x00d3:
            r6 = r5
            r5 = r8
            r8 = r6
        L_0x00d6:
            if (r5 != 0) goto L_0x00dc
            kotlin.jvm.internal.Intrinsics.f(r8)
            goto L_0x00e4
        L_0x00dc:
            throw r5
        L_0x00dd:
            androidx.datastore.core.okio.OkioSerializer r7 = r7.f20653c
            java.lang.Object r7 = r7.a()
            r8 = r7
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope.j(androidx.datastore.core.okio.OkioReadScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void close() {
        this.f20654d.b(true);
    }

    public Object d(Continuation continuation) {
        return j(this, continuation);
    }

    public final void f() {
        if (this.f20654d.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final FileSystem g() {
        return this.f20651a;
    }

    public final Path h() {
        return this.f20652b;
    }

    public final OkioSerializer i() {
        return this.f20653c;
    }
}
