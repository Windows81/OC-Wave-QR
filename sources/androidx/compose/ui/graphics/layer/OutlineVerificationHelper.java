package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

@Metadata
public final class OutlineVerificationHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final OutlineVerificationHelper f16443a = new OutlineVerificationHelper();

    public final void a(Outline outline, Path path) {
        if (path instanceof AndroidPath) {
            outline.setPath(((AndroidPath) path).B());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
