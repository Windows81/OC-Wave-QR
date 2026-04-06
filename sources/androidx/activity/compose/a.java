package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.compose.runtime.State;

public final /* synthetic */ class a implements ActivityResultCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ State f192a;

    public /* synthetic */ a(State state) {
        this.f192a = state;
    }

    public final void a(Object obj) {
        ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1.e(this.f192a, obj);
    }
}
