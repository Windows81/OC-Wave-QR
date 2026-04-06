package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

public abstract /* synthetic */ class h {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f2, float f3, BoringLayout.Metrics metrics, boolean z2, TextUtils.TruncateAt truncateAt, int i3, boolean z3) {
        return new BoringLayout(charSequence, textPaint, i2, alignment, f2, f3, metrics, z2, truncateAt, i3, z3);
    }
}
