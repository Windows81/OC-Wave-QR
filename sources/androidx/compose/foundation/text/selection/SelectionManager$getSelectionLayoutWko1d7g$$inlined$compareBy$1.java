package androidx.compose.foundation.text.selection;

import androidx.collection.MutableLongIntMap;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

@Metadata
/* renamed from: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1  reason: invalid class name */
public final class SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1<T> implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableLongIntMap f6896z;

    public SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1(MutableLongIntMap mutableLongIntMap) {
        this.f6896z = mutableLongIntMap;
    }

    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(Integer.valueOf(this.f6896z.b(((Number) obj).longValue())), Integer.valueOf(this.f6896z.b(((Number) obj2).longValue())));
    }
}
