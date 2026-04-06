package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import kotlin.Metadata;

@Metadata
public final class AndroidViewConfiguration implements ViewConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final ViewConfiguration f17652a;

    public AndroidViewConfiguration(ViewConfiguration viewConfiguration) {
        this.f17652a = viewConfiguration;
    }

    public long a() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public long b() {
        return 40;
    }

    public long c() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.f17653a.b(this.f17652a) : super.d();
    }

    public float f() {
        return (float) this.f17652a.getScaledMaximumFlingVelocity();
    }

    public float g() {
        return (float) this.f17652a.getScaledTouchSlop();
    }

    public float h() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.f17653a.a(this.f17652a) : super.h();
    }
}
