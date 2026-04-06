package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public final class BoringLayoutFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final BoringLayoutFactory f18508a = new BoringLayoutFactory();

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i2, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z2, boolean z3, TextUtils.TruncateAt truncateAt, int i3) {
        boolean z4 = false;
        if (!(i2 >= 0)) {
            InlineClassHelperKt.a("negative width");
        }
        if (i3 >= 0) {
            z4 = true;
        }
        if (!z4) {
            InlineClassHelperKt.a("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.a(charSequence, textPaint, i2, alignment, 1.0f, 0.0f, metrics, z2, z3, truncateAt, i3) : BoringLayoutFactoryDefault.a(charSequence, textPaint, i2, alignment, 1.0f, 0.0f, metrics, z2, truncateAt, i3);
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.b(charSequence, textPaint, textDirectionHeuristic) : BoringLayoutFactoryDefault.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
