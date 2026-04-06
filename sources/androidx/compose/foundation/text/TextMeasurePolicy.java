package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

@Metadata
final class TextMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f6009a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f6010b;

    public TextMeasurePolicy(Function0 function0, Function0 function02) {
        this.f6009a = function0;
        this.f6010b = function02;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList;
        Pair pair;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(list.size());
        Collection collection = list2;
        int size = collection.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list2.get(i2);
            if (!(((Measurable) obj).t() instanceof TextRangeLayoutModifier)) {
                arrayList2.add(obj);
            }
        }
        List list3 = (List) this.f6010b.invoke();
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Rect rect = (Rect) list3.get(i3);
                if (rect != null) {
                    Placeable c0 = ((Measurable) arrayList2.get(i3)).c0(ConstraintsKt.b(0, (int) ((float) Math.floor((double) (rect.p() - rect.o()))), 0, (int) ((float) Math.floor((double) (rect.i() - rect.r()))), 5, (Object) null));
                    int round = Math.round(rect.o());
                    pair = new Pair(c0, IntOffset.c(IntOffset.f((((long) Math.round(rect.r())) & 4294967295L) | (((long) round) << 32))));
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = collection.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object obj2 = list2.get(i4);
            if (((Measurable) obj2).t() instanceof TextRangeLayoutModifier) {
                arrayList4.add(obj2);
            }
        }
        return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, new TextMeasurePolicy$measure$1(arrayList, BasicTextKt.o(arrayList4, this.f6009a)), 4, (Object) null);
    }
}
