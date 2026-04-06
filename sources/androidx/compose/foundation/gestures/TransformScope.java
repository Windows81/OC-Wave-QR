package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Metadata
public interface TransformScope {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void b(TransformScope transformScope, float f2, long j2, float f3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f2 = 1.0f;
            }
            if ((i2 & 2) != 0) {
                j2 = Offset.f15855b.c();
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            transformScope.a(f2, j2, f3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
    }

    void a(float f2, long j2, float f3);
}
