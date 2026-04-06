package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;

@Metadata
public final class SavedStateEncoderKt {
    public static final Bundle a(SerializationStrategy serializationStrategy, Object obj, SavedStateConfiguration savedStateConfiguration) {
        Pair[] pairArr;
        Intrinsics.i(serializationStrategy, "serializer");
        Intrinsics.i(obj, "value");
        Intrinsics.i(savedStateConfiguration, "configuration");
        Map h2 = MapsKt.h();
        if (h2.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(h2.size());
            for (Map.Entry entry : h2.entrySet()) {
                arrayList.add(TuplesKt.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a2 = BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.a(a2);
        new SavedStateEncoder(a2, savedStateConfiguration).e(serializationStrategy, obj);
        return a2;
    }
}
