package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LazyGridState$prefetchScope$1 implements LazyGridPrefetchScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4750a;

    public LazyGridState$prefetchScope$1(LazyGridState lazyGridState) {
        this.f4750a = lazyGridState;
    }

    public List a(int i2) {
        ArrayList arrayList = new ArrayList();
        Snapshot.Companion companion = Snapshot.f15255e;
        LazyGridState lazyGridState = this.f4750a;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            LazyGridMeasureResult n2 = lazyGridState.t() ? lazyGridState.n() : (LazyGridMeasureResult) lazyGridState.f4727e.getValue();
            if (n2 != null) {
                List list = (List) n2.w().invoke(Integer.valueOf(i2));
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Pair pair = (Pair) list.get(i3);
                    arrayList.add(lazyGridState.C().e(((Number) pair.e()).intValue(), ((Constraints) pair.f()).r()));
                }
                Unit unit = Unit.f40552a;
            }
            companion.m(d2, f2, g2);
            return arrayList;
        } catch (Throwable th) {
            companion.m(d2, f2, g2);
            throw th;
        }
    }
}
