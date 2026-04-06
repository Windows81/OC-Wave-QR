package androidx.datastore.core;

import androidx.datastore.core.FileStorage;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FileStorage$createConnection$2 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ File f20585z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileStorage$createConnection$2(File file) {
        super(0);
        this.f20585z = file;
    }

    public final void invoke() {
        FileStorage.Companion companion = FileStorage.f20578d;
        Object b2 = companion.b();
        File file = this.f20585z;
        synchronized (b2) {
            companion.a().remove(file.getAbsolutePath());
            Unit unit = Unit.f40552a;
        }
    }
}
