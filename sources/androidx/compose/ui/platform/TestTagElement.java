package androidx.compose.ui.platform;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TestTagElement extends ModifierNodeElement<TestTagNode> {

    /* renamed from: z  reason: collision with root package name */
    public final String f17880z;

    public TestTagElement(String str) {
        this.f17880z = str;
    }

    /* renamed from: c */
    public TestTagNode a() {
        return new TestTagNode(this.f17880z);
    }

    /* renamed from: d */
    public void b(TestTagNode testTagNode) {
        testTagNode.Z2(this.f17880z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.d(this.f17880z, ((TestTagElement) obj).f17880z);
    }

    public int hashCode() {
        return this.f17880z.hashCode();
    }
}
