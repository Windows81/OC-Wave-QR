package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.m0  reason: case insensitive filesystem */
public final /* synthetic */ class C0181m0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f12519A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f12520z;

    public /* synthetic */ C0181m0(float f2, Shape shape) {
        this.f12520z = f2;
        this.f12519A = shape;
    }

    public final Object invoke(Object obj) {
        return ChipKt$InputChip$1.e(this.f12520z, this.f12519A, (GraphicsLayerScope) obj);
    }
}
