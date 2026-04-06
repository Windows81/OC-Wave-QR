package androidx.compose.material3;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.i4  reason: case insensitive filesystem */
public final /* synthetic */ class C0124i4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f12085A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f12086B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FloatProducer f12087z;

    public /* synthetic */ C0124i4(FloatProducer floatProducer, float f2, boolean z2) {
        this.f12087z = floatProducer;
        this.f12085A = f2;
        this.f12086B = z2;
    }

    public final Object invoke(Object obj) {
        return NavigationDrawerKt.B(this.f12087z, this.f12085A, this.f12086B, (GraphicsLayerScope) obj);
    }
}
