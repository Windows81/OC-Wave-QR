package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public interface Applier<N> {

    @Metadata
    public static final class DefaultImpls {
    }

    void a(int i2, int i3);

    Object b();

    void c(int i2, Object obj);

    void clear();

    void d(Object obj);

    void e() {
        Object b2 = b();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = b2 instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) b2 : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.p();
        }
    }

    void f() {
    }

    void g(int i2, int i3, int i4);

    void h();

    void i(Function2 function2, Object obj) {
        function2.m(b(), obj);
    }

    void j(int i2, Object obj);

    void k() {
    }
}
