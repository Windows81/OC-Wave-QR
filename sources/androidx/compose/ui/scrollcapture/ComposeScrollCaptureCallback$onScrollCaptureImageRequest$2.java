package androidx.compose.ui.scrollcapture;

import android.view.ScrollCaptureSession;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ComposeScrollCaptureCallback I;
    public int J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(ComposeScrollCaptureCallback composeScrollCaptureCallback, Continuation continuation) {
        super(continuation);
        this.I = composeScrollCaptureCallback;
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.e((ScrollCaptureSession) null, (IntRect) null, this);
    }
}
