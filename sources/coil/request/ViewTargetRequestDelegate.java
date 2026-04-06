package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.ImageLoader;
import coil.target.ViewTarget;
import coil.util.Lifecycles;
import coil.util.Utils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

@Metadata
public final class ViewTargetRequestDelegate implements RequestDelegate {

    /* renamed from: A  reason: collision with root package name */
    public final ImageRequest f23685A;

    /* renamed from: B  reason: collision with root package name */
    public final ViewTarget f23686B;
    public final Lifecycle C;
    public final Job D;

    /* renamed from: z  reason: collision with root package name */
    public final ImageLoader f23687z;

    public ViewTargetRequestDelegate(ImageLoader imageLoader, ImageRequest imageRequest, ViewTarget viewTarget, Lifecycle lifecycle, Job job) {
        this.f23687z = imageLoader;
        this.f23685A = imageRequest;
        this.f23686B = viewTarget;
        this.C = lifecycle;
        this.D = job;
    }

    public void D(LifecycleOwner lifecycleOwner) {
        Utils.m(this.f23686B.r()).a();
    }

    public void b() {
        Job.DefaultImpls.a(this.D, (CancellationException) null, 1, (Object) null);
        ViewTarget viewTarget = this.f23686B;
        if (viewTarget instanceof LifecycleObserver) {
            this.C.d((LifecycleObserver) viewTarget);
        }
        this.C.d(this);
    }

    public final void d() {
        this.f23687z.b(this.f23685A);
    }

    public void l() {
        if (!this.f23686B.r().isAttachedToWindow()) {
            Utils.m(this.f23686B.r()).c(this);
            throw new CancellationException("'ViewTarget.view' must be attached to a window.");
        }
    }

    public void start() {
        this.C.a(this);
        ViewTarget viewTarget = this.f23686B;
        if (viewTarget instanceof LifecycleObserver) {
            Lifecycles.b(this.C, (LifecycleObserver) viewTarget);
        }
        Utils.m(this.f23686B.r()).c(this);
    }
}
