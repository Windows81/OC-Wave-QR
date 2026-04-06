package androidx.browser.customtabs;

import android.os.Bundle;

class Api33Impl {
    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        return bundle.getParcelable(str, cls);
    }
}
