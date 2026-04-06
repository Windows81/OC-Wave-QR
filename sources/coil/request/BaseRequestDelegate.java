package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

@Metadata
public final class BaseRequestDelegate implements RequestDelegate {

    /* renamed from: A  reason: collision with root package name */
    public final Job f23537A;

    /* renamed from: z  reason: collision with root package name */
    public final Lifecycle f23538z;

    public BaseRequestDelegate(Lifecycle lifecycle, Job job) {
        this.f23538z = lifecycle;
        this.f23537A = job;
    }

    public void D(LifecycleOwner lifecycleOwner) {
        b();
    }

    public void a() {
        this.f23538z.d(this);
    }

    public void b() {
        Job.DefaultImpls.a(this.f23537A, (CancellationException) null, 1, (Object) null);
    }

    public void start() {
        this.f23538z.a(this);
    }
}
