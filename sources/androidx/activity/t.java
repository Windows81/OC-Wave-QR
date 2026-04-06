package androidx.activity;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class t implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f278b;

    public /* synthetic */ t(ProducerScope producerScope, View view) {
        this.f277a = producerScope;
        this.f278b = view;
    }

    public final void onScrollChanged() {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1.E(this.f277a, this.f278b);
    }
}
