package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner a(View view) {
        Intrinsics.i(view, "<this>");
        return (FullyDrawnReporterOwner) SequencesKt.u(SequencesKt.A(SequencesKt.h(view, ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.f122z), ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.f123z));
    }

    public static final void b(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        Intrinsics.i(view, "<this>");
        Intrinsics.i(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.f112a, fullyDrawnReporterOwner);
    }
}
