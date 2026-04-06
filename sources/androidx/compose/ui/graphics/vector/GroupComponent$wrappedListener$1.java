package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class GroupComponent$wrappedListener$1 extends Lambda implements Function1<VNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GroupComponent f16487z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupComponent$wrappedListener$1(GroupComponent groupComponent) {
        super(1);
        this.f16487z = groupComponent;
    }

    public final void b(VNode vNode) {
        this.f16487z.n(vNode);
        Function1 b2 = this.f16487z.b();
        if (b2 != null) {
            b2.invoke(vNode);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((VNode) obj);
        return Unit.f40552a;
    }
}
