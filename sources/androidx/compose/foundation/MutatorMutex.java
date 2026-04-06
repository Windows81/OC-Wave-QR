package androidx.compose.foundation;

import androidx.compose.animation.core.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class MutatorMutex {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f3128a = new AtomicReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final Mutex f3129b = MutexKt.b(false, 1, (Object) null);

    @Metadata
    public static final class Mutator {

        /* renamed from: a  reason: collision with root package name */
        public final MutatePriority f3130a;

        /* renamed from: b  reason: collision with root package name */
        public final Job f3131b;

        public Mutator(MutatePriority mutatePriority, Job job) {
            this.f3130a = mutatePriority;
            this.f3131b = job;
        }

        public final boolean a(Mutator mutator) {
            return this.f3130a.compareTo(mutator.f3130a) >= 0;
        }

        public final void b() {
            this.f3131b.c(new MutationInterruptedException());
        }
    }

    public static /* synthetic */ Object e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.d(mutatePriority, function1, continuation);
    }

    public final Object d(MutatePriority mutatePriority, Function1 function1, Continuation continuation) {
        return CoroutineScopeKt.f(new MutatorMutex$mutate$2(mutatePriority, this, function1, (Continuation) null), continuation);
    }

    public final Object f(Object obj, MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        return CoroutineScopeKt.f(new MutatorMutex$mutateWith$2(mutatePriority, this, function2, obj, (Continuation) null), continuation);
    }

    public final boolean g() {
        return Mutex.DefaultImpls.b(this.f3129b, (Object) null, 1, (Object) null);
    }

    public final void h(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = (Mutator) this.f3128a.get();
            if (mutator2 != null && !mutator.a(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!h.a(this.f3128a, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.b();
        }
    }

    public final void i() {
        Mutex.DefaultImpls.c(this.f3129b, (Object) null, 1, (Object) null);
    }
}
