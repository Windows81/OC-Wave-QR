package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ViewKt$doOnAttach$1 implements View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f20286A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f20287z;

    public void onViewAttachedToWindow(View view) {
        this.f20287z.removeOnAttachStateChangeListener(this);
        this.f20286A.invoke(view);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
