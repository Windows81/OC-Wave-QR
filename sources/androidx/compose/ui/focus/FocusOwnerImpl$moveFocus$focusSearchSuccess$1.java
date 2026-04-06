package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FocusOwnerImpl$moveFocus$focusSearchSuccess$1 extends Lambda implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f15779A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f15780z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$moveFocus$focusSearchSuccess$1(Ref.ObjectRef objectRef, int i2) {
        super(1);
        this.f15780z = objectRef;
        this.f15779A = i2;
    }

    /* renamed from: b */
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        this.f15780z.f40908z = Boolean.valueOf(focusTargetNode.c0(this.f15779A));
        Boolean bool = (Boolean) this.f15780z.f40908z;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
