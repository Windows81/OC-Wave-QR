package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class TextRangeLayoutMeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final int f6015a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6016b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f6017c;

    public TextRangeLayoutMeasureResult(int i2, int i3, Function0 function0) {
        this.f6015a = i2;
        this.f6016b = i3;
        this.f6017c = function0;
    }

    public final int a() {
        return this.f6016b;
    }

    public final Function0 b() {
        return this.f6017c;
    }

    public final int c() {
        return this.f6015a;
    }
}
