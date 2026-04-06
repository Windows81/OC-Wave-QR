package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavArgumentKt {
    public static final List a(Map map, Function1 function1) {
        Intrinsics.i(map, "<this>");
        Intrinsics.i(function1, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            NavArgument navArgument = (NavArgument) entry.getValue();
            Boolean valueOf = navArgument != null ? Boolean.valueOf(navArgument.d()) : null;
            Intrinsics.f(valueOf);
            if (!valueOf.booleanValue() && !navArgument.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : linkedHashMap.keySet()) {
            if (((Boolean) function1.invoke((String) next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
