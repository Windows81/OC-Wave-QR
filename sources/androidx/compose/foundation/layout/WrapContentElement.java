package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {
    public static final Companion E = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final boolean f4290A;

    /* renamed from: B  reason: collision with root package name */
    public final Function2 f4291B;
    public final Object C;
    public final String D;

    /* renamed from: z  reason: collision with root package name */
    public final Direction f4292z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrapContentElement a(Alignment.Vertical vertical, boolean z2) {
            return new WrapContentElement(Direction.Vertical, z2, new WrapContentElement$Companion$height$1(vertical), vertical, "wrapContentHeight");
        }

        public final WrapContentElement b(Alignment alignment, boolean z2) {
            return new WrapContentElement(Direction.Both, z2, new WrapContentElement$Companion$size$1(alignment), alignment, "wrapContentSize");
        }

        public final WrapContentElement c(Alignment.Horizontal horizontal, boolean z2) {
            return new WrapContentElement(Direction.Horizontal, z2, new WrapContentElement$Companion$width$1(horizontal), horizontal, "wrapContentWidth");
        }

        public Companion() {
        }
    }

    public WrapContentElement(Direction direction, boolean z2, Function2 function2, Object obj, String str) {
        this.f4292z = direction;
        this.f4290A = z2;
        this.f4291B = function2;
        this.C = obj;
        this.D = str;
    }

    /* renamed from: c */
    public WrapContentNode a() {
        return new WrapContentNode(this.f4292z, this.f4290A, this.f4291B);
    }

    /* renamed from: d */
    public void b(WrapContentNode wrapContentNode) {
        wrapContentNode.b3(this.f4292z);
        wrapContentNode.c3(this.f4290A);
        wrapContentNode.a3(this.f4291B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f4292z == wrapContentElement.f4292z && this.f4290A == wrapContentElement.f4290A && Intrinsics.d(this.C, wrapContentElement.C);
    }

    public int hashCode() {
        return (((this.f4292z.hashCode() * 31) + Boolean.hashCode(this.f4290A)) * 31) + this.C.hashCode();
    }
}
