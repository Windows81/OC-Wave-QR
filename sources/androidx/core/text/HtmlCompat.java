package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

public final class HtmlCompat {

    public static class Api24Impl {
        public static Spanned a(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i2, imageGetter, tagHandler);
        }
    }

    public static Spanned a(String str, int i2, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Api24Impl.a(str, i2, imageGetter, tagHandler);
    }
}
