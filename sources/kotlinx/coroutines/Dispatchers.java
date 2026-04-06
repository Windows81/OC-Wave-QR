package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata
public final class Dispatchers {

    /* renamed from: a  reason: collision with root package name */
    public static final Dispatchers f41397a = new Dispatchers();

    /* renamed from: b  reason: collision with root package name */
    public static final CoroutineDispatcher f41398b = DefaultScheduler.H;

    /* renamed from: c  reason: collision with root package name */
    public static final CoroutineDispatcher f41399c = Unconfined.f41440B;

    public static final CoroutineDispatcher a() {
        return f41398b;
    }

    public static final CoroutineDispatcher b() {
        return DefaultIoScheduler.C;
    }

    public static final MainCoroutineDispatcher c() {
        return MainDispatcherLoader.f41857b;
    }
}
