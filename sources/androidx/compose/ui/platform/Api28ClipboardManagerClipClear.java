package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import kotlin.Metadata;

@Metadata
final class Api28ClipboardManagerClipClear {

    /* renamed from: a  reason: collision with root package name */
    public static final Api28ClipboardManagerClipClear f17656a = new Api28ClipboardManagerClipClear();

    public static final void a(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
