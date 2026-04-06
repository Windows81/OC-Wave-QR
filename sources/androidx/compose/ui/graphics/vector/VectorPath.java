package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VectorPath extends VectorNode {

    /* renamed from: A  reason: collision with root package name */
    public final List f16675A;

    /* renamed from: B  reason: collision with root package name */
    public final int f16676B;
    public final Brush C;
    public final float D;
    public final Brush E;
    public final float F;
    public final float G;
    public final int H;
    public final int I;
    public final float J;
    public final float K;
    public final float L;
    public final float M;

    /* renamed from: z  reason: collision with root package name */
    public final String f16677z;

    public /* synthetic */ VectorPath(String str, List list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8);
    }

    public final Brush e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            return Intrinsics.d(this.f16677z, vectorPath.f16677z) && Intrinsics.d(this.C, vectorPath.C) && this.D == vectorPath.D && Intrinsics.d(this.E, vectorPath.E) && this.F == vectorPath.F && this.G == vectorPath.G && StrokeCap.g(this.H, vectorPath.H) && StrokeJoin.g(this.I, vectorPath.I) && this.J == vectorPath.J && this.K == vectorPath.K && this.L == vectorPath.L && this.M == vectorPath.M && PathFillType.f(this.f16676B, vectorPath.f16676B) && Intrinsics.d(this.f16675A, vectorPath.f16675A);
        }
        return false;
    }

    public final float g() {
        return this.D;
    }

    public final String h() {
        return this.f16677z;
    }

    public int hashCode() {
        int hashCode = ((this.f16677z.hashCode() * 31) + this.f16675A.hashCode()) * 31;
        Brush brush = this.C;
        int i2 = 0;
        int hashCode2 = (((hashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.D)) * 31;
        Brush brush2 = this.E;
        if (brush2 != null) {
            i2 = brush2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i2) * 31) + Float.hashCode(this.F)) * 31) + Float.hashCode(this.G)) * 31) + StrokeCap.h(this.H)) * 31) + StrokeJoin.h(this.I)) * 31) + Float.hashCode(this.J)) * 31) + Float.hashCode(this.K)) * 31) + Float.hashCode(this.L)) * 31) + Float.hashCode(this.M)) * 31) + PathFillType.g(this.f16676B);
    }

    public final List i() {
        return this.f16675A;
    }

    public final int m() {
        return this.f16676B;
    }

    public final Brush n() {
        return this.E;
    }

    public final float o() {
        return this.F;
    }

    public final int p() {
        return this.H;
    }

    public final int q() {
        return this.I;
    }

    public final float s() {
        return this.J;
    }

    public final float u() {
        return this.G;
    }

    public final float v() {
        return this.L;
    }

    public final float w() {
        return this.M;
    }

    public final float z() {
        return this.K;
    }

    public VectorPath(String str, List list, int i2, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
        super((DefaultConstructorMarker) null);
        this.f16677z = str;
        this.f16675A = list;
        this.f16676B = i2;
        this.C = brush;
        this.D = f2;
        this.E = brush2;
        this.F = f3;
        this.G = f4;
        this.H = i3;
        this.I = i4;
        this.J = f5;
        this.K = f6;
        this.L = f7;
        this.M = f8;
    }
}
