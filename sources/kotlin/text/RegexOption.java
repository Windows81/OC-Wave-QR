package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum RegexOption implements FlagEnum {
    IGNORE_CASE(2, 0, 2, (int) null),
    MULTILINE(8, 0, 2, (int) null),
    LITERAL(16, 0, 2, (int) null),
    UNIX_LINES(1, 0, 2, (int) null),
    COMMENTS(4, 0, 2, (int) null),
    DOT_MATCHES_ALL(32, 0, 2, (int) null),
    CANON_EQ(128, 0, 2, (int) null);
    

    /* renamed from: A  reason: collision with root package name */
    public final int f41180A;

    /* renamed from: z  reason: collision with root package name */
    public final int f41181z;

    static {
        RegexOption[] f2;
        J = EnumEntriesKt.a(f2);
    }

    /* access modifiers changed from: public */
    RegexOption(int i2, int i3) {
        this.f41181z = i2;
        this.f41180A = i3;
    }

    public int d() {
        return this.f41180A;
    }

    public int getValue() {
        return this.f41181z;
    }
}
