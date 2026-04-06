package androidx.compose.ui.text;

import android.graphics.RectF;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidParagraph$getRangeForRect$range$1 extends Lambda implements Function2<RectF, RectF, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextInclusionStrategy f18219z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$getRangeForRect$range$1(TextInclusionStrategy textInclusionStrategy) {
        super(2);
        this.f18219z = textInclusionStrategy;
    }

    /* renamed from: b */
    public final Boolean m(RectF rectF, RectF rectF2) {
        return Boolean.valueOf(this.f18219z.a(RectHelper_androidKt.f(rectF), RectHelper_androidKt.f(rectF2)));
    }
}
