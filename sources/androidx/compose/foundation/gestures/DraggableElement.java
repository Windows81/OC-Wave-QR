package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {
    public static final Companion H = new Companion((DefaultConstructorMarker) null);
    public static final Function1 I = DraggableElement$Companion$CanDrag$1.f3515z;

    /* renamed from: A  reason: collision with root package name */
    public final Orientation f3512A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f3513B;
    public final MutableInteractionSource C;
    public final boolean D;
    public final Function3 E;
    public final Function3 F;
    public final boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final DraggableState f3514z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public DraggableElement(DraggableState draggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4) {
        this.f3514z = draggableState;
        this.f3512A = orientation;
        this.f3513B = z2;
        this.C = mutableInteractionSource;
        this.D = z3;
        this.E = function3;
        this.F = function32;
        this.G = z4;
    }

    /* renamed from: c */
    public DraggableNode a() {
        return new DraggableNode(this.f3514z, I, this.f3512A, this.f3513B, this.C, this.D, this.E, this.F, this.G);
    }

    /* renamed from: d */
    public void b(DraggableNode draggableNode) {
        draggableNode.I3(this.f3514z, I, this.f3512A, this.f3513B, this.C, this.D, this.E, this.F, this.G);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.d(this.f3514z, draggableElement.f3514z) && this.f3512A == draggableElement.f3512A && this.f3513B == draggableElement.f3513B && Intrinsics.d(this.C, draggableElement.C) && this.D == draggableElement.D && Intrinsics.d(this.E, draggableElement.E) && Intrinsics.d(this.F, draggableElement.F) && this.G == draggableElement.G;
    }

    public int hashCode() {
        int hashCode = ((((this.f3514z.hashCode() * 31) + this.f3512A.hashCode()) * 31) + Boolean.hashCode(this.f3513B)) * 31;
        MutableInteractionSource mutableInteractionSource = this.C;
        return ((((((((hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31) + Boolean.hashCode(this.D)) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + Boolean.hashCode(this.G);
    }
}
