package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public interface ThreadContextElement<S> extends CoroutineContext.Element {

    @Metadata
    public static final class DefaultImpls {
        public static Object a(ThreadContextElement threadContextElement, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.a(threadContextElement, obj, function2);
        }

        public static CoroutineContext b(ThreadContextElement threadContextElement, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(threadContextElement, coroutineContext);
        }
    }

    void X(CoroutineContext coroutineContext, Object obj);

    Object n0(CoroutineContext coroutineContext);
}
