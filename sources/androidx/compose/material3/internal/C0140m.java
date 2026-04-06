package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.internal.m  reason: case insensitive filesystem */
public final /* synthetic */ class C0140m implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12441A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f12442z;

    public /* synthetic */ C0140m(Placeable placeable, int i2) {
        this.f12442z = placeable;
        this.f12441A = i2;
    }

    public final Object invoke(Object obj) {
        return AccessibilityUtilKt.h(this.f12442z, this.f12441A, (Placeable.PlacementScope) obj);
    }
}
