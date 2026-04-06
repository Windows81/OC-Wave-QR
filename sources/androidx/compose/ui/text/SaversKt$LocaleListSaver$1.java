package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$LocaleListSaver$1 extends Lambda implements Function2<SaverScope, LocaleList, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$LocaleListSaver$1 f18392z = new SaversKt$LocaleListSaver$1();

    public SaversKt$LocaleListSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, LocaleList localeList) {
        List i2 = localeList.i();
        ArrayList arrayList = new ArrayList(i2.size());
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(SaversKt.z((Locale) i2.get(i3), SaversKt.o(Locale.f18939b), saverScope));
        }
        return arrayList;
    }
}
