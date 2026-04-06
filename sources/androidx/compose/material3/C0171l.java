package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0171l implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TopAppBarState f12494A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12495B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12496z;

    public /* synthetic */ C0171l(Ref.FloatRef floatRef, TopAppBarState topAppBarState, Ref.FloatRef floatRef2) {
        this.f12496z = floatRef;
        this.f12494A = topAppBarState;
        this.f12495B = floatRef2;
    }

    public final Object invoke(Object obj) {
        return AppBarKt.Q(this.f12496z, this.f12494A, this.f12495B, (AnimationScope) obj);
    }
}
