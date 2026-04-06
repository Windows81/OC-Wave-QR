package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final float f16655A;

    /* renamed from: B  reason: collision with root package name */
    public final float f16656B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final List H;
    public final List I;

    /* renamed from: z  reason: collision with root package name */
    public final String f16657z;

    public VectorGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, List list2) {
        super((DefaultConstructorMarker) null);
        this.f16657z = str;
        this.f16655A = f2;
        this.f16656B = f3;
        this.C = f4;
        this.D = f5;
        this.E = f6;
        this.F = f7;
        this.G = f8;
        this.H = list;
        this.I = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return Intrinsics.d(this.f16657z, vectorGroup.f16657z) && this.f16655A == vectorGroup.f16655A && this.f16656B == vectorGroup.f16656B && this.C == vectorGroup.C && this.D == vectorGroup.D && this.E == vectorGroup.E && this.F == vectorGroup.F && this.G == vectorGroup.G && Intrinsics.d(this.H, vectorGroup.H) && Intrinsics.d(this.I, vectorGroup.I);
        }
        return false;
    }

    public final VectorNode g(int i2) {
        return (VectorNode) this.I.get(i2);
    }

    public final List h() {
        return this.H;
    }

    public int hashCode() {
        return (((((((((((((((((this.f16657z.hashCode() * 31) + Float.hashCode(this.f16655A)) * 31) + Float.hashCode(this.f16656B)) * 31) + Float.hashCode(this.C)) * 31) + Float.hashCode(this.D)) * 31) + Float.hashCode(this.E)) * 31) + Float.hashCode(this.F)) * 31) + Float.hashCode(this.G)) * 31) + this.H.hashCode()) * 31) + this.I.hashCode();
    }

    public final String i() {
        return this.f16657z;
    }

    public Iterator iterator() {
        return new VectorGroup$iterator$1(this);
    }

    public final float m() {
        return this.f16656B;
    }

    public final float n() {
        return this.C;
    }

    public final float o() {
        return this.f16655A;
    }

    public final float p() {
        return this.D;
    }

    public final float q() {
        return this.E;
    }

    public final int s() {
        return this.I.size();
    }

    public final float u() {
        return this.F;
    }

    public final float v() {
        return this.G;
    }
}
