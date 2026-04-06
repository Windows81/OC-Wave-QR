package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.s6  reason: case insensitive filesystem */
public final /* synthetic */ class C0241s6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12694A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12695B;
    public final /* synthetic */ Placeable C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Ref.IntRef E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12696z;

    public /* synthetic */ C0241s6(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, Ref.IntRef intRef) {
        this.f12696z = placeable;
        this.f12694A = i2;
        this.f12695B = i3;
        this.C = placeable2;
        this.D = i4;
        this.E = intRef;
    }

    public final Object invoke(Object obj) {
        return SliderKt$SliderImpl$2$1.d(this.f12696z, this.f12694A, this.f12695B, this.C, this.D, this.E, (Placeable.PlacementScope) obj);
    }
}
