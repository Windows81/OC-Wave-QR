package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1 extends Lambda implements Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 f4622A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyGridSpanLayoutProvider f4623z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) {
        super(1);
        this.f4623z = lazyGridSpanLayoutProvider;
        this.f4622A = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    }

    public final ArrayList b(int i2) {
        LazyGridSpanLayoutProvider.LineConfiguration c2 = this.f4623z.c(i2);
        int a2 = c2.a();
        ArrayList arrayList = new ArrayList(c2.b().size());
        List b2 = c2.b();
        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = this.f4622A;
        int size = b2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int d2 = GridItemSpan.d(((GridItemSpan) b2.get(i4)).g());
            arrayList.add(TuplesKt.a(Integer.valueOf(a2), Constraints.a(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.a(i3, d2))));
            a2++;
            i3 += d2;
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
