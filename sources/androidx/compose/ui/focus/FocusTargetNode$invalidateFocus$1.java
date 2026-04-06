package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FocusTargetNode$invalidateFocus$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f15822A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f15823z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusTargetNode$invalidateFocus$1(Ref.ObjectRef objectRef, FocusTargetNode focusTargetNode) {
        super(0);
        this.f15823z = objectRef;
        this.f15822A = focusTargetNode;
    }

    public final void invoke() {
        this.f15823z.f40908z = this.f15822A.g3();
    }
}
