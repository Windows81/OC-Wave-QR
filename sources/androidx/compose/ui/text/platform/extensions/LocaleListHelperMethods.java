package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class LocaleListHelperMethods {

    /* renamed from: a  reason: collision with root package name */
    public static final LocaleListHelperMethods f18998a = new LocaleListHelperMethods();

    public final Object a(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt.x(localeList, 10));
        Iterator it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).a());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(AndroidTextPaint androidTextPaint, LocaleList localeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt.x(localeList, 10));
        Iterator it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).a());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
