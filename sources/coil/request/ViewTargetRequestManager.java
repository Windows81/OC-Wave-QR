package coil.request;

import android.view.View;
import coil.util.Utils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public ViewTargetDisposable f23688A;

    /* renamed from: B  reason: collision with root package name */
    public Job f23689B;
    public ViewTargetRequestDelegate C;
    public boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final View f23690z;

    public ViewTargetRequestManager(View view) {
        this.f23690z = view;
    }

    public final synchronized void a() {
        try {
            Job job = this.f23689B;
            if (job != null) {
                Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            }
            this.f23689B = BuildersKt__Builders_commonKt.d(GlobalScope.f41412z, Dispatchers.c().H0(), (CoroutineStart) null, new ViewTargetRequestManager$dispose$1(this, (Continuation) null), 2, (Object) null);
            this.f23688A = null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized ViewTargetDisposable b(Deferred deferred) {
        ViewTargetDisposable viewTargetDisposable = this.f23688A;
        if (viewTargetDisposable == null || !Utils.s() || !this.D) {
            Job job = this.f23689B;
            if (job != null) {
                Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            }
            this.f23689B = null;
            ViewTargetDisposable viewTargetDisposable2 = new ViewTargetDisposable(this.f23690z, deferred);
            this.f23688A = viewTargetDisposable2;
            return viewTargetDisposable2;
        }
        this.D = false;
        viewTargetDisposable.a(deferred);
        return viewTargetDisposable;
    }

    public final void c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.C;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.b();
        }
        this.C = viewTargetRequestDelegate;
    }

    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.C;
        if (viewTargetRequestDelegate != null) {
            this.D = true;
            viewTargetRequestDelegate.d();
        }
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.C;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.b();
        }
    }
}
