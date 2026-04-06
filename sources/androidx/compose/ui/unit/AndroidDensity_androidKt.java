package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;

@Metadata
public final class AndroidDensity_androidKt {
    public static final Density a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter b2 = FontScaleConverterFactory.f19189a.b(f2);
        if (b2 == null) {
            b2 = new LinearFontScaleConverter(f2);
        }
        return new DensityWithConverter(f3, f2, b2);
    }
}
