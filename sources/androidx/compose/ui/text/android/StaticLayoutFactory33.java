package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import kotlin.Metadata;

@Metadata
final class StaticLayoutFactory33 {

    /* renamed from: a  reason: collision with root package name */
    public static final StaticLayoutFactory33 f18550a = new StaticLayoutFactory33();

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i2, int i3) {
        StaticLayout.Builder unused = builder.setLineBreakConfig(C.a().setLineBreakStyle(i2).setLineBreakWordStyle(i3).build());
    }
}
