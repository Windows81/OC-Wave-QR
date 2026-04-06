package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MutablePreferences$toString$1 extends Lambda implements Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence> {

    /* renamed from: z  reason: collision with root package name */
    public static final MutablePreferences$toString$1 f20704z = new MutablePreferences$toString$1();

    public MutablePreferences$toString$1() {
        super(1);
    }

    /* renamed from: b */
    public final CharSequence invoke(Map.Entry entry) {
        Intrinsics.i(entry, "entry");
        Object value = entry.getValue();
        String B0 = value instanceof byte[] ? ArraysKt.B0((byte[]) value, ", ", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null) : String.valueOf(entry.getValue());
        return "  " + ((Preferences.Key) entry.getKey()).a() + " = " + B0;
    }
}
