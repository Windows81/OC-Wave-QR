package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.q6  reason: case insensitive filesystem */
public final /* synthetic */ class C0223q6 implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12659z;

    public /* synthetic */ C0223q6(Ref.FloatRef floatRef) {
        this.f12659z = floatRef;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderKt.m(this.f12659z, (PointerInputChange) obj, ((Float) obj2).floatValue());
    }
}
