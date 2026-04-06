package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public interface ViewSizeResolver<T extends View> extends SizeResolver {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object i(ViewSizeResolver viewSizeResolver, Continuation continuation) {
        Size e2 = viewSizeResolver.e();
        if (e2 != null) {
            return e2;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        ViewTreeObserver viewTreeObserver = viewSizeResolver.r().getViewTreeObserver();
        ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1 = new ViewSizeResolver$size$3$preDrawListener$1(viewSizeResolver, viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
        cancellableContinuationImpl.u(new ViewSizeResolver$size$3$1(viewSizeResolver, viewTreeObserver, viewSizeResolver$size$3$preDrawListener$1));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    Dimension a() {
        ViewGroup.LayoutParams layoutParams = r().getLayoutParams();
        return d(layoutParams != null ? layoutParams.height : -1, r().getHeight(), h() ? r().getPaddingTop() + r().getPaddingBottom() : 0);
    }

    Dimension b() {
        ViewGroup.LayoutParams layoutParams = r().getLayoutParams();
        return d(layoutParams != null ? layoutParams.width : -1, r().getWidth(), h() ? r().getPaddingLeft() + r().getPaddingRight() : 0);
    }

    Object c(Continuation continuation) {
        return i(this, continuation);
    }

    Dimension d(int i2, int i3, int i4) {
        if (i2 == -2) {
            return Dimension.Undefined.f23692a;
        }
        int i5 = i2 - i4;
        if (i5 > 0) {
            return Dimensions.a(i5);
        }
        int i6 = i3 - i4;
        if (i6 > 0) {
            return Dimensions.a(i6);
        }
        return null;
    }

    Size e() {
        Dimension a2;
        Dimension b2 = b();
        if (b2 == null || (a2 = a()) == null) {
            return null;
        }
        return new Size(b2, a2);
    }

    void g(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            r().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    boolean h() {
        return true;
    }

    View r();
}
