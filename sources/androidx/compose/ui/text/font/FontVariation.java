package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FontVariation {

    /* renamed from: a  reason: collision with root package name */
    public static final FontVariation f18734a = new FontVariation();

    @Metadata
    public interface Setting {
        boolean a();

        float b(Density density);

        String c();
    }

    @Metadata
    public static final class SettingFloat implements Setting {

        /* renamed from: a  reason: collision with root package name */
        public final String f18735a;

        /* renamed from: b  reason: collision with root package name */
        public final float f18736b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18737c;

        public boolean a() {
            return this.f18737c;
        }

        public float b(Density density) {
            return this.f18736b;
        }

        public String c() {
            return this.f18735a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return Intrinsics.d(c(), settingFloat.c()) && this.f18736b == settingFloat.f18736b;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + Float.hashCode(this.f18736b);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f18736b + ')';
        }
    }

    @Metadata
    public static final class SettingInt implements Setting {

        /* renamed from: a  reason: collision with root package name */
        public final String f18738a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18739b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18740c;

        public boolean a() {
            return this.f18740c;
        }

        public float b(Density density) {
            return (float) this.f18739b;
        }

        public String c() {
            return this.f18738a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return Intrinsics.d(c(), settingInt.c()) && this.f18739b == settingInt.f18739b;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + this.f18739b;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f18739b + ')';
        }
    }

    @Metadata
    public static final class SettingTextUnit implements Setting {

        /* renamed from: a  reason: collision with root package name */
        public final String f18741a;

        /* renamed from: b  reason: collision with root package name */
        public final long f18742b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18743c;

        public boolean a() {
            return this.f18743c;
        }

        public float b(Density density) {
            if (density != null) {
                return TextUnit.h(this.f18742b) * density.u1();
            }
            InlineClassHelperKt.b("density must not be null");
            throw new KotlinNothingValueException();
        }

        public String c() {
            return this.f18741a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return Intrinsics.d(c(), settingTextUnit.c()) && TextUnit.e(this.f18742b, settingTextUnit.f18742b);
        }

        public int hashCode() {
            return (c().hashCode() * 31) + TextUnit.i(this.f18742b);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + TextUnit.l(this.f18742b) + ')';
        }
    }

    @Metadata
    public static final class Settings {

        /* renamed from: a  reason: collision with root package name */
        public final List f18744a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18745b;

        public Settings(Setting... settingArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z2 = false;
            for (Setting setting : settingArr) {
                String c2 = setting.c();
                Object obj = linkedHashMap.get(c2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c2, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    CollectionsKt.B(arrayList, list);
                } else {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + CollectionsKt.n0(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ']').toString());
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f18744a = arrayList2;
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (((Setting) arrayList2.get(i2)).a()) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f18745b = z2;
        }

        public final boolean a() {
            return this.f18745b;
        }

        public final List b() {
            return this.f18744a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && Intrinsics.d(this.f18744a, ((Settings) obj).f18744a);
        }

        public int hashCode() {
            return this.f18744a.hashCode();
        }
    }
}
