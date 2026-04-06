package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import kotlin.Metadata;

@Metadata
final class ViewConfigurationApi26Impl {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewConfigurationApi26Impl f3644a = new ViewConfigurationApi26Impl();

    public final float a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public final float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
