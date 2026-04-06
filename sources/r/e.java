package r;

import android.view.View;
import com.google.pay.button.PayButtonKt;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f34141z;

    public /* synthetic */ e(Function0 function0) {
        this.f34141z = function0;
    }

    public final void onClick(View view) {
        PayButtonKt.j(this.f34141z, view);
    }
}
