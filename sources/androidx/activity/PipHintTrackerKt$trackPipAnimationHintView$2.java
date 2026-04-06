package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
final class PipHintTrackerKt$trackPipAnimationHintView$2<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Activity f105z;

    /* renamed from: a */
    public final Object c(Rect rect, Continuation continuation) {
        Api26Impl.f35a.a(this.f105z, rect);
        return Unit.f40552a;
    }
}
