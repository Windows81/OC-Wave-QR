package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class WindowInsetsSizeKt$windowInsetsEndWidth$2 extends Lambda implements Function3<WindowInsets, LayoutDirection, Density, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final WindowInsetsSizeKt$windowInsetsEndWidth$2 f4285z = new WindowInsetsSizeKt$windowInsetsEndWidth$2();

    public WindowInsetsSizeKt$windowInsetsEndWidth$2() {
        super(3);
    }

    /* renamed from: b */
    public final Integer d(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        return Integer.valueOf(layoutDirection == LayoutDirection.Rtl ? windowInsets.d(density, layoutDirection) : windowInsets.b(density, layoutDirection));
    }
}
