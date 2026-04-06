package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0092f implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MeasureScope f12024A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12025B;
    public final /* synthetic */ int C;
    public final /* synthetic */ List D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f12026z;

    public /* synthetic */ C0092f(List list, MeasureScope measureScope, float f2, int i2, List list2) {
        this.f12026z = list;
        this.f12024A = measureScope;
        this.f12025B = f2;
        this.C = i2;
        this.D = list2;
    }

    public final Object invoke(Object obj) {
        return AlertDialogKt$AlertDialogFlowRow$1$1.e(this.f12026z, this.f12024A, this.f12025B, this.C, this.D, (Placeable.PlacementScope) obj);
    }
}
