package androidx.savedstate;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final /* synthetic */ class SavedStateWriterKt__SavedStateWriter_androidKt {
    public static final ArrayList a(Collection collection) {
        Intrinsics.i(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}
