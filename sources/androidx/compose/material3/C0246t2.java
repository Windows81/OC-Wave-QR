package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.t2  reason: case insensitive filesystem */
public final /* synthetic */ class C0246t2 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ EnterAlwaysSearchBarScrollBehavior f12706A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12707B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f12708z;

    public /* synthetic */ C0246t2(Ref.FloatRef floatRef, EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, Ref.FloatRef floatRef2) {
        this.f12708z = floatRef;
        this.f12706A = enterAlwaysSearchBarScrollBehavior;
        this.f12707B = floatRef2;
    }

    public final Object invoke(Object obj) {
        return EnterAlwaysSearchBarScrollBehavior.j(this.f12708z, this.f12706A, this.f12707B, (AnimationScope) obj);
    }
}
