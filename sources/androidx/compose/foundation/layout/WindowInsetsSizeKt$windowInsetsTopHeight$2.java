package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class WindowInsetsSizeKt$windowInsetsTopHeight$2 extends Lambda implements Function2<WindowInsets, Density, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final WindowInsetsSizeKt$windowInsetsTopHeight$2 f4287z = new WindowInsetsSizeKt$windowInsetsTopHeight$2();

    public WindowInsetsSizeKt$windowInsetsTopHeight$2() {
        super(2);
    }

    /* renamed from: b */
    public final Integer m(WindowInsets windowInsets, Density density) {
        return Integer.valueOf(windowInsets.a(density));
    }
}
