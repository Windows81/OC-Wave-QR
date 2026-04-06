package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextIndent {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f19111c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final TextIndent f19112d = new TextIndent(0, 0, 3, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f19113a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19114b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextIndent a() {
            return TextIndent.f19112d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextIndent(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public final long b() {
        return this.f19113a;
    }

    public final long c() {
        return this.f19114b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.e(this.f19113a, textIndent.f19113a) && TextUnit.e(this.f19114b, textIndent.f19114b);
    }

    public int hashCode() {
        return (TextUnit.i(this.f19113a) * 31) + TextUnit.i(this.f19114b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + TextUnit.l(this.f19113a) + ", restLine=" + TextUnit.l(this.f19114b) + ')';
    }

    public TextIndent(long j2, long j3) {
        this.f19113a = j2;
        this.f19114b = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextIndent(long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TextUnitKt.i(0) : j2, (i2 & 2) != 0 ? TextUnitKt.i(0) : j3, (DefaultConstructorMarker) null);
    }
}
