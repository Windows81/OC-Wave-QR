package androidx.compose.foundation.text;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LinkStateInteractionSourceObserver {

    /* renamed from: a  reason: collision with root package name */
    public final InteractionSource f5811a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5812b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final int f5813c = 2;

    /* renamed from: d  reason: collision with root package name */
    public final int f5814d = 4;

    /* renamed from: e  reason: collision with root package name */
    public final MutableIntState f5815e = SnapshotIntStateKt.a(0);

    public LinkStateInteractionSourceObserver(InteractionSource interactionSource) {
        this.f5811a = interactionSource;
    }

    public final Object e(Continuation continuation) {
        Object a2 = this.f5811a.c().a(new LinkStateInteractionSourceObserver$collectInteractionsForLinks$2(new MutableObjectList(0, 1, (DefaultConstructorMarker) null), this), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public final boolean f() {
        return (this.f5815e.e() & this.f5812b) != 0;
    }

    public final boolean g() {
        return (this.f5815e.e() & this.f5813c) != 0;
    }

    public final boolean h() {
        return (this.f5815e.e() & this.f5814d) != 0;
    }
}
