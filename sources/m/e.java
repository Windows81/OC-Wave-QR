package m;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class e implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f34121a;

    public /* synthetic */ e(String str) {
        this.f34121a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f34121a);
    }
}
