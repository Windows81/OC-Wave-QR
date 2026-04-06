package com.google.common.base;

import com.google.common.base.internal.Finalizer;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public class FinalizableReferenceQueue implements Closeable {
    public static final Logger C = Logger.getLogger(FinalizableReferenceQueue.class.getName());
    public static final Method D = c(d(new SystemLoader(), new DecoupledLoader(), new DirectLoader()));

    /* renamed from: A  reason: collision with root package name */
    public final PhantomReference f27708A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f27709B;

    /* renamed from: z  reason: collision with root package name */
    public final ReferenceQueue f27710z;

    public static class DecoupledLoader implements FinalizerLoader {
        public Class a() {
            try {
                return c(b()).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e2) {
                FinalizableReferenceQueue.C.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", e2);
                return null;
            }
        }

        public URL b() {
            String concat = String.valueOf("com.google.common.base.internal.Finalizer".replace('.', '/')).concat(".class");
            URL resource = getClass().getClassLoader().getResource(concat);
            if (resource != null) {
                String url = resource.toString();
                if (url.endsWith(concat)) {
                    return new URL(resource, url.substring(0, url.length() - concat.length()));
                }
                throw new IOException(url.length() != 0 ? "Unsupported path style: ".concat(url) : new String("Unsupported path style: "));
            }
            throw new FileNotFoundException(concat);
        }

        public URLClassLoader c(URL url) {
            return new URLClassLoader(new URL[]{url}, (ClassLoader) null);
        }
    }

    public static class DirectLoader implements FinalizerLoader {
        public Class a() {
            Class<Finalizer> cls = Finalizer.class;
            try {
                Logger logger = Finalizer.C;
                return cls;
            } catch (ClassNotFoundException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public interface FinalizerLoader {
        Class a();
    }

    public static class SystemLoader implements FinalizerLoader {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f27711a;

        public Class a() {
            if (f27711a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.C.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public static Method c(Class cls) {
        try {
            return cls.getMethod("startFinalizer", new Class[]{Class.class, ReferenceQueue.class, PhantomReference.class});
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    public static Class d(FinalizerLoader... finalizerLoaderArr) {
        for (FinalizerLoader a2 : finalizerLoaderArr) {
            Class a3 = a2.a();
            if (a3 != null) {
                return a3;
            }
        }
        throw new AssertionError();
    }

    public void b() {
        if (!this.f27709B) {
            while (true) {
                Reference poll = this.f27710z.poll();
                if (poll != null) {
                    poll.clear();
                    try {
                        ((FinalizableReference) poll).a();
                    } catch (Throwable th) {
                        C.log(Level.SEVERE, "Error cleaning up after reference.", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void close() {
        this.f27708A.enqueue();
        b();
    }
}
