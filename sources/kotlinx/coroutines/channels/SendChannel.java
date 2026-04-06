package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.selects.SelectClause2;

@Metadata
public interface SendChannel<E> {

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ boolean a(SendChannel sendChannel, Throwable th, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    th = null;
                }
                return sendChannel.z(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    void K(Function1 function1);

    Object L(Object obj);

    Object O(Object obj, Continuation continuation);

    boolean R();

    SelectClause2 s();

    boolean z(Throwable th);
}
