package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata
public final class FareMediaSelectorKt$FareMediaSelectorBottomSheet$1 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37295A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37296B;
    public final /* synthetic */ CoroutineScope C;
    public final /* synthetic */ SheetState D;
    public final /* synthetic */ Function0 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f37297z;

    public FareMediaSelectorKt$FareMediaSelectorBottomSheet$1(ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, CoroutineScope coroutineScope, SheetState sheetState, Function0 function0) {
        this.f37297z = immutableList;
        this.f37295A = immutableList2;
        this.f37296B = function1;
        this.C = coroutineScope;
        this.D = sheetState;
        this.E = function0;
    }

    public static final Unit f(Function1 function1, CoroutineScope coroutineScope, SheetState sheetState, Function0 function0, PaymentMethodState.FareMedia fareMedia) {
        Intrinsics.i(fareMedia, "it");
        function1.invoke(fareMedia);
        BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FareMediaSelectorKt$FareMediaSelectorBottomSheet$1$1$1$1(sheetState, (Continuation) null), 3, (Object) null).S(new l(function0));
        return Unit.f40552a;
    }

    public static final Unit g(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    public final void e(Function0 function0, Composer composer, int i2) {
        Intrinsics.i(function0, "it");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1319045140, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.FareMediaSelectorBottomSheet.<anonymous> (FareMediaSelector.kt:104)");
            }
            ImmutableList immutableList = this.f37297z;
            ImmutableList immutableList2 = this.f37295A;
            composer.X(2035881950);
            boolean W = composer.W(this.f37296B) | composer.l(this.C) | composer.W(this.D) | composer.W(this.E);
            Function1 function1 = this.f37296B;
            CoroutineScope coroutineScope = this.C;
            SheetState sheetState = this.D;
            Function0 function02 = this.E;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new k(function1, coroutineScope, sheetState, function02);
                composer.N(g2);
            }
            composer.M();
            FareMediaSelectorKt.u(immutableList, immutableList2, (Function1) g2, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }
}
