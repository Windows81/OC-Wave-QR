package androidx.compose.ui.platform;

import android.content.ClipData;
import kotlin.Metadata;

@Metadata
public final class ClipEntry {

    /* renamed from: a  reason: collision with root package name */
    public final ClipData f17676a;

    public ClipEntry(ClipData clipData) {
        this.f17676a = clipData;
    }

    public final ClipData a() {
        return this.f17676a;
    }

    public final ClipMetadata b() {
        return AndroidClipboardManager_androidKt.b(this.f17676a.getDescription());
    }
}
