package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Lifecycle f22014A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f22015B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f22016z;

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Object obj;
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.Companion.c(this.f22016z)) {
            this.f22014A.d(this);
            CancellableContinuation cancellableContinuation = this.f22015B;
            Function0 function0 = this.C;
            try {
                Result.Companion companion = Result.f40519A;
                obj = Result.b(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.f40519A;
                obj = Result.b(ResultKt.a(th));
            }
            cancellableContinuation.q(obj);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.f22014A.d(this);
            CancellableContinuation cancellableContinuation2 = this.f22015B;
            Result.Companion companion3 = Result.f40519A;
            cancellableContinuation2.q(Result.b(ResultKt.a(new LifecycleDestroyedException())));
        }
    }
}
