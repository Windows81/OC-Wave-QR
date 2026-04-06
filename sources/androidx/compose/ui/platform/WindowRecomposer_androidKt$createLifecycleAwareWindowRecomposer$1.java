package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;

@Metadata
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1 implements View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Recomposer f17937A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f17938z;

    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1(View view, Recomposer recomposer) {
        this.f17938z = view;
        this.f17937A = recomposer;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f17938z.removeOnAttachStateChangeListener(this);
        this.f17937A.o0();
    }
}
