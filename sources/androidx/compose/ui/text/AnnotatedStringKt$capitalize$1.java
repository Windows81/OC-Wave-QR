package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnnotatedStringKt$capitalize$1 extends Lambda implements Function3<String, Integer, Integer, String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LocaleList f18238z;

    public final String b(String str, int i2, int i3) {
        if (i2 == 0) {
            String substring = str.substring(i2, i3);
            Intrinsics.h(substring, "substring(...)");
            return StringKt.b(substring, this.f18238z);
        }
        String substring2 = str.substring(i2, i3);
        Intrinsics.h(substring2, "substring(...)");
        return substring2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}
