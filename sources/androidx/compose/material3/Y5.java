package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDragScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class Y5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f11819A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnchoredDragScope f11820z;

    public /* synthetic */ Y5(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef) {
        this.f11820z = anchoredDragScope;
        this.f11819A = floatRef;
    }

    public final Object m(Object obj, Object obj2) {
        return SheetState$animateTo$2.C(this.f11820z, this.f11819A, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
