package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

@Metadata
public final class Api29Impl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api29Impl f17657a = new Api29Impl();

    public final int a(AccessibilityManager accessibilityManager, int i2, int i3) {
        return accessibilityManager.getRecommendedTimeoutMillis(i2, i3);
    }
}
