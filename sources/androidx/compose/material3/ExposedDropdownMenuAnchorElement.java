package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class ExposedDropdownMenuAnchorElement extends ModifierNodeElement<ExposedDropdownMenuAnchorNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f9934z;

    public ExposedDropdownMenuAnchorElement(Function0 function0) {
        this.f9934z = function0;
    }

    /* renamed from: c */
    public ExposedDropdownMenuAnchorNode a() {
        return new ExposedDropdownMenuAnchorNode(this.f9934z);
    }

    /* renamed from: d */
    public void b(ExposedDropdownMenuAnchorNode exposedDropdownMenuAnchorNode) {
        exposedDropdownMenuAnchorNode.Z2(this.f9934z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposedDropdownMenuAnchorElement)) {
            return false;
        }
        return this.f9934z == ((ExposedDropdownMenuAnchorElement) obj).f9934z;
    }

    public int hashCode() {
        return this.f9934z.hashCode();
    }
}
