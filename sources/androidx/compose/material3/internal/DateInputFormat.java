package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class DateInputFormat {

    /* renamed from: a  reason: collision with root package name */
    public final String f12209a;

    /* renamed from: b  reason: collision with root package name */
    public final char f12210b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12211c;

    public DateInputFormat(String str, char c2) {
        this.f12209a = str;
        this.f12210b = c2;
        this.f12211c = StringsKt.K(str, String.valueOf(c2), "", false, 4, (Object) null);
    }

    public final char a() {
        return this.f12210b;
    }

    public final String b() {
        return this.f12209a;
    }

    public final String c() {
        return this.f12211c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return Intrinsics.d(this.f12209a, dateInputFormat.f12209a) && this.f12210b == dateInputFormat.f12210b;
    }

    public int hashCode() {
        return (this.f12209a.hashCode() * 31) + Character.hashCode(this.f12210b);
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f12209a + ", delimiter=" + this.f12210b + ')';
    }
}
