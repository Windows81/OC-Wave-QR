package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata
public /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
    public ScrollCapture$onScrollCaptureSearch$1(Object obj) {
        super(1, obj, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }

    public final void b(ScrollCaptureCandidate scrollCaptureCandidate) {
        ((MutableVector) this.f40864z).d(scrollCaptureCandidate);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ScrollCaptureCandidate) obj);
        return Unit.f40552a;
    }
}
