package androidx.compose.runtime;

import androidx.collection.IntList;
import androidx.collection.ObjectList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata
final class ComposePausableCompositionException extends Exception {

    /* renamed from: A  reason: collision with root package name */
    public final ObjectList f14558A;

    /* renamed from: B  reason: collision with root package name */
    public final IntList f14559B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final ObjectList f14560z;

    public final Sequence e() {
        return SequencesKt.b(new ComposePausableCompositionException$operationsSequence$1(this, (Continuation) null));
    }

    public String getMessage() {
        return StringsKt.l("\n            |Exception while applying pausable composition. Last 10 operations:\n            |" + CollectionsKt.n0(CollectionsKt.F0(SequencesKt.D(e()), 10), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "\n            ", (String) null, 1, (Object) null);
    }
}
