package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1 implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f95a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f96b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function0 f97c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Function0 f98d;

    public OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.f95a = function1;
        this.f96b = function12;
        this.f97c = function0;
        this.f98d = function02;
    }

    public void onBackCancelled() {
        this.f98d.invoke();
    }

    public void onBackInvoked() {
        this.f97c.invoke();
    }

    public void onBackProgressed(BackEvent backEvent) {
        Intrinsics.i(backEvent, "backEvent");
        this.f96b.invoke(new BackEventCompat(backEvent));
    }

    public void onBackStarted(BackEvent backEvent) {
        Intrinsics.i(backEvent, "backEvent");
        this.f95a.invoke(new BackEventCompat(backEvent));
    }
}
