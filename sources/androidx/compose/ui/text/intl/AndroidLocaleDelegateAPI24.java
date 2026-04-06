package androidx.compose.ui.text.intl;

import android.os.LocaleList;
import android.util.Log;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {

    /* renamed from: a  reason: collision with root package name */
    public LocaleList f18935a;

    /* renamed from: b  reason: collision with root package name */
    public LocaleList f18936b;

    /* renamed from: c  reason: collision with root package name */
    public final SynchronizedObject f18937c = new SynchronizedObject();

    public Locale a(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (Intrinsics.d(forLanguageTag.toLanguageTag(), "und")) {
            String a2 = AndroidLocaleDelegate_androidKt.f18938a;
            Log.e(a2, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public LocaleList b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f18937c) {
            LocaleList localeList2 = this.f18936b;
            if (localeList2 != null && localeList == this.f18935a) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new Locale(localeList.get(i2)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.f18935a = localeList;
            this.f18936b = localeList3;
            return localeList3;
        }
    }
}
