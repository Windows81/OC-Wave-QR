package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;

@Metadata
public final class DefaultScrollableState$scrollScope$1 implements ScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultScrollableState f3443a;

    public DefaultScrollableState$scrollScope$1(DefaultScrollableState defaultScrollableState) {
        this.f3443a = defaultScrollableState;
    }

    public float g(float f2) {
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        float floatValue = ((Number) this.f3443a.l().invoke(Float.valueOf(f2))).floatValue();
        boolean z2 = false;
        this.f3443a.f3441e.setValue(Boolean.valueOf(floatValue > 0.0f));
        MutableState i2 = this.f3443a.f3442f;
        if (floatValue < 0.0f) {
            z2 = true;
        }
        i2.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
