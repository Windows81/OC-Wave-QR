package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;

@Metadata
public final class SelectionRegistrarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f6955a = CompositionLocalKt.h((SnapshotMutationPolicy) null, SelectionRegistrarKt$LocalSelectionRegistrar$1.f6956z, 1, (Object) null);

    public static final ProvidableCompositionLocal a() {
        return f6955a;
    }

    public static final boolean b(SelectionRegistrar selectionRegistrar, long j2) {
        LongObjectMap e2;
        if (selectionRegistrar == null || (e2 = selectionRegistrar.e()) == null) {
            return false;
        }
        return e2.a(j2);
    }
}
