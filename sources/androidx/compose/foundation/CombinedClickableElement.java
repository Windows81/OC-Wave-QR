package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {

    /* renamed from: A  reason: collision with root package name */
    public final IndicationNodeFactory f3034A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f3035B;
    public final String C;
    public final Role D;
    public final Function0 E;
    public final String F;
    public final Function0 G;
    public final Function0 H;
    public final boolean I;

    /* renamed from: z  reason: collision with root package name */
    public final MutableInteractionSource f3036z;

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0, str2, function02, function03, z3);
    }

    /* renamed from: c */
    public CombinedClickableNode a() {
        return new CombinedClickableNode(this.E, this.F, this.G, this.H, this.I, this.f3036z, this.f3034A, this.f3035B, this.C, this.D, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(CombinedClickableNode combinedClickableNode) {
        combinedClickableNode.I3(this.I);
        combinedClickableNode.J3(this.E, this.F, this.G, this.H, this.f3036z, this.f3034A, this.f3035B, this.C, this.D);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.d(this.f3036z, combinedClickableElement.f3036z) && Intrinsics.d(this.f3034A, combinedClickableElement.f3034A) && this.f3035B == combinedClickableElement.f3035B && Intrinsics.d(this.C, combinedClickableElement.C) && Intrinsics.d(this.D, combinedClickableElement.D) && this.E == combinedClickableElement.E && Intrinsics.d(this.F, combinedClickableElement.F) && this.G == combinedClickableElement.G && this.H == combinedClickableElement.H && this.I == combinedClickableElement.I;
    }

    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f3036z;
        int i2 = 0;
        int hashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f3034A;
        int hashCode2 = (((hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.f3035B)) * 31;
        String str = this.C;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.D;
        int n2 = (((hashCode3 + (role != null ? Role.n(role.p()) : 0)) * 31) + this.E.hashCode()) * 31;
        String str2 = this.F;
        int hashCode4 = (n2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0 function0 = this.G;
        int hashCode5 = (hashCode4 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0 function02 = this.H;
        if (function02 != null) {
            i2 = function02.hashCode();
        }
        return ((hashCode5 + i2) * 31) + Boolean.hashCode(this.I);
    }

    public CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, boolean z3) {
        this.f3036z = mutableInteractionSource;
        this.f3034A = indicationNodeFactory;
        this.f3035B = z2;
        this.C = str;
        this.D = role;
        this.E = function0;
        this.F = str2;
        this.G = function02;
        this.H = function03;
        this.I = z3;
    }
}
