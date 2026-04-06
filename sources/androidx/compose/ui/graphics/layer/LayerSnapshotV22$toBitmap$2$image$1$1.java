package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;
import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class LayerSnapshotV22$toBitmap$2$image$1$1 implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f16438a;

    public LayerSnapshotV22$toBitmap$2$image$1$1(CancellableContinuation cancellableContinuation) {
        this.f16438a = cancellableContinuation;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        CancellableContinuation cancellableContinuation = this.f16438a;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(imageReader.acquireLatestImage()));
    }
}
