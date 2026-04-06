package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;

@Metadata
public interface ViewConfiguration {

    @Metadata
    public static final class DefaultImpls {
    }

    long a();

    long b();

    long c();

    float d() {
        return 2.0f;
    }

    long e() {
        float f2 = (float) 48;
        return DpKt.b(Dp.m(f2), Dp.m(f2));
    }

    float f() {
        return Float.MAX_VALUE;
    }

    float g();

    float h() {
        return 16.0f;
    }
}
