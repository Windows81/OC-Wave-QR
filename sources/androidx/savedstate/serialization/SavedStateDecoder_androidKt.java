package androidx.savedstate.serialization;

import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class SavedStateDecoder_androidKt {
    public static final Object a(SavedStateDecoder savedStateDecoder, DeserializationStrategy deserializationStrategy) {
        Intrinsics.i(savedStateDecoder, "<this>");
        Intrinsics.i(deserializationStrategy, "strategy");
        SerialDescriptor a2 = deserializationStrategy.a();
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.g())) {
            return CharSequenceSerializer.f22901a.c(savedStateDecoder);
        }
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.l())) {
            return DefaultParcelableSerializer.f22904b.c(savedStateDecoder);
        }
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.j())) {
            return DefaultJavaSerializableSerializer.f22903b.c(savedStateDecoder);
        }
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.i())) {
            return IBinderSerializer.f22905a.c(savedStateDecoder);
        }
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.a()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.f())) {
            return CharSequenceArraySerializer.f22897a.c(savedStateDecoder);
        }
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.b()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.h())) {
            return CharSequenceListSerializer.f22899a.c(savedStateDecoder);
        }
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.d())) {
            Parcelable[] f2 = ParcelableArraySerializer.f22910a.c(savedStateDecoder);
            return Arrays.copyOf(f2, f2.length, JvmClassMappingKt.a(b(deserializationStrategy)));
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.k())) {
            return ParcelableArraySerializer.f22910a.c(savedStateDecoder);
        } else {
            if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.e()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.m())) {
                return ParcelableListSerializer.f22912a.c(savedStateDecoder);
            }
            if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.o()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.n()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.c())) {
                return SparseParcelableArraySerializer.f22928a.c(savedStateDecoder);
            }
            return null;
        }
    }

    public static final KClass b(DeserializationStrategy deserializationStrategy) {
        Object c2 = deserializationStrategy.c(EmptyArrayDecoder.f22849a);
        Intrinsics.f(c2);
        return Reflection.b(c2.getClass());
    }
}
