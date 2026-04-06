package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class P2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f10602A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f10603B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ View f10604z;

    public /* synthetic */ P2(View view, Density density, Function0 function0, int i2) {
        this.f10604z = view;
        this.f10602A = density;
        this.f10603B = function0;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ExposedDropdownMenu_androidKt.h(this.f10604z, this.f10602A, this.f10603B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
