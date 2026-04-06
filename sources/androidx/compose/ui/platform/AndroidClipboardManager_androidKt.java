package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import kotlin.Metadata;

@Metadata
public final class AndroidClipboardManager_androidKt {
    public static final ClipEntry a(ClipData clipData) {
        return new ClipEntry(clipData);
    }

    public static final ClipMetadata b(ClipDescription clipDescription) {
        return new ClipMetadata(clipDescription);
    }
}
