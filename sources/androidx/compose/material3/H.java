package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class H implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f10081A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10082B;
    public final /* synthetic */ float C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomSheetDefaults f10083z;

    public /* synthetic */ H(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f2, float f3, Shape shape, long j2, int i2, int i3) {
        this.f10083z = bottomSheetDefaults;
        this.f10081A = modifier;
        this.f10082B = f2;
        this.C = f3;
        this.D = shape;
        this.E = j2;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BottomSheetDefaults.e(this.f10083z, this.f10081A, this.f10082B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
