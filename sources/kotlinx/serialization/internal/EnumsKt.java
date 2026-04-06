package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata
public final class EnumsKt {
    public static final KSerializer a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(enumArr, "values");
        Intrinsics.i(strArr, "names");
        Intrinsics.i(annotationArr, "entryAnnotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, enumArr.length);
        if (annotationArr2 != null) {
            for (Annotation y2 : annotationArr2) {
                enumDescriptor.y(y2);
            }
        }
        int length = enumArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Enum enumR = enumArr[i2];
            int i4 = i3 + 1;
            String str2 = (String) ArraysKt.o0(strArr, i3);
            if (str2 == null) {
                str2 = enumR.name();
            }
            PluginGeneratedSerialDescriptor.r(enumDescriptor, str2, false, 2, (Object) null);
            Annotation[] annotationArr3 = (Annotation[]) ArraysKt.o0(annotationArr, i3);
            if (annotationArr3 != null) {
                for (Annotation x2 : annotationArr3) {
                    enumDescriptor.x(x2);
                }
            }
            i2++;
            i3 = i4;
        }
        return new EnumSerializer(str, enumArr, enumDescriptor);
    }

    public static final KSerializer b(String str, Enum[] enumArr) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(enumArr, "values");
        return new EnumSerializer(str, enumArr);
    }
}
