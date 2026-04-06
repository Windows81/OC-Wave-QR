package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class MultiParagraphKt {
    public static final int a(List list, int i2) {
        int i3;
        int b2 = ((ParagraphInfo) CollectionsKt.p0(list)).b();
        boolean z2 = false;
        if (!(i2 <= ((ParagraphInfo) CollectionsKt.p0(list)).b())) {
            InlineClassHelperKt.a("Index " + i2 + " should be less or equal than last line's end " + b2);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i3 = -(i4 + 1);
                break;
            }
            i3 = (i4 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            char c2 = paragraphInfo.f() > i2 ? 1 : paragraphInfo.b() <= i2 ? (char) 65535 : 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i4 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("Found paragraph index " + i3 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i2 + ", paragraphs=[" + ListUtilsKt.e(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, MultiParagraphKt$findParagraphByIndex$2$1.f18308z, 31, (Object) null) + ']');
        }
        return i3;
    }

    public static final int b(List list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i4);
            char c2 = paragraphInfo.g() > i2 ? 1 : paragraphInfo.c() <= i2 ? (char) 65535 : 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else if (c2 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int c(List list, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((ParagraphInfo) CollectionsKt.p0(list)).a()) {
            return CollectionsKt.o(list);
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            char c2 = paragraphInfo.h() > f2 ? 1 : paragraphInfo.a() <= f2 ? (char) 65535 : 0;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void d(List list, long j2, Function1 function1) {
        int a2 = a(list, TextRange.l(j2));
        int size = list.size();
        while (a2 < size) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(a2);
            if (paragraphInfo.f() < TextRange.k(j2)) {
                if (paragraphInfo.f() != paragraphInfo.b()) {
                    function1.invoke(paragraphInfo);
                }
                a2++;
            } else {
                return;
            }
        }
    }
}
