package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import kotlin.Metadata;

@Metadata
final class AndroidViewConfigurationApi34 {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidViewConfigurationApi34 f17653a = new AndroidViewConfigurationApi34();

    public final float a(ViewConfiguration viewConfiguration) {
        return (float) viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public final float b(ViewConfiguration viewConfiguration) {
        return (float) viewConfiguration.getScaledHandwritingSlop();
    }
}
