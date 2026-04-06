package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f3096A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f3097B;
    public final float C;
    public final boolean D;
    public final long E;
    public final float F;
    public final float G;
    public final boolean H;
    public final PlatformMagnifierFactory I;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3098z;

    public /* synthetic */ MagnifierElement(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f2, z2, j2, f3, f4, z3, platformMagnifierFactory);
    }

    /* renamed from: c */
    public MagnifierNode a() {
        return new MagnifierNode(this.f3098z, this.f3096A, this.f3097B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(MagnifierNode magnifierNode) {
        magnifierNode.h3(this.f3098z, this.f3096A, this.C, this.D, this.E, this.F, this.G, this.H, this.f3097B, this.I);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f3098z == magnifierElement.f3098z && this.f3096A == magnifierElement.f3096A && this.C == magnifierElement.C && this.D == magnifierElement.D && DpSize.h(this.E, magnifierElement.E) && Dp.o(this.F, magnifierElement.F) && Dp.o(this.G, magnifierElement.G) && this.H == magnifierElement.H && this.f3097B == magnifierElement.f3097B && Intrinsics.d(this.I, magnifierElement.I);
    }

    public int hashCode() {
        int hashCode = this.f3098z.hashCode() * 31;
        Function1 function1 = this.f3096A;
        int i2 = 0;
        int hashCode2 = (((((((((((((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + Float.hashCode(this.C)) * 31) + Boolean.hashCode(this.D)) * 31) + DpSize.k(this.E)) * 31) + Dp.p(this.F)) * 31) + Dp.p(this.G)) * 31) + Boolean.hashCode(this.H)) * 31;
        Function1 function12 = this.f3097B;
        if (function12 != null) {
            i2 = function12.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.I.hashCode();
    }

    public MagnifierElement(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        this.f3098z = function1;
        this.f3096A = function12;
        this.f3097B = function13;
        this.C = f2;
        this.D = z2;
        this.E = j2;
        this.F = f3;
        this.G = f4;
        this.H = z3;
        this.I = platformMagnifierFactory;
    }
}
