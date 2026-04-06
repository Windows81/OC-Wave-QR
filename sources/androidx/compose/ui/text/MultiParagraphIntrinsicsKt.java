package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class MultiParagraphIntrinsicsKt {
    public static final List b(List list, int i2, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i4);
            if (AnnotatedStringKt.i(i2, i3, range.h(), range.f())) {
                if (!(i2 <= range.h() && range.f() <= i3)) {
                    InlineClassHelperKt.a("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new AnnotatedString.Range(range.g(), range.h() - i2, range.f() - i2));
            }
        }
        return arrayList;
    }
}
