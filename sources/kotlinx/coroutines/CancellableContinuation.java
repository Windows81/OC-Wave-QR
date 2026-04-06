package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public interface CancellableContinuation<T> extends Continuation<T> {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ boolean a(CancellableContinuation cancellableContinuation, Throwable th, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    th = null;
                }
                return cancellableContinuation.W(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    Object J(Throwable th);

    void M(CoroutineDispatcher coroutineDispatcher, Throwable th);

    void P(CoroutineDispatcher coroutineDispatcher, Object obj);

    void U(Object obj, Function1 function1);

    boolean W(Throwable th);

    Object Z(Object obj, Object obj2, Function3 function3);

    void a0(Object obj);

    boolean b();

    boolean t();

    void u(Function1 function1);

    void w(Object obj, Function3 function3);
}
