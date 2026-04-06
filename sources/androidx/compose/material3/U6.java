package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class U6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f11703A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f11704B;
    public final /* synthetic */ List C;
    public final /* synthetic */ ScrollableTabData D;
    public final /* synthetic */ MeasureScope E;
    public final /* synthetic */ int F;
    public final /* synthetic */ List G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f11705z;

    public /* synthetic */ U6(Ref.FloatRef floatRef, float f2, List list, List list2, ScrollableTabData scrollableTabData, MeasureScope measureScope, int i2, List list3, int i3, int i4) {
        this.f11705z = floatRef;
        this.f11703A = f2;
        this.f11704B = list;
        this.C = list2;
        this.D = scrollableTabData;
        this.E = measureScope;
        this.F = i2;
        this.G = list3;
        this.H = i3;
        this.I = i4;
    }

    public final Object invoke(Object obj) {
        return TabRowKt$ScrollableTabRowImpl$1$1$2$1.d(this.f11705z, this.f11703A, this.f11704B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Placeable.PlacementScope) obj);
    }
}
