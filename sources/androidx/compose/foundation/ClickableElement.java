package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ClickableElement extends ModifierNodeElement<ClickableNode> {

    /* renamed from: A  reason: collision with root package name */
    public final IndicationNodeFactory f2998A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f2999B;
    public final String C;
    public final Role D;
    public final Function0 E;

    /* renamed from: z  reason: collision with root package name */
    public final MutableInteractionSource f3000z;

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }

    /* renamed from: c */
    public ClickableNode a() {
        return new ClickableNode(this.f3000z, this.f2998A, this.f2999B, this.C, this.D, this.E, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(ClickableNode clickableNode) {
        clickableNode.E3(this.f3000z, this.f2998A, this.f2999B, this.C, this.D, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.d(this.f3000z, clickableElement.f3000z) && Intrinsics.d(this.f2998A, clickableElement.f2998A) && this.f2999B == clickableElement.f2999B && Intrinsics.d(this.C, clickableElement.C) && Intrinsics.d(this.D, clickableElement.D) && this.E == clickableElement.E;
    }

    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f3000z;
        int i2 = 0;
        int hashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f2998A;
        int hashCode2 = (((hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.f2999B)) * 31;
        String str = this.C;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.D;
        if (role != null) {
            i2 = Role.n(role.p());
        }
        return ((hashCode3 + i2) * 31) + this.E.hashCode();
    }

    public ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0) {
        this.f3000z = mutableInteractionSource;
        this.f2998A = indicationNodeFactory;
        this.f2999B = z2;
        this.C = str;
        this.D = role;
        this.E = function0;
    }
}
