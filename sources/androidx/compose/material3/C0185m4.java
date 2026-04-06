package androidx.compose.material3;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.m4  reason: case insensitive filesystem */
public final /* synthetic */ class C0185m4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f12526A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f12527B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FloatProducer f12528z;

    public /* synthetic */ C0185m4(FloatProducer floatProducer, float f2, boolean z2) {
        this.f12528z = floatProducer;
        this.f12526A = f2;
        this.f12527B = z2;
    }

    public final Object invoke(Object obj) {
        return NavigationDrawerKt.D(this.f12528z, this.f12526A, this.f12527B, (GraphicsLayerScope) obj);
    }
}
