package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function0 f12605A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f12606B;
    public final PullToRefreshState C;
    public final float D;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f12607z;

    public /* synthetic */ PullToRefreshElement(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, function0, z3, pullToRefreshState, f2);
    }

    /* renamed from: c */
    public PullToRefreshModifierNode a() {
        return new PullToRefreshModifierNode(this.f12607z, this.f12605A, this.f12606B, this.C, this.D, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(PullToRefreshModifierNode pullToRefreshModifierNode) {
        pullToRefreshModifierNode.y3(this.f12605A);
        pullToRefreshModifierNode.x3(this.f12606B);
        pullToRefreshModifierNode.A3(this.C);
        pullToRefreshModifierNode.B3(this.D);
        boolean u3 = pullToRefreshModifierNode.u3();
        boolean z2 = this.f12607z;
        if (u3 != z2) {
            pullToRefreshModifierNode.z3(z2);
            pullToRefreshModifierNode.D3();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.f12607z == pullToRefreshElement.f12607z && this.f12606B == pullToRefreshElement.f12606B && this.f12605A == pullToRefreshElement.f12605A && Intrinsics.d(this.C, pullToRefreshElement.C) && Dp.o(this.D, pullToRefreshElement.D);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f12607z) * 31) + Boolean.hashCode(this.f12606B)) * 31) + this.f12605A.hashCode()) * 31) + this.C.hashCode()) * 31) + Dp.p(this.D);
    }

    public PullToRefreshElement(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f2) {
        this.f12607z = z2;
        this.f12605A = function0;
        this.f12606B = z3;
        this.C = pullToRefreshState;
        this.D = f2;
    }
}
