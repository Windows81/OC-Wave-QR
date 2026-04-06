package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.CancellationTokenSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TasksKt$awaitImpl$2$2 implements Function1<Throwable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f41992z;

    public TasksKt$awaitImpl$2$2(CancellationTokenSource cancellationTokenSource) {
        this.f41992z = cancellationTokenSource;
    }

    public final void b(Throwable th) {
        this.f41992z.a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
