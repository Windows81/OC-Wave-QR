package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StatelessInputConnection$commitContentDelegateInputConnection$1 implements InputConnectionCompat.OnCommitContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StatelessInputConnection f6285a;

    public StatelessInputConnection$commitContentDelegateInputConnection$1(StatelessInputConnection statelessInputConnection) {
        this.f6285a = statelessInputConnection;
    }

    public boolean a(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
        if ((i2 & 1) != 0) {
            try {
                inputContentInfoCompat.d();
                Object e2 = inputContentInfoCompat.e();
                Intrinsics.g(e2, "null cannot be cast to non-null type android.os.Parcelable");
                Parcelable parcelable = (Parcelable) e2;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e3) {
                StatelessInputConnection statelessInputConnection = this.f6285a;
                statelessInputConnection.g("Can't insert content from IME; requestPermission() failed, " + e3);
                return false;
            }
        }
        return this.f6285a.f6280a.d(StatelessInputConnection_androidKt.h(inputContentInfoCompat, bundle));
    }
}
