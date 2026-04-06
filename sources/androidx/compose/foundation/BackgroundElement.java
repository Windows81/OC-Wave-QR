package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Brush f2917A;

    /* renamed from: B  reason: collision with root package name */
    public final float f2918B;
    public final Shape C;
    public final Function1 D;

    /* renamed from: z  reason: collision with root package name */
    public final long f2919z;

    public /* synthetic */ BackgroundElement(long j2, Brush brush, float f2, Shape shape, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, brush, f2, shape, function1);
    }

    /* renamed from: c */
    public BackgroundNode a() {
        return new BackgroundNode(this.f2919z, this.f2917A, this.f2918B, this.C, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(BackgroundNode backgroundNode) {
        backgroundNode.f3(this.f2919z);
        backgroundNode.e3(this.f2917A);
        backgroundNode.d(this.f2918B);
        backgroundNode.s1(this.C);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.n(this.f2919z, backgroundElement.f2919z) && Intrinsics.d(this.f2917A, backgroundElement.f2917A) && this.f2918B == backgroundElement.f2918B && Intrinsics.d(this.C, backgroundElement.C);
    }

    public int hashCode() {
        int t2 = Color.t(this.f2919z) * 31;
        Brush brush = this.f2917A;
        return ((((t2 + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.f2918B)) * 31) + this.C.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackgroundElement(long j2, Brush brush, float f2, Shape shape, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.f15975b.f() : j2, (i2 & 2) != 0 ? null : brush, f2, shape, function1, (DefaultConstructorMarker) null);
    }

    public BackgroundElement(long j2, Brush brush, float f2, Shape shape, Function1 function1) {
        this.f2919z = j2;
        this.f2917A = brush;
        this.f2918B = f2;
        this.C = shape;
        this.D = function1;
    }
}
