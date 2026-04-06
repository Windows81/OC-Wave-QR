package androidx.compose.ui.semantics;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f18019A;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f18020z;

    public AppendedSemanticsElement(boolean z2, Function1 function1) {
        this.f18020z = z2;
        this.f18019A = function1;
    }

    public SemanticsConfiguration a0() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.z(this.f18020z);
        this.f18019A.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    /* renamed from: c */
    public CoreSemanticsModifierNode a() {
        return new CoreSemanticsModifierNode(this.f18020z, false, this.f18019A);
    }

    /* renamed from: d */
    public void b(CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.Z2(this.f18020z);
        coreSemanticsModifierNode.a3(this.f18019A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f18020z == appendedSemanticsElement.f18020z && Intrinsics.d(this.f18019A, appendedSemanticsElement.f18019A);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f18020z) * 31) + this.f18019A.hashCode();
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f18020z + ", properties=" + this.f18019A + ')';
    }
}
