package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.util.ListUtilsKt;
import kotlin.Metadata;

@Metadata
final class TypefaceCompatApi26 {

    /* renamed from: a  reason: collision with root package name */
    public static final TypefaceCompatApi26 f18762a = new TypefaceCompatApi26();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal f18763b = new ThreadLocal();

    public final Typeface a(Typeface typeface, FontVariation.Settings settings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (settings.b().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) f18763b.get();
        if (paint == null) {
            paint = new Paint();
            f18763b.set(paint);
        }
        paint.setFontVariationSettings((String) null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(settings, context));
        return paint.getTypeface();
    }

    public final String b(FontVariation.Settings settings, Context context) {
        return ListUtilsKt.e(settings.b(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new TypefaceCompatApi26$toAndroidString$1(AndroidDensity_androidKt.a(context)), 31, (Object) null);
    }
}
