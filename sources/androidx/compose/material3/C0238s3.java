package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.s3  reason: case insensitive filesystem */
public final /* synthetic */ class C0238s3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f12689A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12690B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f12691z;

    public /* synthetic */ C0238s3(int i2, Placeable placeable, int i3) {
        this.f12691z = i2;
        this.f12689A = placeable;
        this.f12690B = i3;
    }

    public final Object invoke(Object obj) {
        return MinimumInteractiveModifierNode.b3(this.f12691z, this.f12689A, this.f12690B, (Placeable.PlacementScope) obj);
    }
}
