package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.n0  reason: case insensitive filesystem */
public final /* synthetic */ class C0190n0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12532A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12533B;
    public final /* synthetic */ Placeable C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Placeable E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12534z;

    public /* synthetic */ C0190n0(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, Placeable placeable3, int i5) {
        this.f12534z = placeable;
        this.f12532A = i2;
        this.f12533B = i3;
        this.C = placeable2;
        this.D = i4;
        this.E = placeable3;
        this.F = i5;
    }

    public final Object invoke(Object obj) {
        return ChipLayoutMeasurePolicy.d(this.f12534z, this.f12532A, this.f12533B, this.C, this.D, this.E, this.F, (Placeable.PlacementScope) obj);
    }
}
