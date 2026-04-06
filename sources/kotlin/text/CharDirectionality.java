package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f41114A = null;

    /* renamed from: B  reason: collision with root package name */
    public static final Lazy f41115B = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f41116z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        CharDirectionality[] f2;
        X = EnumEntriesKt.a(f2);
        f41114A = new Companion((DefaultConstructorMarker) null);
        f41115B = LazyKt.b(new a());
    }

    /* access modifiers changed from: public */
    CharDirectionality(int i2) {
        this.f41116z = i2;
    }

    public static final Map h() {
        EnumEntries j2 = j();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.e(MapsKt.e(CollectionsKt.x(j2, 10)), 16));
        for (Object next : j2) {
            linkedHashMap.put(Integer.valueOf(((CharDirectionality) next).f41116z), next);
        }
        return linkedHashMap;
    }

    public static EnumEntries j() {
        return X;
    }
}
