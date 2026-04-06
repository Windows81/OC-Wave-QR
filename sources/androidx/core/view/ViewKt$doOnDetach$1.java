package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ViewKt$doOnDetach$1 implements View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f20288A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f20289z;

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f20289z.removeOnAttachStateChangeListener(this);
        this.f20288A.invoke(view);
    }
}
