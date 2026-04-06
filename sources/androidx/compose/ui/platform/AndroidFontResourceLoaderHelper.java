package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;

@Metadata
final class AndroidFontResourceLoaderHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidFontResourceLoaderHelper f17625a = new AndroidFontResourceLoaderHelper();

    public final Typeface a(Context context, int i2) {
        return context.getResources().getFont(i2);
    }
}
