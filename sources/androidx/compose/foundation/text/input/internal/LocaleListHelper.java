package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LocaleListHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final LocaleListHelper f6257a = new LocaleListHelper();

    public final void a(EditorInfo editorInfo, LocaleList localeList) {
        if (Intrinsics.d(localeList, LocaleList.f18941B.b())) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(localeList, 10));
        Iterator it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).a());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
