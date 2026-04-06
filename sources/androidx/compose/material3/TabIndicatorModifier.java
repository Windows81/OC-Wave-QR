package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {

    /* renamed from: A  reason: collision with root package name */
    public final int f11268A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f11269B;
    public final FiniteAnimationSpec C;

    /* renamed from: z  reason: collision with root package name */
    public final State f11270z;

    public TabIndicatorModifier(State state, int i2, boolean z2, FiniteAnimationSpec finiteAnimationSpec) {
        this.f11270z = state;
        this.f11268A = i2;
        this.f11269B = z2;
        this.C = finiteAnimationSpec;
    }

    /* renamed from: c */
    public TabIndicatorOffsetNode a() {
        return new TabIndicatorOffsetNode(this.f11270z, this.f11268A, this.f11269B, this.C);
    }

    /* renamed from: d */
    public void b(TabIndicatorOffsetNode tabIndicatorOffsetNode) {
        tabIndicatorOffsetNode.h3(this.f11270z);
        tabIndicatorOffsetNode.g3(this.f11268A);
        tabIndicatorOffsetNode.f3(this.f11269B);
        tabIndicatorOffsetNode.e3(this.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return Intrinsics.d(this.f11270z, tabIndicatorModifier.f11270z) && this.f11268A == tabIndicatorModifier.f11268A && this.f11269B == tabIndicatorModifier.f11269B && Intrinsics.d(this.C, tabIndicatorModifier.C);
    }

    public int hashCode() {
        return (((((this.f11270z.hashCode() * 31) + Integer.hashCode(this.f11268A)) * 31) + Boolean.hashCode(this.f11269B)) * 31) + this.C.hashCode();
    }

    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.f11270z + ", selectedTabIndex=" + this.f11268A + ", followContentSize=" + this.f11269B + ", animationSpec=" + this.C + ')';
    }
}
