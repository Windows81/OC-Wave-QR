package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SharedCounter {

    /* renamed from: b  reason: collision with root package name */
    public static final Factory f20626b = new Factory((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final NativeSharedCounter f20627c = new NativeSharedCounter();

    /* renamed from: a  reason: collision with root package name */
    public final long f20628a;

    @Metadata
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.datastore.core.SharedCounter a(kotlin.jvm.functions.Function0 r2) {
            /*
                r1 = this;
                java.lang.String r0 = "produceFile"
                kotlin.jvm.internal.Intrinsics.i(r2, r0)
                java.lang.Object r2 = r2.invoke()
                java.io.File r2 = (java.io.File) r2
                r0 = 939524096(0x38000000, float:3.0517578E-5)
                android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r0)     // Catch:{ all -> 0x001d }
                androidx.datastore.core.SharedCounter r0 = r1.b(r2)     // Catch:{ all -> 0x001b }
                if (r2 == 0) goto L_0x001a
                r2.close()
            L_0x001a:
                return r0
            L_0x001b:
                r0 = move-exception
                goto L_0x001f
            L_0x001d:
                r0 = move-exception
                r2 = 0
            L_0x001f:
                if (r2 == 0) goto L_0x0024
                r2.close()
            L_0x0024:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SharedCounter.Factory.a(kotlin.jvm.functions.Function0):androidx.datastore.core.SharedCounter");
        }

        public final SharedCounter b(ParcelFileDescriptor parcelFileDescriptor) {
            int fd = parcelFileDescriptor.getFd();
            if (c().nativeTruncateFile(fd) == 0) {
                long nativeCreateSharedCounter = c().nativeCreateSharedCounter(fd);
                if (nativeCreateSharedCounter >= 0) {
                    return new SharedCounter(nativeCreateSharedCounter, (DefaultConstructorMarker) null);
                }
                throw new IOException("Failed to mmap counter file");
            }
            throw new IOException("Failed to truncate counter file");
        }

        public final NativeSharedCounter c() {
            return SharedCounter.f20627c;
        }

        public final void d() {
            System.loadLibrary("datastore_shared_counter");
        }

        public Factory() {
        }
    }

    public /* synthetic */ SharedCounter(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public final int b() {
        return f20627c.nativeGetCounterValue(this.f20628a);
    }

    public final int c() {
        return f20627c.nativeIncrementAndGetCounterValue(this.f20628a);
    }

    public SharedCounter(long j2) {
        this.f20628a = j2;
    }
}
