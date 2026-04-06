package androidx.compose.foundation.internal;

import android.content.ClipData;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

@Metadata
public final class ClipboardUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final ClipboardUtils f3695a = new ClipboardUtils();

    public static final boolean a(ClipEntry clipEntry) {
        if (clipEntry == null) {
            return false;
        }
        return clipEntry.a().getDescription().hasMimeType("text/*");
    }

    public static final AnnotatedString b(ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.a().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return ClipboardUtils_androidKt.a(text);
    }

    public static final String c(ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.a().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public static final ClipEntry d(AnnotatedString annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new ClipEntry(ClipData.newPlainText("plain text", ClipboardUtils_androidKt.b(annotatedString)));
    }
}
