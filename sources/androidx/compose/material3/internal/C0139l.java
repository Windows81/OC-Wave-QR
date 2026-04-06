package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.internal.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0139l implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12439A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12440z;

    public /* synthetic */ C0139l(Placeable placeable, int i2) {
        this.f12440z = placeable;
        this.f12439A = i2;
    }

    public final Object invoke(Object obj) {
        return AccessibilityUtilKt.k(this.f12440z, this.f12439A, (Placeable.PlacementScope) obj);
    }
}
