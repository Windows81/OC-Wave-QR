package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
public final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 implements View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f17905A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f17906z;

    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1(AbstractComposeView abstractComposeView, Ref.ObjectRef objectRef) {
        this.f17906z = abstractComposeView;
        this.f17905A = objectRef;
    }

    public void onViewAttachedToWindow(View view) {
        LifecycleOwner a2 = ViewTreeLifecycleOwner.a(this.f17906z);
        AbstractComposeView abstractComposeView = this.f17906z;
        if (a2 != null) {
            this.f17905A.f40908z = ViewCompositionStrategy_androidKt.c(abstractComposeView, a2.a());
            this.f17906z.removeOnAttachStateChangeListener(this);
            return;
        }
        InlineClassHelperKt.d("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
        throw new KotlinNothingValueException();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
