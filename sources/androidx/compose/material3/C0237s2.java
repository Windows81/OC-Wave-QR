package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.s2  reason: case insensitive filesystem */
public final /* synthetic */ class C0237s2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12687A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDragScope f12688z;

    public /* synthetic */ C0237s2(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef) {
        this.f12688z = anchoredDragScope;
        this.f12687A = floatRef;
    }

    public final Object m(Object obj, Object obj2) {
        return DrawerState$animateTo$3.C(this.f12688z, this.f12687A, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
