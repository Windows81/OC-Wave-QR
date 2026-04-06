package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDragScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.c4  reason: case insensitive filesystem */
public final /* synthetic */ class C0067c4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f11889A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDragScope f11890z;

    public /* synthetic */ C0067c4(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef) {
        this.f11890z = anchoredDragScope;
        this.f11889A = floatRef;
    }

    public final Object m(Object obj, Object obj2) {
        return ModalWideNavigationRailState$animateTo$2.C(this.f11890z, this.f11889A, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
