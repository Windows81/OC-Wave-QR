package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum WriteMode {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    

    /* renamed from: A  reason: collision with root package name */
    public final char f42459A;

    /* renamed from: z  reason: collision with root package name */
    public final char f42460z;

    static {
        WriteMode[] d2;
        G = EnumEntriesKt.a(d2);
    }

    /* access modifiers changed from: public */
    WriteMode(char c2, char c3) {
        this.f42460z = c2;
        this.f42459A = c3;
    }

    public static EnumEntries f() {
        return G;
    }
}
