package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class SavedStateEncoder_androidKt {
    public static final boolean a(SavedStateEncoder savedStateEncoder, SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(savedStateEncoder, "<this>");
        Intrinsics.i(serializationStrategy, "strategy");
        SerialDescriptor a2 = serializationStrategy.a();
        if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.g())) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.f22901a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            charSequenceSerializer.d(savedStateEncoder, (CharSequence) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.l())) {
            DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.f22904b;
            Intrinsics.g(obj, "null cannot be cast to non-null type android.os.Parcelable");
            defaultParcelableSerializer.d(savedStateEncoder, (Parcelable) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.j())) {
            DefaultJavaSerializableSerializer defaultJavaSerializableSerializer = DefaultJavaSerializableSerializer.f22903b;
            Intrinsics.g(obj, "null cannot be cast to non-null type java.io.Serializable");
            defaultJavaSerializableSerializer.d(savedStateEncoder, (Serializable) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.i())) {
            IBinderSerializer iBinderSerializer = IBinderSerializer.f22905a;
            Intrinsics.g(obj, "null cannot be cast to non-null type android.os.IBinder");
            iBinderSerializer.d(savedStateEncoder, (IBinder) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.a()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.f())) {
            CharSequenceArraySerializer charSequenceArraySerializer = CharSequenceArraySerializer.f22897a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            charSequenceArraySerializer.d(savedStateEncoder, (CharSequence[]) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.b()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.h())) {
            CharSequenceListSerializer charSequenceListSerializer = CharSequenceListSerializer.f22899a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            charSequenceListSerializer.d(savedStateEncoder, (List) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.d()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.k())) {
            ParcelableArraySerializer parcelableArraySerializer = ParcelableArraySerializer.f22910a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            parcelableArraySerializer.d(savedStateEncoder, (Parcelable[]) obj);
            return true;
        } else if (Intrinsics.d(a2, SavedStateCodecUtils_androidKt.e()) || Intrinsics.d(a2, SavedStateCodecUtils_androidKt.m())) {
            ParcelableListSerializer parcelableListSerializer = ParcelableListSerializer.f22912a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            parcelableListSerializer.d(savedStateEncoder, (List) obj);
            return true;
        } else if (!Intrinsics.d(a2, SavedStateCodecUtils_androidKt.o()) && !Intrinsics.d(a2, SavedStateCodecUtils_androidKt.n()) && !Intrinsics.d(a2, SavedStateCodecUtils_androidKt.c())) {
            return false;
        } else {
            SparseParcelableArraySerializer sparseParcelableArraySerializer = SparseParcelableArraySerializer.f22928a;
            Intrinsics.g(obj, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
            sparseParcelableArraySerializer.d(savedStateEncoder, (SparseArray) obj);
            return true;
        }
    }
}
