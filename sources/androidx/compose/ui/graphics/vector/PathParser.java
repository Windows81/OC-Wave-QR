package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PathParser {

    /* renamed from: a  reason: collision with root package name */
    public float[] f16606a = new float[64];

    public static /* synthetic */ ArrayList b(PathParser pathParser, String str, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.a(str, arrayList);
    }

    public final ArrayList a(String str, ArrayList arrayList) {
        int i2;
        char charAt;
        int i3;
        int length = str.length();
        int i4 = 0;
        while (i4 < length && Intrinsics.k(str.charAt(i4), 32) <= 0) {
            i4++;
        }
        while (length > i4 && Intrinsics.k(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i5 = 0;
        while (i4 < length) {
            while (true) {
                i2 = i4 + 1;
                charAt = str.charAt(i4);
                char c2 = charAt | ' ';
                if ((c2 - 'a') * (c2 - 'z') <= 0 && c2 != 'e') {
                    break;
                } else if (i2 >= length) {
                    charAt = 0;
                    break;
                } else {
                    i4 = i2;
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 'z') {
                    i5 = 0;
                    while (true) {
                        if (i2 >= length || Intrinsics.k(str.charAt(i2), 32) > 0) {
                            long a2 = FastFloatParserKt.a(str, i2, length);
                            i3 = (int) (a2 >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (a2 & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.f16606a;
                                int i6 = i5 + 1;
                                fArr[i5] = intBitsToFloat;
                                if (i6 >= fArr.length) {
                                    float[] fArr2 = new float[(i6 * 2)];
                                    this.f16606a = fArr2;
                                    ArraysKt.i(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i5 = i6;
                            }
                            while (i3 < length && str.charAt(i3) == ',') {
                                i3++;
                            }
                            if (i3 >= length || Float.isNaN(intBitsToFloat)) {
                                i2 = i3;
                            } else {
                                i2 = i3;
                            }
                        } else {
                            i2++;
                        }
                    }
                    i2 = i3;
                }
                PathNodeKt.a(charAt, arrayList, this.f16606a, i5);
            }
            i4 = i2;
        }
        return arrayList;
    }
}
