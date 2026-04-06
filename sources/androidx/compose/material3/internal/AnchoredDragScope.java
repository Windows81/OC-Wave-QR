package androidx.compose.material3.internal;

import kotlin.Metadata;

@Metadata
public interface AnchoredDragScope {
    static /* synthetic */ void b(AnchoredDragScope anchoredDragScope, float f2, float f3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            anchoredDragScope.a(f2, f3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
    }

    void a(float f2, float f3);
}
