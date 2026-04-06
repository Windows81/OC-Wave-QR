package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata
public final class FileTreeWalk implements Sequence<File> {

    /* renamed from: a  reason: collision with root package name */
    public final File f40767a;

    /* renamed from: b  reason: collision with root package name */
    public final FileWalkDirection f40768b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f40769c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f40770d;

    /* renamed from: e  reason: collision with root package name */
    public final Function2 f40771e;

    /* renamed from: f  reason: collision with root package name */
    public final int f40772f;

    @Metadata
    public static abstract class DirectoryState extends WalkState {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DirectoryState(File file) {
            super(file);
            Intrinsics.i(file, "rootDir");
        }
    }

    @Metadata
    public final class FileTreeWalkIterator extends AbstractIterator<File> {

        /* renamed from: B  reason: collision with root package name */
        public final ArrayDeque f40773B;

        @Metadata
        public final class BottomUpDirectoryState extends DirectoryState {

            /* renamed from: b  reason: collision with root package name */
            public boolean f40774b;

            /* renamed from: c  reason: collision with root package name */
            public File[] f40775c;

            /* renamed from: d  reason: collision with root package name */
            public int f40776d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f40777e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ FileTreeWalkIterator f40778f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                Intrinsics.i(file, "rootDir");
                this.f40778f = fileTreeWalkIterator;
            }

            public File b() {
                if (!this.f40777e && this.f40775c == null) {
                    Function1 d2 = FileTreeWalk.this.f40769c;
                    if (d2 != null && !((Boolean) d2.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f40775c = listFiles;
                    if (listFiles == null) {
                        Function2 e2 = FileTreeWalk.this.f40771e;
                        if (e2 != null) {
                            e2.m(a(), new AccessDeniedException(a(), (File) null, "Cannot list files in a directory", 2, (DefaultConstructorMarker) null));
                        }
                        this.f40777e = true;
                    }
                }
                File[] fileArr = this.f40775c;
                if (fileArr != null) {
                    int i2 = this.f40776d;
                    Intrinsics.f(fileArr);
                    if (i2 < fileArr.length) {
                        File[] fileArr2 = this.f40775c;
                        Intrinsics.f(fileArr2);
                        int i3 = this.f40776d;
                        this.f40776d = i3 + 1;
                        return fileArr2[i3];
                    }
                }
                if (!this.f40774b) {
                    this.f40774b = true;
                    return a();
                }
                Function1 f2 = FileTreeWalk.this.f40770d;
                if (f2 != null) {
                    f2.invoke(a());
                }
                return null;
            }
        }

        @Metadata
        public final class SingleFileState extends WalkState {

            /* renamed from: b  reason: collision with root package name */
            public boolean f40779b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ FileTreeWalkIterator f40780c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SingleFileState(FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                Intrinsics.i(file, "rootFile");
                this.f40780c = fileTreeWalkIterator;
            }

            public File b() {
                if (this.f40779b) {
                    return null;
                }
                this.f40779b = true;
                return a();
            }
        }

        @Metadata
        public final class TopDownDirectoryState extends DirectoryState {

            /* renamed from: b  reason: collision with root package name */
            public boolean f40781b;

            /* renamed from: c  reason: collision with root package name */
            public File[] f40782c;

            /* renamed from: d  reason: collision with root package name */
            public int f40783d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ FileTreeWalkIterator f40784e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                Intrinsics.i(file, "rootDir");
                this.f40784e = fileTreeWalkIterator;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
                if (r0.length == 0) goto L_0x0081;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f40781b
                    r1 = 0
                    if (r0 != 0) goto L_0x0028
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f40784e
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = r0.f40769c
                    if (r0 == 0) goto L_0x0020
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0020
                    return r1
                L_0x0020:
                    r0 = 1
                    r10.f40781b = r0
                    java.io.File r0 = r10.a()
                    return r0
                L_0x0028:
                    java.io.File[] r0 = r10.f40782c
                    if (r0 == 0) goto L_0x0047
                    int r2 = r10.f40783d
                    kotlin.jvm.internal.Intrinsics.f(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0035
                    goto L_0x0047
                L_0x0035:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f40784e
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = r0.f40770d
                    if (r0 == 0) goto L_0x0046
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x0046:
                    return r1
                L_0x0047:
                    java.io.File[] r0 = r10.f40782c
                    if (r0 != 0) goto L_0x0093
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f40782c = r0
                    if (r0 != 0) goto L_0x0077
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f40784e
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function2 r0 = r0.f40771e
                    if (r0 == 0) goto L_0x0077
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.m(r2, r9)
                L_0x0077:
                    java.io.File[] r0 = r10.f40782c
                    if (r0 == 0) goto L_0x0081
                    kotlin.jvm.internal.Intrinsics.f(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0093
                L_0x0081:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f40784e
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = r0.f40770d
                    if (r0 == 0) goto L_0x0092
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x0092:
                    return r1
                L_0x0093:
                    java.io.File[] r0 = r10.f40782c
                    kotlin.jvm.internal.Intrinsics.f(r0)
                    int r1 = r10.f40783d
                    int r2 = r1 + 1
                    r10.f40783d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState.b():java.io.File");
            }
        }

        @Metadata
        public /* synthetic */ class WhenMappings {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f40785a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    kotlin.io.FileWalkDirection[] r0 = kotlin.io.FileWalkDirection.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f40785a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.WhenMappings.<clinit>():void");
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f40773B = arrayDeque;
            if (FileTreeWalk.this.f40767a.isDirectory()) {
                arrayDeque.push(g(FileTreeWalk.this.f40767a));
            } else if (FileTreeWalk.this.f40767a.isFile()) {
                arrayDeque.push(new SingleFileState(this, FileTreeWalk.this.f40767a));
            } else {
                c();
            }
        }

        public void b() {
            File h2 = h();
            if (h2 != null) {
                e(h2);
            } else {
                c();
            }
        }

        public final DirectoryState g(File file) {
            int i2 = WhenMappings.f40785a[FileTreeWalk.this.f40768b.ordinal()];
            if (i2 == 1) {
                return new TopDownDirectoryState(this, file);
            }
            if (i2 == 2) {
                return new BottomUpDirectoryState(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File h() {
            File b2;
            while (true) {
                WalkState walkState = (WalkState) this.f40773B.peek();
                if (walkState == null) {
                    return null;
                }
                b2 = walkState.b();
                if (b2 == null) {
                    this.f40773B.pop();
                } else if (Intrinsics.d(b2, walkState.a()) || !b2.isDirectory() || this.f40773B.size() >= FileTreeWalk.this.f40772f) {
                    return b2;
                } else {
                    this.f40773B.push(g(b2));
                }
            }
            return b2;
        }
    }

    @Metadata
    public static abstract class WalkState {

        /* renamed from: a  reason: collision with root package name */
        public final File f40786a;

        public WalkState(File file) {
            Intrinsics.i(file, "root");
            this.f40786a = file;
        }

        public final File a() {
            return this.f40786a;
        }

        public abstract File b();
    }

    public Iterator iterator() {
        return new FileTreeWalkIterator();
    }
}
