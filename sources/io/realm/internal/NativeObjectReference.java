package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class NativeObjectReference extends PhantomReference<NativeObject> {

    /* renamed from: f  reason: collision with root package name */
    public static ReferencePool f40130f = new ReferencePool();

    /* renamed from: a  reason: collision with root package name */
    public final long f40131a;

    /* renamed from: b  reason: collision with root package name */
    public final long f40132b;

    /* renamed from: c  reason: collision with root package name */
    public final NativeContext f40133c;

    /* renamed from: d  reason: collision with root package name */
    public NativeObjectReference f40134d;

    /* renamed from: e  reason: collision with root package name */
    public NativeObjectReference f40135e;

    public static class ReferencePool {

        /* renamed from: a  reason: collision with root package name */
        public NativeObjectReference f40136a;

        public ReferencePool() {
        }

        public synchronized void a(NativeObjectReference nativeObjectReference) {
            try {
                NativeObjectReference unused = nativeObjectReference.f40134d = null;
                NativeObjectReference unused2 = nativeObjectReference.f40135e = this.f40136a;
                NativeObjectReference nativeObjectReference2 = this.f40136a;
                if (nativeObjectReference2 != null) {
                    NativeObjectReference unused3 = nativeObjectReference2.f40134d = nativeObjectReference;
                }
                this.f40136a = nativeObjectReference;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }

        public synchronized void b(NativeObjectReference nativeObjectReference) {
            try {
                NativeObjectReference c2 = nativeObjectReference.f40135e;
                NativeObjectReference a2 = nativeObjectReference.f40134d;
                NativeObjectReference unused = nativeObjectReference.f40135e = null;
                NativeObjectReference unused2 = nativeObjectReference.f40134d = null;
                if (a2 != null) {
                    NativeObjectReference unused3 = a2.f40135e = c2;
                } else {
                    this.f40136a = c2;
                }
                if (c2 != null) {
                    NativeObjectReference unused4 = c2.f40134d = a2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public NativeObjectReference(NativeContext nativeContext, NativeObject nativeObject, ReferenceQueue referenceQueue) {
        super(nativeObject, referenceQueue);
        this.f40131a = nativeObject.getNativePtr();
        this.f40132b = nativeObject.getNativeFinalizerPtr();
        this.f40133c = nativeContext;
        f40130f.a(this);
    }

    public static native void nativeCleanUp(long j2, long j3);

    public void e() {
        synchronized (this.f40133c) {
            nativeCleanUp(this.f40132b, this.f40131a);
        }
        f40130f.b(this);
    }
}
