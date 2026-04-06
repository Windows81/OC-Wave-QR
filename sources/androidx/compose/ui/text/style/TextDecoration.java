package androidx.compose.ui.text.style;

import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextDecoration {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19089b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final TextDecoration f19090c = new TextDecoration(0);

    /* renamed from: d  reason: collision with root package name */
    public static final TextDecoration f19091d = new TextDecoration(1);

    /* renamed from: e  reason: collision with root package name */
    public static final TextDecoration f19092e = new TextDecoration(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f19093a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextDecoration a(List list) {
            Integer num = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                num = Integer.valueOf(num.intValue() | ((TextDecoration) list.get(i2)).e());
            }
            return new TextDecoration(num.intValue());
        }

        public final TextDecoration b() {
            return TextDecoration.f19092e;
        }

        public final TextDecoration c() {
            return TextDecoration.f19090c;
        }

        public final TextDecoration d() {
            return TextDecoration.f19091d;
        }

        public Companion() {
        }
    }

    public TextDecoration(int i2) {
        this.f19093a = i2;
    }

    public final boolean d(TextDecoration textDecoration) {
        int i2 = this.f19093a;
        return (textDecoration.f19093a | i2) == i2;
    }

    public final int e() {
        return this.f19093a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextDecoration) && this.f19093a == ((TextDecoration) obj).f19093a;
    }

    public int hashCode() {
        return this.f19093a;
    }

    public String toString() {
        if (this.f19093a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f19093a & f19091d.f19093a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f19093a & f19092e.f19093a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + ListUtilsKt.e(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ']';
    }
}
