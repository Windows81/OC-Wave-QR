package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Lifecycle f22009A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f22010B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineDispatcher f22011z;

    public final void b(Throwable th) {
        CoroutineDispatcher coroutineDispatcher = this.f22011z;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f40721z;
        if (coroutineDispatcher.w0(emptyCoroutineContext)) {
            CoroutineDispatcher coroutineDispatcher2 = this.f22011z;
            final Lifecycle lifecycle = this.f22009A;
            final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.f22010B;
            coroutineDispatcher2.o0(emptyCoroutineContext, new Runnable() {
                public final void run() {
                    lifecycle.d(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                }
            });
            return;
        }
        this.f22009A.d(this.f22010B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
