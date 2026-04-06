package androidx.activity;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final /* synthetic */ class e implements OnContextAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f200a;

    public /* synthetic */ e(ComponentActivity componentActivity) {
        this.f200a = componentActivity;
    }

    public final void a(Context context) {
        ComponentActivity.L(this.f200a, context);
    }
}
