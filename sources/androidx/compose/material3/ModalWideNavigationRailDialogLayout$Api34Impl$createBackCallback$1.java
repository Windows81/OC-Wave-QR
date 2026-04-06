package androidx.compose.material3;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ModalWideNavigationRailDialogLayout$Api34Impl$createBackCallback$1 implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RailPredictiveBackState f10345a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f10346b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function1 f10347c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function0 f10348d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function0 f10349e;

    public ModalWideNavigationRailDialogLayout$Api34Impl$createBackCallback$1(RailPredictiveBackState railPredictiveBackState, LayoutDirection layoutDirection, Function1 function1, Function0 function0, Function0 function02) {
        this.f10345a = railPredictiveBackState;
        this.f10346b = layoutDirection;
        this.f10347c = function1;
        this.f10348d = function0;
        this.f10349e = function02;
    }

    public void onBackCancelled() {
        this.f10349e.invoke();
    }

    public void onBackInvoked() {
        this.f10348d.invoke();
    }

    public void onBackProgressed(BackEvent backEvent) {
        RailPredictiveBackState railPredictiveBackState = this.f10345a;
        boolean z2 = false;
        boolean z3 = backEvent.getSwipeEdge() == 0;
        if (this.f10346b == LayoutDirection.Rtl) {
            z2 = true;
        }
        railPredictiveBackState.c(z3, z2);
        this.f10347c.invoke(Float.valueOf(PredictiveBack.f12315a.a(backEvent.getProgress())));
    }

    public void onBackStarted(BackEvent backEvent) {
        RailPredictiveBackState railPredictiveBackState = this.f10345a;
        boolean z2 = false;
        boolean z3 = backEvent.getSwipeEdge() == 0;
        if (this.f10346b == LayoutDirection.Rtl) {
            z2 = true;
        }
        railPredictiveBackState.c(z3, z2);
        this.f10347c.invoke(Float.valueOf(PredictiveBack.f12315a.a(backEvent.getProgress())));
    }
}
