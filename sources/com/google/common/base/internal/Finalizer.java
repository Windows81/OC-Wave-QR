package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer implements Runnable {
    public static final Logger C = Logger.getLogger(Finalizer.class.getName());
    public static final Constructor D;
    public static final Field E;

    /* renamed from: A  reason: collision with root package name */
    public final PhantomReference f27805A;

    /* renamed from: B  reason: collision with root package name */
    public final ReferenceQueue f27806B;

    /* renamed from: z  reason: collision with root package name */
    public final WeakReference f27807z;

    static {
        Constructor b2 = b();
        D = b2;
        E = b2 == null ? d() : null;
    }

    public static Constructor b() {
        try {
            return Thread.class.getConstructor(new Class[]{ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field d() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            C.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    public final boolean a(Reference reference) {
        Method c2 = c();
        if (c2 == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.f27805A) {
                return false;
            }
            try {
                c2.invoke(reference, (Object[]) null);
            } catch (Throwable th) {
                C.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.f27806B.poll();
        } while (reference != null);
        return true;
    }

    public final Method c() {
        Class cls = (Class) this.f27807z.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", (Class[]) null);
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:0|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:2:0x000a, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.ref.ReferenceQueue r0 = r1.f27806B     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
            boolean r0 = r1.a(r0)     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.internal.Finalizer.run():void");
    }
}
