package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class R6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f10688A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10689B;
    public final /* synthetic */ float C;
    public final /* synthetic */ long D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TabRowDefaults f10690z;

    public /* synthetic */ R6(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, float f3, long j2, Shape shape, int i2, int i3) {
        this.f10690z = tabRowDefaults;
        this.f10688A = modifier;
        this.f10689B = f2;
        this.C = f3;
        this.D = j2;
        this.E = shape;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return TabRowDefaults.d(this.f10690z, this.f10688A, this.f10689B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
