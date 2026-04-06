package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.Retention;

@Metadata
public final class LayoutCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final LayoutCompat f18522a = new LayoutCompat();

    /* renamed from: b  reason: collision with root package name */
    public static final Layout.Alignment f18523b = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: c  reason: collision with root package name */
    public static final TextDirectionHeuristic f18524c = TextDirectionHeuristics.FIRSTSTRONG_LTR;

    /* renamed from: d  reason: collision with root package name */
    public static final int f18525d = 8;

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface BreakStrategy {
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface HyphenationFrequency {
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface JustificationMode {
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface LineBreakStyle {
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface LineBreakWordStyle {
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface TextDirection {
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface TextGranularity {
    }

    @Metadata
    @Retention
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface TextLayoutAlignment {
    }

    public final Layout.Alignment a() {
        return f18523b;
    }

    public final TextDirectionHeuristic b() {
        return f18524c;
    }
}
