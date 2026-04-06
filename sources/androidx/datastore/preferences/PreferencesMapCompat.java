package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PreferencesMapCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f20694a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PreferencesProto.PreferenceMap a(InputStream inputStream) {
            Intrinsics.i(inputStream, "input");
            try {
                PreferencesProto.PreferenceMap e0 = PreferencesProto.PreferenceMap.e0(inputStream);
                Intrinsics.h(e0, "{\n                Prefer…From(input)\n            }");
                return e0;
            } catch (InvalidProtocolBufferException e2) {
                throw new CorruptionException("Unable to parse preferences proto.", e2);
            }
        }

        public Companion() {
        }
    }
}
