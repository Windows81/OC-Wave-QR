package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class S0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10748A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10749B;
    public final /* synthetic */ int C;
    public final /* synthetic */ FiniteAnimationSpec D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10750z;

    public /* synthetic */ S0(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i2, FiniteAnimationSpec finiteAnimationSpec4) {
        this.f10750z = finiteAnimationSpec;
        this.f10748A = finiteAnimationSpec2;
        this.f10749B = finiteAnimationSpec3;
        this.C = i2;
        this.D = finiteAnimationSpec4;
    }

    public final Object invoke(Object obj) {
        return DatePickerKt.c0(this.f10750z, this.f10748A, this.f10749B, this.C, this.D, (AnimatedContentTransitionScope) obj);
    }
}
