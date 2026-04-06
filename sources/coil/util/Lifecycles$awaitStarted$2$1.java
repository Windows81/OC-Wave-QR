package coil.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
/* renamed from: coil.util.-Lifecycles$awaitStarted$2$1  reason: invalid class name */
public final class Lifecycles$awaitStarted$2$1 implements DefaultLifecycleObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f23733z;

    public Lifecycles$awaitStarted$2$1(CancellableContinuation cancellableContinuation) {
        this.f23733z = cancellableContinuation;
    }

    public void N(LifecycleOwner lifecycleOwner) {
        CancellableContinuation cancellableContinuation = this.f23733z;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(Unit.f40552a));
    }
}
