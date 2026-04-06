package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata
public final class ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 implements View.OnAttachStateChangeListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f17894z;

    public ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1(AbstractComposeView abstractComposeView) {
        this.f17894z = abstractComposeView;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f17894z.f();
    }
}
