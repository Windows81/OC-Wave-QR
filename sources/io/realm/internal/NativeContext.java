package io.realm.internal;

import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;

public class NativeContext {

    /* renamed from: a  reason: collision with root package name */
    public static final ReferenceQueue f40126a;

    /* renamed from: b  reason: collision with root package name */
    public static final Thread f40127b;

    /* renamed from: c  reason: collision with root package name */
    public static final NativeContext f40128c = new NativeContext();

    public static class ManualReleaseNativeContext extends NativeContext {

        /* renamed from: d  reason: collision with root package name */
        public final LinkedList f40129d;

        public void a(NativeObject nativeObject) {
            this.f40129d.add(nativeObject);
        }
    }

    public interface NativeContextRunnable {
    }

    static {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        f40126a = referenceQueue;
        Thread thread = new Thread(new FinalizerRunnable(referenceQueue));
        f40127b = thread;
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void a(NativeObject nativeObject) {
        new NativeObjectReference(this, nativeObject, f40126a);
    }
}
