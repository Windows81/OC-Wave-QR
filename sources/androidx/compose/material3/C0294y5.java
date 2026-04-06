package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.y5  reason: case insensitive filesystem */
public final /* synthetic */ class C0294y5 implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f14494A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Density f14495B;
    public final /* synthetic */ SearchBarState C;
    public final /* synthetic */ MutableState D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Shape f14496z;

    public /* synthetic */ C0294y5(Shape shape, Shape shape2, Density density, SearchBarState searchBarState, MutableState mutableState) {
        this.f14496z = shape;
        this.f14494A = shape2;
        this.f14495B = density;
        this.C = searchBarState;
        this.D = mutableState;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return SearchBarKt.m(this.f14496z, this.f14494A, this.f14495B, this.C, this.D, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
    }
}
