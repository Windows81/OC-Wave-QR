package androidx.compose.ui.graphics.layer;

import android.view.View;
import kotlin.Metadata;

@Metadata
final class OutlineUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final OutlineUtils f16442a = new OutlineUtils();

    public final boolean a(View view) {
        view.invalidateOutline();
        return true;
    }
}
