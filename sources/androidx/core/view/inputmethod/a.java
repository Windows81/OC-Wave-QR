package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;

public final /* synthetic */ class a implements InputConnectionCompat.OnCommitContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f20428a;

    public /* synthetic */ a(View view) {
        this.f20428a = view;
    }

    public final boolean a(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
        return InputConnectionCompat.f(this.f20428a, inputContentInfoCompat, i2, bundle);
    }
}
