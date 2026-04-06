package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class GestureCancellationException extends CancellationException {
    public GestureCancellationException(String str) {
        super(str);
    }
}
