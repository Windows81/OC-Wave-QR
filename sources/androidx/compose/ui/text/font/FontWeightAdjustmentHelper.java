package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

@Metadata
public final class FontWeightAdjustmentHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final FontWeightAdjustmentHelper f18749a = new FontWeightAdjustmentHelper();

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return FontWeightAdjustmentHelperApi31.f18750a.a(context);
        }
        return 0;
    }
}
