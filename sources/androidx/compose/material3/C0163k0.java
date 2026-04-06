package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.k0  reason: case insensitive filesystem */
public final /* synthetic */ class C0163k0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12484A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12485B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ PaddingValues I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f12486z;

    public /* synthetic */ C0163k0(Function2 function2, TextStyle textStyle, long j2, Function2 function22, Function2 function23, Function2 function24, long j3, long j4, float f2, PaddingValues paddingValues, int i2) {
        this.f12486z = function2;
        this.f12484A = textStyle;
        this.f12485B = j2;
        this.C = function22;
        this.D = function23;
        this.E = function24;
        this.F = j3;
        this.G = j4;
        this.H = f2;
        this.I = paddingValues;
        this.J = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ChipKt.d(this.f12486z, this.f12484A, this.f12485B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
