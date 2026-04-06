package androidx.compose.ui.platform;

import android.view.View;
import androidx.customview.poolingcontainer.PoolingContainer;
import kotlin.Metadata;

@Metadata
public final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 implements View.OnAttachStateChangeListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f17899z;

    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1(AbstractComposeView abstractComposeView) {
        this.f17899z = abstractComposeView;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        if (!PoolingContainer.d(this.f17899z)) {
            this.f17899z.f();
        }
    }
}
