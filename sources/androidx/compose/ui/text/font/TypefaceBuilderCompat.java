package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
final class TypefaceBuilderCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final TypefaceBuilderCompat f18761a = new TypefaceBuilderCompat();

    public final Typeface a(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, str).setFontVariationSettings(d(settings, context)).build();
    }

    public final Typeface b(File file, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(d(settings, context)).build();
    }

    public final Typeface c(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(d(settings, context)).build();
    }

    public final FontVariationAxis[] d(FontVariation.Settings settings, Context context) {
        Density density;
        if (context != null) {
            density = AndroidDensity_androidKt.a(context);
        } else if (!settings.a()) {
            density = DensityKt.a(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List b2 = settings.b();
        ArrayList arrayList = new ArrayList(b2.size());
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            FontVariation.Setting setting = (FontVariation.Setting) b2.get(i2);
            arrayList.add(new FontVariationAxis(setting.c(), setting.b(density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }
}
