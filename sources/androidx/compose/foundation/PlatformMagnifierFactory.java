package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public interface PlatformMagnifierFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f3140a = Companion.f3141a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f3141a = new Companion();

        public final PlatformMagnifierFactory a() {
            if (Magnifier_androidKt.d(0, 1, (Object) null)) {
                return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.f3142b : PlatformMagnifierFactoryApi29Impl.f3145b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    PlatformMagnifier a(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4);

    boolean b();
}
