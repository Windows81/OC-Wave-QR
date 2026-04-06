package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0234s implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BottomAppBarState f12683A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12684B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12685z;

    public /* synthetic */ C0234s(Ref.FloatRef floatRef, BottomAppBarState bottomAppBarState, Ref.FloatRef floatRef2) {
        this.f12685z = floatRef;
        this.f12683A = bottomAppBarState;
        this.f12684B = floatRef2;
    }

    public final Object invoke(Object obj) {
        return AppBarKt.T(this.f12685z, this.f12683A, this.f12684B, (AnimationScope) obj);
    }
}
