package androidx.activity;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 implements View.OnAttachStateChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f109A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f110B;
    public final /* synthetic */ View.OnLayoutChangeListener C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f111z;

    public PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1(ProducerScope producerScope, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f111z = producerScope;
        this.f109A = view;
        this.f110B = onScrollChangedListener;
        this.C = onLayoutChangeListener;
    }

    public void onViewAttachedToWindow(View view) {
        Intrinsics.i(view, "v");
        this.f111z.L(PipHintTrackerKt.b(this.f109A));
        this.f109A.getViewTreeObserver().addOnScrollChangedListener(this.f110B);
        this.f109A.addOnLayoutChangeListener(this.C);
    }

    public void onViewDetachedFromWindow(View view) {
        Intrinsics.i(view, "v");
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f110B);
        view.removeOnLayoutChangeListener(this.C);
    }
}
