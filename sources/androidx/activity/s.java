package androidx.activity;

import android.view.View;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class s implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f276a;

    public /* synthetic */ s(ProducerScope producerScope) {
        this.f276a = producerScope;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1.D(this.f276a, view, i2, i3, i4, i5, i6, i7, i8, i9);
    }
}
