package androidx.compose.ui.contentcapture;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
enum ContentCaptureEventType {
    VIEW_APPEAR,
    VIEW_DISAPPEAR;

    static {
        ContentCaptureEventType[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
