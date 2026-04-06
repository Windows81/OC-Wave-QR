package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.e5  reason: case insensitive filesystem */
public final /* synthetic */ class C0088e5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12014A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12015B;
    public final /* synthetic */ float C;
    public final /* synthetic */ long D;
    public final /* synthetic */ Stroke E;
    public final /* synthetic */ long F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f12016z;

    public /* synthetic */ C0088e5(Function0 function0, int i2, float f2, float f3, long j2, Stroke stroke, long j3) {
        this.f12016z = function0;
        this.f12014A = i2;
        this.f12015B = f2;
        this.C = f3;
        this.D = j2;
        this.E = stroke;
        this.F = j3;
    }

    public final Object invoke(Object obj) {
        return ProgressIndicatorKt.t(this.f12016z, this.f12014A, this.f12015B, this.C, this.D, this.E, this.F, (DrawScope) obj);
    }
}
