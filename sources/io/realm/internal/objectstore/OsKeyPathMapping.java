package io.realm.internal.objectstore;

import io.realm.internal.NativeContext;
import io.realm.internal.NativeObject;

public class OsKeyPathMapping implements NativeObject {

    /* renamed from: A  reason: collision with root package name */
    public static final long f40348A = nativeGetFinalizerMethodPtr();

    /* renamed from: z  reason: collision with root package name */
    public long f40349z = -1;

    public OsKeyPathMapping(long j2) {
        this.f40349z = nativeCreateMapping(j2);
        NativeContext.f40128c.a(this);
    }

    private static native long nativeCreateMapping(long j2);

    private static native long nativeGetFinalizerMethodPtr();

    public long getNativeFinalizerPtr() {
        return f40348A;
    }

    public long getNativePtr() {
        return this.f40349z;
    }
}
