package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {

    /* renamed from: A  reason: collision with root package name */
    public final State f4506A;

    /* renamed from: B  reason: collision with root package name */
    public final State f4507B;
    public final String C;

    /* renamed from: z  reason: collision with root package name */
    public final float f4508z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentSizeElement(float f2, State state, State state2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, (i2 & 2) != 0 ? null : state, (i2 & 4) != 0 ? null : state2, str);
    }

    /* renamed from: c */
    public ParentSizeNode a() {
        return new ParentSizeNode(this.f4508z, this.f4506A, this.f4507B);
    }

    /* renamed from: d */
    public void b(ParentSizeNode parentSizeNode) {
        parentSizeNode.Z2(this.f4508z);
        parentSizeNode.b3(this.f4506A);
        parentSizeNode.a3(this.f4507B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f4508z == parentSizeElement.f4508z && Intrinsics.d(this.f4506A, parentSizeElement.f4506A) && Intrinsics.d(this.f4507B, parentSizeElement.f4507B);
    }

    public int hashCode() {
        State state = this.f4506A;
        int i2 = 0;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        State state2 = this.f4507B;
        if (state2 != null) {
            i2 = state2.hashCode();
        }
        return ((hashCode + i2) * 31) + Float.hashCode(this.f4508z);
    }

    public ParentSizeElement(float f2, State state, State state2, String str) {
        this.f4508z = f2;
        this.f4506A = state;
        this.f4507B = state2;
        this.C = str;
    }
}
