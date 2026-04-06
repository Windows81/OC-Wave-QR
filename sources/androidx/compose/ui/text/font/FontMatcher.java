package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FontMatcher {
    public final List a(List list, FontWeight fontWeight, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        Collection collection = list;
        int size = collection.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            Font font = (Font) obj;
            if (Intrinsics.d(font.a(), fontWeight) && FontStyle.f(font.c(), i2)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = collection.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object obj2 = list.get(i5);
            if (FontStyle.f(((Font) obj2).c(), i2)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List list2 = list;
        FontWeight.Companion companion = FontWeight.f18746A;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.j()) < 0) {
            Collection collection2 = list2;
            int size3 = collection2.size();
            FontWeight fontWeight3 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    break;
                }
                FontWeight a2 = ((Font) list2.get(i6)).a();
                if (a2.compareTo(fontWeight) >= 0) {
                    if (a2.compareTo(fontWeight) <= 0) {
                        fontWeight2 = a2;
                        fontWeight3 = fontWeight2;
                        break;
                    } else if (fontWeight3 == null || a2.compareTo(fontWeight3) < 0) {
                        fontWeight3 = a2;
                    }
                } else if (fontWeight2 == null || a2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = a2;
                }
                i6++;
            }
            if (fontWeight2 == null) {
                fontWeight2 = fontWeight3;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = collection2.size();
            while (i3 < size4) {
                Object obj3 = list2.get(i3);
                if (Intrinsics.d(((Font) obj3).a(), fontWeight2)) {
                    arrayList3.add(obj3);
                }
                i3++;
            }
            return arrayList3;
        } else if (fontWeight.compareTo(companion.k()) > 0) {
            Collection collection3 = list2;
            int size5 = collection3.size();
            FontWeight fontWeight4 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size5) {
                    break;
                }
                FontWeight a3 = ((Font) list2.get(i7)).a();
                if (a3.compareTo(fontWeight) >= 0) {
                    if (a3.compareTo(fontWeight) <= 0) {
                        fontWeight2 = a3;
                        fontWeight4 = fontWeight2;
                        break;
                    } else if (fontWeight4 == null || a3.compareTo(fontWeight4) < 0) {
                        fontWeight4 = a3;
                    }
                } else if (fontWeight2 == null || a3.compareTo(fontWeight2) > 0) {
                    fontWeight2 = a3;
                }
                i7++;
            }
            if (fontWeight4 != null) {
                fontWeight2 = fontWeight4;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = collection3.size();
            while (i3 < size6) {
                Object obj4 = list2.get(i3);
                if (Intrinsics.d(((Font) obj4).a(), fontWeight2)) {
                    arrayList4.add(obj4);
                }
                i3++;
            }
            return arrayList4;
        } else {
            FontWeight k2 = companion.k();
            Collection collection4 = list2;
            int size7 = collection4.size();
            FontWeight fontWeight5 = null;
            FontWeight fontWeight6 = null;
            int i8 = 0;
            while (true) {
                if (i8 >= size7) {
                    break;
                }
                FontWeight a4 = ((Font) list2.get(i8)).a();
                if (k2 == null || a4.compareTo(k2) <= 0) {
                    if (a4.compareTo(fontWeight) >= 0) {
                        if (a4.compareTo(fontWeight) <= 0) {
                            fontWeight5 = a4;
                            fontWeight6 = fontWeight5;
                            break;
                        } else if (fontWeight6 == null || a4.compareTo(fontWeight6) < 0) {
                            fontWeight6 = a4;
                        }
                    } else if (fontWeight5 == null || a4.compareTo(fontWeight5) > 0) {
                        fontWeight5 = a4;
                    }
                }
                i8++;
            }
            if (fontWeight6 != null) {
                fontWeight5 = fontWeight6;
            }
            ArrayList arrayList5 = new ArrayList(list2.size());
            int size8 = collection4.size();
            for (int i9 = 0; i9 < size8; i9++) {
                Object obj5 = list2.get(i9);
                if (Intrinsics.d(((Font) obj5).a(), fontWeight5)) {
                    arrayList5.add(obj5);
                }
            }
            if (!arrayList5.isEmpty()) {
                return arrayList5;
            }
            FontWeight k3 = FontWeight.f18746A.k();
            int size9 = collection4.size();
            FontWeight fontWeight7 = null;
            int i10 = 0;
            while (true) {
                if (i10 >= size9) {
                    break;
                }
                FontWeight a5 = ((Font) list2.get(i10)).a();
                if (k3 == null || a5.compareTo(k3) >= 0) {
                    if (a5.compareTo(fontWeight) >= 0) {
                        if (a5.compareTo(fontWeight) <= 0) {
                            fontWeight2 = a5;
                            fontWeight7 = fontWeight2;
                            break;
                        } else if (fontWeight7 == null || a5.compareTo(fontWeight7) < 0) {
                            fontWeight7 = a5;
                        }
                    } else if (fontWeight2 == null || a5.compareTo(fontWeight2) > 0) {
                        fontWeight2 = a5;
                    }
                }
                i10++;
            }
            if (fontWeight7 != null) {
                fontWeight2 = fontWeight7;
            }
            ArrayList arrayList6 = new ArrayList(list2.size());
            int size10 = collection4.size();
            while (i3 < size10) {
                Object obj6 = list2.get(i3);
                if (Intrinsics.d(((Font) obj6).a(), fontWeight2)) {
                    arrayList6.add(obj6);
                }
                i3++;
            }
            return arrayList6;
        }
    }
}
