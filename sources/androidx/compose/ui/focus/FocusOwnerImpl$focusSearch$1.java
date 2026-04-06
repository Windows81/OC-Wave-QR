package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusOwnerImpl$focusSearch$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FocusOwnerImpl f15775A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f15776B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f15777z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$focusSearch$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Function1 function1) {
        super(1);
        this.f15777z = focusTargetNode;
        this.f15775A = focusOwnerImpl;
        this.f15776B = function1;
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        boolean z2;
        if (Intrinsics.d(focusTargetNode, this.f15777z)) {
            z2 = false;
        } else if (!Intrinsics.d(focusTargetNode, this.f15775A.B())) {
            z2 = ((Boolean) this.f15776B.invoke(focusTargetNode)).booleanValue();
        } else {
            throw new IllegalStateException("Focus search landed at the root.");
        }
        return Boolean.valueOf(z2);
    }
}
