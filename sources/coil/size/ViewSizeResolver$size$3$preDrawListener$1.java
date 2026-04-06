package coil.size;

import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class ViewSizeResolver$size$3$preDrawListener$1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ViewSizeResolver f23710A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f23711B;
    public final /* synthetic */ CancellableContinuation C;

    /* renamed from: z  reason: collision with root package name */
    public boolean f23712z;

    public ViewSizeResolver$size$3$preDrawListener$1(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, CancellableContinuation cancellableContinuation) {
        this.f23710A = viewSizeResolver;
        this.f23711B = viewTreeObserver;
        this.C = cancellableContinuation;
    }

    public boolean onPreDraw() {
        Size k2 = this.f23710A.e();
        if (k2 != null) {
            this.f23710A.g(this.f23711B, this);
            if (!this.f23712z) {
                this.f23712z = true;
                this.C.q(Result.b(k2));
            }
        }
        return true;
    }
}
