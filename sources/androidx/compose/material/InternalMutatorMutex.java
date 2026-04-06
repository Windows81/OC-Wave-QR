package androidx.compose.material;

import androidx.compose.animation.core.h;
import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class InternalMutatorMutex {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f7909a = new AtomicReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final Mutex f7910b = MutexKt.b(false, 1, (Object) null);

    @Metadata
    public static final class Mutator {

        /* renamed from: a  reason: collision with root package name */
        public final MutatePriority f7911a;

        /* renamed from: b  reason: collision with root package name */
        public final Job f7912b;

        public Mutator(MutatePriority mutatePriority, Job job) {
            this.f7911a = mutatePriority;
            this.f7912b = job;
        }

        public final boolean a(Mutator mutator) {
            return this.f7911a.compareTo(mutator.f7911a) >= 0;
        }

        public final void b() {
            Job.DefaultImpls.a(this.f7912b, (CancellationException) null, 1, (Object) null);
        }
    }

    public final Object d(MutatePriority mutatePriority, Function1 function1, Continuation continuation) {
        return CoroutineScopeKt.f(new InternalMutatorMutex$mutate$2(mutatePriority, this, function1, (Continuation) null), continuation);
    }

    public final boolean e(Function0 function0) {
        boolean b2 = Mutex.DefaultImpls.b(this.f7910b, (Object) null, 1, (Object) null);
        if (b2) {
            try {
                function0.invoke();
            } finally {
                Mutex.DefaultImpls.c(this.f7910b, (Object) null, 1, (Object) null);
            }
        }
        return b2;
    }

    public final void f(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = (Mutator) this.f7909a.get();
            if (mutator2 != null && !mutator.a(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!h.a(this.f7909a, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.b();
        }
    }
}
