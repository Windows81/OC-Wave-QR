package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.r7  reason: case insensitive filesystem */
public final /* synthetic */ class C0233r7 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ThumbNode f12679A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12680B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12681z;

    public /* synthetic */ C0233r7(Placeable placeable, ThumbNode thumbNode, float f2) {
        this.f12681z = placeable;
        this.f12679A = thumbNode;
        this.f12680B = f2;
    }

    public final Object invoke(Object obj) {
        return ThumbNode.h3(this.f12681z, this.f12679A, this.f12680B, (Placeable.PlacementScope) obj);
    }
}
