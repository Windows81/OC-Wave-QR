package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;

@Metadata
final class AndroidConfig implements ScrollConfig {

    /* renamed from: a  reason: collision with root package name */
    public final ViewConfiguration f3391a;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.f3391a = viewConfiguration;
    }

    public long c(Density density, PointerEvent pointerEvent, long j2) {
        int i2 = Build.VERSION.SDK_INT;
        float f2 = -(i2 > 26 ? ViewConfigurationApi26Impl.f3644a.b(this.f3391a) : density.B1(Dp.m((float) 64)));
        float f3 = -(i2 > 26 ? ViewConfigurationApi26Impl.f3644a.a(this.f3391a) : density.B1(Dp.m((float) 64)));
        List c2 = pointerEvent.c();
        Offset d2 = Offset.d(Offset.f15855b.c());
        int size = c2.size();
        for (int i3 = 0; i3 < size; i3++) {
            d2 = Offset.d(Offset.q(d2.t(), ((PointerInputChange) c2.get(i3)).m()));
        }
        long t2 = d2.t();
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (t2 >> 32)) * f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (t2 & 4294967295L)) * f2)) & 4294967295L));
    }
}
