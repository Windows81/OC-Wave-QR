package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import kotlin.Metadata;

@Metadata
public final class Savers_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Saver f18422a = SaverKt.e(Savers_androidKt$PlatformParagraphStyleSaver$1.f18427z, Savers_androidKt$PlatformParagraphStyleSaver$2.f18428z);

    /* renamed from: b  reason: collision with root package name */
    public static final Saver f18423b = SaverKt.e(Savers_androidKt$LineBreakSaver$1.f18425z, Savers_androidKt$LineBreakSaver$2.f18426z);

    /* renamed from: c  reason: collision with root package name */
    public static final Saver f18424c = SaverKt.e(Savers_androidKt$TextMotionSaver$1.f18429z, Savers_androidKt$TextMotionSaver$2.f18430z);

    public static final Saver a(PlatformParagraphStyle.Companion companion) {
        return f18422a;
    }

    public static final Saver b(LineBreak.Companion companion) {
        return f18423b;
    }

    public static final Saver c(TextMotion.Companion companion) {
        return f18424c;
    }
}
