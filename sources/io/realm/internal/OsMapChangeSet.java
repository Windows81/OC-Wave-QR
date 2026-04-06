package io.realm.internal;

public class OsMapChangeSet implements NativeObject {

    /* renamed from: A  reason: collision with root package name */
    public static long f40158A = nativeGetFinalizerPtr();

    /* renamed from: z  reason: collision with root package name */
    public final long f40159z;

    public OsMapChangeSet(long j2) {
        this.f40159z = j2;
    }

    private static native long nativeGetFinalizerPtr();

    public boolean a() {
        return this.f40159z == 0;
    }

    public long getNativeFinalizerPtr() {
        return f40158A;
    }

    public long getNativePtr() {
        return this.f40159z;
    }
}
