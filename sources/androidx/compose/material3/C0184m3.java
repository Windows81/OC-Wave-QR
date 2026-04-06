package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.m3  reason: case insensitive filesystem */
public final /* synthetic */ class C0184m3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shapes f12523A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Typography f12524B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ColorScheme f12525z;

    public /* synthetic */ C0184m3(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2 function2, int i2, int i3) {
        this.f12525z = colorScheme;
        this.f12523A = shapes;
        this.f12524B = typography;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return MaterialThemeKt.h(this.f12525z, this.f12523A, this.f12524B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
