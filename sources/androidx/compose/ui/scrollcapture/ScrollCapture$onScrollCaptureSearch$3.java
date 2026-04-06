package androidx.compose.ui.scrollcapture;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollCapture$onScrollCaptureSearch$3 extends Lambda implements Function1<ScrollCaptureCandidate, Comparable<?>> {

    /* renamed from: z  reason: collision with root package name */
    public static final ScrollCapture$onScrollCaptureSearch$3 f18011z = new ScrollCapture$onScrollCaptureSearch$3();

    public ScrollCapture$onScrollCaptureSearch$3() {
        super(1);
    }

    /* renamed from: b */
    public final Comparable invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
        return Integer.valueOf(scrollCaptureCandidate.d().f());
    }
}
