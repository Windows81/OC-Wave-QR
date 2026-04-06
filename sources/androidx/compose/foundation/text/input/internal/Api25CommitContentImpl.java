package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;

@Metadata
final class Api25CommitContentImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api25CommitContentImpl f6123a = new Api25CommitContentImpl();

    public final boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i2, bundle);
    }
}
