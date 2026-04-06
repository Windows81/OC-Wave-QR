package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f15955z;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.f15955z = function1;
    }

    /* renamed from: c */
    public BlockGraphicsLayerModifier a() {
        return new BlockGraphicsLayerModifier(this.f15955z);
    }

    /* renamed from: d */
    public void b(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.b3(this.f15955z);
        blockGraphicsLayerModifier.a3();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.d(this.f15955z, ((BlockGraphicsLayerElement) obj).f15955z);
    }

    public int hashCode() {
        return this.f15955z.hashCode();
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f15955z + ')';
    }
}
