package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class PathNodeKt {
    public static final void a(char c2, ArrayList arrayList, float[] fArr, int i2) {
        int i3 = 0;
        switch (c2) {
            case 'A':
                int i4 = i2 - 7;
                for (int i5 = 0; i5 <= i4; i5 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], Float.compare(fArr[i5 + 3], 0.0f) != 0, Float.compare(fArr[i5 + 4], 0.0f) != 0, fArr[i5 + 5], fArr[i5 + 6]));
                }
                return;
            case 'C':
                int i6 = i2 - 6;
                while (i3 <= i6) {
                    arrayList.add(new PathNode.CurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            case 'H':
                int i7 = i2 - 1;
                while (i3 <= i7) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'L':
                int i8 = i2 - 2;
                while (i3 <= i8) {
                    arrayList.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'M':
                b(arrayList, fArr, i2);
                return;
            case 'Q':
                int i9 = i2 - 4;
                while (i3 <= i9) {
                    arrayList.add(new PathNode.QuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 'S':
                int i10 = i2 - 4;
                while (i3 <= i10) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 'T':
                int i11 = i2 - 2;
                while (i3 <= i11) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'V':
                int i12 = i2 - 1;
                while (i3 <= i12) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'Z':
            case ModuleDescriptor.MODULE_VERSION /*122*/:
                arrayList.add(PathNode.Close.f16554c);
                return;
            case 'a':
                int i13 = i2 - 7;
                for (int i14 = 0; i14 <= i13; i14 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], Float.compare(fArr[i14 + 3], 0.0f) != 0, Float.compare(fArr[i14 + 4], 0.0f) != 0, fArr[i14 + 5], fArr[i14 + 6]));
                }
                return;
            case 'c':
                int i15 = i2 - 6;
                while (i3 <= i15) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            case 'h':
                int i16 = i2 - 1;
                while (i3 <= i16) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'l':
                int i17 = i2 - 2;
                while (i3 <= i17) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'm':
                c(arrayList, fArr, i2);
                return;
            case 'q':
                int i18 = i2 - 4;
                while (i3 <= i18) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 's':
                int i19 = i2 - 4;
                while (i3 <= i19) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 't':
                int i20 = i2 - 2;
                while (i3 <= i20) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'v':
                int i21 = i2 - 1;
                while (i3 <= i21) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c2);
        }
    }

    public static final void b(List list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.LineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }

    public static final void c(List list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }
}
