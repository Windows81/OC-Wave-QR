package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnnotatedStringKt$toUpperCase$1 extends Lambda implements Function3<String, Integer, Integer, String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocaleList f18242z;

    public final String b(String str, int i2, int i3) {
        String substring = str.substring(i2, i3);
        Intrinsics.h(substring, "substring(...)");
        return StringKt.h(substring, this.f18242z);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
