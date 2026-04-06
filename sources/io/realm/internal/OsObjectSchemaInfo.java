package io.realm.internal;

import io.realm.RealmFieldType;

public class OsObjectSchemaInfo implements NativeObject {

    /* renamed from: A  reason: collision with root package name */
    public static final long f40163A = nativeGetFinalizerPtr();

    /* renamed from: z  reason: collision with root package name */
    public long f40164z;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final String f40165a;

        /* renamed from: b  reason: collision with root package name */
        public final String f40166b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f40167c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f40168d;

        /* renamed from: e  reason: collision with root package name */
        public int f40169e = 0;

        /* renamed from: f  reason: collision with root package name */
        public final long[] f40170f;

        /* renamed from: g  reason: collision with root package name */
        public int f40171g = 0;

        public Builder(String str, String str2, boolean z2, int i2, int i3) {
            this.f40166b = str;
            this.f40165a = str2;
            this.f40168d = z2;
            this.f40167c = new long[i2];
            this.f40170f = new long[i3];
        }

        public Builder a(String str, String str2, RealmFieldType realmFieldType, boolean z2, boolean z3, boolean z4) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.a(realmFieldType, z4), z2, z3);
            long[] jArr = this.f40167c;
            int i2 = this.f40169e;
            jArr[i2] = nativeCreatePersistedProperty;
            this.f40169e = i2 + 1;
            return this;
        }

        public OsObjectSchemaInfo b() {
            if (this.f40169e == -1 || this.f40171g == -1) {
                throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
            }
            OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.f40166b, this.f40165a, this.f40168d);
            OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.f40164z, this.f40167c, this.f40170f);
            this.f40169e = -1;
            this.f40171g = -1;
            return osObjectSchemaInfo;
        }
    }

    /* access modifiers changed from: private */
    public static native void nativeAddProperties(long j2, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetProperty(long j2, String str);

    public Property c(String str) {
        return new Property(nativeGetProperty(this.f40164z, str));
    }

    public long getNativeFinalizerPtr() {
        return f40163A;
    }

    public long getNativePtr() {
        return this.f40164z;
    }

    public OsObjectSchemaInfo(String str, String str2, boolean z2) {
        this(nativeCreateRealmObjectSchema(str, str2, z2));
    }

    public OsObjectSchemaInfo(long j2) {
        this.f40164z = j2;
        NativeContext.f40128c.a(this);
    }
}
