package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OwnerSnapshotObserver$clearInvalidObservations$1 extends Lambda implements Function1<Object, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 f17439z = new OwnerSnapshotObserver$clearInvalidObservations$1();

    public OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(Object obj) {
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
        return Boolean.valueOf(!((OwnerScope) obj).v0());
    }
}
