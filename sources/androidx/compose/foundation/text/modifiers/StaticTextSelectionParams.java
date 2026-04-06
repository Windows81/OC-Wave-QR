package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public class StaticTextSelectionParams {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f6668c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f6669d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final StaticTextSelectionParams f6670e = new StaticTextSelectionParams((LayoutCoordinates) null, (TextLayoutResult) null);

    /* renamed from: a  reason: collision with root package name */
    public final LayoutCoordinates f6671a;

    /* renamed from: b  reason: collision with root package name */
    public final TextLayoutResult f6672b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StaticTextSelectionParams a() {
            return StaticTextSelectionParams.f6670e;
        }

        public Companion() {
        }
    }

    public StaticTextSelectionParams(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.f6671a = layoutCoordinates;
        this.f6672b = textLayoutResult;
    }

    public static /* synthetic */ StaticTextSelectionParams c(StaticTextSelectionParams staticTextSelectionParams, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                layoutCoordinates = staticTextSelectionParams.f6671a;
            }
            if ((i2 & 2) != 0) {
                textLayoutResult = staticTextSelectionParams.f6672b;
            }
            return staticTextSelectionParams.b(layoutCoordinates, textLayoutResult);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final StaticTextSelectionParams b(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }

    public final LayoutCoordinates d() {
        return this.f6671a;
    }

    public Path e(int i2, int i3) {
        TextLayoutResult textLayoutResult = this.f6672b;
        if (textLayoutResult != null) {
            return textLayoutResult.z(i2, i3);
        }
        return null;
    }

    public boolean f() {
        TextLayoutResult textLayoutResult = this.f6672b;
        return textLayoutResult != null && !TextOverflow.h(textLayoutResult.l().f(), TextOverflow.f19125b.e()) && textLayoutResult.i();
    }

    public final TextLayoutResult g() {
        return this.f6672b;
    }
}
