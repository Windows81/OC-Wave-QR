package androidx.compose.ui.semantics;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ClearAndSetSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f18021z;

    public ClearAndSetSemanticsElement(Function1 function1) {
        this.f18021z = function1;
    }

    public SemanticsConfiguration a0() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.z(false);
        semanticsConfiguration.w(true);
        this.f18021z.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    /* renamed from: c */
    public CoreSemanticsModifierNode a() {
        return new CoreSemanticsModifierNode(false, true, this.f18021z);
    }

    /* renamed from: d */
    public void b(CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.a3(this.f18021z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && Intrinsics.d(this.f18021z, ((ClearAndSetSemanticsElement) obj).f18021z);
    }

    public int hashCode() {
        return this.f18021z.hashCode();
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f18021z + ')';
    }
}
