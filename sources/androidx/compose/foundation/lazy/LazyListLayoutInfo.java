package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;

@Metadata
public interface LazyListLayoutInfo {

    @Metadata
    public static final class DefaultImpls {
    }

    long c() {
        return IntSize.f19170b.a();
    }

    int d() {
        return 0;
    }

    Orientation e() {
        return Orientation.Vertical;
    }

    int f() {
        return 0;
    }

    int g();

    int h();

    int i() {
        return 0;
    }

    int j();

    List k();
}
