package androidx.datastore.core;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class FileReadScope<T> implements ReadScope<T> {

    /* renamed from: a  reason: collision with root package name */
    public final File f20575a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializer f20576b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f20577c = new AtomicBoolean(false);

    public FileReadScope(File file, Serializer serializer) {
        Intrinsics.i(file, "file");
        Intrinsics.i(serializer, "serializer");
        this.f20575a = file;
        this.f20576b = serializer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        kotlin.io.CloseableKt.a(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007b, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:28:0x006b, B:34:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object i(androidx.datastore.core.FileReadScope r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof androidx.datastore.core.FileReadScope$readData$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.datastore.core.FileReadScope$readData$1 r0 = (androidx.datastore.core.FileReadScope$readData$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.FileReadScope$readData$1 r0 = new androidx.datastore.core.FileReadScope$readData$1
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
            goto L_0x009d
        L_0x0032:
            r8 = move-exception
            goto L_0x00a5
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            java.lang.Object r7 = r0.D
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.C
            androidx.datastore.core.FileReadScope r2 = (androidx.datastore.core.FileReadScope) r2
            kotlin.ResultKt.b(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x006b
        L_0x0049:
            r8 = move-exception
            goto L_0x0076
        L_0x004b:
            kotlin.ResultKt.b(r8)
            r7.f()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x007c }
            java.io.File r2 = r7.f20575a     // Catch:{ FileNotFoundException -> 0x007c }
            r8.<init>(r2)     // Catch:{ FileNotFoundException -> 0x007c }
            androidx.datastore.core.Serializer r2 = r7.f20576b     // Catch:{ all -> 0x0071 }
            r0.C = r7     // Catch:{ all -> 0x0071 }
            r0.D = r8     // Catch:{ all -> 0x0071 }
            r0.G = r4     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r2.c(r8, r0)     // Catch:{ all -> 0x0071 }
            if (r2 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x006b:
            kotlin.io.CloseableKt.a(r7, r5)     // Catch:{ FileNotFoundException -> 0x006f }
            goto L_0x00b1
        L_0x006f:
            r7 = r2
            goto L_0x007c
        L_0x0071:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0076:
            throw r8     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r4 = move-exception
            kotlin.io.CloseableKt.a(r7, r8)     // Catch:{ FileNotFoundException -> 0x006f }
            throw r4     // Catch:{ FileNotFoundException -> 0x006f }
        L_0x007c:
            java.io.File r8 = r7.f20575a
            boolean r8 = r8.exists()
            if (r8 == 0) goto L_0x00ab
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.f20575a
            r8.<init>(r2)
            androidx.datastore.core.Serializer r7 = r7.f20576b     // Catch:{ all -> 0x00a1 }
            r0.C = r8     // Catch:{ all -> 0x00a1 }
            r0.D = r5     // Catch:{ all -> 0x00a1 }
            r0.G = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Object r7 = r7.c(r8, r0)     // Catch:{ all -> 0x00a1 }
            if (r7 != r1) goto L_0x009a
            return r1
        L_0x009a:
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x009d:
            kotlin.io.CloseableKt.a(r7, r5)
            return r8
        L_0x00a1:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00a5:
            throw r8     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r7, r8)
            throw r0
        L_0x00ab:
            androidx.datastore.core.Serializer r7 = r7.f20576b
            java.lang.Object r8 = r7.a()
        L_0x00b1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileReadScope.i(androidx.datastore.core.FileReadScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void close() {
        this.f20577c.set(true);
    }

    public Object d(Continuation continuation) {
        return i(this, continuation);
    }

    public final void f() {
        if (this.f20577c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final File g() {
        return this.f20575a;
    }

    public final Serializer h() {
        return this.f20576b;
    }
}
