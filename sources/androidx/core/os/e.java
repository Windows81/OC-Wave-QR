package androidx.core.os;

import android.os.ProfilingResult;
import java.util.function.Consumer;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f19979z;

    public /* synthetic */ e(ProducerScope producerScope) {
        this.f19979z = producerScope;
    }

    public final void accept(Object obj) {
        Profiling$registerForAllProfilingResults$1.D(this.f19979z, (ProfilingResult) obj);
    }
}
