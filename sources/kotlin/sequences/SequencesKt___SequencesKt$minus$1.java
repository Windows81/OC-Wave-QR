package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SequencesKt___SequencesKt$minus$1 implements Sequence<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Sequence f41060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f41061b;

    public static final boolean c(Ref.BooleanRef booleanRef, Object obj, Object obj2) {
        if (booleanRef.f40901z || !Intrinsics.d(obj2, obj)) {
            return true;
        }
        booleanRef.f40901z = true;
        return false;
    }

    public Iterator iterator() {
        return SequencesKt___SequencesKt.q(this.f41060a, new d(new Ref.BooleanRef(), this.f41061b)).iterator();
    }
}
