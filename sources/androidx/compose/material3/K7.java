package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class K7 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f10191A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f10192B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Placeable f10193z;

    public /* synthetic */ K7(Placeable placeable, List list, Placeable placeable2, long j2, float f2, float f3) {
        this.f10193z = placeable;
        this.f10191A = list;
        this.f10192B = placeable2;
        this.C = j2;
        this.D = f2;
        this.E = f3;
    }

    public final Object invoke(Object obj) {
        return TimePickerKt$CircularLayout$1$1.d(this.f10193z, this.f10191A, this.f10192B, this.C, this.D, this.E, (Placeable.PlacementScope) obj);
    }
}
