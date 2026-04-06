package z;

import android.view.View;
import android.view.Window;
import androidx.compose.runtime.DisposableEffectScope;
import com.hansecom.abt.ui.effects.StatusBarColorEffectKt;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ View f44363A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f44364B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Window f44365z;

    public /* synthetic */ i(Window window, View view, boolean z2) {
        this.f44365z = window;
        this.f44363A = view;
        this.f44364B = z2;
    }

    public final Object invoke(Object obj) {
        return StatusBarColorEffectKt.h(this.f44365z, this.f44363A, this.f44364B, (DisposableEffectScope) obj);
    }
}
