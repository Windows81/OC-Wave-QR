package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

@Metadata
public interface Job extends CoroutineContext.Element {

    /* renamed from: x  reason: collision with root package name */
    public static final Key f41415x = Key.f41416z;

    @Metadata
    public static final class DefaultImpls {
        public static /* synthetic */ void a(Job job, CancellationException cancellationException, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    cancellationException = null;
                }
                job.c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(Job job, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.a(job, obj, function2);
        }

        public static CoroutineContext.Element c(Job job, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.b(job, key);
        }

        public static CoroutineContext d(Job job, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.c(job, key);
        }

        public static CoroutineContext e(Job job, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(job, coroutineContext);
        }
    }

    @Metadata
    public static final class Key implements CoroutineContext.Key<Job> {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Key f41416z = new Key();
    }

    Sequence C();

    Object D(Continuation continuation);

    DisposableHandle E(boolean z2, boolean z3, Function1 function1);

    CancellationException F();

    DisposableHandle S(Function1 function1);

    boolean b();

    void c(CancellationException cancellationException);

    boolean isCancelled();

    ChildHandle s0(ChildJob childJob);

    boolean start();

    boolean t();
}
