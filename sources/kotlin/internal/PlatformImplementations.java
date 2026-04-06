package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;

@Metadata
public class PlatformImplementations {

    @Metadata
    public static final class ReflectThrowable {

        /* renamed from: a  reason: collision with root package name */
        public static final ReflectThrowable f40748a = new ReflectThrowable();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f40749b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f40750c;

        static {
            Method method;
            Method method2;
            Class<Throwable> cls = Throwable.class;
            Method[] methods = cls.getMethods();
            Intrinsics.f(methods);
            int length = methods.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                method = null;
                if (i3 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i3];
                if (Intrinsics.d(method2.getName(), "addSuppressed")) {
                    Class[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.h(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.d(ArraysKt.T0(parameterTypes), cls)) {
                        break;
                    }
                }
                i3++;
            }
            f40749b = method2;
            int length2 = methods.length;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method3 = methods[i2];
                if (Intrinsics.d(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i2++;
            }
            f40750c = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        Intrinsics.i(th, "cause");
        Intrinsics.i(th2, "exception");
        Method method = ReflectThrowable.f40749b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public Random b() {
        return new FallbackThreadLocalRandom();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r3 = kotlin.collections.ArraysKt.d((java.lang.Throwable[]) (r3 = r0.invoke(r3, (java.lang.Object[]) null)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List c(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            java.lang.reflect.Method r0 = kotlin.internal.PlatformImplementations.ReflectThrowable.f40750c
            if (r0 == 0) goto L_0x0018
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L_0x0018
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = kotlin.collections.ArraysKt.d(r3)
            if (r3 != 0) goto L_0x001c
        L_0x0018:
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementations.c(java.lang.Throwable):java.util.List");
    }
}
