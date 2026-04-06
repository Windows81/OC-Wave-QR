package io.realm.internal;

import java.util.Collection;
import java.util.Iterator;

public class OsSchemaInfo implements NativeObject {

    /* renamed from: B  reason: collision with root package name */
    public static final long f40202B = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final OsSharedRealm f40203A;

    /* renamed from: z  reason: collision with root package name */
    public long f40204z;

    public OsSchemaInfo(Collection collection) {
        this.f40204z = nativeCreateFromList(a(collection));
        NativeContext.f40128c.a(this);
        this.f40203A = null;
    }

    public static long[] a(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((OsObjectSchemaInfo) it.next()).getNativePtr();
            i2++;
        }
        return jArr;
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j2, String str);

    public OsObjectSchemaInfo b(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.f40204z, str));
    }

    public long getNativeFinalizerPtr() {
        return f40202B;
    }

    public long getNativePtr() {
        return this.f40204z;
    }

    public OsSchemaInfo(long j2, OsSharedRealm osSharedRealm) {
        this.f40204z = j2;
        this.f40203A = osSharedRealm;
    }
}
