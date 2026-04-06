package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Draggable2DElement extends ModifierNodeElement<Draggable2DNode> {
    public static final Companion G = new Companion((DefaultConstructorMarker) null);
    public static final Function1 H = Draggable2DElement$Companion$CanDrag$1.f3502z;

    /* renamed from: A  reason: collision with root package name */
    public final boolean f3499A;

    /* renamed from: B  reason: collision with root package name */
    public final MutableInteractionSource f3500B;
    public final boolean C;
    public final Function1 D;
    public final Function1 E;
    public final boolean F;

    /* renamed from: z  reason: collision with root package name */
    public final Draggable2DState f3501z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: c */
    public Draggable2DNode a() {
        return new Draggable2DNode(this.f3501z, H, this.f3499A, this.f3500B, this.C, this.F, this.D, this.E);
    }

    /* renamed from: d */
    public void b(Draggable2DNode draggable2DNode) {
        draggable2DNode.C3(this.f3501z, H, this.f3499A, this.f3500B, this.C, this.F, this.D, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        Draggable2DElement draggable2DElement = (Draggable2DElement) obj;
        return Intrinsics.d(this.f3501z, draggable2DElement.f3501z) && this.f3499A == draggable2DElement.f3499A && Intrinsics.d(this.f3500B, draggable2DElement.f3500B) && this.C == draggable2DElement.C && this.D == draggable2DElement.D && this.E == draggable2DElement.E && this.F == draggable2DElement.F;
    }

    public int hashCode() {
        int hashCode = ((this.f3501z.hashCode() * 31) + Boolean.hashCode(this.f3499A)) * 31;
        MutableInteractionSource mutableInteractionSource = this.f3500B;
        return ((((((((hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + Boolean.hashCode(this.F);
    }
}
